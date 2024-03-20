package Generic;

public class Genric<T> {
	
 T obj;
 Genric(T obj)
 {
	 super();
	 this.obj=obj;
 }
 public T get() {
	 return this.obj;
 }
 public void set(T obj) {
	 this.obj=obj;
 }
}
