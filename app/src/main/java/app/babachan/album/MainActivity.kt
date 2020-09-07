package app.babachan.album

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intent = Intent(this, DetailActivity::class.java)

        imageView2.setOnClickListener {
            intent.putExtra("Image", R.drawable.sea_image)

            intent.putExtra("text", "海")
            startActivity(intent)
        }

        imageView3.setOnClickListener {
            intent.putExtra("Image", R.drawable.dog_image)
            intent.putExtra("text", "子犬")

            startActivity(intent)
        }

        imageView4.setOnClickListener {
            intent.putExtra("Image", R.drawable.cat_image)
            intent.putExtra("text", "猫")

            startActivity(intent)
        }

        imageView5.setOnClickListener {
            intent.putExtra("Image", R.drawable.flower_image)
            intent.putExtra("text", "桜")

            startActivity(intent)
        }

        imageView6.setOnClickListener {
            intent.putExtra("Image", R.drawable.cake_image)
            intent.putExtra("text", "ケーキ")

            startActivity(intent)
        }

        imageView7.setOnClickListener {
            intent.putExtra("Image", R.drawable.night_image)
            intent.putExtra("text", "夜景")

            startActivity(intent)
        }



    }
}