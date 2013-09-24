package es.com.blogspot.retoappsmoviles.training01;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

	private TextView textView1;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		textView1 = (TextView) findViewById(R.id.textView1);
	}
	
	public void showMessage(View v){
		textView1.setText(getString(R.string.hello_world));
	}

}
