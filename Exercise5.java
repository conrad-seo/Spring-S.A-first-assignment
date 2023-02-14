public class Exercise5 {
    //5-1. 다음은 배열을 선언하거나 초기화한 것이다. 잘못된 것을 고르고 그 이유를 설명하세요.
//    int[] arr[];
//    int[] arr = {1,2,3,};
//    int[] arr = new int[5];
//    int[] arr = new int[5]{1,2,3,4,5};          //괄호{} 안의 데이터 개수에 따라 배열의 크기가 자동적으로 결정되기 때문이다.
//    int arr[5];                                 //배열을 선언할 때 배열의 크기를 지정 할 수 없다.
//    int[] arr[] = new int[3][];
    //답 d,e

    //5-2. 다음과 같은 배열이 있을 때, arr[3].length의 값은?
    int[][]arr ={
            {5,5,5,5,5},
            {10,10,10},
            {20,20,20,20},
            {30,30}
    };

    //답 = 2

    //5-3. 배열 arr에 담긴 모든 값을 더하는 프로그램을 완성하세요.
    class Exercise5_3{
        public static void main(String[] args){
            int[] arr = {10, 20, 30, 40, 50};
            int sum = 0;
            for(int i = 0; i < arr.length; i++){
                sum += arr[i];
            }
            System.out.println("sum="+sum);
        }
    }//예상 결과 : sum=150

    //5-4. 2차원 배열 arr에 담긴 모든 총합과 평균을 구하는 프로그램을 완성하세요.
    class Exercise5_4 {
        public static void main(String[] args) {
            int[][] arr = {
                    { 5, 5, 5, 5, 5 },
                    { 10, 10, 10, 10, 10 },
                    { 20, 20, 20, 20, 20 },
                    { 30, 30, 30, 30, 30 }
            };

            int total = 0;
            float average = 0;

            for(int i = 0; i<arr.length; i++){
                for (int j = 0; j < arr[i].length; j++) {
                    total += arr[i][j];
                }
            }
            average = total/(arr.length*arr[0].length);

            System.out.println("total=" + total);
            System.out.println("average=" + average);
        } // end of main
    } // end of class

    //5-5. 다음은 1과 9 사이의 중복되지 않은 숫자로 이루어진 3자리 숫자를 만들어내는 프로그램이다.
    //코드를 완성하세요. 다만 Math.random()을 사용했기 때문에 실행 결과 예시와 다를 수 있습니다.
//    class Exercise5_5{
//        public static void main(String[] args) {
//            int[] ballArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
//            int[] ball3 = new int[3];
//
//            // 배열 ballArr의 임의의 요소를 골라서 위치를 바꾼다
//            for (int j = 0; j < ball3.length; j++) {
//            for (int i = 0; i < ballArr.length; i++) {
//                int j = (int) (Math.random() * ballArr.length);
//                int tmp = 0;
//                ball3[i]=j;
//            }
//            }
    //5-5. 다음은 1과 9 사이의 중복되지 않은 숫자로 이루어진 3자리 숫자를 만들어내는 프로그램이다.
//코드를 완성하세요. 다만 Math.random()을 사용했기 때문에 실행 결과 예시와 다를 수 있습니다.
        class Exercise5_5{
        public static void main(String[] args) {
            int[] ballArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
            int[] ball3 = new int[3];

            // 배열 ballArr의 임의의 요소를 골라서 위치를 바꾼다
            for (int i = 0; i < ballArr.length; i++) {
                int j = (int) (Math.random() * ballArr.length);
                int tmp = 0;
                tmp = ballArr[i];
                ballArr[i] = ballArr[j];
                ballArr[j] = tmp;
            }

            // 배열 ballArr의 앞에서 3개의 수를 배열 ball3로 복사한다

            for(int i = 0; i < 3; i++){
                ball3[i] = ballArr[i];
            }

            for (int i = 0; i < ball3.length; i++) {
                System.out.print(ball3[i]);
            }
        }//end of main
    }//end of class


            // 배열 ballArr의 앞에서 3개의 수를 배열 ball3로 복사한다

            /*빈 칸*/

            for (int i = 0; i < ball3.length; i++) {
                System.out.print(ball3[i]);
            }
        }//end of main
    }//end of class

}
