//import com.tom.BrushTeeth;
//import com.tom.Wizard;
//import com.tom.breakfast;

public class Main {

    public static void main(String[] args) {
  /*      System.out.println("Hello World!");
        breakfast breakfast = new breakfast();
        breakfast.start();
        try {
            breakfast.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        BrushTeeth bt = new BrushTeeth();
        Thread thread = new Thread(bt);
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main end");
*/
        Wizard w1 = new Wizard();
        w1.start();

        Wizard w2 = new Wizard();
        w2.start();




    }
}
