package emsamablajecomputadoras.creacional;

public class TestInicialZenbook extends TestZenbook{
	
	public TestInicialZenbook(Computador computador) {
		this.computador = computador;
		sucesor = new TestMedioZenbook(computador);
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
		if(!computador.getOs().getVersion().equals("Home")) {
			error();
			return;
		}
		sucesor.handle();
	}

}
