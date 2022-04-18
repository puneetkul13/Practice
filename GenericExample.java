package Generics;

public class GenericExample<i1,i2> {
	i1 var1;
	i2 var2;
	public GenericExample(i1 var1, i2 var2) {
		super();
		this.var1 = var1;
		this.var2 = var2;
	}
	public i1 getVar1() {
		return var1;
	}
	public void setVar1(i1 var1) {
		this.var1 = var1;
	}
	public i2 getVar2() {
		return var2;
	}
	public void setVar2(i2 var2) {
		this.var2 = var2;
	}
	

}
