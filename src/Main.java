public class Main {
    public static void main(String[] args) {
        Visitor visitorMaster = new VisitorMacter();
        Visitor visitorCleaner = new VisitotCleaner();
        HouseOne houseOne = new HouseOne();
        houseOne.setAdress("house One");
        houseOne.acccept(visitorCleaner);
        houseOne.acccept(visitorMaster);
        System.out.println("******************");
        HouseTwo houseTwo = new HouseTwo();
        houseTwo.setName("house Two");
        houseTwo.acccept(visitorCleaner);
        houseTwo.acccept(visitorMaster);
        System.out.println("Hello world!");
    }
}