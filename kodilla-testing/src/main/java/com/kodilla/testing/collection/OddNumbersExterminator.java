package com.kodilla.testing.collection;
import java.util.ArrayList;

public class OddNumbersExterminator {

    public ArrayList<Integer> exterminate(ArrayList<Integer> number)
    {
        ArrayList<Integer> odd = new ArrayList<>();
        for(int i : number)
        {
            if(i%2 == 0)
            {
                odd.add(i);
            }
        }
        return odd;
    }
}
