package com.example.savetest

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.savetest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var pref:SharedPreferences
    var save_key: String = "save_key"
    var save_key2: String = "save_key2"
    var save_key3: String = "save_key3"
    var save_key4: String = "save_key4"
    var save_key5: String = "save_key5"
    var save_key6: String = "save_key6"
    var save_key7: String = "save_key7"
    var save_key8: String = "save_key8"
    var save_key9: String = "save_key9"
    var save_key10: String = "save_key10"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        init()
        setContentView(binding.root)
        supportActionBar?.hide()
        ///1
        binding.imageView.setOnClickListener { var edit:SharedPreferences.Editor = pref.edit()
        edit.putString(save_key, binding.textView.text.toString())
        edit.apply()
        binding.imageView.setBackgroundColor(R.color.green.toInt())}
        ///2
        binding.imageView2.setOnClickListener { var edit:SharedPreferences.Editor = pref.edit()
        edit.putString(save_key2, binding.textView2.text.toString())
        edit.apply()
        binding.imageView2.setBackgroundColor(R.color.green.toInt())}
        ///3
        binding.imageView3.setOnClickListener { var edit:SharedPreferences.Editor = pref.edit()
            edit.putString(save_key3, binding.textView3.text.toString())
            edit.apply()
            binding.imageView3.setBackgroundColor(R.color.green.toInt())}
        ///4
        binding.imageView4.setOnClickListener { var edit:SharedPreferences.Editor = pref.edit()
            edit.putString(save_key4, binding.textView4.text.toString())
            edit.apply()
            binding.imageView4.setBackgroundColor(R.color.green.toInt())}
        ///5
        binding.imageView5.setOnClickListener { var edit:SharedPreferences.Editor = pref.edit()
            edit.putString(save_key5, binding.textView5.text.toString())
            edit.apply()
            binding.imageView5.setBackgroundColor(R.color.green.toInt())}
        ///6
        binding.imageView6.setOnClickListener { var edit:SharedPreferences.Editor = pref.edit()
            edit.putString(save_key6, binding.textView6.text.toString())
            edit.apply()
            binding.imageView6.setBackgroundColor(R.color.green.toInt())}
        ///7
        binding.imageView7.setOnClickListener { var edit:SharedPreferences.Editor = pref.edit()
            edit.putString(save_key7, binding.textView7.text.toString())
            edit.apply()
            binding.imageView7.setBackgroundColor(R.color.green.toInt())}
        ///8
        binding.imageView8.setOnClickListener { var edit:SharedPreferences.Editor = pref.edit()
            edit.putString(save_key8, binding.textView8.text.toString())
            edit.apply()
            binding.imageView8.setBackgroundColor(R.color.green.toInt())}
        ///9
        binding.imageView9.setOnClickListener { var edit:SharedPreferences.Editor = pref.edit()
            edit.putString(save_key9, binding.textView9.text.toString())
            edit.apply()
            binding.imageView9.setBackgroundColor(R.color.green.toInt())}
        ///10
        binding.imageView10.setOnClickListener { var edit:SharedPreferences.Editor = pref.edit()
            edit.putString(save_key10, binding.textView10.text.toString())
            edit.apply()
            binding.imageView10.setBackgroundColor(R.color.green.toInt())}
        ///Other
        binding.textView11.setOnClickListener {
            binding.textView11.setTextColor(R.color.green.toInt())

            binding.textView.setText("")
            binding.textView2.setText("")
            binding.textView3.setText("")
            binding.textView4.setText("")
            binding.textView5.setText("")
            binding.textView6.setText("")
            binding.textView7.setText("")
            binding.textView8.setText("")
            binding.textView9.setText("")
            binding.textView10.setText("")
        }
        ///analysis
        scanning()
    }
    fun init(){
        pref = getSharedPreferences("save", MODE_PRIVATE)
        binding.textView
    }
    fun scanning(){
        binding.textView.setText(pref.getString(save_key, ""))
        binding.textView2.setText(pref.getString(save_key2, ""))
        binding.textView3.setText(pref.getString(save_key3, ""))
        binding.textView4.setText(pref.getString(save_key4, ""))
        binding.textView5.setText(pref.getString(save_key5, ""))
        binding.textView6.setText(pref.getString(save_key6, ""))
        binding.textView7.setText(pref.getString(save_key7, ""))
        binding.textView8.setText(pref.getString(save_key8, ""))
        binding.textView9.setText(pref.getString(save_key9, ""))
        binding.textView10.setText(pref.getString(save_key10, ""))
    }
}