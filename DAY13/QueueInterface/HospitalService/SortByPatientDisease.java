package DAY13.QueueInterface.HospitalService;

import java.util.Comparator;

public class SortByPatientDisease implements Comparator<Patient> {

    @Override
    public int compare(Patient o1, Patient o2) {
        return o1.getDisease().compareTo(o2.getDisease());
    }
}