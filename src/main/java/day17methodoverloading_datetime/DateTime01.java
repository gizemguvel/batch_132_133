package day17methodoverloading_datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTime01 {
    public static void main(String[] args) {

        //Type code to get the current date

        Date currentDate=new Date();
        System.out.println(currentDate);//Thu Jan 26 20:43:40 EET 2023

        System.out.println(currentDate.getTime());//1674755148113

        //Type code to get the current time in your local area
        LocalTime myTime= LocalTime.now();
        System.out.println(myTime);//20:49:30.018656=> Current time ==> Hours:Minutes:Seconds:NanoSeconds

        //Type code to get the current date in your local area
        LocalDate myDate= LocalDate.now();
        System.out.println(myDate);//2023-01-26

        //Type code to get current date and current time in your local area
        LocalDateTime myDateTime=LocalDateTime.now();
        System.out.println(myDateTime);//2023-01-26T20:53:14.486875

        //How to get a specific component from date and time

        System.out.println(myDate.getMonthValue());//1
        System.out.println(myDate.getMonth());//JANUARY
        System.out.println(myDateTime.getDayOfWeek());//THURSDAY

        //How to get time in another time zone
        System.out.println(LocalDateTime.now(ZoneId.of("Asia/Tokyo")));//2023-01-27T03:01:48.624386
        System.out.println(LocalDateTime.now(ZoneId.of("Europe/London")));//2023-01-26T18:03:17.232136

        //How to go future or past in date and time
        System.out.println(myDate.plusYears(3).plusMonths(4).plusDays(12));//2026-06-07
        System.out.println(myTime.minusHours(3).minusMinutes(20));//17:47:54.221991

        //How to compare two dates

        LocalDate firstKidDob = LocalDate.of(2005, 8, 23);
        LocalDate secondKidDob = LocalDate.of(2011, 3, 11);

        boolean isFirstKidAfter = firstKidDob.isAfter(secondKidDob);
        System.out.println(isFirstKidAfter);//false

        boolean isFirstKidBefore = firstKidDob.isBefore(secondKidDob);
        System.out.println(isFirstKidBefore);//true

        boolean isFirstKidEqualsToSecondKid = firstKidDob.isEqual(secondKidDob);
        System.out.println(isFirstKidEqualsToSecondKid);//false

        //How to format Date
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MMMM/yy");

        //d-->1, 2, 3,..., 10, 11, 12,.., 31
        //dd -->01, 02, 03,..., 10, 11, 12, ... , 31
        //M-->1, 2, 3,..., 10, 11, 12
        //MM -->01, 02, 03,..., 10, 11, 12
        //MMM--> Jan , Feb, Mar, ... , Dec
        //MMMM --> January, February, ... , December
        //yy --> 23
        //yyyy --> 2023
        String formattedMyDate = dtf.format(myDate);
        System.out.println(formattedMyDate);// 24/January/23

        //How to format Time
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("hh:mm a");

        //HH --> 24 hours system
        //hh --> 12 hours system
        //After time pattern leave a space put "a" it puts AM or PM next to the time
        String formattedTime = dtf2.format(myTime);
        System.out.println(formattedTime);//09:51 PM

    }
}
