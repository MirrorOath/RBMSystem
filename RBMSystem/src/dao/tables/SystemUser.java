package dao.tables;

import java.util.Date;

public class SystemUser {
    private Integer id;
    private String name;
    private String password;
    private Integer aut;
    private Date loginTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAut() {
        return aut;
    }

    public void setAut(Integer aut) {
        this.aut = aut;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    @Override
    public String toString() {
        return "SystemUser [id=" + id + ", name=" + name + ", password=" + password + ", AUT=" + aut + ", loginTime="
                + loginTime + "]";
    }

}
