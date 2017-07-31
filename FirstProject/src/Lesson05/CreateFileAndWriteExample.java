package Lesson05;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class CreateFileAndWriteExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			File file = new File("fileName.txt");
			if(!file.exists()) {
				file.createNewFile();
			}
			
			PrintWriter pw = new PrintWriter(file);
			pw.println("This is my file content");
			pw.println(494949449);
			pw.close();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
