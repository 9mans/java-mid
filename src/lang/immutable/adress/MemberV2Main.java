package lang.immutable.adress;

public class MemberV2Main {

    public static void main(String[] args) {

        ImmutableAdress address = new ImmutableAdress("서울");

        MemberV2 memberA = new MemberV2("회원a", address);
        MemberV2 memberB = new MemberV2("회원b", address);

        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);

        // 회원 b의 주소를 부산으로 변경
        ImmutableAdress address1 = memberB.getAddress();
//      address1.setValue("부산");
//      memberB.getAdress().setValue("부산");

        memberB.setAddress(new ImmutableAdress("부산"));

        System.out.println("부산 > memberB.address");

        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);





    }
}
