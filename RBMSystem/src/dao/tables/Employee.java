package dao.tables;

public class Employee {
    private Integer id;
    private Integer numbering;
    private String name;
    private String responsibility;
    private Integer isWork;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumbering() {
        return numbering;
    }

    public void setNumbering(Integer numbering) {
        this.numbering = numbering;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResponsibility() {
        return responsibility;
    }

    public void setResponsibility(String responsibility) {
        this.responsibility = responsibility;
    }

    public Integer getIsWork() {
        return isWork;
    }

    public void setIsWork(Integer isWork) {
        this.isWork = isWork;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", numbering=" + numbering + ", name=" + name + ", responsibility="
                + responsibility + ", isWork=" + isWork + "]";
    }

}
