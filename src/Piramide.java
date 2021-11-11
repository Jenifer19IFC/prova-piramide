
public class Piramide {

	private double h;
	private double ab;
	private int tipo;
	
	public Piramide(double h, double ab, int tipo) {
		setH(h);
		setAb(ab);
		setTipo(tipo);
	}
	
	public Piramide() {
	}
	
	public double getH() {
		return h;
	}
	public void setH(double h) {
		if(h > 0)
			this.h = h;
	}
	
	public double getAb() {
		return ab;
	}
	public void setAb(double ab) {
		if (ab > 0)
			this.ab = ab;
	}
	
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		if(tipo > 0 && tipo <= 3)
			this.tipo = tipo;
	}
	
	public double al () {
		double al1 = (ab * ab) + (h * h);
		return  (double) (Math.sqrt(al1));
	}

	public double areaTriangulo() {
		return ab * al();
	}
	
	public double areaBase() {
		return (ab * ab) * 4;
	}
	
	public double areaTotal() {
		return areaTriangulo()* 4 + areaBase();
	}
	
	public double litros() {
		return (areaTotal()/4.76);
	}
	
	public int lata() {
		return (int) Math.ceil((litros()/18));
	}
	
	public double valorlata() {
		if(tipo == 1)
			return 127.90;
		else if(tipo == 2 ) 
			return 258.98;
		else
			return 344.34;
	}
	
	public double total() {
		return (lata()*valorlata());
	}

	public double volume() {
		return (((ab * ab) * h)/3) * 4;
	}

	@Override
	public String toString() {
		return "Piramide [h=" + h + ", ab=" + ab + ", tipo=" + tipo + "]";
	}
	

	
	
	
	

	
	
}
