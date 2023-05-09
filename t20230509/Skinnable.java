package t20230509;

public interface Skinnable {
	int BLACK = 0;
	int RED = 1;
	int GREEN = 2;
	int BLUE =3;
	int YELLOW =4;
	void changeSkin(int skin);
}

class SkinnableSoftware implements Skinnable {
	int skin;
	
	public SkinnableSoftware() {this.skin=BLACK;}
	public SkinnableSoftware(int skin) {this.skin = skin;}
	
	public void changeSkin(int skin) {this.skin = skin;}
	public int getSkin() {return skin;}
	public String getSkinString() {
		switch(skin) {
		case BLACK: return "BLACK";
		case RED: return "RED";
		case GREEN: return "GREEN";
		case BLUE: return "BLUE";
		case YELLOW: return "YELLOW";
		}
		return "";
	}
}
