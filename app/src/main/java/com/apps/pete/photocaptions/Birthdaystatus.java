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

public class Birthdaystatus extends AppCompatActivity {
    private AdView birthdaystatusbanner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birthdaystatus);
        MobileAds.initialize(this, "ca-app-pub-3609953011019731~1851437217");
        birthdaystatusbanner = findViewById(R.id.birthdaybanner);
        AdRequest adRequest = new AdRequest.Builder().build();
        birthdaystatusbanner.loadAd(adRequest);
    }
    public void copybuttononClick(View view)
    {
        TextView birthdayone = (TextView) findViewById(R.id.birthdayone);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(birthdayone.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void sharebuttononClick(View view)
    {
        TextView birthdayone = (TextView) findViewById(R.id.birthdayone);

        String s = birthdayone.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy1buttononClick(View view)
    {
        TextView birthdaytwo = (TextView) findViewById(R.id.birthdaytwo);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(birthdaytwo.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share1buttononClick(View view)
    {
        TextView birthdaytwo = (TextView) findViewById(R.id.birthdaytwo);

        String s = birthdaytwo.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy2buttononClick(View view)
    {
        TextView birthdaythree = (TextView) findViewById(R.id.birthdaythree);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(birthdaythree.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share2buttononClick(View view)
    {
        TextView birthdaythree = (TextView) findViewById(R.id.birthdaythree);

        String s = birthdaythree.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy4buttononClick(View view)
    {
        TextView birthdayfour = (TextView) findViewById(R.id.birthdayfour);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(birthdayfour.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share4buttononClick(View view)
    {
        TextView birthdayfour = (TextView) findViewById(R.id.birthdayfour);

        String s = birthdayfour.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy5buttononClick(View view)
    {
        TextView birthdayfive = (TextView) findViewById(R.id.birthdayfive);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(birthdayfive.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share5buttononClick(View view)
    {
        TextView birthdayfive = (TextView) findViewById(R.id.birthdayfive);

        String s = birthdayfive.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy6buttononClick(View view)
    {
        TextView birthdaysix = (TextView) findViewById(R.id.birthdaysix);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(birthdaysix.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share6buttononClick(View view)
    {
        TextView birthdaysix = (TextView) findViewById(R.id.birthdaysix);

        String s = birthdaysix.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy7buttononClick(View view)
    {
        TextView birthdayseven = (TextView) findViewById(R.id.birthdayseven);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(birthdayseven.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share7buttononClick(View view)
    {
        TextView birthdayseven = (TextView) findViewById(R.id.birthdayseven);

        String s = birthdayseven.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy8buttononClick(View view)
    {
        TextView birthdayeight = (TextView) findViewById(R.id.birthdayeight);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(birthdayeight.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share8buttononClick(View view)
    {
        TextView birthdayeight = (TextView) findViewById(R.id.birthdayeight);

        String s = birthdayeight.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy9buttononClick(View view)
    {
        TextView birthdaynine = (TextView) findViewById(R.id.birthdaynine);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(birthdaynine.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share9buttononClick(View view)
    {
        TextView birthdaynine = (TextView) findViewById(R.id.birthdaynine);

        String s = birthdaynine.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy10buttononClick(View view)
    {
        TextView birthdayten = (TextView) findViewById(R.id.birthdayten);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(birthdayten.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share10buttononClick(View view)
    {
        TextView birthdayten = (TextView) findViewById(R.id.birthdayten);

        String s = birthdayten.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
}
