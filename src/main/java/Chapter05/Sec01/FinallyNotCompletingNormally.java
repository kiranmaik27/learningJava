package Chapter05.Sec01;

import java.util.concurrent.RejectedExecutionException;
/**
 * Created by aditya on 8/16/2016.
 */
public class FinallyNotCompletingNormally {
    public static int parseInt (String number){
        try{
            int n = Integer.parseInt(number);
            return n;
        }catch (NumberFormatException ex){
            return 0;
        }finally {
            return -1;
        }
    }
    public static double parseDouble(String number) {
        try {
            double x = Double.parseDouble(number);
        } finally {
            throw new IllegalStateException();
        }
    }

    public static void main(String[] args) {
        System.out.println(parseInt("Fred"));
        System.out.println(parseInt("123"));
        try {
            System.out.println(parseDouble("Fred"));
        }catch (Exception ex){
            System.out.println("Caught" + ex.getClass().getName());
        }
        try {
            System.out.println(parseDouble("12.3"));
        }catch(Exception ex){
            System.out.println("Caught" + ex.getClass().getName());
        }
    }
}
