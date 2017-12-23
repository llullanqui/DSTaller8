package emsamablajecomputadoras.creacional;

public abstract class Test {
	
	protected Test sucesor;
	protected Computador computador;
	
	public Test(Computador computador) {
		this.computador = computador;
	}
	
	protected void error() {
		System.out.println("Hubo un error");
	}
	
	protected abstract void handle();
	
}
