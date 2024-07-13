public class Hufflepuff extends  Hogwarts {
    private int hardWork;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, int magicPower, int transgression, int hardWork, int loyalty, int honesty) {
        super(name, magicPower, transgression);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getHardWork() {
        return hardWork;
    }

    public void setHardWork(int hardWork) {
        this.hardWork = hardWork;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return "Hufflepuff{" +
                "hardWork=" + hardWork +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                ", magic power=" + getMagicPower() +
                ", transgression=" + getTransgression() +
                ", name=" + getName() +
                '}';
    }

    public void compareHufflepuffStudents(Hufflepuff otherStudent) {
        if ((this.hardWork + this.loyalty + this.honesty) > (otherStudent.hardWork + otherStudent.loyalty + otherStudent.honesty)) {
            System.out.println(this.getName() + " сильнее " + otherStudent.getName());
        } else if ((this.hardWork + this.loyalty + this.honesty) < (otherStudent.hardWork + otherStudent.loyalty + otherStudent.honesty)) {
            System.out.println(otherStudent.getName() + " сильнее " + this.getName());
        } else {
            System.out.println("Ученики равны по силе");
        }
    }
}
