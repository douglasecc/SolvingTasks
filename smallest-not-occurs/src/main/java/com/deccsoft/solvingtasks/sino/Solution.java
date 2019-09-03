package com.deccsoft.solvingtasks.sino;

import java.util.HashSet;

class Solution {
	
    public int solution(int[] A) {
        int num = 1;
        HashSet<Integer> hset = new HashSet<Integer>();

        for (int seq: A) {
            hset.add(seq);
        }

         while (hset.contains(num)) {
                num++;
         }

        return num;
    }
}