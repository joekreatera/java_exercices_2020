public class SpaceFactory {
    /*
    Marte: 10,000
    Jupiter: 20,000
    1 tanque de hidrogeno: 25,000
    3 tanques de hidrogeno: 75,000
    1 habitaculo para astronautas: 0
    2 habitaculos : 4,000
    3 habitaculos: 8,000
    Precio base : 38,000,000
    Simular 6 cohetes. 
    Math.random
    */

    public static void doRocket(){
        int destination = (int)(Math.random()*1.5+1);
        int hydrogen = (int)(Math.random()*3+1);
        int rooms = (int)(Math.random()*2);
        int total = 38000000 + destination*10000 + hydrogen*25000 + rooms*4000;
        System.out.println("Price : " + total);
    }
    public static void main(String args[]){
        doRocket();
        doRocket();
        doRocket();
        doRocket();
        doRocket();
        doRocket();

    }
}
