package intellispaces.dynamicproxy.tracker;

import java.lang.reflect.Method;
import java.util.List;

public interface Tracker {

  void reset();

  List<Method> getInvokedMethods();
}
