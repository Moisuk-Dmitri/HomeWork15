public class Ravenclaw extends Hogwarts {
    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String name, int magicPower, int transgression, int intelligence, int wisdom, int wit, int creativity) {
        super(name, magicPower, transgression);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return "Ravenclaw{" +
                "intelligence=" + intelligence +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", creativity=" + creativity +
                ", magic power=" + getMagicPower() +
                ", transgression=" + getTransgression() +
                ", name=" + getName() +
                '}';
    }

    public void compareRavenclawStudents(Ravenclaw otherStudent) {
        if ((this.wisdom + this.intelligence + this.wit + this.creativity) >
                (otherStudent.wisdom + otherStudent.intelligence + otherStudent.wit + otherStudent.creativity)) {
            System.out.println(this.getName() + " сильнее " + otherStudent.getName());
        } else if ((this.wisdom + this.intelligence + this.wit + this.creativity) <
                (otherStudent.wisdom + otherStudent.intelligence + otherStudent.wit + otherStudent.creativity)) {
            System.out.println(otherStudent.getName() + " сильнее " + this.getName());
        } else {
            System.out.println("Ученики равны по силе");
        }
    }
}
