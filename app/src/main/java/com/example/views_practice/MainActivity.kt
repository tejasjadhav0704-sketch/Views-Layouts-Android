package com.example.views_practice

import android.os.Bundle
import android.widget.Toast
import android.content.Intent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.views_practice.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.INPUT.setOnClickListener {
            Toast.makeText(this, "${binding.INPUT.text.toString()}", Toast.LENGTH_SHORT).show()
        }

        binding.checkBox1.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                Toast.makeText(this, "Java", Toast.LENGTH_SHORT).show()
            }

            binding.checkBox2.setOnCheckedChangeListener { _, isChecked ->
                if (isChecked) {
                    Toast.makeText(this, "Kotlin", Toast.LENGTH_SHORT).show()
                }
            }

            binding.checkBox3.setOnCheckedChangeListener { _, isChecked ->
                if (isChecked) {
                    Toast.makeText(this, "FireBase", Toast.LENGTH_SHORT).show()
                }
            }

            binding.checkBox4.setOnCheckedChangeListener { _, isChecked ->
                if (isChecked) {
                    Toast.makeText(this, "MySql", Toast.LENGTH_SHORT).show()
                }
            }

            binding.radioGroup.setOnCheckedChangeListener { _, ischecked ->
                when (ischecked) {
                    binding.radioButton1.id -> {
                        Toast.makeText(this, "Android selected", Toast.LENGTH_SHORT).show()
                    }

                    binding.radioButton2.id -> {
                        Toast.makeText(this, "Web selected", Toast.LENGTH_SHORT).show()
                    }

                    binding.radioButton3.id -> {
                        Toast.makeText(this, "Full-Stack selected", Toast.LENGTH_SHORT).show()
                    }

                    binding.radioButton4.id -> {
                        Toast.makeText(this, "DataBase", Toast.LENGTH_SHORT).show()
                    }
                }
            }

            binding.fab.setOnClickListener {
                Toast.makeText(this, "U Clicked FloatingActionButton", Toast.LENGTH_SHORT).show()
            }

            binding.button2.setOnClickListener {
                startActivity(Intent(this, MainActivity2::class.java))
            }
        }
    }
}