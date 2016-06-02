package samo92.mx.muvonv20;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.facebook.login.LoginManager;

/**
 * Created by samo92 on 2/06/16.
 */
    public class HomeActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_home);

            (findViewById(R.id.logout_button)).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    LoginManager.getInstance().logOut();
                    Intent intent = new Intent(HomeActivity.this,MainActivity.class);
                    startActivity(intent);
                }
            });
        }
    }
