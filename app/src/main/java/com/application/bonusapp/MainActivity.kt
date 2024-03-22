package com.application.bonusapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtName = findViewById<EditText>(R.id.edtName).text
        val edtNumber = findViewById<EditText>(R.id.edtEmployeeN).text
        val edtEmail = findViewById<EditText>(R.id.edtEmail).text
        val edtSalary = findViewById<EditText>(R.id.edtSalary).text
        val edtYearsW = findViewById<EditText>(R.id.edtYearsW).text
        val btnCalc =  findViewById<Button>(R.id.btnCalculate)
        val tvResult = findViewById<TextView>(R.id.tvResult)

        btnCalc.setOnClickListener {
            var message = ""
            var rTire = 0.075
            var bonus =0.0
            var Salary = edtSalary.toString().toFloat()
            var yearsW = edtYearsW.toString().toInt()

            when(yearsW) {
                1 -> bonus = Salary + (Salary*0.1)-( Salary*rTire)
                2 -> bonus = Salary + (Salary*0.2)-( Salary*rTire)
                3 -> bonus = Salary + (Salary*0.3)-( Salary*rTire)
                4 -> bonus = Salary + (Salary*0.4)-( Salary*rTire)
                5 -> bonus = Salary + (Salary*0.5)-( Salary*rTire)
                else -> message= "Please enter a valid input"
            }
            tvResult.text = "Hi ${edtName},${edtNumber}\n" +
                            "The bonus is ${bonus}\n" +
                            "You will be sent an email on ${edtEmail}"

            }

        }
    }
