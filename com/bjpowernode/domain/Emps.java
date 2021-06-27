package com.bjpowernode.domain;

public class Emps {
    private int userId;
    private String EMPNO;
    private String ENAME;
    private String JOB;
    private String MGR;
    private String SAL;
    private String DEPTNO;

    @Override
    public String toString() {
        return "Emps{" +
                "userId='" + userId + '\'' +
                ", EMPNO='" + EMPNO + '\'' +
                ", ENAME='" + ENAME + '\'' +
                ", JOB='" + JOB + '\'' +
                ", MGR='" + MGR + '\'' +
                ", SAL='" + SAL + '\'' +
                ", DEPTNO='" + DEPTNO + '\'' +
                '}';
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getEMPNO() {
        return EMPNO;
    }

    public void setEMPNO(String EMPNO) {
        this.EMPNO = EMPNO;
    }

    public String getENAME() {
        return ENAME;
    }

    public void setENAME(String ENAME) {
        this.ENAME = ENAME;
    }

    public String getJOB() {
        return JOB;
    }

    public void setJOB(String JOB) {
        this.JOB = JOB;
    }

    public String getMGR() {
        return MGR;
    }

    public void setMGR(String MGR) {
        this.MGR = MGR;
    }

    public String getSAL() {
        return SAL;
    }

    public void setSAL(String SAL) {
        this.SAL = SAL;
    }

    public String getDEPTNO() {
        return DEPTNO;
    }

    public void setDEPTNO(String DEPTNO) {
        this.DEPTNO = DEPTNO;
    }
}
