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

public class HolidaymsgsstatusActivity extends AppCompatActivity {
    private AdView holidaystatusbanner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_holidaymsgsstatus);
        MobileAds.initialize(this, "ca-app-pub-3609953011019731~1851437217");
        holidaystatusbanner = findViewById(R.id.holidaymsgsstatusbanner);
        AdRequest adRequest = new AdRequest.Builder().build();
        holidaystatusbanner.loadAd(adRequest);
    }
    public void copybuttononClick(View view)
    {
        TextView holidayone = (TextView) findViewById(R.id.holidayone);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(holidayone.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void sharebuttononClick(View view)
    {
        TextView holidayone = (TextView) findViewById(R.id.holidayone);

        String s = holidayone.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy1buttononClick(View view)
    {
        TextView holidaytwo = (TextView) findViewById(R.id.holidaytwo);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(holidaytwo.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share1buttononClick(View view)
    {
        TextView holidaytwo = (TextView) findViewById(R.id.holidaytwo);

        String s = holidaytwo.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy2buttononClick(View view)
    {
        TextView holidaythree = (TextView) findViewById(R.id.holidaythree);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(holidaythree.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share2buttononClick(View view)
    {
        TextView holidaythree = (TextView) findViewById(R.id.holidaythree);

        String s = holidaythree.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy4buttononClick(View view)
    {
        TextView holidayfour = (TextView) findViewById(R.id.holidayfour);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(holidayfour.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share4buttononClick(View view)
    {
        TextView holidayfour = (TextView) findViewById(R.id.holidayfour);

        String s = holidayfour.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy5buttononClick(View view)
    {
        TextView holidayfive = (TextView) findViewById(R.id.holidayfive);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(holidayfive.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share5buttononClick(View view)
    {
        TextView holidayfive = (TextView) findViewById(R.id.holidayfive);

        String s = holidayfive.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy6buttononClick(View view)
    {
        TextView holidaysix = (TextView) findViewById(R.id.holidaysix);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(holidaysix.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share6buttononClick(View view)
    {
        TextView holidaysix = (TextView) findViewById(R.id.holidaysix);

        String s = holidaysix.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy7buttononClick(View view)
    {
        TextView holidayseven = (TextView) findViewById(R.id.holidayseven);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(holidayseven.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share7buttononClick(View view)
    {
        TextView holidayseven = (TextView) findViewById(R.id.holidayseven);

        String s = holidayseven.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy8buttononClick(View view)
    {
        TextView holidayeight = (TextView) findViewById(R.id.holidayeight);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(holidayeight.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share8buttononClick(View view)
    {
        TextView holidayeight = (TextView) findViewById(R.id.holidayeight);

        String s = holidayeight.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy9buttononClick(View view)
    {
        TextView holidaynine = (TextView) findViewById(R.id.holidaynine);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(holidaynine.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share9buttononClick(View view)
    {
        TextView holidaynine = (TextView) findViewById(R.id.holidaynine);

        String s = holidaynine.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy10buttononClick(View view)
    {
        TextView holidayten = (TextView) findViewById(R.id.holidayten);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(holidayten.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share10buttononClick(View view)
    {
        TextView holidayten = (TextView) findViewById(R.id.holidayten);

        String s = holidayten.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
}
