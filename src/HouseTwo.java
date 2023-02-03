public class HouseTwo implements House {
    private  String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void acccept(Visitor visitor) {
        visitor.visit(this);
    }
}
