package ANNOTATIONS;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//indicamos que tratamiento de retencion queremos que el compilador le otorgue a la anotacion
@Retention(RetentionPolicy.RUNTIME)//la annotation si estara disponible durante el tiempo de ejecucion y podra ser leida por reflection
//indicamos donde aplica la anotacion
@Target(ElementType.METHOD)//puede aplicarse sobre los metodos
public @interface Formato {
	String value();
}
