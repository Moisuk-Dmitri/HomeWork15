public class Hogwarts {
    private String name;
    private int magicPower;
    private int transgression;

    public Hogwarts(String name, int magicPower, int transgression) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgression = transgression;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgression() {
        return transgression;
    }

    public String getName() {
        return name;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void compareStudents(Hogwarts otherStudent) {
        if ((this.magicPower + this.transgression) > (otherStudent.magicPower + otherStudent.transgression)) {
            System.out.println(this.name + " сильнее " + otherStudent.name);
        } else if ((this.magicPower + this.transgression) < (otherStudent.magicPower + otherStudent.transgression)) {
            System.out.println(otherStudent.name + " сильнее " + this.name);
        } else {
            System.out.println("Ученики равны по силе");
        }
    }
}
