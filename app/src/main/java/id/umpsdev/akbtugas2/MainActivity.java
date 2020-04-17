package id.umpsdev.akbtugas2;
/**
 Nama    : Siti Safira Nadifa
 NIM     : 10117904
 Kelas   : IF-6K
 log History
 - 16 April 2020 02.00 Layouting Main Activity
 - 17 April 2020 19.15 Layouting Register Activity
 - 17 April 2020 23.00 Layouting Almost Activity

 */
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btn_Register (View v){
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
        finish();
    }
}
