public class Badge {
    private static int totalNumberOfEmployees;
    private String badgeIdCode;
    public Employee employee;

    private static void keepTrackOfEmployeesNumber(){
        System.out.println("The total number of employees are "+totalNumberOfEmployees++);
    }

    private String generateBadgeIdCode(){
        RandomString randomString = new RandomString();
        String rndm = randomString.getRandomString();
        return rndm + employee.getName()+employee.getSurname()+rndm;
    }
    public void showBadgeDetails(){
        System.out.println("The total number of the employees are "+totalNumberOfEmployees);
        employee.getEmployeeDetails();
        System.out.println("The badgeID is "+generateBadgeIdCode());
    }

    public Badge(Employee employeeThatNeedsBadge){
        keepTrackOfEmployeesNumber();
        employee=employeeThatNeedsBadge;
        badgeIdCode=generateBadgeIdCode();
    }

    public int getTotalNumberOfEmployees(){
        return totalNumberOfEmployees;
    }
}
