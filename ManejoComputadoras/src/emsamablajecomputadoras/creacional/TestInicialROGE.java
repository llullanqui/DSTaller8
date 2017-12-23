package emsamablajecomputadoras.creacional;

public class TestInicialROGE extends TestRoge{

	public TestInicialROGE(Computador computador) {
		super(computador);
		sucesor = new TestMedioROGE(computador);
	}
	
	@Override
	protected void handle() {
		// TODO Auto-generated method stub
		
	}

}
