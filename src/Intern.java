import java.util.HashMap;

public class Intern extends TeamMember {
    public String requestedField;
    protected int internID;
    private static HashMap<Long, String> countryOfEachMember = new HashMap<>();
    //others shouldn't have access

    protected Intern(String nameOfInstitute, long nationalID, String  fullName, String email, String country, String faculty, String requestedField, int internID) {
        super(nameOfInstitute, nationalID, fullName, email, country, faculty);
        setRequestedField(requestedField);
        setInternID(internID);
    }

    public String getRequestedField() { return requestedField; }
    public int getInternID() { return internID; }

    protected void setRequestedField(String requestedField) {
        //
    }
    protected void setInternID(int internID) {
        if (internID <= 0) {
            throw new IllegalArgumentException();
        }
    }

    @Override
    protected void showDetails() {
        System.out.println("Member type: Intern");
        System.out.println("Name of institute: " + super.getNameOfInstitute());
        System.out.println("Name: " + super.getFullName());
        System.out.println("NationalID: " + super.getNationalID());
        System.out.println("Email: " + super.getEmail());
        System.out.println("Faculty: " + super.getFaculty());
        System.out.println("Requested field: " + this.getRequestedField());
        System.out.println("ID: " + this.getInternID());
        System.out.println("---------------------");
    }

    public void matchNationalityOfMembers(TeamMember teamMember){
        countryOfEachMember.put(teamMember.nationalID, teamMember.country);
    }
}