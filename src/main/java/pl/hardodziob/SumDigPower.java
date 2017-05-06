package pl.hardodziob;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

import static java.lang.String.valueOf;
import static java.util.stream.Collectors.*;
import static java.util.stream.Collectors.toList;


class SumDigPower {


    public static List<Long> sumDigPow(long a, long b) {
//        List<Long> list = new ArrayList<>();
//        for(long i=a;i<b+1;i++){
//            if(checkLong(i)!=0){
//                list.add(i);
//            }
//        }
        return LongStream.rangeClosed(a,b).filter(x->checkLong(x)!=0).boxed().collect(toList());
    }


    public static long checkLong(long l){
        String number = valueOf(l);
        char[] splitedNumber= number.toCharArray();
        long sum=0;
        for(int i=0;i<splitedNumber.length;i++){
            sum+=(long)Math.pow(Double.parseDouble(String.valueOf(splitedNumber[i])),Double.parseDouble(String.valueOf(i+1)));
        }
        if(sum==l)
            return l;
        else
            return 0;
    }
}