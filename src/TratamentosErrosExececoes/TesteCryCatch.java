package TratamentosErrosExececoes;

public class TesteCryCatch {

	public static void main(String[] args) {

		int v1 = 1, v2 = 0, res = 0;
		char lista[] = { 1, 2, 3 };

		for (int i = 0; i < lista.length; i++) {
			try {
				if (i == 0)
					res = v1 / v2;
				else
					lista[3] = 4;
			} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
				System.out.println("Exceção: " + e);
			}
			System.out.println("i =" + i);
			System.out.println("res = " + res);
		}

		try {
			System.out.println(10/0);
		} catch (Exception e) {
			System.out.println(2);
		} finally {
			System.out.println(3);
		}

	}

}
