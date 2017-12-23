package emsamablajecomputadoras.creacional;

public class TestMedioROGE extends TestRoge{

	public TestMedioROGE() {}
	
	public TestMedioROGE(Computador computador) {
		this.computador = computador;
		sucesor = new TestCompletoROGE(computador);
	}
	
	@Override
	protected void handle() {
		if(computador.getModelo()!="ROGE") {
			error();
			return;
		}
		if(computador.getAlmacenamiento()!=1000) {
			error();
			return;
		}
		sucesor.handle();
	}

}
