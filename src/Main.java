public class Main {
    public static void main(String[] args) {
        try {
            Intern intern = new Intern("EPFL", 112590, "Iliya Asadi", "iliya70594@gmail.com", "Iran", "Computer Science", "Machine Learning", 1);
            intern.showDetails();
            intern.nationalID = 2547;
            intern.fullName = "iliya";
            intern.faculty = "Computer Engineering";
            intern.email = "iliyaasd84128.gmail.com";
            intern.nameOfInstitute = "hku Hong Kong";
            intern.internID = -1;
            intern.showDetails();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());}
//        } catch (NullPointerException e) {
//            System.out.println(e.getMessage());
//        }
    }
}