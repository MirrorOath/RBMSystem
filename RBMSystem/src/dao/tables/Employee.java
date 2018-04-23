package dao.tables;

public class Employee {
    private Integer id;
    private String name;
    private String dutyType;
    private String isWork;

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

    public String getDutyType() {
        return dutyType;
    }

    public void setDutyType(String dutyType) {
        this.dutyType = dutyType;
    }

    public String getIsWork() {
        return isWork;
    }

    public void setIsWork(String isWork) {
        this.isWork = isWork;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", dutyType=" + dutyType + ", isWork=" + isWork + "]";
    }

}
