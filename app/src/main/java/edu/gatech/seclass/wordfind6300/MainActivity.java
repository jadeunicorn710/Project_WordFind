package edu.gatech.seclass.wordfind6300;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }

  public void openSettings(View view) {
    startActivity(new Intent(this, GameSettingActivity.class));
  }

  public void openStatistics(View view) {
    startActivity(new Intent(this, StatisticsMenuActivity.class));
  }

  public void startGame(View view) {
    startActivity(new Intent(this, GameActivity.class));
  }

}
