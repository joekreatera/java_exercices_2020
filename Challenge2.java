public class Challenge2{

    /*
    
    Program to find century for a year
Last Updated: 28-07-2020
Given a year the task is that we will find the century in the given year. The first century start from 1 to 100 and the second century start from 101 to 200 and so on . 
Examples: 
 

Input : year = 1970
Output : 20 century 

Input : year = 1800
Output : 18 century 


    */

    public static void main(String args[]){
        int data[] = {5,2,8,4,5,2};
        System.out.println(data[3]);

        for( int i = 0; i < data.length ; i++ ){
            for(int j= 0; j < data.length-1 ; j++){
                if(data[j]>data[j+1]){
                    data[j] = data[j]*data[j+1];
                    data[j+1] = data[j]/data[j+1];
                    data[j] = data[j]/data[j+1];
               }
            }

        }

        for(int i = 0; i< data.length ; i++){
            System.out.println("Item " + data[i]);
        }

    }
}