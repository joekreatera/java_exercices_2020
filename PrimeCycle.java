/*
final answer will be on:
https://github.com/joekreatera/java_exercices_2020

cycles explanation

get a random number between 100 and 1000, write that amount of * in lines of 10

###*#*#***
#*#***#*#*
**#*****#*


EXTRA:
each, prime number write a #
*/

class PrimeCycle{

    public static int fib(int meta){
        int res1= 0;
        int res2 =0;
        int curr = 0;

        for(int iter =0; iter <= meta ; iter++){
            if( iter == 0){
                res1 = 0;
            }
            if(iter ==1){
                res2 = 1;
            }

            curr = res2+res1;
            res2 = res1;
            res1 = curr;
        }
        return curr;
    }

    public static void main(String args[]){
        // how a while works
        /*
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
        */
        int res = fib(6);
        System.out.println("Res 6:" + res);
        res = fib(3);
        System.out.println("Res 3:" + res);
        res = fib(10);
        System.out.println("Res 10:" + res);

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

        
    }

}