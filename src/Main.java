public class Main {
    public static void main(String[] args) {
        Departament IT = new Departament("IT");
        Departament HR = new Departament("HR");

        Categorie Logistica = new Categorie("Ion Vasile", "Lalelelor","3000", "Frontend",  new Logistica());
        Categorie Infrastructura = new Categorie("Amalia Nicole", "Petalelor","2000", "Frontend",  new Infrastructura());
        Categorie Dezvoltare = new Categorie("Gelu Sarbu", "Cranga 3","2500", "Backend",  new Dezvoltare());

        IT.add(Logistica);
        IT.add(Infrastructura);
        HR.add(Dezvoltare);

        IT.print();
        HR.print();
    }
}