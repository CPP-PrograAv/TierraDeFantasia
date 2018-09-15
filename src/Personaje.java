public  abstract class Personaje{
	private Punto2D punto;
	private int  salud;
	private int da�o;
	private double rangoMin;
	private double rangoMax;
	
	public Personaje(int salud, int da�o, double rangoMin, double rangoMax,Punto2D punto) {
		this.punto = punto;
		this.salud = salud;
		this.da�o = da�o;
		this.rangoMin = rangoMin;
		this.rangoMax = rangoMax;
	}
	
	public abstract void atacar(Personaje otro);
	public abstract void recibirAtaque(int da�o);
	public abstract void descansar();
	
	public boolean estaEnRango(Personaje otro){
		double dist = this.punto.distancia(otro.getPosicion()) ;
		
		return dist >= rangoMin && dist <= rangoMax ;
 		
	}
	
	public Punto2D getPosicion(){
		return this.punto;
	}

	public int getSalud() {
		return salud;
	}

	public void setSalud(int salud) {
		this.salud = salud;
	}

	public int getDa�o() {
		return da�o;
	}

	public void setDa�o(int da�o) {
		this.da�o = da�o;
	}
	
	
	
}
