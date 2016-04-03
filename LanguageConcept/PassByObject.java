package LanguageConcept;
// Lesson learned - For primitive types, java is pass by value
// For objects - Object variables are referenced, so a copy of the object is made but the variables are to reference to the original object
// - so a copy of the reference of Object variable can be changed
public class PassByObject {
	private int intValue;
	private String stringValue;
	private double doubleValue;
	
	public PassByObject(int intValue, String stringValue, double doubleValue) {
		this.intValue = intValue;
		this.stringValue = stringValue;
		this.doubleValue = doubleValue;
	}
	
	public int getInt() { return intValue; }
	public void setInt(int a) { intValue = a; }
	public String getString() { return stringValue; }
	public void setString(String s) { stringValue = s; }
	public double getDouble() { return doubleValue; }
	public void setDouble(double d) { doubleValue = d; }
	
	public PassByObject passObject(PassByObject obj, int something) {
		obj.setInt(7);
		obj.setString("Seven");
		obj.setDouble(7.0);
		obj = new PassByObject(2, "Two", 2.0);
		something = 4;
		return obj;
	}
	
	public void printContents() {
		System.out.println(intValue);
		System.out.println(stringValue);
		System.out.println(doubleValue);
	}
	
	public void printContents(PassByObject obj) {
		System.out.println(obj.getInt());
		System.out.println(obj.getString());
		System.out.println(obj.getDouble());
	}
}
