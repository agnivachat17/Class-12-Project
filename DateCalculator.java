import java.util.Scanner;
public class DateCalculator
{
    public static boolean isLeapYear(int y) {        
        if (y % 400 == 0) 
            return true; 
        else if (y % 100 == 0) 
            return false;
        else if (y % 4 == 0) 
            return true;
        else 
            return false;        
    }
    public static String calcDate(int day, int year) {
        int monthDays[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String monthNames[] = {"JANUARY", "FEBRUARY", "MARCH", 
                                "APRIL", "MAY", "JUNE", 
                                "JULY", "AUGUST", "SEPTEMBER", 
                                "OCTOBER", "NOVEMBER", "DECEMBER"};                                
        if (isLeapYear(year)==true)
            monthDays[1] = 29;      
        int i = 0;
        int daySum = 0;
        for (i = 0; i < monthDays.length; i++) {
            daySum += monthDays[i];
            if (daySum >= day) 
                break;
        }             
        int date = day + monthDays[i] - daySum;     
        StringBuffer obj = new StringBuffer();
        obj.append(date);
        if(date==11||date==12||date==13)
            obj.append("TH ");
        else if(date%10==1)
            obj.append("ST ");
        else if(date%10==2)
            obj.append("ND ");     
        else if(date%10==3)
            obj.append("RD ");
        else
            obj.append("TH " );
        obj.append(monthNames[i]);
        obj.append(", ");
        obj.append(year);        
        return obj.toString();
    }    
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("DAY NUMBER: ");
        int dayNum = in.nextInt();
        System.out.print("YEAR: ");
        int year = in.nextInt();
        System.out.print("DATE AFTER (N DAYS): ");
        int n = in.nextInt();        
        if (dayNum < 1 || dayNum > 366) {
            System.out.println("INVALID DAY NUMBER");
            return;
        }         
        if (n < 1 || n > 100) {
            System.out.println("INVALID DATE AFTER (N DAYS)");
            return;
        }        
        int nDays = dayNum + n;
        int nYear = year;
        boolean leap = isLeapYear(year);        
        if (leap && nDays > 366) {
            nYear = nYear + 1;
            nDays = nDays - 366;
        }
        else if (nDays > 365) {
            nYear = nYear + 1;
            nDays = nDays - 365;
        }       
        System.out.println();
        System.out.println("DATE: " + calcDate(dayNum, year));
        System.out.println("DATE AFTER " + n + " DAYS: " + calcDate(nDays, nYear));
    }
}