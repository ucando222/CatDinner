package com.example.catdinner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.CompoundButton
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        button.setOnClickListener{view ->

            dinner_tv.text = ""

            if (checkBox.isChecked == true)
            {
                dinner_tv.append("아침을 00:00시에 먹었습니다.\n");
            }
            if (checkBox2.isChecked == true)
            {
                dinner_tv.append("점심을 00:00시에 먹었습니다.\n");
            }
            if (checkBox3.isChecked == true)
            {
                dinner_tv.append("저녁을 00:00시에 먹었습니다.\n");
            }
        }

        check_btn.setOnClickListener{view->
            checkBox.isChecked == true;
            checkBox2.isChecked == true;
            checkBox3.isChecked == true;
        }
    }

    var listener1 = CheckBoxListener()


    inner class CheckBoxListener : CompoundButton.OnCheckedChangeListener{

        override fun onCheckedChanged(buttonView: CompoundButton?, p1: Boolean) {
            if(p1 == true)
            {
                textView.text = "아침을 먹었습니다."
            }
            else
            {
                textView.text = "아침을 먹지 않았습니다."
            }



            checkBox2.setOnCheckedChangeListener{compoundButton, b->
                if(b == true)
                {
                    textView.text = "점심을 먹었습니다."
                }
                else
                {
                    textView.text = "점심을 먹지 않았습니다."
                }
            }

            checkBox3.setOnCheckedChangeListener{compoundButton, b->
                if(b == true)
                {
                    textView.text = "저녁을 먹었습니다."
                }
                else
                {
                    textView.text = "저녁을 먹지 않았습니다."
                }
            }
        }
    }
}