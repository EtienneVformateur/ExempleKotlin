package re.arro38.list

import android.hardware.SensorManager
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.squareup.seismic.ShakeDetector

class ShakeActivity : AppCompatActivity(), ShakeDetector.Listener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shake)
        val sensorManager = getSystemService(SENSOR_SERVICE) as SensorManager
        val sd = ShakeDetector(this)
        sd.start(sensorManager)
    }

    override fun hearShake() {
        Toast.makeText(this, "Don't shake me, bro!", Toast.LENGTH_SHORT).show()
    }
}