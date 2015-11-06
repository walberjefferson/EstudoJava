package Cap03;

public class TestFor {

	public static void main(String[] args) {
		/*for(int i = 1; i <= 10; i++){
			System.out.println(i + " - Olá!");
		}*/
		
		for(int i = 0; i < 100; i++){
			if(i > 50  && i < 60){
				continue;
			}
			System.out.println(i);
		}
	}

}
