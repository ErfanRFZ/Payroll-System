import java.util.Calendar;

public class Staff extends Employee {

    protected int hourlyRate;
    // Getter
    public int getHourlyRate() {
        return hourlyRate;
    }

    // Setter
    public void setHourlyRate(int newHourlyRate) {
        this.hourlyRate = newHourlyRate;
    }

    public Staff(String last_name, String first_name, String id_number, String sex, Calendar birth_date, int hourlyRate) {
        super(last_name, first_name, id_number, sex, birth_date);
        this.hourlyRate = hourlyRate;
    }

    @Override
    public int monthlyEarning() {
        return hourlyRate * 160;
    }
}
