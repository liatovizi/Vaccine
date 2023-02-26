import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public enum Vaccine {
	SPUTNYIK(21,2), PFIZER(21,2), MODERNA(28,2), JOHNSON_AND_JOHNSON(0,1);

	private Vaccine(Integer secondShotTimingInDays, Integer nrOfShotRequiered) {
		this.secondShotTimingInDays = secondShotTimingInDays;
		this.nrOfShotRequiered = nrOfShotRequiered;
	}
	
	private Integer secondShotTimingInDays;
	private Integer nrOfShotRequiered;
	
	public LocalDate calculateLocalDateofSecondShot (LocalDate dateOfFirstShot) throws SecondShotNotNeededException{
		if(nrOfShotRequiered == 1) {
			throw new SecondShotNotNeededException();
		}
		
		return dateOfFirstShot.plus(secondShotTimingInDays, ChronoUnit.DAYS);
	}
}

