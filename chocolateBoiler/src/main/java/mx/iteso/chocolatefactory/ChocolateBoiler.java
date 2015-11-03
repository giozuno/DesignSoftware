package mx.iteso.chocolatefactory;

/**
 * Created by Giovanni on 02/11/2015.
 */
public class ChocolateBoiler {
    private volatile boolean empty;
    private volatile boolean boiled;
    private volatile static ChocolateBoiler chocolateBoilerInstance;
    public int fillTimes;
    public int boilTimes;
    public int drainTimes;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
        fillTimes = 0;
        boilTimes = 0;
        drainTimes = 0;
    }

    public static void deleteInstance(){
        chocolateBoilerInstance = null;
    }

    public static ChocolateBoiler getInstance(){
        if(chocolateBoilerInstance == null){
            synchronized (ChocolateBoiler.class){
                if(chocolateBoilerInstance == null){
                    chocolateBoilerInstance = new ChocolateBoiler();
                }
            }
        }
        return chocolateBoilerInstance;
    }

    public synchronized void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            fillTimes++;
            //System.out.println("Fill " + fillTimes);
            // fi ll the boiler with a milk/chocolate mixture
        }
    }
    public synchronized void drain() {
        if (!isEmpty() && isBoiled()) {
            // drain the boiled milk and chocolate
            empty = true;
            drainTimes++;
            //System.out.println("Drain " + drainTimes);
        }
    }
    public synchronized void boil() {
        if (!isEmpty() && !isBoiled()) {
            // bring the contents to a boil
            boiled = true;
            boilTimes++;
            //System.out.println("Boil " + boilTimes);
        }
    }
    public boolean isEmpty() {
        return empty;
    }
    public boolean isBoiled() {
        return boiled;
    }
}
