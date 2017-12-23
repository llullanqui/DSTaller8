package emsamablajecomputadoras.creacional;

public class Main {

	public static void main(String[] args) {
		Builder b1 = new BuilderZenBook();
		b1.buildComputer();
		//System.out.println(b1.getComputador().getModelo());
		
		Builder b2 = new BuilderROGE();
		b2.buildComputer();
		//System.out.println(b2.getComputador().getModelo());
		
		Test test1 = new TestRoge(b2.getComputador());
		test1.handle();
		
		Test test2 = new TestZenbook(b1.getComputador());
		test2.handle();
		
		//Decorator de = new ZenbookGamer(b1.getComputador());
		//System.out.println(de.especificacionesTecnicas());
	}

}
