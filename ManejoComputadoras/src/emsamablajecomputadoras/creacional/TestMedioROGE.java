package emsamablajecomputadoras.creacional;

public class TestMedioROGE extends TestRoge{

	public TestMedioROGE(Computador computador) {
		super(computador);
		sucesor = new TestCompletoROGE(computador);
	}
	
	@Override
	protected void handle() {
		// TODO Auto-generated method stub
		
	}

}
