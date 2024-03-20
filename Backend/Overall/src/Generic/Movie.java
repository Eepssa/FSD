package Generic;

public class Movie {
	int imbd,rate;
	String name;
	public int getImbd() {
		return imbd;
	}
	public void setImbd(int imbd) {
		this.imbd = imbd;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Movie(int imbd, int rate, String name) {
		super();
		this.imbd = imbd;
		this.rate = rate;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Movie [imbd=" + imbd + ", rate=" + rate + ", name=" + name + "]";
	}
	
	

	
}
