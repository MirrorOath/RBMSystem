package dao.tables;

public class SeatRotation {
    private Integer id;
    private Integer streamId;
    private Integer tableId;
    private Integer peopleCount;

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

    public Integer getTableId() {
        return tableId;
    }

    public void setTableId(Integer tableId) {
        this.tableId = tableId;
    }

    public Integer getPeopleCount() {
        return peopleCount;
    }

    public void setPeopleCount(Integer peopleCount) {
        this.peopleCount = peopleCount;
    }

    @Override
    public String toString() {
        return "SeatRotation [id=" + id + ", streamId=" + streamId + ", tableId=" + tableId + ", peopleCount="
                + peopleCount + "]";
    }

}
