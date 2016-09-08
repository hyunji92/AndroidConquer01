package study07.androidconquer01.Pattern.main;

public class ProductFactory {
	public static Product getProduct(String type, String name, int price) {
		if ("ticket".equals(type)) {
			return new Ticket(name, price);
		} else if ("computer".equals(type)) {
			return new Computer(name, price);
		}
		return null;
		// factory class를 static 으로 선언 함으로서 싱글턴을 유지할 수 있다.
		// input 파라미터에의해 sub class가 생성되어 리턴된다.
	}

	public static void main(String[] args) {
		Product p1 = ProductFactory.getProduct("ticket", "wjdguswl", 200000);
		Product p2 = ProductFactory.getProduct("computer", "chlgusanr", 190000);

		System.out.println("test :  " + p1.toString());
		System.out.println("test :  " + p2.toString());
		// Factory pattern은 구현체 보다는 인터페이스 코드 접근에 좀더 용의하게 해준다.
		// Factory pattern 은 클라이언트 클래스로부터 인스턴스를 구현하는 코드를떼어내서 코드를 더욱탄탄하게 하고 결합도를 낮춘다
		// Factory pattern 은 구현과 클라이언트 클래서들의 상속을 통해 추상적인 개념을 제공한다.
		
	}

}
