class RobotWars{


    public static Robot doFight(Robot r1, Robot r2){
        if(r1.getBattery() <= 0){ /* this is wrong as battery is not publicly accesible */
            return r2;
        }

        if( r2.getBattery() <= 0){
            return r1;
        }
        
        /* explain why this is like this, two times check */
        r1.fight(r2);
        
        if(r1.getBattery() <= 0){ /* this is wrong as battery is not publicly accesible */
            return r2;
        }

        if(r2.getBattery() <= 0){ /* this is wrong as battery is not publicly accesible */
            return r1;
        }
        return null;
    }

    public static void main(String args[]){

        Robot r1 =new Robot();
        Robot r2= new Robot();
        Robot r3= new Robot();
        Robot r4= new Robot();


        Robot winner = null;

        while( winner == null){
            winner = doFight(r1, r2);
            r1.printRobot();
            r2.printRobot();
        }

        System.out.println("Winner");
        winner.printRobot();

        Robot winner2 = null;
        while( winner2 == null){
            winner2 = doFight(r3, r4);
            r3.printRobot();
            r4.printRobot();
        }

        System.out.println("Winner 2");
        winner2.printRobot();

        Robot winner3 = null;
        while( winner3 == null){
            winner3 = doFight(winner, winner2);
            winner.printRobot();
            winner2.printRobot();
        }

        System.out.println("Winner Total");
        winner3.printRobot();

        // implement cycle to get r1 and r2 fight each other until someone wins
        
        // implement cycle to get r3 and r4 fight each other until someone wins

        // implement cycle to get the champion from r1,2,3,4

        

    }


}
