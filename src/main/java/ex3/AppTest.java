/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package ex3;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

public class AppTest {

    public static final Tree arbre0() {
        return new Node(new ArrayList<Tree>());
    }

    public static final Tree arbre1() {
        final Tree f1 = new Leaf(1);
        final Tree f2 = new Leaf(2);
        final Tree n1 = new Node(List.of(f1,f2));
        final Tree f3 = new Leaf(3);
        final Tree n2 = new Node(List.of(n1,f3));
        return n2;
    }

    public static final Tree arbre2() {
        final Tree f1 = new Leaf(2);
        final Tree f2 = new Leaf(3);
        final Tree n1 = new Node(List.of(f1,f2));
        final Tree f3 = new Leaf(1);
        final Tree n2 = new Node(List.of(n1,f3));
        return n2;
    }

    public static final Tree arbre3() {
        final Tree f1 = new Leaf(2);
        final Tree f2 = new Leaf(1);
        final Tree n1 = new Node(List.of(f1,f2));
        final Tree f3 = new Leaf(3);
        final Tree n2 = new Node(List.of(n1,f3));
        return n2;
    }

    @Test public void testSize() {
        assertEquals(0, arbre0().size());
        assertEquals(3, arbre1().size());
        assertEquals(3, arbre2().size());
        assertEquals(3, arbre3().size());
    }

    @Test public void testContient() {
        assertFalse(arbre0().contains(1));
        assertFalse(arbre0().contains(2));
        assertFalse(arbre0().contains(3));
        assertFalse(arbre0().contains(4));
        assertTrue(arbre1().contains(1));
        assertTrue(arbre2().contains(1));
        assertTrue(arbre3().contains(1));
        assertTrue(arbre1().contains(2));
        assertTrue(arbre2().contains(2));
        assertTrue(arbre3().contains(2));
        assertTrue(arbre1().contains(3));
        assertTrue(arbre2().contains(3));
        assertTrue(arbre3().contains(3));
        assertFalse(arbre1().contains(4));
        assertFalse(arbre2().contains(4));
        assertFalse(arbre3().contains(4));
    }

    @Test public void testValeurs() {
        final Set<Integer> contenu = Set.of(1,2,3);
        assertEquals(Set.of(), arbre0().valeurs());
        assertEquals(contenu, arbre1().valeurs());
        assertEquals(contenu, arbre2().valeurs());
        assertEquals(contenu, arbre3().valeurs());
    }

    @Test public void testValeur() {
        assertEquals(null, arbre0().somme());
        assertEquals((Integer) 6, arbre1().somme());
        assertEquals((Integer) 6, arbre2().somme());
        assertEquals((Integer) 6, arbre3().somme());
    }

    @Test public void testMin() {
        assertEquals(null, arbre0().min());
        assertEquals((Integer) 1, arbre1().min());
        assertEquals((Integer) 1, arbre2().min());
        assertEquals((Integer) 1, arbre3().min());
    }

    @Test public void testMax() {
        assertEquals(null, arbre0().max());
        assertEquals((Integer) 3, arbre1().max());
        assertEquals((Integer) 3, arbre2().max());
        assertEquals((Integer) 3, arbre3().max());
    }

    @Test public void testEstTrie() {
        assertTrue(arbre0().estTrie());
        assertTrue(arbre1().estTrie());
        assertFalse(arbre2().estTrie());
        assertFalse(arbre3().estTrie());
    }

}
