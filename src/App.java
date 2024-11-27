public class App {
    public static void main(String[] args) throws Exception {
        
        //Integer addition
        System.out.println("1.0 + 12.5 = " + String.valueOf(add(1, 12)));

        //Float
        System.out.println("1.0 + 12.5 = " + String.valueOf(add(1.0f, 12.0f)));

        //Double
        System.out.println("1.0 + 12.5 = " + String.valueOf(add(1.12223, 12.45768)));

        //Long
        System.out.println("1.0 + 12.5 = " + String.valueOf(add(1909090L, 12343434L)));
    }

    public static int add(int a, int b){
        return a + b;
    }

    public static float add(float a, float b){
        return a + b;
    }

    public static double add(double a, double b){
        return a + b;
    }

    public static long add(long a, long b){
        return a + b;
    }
}
