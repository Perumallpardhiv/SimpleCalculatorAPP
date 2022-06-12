package com.example.simplecalculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.simplecalculator.databinding.ActivityMainBinding

lateinit var bindingmain: ActivityMainBinding
class MainActivity : AppCompatActivity() {
    @SuppressLint("StringFormatMatches")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingmain = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingmain.root)

        bindingmain.btnAdd.setOnClickListener {
            if (bindingmain.txtNum1.text.isNotEmpty() && bindingmain.txtNum2.text.isNotEmpty()) {
                val sum = bindingmain.txtNum1.text.toString()
                    .toDouble() + bindingmain.txtNum2.text.toString().toDouble()
                Toast.makeText(this, "Sum = $sum", Toast.LENGTH_SHORT).show()
                bindingmain.txtRes.text = getString(R.string.final_result, sum)
            } else {
                Toast.makeText(this, "Please insert values", Toast.LENGTH_SHORT).show()
            }
        }

        bindingmain.btnSub.setOnClickListener {
            if (bindingmain.txtNum1.text.isNotEmpty() && bindingmain.txtNum2.text.isNotEmpty()) {
                val sub = bindingmain.txtNum1.text.toString()
                    .toDouble() - bindingmain.txtNum2.text.toString().toDouble()
                Toast.makeText(this, "Difference = $sub", Toast.LENGTH_SHORT).show()
                bindingmain.txtRes.text = getString(R.string.final_result, sub)
            } else {
                Toast.makeText(this, "Please insert values", Toast.LENGTH_SHORT).show()
            }
        }

        bindingmain.btnMul.setOnClickListener {
            if (bindingmain.txtNum1.text.isNotEmpty() && bindingmain.txtNum2.text.isNotEmpty()) {
                val mul = bindingmain.txtNum1.text.toString()
                    .toDouble() * bindingmain.txtNum2.text.toString().toDouble()
                Toast.makeText(this, "Multiplication = $mul", Toast.LENGTH_SHORT).show()
                bindingmain.txtRes.text = getString(R.string.final_result, mul)
            } else {
                Toast.makeText(this, "Please insert values", Toast.LENGTH_SHORT).show()
            }
        }

        bindingmain.btnDiv.setOnClickListener {
            if (bindingmain.txtNum1.text.isNotEmpty() && bindingmain.txtNum2.text.isNotEmpty()) {
                val div = bindingmain.txtNum1.text.toString()
                    .toDouble() / bindingmain.txtNum2.text.toString().toDouble()
                Toast.makeText(this, "Division = $div", Toast.LENGTH_SHORT).show()
                bindingmain.txtRes.text = getString(R.string.final_result, div)
            } else {
                Toast.makeText(this, "Please insert values", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
