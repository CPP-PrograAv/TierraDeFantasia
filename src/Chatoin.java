
public class Chatoin extends Personaje {
	private int ataquesRecibidos;
	
	public Chatoin(Punto2D punto) {
		super(292, 116, 10, 37, punto);
		ataquesRecibidos = 0;
		
	}
	public Chatoin() {
		super(292, 116, 10, 37, new Punto2D(0,0));
		ataquesRecibidos = 0;
		
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
			super.setDaño((int)(super.getDaño()-Math.pow(2, ataquesRecibidos)));
			super.setSalud(super.getSalud()-daño*4);
		}
	}

	@Override
	public void descansar() {
		if(super.getSalud()>0){
			super.setSalud(292);
		}
		
	}

}
