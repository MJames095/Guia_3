package sv.edu.udb.dsm.guia3.ejemplo2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private Button btFrame, btLinear, btRelative, btGrid, btTable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickFrame(View v) {
        Intent llamar = new Intent( getApplicationContext(), ejemplo_frame_layout.class);
        startActivity(llamar);
    }

    public void onClickLinear(View v) {
        Intent llamar = new Intent( getApplicationContext(), ejemplo_linear_layout.class);
        startActivity(llamar);
    }

    public void onClickRelative(View v) {
        Intent llamar = new Intent( getApplicationContext(), ejemplo_relative_layout.class);
        startActivity(llamar);
    }

    public void onClickTable(View v) {
        Intent llamar = new Intent( getApplicationContext(), ejemplo_table_layout.class);
        startActivity(llamar);
    }

    public void onClickGrid(View v) {
        Intent llamar = new Intent( getApplicationContext(), ejemplo_grid_layout.class);
        startActivity(llamar);
    }
}