package emsamablajecomputadoras.creacional;

public class TestInicial extends Test{

	public TestInicial() {
		sucesor = new TestMedio();
	}

	@Override
	protected void handle(Computador computador) {
		if(computador.getMarca()!="Asus" ){
			error();
			return;
		}
		
	}
}
