package com.example.riady.coba2;

/**
 * Created by Riady on 2/8/2015.
 */
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class ResultActivity extends Activity {

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();

        setContentView(R.layout.activity_result);

        TextView text = (TextView) findViewById(R.id.displayintentextra);

        text.setText(extras.getString("data"));

    }

    @Override
    public void finish() {

         Intent intent = new Intent();

        EditText ret = (EditText) findViewById(R.id.returnValue);
        String value = ret.getText().toString();

        intent.putExtra("dataret",value);

        setResult(RESULT_OK,intent);

        super.finish();
    }
}
