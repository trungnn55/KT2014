
public class nextDay {
	protected int day;
	protected int month;
	protected int year;
	
	public nextDay(int isDay, int isMonth, int isYear){
		this.day = isDay;
		this.month = isMonth;
		this.year = isYear;
	}
	
	public boolean namNhuan(){
		if ( year % 4 == 0 && year % 100 != 0)
			return true;
		return false;
	}
		
	public boolean checkDay(){
		if(day <=0 || month <= 0 || year <= 0)
			return false;
		if(day > 31)
			return false;
		if(month == 4 || month == 6 || month == 9 || month == 11)
			if(day > 30)
				return false;
		if(month == 2){
			if(namNhuan()== false)
				if(day > 28)
					return false;
			else if (namNhuan() == true)
				if(day > 29)
					return false;
		}
		return true;
	}
	
	public void date(){
		if (checkDay() == false){
			System.out.println("Nhap sai ngay!");
			return;
		}
		
		if(checkDay() == true){
			if(month == 2){
				if(day < 28)
					day++;
				if(day == 28){
					if(namNhuan() == false){
						day = 1;
						month++;}
					else{
						day++;
						//month++;
					}
				}
			}
			else if (month == 4 || month == 6 || month == 9 || month == 11){
				if(day < 30)
					day++;
				else if(day == 30){
					day = 1;
					month++;
				}
			}
			else{
				if(day < 31)
					day++;
				else if(day == 31){
					if(month == 12){
						day = 1;
						month = 1;
						year++;
					}
					else{
						day = 1;
						month++;
					}
				}
			} 
				
		}
		System.out.println(day + "-" + month + "-" + year);
	}
	
	public static void main(String[] args){
		nextDay d = new nextDay(28,2,2000);
		d.date();
	}
}
