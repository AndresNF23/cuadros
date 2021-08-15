import java.util.ArrayList;

import processing.core.PApplet;

public class Main extends PApplet{
	
	
	public static void main(String[] args) {
		PApplet.main("Main");
	}
	
public void settings() {
	
size(700, 500);
	
}

ArrayList<Cuadrados> lista;

public void setup() {
	strokeWeight(0);
	fill(200,0,0);
lista = new ArrayList<Cuadrados>();

frameRate(60);

}

public void draw() {
	background(255);
	
	if(frameCount%60==0){
		lista.add(new Cuadrados());
	}
	for (int i = 0; i < lista.size(); i++) {
		lista.get(i).pintar(this);
		}


		
}

@Override
public void mousePressed() {
	for (int i = 0; i < lista.size(); i++) {
		if(mouseX>(lista.get(i).getPosx()-(lista.get(i).getTamaño()/2)) 
				&&mouseX<(lista.get(i).getPosx()+(lista.get(i).getTamaño()/2))
				&&mouseY>(lista.get(i).getPosy()-(lista.get(i).getTamaño()/2)) 
				&&mouseY<(lista.get(i).getPosy()+(lista.get(i).getTamaño()/2))) {
			lista.get(i).setMovimiento(!lista.get(i).getMovimiento());
		}
	}
		
	
}

public void borrar(int i){
	
		if(lista.get(i).getPosy()<(lista.get(i).getTamaño()/2)+500){
			lista.remove(i);
}
}
}