package dao.tables;

import java.util.Date;

public class ConsumptionEvents {
    private Integer id;
    private Integer numbering;
    private Date date;
    private Integer rawMaterialId;
    private Integer count;

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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getRawMaterialId() {
        return rawMaterialId;
    }

    public void setRawMaterialId(Integer rawMaterialId) {
        this.rawMaterialId = rawMaterialId;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "ConsumptionEvents [id=" + id + ", numbering=" + numbering + ", date=" + date + ", rawMaterialId="
                + rawMaterialId + ", count=" + count + "]";
    }

}
