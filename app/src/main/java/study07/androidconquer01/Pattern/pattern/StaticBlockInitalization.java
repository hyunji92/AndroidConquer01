package study07.androidconquer01.Pattern.pattern;


public class StaticBlockInitalization {
	private static StaticBlockInitalization instance;
	private StaticBlockInitalization (){}
	
	//static초기화블럭 - static초기화블럭을 이용하면 클래스가 로딩 될 때 최초 한번 실행하게 된다.
	//초기화 블럭을 이용하면 logic을 담을 수 있기 때문에 
	//복잡한 초기 변수 셋팅이나 아래처럼 에러처리 구문을 담을 수 있다.
	static{
		try {
			System.out.println("instance create");
			instance = new StaticBlockInitalization();
		} catch (Exception e) {
			throw new RuntimeException("Error");
		}
	}
	
	public static StaticBlockInitalization getInstance(){
		return instance;
	}
	
	public void print(){
		System.out.println("instance > : " + instance.hashCode() );
	}
}
