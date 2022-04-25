package by.itstep.rodionov.javastages.stage20;

public class Knight {

    /*Рыцарь (Knight). Есть рыцаря, который экипирован соответствующей амуни-
    цией. Необходимо определить общую стоимость всей амуниции, а также
    найти самую дорогую (недорогую) амуницию рыцаря.*/

    private Helmet helmet;
    private Sword sword;

    public Knight(Helmet helmet, Sword sword) {
        this.helmet = helmet;
        this.sword = sword;
    }

    public int AllPrice(){
        int sum = helmet.getPrice() + sword.getPrice();
        return sum;
    }

}
