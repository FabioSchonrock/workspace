import java.text.SimpleDateFormat;
import java.util.Date;

public class Testes {

	public void main(String[] args) {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		
		Date date = null;
		
		try {
			date = formatter.parse("24/07/2020");
			System.out.println(formatter.parse("24/07/2020"));
		} catch (java.text.ParseException e) {
			e.printStackTrace();			
		}
	}

}
