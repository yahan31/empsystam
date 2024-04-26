package com.example.demo.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.domain.Emp2;
import com.example.demo.domain.Emp2DTO;

public interface Emp2Repository extends JpaRepository<Emp2, Integer> {
        @Query("SELECT new com.example.demo.domain.Emp2DTO("+"e.empno,"+ "e.ename,"+ "e.job,"+ "e.hiredate,"+ "e.sal,"+ "e.comm,"+ "d.dname)"+" FROM Emp2 e "+"JOIN Dept2 d ON e.deptno = d.deptno")
        List<Emp2DTO> findAllEmp();

            @Query("SELECT new com.example.demo.domain.Emp2DTO(" +
            "e.empno, " +
            "e.ename, " +
            "e.job, " +
            "e.hiredate, " +
            "e.sal, " +
            "e.comm, " +
            "d.dname) " +
            "FROM Emp2 e " +
            "JOIN Dept2 d ON e.deptno = d.deptno " +
            "WHERE e.ename = :ename OR e.ename LIKE %:ename%")
            List<Emp2DTO> findAllEmpByName(@Param("ename") String ename);

            @Query("SELECT new com.example.demo.domain.Emp2DTO(" +
            "e.empno, " +
            "e.ename, " +
            "e.job, " +
            "e.hiredate, " +
            "e.sal, " +
            "e.comm, " +
            "d.dname) " +
            "FROM Emp2 e " +
            "JOIN Dept2 d ON e.deptno = d.deptno " +
            "WHERE e.ename = :ename OR e.ename LIKE %:ename% " +
            "AND e.sal > :sal")
        List<Emp2DTO> findAllEmpByNameAndSalGreaterThan(@Param("ename") String ename, @Param("sal") BigDecimal sal);

            @Query("SELECT new com.example.demo.domain.Emp2DTO(" +
            "e.empno, " +
            "e.ename, " +
            "e.job, " +
            "e.hiredate, " +
            "e.sal, " +
            "e.comm, " +
            "d.dname) " +
            "FROM Emp2 e " +
            "JOIN Dept2 d ON e.deptno = d.deptno " +
            "WHERE e.sal > :sal")
            List<Emp2DTO> findAllEmpBySalGreaterThan(@Param("sal") BigDecimal sal);


        List<Emp2> findBySalGreaterThan(BigDecimal sal);
  
    

}
