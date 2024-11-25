public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int powerThirst;

    public Slytherin(String name, int magicPower, int transgression, int cunning, int determination, int ambition, int resourcefulness, int powerThirst) {
        super(name, magicPower, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.powerThirst = powerThirst;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getPowerThirst() {
        return powerThirst;
    }

    public void setPowerThirst(int powerThirst) {
        this.powerThirst = powerThirst;
    }

    @Override
    public String toString() {
        return "Slytherin{" +
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", powerThirst=" + powerThirst +
                ", magic power=" + getMagicPower() +
                ", transgression=" + getTransgression() +
                ", name=" + getName() +
                '}';
    }

    public void compareSlytherinStudents(Slytherin otherStudent) {
        if ((this.cunning + this.determination + this.ambition + this.resourcefulness + this.powerThirst) >
                (otherStudent.cunning + otherStudent.determination + otherStudent.ambition + otherStudent.resourcefulness + otherStudent.powerThirst)) {
            System.out.println(this.getName() + " сильнее " + otherStudent.getName());
        } else if ((this.cunning + this.determination + this.ambition + this.resourcefulness + this.powerThirst) <
                (otherStudent.cunning + otherStudent.determination + otherStudent.ambition + otherStudent.resourcefulness + otherStudent.powerThirst)) {
            System.out.println(otherStudent.getName() + " сильнее " + this.getName());
        } else {
            System.out.println("Ученики равны по силе");
        }
    }
}
