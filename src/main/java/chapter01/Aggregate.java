package chapter01;

public interface Aggregate<E> {
  Iterator<E> iterator();
}
