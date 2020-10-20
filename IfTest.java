public class IfTest{
    public static void main(String args[]){
        int r = (int)(Math.random()*10);
        System.out.println("Number: "  + r);
 
        boolean unequalTest = (r != 5);
        boolean gtTest = (r > 5);
        boolean ltTest = (r < 5);
        boolean gteTest = (r >= 5);
        
        if(r == 6){
            System.out.println("Jackpot on 6");
        }

    }
}