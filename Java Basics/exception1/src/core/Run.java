package core;

public class Run {

	public static void main(String []args){

		try {
			go1();
		} catch (ClientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void go1() throws ClientException  {

		try {
			go2();
		} catch (TestException e) {
			System.out.println("There was an exception!");
			throw new ClientException("client");
		}
	}

	public static void go2() throws TestException {

		go3();
	}

	public static void go3() throws TestException {
		throw new TestException("test");

	}
}
