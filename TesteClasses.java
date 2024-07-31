public class TesteClasses{
	public static void main (String args[]){
		Player p1 = new Player(10, "pedro", 10);
		Player p2 = p1;
		Player p3 = p2;
		p2 = new Player(20, "marcia", 20);
		p2.setName("rafael");
		p3 = p2;
		System.out.println(p3.getName());
		
		
		
		
		
		
	}
	
	
	
}