import processing.core.PApplet;

public class Cuadrados {

private int tamaño;

private boolean movimiento;

private int posx;

private int posy;

public Cuadrados() { /*metodos*/ /*constructor*/
	
	tamaño = (int) ((int) 50 + (Math.random () * 100));
	
	posx = 	(int) ((int) 100 + (Math.random () * 600));
	
	posy = -100;
	
	movimiento = true;
	
			
}

public void pintar (PApplet app) { /*meotodos*/
	
	app.rect(posx, posy, tamaño, tamaño);/*meotodo app*/
	
	if (movimiento==true) {	
		posy+=5;
	}
	else {
		posy=posy;
	}
		
}
public int getPosx() {
	return posx;
	
}
public int getPosy() {
	return posy;
}
public boolean getMovimiento() {
	return movimiento;
	
}
public int getTamaño() {
	return tamaño;
	
}
public void setMovimiento(boolean movimiento) {
	this.movimiento = movimiento;
	
}
}