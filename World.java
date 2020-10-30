class World{

    public static void main(String args[]){
    
        Dog collider = new Dog();
        Dog cerberus = new Dog();
        Person joe = new Person();
        joe.name = "Jose Carlos";
        collider.play();
        collider.fight(joe);
        collider.printDog();
        joe.printPerson();
    }

}


/*
Person joe = new Person();
joe.name = "Jose Carlos";
joe.age = 35;
joe.weight = 70;
Person edgar = new Person();
edgar.name = "Edgar";
edgar.age = 40;
edgar.weight = 70;
System.out.println("Joe is " + joe.name);
System.out.println("Coach is " + edgar.name);
System.out.println("Joe is " + joe.age +  " years old ");
joe.haveBirthDay();
System.out.println("Joe is " + joe.age +  " years old ");
System.out.println("Joe weights " + joe.weight +  " kg ");
joe.eat(.4);
System.out.println("Joe weights " + joe.weight +  " kg ");
*/