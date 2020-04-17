package ng.com.ajsprojects.startngkotlintask3

import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val facebook : ImageView = findViewById(R.id.facebook)
        facebook.setOnClickListener{
            Toast.makeText(this@MainActivity, "You Clicked Me", Toast.LENGTH_SHORT).show()
        }

        val twitter : ImageView = findViewById(R.id.twitter)
        twitter.setOnClickListener{
            Toast.makeText(this@MainActivity, "You Clicked Me", Toast.LENGTH_SHORT).show()
        }

        val instagram : ImageView = findViewById(R.id.instagram)
        instagram.setOnClickListener{
            Toast.makeText(this@MainActivity, "You Clicked Me", Toast.LENGTH_SHORT).show()
        }

        val whatsapp : ImageView = findViewById(R.id.whatsapp)
        whatsapp.setOnClickListener{
            Toast.makeText(this@MainActivity, "You Clicked Me", Toast.LENGTH_SHORT).show()
        }

        val bitbucket : ImageView = findViewById(R.id.bitbucket)
        bitbucket.setOnClickListener{
            Toast.makeText(this@MainActivity, "You Clicked Me", Toast.LENGTH_SHORT).show()
        }

        val google : ImageView = findViewById(R.id.google)
        google.setOnClickListener{
            Toast.makeText(this@MainActivity, "You Clicked Me", Toast.LENGTH_SHORT).show()
        }

        val googlePlus : ImageView = findViewById(R.id.googlePlus)
        googlePlus.setOnClickListener{
            Toast.makeText(this@MainActivity, "You Clicked Me", Toast.LENGTH_SHORT).show()
        }

        val github : ImageView = findViewById(R.id.github)
        github.setOnClickListener{
            Toast.makeText(this@MainActivity, "You Clicked Me", Toast.LENGTH_SHORT).show()
        }

        val skype : ImageView = findViewById(R.id.skype)
        skype.setOnClickListener{
            Toast.makeText(this@MainActivity, "You Clicked Me", Toast.LENGTH_SHORT).show()
        }

        val youtube : ImageView = findViewById(R.id.youtube)
        youtube.setOnClickListener{
            Toast.makeText(this@MainActivity, "You Clicked Me", Toast.LENGTH_SHORT).show()
        }

        val mail : ImageView = findViewById(R.id.email)
        mail.setOnClickListener{
            Toast.makeText(this@MainActivity, "You Clicked Me", Toast.LENGTH_SHORT).show()
        }

        val playstore : ImageView = findViewById(R.id.playstore)
        playstore.setOnClickListener{
            Toast.makeText(this@MainActivity, "You Clicked Me", Toast.LENGTH_SHORT).show()
        }

        val website : ImageView = findViewById(R.id.website)
        website.setOnClickListener{
            Toast.makeText(this@MainActivity, "You Clicked Me", Toast.LENGTH_SHORT).show()
        }

        val dribble : ImageView = findViewById(R.id.dribble)
        dribble.setOnClickListener{
            Toast.makeText(this@MainActivity, "You Clicked Me", Toast.LENGTH_SHORT).show()
        }
        val android : ImageView = findViewById(R.id.android)
        android.setOnClickListener{
            Toast.makeText(this@MainActivity, "You Clicked Me", Toast.LENGTH_SHORT).show()
        }

        val linkedin : ImageView = findViewById(R.id.linkedin)
        linkedin.setOnClickListener{
            Toast.makeText(this@MainActivity, "You Clicked Me", Toast.LENGTH_SHORT).show()
        }

    }
}
