package dao.tables;

public class Item {
    private Integer id;
    private Integer itemId;
    private String name;
    private Integer count;
    private Integer outboundCount;
    private Integer lost;
    private Double price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getOutboundCount() {
        return outboundCount;
    }

    public void setOutboundCount(Integer outboundCount) {
        this.outboundCount = outboundCount;
    }

    public Integer getLost() {
        return lost;
    }

    public void setLost(Integer lost) {
        this.lost = lost;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item [id=" + id + ", itemId=" + itemId + ", name=" + name + ", count=" + count + ", outboundCount="
                + outboundCount + ", lost=" + lost + ", price=" + price + "]";
    }

}
