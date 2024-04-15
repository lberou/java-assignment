public class Debris extends Floatable{
int id;
String material;

    public Debris(String name, int diameter,int id, String material) {
        super(name, diameter);
        this.id=id;
        this.material=material;
    }
}
