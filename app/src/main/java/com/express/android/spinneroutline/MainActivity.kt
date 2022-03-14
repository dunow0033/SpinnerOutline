package com.express.android.spinneroutline

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Toast
import com.express.android.spinneroutline.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var binding: ActivityMainBinding? = null
    private val _binding get() = binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val languages = resources.getStringArray(R.array.customList)
        val autoCompleteTextView = findViewById<AutoCompleteTextView>(R.id.autoCompleteTextView)

        val adapter =
            ArrayAdapter(applicationContext, R.layout.dropdown_item, R.id.textView, languages)

        autoCompleteTextView.setAdapter(adapter)
    }

    override fun onCreateView(name: String, context: Context, attrs: AttributeSet): View? {
        return super.onCreateView(name, context, attrs)
    }

//        _binding = ActivityMainBinding.inflate(inflater, container, false)
//
//
//        return binding.root

//        val customList = listOf("First", "Second", "Third", "Fourth")
//        val adapter = ArrayAdapter.createFromResource(this, R.array.customList,
//            android.R.layout.simple_spinner_dropdown_item)
//        spMonths.adapter = adapter

//        spMonths.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
//            override fun onItemSelected(adapterView: AdapterView<*>?, view: View?, position: Int, id: Long) {
//                Toast.makeText(this@MainActivity, "You selected ${adapterView?.getItemAtPosition(position).toString()}",
//                Toast.LENGTH_LONG).show()
//            }
//
//            override fun onNothingSelected(p0: AdapterView<*>?) {
//
//            }
//        }
}