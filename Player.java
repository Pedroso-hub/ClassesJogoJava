public class Player{

	private int health;
	private String name;
	private int strength;
	
	public Player(int health, String name, int strength){
		this.health = health;
		this.name = name;
		this.strength = strength;
	}

	public void levarDano(int dano){
		
			if (this.health > dano){
				health = health - dano;
			}
			else{
				System.out.println("O jogador "+this.name+" morreu");
			}
	}
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
}
