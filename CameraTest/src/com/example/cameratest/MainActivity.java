package com.example.cameratest;
// This project is adopted from https://eclass.srv.ualberta.ca/mod/resource/view.php?id=1136415
import java.io.File;

import com.example.cameratest.R;

import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends Activity {

    Uri imageFileUri;
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        ImageButton button = (ImageButton) findViewById(R.id.TakeAPhoto);
        OnClickListener listener = new OnClickListener() {
            public void onClick(View v){
                takeAPhoto();
            }
        };
        button.setOnClickListener(listener);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    private static final int CAPTURE_IMAGE_ACTIVITY_REQUEST_CODE = 12345;
    
    public void takeAPhoto() {
		String path = Environment.getExternalStorageDirectory().getAbsolutePath() + "/MyCameraTest";
		File folder = new File(path);
		if (!folder.exists())	
			folder.mkdir();
		//TODO: Add your code here...
		//TODO: Add your code here...
		//TODO: Add your code here...
		//TODO: Add your code here...
		//TODO: Add your code here...
		//TODO: Add your code here...
		//TODO: Add your code here...
		//TODO: Add your code here...
    }
    
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		if (requestCode == CAPTURE_IMAGE_ACTIVITY_REQUEST_CODE){
			TextView tv = (TextView)findViewById(R.id.status);
			
			if (resultCode == RESULT_OK){
				//TODO: Add your code here...
				//TODO: Add your code here...
				//TODO: Add your code here...
				//TODO: Add your code here...
				//TODO: Add your code here...
				//TODO: Add your code here...
			}
			else
				if (resultCode == RESULT_CANCELED){
					tv.setText("Photo was canceled!");
				}
				else
					tv.setText("What happened?!!");
		}
    }
}
