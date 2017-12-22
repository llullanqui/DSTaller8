package emsamablajecomputadoras.creacional;

public abstract class Test {
	
	protected Test sucesor;
	
	public Test() {
	}
	
	protected void error() {
		System.out.println("Hubo un error");
	}
	
	protected abstract void handle(Computador computador);
	
}
