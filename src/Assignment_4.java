//  author : Abhigyan_Pandey
//  Zemoso Java Asssignment

import java.text.ParseException;
import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;
public class Assignment_4
{
    Date signUpDate, currentDate;
    String stringStartDate, stringEndDate;
    Date startDate, endDate;
    public void rangeKyc(String inputSignUpDate, String inputCurrentDate) throws ParseException {

            SimpleDateFormat dateFormatter = new SimpleDateFormat("dd-MM-yyyy");
            signUpDate = dateFormatter.parse(inputSignUpDate);
            currentDate= dateFormatter.parse(inputCurrentDate);
            if(signUpDate.after(currentDate))
            {
                System.out.println("No range");         // No range if signupDate is after currentDate
            }
            else {
                startDate = signUpDate;
                //setting sign up year to start date
                startDate.setYear(currentDate.getYear());
                //creating calendar object
                Calendar calendar = Calendar.getInstance();

                calendar.setTime(startDate);

                calendar.add(Calendar.DATE, -30);
                startDate=calendar.getTime();

                calendar.add(Calendar.DATE, 60);     //adding 60 days to the calender date
                endDate=calendar.getTime();
                //verify the end date if end date passes the current date than set as current date
                if(endDate.after(currentDate)) {
                    endDate=currentDate;
                }
            }
            stringStartDate=dateFormatter.format(startDate);
            stringEndDate=dateFormatter.format(endDate);

            System.out.print(stringStartDate);
            System.out.print("	");
            System.out.println(stringEndDate);

    }

    public static void main(String[] args) throws ParseException {

        Assignment_4 obj =new Assignment_4();

        obj.rangeKyc("16-07-1998", "27-06-2017");
        obj.rangeKyc("04-02-2016", "04-04-2017");
        obj.rangeKyc("04-05-2017", "04-04-2017");
        obj.rangeKyc("04-04-2015", "04-04-2016");
        obj.rangeKyc("04-04-2015", "15-03-2016");
    }

}
