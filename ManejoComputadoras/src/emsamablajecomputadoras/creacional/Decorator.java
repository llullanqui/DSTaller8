package emsamablajecomputadoras.creacional;

public abstract class Decorator implements IComputador{
	
	protected IComputador computador;
	
	public Decorator(IComputador computador) {
		this.computador = computador;
	}
	
	public abstract String especificacionesTecnicas();
	
}
