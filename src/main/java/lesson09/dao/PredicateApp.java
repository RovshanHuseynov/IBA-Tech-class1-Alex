package lesson09.dao;

import java.util.List;

public class PredicateApp {
  public static void main(String[] args) {
    DAO<Pizza> dao_pz = new DAOPizzaHashMap();
    List<Pizza> p_list1 = dao_pz.get(p -> p.getId() == 5);
    List<Pizza> p_list2 = dao_pz.get(p -> p.getName().equals("ABC"));
    List<Pizza> p_list3 = dao_pz.get(p -> p.getName().equals("ABC") && p.getCost() == 33);
  }
}
