
public class Shoix extends Personaje {
	
	private int contAtaques=0;
	
	public Shoix( Punto2D punto) {
		super(229, 90, 6, 32, punto);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void atacar(Personaje otro) {
		if(this.getSalud()<=0 ||  !this.estaEnRango(otro))
			return;
		
		if(this.contAtaques % 5 == 0)
			otro.setSalud((this.getDaño()*3 - otro.getSalud()));
		else
			otro.setSalud(this.getDaño() - otro.getSalud());
				
	}

	@Override
	public void recibirAtaque(Personaje otro) {
		
		if(this.getSalud()<=0 ||  !this.estaEnRango(otro))
			return;
		
		this.setDaño(this.getDaño()+3);
		
	}

	@Override
	public void descansar() {
		
		
		
	}

}
