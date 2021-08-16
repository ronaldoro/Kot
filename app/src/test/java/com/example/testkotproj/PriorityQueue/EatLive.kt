package com.example.testkotproj.PriorityQueue

import java.util.*

class EatLive {
    fun solution(food_times: IntArray, k: Long): Int {
        var answer = 0;

        var lambda = {a:Int,b:Int-> when{
            a>b -> 1
            a<b -> -1
            else -> 0
        }}
        var pq = PriorityQueue(Comparator<Pair<Int,Int>>{a,b ->
            when{
                a.first !=b.first -> lambda(a.first,b.first)
                else -> lambda(a.second, b.second)
            }})

        //var pq:PriorityQueue<Pair<Int,Int>> = PriorityQueue<Pair<Int,Int>>(); // value, Index
        for(i in 0 until food_times.size) {
            pq.add(Pair<Int,Int>(food_times[i], i));
        }

        var totalTime:Long = 0;
        var rotateTime:Long = 0;
        var finish:Array<Boolean> = Array(food_times.size, {false});

        while(totalTime < k) {
            val queSize = pq.size;
            if(queSize + totalTime <= k) {
                totalTime = totalTime + queSize;
                rotateTime = rotateTime + 1;

                var front_value = pq.peek().first;
                var front_Index = pq.peek().second;
                pq.remove();
                front_value = front_value - 1;
                if(front_value > 0)
                    pq.add(Pair<Int, Int>(front_value, front_Index));
                else {
                    finish[front_Index] = true;
                    var second_value = pq.peek().first - rotateTime.toInt();
                    var second_Index = pq.peek().second;
                    pq.remove();
                    pq.add(Pair<Int, Int>(second_value, second_Index));
                }


            } else {
                var cnt = k - totalTime+1;
                for(i in 0 until  finish.size) {
                    if(finish[i] == false) {
                        cnt = cnt-1;
                        if(cnt.toInt() == 0)
                            return i+1;
                    }
                }
            }
        }

        if(totalTime == k)
            return 1;

        return answer;
    }
}