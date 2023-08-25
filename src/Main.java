// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        zd1();
        zd2();
        zd3();
        zd4();
    }
    public static  int[] generateRandomArray(){
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0 ;i < arr.length;i++){
            arr[i] = random.nextInt(100000)+100000;
        }
        return arr;
    }
    public static void zd1(){
        int[]arr = generateRandomArray();
        int sum = 0;
        for (int i : arr){
            sum += i;
        }
        System.out.println("Сумма трат за месяц составила "+sum+" рублей");
    }
    public static void zd2(){
        int[]arr = generateRandomArray();
        int min = 200000;
        int max = 100000;
        for (int i : arr){
            if (i < min){
                min = i;
            }
            if (i > max){
                max = i;
            }

        }
        System.out.println();
        System.out.println("Минимальная сумма трат за день составила "+min+" рублей. Максимальная сумма трат за день составила "+max+" рублей");
    }
    public static void zd3(){
        int[]arr = generateRandomArray();
        int sum = 0;
        double averageAmount = 0;
        for (int i : arr){
            sum += i;
        }
        averageAmount = sum / 30;
        System.out.println();
        System.out.println("Средняя сумма трат за месяц составила "+averageAmount+" рублей");
    }
    public static void zd4(){
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length-1;i >= 0;i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}