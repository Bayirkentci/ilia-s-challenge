import java.util.HashMap;

class Intern extends TeamMember {
    private String requestedField;
    protected int internID;
    private static final HashMap<Long, String> countryOfEachMember = new HashMap<>();

    public Intern(String nameOfInstitute, long nationalID, String fullName, String email, String country, String faculty, String requestedField, int internID) {
        super(nameOfInstitute, nationalID, fullName, email, country, faculty);
        setRequestedField(requestedField);
        setInternID(internID);
    }

    public String getRequestedField() { return requestedField; }
    public int getInternID() { return internID; }

    protected void setRequestedField(String requestedField) {
        if (requestedField == null || requestedField.isEmpty()) {
            throw new NullPointerException("Requested field cannot be null or empty");
        }
        this.requestedField = requestedField;
    }

    protected void setInternID(int internID) {
        if (internID <= 0) {
            throw new IllegalArgumentException("internID must be positive");
        }
        this.internID = internID;
    }

    @Override
    protected void showDetails() {
        System.out.println("Member type: Intern");
        System.out.println("Name of institute: " + getNameOfInstitute());
        System.out.println("Name: " + getFullName());
        System.out.println("NationalID: " + getNationalID());
        System.out.println("Email: " + getEmail());
        System.out.println("Faculty: " + getFaculty());
        System.out.println("Requested field: " + getRequestedField());
        System.out.println("Intern ID: " + getInternID());
        System.out.println("---------------------");
    }

    public void matchNationalityOfMembers(TeamMember teamMember) {
        if (teamMember == null) {
            throw new NullPointerException("Team member cannot be null");
        }
        countryOfEachMember.put(teamMember.getNationalID(), teamMember.getCountry());
    }
}
