public class Tester {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Marco", "Rossi", "Via nulla");
        Employee employee2 = new Employee("Francesco", "Stornello", "Via fasulla");

        Badge badge1 = new Badge(employee1);
        Badge badge2 = new Badge(employee2);

        badge1.showBadgeDetails();
        badge2.showBadgeDetails();
    }


}
