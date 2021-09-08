package javaPractice;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.SimpleFormatter;

public class DateTimeDeneme {
    public static void main(String[] args) {
        LocalDate currentDate1 = LocalDate.now();
        System.out.println(currentDate1);
        Scanner scan = new Scanner(System.in);
        String DOB = scan.next();
        System.out.println(DOB);

        Date dateDOB = new SimpleDateFormat("yyyy/MM/dd").parse(DOB);



    }
}
