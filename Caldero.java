public class Caldero{

    /*
        Una bruja se encuentra generando una formula en su caldero

        El caldero puede mezclar tres sustancias que van de 0 a 255 mililitros cada una

        EL programa debe decir cuantos mililitros tendra de formula completa y la
        proporcion (porcentaje) de cada sustancia:
        R -> rana
        G -> goblin
        D -> duende
        
        */

        public static void main(String args[]){
            double r = Math.random()*255; /*entre  0 y 1*/ 
            double g = Math.random()*255;
            double d = Math.random()*255;
            
            System.out.println("Sustancia r :" + r );
            System.out.println("Sustancia g :" + g);
            System.out.println("Sustancia d :" + d);

            double t = r + g+ d;
            r = r/t*100;
            g = g/t*100;
            d = d/t*100;

            System.out.println("Total :" + t );
            
            System.out.println("% Sustancia r :" + r );
            System.out.println("% Sustancia g :" + g);
            System.out.println("% Sustancia d :" + d);
        }
    
}

/*
Milliitros totales: 750 ml
R : 0.33 %
G : 0.33 %
D : 0.33 %
*/ 