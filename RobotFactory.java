public class RobotFactory{

    /*
    Construye un programa que de manera automática determine los componentes que un robot va a tener:

1. Chasis: butterfly(0), dragonfly(1), kiwi(2)

2. Intake: rollers(0), claw(1), pneumatic claw(2)

3. Climber: pneumatic climber(0), belts(1), brute force(2)

4. Shooters: catapult(0), shooting rollers(1), gravity(2)

(Solo se puede elegir uno de cada cosa)

Aleatoriamente se deben construir los robots. Si existen componentes que no pueden asociarse, al final deberá mostrar un WARNING indicando los pares de componentes que no pueden estar juntos. 

REGLAS:

1. El chasis: kiwi no puede llevar shooters: gravity

2. El chasis butterfly: no puede llevar intake: rollers

3. Intake: pneumatic claw no puede ir junto con climber: brute force

4. Climber belts no puede llevar shooters: catapult

 

Si acabas rápido, calcula la probabilidad de que ese robot gane una competencia con la siguiente formula:

Posibilidad= chasis*shooter*intake + climber

Para calcular los numeros utiliza los elementos entre paréntesis que existen en el siguiente listado:

 

1. Chasis: butterfly(0.7), dragonfly(0.8), kiwi(0.3)

2. Intake: rollers(0.5), claw(0.3), pneumatic claw(0.6)

3. Climber: pneumatic climber(0.7), belts(0.5), brute force(0.4)

4. Shooters: catapult(0.5), shooting rollers(0.8), gravity(0.2)

Por cada WARNING de elementos que no pueden ser combinados,la fórmula total se deberá multiplicar por 0.9

Es decir, si hay dos warnings, se multiplicará por 0.81.  El máximo de warnings deberá ser un valor entre 0 y 3. 
    */

    public static int getRandom(double base, double top){
        return (int)(Math.random()*(top-base)+base);
    }

    public static double decideProb(int v1, int v2, int v3, double p1, double p2, double p3, int actualValue){
        if( actualValue == v1) return p1;
        if( actualValue == v2) return p2;
        if( actualValue == v3) return p3;

        return 0;
    }

    public static void main(String args[]){
        int chassis = getRandom(0,2.9);
        int intake = getRandom(0,2.9);
        int climber = getRandom(0,2.9);
        int shooter = getRandom(0,2.9);

        System.out.println("Config Chassis" + chassis);
        System.out.println("Config intake" + intake);
        System.out.println("Config climber" + climber);
        System.out.println("Config shooter" + shooter);

        double probWarning = 1;
        if( shooter == 2 && chassis == 2){
            System.out.println("WARNING: Kiwi meets gravity , can't do");
            probWarning *= .9;
        }
        if( intake == 0 && chassis == 1){
            System.out.println("WARNING: Butterfly meets rollers , can't do");
            probWarning *= .9;
        }
        if( intake == 2 && climber == 2){
            System.out.println("WARNING: Pneumatic claw meets brute force , can't do");
            probWarning *= .9;
        }

        if( shooter == 0 && climber == 1){
            System.out.println("WARNING: Catapult meets Belts , can't do");
            probWarning *= .9;
        }
        double probChassis = decideProb(0,1,2,0.7,0.8,0.3,chassis);
        double probIntake = decideProb(0,1,2,0.5,0.3,0.6,intake);
        double probClimber = decideProb(0,1,2,0.7,0.5,0.4,climber);
        double probShooter = decideProb(0,1,2,0.5,0.8,0.2,shooter);
        double p = (probChassis*probShooter*probIntake + probClimber)*probWarning;

        System.out.println("Winning chance is " + p);

         
    }

}