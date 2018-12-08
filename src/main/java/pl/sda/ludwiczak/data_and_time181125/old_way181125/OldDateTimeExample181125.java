package pl.sda.ludwiczak.data_and_time181125.old_way181125;

import java.util.Calendar;
import java.util.Date;

public class OldDateTimeExample181125 {

    public static void main(String[] args) {
        Date now = new Date();
        System.out.println(now);
        System.out.println(now.getTime());

        Date tomorrow = new Date(now.getTime() + (24*60*60*1000));
        System.out.println(tomorrow.getTime());

        Calendar calendar = Calendar.getInstance();


        calendar.add(Calendar.DATE,-366);
        System.out.println("Aaa " + calendar.getTime());


        calendar.add(Calendar.DAY_OF_MONTH,-1);
        System.out.println("Bbb " + calendar.getTime());

        calendar.add(Calendar.YEAR,-1);
        System.out.println("Ccc " + calendar.getTime());
    }



}
