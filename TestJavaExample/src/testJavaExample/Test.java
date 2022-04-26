package testJavaExample;
class Calculatord{
	
}
class Calculator extends Calculatord{
	float r;
	float result;
	float pi;
	protected Calculator(){
		pi =3.14f;
	}
	protected Calculator(float r){
		this();
		this.r = r;
	}
	@Override
	public String toString() {
		return "Calculator [pi=" + pi + ", r=" + r + ", result=" + result + "]";
	}

}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Calculator c1=new Calculator(5.0f);
        System.out.println(c1);
	}

}
