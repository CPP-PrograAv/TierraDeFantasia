
public class Chibanian extends Personaje {
	
	private int ataquesRecibidos;
	
	public Chibanian() {
		super(198,6,0,0.42,new Punto2D(0,0));
		ataquesRecibidos=0;
	}

	@Override
	public void atacar(Personaje otro) {
		
		 if(super.estaEnRango(otro) &&  super.getSalud()>0){
			otro.recibirAtaque(super.getDaño());
		 }
	}

	@Override
	public void recibirAtaque(int daño) {
		if(super.getSalud()>0){
			ataquesRecibidos++;
			
			if(ataquesRecibidos==35){
				super.setSalud(0);
			}
		}
		
	}

	@Override
	public void descansar() {
		if(getSalud()>0){
			super.setSalud(198);
		}
		
	}
}
