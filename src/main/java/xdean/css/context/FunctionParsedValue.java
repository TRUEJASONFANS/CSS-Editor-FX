package xdean.css.context;

import javafx.css.ParsedValue;
import javafx.scene.text.Font;

import com.google.common.base.Supplier;

class FunctionParsedValue<V, T> extends ParsedValue<V, T> {
  Supplier<T> result;

  FunctionParsedValue(Supplier<T> actualResult) {
    super(null, null);
    result = actualResult;
  }

  @Override
  public T convert(Font font) {
    return result.get();
  }
}