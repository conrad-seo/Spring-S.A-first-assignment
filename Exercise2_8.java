public class Exercise2_8 {
    public static void main(String[] args){
        int x = 1;
        int y = 2;
        int z = 3;

        int j = x;
        x = y;
        y = z;
        z = j;


        System.out.println("x="+x);
        System.out.println("y="+y);
        System.out.println("z="+z);
    }
}
