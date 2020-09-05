package com.miu.tablelayout

import android.os.Bundle
import android.view.Gravity
import android.widget.TableLayout
import android.widget.TableRow
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addBtn.setOnClickListener{
            // Create a new table row.
            val tableRow = TableRow(getApplicationContext())
            // Set new table row layout parameters.
            val layoutParams = TableRow.LayoutParams(TableLayout.LayoutParams.FILL_PARENT,TableRow.LayoutParams.WRAP_CONTENT)
            tableRow.setLayoutParams(layoutParams)
 //add values into row by calling addView()
        var txtversion:TextView =TextView(this)
            var txtname:TextView =TextView(this)
         //   txtversion.height=1;
       //     txtname.height=1;
      //     txtname.textSize=15F
         //   txtversion.textSize=15F
            txtversion.setLayoutParams(TableRow.LayoutParams(TableLayout.LayoutParams.FILL_PARENT,
                TableLayout.LayoutParams.WRAP_CONTENT))

            txtname.setLayoutParams(TableRow.LayoutParams(TableLayout.LayoutParams.FILL_PARENT,
                TableLayout.LayoutParams.WRAP_CONTENT))

           txtversion.setText(addAndroidVersionText.getText())
            txtversion.setGravity(Gravity.CENTER)
       //     txtversion.setPadding(15,15,15,15)

            txtname.setText(addAndroidCodeText.getText())
            txtname.setGravity(Gravity.CENTER)
        //    txtname.setPadding(100,15,900,15)

             tableRow.addView(txtversion, 0)
            tableRow.addView(txtname, 1)
// Finally add the created row row into layout
            layoutId.addView(tableRow) // id from Layout_file
        }
    }
}