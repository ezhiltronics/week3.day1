package week3.day1;

public class Students {
	
	
		public void studentInfo(int id) {

			System.out.println("The id is " + id);
		}

	
		public void studentinfo(int id, String name) {

			System.out.println("The id and Name is " + id + " and " + name);

		}

	
		public void studentInfo(String emailid, long phoneNumber) {
			System.out.println("The emailid and PhoneNumber is " + emailid + " and " + phoneNumber);
		}

		public static void main(String[] args) {
			
			Students s =new Students();
			s.studentInfo(3);
			s.studentinfo(3, "Ezhil");
			s.studentInfo("ezhiltronics@gmail.com", 9486197755L);
		}


}
