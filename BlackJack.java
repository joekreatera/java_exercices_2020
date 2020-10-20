public class BlackJack{


    public static void main(String args[]){

        /*
        AS => 1 | 11
        2
        3
        4
        5
        6
        7
        8
        9
        10
        J -> 10
        Q -> 10
        K -> 10
        */
        int c1 =  (int)(Math.random()*9.9+1);
        int c2 =  (int)(Math.random()*9.9+1);
        
        int sum1 = c1 + c2;
        int sum2 = 0;
        int sum11 = 0;
        int sum12 = 0;
        int sum21 = 0;
        int sum22 = 0;

        int sum111 = 0;
        int sum112 = 0;
        int sum121 = 0;
        int sum122 = 0;

        int sum211 = 0;
        int sum212 = 0;
        int sum221 = 0;
        int sum222 = 0;

        int c3 = 0;
        int c4 = 0;

        if( c1 == 1){
            sum2 = 11 + c2;   
        }
        else if( c2 == 1){
            sum2 = 11 + c1;   
        }else{
            sum2 = sum1;
        }

        sum11 = sum1;
        sum12 = sum1;
        sum21 = sum2;
        sum22 = sum2;
            
        if( sum1 < 17 || sum2 < 17 ){
            

            c3 =  (int)(Math.random()*9.9+1);
            if(c3 == 1){
                sum11 += 1;
                sum12 += 11;
                sum21 += 1;
                sum22 += 11;
            }else{
                sum11 += c3;
                sum12 += c3;
                sum21 += c3;
                sum22 += c3;
            }
        }

        
       
        sum111 = sum11;
        sum112 = sum11;
        sum121 = sum12;
        sum122 = sum12;

        sum211 = sum21;
        sum212 = sum21;
        sum221 = sum22;
        sum222 = sum22;

        if( sum11 < 17 ||sum12 < 17 ||sum21 < 17 ||sum22 < 17  ){
           

            c4 = (int)(Math.random()*9.9+1);
            
            if( c4 == 1){
                sum111 += 1;
                sum112 += 11;
                sum121 += 1;
                sum122 += 11;

                sum211 += 1;
                sum212 += 11;
                sum221 += 1;
                sum222 += 11;
            }else{
                sum111 += c4;
                sum112 += c4;
                sum121 += c4;
                sum122 += c4;

                sum211 += c4;
                sum212 += c4;
                sum221 += c4;
                sum222 += c4;
            }
        
        }

        System.out.println("Cards : " +c1 + "," + c2 + "," + c3 + "," + c4);
        System.out.println("Sums : ");
        System.out.println("sum111 : "+ sum111);
        System.out.println("sum112 : "+ sum112);
        System.out.println("sum121 : "+ sum121);
        System.out.println("sum122 : "+ sum122);
        System.out.println("sum211 : "+ sum211);
        System.out.println("sum212 : "+ sum212);
        System.out.println("sum221 : "+ sum221);
        System.out.println("sum222 : "+ sum222);


    }


}