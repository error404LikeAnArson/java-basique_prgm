public class Main {

    public static void main(String[] args) {
        Student student1 = new Student("Cedric", "Sultan");
        Student student2 = new Student("Gwenaelle", "Départ");
        student1.addResult("Programmation 2", new Grade(20.0));
        student2.addResult("Programmation 2", new Grade(21.0));
        Cohort l2mi = new Cohort("L2 informatique");
        l2mi.addStudent(student1);
        l2mi.addStudent(student2);
        l2mi.printStudentsResults();
        return;
    }

}
