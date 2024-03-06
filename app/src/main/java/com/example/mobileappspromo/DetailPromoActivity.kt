package com.example.mobileappspromo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class DetailPromoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_promo)


        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val promo: Promo? = intent.getParcelableExtra(MainActivity.INTENT_PARCELABLE)


        promo?.let {validPromo ->

            val imgPromo = findViewById<ImageView>(R.id.img_item_photo)
            val namePromo = findViewById<TextView>(R.id.tv_item_name)
            val descPromo = findViewById<TextView>(R.id.tv_item_description)

            imgPromo.setImageResource(promo?.imgPromo!!)
            namePromo.text = promo.namePromo
            descPromo.text = promo.descPromo

        } ?: run {
            Toast.makeText(this, "Promo Data Tidak ada", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}