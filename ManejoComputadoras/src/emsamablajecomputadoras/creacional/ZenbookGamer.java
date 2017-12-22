package emsamablajecomputadoras.creacional;

public class ZenbookGamer extends Decorator{

	public ZenbookGamer(IComputador computador) {
		super(computador);
	}

	@Override
	public String especificacionesTecnicas() {
		return computador.especificacionesTecnicas()
				+"Memoria adicional: "+16+"\n" ;
	}
	
}
