package study07.androidconquer01.Pattern.pattern;

public class EagerInitialization {
	// priavat static으로 선언, 전역 변수로 instance를 만드데 private static 을 이용한다.
	// static이 붙은 클래스 변수는 인스턴스화에 상관없이 사용이 가능해 진다. 하지만 @!!
	// private 접근제어자로 인해서 EagerInitialization.instance형식 코드로의 접근은 불가능하다.
	private static EagerInitialization instance = new EagerInitialization();

	// 생성자
	// EagerInitalization클해스의 인스턴스를 가질 수 있는 방법은 getInstance()메소드를 사용하는 것이다.
	private EagerInitialization() {
		System.out.println("call EagerInitialization");
	}

	// 조회 method
	public static EagerInitialization getInstatnce() {
		return instance;
	}

	public void print() {
		System.out.println("instance hashCode > " + instance.hashCode());
	}
	/**
	 * singleton 이란?
	 * 
	 * 프로그래밍 세계에 OOP 의 개념이 생기면서 객체 자체에 대한 많은 연구와 패턴(pattern)들이 생겨났다. singleton
	 * pattern은 인스턴스가 사용될 때에 똑같은 인스턴스를 만들어 내는 것이 아니라, 동일 인스턴스를 사용하게끔 하는 것이 기본
	 * 전략이다. 프로그램상에서 동일한 커넥션 객체를 만든다던지, 하나만 사용되야하는 객체를 만들때 매우 유용하다. singleton
	 * pattern은 4대 디자인 패턴에 들어갈 정도로 흔히 쓰이는 패턴이다. 물론 core java(java.lang.Runtime,
	 * java.awt.Desktop 등등)에서도 singleton pattern이 사용된다.
	 */
}
