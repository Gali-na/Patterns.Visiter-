public class VisitotCleaner implements Visitor {
    @Override
    public void visit(HouseOne houseOne) {
        System.out.println("I did the cleaning" +houseOne.getAdress());

    }

    @Override
    public void visit(HouseTwo houseTwo) {
        System.out.println("I did the cleaning"+houseTwo.getName());
    }
}
