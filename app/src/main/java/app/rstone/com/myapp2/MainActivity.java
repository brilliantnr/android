package app.rstone.com.myapp2;

        import android.content.Context;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.EditText;
        import android.widget.TextView;
        import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Context ctx = MainActivity.this;

        findViewById(R.id.btn1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText num1 = findViewById(R.id.num1);
                EditText num2 = findViewById(R.id.num2);
                String sNum1 = num1.getText().toString();
                String sNum2 = num2.getText().toString();
                int n1 = Integer.parseInt(sNum1);
                int n2 = Integer.parseInt(sNum2);
                String res = String.valueOf(n1 +n2);
                TextView result = findViewById(R.id.result);
                result.setText(res);
                Toast.makeText(ctx,"입력한 숫자값:"+sNum1+"+"+sNum2,Toast.LENGTH_LONG).show();
            }
        });
        findViewById(R.id.btn2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText num1 = findViewById(R.id.num1);
                EditText num2 = findViewById(R.id.num2);
                String sNum1 = num1.getText().toString();
                String sNum2 = num2.getText().toString();
                int n1 = Integer.parseInt(sNum1);
                int n2 = Integer.parseInt(sNum2);
                String res = String.valueOf(n1-n2);
                TextView result = findViewById(R.id.result);
                result.setText(res);
                Toast.makeText(ctx,"입력한 숫자값:"+sNum1+"-"+sNum2,Toast.LENGTH_LONG).show();
            }
        });
        findViewById(R.id.btn3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText num1 = findViewById(R.id.num1);
                EditText num2 = findViewById(R.id.num2);
                String sNum1 = num1.getText().toString();
                String sNum2 = num2.getText().toString();
                int n1 = Integer.parseInt(sNum1);
                int n2 = Integer.parseInt(sNum2);
                String res = String.valueOf(n1 * n2);
                TextView result = findViewById(R.id.result);
                result.setText(res);
                Toast.makeText(ctx,"입력한 숫자값:"+sNum1+"*"+sNum2,Toast.LENGTH_LONG).show();
            }
        });
        findViewById(R.id.btn4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText num1 = findViewById(R.id.num1);
                EditText num2 = findViewById(R.id.num2);
                String sNum1 = num1.getText().toString();
                String sNum2 = num2.getText().toString();
                int n1 = Integer.parseInt(sNum1);
                int n2 = Integer.parseInt(sNum2);
                String res = String.valueOf(n1/n2);
                TextView result = findViewById(R.id.result);
                result.setText(res);
                Toast.makeText(ctx,"입력한 숫자값:"+sNum1+"/"+sNum2,Toast.LENGTH_LONG).show();
            }
        });



    }
}
