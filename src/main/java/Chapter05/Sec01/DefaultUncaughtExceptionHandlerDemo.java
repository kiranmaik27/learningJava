package Chapter05.Sec01;

/**
 * Created by aditya on 8/16/2016.
 */
public class DefaultUncaughtExceptionHandlerDemo {
    public static void main(String[] args){
        Thread.setDefaultUncaughtExceptionHandler((thread, ex)->{
            System.err.println(ex.getMessage());
            System.err.println("Goodbye, cruel world");
        });
        System.out.println(1 / 0);
    }
}
