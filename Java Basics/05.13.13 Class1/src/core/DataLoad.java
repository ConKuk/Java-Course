package core;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataLoad {

	public static void main(String[] args) {

		try (DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("test.dat")))){
			
	
			System.out.println(in.readUTF());
			System.out.println(in.readInt());
			System.out.println(in.readBoolean());
			System.out.println(in.readFloat());
			
			
		}catch (IOException e){
			e.printStackTrace();
		}
	}

}
