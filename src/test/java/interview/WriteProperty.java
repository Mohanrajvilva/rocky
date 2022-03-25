package interview;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteProperty {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fs=new FileInputStream("./Data.properties");
		Properties p=new Properties();
		p.load(fs);
		p.setProperty("browser","chrome");
		FileOutputStream gs=new FileOutputStream("./Data.properties");
		p.store(gs, null);
		

	}

}
