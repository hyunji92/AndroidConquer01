package study07.androidconquer01.Pattern.pattern;

public class InitializationOnDemandHolderIdiom {
	//기존 java single pattern이 가지고있는 문제들을 해결 하기위해 제시한 새로운 singleton pattern
	//Initialization on demand holder idiom 기법>?????
	//jvm 의 class loader의 매커니즘과 class의 load시점을 이용하여 
	//내부 class를 생성시킴으로서 thread간의 동기화 문제를 해결한다,
	private InitializationOnDemandHolderIdiom(){}
	
	private static class Singleton{
		private static final InitializationOnDemandHolderIdiom instance = new InitializationOnDemandHolderIdiom();
	}
	
	public static InitializationOnDemandHolderIdiom getInstance(){
		System.out.println("create instance");
		return Singleton.instance;
	}
	//initalization on demand holder idiom 역시 LazyInitialization이 가능하며 java버전과 ,jvm에서 사용이 가능하다,
	//현재 java singleton을 생성 시킨다고 하면 거의 위의 방법으로 사용되는 것이다.

}
