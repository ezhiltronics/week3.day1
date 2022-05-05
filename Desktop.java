package week3.day1.org.system;

import org.junit.runner.Computer;

public class Desktop extends Computer {
	
	public void desktopSize()
	{
		System.out.println("The desktop size is 22 inches");
	}
	public static void main(String[] args) {
	
		Desktop com = new Desktop();
		com.ComputerModel();
		com.desktopSize();
	}
	private void ComputerModel() {
		
	}

}
