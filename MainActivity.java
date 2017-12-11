package cimdata.android.dez2017.hoecalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public static final String AB_MAIN_ACTIVITY = "AB -- MainActivity";

    TextView textView;
    Button button1, button2, button3;
    //public String sum_str = "";
    int sum_int = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.calc_out);
        button1 = findViewById(R.id.btn_01);
        button2 = findViewById(R.id.btn_02);
        button3 = findViewById(R.id.btn_03);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        String sum_str = "";
        switch (id) {
            case R.id.btn_01:
                sum_str = view.toString();
                Log.d(AB_MAIN_ACTIVITY, "button1"+sum_str);
                sum_str = sum_str + "1";
                break;
            case R.id.btn_02:
                Log.d(AB_MAIN_ACTIVITY, "button2");
                sum_str += 2;
                break;
            case R.id.btn_03:
                Log.d(AB_MAIN_ACTIVITY, "button3");
                sum_str += 3;
                break;
            default:
                Log.d(AB_MAIN_ACTIVITY, "default");
                break;
        }


        // Log.v("test "," blabla: "+vstr);
        textView.setText("test 1:  " + sum_str);
    }


    public class Rechner {

        /**
         *
         * @param a
         *            - Zahl1
         * @param b
         *            - Zahl2
         * @param op
         *            - ein Operator (+,-,*,/)
         * @return - Ergebnis der Berechnung
         */
        public  double rechne(double a, double b, char op) {
            // switch case verwenden
            double result = Double.NaN;/// Double.isNaN(v) balbal

            switch (op) {
                case '+':
                    result = a + b;
                    break;
                case '-':
                    result = a - b;
                    break;
                case '*':
                    result = a * b;
                    break;
                case '/':
                    if (b == 0) {
                        return Double.NaN;// TODO Exception werfen
                    }
                    result = a / b;
                    break;

                default:
                    System.out.println("kein gültiger Operator");
                    ;
            }

            return result; // TODO richtiges Ergebnis einsetzen!!!

        }
    }


}
