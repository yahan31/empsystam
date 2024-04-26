package com.example.demo.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.Data;
@Data
public class Emp2DTO {

    private Integer empno;

    private String ename;

    private String job;

    private LocalDate hiredate;

    private BigDecimal sal;

    private BigDecimal comm;
    
    private String dname;

    public Emp2DTO(Integer empno, String ename, String job, LocalDate hiredate, BigDecimal sal, BigDecimal comm, String dname) {
        this.empno = empno;
        this.ename = ename;
        this.job = job;
        this.hiredate = hiredate;
        this.sal = sal;
        this.comm = comm;
        this.dname = dname;
    }


    // public Integer getEmpno() {
    //     return empno;
    // }


    // public void setEmpno(Integer empno) {
    //     this.empno = empno;
    // }


    // public String getEname() {
    //     return ename;
    // }


    // public void setEname(String ename) {
    //     this.ename = ename;
    // }


    // public String getJob() {
    //     return job;
    // }


    // public void setJob(String job) {
    //     this.job = job;
    // }


    // public LocalDate getHiredate() {
    //     return hiredate;
    // }


    // public void setHiredate(LocalDate hiredate) {
    //     this.hiredate = hiredate;
    // }


    // public BigDecimal getSal() {
    //     return sal;
    // }


    // public void setSal(BigDecimal sal) {
    //     this.sal = sal;
    // }


    // public BigDecimal getComm() {
    //     return comm;
    // }


    // public void setComm(BigDecimal comm) {
    //     this.comm = comm;
    // }


    // public String getDname() {
    //     return dname;
    // }


    // public void setDname(String dname) {
    //     this.dname = dname;
    // }


    // @Override
    // public String toString() {
    //     return "Emp2DTO [empno=" + empno + ", ename=" + ename + ", job=" + job + ", hiredate=" + hiredate + ", sal="
    //             + sal + ", comm=" + comm + ", dname=" + dname + "]";
    // }



    
    
}
