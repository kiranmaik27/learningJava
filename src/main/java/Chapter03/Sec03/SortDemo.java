package Chapter03.Sec03;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by aditya on 8/16/2016.
 */
public class SortDemo {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter three names which has only alphabet:");
        String friends = in.nextLine();
        String[] friendslist = friends.split(" ");
        //String[] friends = {"Peter", "Paul", "Mary"};
        //Arrays.sort(friends);

        //System.out.println(friends);
        //System.out.println(friendslist);

        //friends = new String[]{"Peter", "Paul", "Mary"};
        //Arrays.sort(friendslist, new LengthComparator());
        Arrays.sort(friendslist);
        System.out.println(Arrays.toString(friendslist));
    }
}

class LengthComparator implements Comparator<String> {
  public int compare(String first, String second){ return first.length() - second.length(); }
}