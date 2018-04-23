package dao.tables;

import java.util.Date;

public class DepleteEvent {
    private Integer id;
    private Date date;
    private Integer stapleId;
    private Integer count;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getStapleId() {
        return stapleId;
    }

    public void setStapleId(Integer stapleId) {
        this.stapleId = stapleId;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "DepleteEvent [id=" + id + ", date=" + date + ", stapleId=" + stapleId + ", count=" + count + "]";
    }

}
