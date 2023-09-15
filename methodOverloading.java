public class methodOverloading {
    static void Addition(double a , double b ){
        double sum = a+b;
        System.out.println(sum);
    }
    static void Addition(int a, int b){
        int sum = a+b;
        System.out.println(sum);
    }
    static void Addition(int a, double b){
        double sum = a+b;
        System.out.println(sum);
    }
    static void Addition(String a, String b){
        String sum = a+ " " +b;
        System.out.println(sum);
    }

    public static void main(String[] args){
        Addition(33.3, 66.7);
        Addition(15, 35);
        Addition(30, 78.5);
        Addition("Abhijeet", "Kumar");
    }

}
