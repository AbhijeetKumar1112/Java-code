import java.util.Scanner;


public class function {
    static float Addition(float a, float b){
            float sum = a+b;
            return sum;
        }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();
        
        float sum1 =Addition(15, 35);
        float sum2 =Addition(num1, num2);

        System.out.println(sum1);
        System.out.println(sum2);

        sc.close();
    }
}
