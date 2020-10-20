public class IcecreamSimulator{
    public  static  void print(int cost){
        System.out.println("Costo del helado : " + cost);
    }
    public  static  int generateTopping(){     
        return getRandom(0, 1.9); // chocolate
    }
    public  static  int generateFlavour(){
        return getRandom(0,3.9);
    }
    public  static  int generateRecipient(){
        return getRandom(0, 1.9); // cone = 1
    }
    public  static  int generateSize(){
        return getRandom(0, 1.9); // chocolate
    }
    public static int generateIcecream(){
        int size = generateSize();
        int recp = generateRecipient();
        int f1 = generateFlavour();
        int f2 = -1;
        if( Math.random() > 0.5 ){
            f2= generateFlavour();
        }
        int top = generateTopping();
        int cost = 35 + size*20 + 5*recp + top*5;
        print(cost);

        return  cost;
    }

    public static int getRandom(double base, double top){
        return (int)(Math.random()*(top-base)+base);
    }   
    public static void main(String args[]){
        System.out.println("Icecream Sim 1.0");
        int i1 = generateIcecream();
        int i2 = generateIcecream();
        int i3 = generateIcecream();
        int i4 = generateIcecream();
        int i5 = generateIcecream();
        int i6 = generateIcecream();
        int i7 = generateIcecream();
        int i8 = generateIcecream();
        int i9 = generateIcecream();
        int i10 = generateIcecream();
        int day = i1 + i2 + i3 + i4 + i5 + i6 + i7 + i8 + i9 + i10;

        System.out.println("Day is " + day);
    }

}