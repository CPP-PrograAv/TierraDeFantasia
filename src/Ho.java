
public class Ho extends Personaje{

	boolean piedra = false;
	public Ho(Punto2D punto) {
		super(210, 97, 1, 4, punto);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void atacar(Personaje otro) {
		// TODO Auto-generated method stub
		if(this.getSalud()<=0 ||  !this.estaEnRango(otro))
			return;
		//VERIFICAR DESCANSO
		
		
		//dañoinfrigido 
		otro.setSalud(otro.getSalud() - this.getDaño());
		
		//efecto 
		this.setSalud((int) (otro.getSalud()* 0.02) + this.getSalud());
		
	}

	@Override
	public void recibirAtaque(Personaje otro) {
		
		
		if(this.getSalud()<=0 ||  !this.estaEnRango(otro))
			return;
		
		//saludfinal 
		this.setSalud(otro.getDaño() - this.getSalud());
		//efecto
		this.setSalud((int) (210 * 0.02) + this.getSalud());
		
	}

	@Override
	public void descansar() {
		
		this.piedra=!this.piedra;
		
		