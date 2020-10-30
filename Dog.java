class Dog{
    public double distance =0.0;
    public boolean isAlive = true;

    public void fight(Dog other){
        if(Math.random() > 0.55 ){
            isAlive = false;
        }else{
            other.isAlive = false;
        }
    }
    public void play(){
        distance += Math.random()*10-5;
    }

    public void printDog(){
        System.out.println("This dog is " + distance + " meters from owner and is alive? " + isAlive);
    }
}