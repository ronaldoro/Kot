package com.example.testkotproj

class MemoryMoniter {
    val MAX_MEMORY : Int = 1024 * 1024 * 1024

    public fun isAlloc(memory : Int) : Boolean {
        if(memory < MAX_MEMORY){
            return true
        }

        return false
    }
}