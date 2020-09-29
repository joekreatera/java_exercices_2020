import java.io.*;


public class HelloWorld{


    public static void main(String args[]){

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        try{
            System.out.println("Nombre: ");
            String entrada = input.readLine();

            System.out.println("Nombre fue " + entrada);
        }catch(Exception e){
            System.out.println(e);
        }
    }


}