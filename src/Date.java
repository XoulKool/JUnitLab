
public class Date {
    private int year, month, day;
    
    public Date(int y, int m, int d){
        year = y;
        month = m;
        day = d;
    }
    
    int daysTo(Date d){
        int numDays = 0;
        numDays = (Math.abs(this.year - d.year) * 365) + 
                (Math.abs(this.month - d.month) * 30) +
                (Math.abs(this.day - d.day));
        return numDays;
    }
}


