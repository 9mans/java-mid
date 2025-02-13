package lang.immutable.adress;

public class MemberV1Main {

    public static void main(String[] args) {

        Address address = new Address("서울");

        MemberV1 memberA = new MemberV1("회원a", address);
        MemberV1 memberB = new MemberV1("회원b", address);

        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);

        // 회원 b의 주소를 부산으로 변경
        Address address1 = memberB.getAdress();
        address1.setValue("부산");

        memberB.getAdress().setValue("부산");

        System.out.println("부산 > memberB.address");

        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);





    }
}
