package com.example.testkotproj.Test

import java.util.*
import kotlin.properties.Delegates

class AlgorithmTest2 {
    var lineSize by Delegates.notNull<Int>()
    lateinit var linked: Array<Array<Boolean>>

    lateinit var hasStart: Array<Boolean>
    lateinit var hasEnd: Array<Boolean>
    var stations: MutableList<MutableSet<Int>> =  mutableListOf()

    fun solution(subway: Array<String>, start: Int, end: Int): Int {
        var answer: Int = 0

        lineSize = subway.size
        linked = Array(lineSize) {Array(lineSize) {false} }
        hasStart = Array(lineSize){i -> false}
        hasEnd = Array(lineSize){i -> false}

        for(i in 0 until lineSize) {
            var station = mutableSetOf<Int>()
            var stationStr = subway[i].split(" ")
            for(j in 0 until stationStr.size) {
                var stationInt = stationStr[j].toInt()
                station.add(stationInt)

                if(stationInt == start) {
                    hasStart[i] = true
                }

                if(stationInt == end) {
                    hasEnd[i] = true
                }
            }

            stations.add(station)
        }

        makeLinked()
        answer = findStationByBFS()

        return answer
    }

    fun makeLinked() {
        for(i in 0 until lineSize) {
            stations[i].forEach { station:Int ->
                for(line in 0 until lineSize) {
                    if(i == line)
                        continue

                    if(stations[line].contains(station)) {
                        linked[i][line] = true
                    }
                }
            }
        }
    }

    fun findStationByBFS(): Int {
        var visited = Array(lineSize){i -> false}
        var que: Queue<Int> = LinkedList<Int>()
        for(i in 0 until lineSize) {
            if(hasStart[i] == true) {
                if(hasEnd[i] == true)
                    return 0

                que.add(i)
                visited[i] = true
            }
        }

        var depth: Int = 1
        while(!que.isEmpty()) {
            var queSize = que.size

            for(i in 0 until queSize) {
                var pos = que.peek()

                for(j in 0 until lineSize) {
                    if(pos != j && !visited[j] && linked[pos][j]) {
                        if(hasEnd[j])
                            return depth

                        visited[j] = true
                        que.add(j)
                    }
                }

                que.remove()
            }
            depth = depth + 1
        }

        return 0
    }
}