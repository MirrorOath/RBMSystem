package dao.tables;

public class MProvider {
    private Integer id;
    private String name;
    private String mName;
    private String address;
    private String phone;
    private String fax;
    private String cMan;
    private String cManMobile;
    private Integer contractId;

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

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getcMan() {
        return cMan;
    }

    public void setcMan(String cMan) {
        this.cMan = cMan;
    }

    public String getcManMobile() {
        return cManMobile;
    }

    public void setcManMobile(String cManMobile) {
        this.cManMobile = cManMobile;
    }

    public Integer getContractId() {
        return contractId;
    }

    public void setContractId(Integer contractId) {
        this.contractId = contractId;
    }

    @Override
    public String toString() {
        return "Supplier [id=" + id + ", name=" + name + ", mName=" + mName + ", address=" + address + ", phone="
                + phone + ", fax=" + fax + ", cMan=" + cMan + ", cManMobile=" + cManMobile + ", contractId="
                + contractId + "]";
    }

}
