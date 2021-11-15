

public class Categorie extends Angajat {
    private CategorieDept cd;
    public Categorie(String name,String adress,int salary, String details) {
        super(name,adress,salary,details);
    }

    public Categorie(String name, String adress,int salary, String details,CategorieDept cd) {
        super(name);
        super(adress);
        super(salary);
        super(details);
        this.cd = cd;
    }

    public void setOs(CategorieDept cd) {
        this.cd = cd;
    }

    @Override
    public void print() {
        String message = "Categoria " + this.name + "... ";
        if (cd != null)
            this.cd.print(message);
    }
}
