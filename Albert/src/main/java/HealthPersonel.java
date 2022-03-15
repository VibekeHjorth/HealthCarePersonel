public abstract class HealthPersonel {
    protected String firstName;
    protected String lastName;
    protected String name;

    public HealthPersonel(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

    }

    // sæt navn
    public void setName(String name) {
        this.name = name;
    }
    // få navn
    public String getName(){return name; }
}
