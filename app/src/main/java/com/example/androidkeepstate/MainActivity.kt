package com.example.androidkeepstate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    val TAG = "StateChange"

    lateinit var button: Button
    lateinit var textInfo: TextView
    lateinit var idName: EditText
    lateinit var idDate: EditText
    lateinit var idPhone: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         button = findViewById<Button>(R.id.button)
         textInfo = findViewById<TextView>(R.id.textView)
        idName = findViewById(R.id.idName)
        idDate = findViewById(R.id.idDate)
        idPhone = findViewById(R.id.idPhone)

        button.setOnClickListener {
            textInfo.setText("I have been clicked!")
        }

        Log.i(TAG, "OnCreate")

    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("save_text", textInfo.text.toString())
        outState.putString("id_name", idName.text.toString())
        outState.putString("id_date", idDate.text.toString())
        outState.putString("id_phone", idPhone.text.toString())
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        textInfo.setText(savedInstanceState.getString("saved_text"))
        idName.setText(savedInstanceState.getString("id_name"))
        idDate.setText(savedInstanceState.getString("id_date"))
        idPhone.setText(savedInstanceState.getString("id_phone"))
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "OnStart")
    }

    override fun onResume() {
        super.onResume()

        Log.i(TAG, "OnResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "OnPause")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "OnDestroy")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "OnStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG, "OnRestart")
    }
}