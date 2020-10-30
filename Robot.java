class Robot {

    /*
    three defense types
    three attack types
    battery type is a random value between 100 and 200
    */

    int defenseType = 0;
    int attackType = 0;
    int battery = 0;


    /* Keep the battery non public, but try to return the value with a function */
    /*
    
IMPLEMENT HERE

    */
    public Robot(){
        defenseType = (int)(Math.random()*10+1);
        attackType = (int)(Math.random()*10+1);
        battery = (int)(Math.random()*100+100);
        
    }


    public int getBattery(){
        return battery;
    }
    public int getAttackType(){
        return attackType;
    }

    public void diminishBattery(int b){
        battery -= b;
    }

    public void fight(Robot contender){

        /* fighting logic here 
        if attack equals defense then both get battery diminish by type*2
        if attack type is less than defense type, diminish attacking robot battery by defense-attack*4
        if defense type is less than attack type, diminish attacking robot battery by attack-defense*5
        
        */
        int r = defenseType - contender.getAttackType();

        if( r > 0 ){
            contender.diminishBattery( r*4 );
        }
        if( r < 0){
            diminishBattery(Math.abs(r)*5);
        }

        if(r == 0){
            contender.diminishBattery( defenseType*2 );
            diminishBattery(  defenseType*2 );
        } 
    }

    /* advanced challenge: investigate how does toString works and implement instead of printRobot */
    public void printRobot(){
        System.out.println("Robot has attack " + attackType + " defense " + defenseType  + " battery " + battery +  "" );
        /* print the defenses and attacks as text values, i.e. Fire, Water,Metal defense and Flame,Wrecking Ball and Hammer offense */
    }
    
}
