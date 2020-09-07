package app.babachan.album

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail.*
import kotlinx.android.synthetic.main.activity_detail.view.*

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val image = intent.getIntExtra("Image" ,0)
        detailImageView.setImageResource(image)

        val text = intent.getStringExtra("text")
        detailTextview.text = text


        returnButton.setOnClickListener {
            finish()
        }
    }
}