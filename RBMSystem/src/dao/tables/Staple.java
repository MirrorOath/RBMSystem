package dao.tables;

public class Staple {
    private Integer id;
    private Integer dishId;
    private String rawMName;
    private String rawMType;
    private String rawMBrand;
    private String rawMOrigin;
    private String specs;
    private Integer last;
    private String buyUnit;
    private String depleteUnit;
    private Double price;
    private Integer providerId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDishId() {
        return dishId;
    }

    public void setDishId(Integer dishId) {
        this.dishId = dishId;
    }

    public String getRawMName() {
        return rawMName;
    }

    public void setRawMName(String rawMName) {
        this.rawMName = rawMName;
    }

    public String getRawMType() {
        return rawMType;
    }

    public void setRawMType(String rawMType) {
        this.rawMType = rawMType;
    }

    public String getRawMBrand() {
        return rawMBrand;
    }

    public void setRawMBrand(String rawMBrand) {
        this.rawMBrand = rawMBrand;
    }

    public String getRawMOrigin() {
        return rawMOrigin;
    }

    public void setRawMOrigin(String rawMOrigin) {
        this.rawMOrigin = rawMOrigin;
    }

    public String getSpecs() {
        return specs;
    }

    public void setSpecs(String specs) {
        this.specs = specs;
    }

    public Integer getLast() {
        return last;
    }

    public void setLast(Integer last) {
        this.last = last;
    }

    public String getBuyUnit() {
        return buyUnit;
    }

    public void setBuyUnit(String buyUnit) {
        this.buyUnit = buyUnit;
    }

    public String getDepleteUnit() {
        return depleteUnit;
    }

    public void setDepleteUnit(String depleteUnit) {
        this.depleteUnit = depleteUnit;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getProviderId() {
        return providerId;
    }

    public void setProviderId(Integer providerId) {
        this.providerId = providerId;
    }

    @Override
    public String toString() {
        return "Staple [id=" + id + ", dishId=" + dishId + ", rawMName=" + rawMName + ", rawMType=" + rawMType
                + ", rawMBrand=" + rawMBrand + ", rawMOrigin=" + rawMOrigin + ", specs=" + specs + ", last=" + last
                + ", buyUnit=" + buyUnit + ", depleteUnit=" + depleteUnit + ", price=" + price + ", providerId="
                + providerId + "]";
    }

}
