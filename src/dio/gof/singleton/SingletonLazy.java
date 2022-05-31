package dio.gof.singleton;

/*
 * Singleton "pregui�oso"
 *  @author mahfer18
 */
public class SingletonLazy {
	
	private static SingletonLazy instancia;
	
	private SingletonLazy() {
		super();
	}
	public static SingletonLazy getInstancia() {
		if (instancia == null) {
			instancia = new SingletonLazy();
		}
		return instancia;
		
	}

}
