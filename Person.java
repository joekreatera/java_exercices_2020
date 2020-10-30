class Person extends Dog{
    public String name="";
    public int age;
    public double weight;
    public void haveBirthDay(){
        age++;
    }
    public void eat(double grams){
        weight = weight + grams;
    }
    public void printPerson(){
        System.out.println(" Person " + name);
        printDog();
    }
}