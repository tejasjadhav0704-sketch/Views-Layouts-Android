package com.example.views_practice

import android.os.Bundle
import android.widget.Toast
import android.content.Intent
import android.provider.MediaStore
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.views_practice.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val builder1 = AlertDialog.Builder(this)

        binding.checkBox1.setOnClickListener {
            builder1.setIcon(R.drawable.outline_circle_24)
            builder1.setTitle("AlertDailog Practice")
            builder1.setMessage("U Selected Java")
            builder1.setPositiveButton("Yes") { _, _ ->
                Toast.makeText(this, "Yes", Toast.LENGTH_SHORT).show()
            }
            builder1.setNegativeButton("No") { _, _ ->
                Toast.makeText(this, "No", Toast.LENGTH_SHORT).show()
            }
            builder1.setNeutralButton("Neutral") { _, _ ->
                Toast.makeText(this, "Neutral", Toast.LENGTH_SHORT).show()
            }
            builder1.show()
        }

        binding.checkBox2.setOnClickListener {
            builder1.setIcon(R.drawable.outline_circle_24)
            builder1.setTitle("AlertDailog Practice")
            builder1.setMessage("U Selected Kotlin")
            builder1.setPositiveButton("Yes") { _, _ ->
                Toast.makeText(this, "Yes", Toast.LENGTH_SHORT).show()
            }
            builder1.setNegativeButton("No") { _, _ ->
                Toast.makeText(this, "No", Toast.LENGTH_SHORT).show()
            }
            builder1.setNeutralButton("Neutral") { _, _ ->
                Toast.makeText(this, "Neutral", Toast.LENGTH_SHORT).show()
            }
            builder1.show()
        }

        binding.checkBox3.setOnClickListener {
            builder1.setIcon(R.drawable.outline_circle_24)
            builder1.setTitle("AlertDailog Practice")
            builder1.setMessage("U Selected Firebase")
            builder1.setPositiveButton("Yes") { _, _ ->
                Toast.makeText(this, "Yes", Toast.LENGTH_SHORT).show()
            }
            builder1.setNegativeButton("No") { _, _ ->
                Toast.makeText(this, "No", Toast.LENGTH_SHORT).show()
            }
            builder1.setNeutralButton("Neutral") { _, _ ->
                Toast.makeText(this, "Neutral", Toast.LENGTH_SHORT).show()
            }
            builder1.show()
        }

        binding.checkBox4.setOnClickListener {
            builder1.setIcon(R.drawable.outline_circle_24)
            builder1.setTitle("AlertDailog Practice")
            builder1.setMessage("U Selected Java")
            builder1.setPositiveButton("Yes") { _, _ ->
                Toast.makeText(this, "Yes", Toast.LENGTH_SHORT).show()
            }
            builder1.setNegativeButton("No") { _, _ ->
                Toast.makeText(this, "No", Toast.LENGTH_SHORT).show()
            }
            builder1.setNeutralButton("Neutral") { _, _ ->
                Toast.makeText(this, "Neutral", Toast.LENGTH_SHORT).show()
            }
            builder1.show()
        }

        binding.radioGroup.setOnCheckedChangeListener { _, isChecked ->
            when (isChecked) {
                binding.radioButton1.id -> {
                    builder1.setIcon(R.drawable.outline_circle_24)
                    builder1.setTitle("AlertDailog Practice")
                    builder1.setMessage("U Selected Android")
                    builder1.setPositiveButton("Yes") { _, _ ->
                        Toast.makeText(this, "Yes", Toast.LENGTH_SHORT).show()
                    }
                    builder1.setNegativeButton("No") { _, _ ->
                        Toast.makeText(this, "No", Toast.LENGTH_SHORT).show()
                    }
                    builder1.setNeutralButton("Neutral") { _, _ ->
                        Toast.makeText(this, "Neutral", Toast.LENGTH_SHORT).show()
                    }
                    builder1.show()
                }

                binding.radioButton2.id -> {
                    builder1.setIcon(R.drawable.outline_circle_24)
                    builder1.setTitle("AlertDailog Practice")
                    builder1.setMessage("U Selected Web")
                    builder1.setPositiveButton("Yes") { _, _ ->
                        Toast.makeText(this, "Yes", Toast.LENGTH_SHORT).show()
                    }
                    builder1.setNegativeButton("No") { _, _ ->
                        Toast.makeText(this, "No", Toast.LENGTH_SHORT).show()
                    }
                    builder1.setNeutralButton("Neutral") { _, _ ->
                        Toast.makeText(this, "Neutral", Toast.LENGTH_SHORT).show()
                    }
                    builder1.show()
                }

                binding.radioButton3.id -> {
                    builder1.setIcon(R.drawable.outline_circle_24)
                    builder1.setTitle("AlertDailog Practice")
                    builder1.setMessage("U Selected Full-Stack")
                    builder1.setPositiveButton("Yes") { _, _ ->
                        Toast.makeText(this, "Yes", Toast.LENGTH_SHORT).show()
                    }
                    builder1.setNegativeButton("No") { _, _ ->
                        Toast.makeText(this, "No", Toast.LENGTH_SHORT).show()
                    }
                    builder1.setNeutralButton("Neutral") { _, _ ->
                        Toast.makeText(this, "Neutral", Toast.LENGTH_SHORT).show()
                    }
                    builder1.show()
                }

                binding.radioButton4.id -> {
                    builder1.setIcon(R.drawable.outline_circle_24)
                    builder1.setTitle("AlertDailog Practice")
                    builder1.setMessage("U Selected DataBase")
                    builder1.setPositiveButton("Yes") { _, _ ->
                        Toast.makeText(this, "Yes", Toast.LENGTH_SHORT).show()
                    }
                    builder1.setNegativeButton("No") { _, _ ->
                        Toast.makeText(this, "No", Toast.LENGTH_SHORT).show()
                    }
                    builder1.setNeutralButton("Neutral") { _, _ ->
                        Toast.makeText(this, "Neutral", Toast.LENGTH_SHORT).show()
                    }
                    builder1.show()
                }
            }
        }

        binding.fab.setOnClickListener {
            startActivity(Intent(MediaStore.ACTION_IMAGE_CAPTURE))
        }

        binding.button2.setOnClickListener {
            startActivity(Intent(this, MainActivity2::class.java))
        }
    }
}
