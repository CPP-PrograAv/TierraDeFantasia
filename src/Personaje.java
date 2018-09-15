public  abstract class Personaje{
	private Punto2D punto;
	private int  salud;
	private int daño;
	private double rangoMin;
	private double rangoMax;
	
	public Personaje(int salud, int daño, double rangoMin, double rangoMax,Punto2D punto) {
		this.punto = punto;
		this.salud = salud;
		this.daño = daño;
		this.rangoMin = rangoMin;
		this.rangoMax = rangoMax;
	}
	
	public abstract void atacar(Personaje otro);
	public abstract void recibirAtaque(int daño);
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

	public int getDaño() {
		return daño;
	}

	public void setDaño(int daño) {
		this.daño = daño;
	}
	
	
	
}
