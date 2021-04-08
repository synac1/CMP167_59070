/**
 * 
 * @author yanil_jjrab3j
 *
 */
public class Bird {
	//Attributes
	private String species;
	private boolean canFly;
	private static int numberOfBirds;
	private int birdID; 
	//private double weight;
	
	public Bird(String species, boolean canFly ) { //Constructor
		this.species = species;
		this.canFly = canFly;
		this.birdID = ++numberOfBirds;
	}
	
	public int getBirdID() {
		return birdID;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public boolean isCanFly() {
		return canFly;
	}
	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}
	
	@Override
	public boolean equals(Object obj) {
		if( this == obj )
			return true;
		if ( obj  instanceof Bird) {
			Bird otherBird = (Bird) obj;
			if(this.species.equals(otherBird.species) && this.isCanFly() == otherBird.isCanFly() && this.getBirdID() == otherBird.getBirdID()) {
				return true;
			}
		}
		
		return false;
		
	}
	@Override
	public String toString() {
		
		return "Bird: \nid:"+getBirdID()+" \ntype: "+getSpecies() +", \ncan fly?: "+ isCanFly();
	}
	
	
}
