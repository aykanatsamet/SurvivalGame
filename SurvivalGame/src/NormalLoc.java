
public abstract class NormalLoc extends Location{

	public NormalLoc(Player player,String name) {
		super(player);
		this.name=name;
	}
	
	public boolean GetLocation() {
		return true;
	}
	

}
