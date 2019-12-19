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

public class Insultstatus extends AppCompatActivity {
    private AdView insultsstatusbanner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insultstatus);
        MobileAds.initialize(this, "ca-app-pub-3609953011019731~1851437217");
        insultsstatusbanner = findViewById(R.id.insultstatusbanner);
        AdRequest adRequest = new AdRequest.Builder().build();
        insultsstatusbanner.loadAd(adRequest);
    }
    public void copybuttononClick(View view)
    {
        TextView insultsone = (TextView) findViewById(R.id.insultsone);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(insultsone.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void sharebuttononClick(View view)
    {
        TextView insultsone = (TextView) findViewById(R.id.insultsone);

        String s = insultsone.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy1buttononClick(View view)
    {
        TextView insultstwo = (TextView) findViewById(R.id.insultstwo);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(insultstwo.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share1buttononClick(View view)
    {
        TextView insultstwo = (TextView) findViewById(R.id.insultstwo);

        String s = insultstwo.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy2buttononClick(View view)
    {
        TextView insultsthree = (TextView) findViewById(R.id.insultsthree);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(insultsthree.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share2buttononClick(View view)
    {
        TextView insultsthree = (TextView) findViewById(R.id.insultsthree);

        String s = insultsthree.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy4buttononClick(View view)
    {
        TextView insultsfour = (TextView) findViewById(R.id.insultsfour);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(insultsfour.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share4buttononClick(View view)
    {
        TextView insultsfour = (TextView) findViewById(R.id.insultsfour);

        String s = insultsfour.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy5buttononClick(View view)
    {
        TextView insultsfive = (TextView) findViewById(R.id.insultsfive);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(insultsfive.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share5buttononClick(View view)
    {
        TextView insultsfive = (TextView) findViewById(R.id.insultsfive);

        String s = insultsfive.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy6buttononClick(View view)
    {
        TextView insultssix = (TextView) findViewById(R.id.insultssix);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(insultssix.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share6buttononClick(View view)
    {
        TextView insultssix = (TextView) findViewById(R.id.insultssix);

        String s = insultssix.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy7buttononClick(View view)
    {
        TextView insultsseven = (TextView) findViewById(R.id.insultsseven);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(insultsseven.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share7buttononClick(View view)
    {
        TextView insultsseven = (TextView) findViewById(R.id.insultsseven);

        String s = insultsseven.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy8buttononClick(View view)
    {
        TextView insultseight = (TextView) findViewById(R.id.insultseight);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(insultseight.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share8buttononClick(View view)
    {
        TextView insultseight = (TextView) findViewById(R.id.insultseight);

        String s = insultseight.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy9buttononClick(View view)
    {
        TextView insultsnine = (TextView) findViewById(R.id.insultsnine);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(insultsnine.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share9buttononClick(View view)
    {
        TextView insultsnine = (TextView) findViewById(R.id.insultsnine);

        String s = insultsnine.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy10buttononClick(View view)
    {
        TextView insultsten = (TextView) findViewById(R.id.insultsten);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(insultsten.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share10buttononClick(View view)
    {
        TextView insultsten = (TextView) findViewById(R.id.insultsten);

        String s = insultsten.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
}
