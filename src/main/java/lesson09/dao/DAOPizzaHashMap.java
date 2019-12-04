package lesson09.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DAOPizzaHashMap implements DAO<Pizza> {

  private final Map<Integer, Pizza> storage = new HashMap<>();

  @Override
  public void store(Pizza data) {
    storage.put(data.getId(), data);
  }

  @Override
  public Pizza get(int id) {
    return storage.get(id);
  }

  @Override
  public List<Pizza> get(Predicate<Pizza> p) {
    return storage.values().stream().filter(p).collect(Collectors.toList());
  }

  @Override
  public void delete(int id) {
    storage.remove(id);
  }

  @Override
  public void update(Pizza data) {
    storage.put(data.getId(), data);
  }
}
