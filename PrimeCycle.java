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

    public static boolean isPrime(int n){
        int am = 0;
        int m = n;
        boolean r = false;
        while(m > 0 && n!=1){
            r = true;
            if( n%m == 0){
                am++;
                if(am > 2)
                    return false;
            }
            m--;
        }

        return r;
    }

    public static void printLine(int base, int amount, boolean doPrimes, String normalCharacter, String primeCharacter){

        for(int i =1 ; i <= amount; i++){
            if( doPrimes&& isPrime(base + i) ){
                System.out.print(primeCharacter);
            }else{
                System.out.print(normalCharacter);
            }
        }
        System.out.println("");
    }
    public static void main(String args[]){

        int n = 1000;
        int groups = 100;
        int lines = n/groups;

        for(int i = 0; i <= lines ; i = i+1){
            if( i < n/groups ){
                printLine(i*groups, groups , true ,"*", "#");                
            }else{
                printLine(i*groups, n-i*groups , true, "*" , "#");
            }
        }
    }

}