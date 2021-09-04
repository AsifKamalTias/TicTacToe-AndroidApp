package com.example.connect3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int selectedPlayer = 0;
    int winner;

    public boolean GameOver(){
        ImageView i11 = findViewById(R.id.i11);
        ImageView i12 = findViewById(R.id.i12);
        ImageView i13 = findViewById(R.id.i13);
        ImageView i14 = findViewById(R.id.i14);
        ImageView i15 = findViewById(R.id.i15);
        ImageView i16 = findViewById(R.id.i16);
        ImageView i17 = findViewById(R.id.i17);
        ImageView i18 = findViewById(R.id.i18);
        ImageView i19 = findViewById(R.id.i19);

        int t11 = Integer.parseInt(i11.getTag().toString());
        int t12 = Integer.parseInt(i12.getTag().toString());
        int t13 = Integer.parseInt(i13.getTag().toString());
        int t14 = Integer.parseInt(i14.getTag().toString());
        int t15 = Integer.parseInt(i15.getTag().toString());
        int t16 = Integer.parseInt(i16.getTag().toString());
        int t17 = Integer.parseInt(i17.getTag().toString());
        int t18 = Integer.parseInt(i18.getTag().toString());
        int t19 = Integer.parseInt(i19.getTag().toString());

        //player 0
        if(t11==0 && t12==0 && t13==0){
            winner = 0;
            return true;
        }
        else if(t14==0 && t15==0 && t16==0){
            winner = 0;
            return true;
        }
        else if(t17==0 && t18==0 && t19==0){
            winner = 0;
            return true;
        }
        else if(t11==0 && t14==0 && t17==0){
            winner = 0;
            return true;
        }
        else if(t12==0 && t15==0 && t18==0){
            winner = 0;
            return true;
        }
        else if(t13==0 && t16==0 && t19==0){
            winner = 0;
            return true;
        }
        else if(t11==0 && t15==0 && t19==0){
            winner = 0;
            return true;
        }
        else if(t13==0 && t15==0 && t17==0){
            winner = 0;
            return true;
        }
        //player1
        if(t11==1 && t12==1 && t13==1){
            winner = 1;
            return true;
        }
        else if(t14==1 && t15==1 && t16==1){
            winner = 1;
            return true;
        }
        else if(t17==1 && t18==1 && t19==1){
            winner = 1;
            return true;
        }
        else if(t11==1 && t14==1 && t17==1){
            winner = 1;
            return true;
        }
        else if(t12==1 && t15==1 && t18==1){
            winner = 1;
            return true;
        }
        else if(t13==1 && t16==1 && t19==1){
            winner = 1;
            return true;
        }
        else if(t11==1 && t15==1 && t19==1){
            winner = 1;
            return true;
        }
        else if(t13==1 && t15==1 && t17==1){
            winner = 1;
            return true;
        }
        else {
            return false;
        }
    }

    public boolean Draw(){
//        for(int i = 11; i<=19; i++){
//            int tag = Integer.parseInt(findViewById(R.id.i11).getTag().toString());
//        }
        ImageView i11 = findViewById(R.id.i11);
        ImageView i12 = findViewById(R.id.i12);
        ImageView i13 = findViewById(R.id.i13);
        ImageView i14 = findViewById(R.id.i14);
        ImageView i15 = findViewById(R.id.i15);
        ImageView i16 = findViewById(R.id.i16);
        ImageView i17 = findViewById(R.id.i17);
        ImageView i18 = findViewById(R.id.i18);
        ImageView i19 = findViewById(R.id.i19);

        int t11 = Integer.parseInt(i11.getTag().toString());
        int t12 = Integer.parseInt(i12.getTag().toString());
        int t13 = Integer.parseInt(i13.getTag().toString());
        int t14 = Integer.parseInt(i14.getTag().toString());
        int t15 = Integer.parseInt(i15.getTag().toString());
        int t16 = Integer.parseInt(i16.getTag().toString());
        int t17 = Integer.parseInt(i17.getTag().toString());
        int t18 = Integer.parseInt(i18.getTag().toString());
        int t19 = Integer.parseInt(i19.getTag().toString());

        if((t11==0 || t11 ==1) && (t12==0 || t12 ==1) && (t13==0 || t13 ==1) && (t14==0 || t14 ==1) && (t15==0 || t15 ==1) && (t16==0 || t16 ==1) && (t17==0 || t17 ==1) && (t18==0 || t18 ==1) && (t19==0 || t19 ==1)){
            return true;
        }
        else {
            return false;
        }

    }

    public void DisableClick(){
        findViewById(R.id.i11).setEnabled(false);
        findViewById(R.id.i12).setEnabled(false);
        findViewById(R.id.i13).setEnabled(false);
        findViewById(R.id.i14).setEnabled(false);
        findViewById(R.id.i15).setEnabled(false);
        findViewById(R.id.i16).setEnabled(false);
        findViewById(R.id.i17).setEnabled(false);
        findViewById(R.id.i18).setEnabled(false);
        findViewById(R.id.i19).setEnabled(false);
    }

    public void TryAgain(View view){
//        Intent intent = getIntent();
//        finish();
//        startActivity(intent);
        try {
            TextView ps = findViewById(R.id.playerStatus);
            ps.setText("Player 1 Move");
            ps.setTextColor(Color.parseColor("#000000"));
            selectedPlayer = 0;

            ImageView i11 = findViewById(R.id.i11);
            i11.setImageResource(0);
            i11.setTag(11);
            i11.setEnabled(true);

            ImageView i12 = findViewById(R.id.i12);
            i12.setImageResource(0);
            i12.setTag(12);
            i12.setEnabled(true);

            ImageView i13 = findViewById(R.id.i13);
            i13.setImageResource(0);
            i13.setTag(13);
            i13.setEnabled(true);

            ImageView i14 = findViewById(R.id.i14);
            i14.setImageResource(0);
            i14.setTag(14);
            i14.setEnabled(true);

            ImageView i15 = findViewById(R.id.i15);
            i15.setImageResource(0);
            i15.setTag(15);
            i15.setEnabled(true);

            ImageView i16 = findViewById(R.id.i16);
            i16.setImageResource(0);
            i16.setTag(16);
            i16.setEnabled(true);

            ImageView i17 = findViewById(R.id.i17);
            i17.setImageResource(0);
            i17.setTag(17);
            i17.setEnabled(true);

            ImageView i18 = findViewById(R.id.i18);
            i18.setImageResource(0);
            i18.setTag(18);
            i18.setEnabled(true);

            ImageView i19 = findViewById(R.id.i19);
            i19.setImageResource(0);
            i19.setTag(19);
            i19.setEnabled(true);

            Button again = findViewById(R.id.btnPlayAgain);
            again.setVisibility(View.INVISIBLE);
        }
        catch (Exception e){
            e.printStackTrace();
            displayExceptionMessage(e.getMessage());
        }
    }
    public void displayExceptionMessage(String msg)
    {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    public void DropIn(View view){
        ImageView counter = (ImageView) view;
        TextView playerMove = findViewById(R.id.playerStatus);
        counter.setTranslationY(-1000f);
        if(selectedPlayer == 0){
            counter.setImageResource(R.drawable.yellow);
            counter.setTag(0);
            selectedPlayer = 1;
            playerMove.setText("Player 2 Move");
        }
        else {
            counter.setImageResource(R.drawable.red);
            counter.setTag(1);
            selectedPlayer = 0;
            playerMove.setText("Player 1 Move");
        }

        counter.animate().translationY(0f).rotation(360).setDuration(300);
        counter.setEnabled(false);
        if(Draw() == true){
            DisableClick();
            playerMove.setText("Drawn.");
            playerMove.setTextColor(Color.parseColor("#FF0000"));
            Button again = findViewById(R.id.btnPlayAgain);
            again.setVisibility(View.VISIBLE);
        }
        if(GameOver()){
            DisableClick();
            int won = winner+1;
            playerMove.setText("Player "+won+" Won.");
            playerMove.setTextColor(Color.parseColor("#FF0000"));
            Button again = findViewById(R.id.btnPlayAgain);
            again.setVisibility(View.VISIBLE);
        }

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}