package com.example.exercise4

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val c: Calendar = Calendar.getInstance();
    val mYear = c.get(Calendar.YEAR);
    val mMonth = c.get(Calendar.MONTH);
    val mDay = c.get(Calendar.DAY_OF_MONTH);
    var minSaving:Double = 0.00
    var age:Int = 0
    var extra:Double = 0.00

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textSelectBirthday.setOnClickListener() {

            val datePickerDialog = DatePickerDialog(
                this,
                DatePickerDialog.OnDateSetListener { view, year, monthOfYear, dayOfMonth ->
                    textSelectBirthday.setText(dayOfMonth.toString() + "-" + (monthOfYear + 1) + "-" + year)
                }, mYear, mMonth, mDay
            )
            datePickerDialog.show();

            if(mYear >= 2015 || mYear <= 2019)
            {
                minSaving = 5000.00
            }
            else if (mYear >= 2000 || mYear <= 2014)
            {
                minSaving = 14000.00
            }
            else if (mYear >= 1995 || mYear <= 1999)
            {
                minSaving = 29000.00
            }
            else if (mYear >= 1990 || mYear <= 1994)
            {
                minSaving = 50000.00
            }
            else if (mYear >= 1985 || mYear <= 1989)
            {
                minSaving = 78000.00
            }
            else if (mYear >= 1980 || mYear <= 1984)
            {
                minSaving = 116000.00
            }
            else if (mYear >= 1975 || mYear <= 1979)
            {
                minSaving = 165000.00
            }
            else if (mYear >= 1970 || mYear <= 1974)
            {
                minSaving = 228000.00
            }

            if (checkMember.isChecked){
                extra = minSaving * 0.3
                minSaving = minSaving + extra
            minSaving.toString()}

            age = 2019 - mYear

            textMin.setText(minSaving)
            textAge2.setText(age)



        }
    }
}
