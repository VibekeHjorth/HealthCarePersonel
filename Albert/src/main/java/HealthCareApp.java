import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HealthCareApp {
    public static void main(String[] args) {
        HealthPersonel nurse1 = new Nurse();
        nurse1.setName("Johnny");
        Doctor doc = new Doctor();
        doc.setName("Hollywood");
        HealthPersonel nurse = new Nurse();
        nurse.setName("Rachel");

        List<HealthPersonel> hcps = new ArrayList<>();
        hcps.addAll(Arrays.asList(doc, nurse,  nurse1));

        for(int i=0 ; i<hcps.size(); i++){
            System.out.println(hcps.get(i).getName());
            System.out.println(hcps.get(i).getClass());
        }


    }
}
