package id.umpsdev.akbtugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void action_almost (View v){
        Intent intent = new Intent(this, AlmostActivity.class);
        startActivity(intent);
        finish();
    }
}
