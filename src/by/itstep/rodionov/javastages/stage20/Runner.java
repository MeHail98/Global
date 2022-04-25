package by.itstep.rodionov.javastages.stage20;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {

        AmmunitionInformation ammunitionInformation = new AmmunitionInformation(110);

        Helmet helmet = new Helmet(100,"iron","black","male","yes");
        Sword sword = new Sword(120,"Iron","red",200,5);
        Knight knight = new Knight(helmet, sword);
        int sum = knight.AllPrice();
        System.out.println(sum);
//        System.out.println(sword.getPrice());
//        System.out.println(helmet);

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);

        for (int i = 0; i < integerList.size(); i++){
            System.out.println(integerList.get(i));
        }


    }
}
