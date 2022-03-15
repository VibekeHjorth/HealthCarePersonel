import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HealthCareApp {
    public static void main(String[] args) {

        List<Doctor> doctors =new ArrayList<>();
        doctors.add(new Doctor("Brian","Doktor","10"));
        doctors.add(new Doctor("Christian","Budtz","9"));
        doctors.add(new Doctor("Anne","Radiolog","11"));


        Collections.sort(doctors);
        System.out.println(doctors);




    }
}
