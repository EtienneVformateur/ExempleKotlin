package re.arro38.list


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import re.arro38.list.databinding.ActivityMainBinding
import splitties.activities.start

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val arrayButton = arrayOf(binding.r1,binding.r2,binding.r3,binding.r4)
        val listReponse1 = listOf("Shake event", "b", "c","d")
        for (i in arrayButton.indices){
            arrayButton[i].text = listReponse1[i]
        }

        binding.r1.setOnClickListener{
//            val intent = Intent(this, SecondActivity::class.java)
//            startActivity(intent)
            start<ShakeActivity>()
        }

    }
}