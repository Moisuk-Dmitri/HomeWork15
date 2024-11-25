import org.w3c.dom.html.HTMLAreaElement;

public class Main {
    public static void main(String[] args) {
        Hogwarts harryPotter = new Gryffindor("Harry Potter", 23, 21, 25, 65, 87);
        Hogwarts hermioneGranger = new Gryffindor("Hermione Granger", 21, 4, 12, 33, 4);
        Hogwarts ronWeasley = new Gryffindor("Ron Weasley", 3, 1, 34, 46, 67);

        Hogwarts dracoMalfoy = new Slytherin("Draco Malfoy", 23,12,54,24,87,98,65);
        Hogwarts grahamMontague = new Slytherin("Graham Montague", 2,12,5,5,65,4,21);
        Hogwarts gregoryGoyle = new Slytherin("Gregory Goyle", 78,8,54,55,4,5,7);

        Hogwarts zachariahSmith = new Hufflepuff("Zachariah Smith", 65, 26,3,23,32);
        Hogwarts cedricDiggory = new Hufflepuff("Cedric Diggory", 32, 45,1,21,32);
        Hogwarts justinFinchFletchley = new Hufflepuff("Justin Finch-Fletchley", 3, 57,12,57,55);

        Hogwarts zhouChang = new Ravenclaw("Zhou Chang", 45,98,8,9,65,23);
        Hogwarts padmaPatil = new Ravenclaw("Padma Patil", 78,41,2,42,14,9);
        Hogwarts marcusBelby = new Ravenclaw("Marcus Belby", 84,35,3,2,21,97);

        System.out.println("harryPotter.toString() = " + harryPotter.toString());
        System.out.println("padmaPatil.toString() = " + padmaPatil.toString());

        harryPotter.compareStudents(hermioneGranger);
        harryPotter.compareStudents(zachariahSmith);

        justinFinchFletchley.compareStudents(marcusBelby);
    }
}
