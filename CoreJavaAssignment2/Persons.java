package CoreJavaAssignment2;
/**
 * 
 * @author KOWSALYA
 * Person class and inside the class  declare the three variable 
 * name,age and address.
 * 
 *
 */
public class Persons extends Person {
	private String name;
	private int age;
	private String address;
	static int count=0;
	/**
	 * It is the argument constructor pass the parameters
	 * @param name
	 * @param age
	 * @param address
	 */
	public Persons(String name,int age,String address) {
		this.name=name;
		this.age=age;
		this.address= address;
		count++;
	}
	public Persons() {
		count++;
	}
	/**
	 * The using getter and setter in name
	 * @param name
	 */
	@Override
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String getName() {
		return name;
	}
	/**
	 * This using getter and setter in age
	 * 
	 */
	@Override
    public int getAge() {
	return age;
    }
	@Override
    public void setAge(int age)
	{
		this.age= age;
	}
    /**
     * The using getter and setter in address
     * @param address
     */
	@Override
    public void setAddress(String address)
    {
    	this.address=address;
    }
	@Override
    public String  getAddress() {
    	return address;
    }
    
    
}
