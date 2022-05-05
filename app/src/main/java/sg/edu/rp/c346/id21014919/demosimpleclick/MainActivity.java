package sg.edu.rp.c346.id21014919.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    //1
    Button btnClickMe;
    EditText etInput;
    TextView tv;
    ToggleButton tbtn;
    RadioGroup rgGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //2 - bridge UI with controller
        btnClickMe = findViewById(R.id.btnClickMe);
        tv = findViewById(R.id.tv);
        etInput = findViewById(R.id.etInput);
        tbtn = findViewById(R.id.toggleButton);
        rgGender = findViewById(R.id.rgGender);    //null object errors

        //3 - set event listener
        btnClickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //4 - set actions
                if (tbtn.isChecked() == true) {
                    String data = etInput.getText().toString();
                    int selectedID = rgGender.getCheckedRadioButtonId();

                    if (tbtn.isChecked() == true) {
                        tv.setText("Hi, Mr. " + data);
                    } else {
                        tv.setText("Hi, Ms. " + data);
                    }


                }

            }
        });

        tbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Add your code for the action
                if (tbtn.isChecked() == true) {
                    btnClickMe.setEnabled(true);
                } else {
                    btnClickMe.setEnabled(false);
                }

            }

        });
    };
}