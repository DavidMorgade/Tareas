package com.mycompany.antonio.el.crack.test;

import com.mycompany.antonio.el.crack.Numeros;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class TestNumeros {

    @Test
    public void testIntroducirNumeros() {
        Numeros numeros = new Numeros();
        String input = "1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        numeros.introducirNumeros(new Scanner(System.in));
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertArrayEquals(expected, numeros.getNumeros());
    }

    @Test
    public void testContarParesImpares() {
        Numeros numeros = new Numeros();
        numeros.setNumeros(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        numeros.contarParesImpares();
        assertEquals(5, numeros.getPares());
        assertEquals(5, numeros.getImpares());
    }
}
