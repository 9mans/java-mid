package lang.immutable.adress;

public class MemberV2 {

    private String name;
    private ImmutableAdress address;

    public MemberV2(String name, ImmutableAdress address) {
        this.name = name;
        this.address = address;
    }

    public ImmutableAdress getAddress() {
        return address;
    }

    public void setAddress(ImmutableAdress address) {
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
