package academy.android.vietnam.trungnt.test2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editTextName;
    Button btnDisplay;
    TextView txtName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        connectView();
    }

    private void connectView()
    {
        editTextName = (EditText) this.findViewById(R.id.editTextName);
        btnDisplay = (Button) this.findViewById(R.id.btnDisplay);
        txtName = (TextView) this.findViewById(R.id.txtName);

        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editTextName.getText().toString();
                txtName.setText(name);
            }
        });

    }
}
