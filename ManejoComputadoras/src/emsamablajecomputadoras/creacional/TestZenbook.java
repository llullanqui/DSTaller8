package emsamablajecomputadoras.creacional;

public class TestZenbook extends Test{

	public TestZenbook() {}
	
	public TestZenbook(Computador computador) {
		super(computador);
		sucesor = new TestInicialZenbook(computador);
	}

	@Override
	protected void handle() {
		sucesor.handle();
	}
	
	

}
