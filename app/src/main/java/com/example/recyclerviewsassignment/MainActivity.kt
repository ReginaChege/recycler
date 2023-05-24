package com.example.recyclerviewsassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun generateFibonacciSequence(nums: Int): List<Int> {
        val result = mutableListOf(0, 1)
        if (nums > 2) {
            for (num in 2 until nums) {
                result.add(result[num-1] + result[num-2])
            }
        }
        return result
    }
    lateinit var recyclerView: RecyclerView
    lateinit var adapter: FibonacciRvAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.rvFibonacci)
        recyclerView.layoutManager = LinearLayoutManager(this, )
        adapter = (generateFibonacciSequence(100))
        recyclerView.adapter = adapter
    }
}

}
