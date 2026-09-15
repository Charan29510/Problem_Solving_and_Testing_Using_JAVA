import java.util.*;
import java.time.*;
class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
       LocalDate date=LocalDate.of(year,month,day);
       String name = date.getDayOfWeek().toString();

return name.charAt(0) + name.substring(1).toLowerCase(); 
    }
}
