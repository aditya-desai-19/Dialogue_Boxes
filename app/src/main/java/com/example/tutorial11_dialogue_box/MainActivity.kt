package com.example.tutorial11_dialogue_box

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.tutorial11_dialogue_box.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.type1.setOnClickListener {
            val builder1 = AlertDialog.Builder(this)
            builder1.setTitle("Are you sure?")
            builder1.setMessage("Do you want to exit?")
            builder1.setIcon(R.drawable.baseline_exit_to_app_24)
            builder1.setPositiveButton("Yes", DialogInterface.OnClickListener { dialog, which ->
                //What action to perform when Yes is clicked
                finish()
            })
            builder1.setNegativeButton("No", DialogInterface.OnClickListener { dialog, which ->

            })
            builder1.show()
        }

        binding.type2.setOnClickListener {
            val languages = arrayOf("C++", "Java", "Python")
            val builder2 = AlertDialog.Builder(this)
            builder2.setTitle("Which is your favourite programming language?")
            builder2.setSingleChoiceItems(languages, 0, DialogInterface.OnClickListener { dialog, which ->
                Toast.makeText(this, "Your favourite programming language is ${languages[which]}",Toast.LENGTH_LONG).show()
            })
            builder2.setPositiveButton("Submit", DialogInterface.OnClickListener { dialog, which ->
                //What action to perform when Yes is clicked

            })
            builder2.setNegativeButton("Decline", DialogInterface.OnClickListener { dialog, which ->

            })
            builder2.show()
        }

        binding.type3.setOnClickListener {
            val languages = arrayOf("C++", "Java", "Python")
            val builder3 = AlertDialog.Builder(this)
            builder3.setTitle("Which is your favourite programming language?")
            builder3.setMultiChoiceItems(languages, null, DialogInterface.OnMultiChoiceClickListener { dialog, which, isChecked ->
                Toast.makeText(this, "Your favourite programming language is ${languages[which]}",Toast.LENGTH_LONG).show()
            })
            builder3.setPositiveButton("Submit", DialogInterface.OnClickListener { dialog, which ->
                //What action to perform when Yes is clicked
            })
            builder3.setNegativeButton("Decline", DialogInterface.OnClickListener { dialog, which ->

            })
            builder3.show()
        }
    }
}