package be.pxl.ja.demo6;

@FunctionalInterface
public interface Service<T,U> {

	T execute(U arg);
}
