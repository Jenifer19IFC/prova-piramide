
public class PiramideMain {

	public static void main(String[] args) {
		
		Piramide p = new Piramide(41.87, 13.89, 3);
		System.out.println("Área lateral = " + p.al());
		System.out.println("Área Triângulo = " + p.areaTriangulo());
		System.out.println("Área Base = " + p.areaBase());
		System.out.println("Área Total = " + p.areaTotal());
		System.out.println("Tipo de tinta = " + p.getTipo());
		System.out.println("Litros = " + p.litros());
		System.out.println("Latas = " + p.lata());
		System.out.println("Preço = " + p.total());
		System.out.println("Volume = " + p.volume());
		System.out.println(p);
	}

}
