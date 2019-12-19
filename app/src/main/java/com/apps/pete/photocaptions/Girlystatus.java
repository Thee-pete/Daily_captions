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

public class Girlystatus extends AppCompatActivity {
    private AdView girlystatusbanner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_girlystatus);
        MobileAds.initialize(this, "ca-app-pub-3609953011019731~1851437217");
        girlystatusbanner = findViewById(R.id.girlystatusbanner);
        AdRequest adRequest = new AdRequest.Builder().build();
        girlystatusbanner.loadAd(adRequest);
    }
    public void copybuttononClick(View view)
    {
        TextView girlyone = (TextView) findViewById(R.id.girlyone);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(girlyone.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void sharebuttononClick(View view)
    {
        TextView girlyone = (TextView) findViewById(R.id.girlyone);

        String s = girlyone.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy1buttononClick(View view)
    {
        TextView girlytwo = (TextView) findViewById(R.id.girlytwo);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(girlytwo.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share1buttononClick(View view)
    {
        TextView girlytwo = (TextView) findViewById(R.id.girlytwo);

        String s = girlytwo.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy2buttononClick(View view)
    {
        TextView girlythree = (TextView) findViewById(R.id.girlythree);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(girlythree.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share2buttononClick(View view)
    {
        TextView girlythree = (TextView) findViewById(R.id.girlythree);

        String s = girlythree.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy4buttononClick(View view)
    {
        TextView girlyfour = (TextView) findViewById(R.id.girlyfour);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(girlyfour.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share4buttononClick(View view)
    {
        TextView girlyfour = (TextView) findViewById(R.id.girlyfour);

        String s = girlyfour.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy5buttononClick(View view)
    {
        TextView girlyfive = (TextView) findViewById(R.id.girlyfive);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(girlyfive.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share5buttononClick(View view)
    {
        TextView girlyfive = (TextView) findViewById(R.id.girlyfive);

        String s = girlyfive.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy6buttononClick(View view)
    {
        TextView girlysix = (TextView) findViewById(R.id.girlysix);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(girlysix.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share6buttononClick(View view)
    {
        TextView girlysix = (TextView) findViewById(R.id.girlysix);

        String s = girlysix.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy7buttononClick(View view)
    {
        TextView girlyseven = (TextView) findViewById(R.id.girlyseven);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(girlyseven.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share7buttononClick(View view)
    {
        TextView girlyseven = (TextView) findViewById(R.id.girlyseven);

        String s = girlyseven.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy8buttononClick(View view)
    {
        TextView girlyeight = (TextView) findViewById(R.id.girlyeight);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(girlyeight.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share8buttononClick(View view)
    {
        TextView girlyeight = (TextView) findViewById(R.id.girlyeight);

        String s = girlyeight.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy9buttononClick(View view)
    {
        TextView girlynine = (TextView) findViewById(R.id.girlynine);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(girlynine.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share9buttononClick(View view)
    {
        TextView girlynine = (TextView) findViewById(R.id.girlynine);

        String s = girlynine.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy10buttononClick(View view)
    {
        TextView girlyten = (TextView) findViewById(R.id.girlyten);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(girlyten.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share10buttononClick(View view)
    {
        TextView girlyten = (TextView) findViewById(R.id.girlyten);

        String s = girlyten.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
}
