public class HouseOne implements  House{
    private  String adress;

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getAdress() {
        return adress;
    }

    @Override
    public void acccept(Visitor visitor) {
        visitor.visit(this);
    }
}
