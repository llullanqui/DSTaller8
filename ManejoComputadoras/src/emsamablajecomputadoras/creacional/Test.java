package emsamablajecomputadoras.creacional;

public abstract class Test {
	
	protected Test sucesor;
	protected Computador computador;
	
	public Test() {}
	
	public Test(Computador computador) {
		this.computador = computador;
	}
	
	protected void error() {
		System.out.println("Hay un error en la arquitectura del computador.\n");
	}
	
	protected void satisfactorio() {
		System.out.println("El computador se encuentra correctamente.\n");
	}
	
	protected abstract void handle();
	
	
	
}
