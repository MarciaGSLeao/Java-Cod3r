package exercises;

import java.util.List;

public class ListUtil {
	
	// 1ª FORMA DE DEFINIR UM MÉTODO PARA BUSCAR UM ELEMENTO ESPECÍFICO DE UMA LISTA,
	// POREM NESSE CASO, NA HORA DE CHAMAR NO PROGRAMA PRINCIPAL, SERÁ NECESSÁRIO
	// FAZER O CAST.
	public static Object getLast(List<?> list) {
		return list.get(list.size() - 1);
	}
	
	// 2ª FORMA É DEFININDO O GENERICS NA CRIAÇÃO DO MÉTODO.
	public static <T> T getLast2(List<T> list) {
		return list.get(list.size() - 1);
	}

}
