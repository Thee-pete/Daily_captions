package com.apps.pete.photocaptions;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class Emotionalstatus extends AppCompatActivity {
    private AdView emotionalstatusbanner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emotionalstatus);
        MobileAds.initialize(this, "ca-app-pub-3609953011019731~1851437217");
        emotionalstatusbanner = findViewById(R.id.emotionalstatusbanner);
        AdRequest adRequest = new AdRequest.Builder().build();
        emotionalstatusbanner.loadAd(adRequest);
    }
    public void copybuttononClick(View view)
    {
        TextView emotionalone = (TextView) findViewById(R.id.emotionalone);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(emotionalone.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void sharebuttononClick(View view)
    {
        TextView emotionalone = (TextView) findViewById(R.id.emotionalone);

        String s = emotionalone.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy1buttononClick(View view)
    {
        TextView emotionaltwo = (TextView) findViewById(R.id.emotionaltwo);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(emotionaltwo.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share1buttononClick(View view)
    {
        TextView emotionaltwo = (TextView) findViewById(R.id.emotionaltwo);

        String s = emotionaltwo.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy2buttononClick(View view)
    {
        TextView emotionalthree = (TextView) findViewById(R.id.emotionalthree);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(emotionalthree.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share2buttononClick(View view)
    {
        TextView emotionalthree = (TextView) findViewById(R.id.emotionalthree);

        String s = emotionalthree.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy4buttononClick(View view)
    {
        TextView emotionalfour = (TextView) findViewById(R.id.emotionalfour);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(emotionalfour.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share4buttononClick(View view)
    {
        TextView emotionalfour = (TextView) findViewById(R.id.emotionalfour);

        String s = emotionalfour.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy5buttononClick(View view)
    {
        TextView emotionalfive = (TextView) findViewById(R.id.emotionalfive);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(emotionalfive.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share5buttononClick(View view)
    {
        TextView emotionalfive = (TextView) findViewById(R.id.emotionalfive);

        String s = emotionalfive.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy6buttononClick(View view)
    {
        TextView emotionalsix = (TextView) findViewById(R.id.emotionalsix);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(emotionalsix.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share6buttononClick(View view)
    {
        TextView emotionalsix = (TextView) findViewById(R.id.emotionalsix);

        String s = emotionalsix.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy7buttononClick(View view)
    {
        TextView emotionalseven = (TextView) findViewById(R.id.emotionalseven);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(emotionalseven.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share7buttononClick(View view)
    {
        TextView emotionalseven = (TextView) findViewById(R.id.emotionalseven);

        String s = emotionalseven.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy8buttononClick(View view)
    {
        TextView emotionaleight = (TextView) findViewById(R.id.emotionaleight);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(emotionaleight.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share8buttononClick(View view)
    {
        TextView emotionaleight = (TextView) findViewById(R.id.emotionaleight);

        String s = emotionaleight.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy9buttononClick(View view)
    {
        TextView emotionalnine = (TextView) findViewById(R.id.emotionalnine);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(emotionalnine.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share9buttononClick(View view)
    {
        TextView emotionalnine = (TextView) findViewById(R.id.emotionalnine);

        String s = emotionalnine.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy10buttononClick(View view)
    {
        TextView emotionalten = (TextView) findViewById(R.id.emotionalten);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(emotionalten.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share10buttononClick(View view)
    {
        TextView emotionalten = (TextView) findViewById(R.id.emotionalten);

        String s = emotionalten.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
}
