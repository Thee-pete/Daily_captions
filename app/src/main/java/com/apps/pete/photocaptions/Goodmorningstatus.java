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

public class Goodmorningstatus extends AppCompatActivity {
    private AdView goodmorningstatusbanner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goodmorningstatus);
        MobileAds.initialize(this, "ca-app-pub-3609953011019731~1851437217");
        goodmorningstatusbanner = findViewById(R.id.goodmorningstatusbanner);
        AdRequest adRequest = new AdRequest.Builder().build();
        goodmorningstatusbanner.loadAd(adRequest);
    }
    public void copybuttononClick(View view)
    {
        TextView goodmorningone = (TextView) findViewById(R.id.goodmorningone);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(goodmorningone.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void sharebuttononClick(View view)
    {
        TextView goodmorningone = (TextView) findViewById(R.id.goodmorningone);

        String s = goodmorningone.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy1buttononClick(View view)
    {
        TextView goodmorningtwo = (TextView) findViewById(R.id.goodmorningtwo);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(goodmorningtwo.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share1buttononClick(View view)
    {
        TextView goodmorningtwo = (TextView) findViewById(R.id.goodmorningtwo);

        String s = goodmorningtwo.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy2buttononClick(View view)
    {
        TextView goodmorningthree = (TextView) findViewById(R.id.goodmorningthree);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(goodmorningthree.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share2buttononClick(View view)
    {
        TextView goodmorningthree = (TextView) findViewById(R.id.goodmorningthree);

        String s = goodmorningthree.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy4buttononClick(View view)
    {
        TextView goodmorningfour = (TextView) findViewById(R.id.goodmorningfour);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(goodmorningfour.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share4buttononClick(View view)
    {
        TextView goodmorningfour = (TextView) findViewById(R.id.goodmorningfour);

        String s = goodmorningfour.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy5buttononClick(View view)
    {
        TextView goodmorningfive = (TextView) findViewById(R.id.goodmorningfive);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(goodmorningfive.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share5buttononClick(View view)
    {
        TextView goodmorningfive = (TextView) findViewById(R.id.goodmorningfive);

        String s = goodmorningfive.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy6buttononClick(View view)
    {
        TextView goodmorningsix = (TextView) findViewById(R.id.goodmorningsix);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(goodmorningsix.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share6buttononClick(View view)
    {
        TextView goodmorningsix = (TextView) findViewById(R.id.goodmorningsix);

        String s = goodmorningsix.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy7buttononClick(View view)
    {
        TextView goodmorningseven = (TextView) findViewById(R.id.goodmorningseven);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(goodmorningseven.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share7buttononClick(View view)
    {
        TextView goodmorningseven = (TextView) findViewById(R.id.goodmorningseven);

        String s = goodmorningseven.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy8buttononClick(View view)
    {
        TextView goodmorningeight = (TextView) findViewById(R.id.goodmorningeight);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(goodmorningeight.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share8buttononClick(View view)
    {
        TextView goodmorningeight = (TextView) findViewById(R.id.goodmorningeight);

        String s = goodmorningeight.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy9buttononClick(View view)
    {
        TextView goodmorningnine = (TextView) findViewById(R.id.goodmorningnine);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(goodmorningnine.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share9buttononClick(View view)
    {
        TextView goodmorningnine = (TextView) findViewById(R.id.goodmorningnine);

        String s = goodmorningnine.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy10buttononClick(View view)
    {
        TextView goodmorningten = (TextView) findViewById(R.id.goodmorningten);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(goodmorningten.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share10buttononClick(View view)
    {
        TextView goodmorningten = (TextView) findViewById(R.id.goodmorningten);

        String s = goodmorningten.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
}
