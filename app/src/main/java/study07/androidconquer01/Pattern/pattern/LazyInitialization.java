package study07.androidconquer01.Pattern.pattern;

public class LazyInitialization {
	private static LazyInitialization instance;

	private LazyInitialization() {
	}

	public static LazyInitialization getInstance() {
		if (instance == null) {
			instance = new LazyInitialization();
			//new LazyInitialization(); 가 여기 선언되어 있는것에 주목해야 한다.
			//getInstance안에 메서드에서 사용되었다.if문을 통해 instance가 null인경우에
			//새로운 객체를 생성 할 수 있다.
			//최초 사용시점에만 인스턴스화 시키기때문에 프로그램이 메모리에 적재되는 시점에 부담이 많이 줄게 된다.
			//하지만 프로그램이 멀티스레드 방식이라면 이같은 singleton pattern은 안전하지 않다.
			//스레드가 동일시점에 getInstance() 메서드를 호출하면 인스턴스가 두번 생길 위험이있다.
		}
		return instance;
	}

	public void print(){
		System.out.println("instance  > : " +  instance.hashCode());
	}
}
