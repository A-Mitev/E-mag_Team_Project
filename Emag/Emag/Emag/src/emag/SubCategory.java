package emag;

public class SubCategory  {
	
	private int subId;
	private Category category;
	private String name;
	
	public SubCategory(int subId, Category category, String name) {
		this.subId = subId;
		this.category = category;
		this.setName(name);
	}
	
	public Category getCategoryId(){
		return category;
	}
	
	public int getSubId() {
		return subId;
	}
	public void setSubId(int subId) {
		this.subId = subId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Category getCategory() {
		return category;
	}
	
	

}
