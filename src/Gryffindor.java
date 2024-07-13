public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int courage;

    public Gryffindor(String name, int magicPower, int transgression, int nobility, int honor, int courage) {
        super(name, magicPower, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }

    @Override
    public String toString() {
        return "Gryffindor{" +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", courage=" + courage +
                ", magic power=" + getMagicPower() +
                ", transgression=" + getTransgression() +
                ", name=" + getName() +
                '}';
    }

    public void compareGryffindorStudents(Gryffindor otherStudent) {
        if ((this.courage + this.honor + this.nobility) > (otherStudent.courage + otherStudent.honor + otherStudent.nobility)) {
            System.out.println(this.getName() + " сильнее " + otherStudent.getName());
        } else if ((this.courage + this.honor + this.nobility) < (otherStudent.courage + otherStudent.honor + otherStudent.nobility)) {
            System.out.println(otherStudent.getName() + " сильнее " + this.getName());
        } else {
            System.out.println("Ученики равны по силе");
        }
    }
}
