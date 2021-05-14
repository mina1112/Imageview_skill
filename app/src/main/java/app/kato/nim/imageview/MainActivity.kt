package app.kato.nim.imageview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val url = "https://life-is-tech.com/matelials/Images/logo-square.png"
        val imageView = findViewById<ImageView>(R.id.imageView)

        imageView.load(url)
    }
}