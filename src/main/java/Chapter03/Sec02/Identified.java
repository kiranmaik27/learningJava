package Chapter03.Sec02;

/**
 * Created by aditya on 8/16/2016.
 */
public interface Identified {
    default int getId() { return Math.abs(hashCode()); }
}
