package study07.androidconquer01.Pattern.pattern;

public enum EnumInitialization {
	INSTANCE;
	static String test = "";
	public static EnumInitialization getInstance(){
		test = "test";
		return INSTANCE;
	}

}
//enum 이 singleton pattern으로 사용될 수 있는 이유는 
//1.INSTANCE가 생성될 때, multi thread로 부터 안전하다.
//(추가된 메서드들은 safe하지 않을 수 있다.)
//2.단 한번의 인스턴스 생성을 보장한다.
//3.사용이 간편하고, enum value는 자바프로그램 전역에서 접근이 가능하다.
