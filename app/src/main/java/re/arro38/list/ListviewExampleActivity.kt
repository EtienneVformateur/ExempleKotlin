package re.arro38.list

import android.app.Activity
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import re.arro38.list.databinding.ActivityListviewExampleBinding

class ListviewExampleActivity : AppCompatActivity() {
    private lateinit var binding : ActivityListviewExampleBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListviewExampleBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        val custAdapter = CustomAdapter(arrayOf("test", "t2"))
        binding.recycler.adapter = custAdapter
        binding.recycler.layoutManager = LinearLayoutManager(this)
    }
}