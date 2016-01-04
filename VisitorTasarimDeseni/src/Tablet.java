
public abstract class Tablet {

	private String brand;
	private String Model;
	

	public Tablet(String brand,String Model) {
		this.brand=brand;
		this.Model=Model;
	}
	
	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getModel() {
		return Model;
	}


	public void setModel(String model) {
		Model = model;
	}


	public abstract void Accept(IVisitor visit);
	
}
