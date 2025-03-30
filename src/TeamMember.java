import static java.lang.Character.isLowerCase;

public abstract class TeamMember {
    protected String nameOfInstitute;
    public long nationalID;
    protected String fullName ;
    protected String email ;
    protected String country;
    protected String faculty;

    protected TeamMember(String nameOfInstitute, long nationalID, String fullName, String email, String country, String faculty) {
        setNameOfInstitute(nameOfInstitute);
        setNationalID(nationalID);
        setFullName(fullName);
        setEmail(email);
        setCountry(country);
        setFaculty(faculty);
    }

    public String getNameOfInstitute() { return nameOfInstitute; }
    public long getNationalID() { return nationalID; }
    public String getFullName() { return fullName; }
    public String getEmail() { return email; }
    public String getCountry() { return country; }
    public String getFaculty() { return faculty; }

    protected void setNameOfInstitute(String nameOfInstitute) {
        if (nameOfInstitute == null) {
            throw new NullPointerException("nameOfInstitute cannot be null");
        }
        if (isLowerCase(nameOfInstitute.charAt(0))) {
            throw new IllegalArgumentException("nameOfInstitute cannot be lower case");
        }
    }
    protected void setNationalID(long nationalID) {
        if (nationalID <= 0) {
            throw new IllegalArgumentException("nationalID cannot be negative");
        }
        if (nationalID > 999999999L) {}
        //6reqemliq
    }
    protected void setFullName(String fullName) {
        if (fullName == null) {
            throw new NullPointerException("Name cannot be null");
        }
        if (isLowerCase(fullName.charAt(0))) {
            throw new IllegalArgumentException("Name cannot be lower case");
        }
    }
    protected void setEmail(String email) {
        if (email == null) {
            throw new NullPointerException("Email cannot be null");
        }
        if (!email.contains("@")) {
            throw new IllegalArgumentException("Email doesn't contain '@' character");
        }
    }
    protected void setCountry(String country) {
        if (country == null) {
            throw new NullPointerException("Country name cannot be null");
        }
        if (isLowerCase(country.charAt(0))) {
            throw new IllegalArgumentException("Country name cannot be lower case");
        }
    }
    protected void setFaculty(String faculty) {
        if (faculty == null) {
            throw new NullPointerException("Faculty name cannot be null");
        }
        if (isLowerCase(faculty.charAt(0))) {
            throw new IllegalArgumentException("Faculty name cannot be lower case");
        }
    }

    protected abstract void showDetails();
}
