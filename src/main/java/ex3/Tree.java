package ex3;

import java.util.Set;

public interface Tree {
    int size();// nombre de valeurs

    boolean contains(final Integer val); // vrai si val est contenue dans l'arbre, faux sinon

    Set<Integer> values();// ensemble des valeurs différentes dans l'arbre

    Integer sum();// somme des valeurs

    Integer min();// valeur minimale

    Integer max();// valeur maximale

    boolean isSorted();// vrai si l'arbre est trié, faux sinon
}
