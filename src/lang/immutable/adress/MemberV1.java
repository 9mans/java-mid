package lang.immutable.adress;

public class MemberV1 {

    private String name;
    private Address address;

    public MemberV1(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Address getAdress() {
        return address;
    }

    public void setAdress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "MemberV1{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
