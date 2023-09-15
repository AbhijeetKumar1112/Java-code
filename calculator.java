import java.util.Scanner;

public class calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        System.out.println("enter 1 for addition \nenter 2 for substraction \nenter 3 for multiplication \nenter 4 for division");
        int operator = sc.nextInt();
        switch(operator){
            case 1: float sum = a+b;
                    System.out.println(sum);
                    break;
            case 2: float subs = a-b;
                    System.out.println(subs);
                    break;
            case 3: float mul = a*b;
                    System.out.println(mul);
                    break;
            case 4: float div = a/b;
                    System.out.println(div);
                    break;
            default: System.out.println("enter valid operator!!!");
                    break;
        }

            sc.close();


    }
    

}
