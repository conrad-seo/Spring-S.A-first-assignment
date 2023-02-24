package special;

import java.util.Scanner;

class publictransport implements BusFunction{
    protected int maxpeople;  //최대 승객수    30명으로 초기화
    protected int nowpeople;  //현재 승객수            버스랑 택시에는 있는 클래스 변수면 여기서는 안적어도 되는건가?
    int money;      //요금        천원으로 초기화
    int number;  //버스 번호             생성자
    int oil;        //기름 총량     1만으로 초기화
    int nowspeed;   //현재속도      0으로 초기화
    String race;    //운행, 차고행 선택    boolean을 사용하면 안되나? 선택지가 두개밖에 없으니깐 저 타입사용하면 좋을거 같은데...스트링보다는
    public publictransport(){
        this.maxpeople = 30;
        this.oil = 100;
        int number = hashCode();
        this.nowspeed = 0;
        this.race = "운행";
        this.money = 1000;
    }


    @Override       //승객탑승
    public void uppeople(int count){
        if(maxpeople>count+nowpeople&&count>0){
            nowpeople += count;
            System.out.println("탑승 승객 수 = " + count);
            System.out.println("잔여 승객 수 = " + (maxpeople - nowpeople));
            System.out.println("요금 확인 = " + (money*count));
        } else {
            System.out.println("최대 승객 수 초과");
        }
    }
    @Override       //상태
    public void situation(String status){
        System.out.println(status);
    }
    @Override
    public void oilup(int gas){
        oil += gas;
        System.out.println("주유량 = " + oil);
        if (oil < 10) {
            System.out.println("주유가 필요합니다.");
        }
    }

}

