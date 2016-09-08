package study07.androidconquer01.Pattern.pattern;

public class ThreadSafeInitalization {
	// LazyInitialization 에서 멀티스레드에서 발생할 위험이 있는 문제를 해결하기 위해
	// synchronized(동기화)를 사용하여 singleton pattern을 구현한다.

	// 여러 스레드들이 동시에 접근해서 인스턴스를 생성시키는 위험은 없어지지만
	// 많은 스레드들이 getInstance() method를 호출하게 되면 높은 비용으로 프로그램 전반에 성능저하가 발생한다.

	private static ThreadSafeInitalization instance;

	public static synchronized ThreadSafeInitalization getInstance() {
		if (instance == null) {
			instance = new ThreadSafeInitalization();
		}
		return instance;
	}
	public void print (){
		System.out.println("intstance > : " + instance.hashCode());
	}
}
