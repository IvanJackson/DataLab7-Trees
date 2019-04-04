package pair;

public class Pair<E,T> {
	
	private E e;
	private T t;
	
	public Pair() {
		this.e = null;
		this.t=null;
	}
	public Pair(E e) {
		this.e = e;
		this.t=null;
	}
	public Pair(E e, T t) {
		this.e = e;
		this.t=t;
	}
	
	public E first() {
		return this.e;
	}
	
	public T second() {
		return this.t;
	}
	
	public void setFirst(E e) {
		this.e = e;
	}
	
	public void setSecond(T t) {
		this.t = t;
	}
	
	public void clear() {
		this.e = null;
		this.t = null;
	}
	
	public String toString() {
		return "("+this.e+","+this.t+")";
	}
}
