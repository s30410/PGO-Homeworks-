public class User {
    private String fname;
    private String lname;
    private String email;
    private String password;
    private boolean isGuest;

    public User (String fname, String lname, String email, String password) {
        this.fname=fname;
        this.lname=lname;
        this.email=email;
        this.password=password;
        this.isGuest=false;
    }

    public User (String email) {
        this.email=email;
        this.isGuest=true;
    }

    public void convertToUser(String fname, String lname, String password) {
        this.fname = fname;
        this.lname = lname;
        this.password = password;
        this.isGuest = false;

    }

    public String getFirstName() {
        return fname;
    }
    public String getLastName() {
        return lname;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
    public boolean isGuest() {
        return isGuest;
    }
}