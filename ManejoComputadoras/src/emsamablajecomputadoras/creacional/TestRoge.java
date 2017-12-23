package emsamablajecomputadoras.creacional;

public class TestRoge extends Test{

	public TestRoge(Computador computador) {
		super(computador);
		sucesor = new TestInicialROGE(computador);
	}
	
	protected void handle() {
		sucesor.handle();
	}

}
