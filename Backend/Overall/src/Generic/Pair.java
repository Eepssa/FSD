package Generic;

public class Pair<T,U> {
  T ob1;
  U ob2;
public T getOb1() {
	return ob1;
}
public void setOb1(T ob1) {
	this.ob1 = ob1;
}
public U getOb2() {
	return ob2;
}
public void setOb2(U ob2) {
	this.ob2 = ob2;
}
@Override
public String toString() {
	return "Pair [ob1=" + ob1 + ", ob2=" + ob2 + "]";
}

  
	

}
