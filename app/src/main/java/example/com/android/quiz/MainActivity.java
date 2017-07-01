package example.com.android.quiz;

import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    LinearLayout linearLayout;
    RadioButton radioButton;
    RadioGroup radioGroup1, radioGroup2, radioGroup3;
    CheckBox checkBox1, checkBox2, checkBox3, checkBox4;
    EditText etQ4ans;
    Button button;
    int ans;
    int score;
    int tempCheck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linearLayout = (LinearLayout) findViewById(R.id.activity_main);
        radioGroup1 = (RadioGroup) findViewById(R.id.radioGroup1);
        radioGroup2 = (RadioGroup) findViewById(R.id.radioGroup2);
        radioGroup3 = (RadioGroup) findViewById(R.id.radioGroup3);
        checkBox1 = (CheckBox) findViewById(R.id.q5opt1);
        checkBox2 = (CheckBox) findViewById(R.id.q5opt2);
        checkBox3 = (CheckBox) findViewById(R.id.q5opt3);
        checkBox4 = (CheckBox) findViewById(R.id.q5opt4);
        etQ4ans = (EditText) findViewById(R.id.etQ4Ans);
        button = (Button) findViewById(R.id.submitButton);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {

                if((ans=radioGroup1.getCheckedRadioButtonId())!=-1)
                {
                    radioButton = (RadioButton) findViewById(ans);
                    if (radioButton.getText().equals(getResources().getString(R.string.q1opt4))) {
                        score += 10;
                        radioButton.setTypeface(null, Typeface.BOLD_ITALIC);
                        radioButton.setTextColor(Color.GREEN);
                    }
                    else {
                        radioButton.setTextColor(Color.RED);
                        radioButton.setTypeface(null, Typeface.BOLD_ITALIC);
                    }
                }

                if((ans=radioGroup2.getCheckedRadioButtonId())!=-1)
                {
                    radioButton = (RadioButton) findViewById(ans);
                    if (radioButton.getText().equals(getResources().getString(R.string.q2opt1))) {
                        score += 10;
                        radioButton.setTypeface(null, Typeface.BOLD_ITALIC);
                        radioButton.setTextColor(Color.GREEN);
                    }
                    else {
                        radioButton.setTextColor(Color.RED);
                        radioButton.setTypeface(null, Typeface.BOLD_ITALIC);
                    }
                }

                if((ans=radioGroup3.getCheckedRadioButtonId())!=-1)
                {
                    radioButton = (RadioButton) findViewById(ans);
                    if (radioButton.getText().equals(getResources().getString(R.string.q3opt3))) {
                        score += 10;
                        radioButton.setTypeface(null, Typeface.BOLD_ITALIC);
                        radioButton.setTextColor(Color.GREEN);
                    }
                    else {
                        radioButton.setTextColor(Color.RED);
                        radioButton.setTypeface(null, Typeface.BOLD_ITALIC);
                    }
                }

                String temp=etQ4ans.getText().toString().toUpperCase();
                if(temp.equals(getResources().getString(R.string.q4ans)))
                {
                    score+=10;
                    etQ4ans.setTypeface(null,Typeface.BOLD_ITALIC);
                    etQ4ans.setTextColor(Color.GREEN);
                }
                else {
                    etQ4ans.setTypeface(null, Typeface.BOLD_ITALIC);
                    etQ4ans.setTextColor(Color.RED);
                }

                if(checkBox1.isChecked())
                {
                    tempCheck++;
                    checkBox1.setTypeface(null,Typeface.BOLD_ITALIC);
                    checkBox1.setTextColor(Color.GREEN);
                    if(tempCheck<3)
                    {
                        score+=5;
                    }
                    if(tempCheck>=3)
                    {
                        score-=5;
                    }
                }
                if(checkBox2.isChecked())
                {
                    tempCheck++;
                    checkBox2.setTypeface(null,Typeface.BOLD_ITALIC);
                    checkBox2.setTextColor(Color.GREEN);
                    if(tempCheck<3)
                    {
                        score+=5;
                    }
                    if(tempCheck>=3)
                    {
                        score-=5;
                    }
                }
                if(checkBox3.isChecked())
                {
                    tempCheck++;
                    checkBox3.setTypeface(null,Typeface.BOLD_ITALIC);
                    checkBox3.setTextColor(Color.RED);
                    if(tempCheck>=3)
                    {
                        score-=5;
                    }
                }
                if(checkBox4.isChecked())
                {
                    tempCheck++;
                    checkBox4.setTypeface(null,Typeface.BOLD_ITALIC);
                    checkBox4.setTextColor(Color.RED);
                    if(tempCheck>=3)
                    {
                        score-=5;
                    }
                }
                Toast.makeText(getBaseContext(),"You Scored "+score,Toast.LENGTH_LONG).show();
                button.setEnabled(false);
            }

        });
        
    }
}
