package com.miu.tablelayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.TableRow
import android.widget.TextView
import android.graphics.Color
import androidx.core.view.marginTop
import androidx.core.view.setPadding
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        add.setOnClickListener{
            if(version.text.toString().isNullOrEmpty()||codeName.text.toString().isNullOrEmpty()) {
                Toast.makeText(this, "Please Enter Android version and code name", Toast.LENGTH_LONG).show()

            }
            else{
                val tableRow = TableRow(getApplicationContext())

// Set new table row layout parameters.
                val layoutParams = TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT)
                layoutParams.setMargins(5, 5, 5, 5)
                tableRow.setLayoutParams(layoutParams)



//create textview
                val Tv1 = TextView(this)

                Tv1.text = version.text.toString()
                Tv1.layoutParams = layoutParams
                Tv1.textSize = 20F
                Tv1.setBackgroundColor(Color.parseColor("#D81B60"))


                val Tv2 = TextView(this)
                Tv2.text = codeName.text.toString()
                Tv2.layoutParams = layoutParams
                Tv2.textSize = 20F

                Tv2.setBackgroundColor(Color.parseColor("#D81B60"))


// add values into row by calling addView()
                tableRow.addView(Tv1, 0)
                tableRow.addView(Tv2, 1)

// Finally add the created row into layout
                tab.addView(tableRow) // id from Layout_file

                // clear the  version and codeName Textboxes
                version.text=null
                codeName.text=null

            }

        }

    }

}