package by.itstep.rodionov.javastages.itstepHome;

public class HanoyTowers {
    public static void main(String[] args) {
    int count = 2;
    moveRing('A', 'B', 'C', count);
}

    public static void moveRing(char a, char b, char c, int count) {

        if (count==1){
            System.out.printf("from %s to %s\n",a,b);
        }else {
            moveRing(a, c, b, count - 1);
            System.out.printf("from %s to %s\n",a,b);
            moveRing(c,b,a,count-1);
        }
    }
}
