/*
final answer will be on:
https://github.com/joekreatera/java_exercices_2020

cycles explanation

get a random number between 100 and 1000, write that amount of * in lines of 10

EXTRA:
each, prime number write a #
*/

class PrimeCycle{

    public static void main(String args[]){
        // how a while works

        int res1= 0;
        int res2 =1;
        int curr = 0;
        int iter = 1;
        int meta = 6;
        while(iter <= meta){
            curr = res2+res1;
            res2 = res1;
            res1 = curr;
            iter++;
        }
        System.out.println("Res " + curr);
           
    }

}



 /*
        int i = 0;
        while(i < 10){  
            System.out.println("Hola");
            i++;
        }

        double r = Math.random();
        while( r < 0.5){
            r = Math.random();
            System.out.println("-");            
        }
        // how a for works
        for( int j = 0; j < 10 ; j++){
            System.out.println("Hola");
        }*/