package ng.com.ajsprojects.startngkotlintask3

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val user = Firebase.auth.currentUser?.let{
            val name = user.displayName
            val email = user.email
            val photoUrl = user.photoUrl

            val emailVerified = user.isEmailVerified
            val uid = user.uid
        }

        facebook.setOnClickListener{
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.facebook.com/"))
            startActivity(intent)
        }
        

        twitter.setOnClickListener{
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.twitter.com/aj_joules"))
            startActivity(intent)
        }

        instagram.setOnClickListener{
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.instagram.com/aj_joules"))
            startActivity(intent)
        }

        whatsapp.setOnClickListener{
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.whatsapp.com/08183543583"))
            startActivity(intent)
        }

        bitbucket.setOnClickListener{
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.bitbucket.com/joules007"))
            startActivity(intent)

            intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bitbucket.com/joules007"))
            startActivity(intent)
        }

        google.setOnClickListener{
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.google.com/joules007"))
            startActivity(intent)

            intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/joules007"))
            startActivity(intent)
        }

        googlePlus.setOnClickListener{
            Toast.makeText(this@MainActivity, "Google plus has been discontinued", Toast.LENGTH_SHORT).show()
        }

        github.setOnClickListener{
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.github.com/joules007"))
            startActivity(intent)
        }

        skype.setOnClickListener{
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.skype.com/joules007"))
            startActivity(intent)

            intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://www.skype.com/joules007"))
            startActivity(intent)
        }

        youtube.setOnClickListener{
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.youtube.com/"))
            startActivity(intent)

            intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/"))
            startActivity(intent)
        }

        email.setOnClickListener{
            val intent = Intent(Intent.ACTION_SENDTO)
            intent.data = Uri.parse("mailto:youremail@gmail.com") // only email apps should handle this
            intent.putExtra(Intent.EXTRA_EMAIL, "")
            intent.putExtra(Intent.EXTRA_SUBJECT, "Feedback")
            startActivity(Intent.createChooser(intent, "Please Select Email App"))
        }

        playstore.setOnClickListener{
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.play.google.com/"))
            startActivity(intent)

            intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://www.play.google.com/"))
            startActivity(intent)
        }

        website.setOnClickListener{
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.ajsprojects.com.ng/"))
            startActivity(intent)

            intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ajsprojects.com.ng/"))
            startActivity(intent)
        }

        dribble.setOnClickListener{
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.dribble.com/Joules007"))
            startActivity(intent)

            intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://www.dribble.com/Joules007"))
            startActivity(intent)
        }
        android.setOnClickListener{
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.ajsprojects.com.ng/"))
            startActivity(intent)

            intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ajsprojects.com.ng/"))
            startActivity(intent)
        }

        linkedin.setOnClickListener{
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.ajsprojects.com.ng/"))
            startActivity(intent)

        }

       /* Explicit Intent: This intent satisfies the request within the application component. It takes the fully qualified class name of activities or services that we want to start.

        intent = Intent(applicationContext, SecondActivity::class.java)
        startActivity(intent)
        Implicit Intent: This intent does not specify the component name. It invokes the component of another app to handle it.

        intent = Intent(Intent.ACTION_VIEW)
        intent.setData(Uri.parse("https://www.javatpoint.com/"))
        startActivity(intent)

        intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://www.javatpoint.com/"))
        startActivity(intent)*/

    }

}
