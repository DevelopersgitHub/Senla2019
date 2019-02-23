package iOS.Task2;

public class Subject {
	String name = "";
	double weight = 0;
	double cost = 0;
	
	public Subject(String name, double weight, double cost) {
		this.name = name;
		this.weight = weight;
		this.cost = cost;
	};
	
	public void setName(String name) {
		this.name = name;
	};
	
	public String getName(){
		return this.name;
	};
	
	public void setWeight(double weight) {
		this.weight += weight;
	};
	
	public double getWeight(){
		return this.weight;
	};
	
	public void setCost(double cost) {
		this.cost += cost;
	};
	
	public double getCost(){
		return this.cost;
	};
	
	@Override
	public String toString() { 
	    return "Name: '" + this.name + "Weight: '" + this.weight + "', Cost: '" + this.cost;
	}; 
}
