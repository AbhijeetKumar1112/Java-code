import java.util.Scanner;

public class array {
    public static void main(String[] args){
        int marks[] = new int[5];
        // int marks[] = {98, 99, 97, 96. 95}; another method
        System.out.println("Enter Marks of 5 Subjects: ");
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++){
            
            marks[i] = sc.nextInt();
            
        }
        System.out.println("Displaying Marks of 5 Subjects: ");
        for(int i=0;i<5;i++){
            System.out.println(marks[i]);
    }
       sc.close(); 
}
}
