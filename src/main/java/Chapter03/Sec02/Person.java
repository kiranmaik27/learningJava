package Chapter03.Sec02;

/**
 * Created by aditya on 8/16/2016.
 */
public interface Person {
    String getName();
    default  int getId() { return 0; }
}
