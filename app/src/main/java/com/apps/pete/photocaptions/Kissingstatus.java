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

public class Kissingstatus extends AppCompatActivity {
    private AdView kissingstatusbanner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kissingstatus);
        MobileAds.initialize(this, "ca-app-pub-3609953011019731~1851437217");
        kissingstatusbanner = findViewById(R.id.kissingstatusbanner);
        AdRequest adRequest = new AdRequest.Builder().build();
        kissingstatusbanner.loadAd(adRequest);
    }
    public void copybuttononClick(View view)
    {
        TextView kissingone = (TextView) findViewById(R.id.kissingone);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(kissingone.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void sharebuttononClick(View view)
    {
        TextView kissingone = (TextView) findViewById(R.id.kissingone);

        String s = kissingone.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy1buttononClick(View view)
    {
        TextView kissingtwo = (TextView) findViewById(R.id.kissingtwo);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(kissingtwo.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share1buttononClick(View view)
    {
        TextView kissingtwo = (TextView) findViewById(R.id.kissingtwo);

        String s = kissingtwo.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy2buttononClick(View view)
    {
        TextView kissingthree = (TextView) findViewById(R.id.kissingthree);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(kissingthree.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share2buttononClick(View view)
    {
        TextView kissingthree = (TextView) findViewById(R.id.kissingthree);

        String s = kissingthree.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy4buttononClick(View view)
    {
        TextView kissingfour = (TextView) findViewById(R.id.kissingfour);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(kissingfour.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share4buttononClick(View view)
    {
        TextView kissingfour = (TextView) findViewById(R.id.kissingfour);

        String s = kissingfour.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy5buttononClick(View view)
    {
        TextView kissingfive = (TextView) findViewById(R.id.kissingfive);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(kissingfive.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share5buttononClick(View view)
    {
        TextView kissingfive = (TextView) findViewById(R.id.kissingfive);

        String s = kissingfive.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy6buttononClick(View view)
    {
        TextView kissingsix = (TextView) findViewById(R.id.kissingsix);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(kissingsix.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share6buttononClick(View view)
    {
        TextView kissingsix = (TextView) findViewById(R.id.kissingsix);

        String s = kissingsix.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy7buttononClick(View view)
    {
        TextView kissingseven = (TextView) findViewById(R.id.kissingseven);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(kissingseven.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share7buttononClick(View view)
    {
        TextView kissingseven = (TextView) findViewById(R.id.kissingseven);

        String s = kissingseven.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy8buttononClick(View view)
    {
        TextView kissingeight = (TextView) findViewById(R.id.kissingeight);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(kissingeight.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share8buttononClick(View view)
    {
        TextView kissingeight = (TextView) findViewById(R.id.kissingeight);

        String s = kissingeight.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy9buttononClick(View view)
    {
        TextView kissingnine = (TextView) findViewById(R.id.kissingnine);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(kissingnine.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share9buttononClick(View view)
    {
        TextView kissingnine = (TextView) findViewById(R.id.kissingnine);

        String s = kissingnine.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy10buttononClick(View view)
    {
        TextView kissingten = (TextView) findViewById(R.id.kissingten);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(kissingten.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share10buttononClick(View view)
    {
        TextView kissingten = (TextView) findViewById(R.id.kissingten);

        String s = kissingten.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
}
