public class Doctor extends HealthPersonel implements Comparable<Doctor>{
    private String authId;

    public Doctor(String firstName, String lastName, String authId) {
        super(firstName, lastName);
        this.authId = authId;
    }

    @Override
    public String getName(){
        return "dr. " + name;
    }

    @Override
    public int compareTo(Doctor doc) {
        return this.authId.compareTo(doc.authId);
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "authId='" + authId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
