public class GCD {
    int gcd(int a, int b){
        if(b == 0){
            return a;
        }else {
            return gcd(b, a%b);
        }
    }

    public static void main(String[] args) {
        GCD app = new GCD();
        System.out.println(app.gcd(1717171717, 1717));
    }
}
