package by.itstep.rodionov.javastages.stage20;

public class Runner {
    public static void main(String[] args) {

        Helmet helmet = new Helmet(100,"iron","black",10,"male");
        Sword sword = new Sword(120,"Iron","red",20,5);
        Knight knight = new Knight(helmet, sword);
        System.out.println(sword);
        System.out.println(helmet);
        System.out.println("Sum price: "+knight.calcAllPrice());
        System.out.println("Sum weight: "+knight.calcAmmunitionWeight());
        }
    }
