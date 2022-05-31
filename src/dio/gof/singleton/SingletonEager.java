package dio.gof.singleton;

/*
 * Singleton "pregui�oso"
 *  @author mahfer18
 */

public class SingletonEager {
	private static SingletonEager instancia = new SingletonEager();
	
	private SingletonEager() {
		super();
	}
	public static SingletonEager getInstancia() {
		return instancia;
		
	}

}
