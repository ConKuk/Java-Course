package core;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStore {


	public static void main(String[] args) {

		String s = "hello";
		int i = 1587;
		boolean b = true;
		float f = 56.87f;
		
		try ( DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("test.dat"))) ) {
			out.writeUTF(s);
			out.writeInt(i);
			out.writeBoolean(b);
			out.writeFloat(f);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
