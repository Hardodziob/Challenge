package pl.hardodziob;

/**
 * Created by Wiki on 2017-05-06.
 */
public class CheckingClass {
    public static void main(String[] args) {


        for(long l : SumDigPower.sumDigPow(0, 100)){
            System.out.println(l);
        }
        //System.out.println(SumDigPower.checkLong(135));
    }
}
