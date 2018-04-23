package dao.tables;

import java.util.Date;

public class TableBegin {
    private Integer id;
    private Integer streamId;
    private Integer waiterId;
    private Date date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStreamId() {
        return streamId;
    }

    public void setStreamId(Integer streamId) {
        this.streamId = streamId;
    }

    public Integer getWaiterId() {
        return waiterId;
    }

    public void setWaiterId(Integer waiterId) {
        this.waiterId = waiterId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "TableBegin [id=" + id + ", streamId=" + streamId + ", waiterId=" + waiterId + ", date=" + date + "]";
    }

}
