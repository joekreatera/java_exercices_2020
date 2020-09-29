public class CodeFactory{
    public static void main(String args[]){

        
        double a = 1;
        double b = -14;
        double c = 5;

        double disc = Math.sqrt( b*b - 4*a*c);
        double x1 = (-b + disc)/(2*a);
        double x2 = (-b - disc)/(2*a);
        
        System.out.println("X1 : = " + x1);
        System.out.println("X2 : = " + x2);
        
    }
}