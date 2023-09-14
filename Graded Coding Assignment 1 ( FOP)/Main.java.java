// Main.java
public class Main {
    public static void main(String[] args) {
        AdminDepartment adminDepartment = new AdminDepartment();
        HrDepartment hrDepartment = new HrDepartment();
        TechDepartment techDepartment = new TechDepartment();

        // Display Admin Department's information
        System.out.println("Admin Department:");
        System.out.println(adminDepartment.departmentName());
        System.out.println(adminDepartment.getTodaysWork());
        System.out.println(adminDepartment.getWorkDeadline());
        System.out.println(adminDepartment.isTodayAHoliday());

        // Display HR Department's information
        System.out.println("\nHR Department:");
        System.out.println(hrDepartment.departmentName());
        System.out.println(hrDepartment.getTodaysWork());
        System.out.println(hrDepartment.getWorkDeadline());
        System.out.println(hrDepartment.isTodayAHoliday());
        System.out.println("Activity: " + hrDepartment.doActivity("team Lunch"));

        // Display Tech Department's information
        System.out.println("\nTech Department:");
        System.out.println(techDepartment.departmentName());
        System.out.println(techDepartment.getTodaysWork());
        System.out.println(techDepartment.getWorkDeadline());
        System.out.println(techDepartment.isTodayAHoliday());
        System.out.println("Tech Stack: " + techDepartment.getTechStackInformation());
    }
}
