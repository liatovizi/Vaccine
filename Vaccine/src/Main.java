import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		LocalDate calculatedDateOfSecondShotForPfizer = Vaccine.PFIZER.calculateLocalDateofSecondShot(LocalDate.now());
		System.out.println("second shot should be given on: " + calculatedDateOfSecondShotForPfizer);
		
		LocalDate calculatedDateOfSecondShotOfModerna = Vaccine.MODERNA.calculateLocalDateofSecondShot(LocalDate.of(2021, 01, 10));
		System.out.println("second shot should be given on: " + calculatedDateOfSecondShotOfModerna);
		
		LocalDate calculatedDateOfSecondShotOfJohnson = Vaccine.JOHNSON_AND_JOHNSON.calculateLocalDateofSecondShot(LocalDate.of(2021, 03, 01));
		System.out.println("second shot should be given on: " + calculatedDateOfSecondShotOfJohnson);
		
	

	}

}
