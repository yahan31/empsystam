package com.example.demo.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

// @Data
@Entity
@Table(name = "dept2")
public class Dept2 {

    @Id
    @Column(name = "DEPTNO")
    private Integer deptno;

    @Column(name = "DNAME", columnDefinition = "varchar")
    private String dname;

    @Column(name = "LOC", columnDefinition = "varchar")
    private String loc;

    @OneToMany(mappedBy = "deptno")
    private List<Emp2> eList;

    @Override
    public String toString() {
        return "Dept2 [deptno=" + deptno + ", dname=" + dname + ", loc=" + loc + ", eList=" + eList + "]";
    }

    public Integer getDeptno() {
        return deptno;
    }

    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public List<Emp2> geteList() {
        return eList;
    }

    public void seteList(List<Emp2> eList) {
        this.eList = eList;
    }

}
