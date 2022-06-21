import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class PlayDate {
	public static void main(String[] args) {
		//Date related operation
		LocalDate now = LocalDate.now();
		System.out.println(now);
		
		LocalDate birthday = LocalDate.of(1986, 11, 25);
		System.out.println(birthday);
		System.out.println(birthday.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		System.out.println(birthday.getDayOfMonth());
		System.out.println(birthday.getMonth());
		System.out.println(birthday.getMonth().getValue());
		System.out.println(birthday.getYear());
		
		//add up days to a localDate
		LocalDate future10 = now.plusDays(10);
		System.out.println(future10);
		
		LocalDate future2Months = now.plusMonths(2);
		System.out.println(future2Months);
		
		LocalDate past1Month = now.minusMonths(1);
		System.out.println(past1Month);
		
		//calculate your age
		Period period = Period.between(birthday, now.plusDays(1));
		System.out.println(period);
		System.out.println(String.format("%s years, %months", period.getYears(), period.getMonths()));
		
		//Compare Time
		System.out.println(now.isBefore(birthday));
		System.out.println(now.isAfter(birthday));
		
		//Time related operations
		LocalTime localTime = LocalTime.now();
		System.out.println(localTime);
		
		//individual components
		System.out.println(localTime.getHour());
		System.out.println(localTime.getMinute());
		
		//DateTime
		LocalDateTime localDateTime = LocalDateTime.now();
		
		
		
		
		
		
		
		
		//Zone based date times
		
		//Set<String> zoneIds = ZoneId.getAvailableZoneIds();
		//System.out.println(zoneIds);
		
		//ZonedDateTime zonedDateTiem = ZonedDateTime.now(zoneIds)
		
		
		
		
		
		
		
		
						
		
	}

}
