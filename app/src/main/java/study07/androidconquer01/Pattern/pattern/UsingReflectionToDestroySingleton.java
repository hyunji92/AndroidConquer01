package study07.androidconquer01.Pattern.pattern;

import java.lang.reflect.Constructor;

public class UsingReflectionToDestroySingleton {
	public static void main(String[] args) {
		EagerInitialization instance = EagerInitialization.getInstatnce();
		EagerInitialization instance2 = null;

		try {
			/**
			 * Constructor provides information about, and access to, a single
			 * constructor for a class. Constructor permits widening conversions
			 * to occur when matching the actual parameters to newInstance()
			 * with the underlying constructor's formal parameters, but throws
			 * an IllegalArgumentException if a narrowing conversion would
			 * occur.
			 * 
			 * Type Parameters: <T> the class in which the constructor is
			 * declared Author: Kenneth Russell Nakul Saraiya
			 */
			Constructor[] constructors = EagerInitialization.class.getDeclaredConstructors();
			for(Constructor constructor : constructors){
				constructor.setAccessible(true);
				instance2 = (EagerInitialization)constructor.newInstance();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println(instance.hashCode());
		System.out.println(instance2.hashCode());
		//위 두라인에서 실행되어 보여지는 hashCode값은 다르다.
		//java의 reflection은 매우 강력한데 - 설령 class의 생성자가 private일지라도 강제로 가져와서 인스턴스 생성이 가능하다.
		//singleton pattern을 깨뜨리는 것이다.
		//이외에도 reflaction을 여러곳에서 사용할 수 있으니 알아두는거이 좋다.
	}

}
