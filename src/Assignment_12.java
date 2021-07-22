import java.util.stream.* ;
import java.util.* ;
import java.util.stream.Collectors;
class Student
{
    int id ;
    String name ;
    int age ;
    String gender ;
    String engDepartment ;
    int yearOfEnrollment ;
    double perTillDate ;
    Student(int id , String name ,int age  , String gender , String engineering_department , int year_of_enrollment , double current_percentage)
    {
        this.name = name ;
        this.id = id ;
        this.age = age ;
        this.gender = gender ;
        this.engDepartment = engineering_department ;
        this.yearOfEnrollment = year_of_enrollment ;
        this.perTillDate = current_percentage ;
    }
}
public class Assignment_12 {
    private final List<Student> lst;

    public Assignment_12() {
        lst = new ArrayList<Student>();
    }

    public void addStudent(int id, String name, int age, String gender, String engDepartment, int yearOfEnrollment, double perTillDate) {
        lst.add(new Student(id, name, age, gender, engDepartment, yearOfEnrollment, perTillDate));
    }

    public void printAllDepartments() {
        var departments = lst.parallelStream().map(i -> i.engDepartment).collect(Collectors.toSet());
        departments.forEach(System.out::println);
    }

    public List<String> whoEnrolledAfter2018() {
        return lst.parallelStream().filter(i -> i.yearOfEnrollment > 2018).map(i -> i.name).collect(Collectors.toList());
    }

    //
    public List<Student> selectAllMaleComputerScience() {
        return lst.parallelStream().filter(i -> i.engDepartment.equals("Computer Science") && i.gender.equals("Male")).collect(Collectors.toList());

    }

    //
    public Map<String, Long> totalMaleAndFemaleStudents() {
        return lst.parallelStream().collect(Collectors.groupingBy((s) -> s.gender, Collectors.counting()));
    }


    //
    public Map<String, OptionalDouble> averageAgeOfMaleAndFemale() {
        //var total = this.totalMaleAndFemaleStudents();
        var m = new HashMap<String, OptionalDouble>();
        var averageMaleAge = lst.parallelStream().filter(i -> i.gender.equals("Male")).mapToInt(i -> i.age).average();

        var averageFemaleAge = lst.parallelStream().filter(i -> i.gender.equals("Female")).mapToInt(i -> i.age).average();
        m.put("FemaleAverageAge", averageFemaleAge);
        m.put("AverageAgeMale", averageMaleAge);
        return m;
    }

    //
    public List<Student> getStudentsHavingHighestPer() {
        var maxPer = lst.parallelStream().mapToDouble(i -> i.perTillDate).max();
        if (maxPer.isPresent()) {
            return lst.parallelStream().filter(i -> i.perTillDate == maxPer.getAsDouble()).collect(Collectors.toList());
        }
        return null;
    }


    public Map<String, Long> countNumOfStudentInEachDep() {
        return lst.parallelStream().collect(Collectors.groupingBy((s) -> s.engDepartment, Collectors.counting()));
    }


    private OptionalDouble getTotalPerInDep(List<Student> students) {
        return students.parallelStream().mapToDouble(i -> i.perTillDate).average();
    }


    public Map<String, OptionalDouble> averagePerByDep() {
        var averagePer = lst.parallelStream().collect(Collectors.groupingBy(i -> i.engDepartment));
        var m = new HashMap<String, OptionalDouble>();
        for (String key : averagePer.keySet()) {
            m.put(key, this.getTotalPerInDep(averagePer.get(key)));
        }
        return m;
    }


    public Optional<Student> youngestMaleStudentInElecDep() {
        return lst.parallelStream().filter(i -> i.engDepartment.equals("Electronic") && i.gender.equals("Male")).collect(Collectors.minBy(Comparator.comparing(i -> i.age)));
    }


    public Map<String, Long> countMaleAndFemaleInCompSci() {
        return lst.parallelStream().filter(i -> i.engDepartment.equals("Computer Science")).collect(Collectors.groupingBy(i -> i.gender, Collectors.counting()));
    }

    public static void main(String[] args) {
        Assignment_12 assignment12 = new Assignment_12();
        assignment12.addStudent(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8);
        assignment12.addStudent(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2);
        assignment12.addStudent(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3);
        assignment12.addStudent(144, "Murali Gowda", 18, "Male", "Electrical", 2018, 80);
        assignment12.addStudent(155, "Nima Roy", 19, "Female", "Textile", 2016, 70);
        assignment12.addStudent(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70);
        assignment12.addStudent(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70);
        assignment12.addStudent(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80);
        assignment12.addStudent(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85);
        assignment12.addStudent(200, "Jaden Dough", 18, "Male", "Security", 2015, 82);
        assignment12.addStudent(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83);
        assignment12.addStudent(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4);
        assignment12.addStudent(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6);
        assignment12.addStudent(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8);
        assignment12.addStudent(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4);
        assignment12.addStudent(266, "Sanvi Pandey", 17, "Female", "Electric", 2019, 72.4);
        assignment12.addStudent(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5);
        assignment12.printAllDepartments();
        var names = assignment12.whoEnrolledAfter2018();
        for (var name : names) {
            System.out.println(name);
        }
        var students = assignment12.selectAllMaleComputerScience();
        for (var student : students) {
            System.out.println(student.name);
        }
        var result = assignment12.totalMaleAndFemaleStudents();
        for (String key : result.keySet()) {
            System.out.print(key + " ");
            System.out.println(result.get(key));
        }
        var averageAge = assignment12.averageAgeOfMaleAndFemale();
        for (String key : averageAge.keySet()) {
            System.out.print(key + " ");
            if (averageAge.get(key).isPresent())
                System.out.println(averageAge.get(key).getAsDouble());
        }

        var totalStudentsDepwise = assignment12.countNumOfStudentInEachDep();
        for (var key : totalStudentsDepwise.keySet()) {
            System.out.print(key + " ");
            System.out.println(totalStudentsDepwise.get(key));
        }
        var avgPerDepWise = assignment12.averagePerByDep();
        for (String key : avgPerDepWise.keySet()) {
            System.out.print(key + " ");
            if (avgPerDepWise.get(key).isPresent())
                System.out.println(avgPerDepWise.get(key).getAsDouble());
        }
        var student = assignment12.youngestMaleStudentInElecDep();
        student.ifPresent(value -> System.out.println(value.name));
        var res = assignment12.countMaleAndFemaleInCompSci();
        for (var key : res.keySet()) {
            System.out.print(key + " ");
            System.out.println(res.get(key));
        }
    }
}