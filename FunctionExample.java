class FunctionExample {

    // 1. creation
    public static void printResults(double a, double b, double c){
        // 4. parametrization  
        if( b*b - 4*a*c < 0){
            System.out.println("Discriminant Warning");
            
        }else{
            double x1 = b + Math.sqrt(b*b - 4*a*c)/(2*a);
            double x2 = b - Math.sqrt(b*b - 4*a*c)/(2*a);

            System.out.println("X = " +x1 + "," + x2);
        }
    }

    public static double solveEquation(double a, double b, double c, int root){

        if( b*b - 4*a*c < 0){
            System.out.println("Discriminant Warning");
            return 0.0;
        }else{
            if( root == 1)
                return  b + Math.sqrt(b*b - 4*a*c)/(2*a);
            
            return b - Math.sqrt(b*b - 4*a*c)/(2*a);        
        }
    }
    public static void main(String args[]){
        // 2. migration
        
        // 3. execution
        printResults(2,10,1);
        printResults(1,5,1);
        printResults(-10,4,9);
        printResults(1,1,1);

        double x1 = solveEquation(2,10,1,1);
        double x2 = solveEquation(2,10,1,2);

        System.out.println("Roots " + x1 + ", " + x2);

    }
    
}