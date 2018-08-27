import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class q08 {
	
	public static void main(String[] args) {
		
		String date = LocalDate.parse("2018-08-12").format(DateTimeFormatter.ISO_DATE_TIME);
		System.out.println(date);

}
}
