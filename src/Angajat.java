public abstract class Angajat implements Element {
    protected String name;
    protected String adress;
    private int salary;
    protected String details;

    public Angajat(String name, String adress, int salary, String details) {
        this.name = name;
        this.adress = adress;
        this.salary= salary;
    }

    public int getSalary() {
        return salary;
    }
}