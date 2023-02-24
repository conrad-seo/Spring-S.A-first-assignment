package special;

public class PolyBus {

    public static void main(String[] args) {
        System.out.println("버스 생산 시작");
        publictransport bus1 = new publictransport();
        publictransport bus2 = new publictransport();
        System.out.println("버스1 객체 만들어짐");
        System.out.println("버스2 객체 만들어짐");

        bus1.uppeople(2);

        bus1.oilup(-50);
        bus1.situation("차고지행");
        bus1.oilup(10);

        bus1.uppeople(45);

        bus1.uppeople(5);

        bus1.oilup(-55);
        bus1.situation("운행");

    }
}




