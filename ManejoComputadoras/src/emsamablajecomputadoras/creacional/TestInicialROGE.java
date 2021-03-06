package emsamablajecomputadoras.creacional;

public class TestInicialROGE extends TestRoge{

	public TestInicialROGE() {}	
	
	public TestInicialROGE(Computador computador) {
		this.computador = computador;
		sucesor = new TestMedioROGE(computador);
	}
	
	@Override
	protected void handle() {
		if(!computador.getMarca().equals("Asus")) {
			error();
			return;
		}
		if(!computador.getOs().getNombre().equals("Windows 10")) {
			error();
			return;
		}
		if(computador.getOs().getArquitectura()!=64) {
			error();
			return;
		}
		if(!computador.getOs().getVersion().equals("PRO")) {
			error();
			return;
		}
		sucesor.handle();
	}

}
