package Exception;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileException {
	public static void main(String[] args) throws IOException {
		
		try {
			File file=new File("C:\\SANTHI\\asha.txt");
			FileReader f=new FileReader(file);
			int temp=0;
			while((temp=f.read())!=-1) {
				System.out.println((char)(temp));
			}
		}
		catch (FileNotFoundException fe) {
			System.out.println(fe+"The file loaction is not found");
			fe.printStackTrace();
		}

			
		
	
	}
}


