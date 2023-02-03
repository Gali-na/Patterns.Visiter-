public class VisitorMacter implements Visitor {
    @Override
    public void visit(HouseOne houseOne) {
        System.out.println("I repair " + houseOne.getAdress());
    }

    @Override
    public void visit(HouseTwo houseTwo) {
        System.out.println("I repair " + houseTwo.getName());

    }
}
