package core;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

public class LoadPeople {

	public static void main(String[] args) {

		System.out.println(" -=Begining of file=- \n");

		try (DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("oldpeople.dat")))){

			while ( true){
				System.out.println( in.readUTF());
			}
		} catch (EOFException e) {
			System.out.println("\n -=End of file=- ");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
