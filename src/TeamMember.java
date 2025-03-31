abstract class TeamMember {
    protected String nameOfInstitute;
    protected long nationalID;
    protected String fullName;
    protected String email;
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
        if (nameOfInstitute == null || nameOfInstitute.isEmpty()) {
            throw new NullPointerException("nameOfInstitute cannot be null or empty");
        }
        if (Character.isLowerCase(nameOfInstitute.charAt(0))) {
            throw new IllegalArgumentException("nameOfInstitute must start with an uppercase letter");
        }
        this.nameOfInstitute = nameOfInstitute;
    }

    protected void setNationalID(long nationalID) {
        if (nationalID <= 0 || nationalID > 999999999L) {
            throw new IllegalArgumentException("nationalID must be a positive number up to 9 digits");
        }
        this.nationalID = nationalID;
    }

    protected void setFullName(String fullName) {
        if (fullName == null || fullName.isEmpty()) {
            throw new NullPointerException("Full name cannot be null or empty");
        }
        if (Character.isLowerCase(fullName.charAt(0))) {
            throw new IllegalArgumentException("Full name must start with an uppercase letter");
        }
        this.fullName = fullName;
    }

    protected void setEmail(String email) {
        if (email == null || email.isEmpty()) {
            throw new NullPointerException("Email cannot be null or empty");
        }
        if (!email.contains("@")) {
            throw new IllegalArgumentException("Email must contain '@'");
        }
        this.email = email;
    }

    protected void setCountry(String country) {
        if (country == null || country.isEmpty()) {
            throw new NullPointerException("Country cannot be null or empty");
        }
        if (Character.isLowerCase(country.charAt(0))) {
            throw new IllegalArgumentException("Country name must start with an uppercase letter");
        }
        this.country = country;
    }

    protected void setFaculty(String faculty) {
        if (faculty == null || faculty.isEmpty()) {
            throw new NullPointerException("Faculty cannot be null or empty");
        }
        if (Character.isLowerCase(faculty.charAt(0))) {
            throw new IllegalArgumentException("Faculty name must start with an uppercase letter");
        }
        this.faculty = faculty;
    }

    protected abstract void showDetails();
}