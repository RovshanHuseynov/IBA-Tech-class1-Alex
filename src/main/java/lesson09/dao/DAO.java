package lesson09.dao;

import java.util.List;
import java.util.function.Predicate;

public interface DAO<T> {
  void store(T data);
  T get(int id);
  default List<T> get(Predicate<T> p) {
    throw new IllegalArgumentException("not implemented");
  }
  void delete(int id);
  void update(T data);
}
