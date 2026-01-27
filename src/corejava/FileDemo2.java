package corejava;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileDemo2 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		
		BufferedReader br = new BufferedReader(new FileReader("D:\\twomain.txt"));
		String line;
		Studentmain students[] = new Studentmain[4];
		int index=0;
		try {
			while ((line = br.readLine()) != null) {
				//System.out.println(line);
				String data[] = line.split(","); //{101,abc} //dat[0]=101 data[1]=abc
				Studentmain s1 = new Studentmain(Integer.parseInt(data[0]), data[1]);
				//System.out.println("Student id:" + data[0]);
				//System.out.println("Student name:" + data[1]);
				students[index++]=s1; 
			}
			
			for (Studentmain s : students) {
				System.out.println(s.id + " " + s.name);
			}
			br.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
