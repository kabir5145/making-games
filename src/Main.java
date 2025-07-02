

import java.util.Scanner;


interface ride{
     void shoot();
     void hide();
}
abstract class hello1{
    abstract public void greet();
    abstract public void notGreet();
}
class gun implements  ride{
   public void shoot(){
        System.out.println("you should shoot the gun");
    }
    public void hide() {
        System.out.println("you should hide after shooting the enemy");
    }
}
class ground extends hello1{
    @Override
    public void greet() {
        System.out.println("hello man , nice to meet you");
    }

    @Override
    public void notGreet() {
        System.out.println("just give me some space man i just need some fresh air");
    }
}
public class Main {
    public enum hi{
       RAGHAV,
        AADITYA,
        kabir
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        gun g = new gun();
//        g.shoot();
//        g.hide();
//        ground gh = new ground();
//        gh.greet();
//        gh.notGreet();
        hi r = hi.RAGHAV;
        hi a = hi.AADITYA;
        hi k = hi.kabir;
        System.out.println(r);
        System.out.println(a);
        System.out.println(k);

    }
}


