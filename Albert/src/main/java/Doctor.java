public class Doctor extends HealthPersonel{
    private String authId;

    @Override
    public String getName(){
        return "dr. " + name;
    }
}
