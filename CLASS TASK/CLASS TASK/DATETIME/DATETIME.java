import java.time.*;
import java.time.format.DateTimeFormatter;
public class TimeAPI {
public static void main(String[] args){
    LocalDate date=LocalDate.now();
    System.out.println("Date: "+date);
    DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
    System.out.println("Date: "+date.format(formatter));
    LocalTime time =LocalTime.now();
    System.out.println("Time : "+time.getHour()+":"+time.getMinute()+":"+time.getSecond());
    LocalDate dob=LocalDate.of(2006,03,16);
    Period age=Period.between(dob,date);
    System.out.println("age "+age.getYears()+" years "+age.getMonths()+" months "+age.getDays()+" Days");
}
    
}
