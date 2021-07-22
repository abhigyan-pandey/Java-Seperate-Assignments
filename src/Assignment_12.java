import java.util.stream.* ;
import java.util.* ;
import java.util.stream.Collectors;
class Student
{
    String id ;
    String name ;
    int age ;
    String gender ;
    String engineering_department ;
    int year_of_enrollment ;
    double current_percentage ;

    Student(String name , String id ,int age  , String gender , String engineering_department , int year_of_enrollment , double current_percentage )
    {
        this.name = name ;
        this.id = id ;
        this.age = age ;
        this.gender = gender ;
        this.engineering_department = engineering_department ;
        this.year_of_enrollment = year_of_enrollment ;
        this.current_percentage = current_percentage ;
    }
};

public class Assignment_12
{
    public static void main(String[] args)
    {
        List<Student> department = new ArrayList<Student>();

                department.add( new Student("111", "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8) );
                department.add( new Student("122", "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2) );
                department.add( new  Student("133", "Martin Theron", 17, "Male", "Electronic", 2017, 90.3)) ;
                department.add( new  Student("144", "Murali Gowda", 18, "Male", "Electrical", 2018, 80));
                department.add( new  Student("155", "Nima Roy", 19, "Female", "Textile", 2016, 70) );
                department.add( new  Student("166", "Iqbal Hussain", 18, "Male", "Security", 2016, 70)) ;
                department.add( new  Student("177", "Manu Sharma", 16, "Male", "Chemical", 2018, 70) );
                department.add( new  Student("188", "Wang Liu", 20, "Male", "Computer Science", 2015, 80));
                department.add( new  Student("199", "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85));
                department.add( new  Student("200", "Jaden Dough", 18, "Male", "Security", 2015, 82));
                department.add( new  Student("211", "Jasna Kaur", 20, "Female", "Electronic", 2019, 83));
                department.add( new  Student("222", "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4));
                department.add( new  Student("233", "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6));
                department.add( new  Student("244", "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8));
                department.add( new  Student("255", "Ali Baig", 17, "Male", "Electronic", 2018, 88.4));
                department.add( new  Student("266", "Sanvi Pandey", 17, "Female","Electric", 2019, 72.4));
                department.add( new  Student("277", "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5));

                List<String> depart = department.stream().map(a->a.engineering_department).collect(Collectors.toList()) ; //List containing all the departments
                List<Integer> students = department.stream().map(a->a.year_of_enrollment > 2018).collect(Collectors.toList()) ;


    }
}
