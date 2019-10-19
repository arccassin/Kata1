package NamedClass;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Dinglemouse
{

    public static String antBridge(final String ants, final String terrain)
    {
        ArrayList<Character> antsList = new ArrayList<>(
                ants.chars().
                        mapToObj(i -> (char) i).
                        collect(Collectors.toList()));
        ArrayDeque<Character> deque = new ArrayDeque<>();
        char[] terrChar = terrain.toCharArray();
        char prevCh = terrChar[0];
        for (int i = 1; i < terrChar.length; i++)
        {

        }
        return ants;
    }

}