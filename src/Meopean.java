
public class Meopean  extends Personaje{
	private int ataquesRecibidos;
	
	public Meopean(int ataquesrecibidos) {
		super(123,85,0,2,new Punto2D(0, 0));
		this.ataquesRecibidos = ataquesrecibidos;
	}

	@Override
	public void atacar(Personaje otro) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void recibirAtaque(int daño) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void descansar() {
		if(super.getSalud()>0){
			super.setDaño(85);
		}
		
	}
}
