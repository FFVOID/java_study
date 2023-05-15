package ch13.sec02.exam01;

public class Product<K, M> { //<A ~ Z> 까지 쓰고싶은거쓰면된다
	//필드
	private K kind;
	private M model;
	public K getKind() {
		return kind;
	}
	public void setKind(K kind) {
		this.kind = kind;
	}
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}
}
