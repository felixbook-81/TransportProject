package object;

public class Mechanic {
    private String firstname;
    private String lastname;
    private String titleCompany;


    public Mechanic(String firstname, String lastname, String titleCompany) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.titleCompany = titleCompany;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getTitleCompany() {
        return titleCompany;
    }

    public void setTitleCompany(String titleCompany) {
        this.titleCompany = titleCompany;
    }

    public void makeTO() {
        System.out.println("Механик начал проводить ТО");
        System.out.println("...");
        System.out.println("Механик провел ТО");
    }

    public void repairTransport() {
        System.out.println("Начал чинить машину");
        System.out.println("...");
        System.out.println("Механик починил машину");

    }

    @Override
    public String toString() {
        return "Mechanic{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", titleCompany='" + titleCompany + '\'' +
                '}';
    }
}
