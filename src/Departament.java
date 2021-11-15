import java.util.ArrayList;

public class Departament implements Element {
    private String depName;
    private ArrayList<Element> elements;

    public Departament() {
        this.depName = "";
        this.elements = new ArrayList<Element>();
    }

    public Departament(String depName) {
        this.depName = depName;
        this.elements = new ArrayList<Element>();
    }

    public Departament(String depName, ArrayList<Element> products) {
        this.depName = depName;
        this.elements = products;
    }

    public void add(Element element) {
        elements.add(element);
    }

    @Override
    public void print() {
        System.out.println("Depatamentul " + this.depName);
        if (elements != null) {
            for (Element i: elements)
                i.print();
        }
    }


}