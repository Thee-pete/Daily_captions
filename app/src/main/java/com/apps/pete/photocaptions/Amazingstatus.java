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

public class Amazingstatus extends AppCompatActivity {
    private AdView amazingstatusbanner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amazingstatus);
        MobileAds.initialize(this, "ca-app-pub-3609953011019731~1851437217");
        amazingstatusbanner = findViewById(R.id.amazingstatusbanner);
        AdRequest adRequest = new AdRequest.Builder().build();
        amazingstatusbanner.loadAd(adRequest);

    }
    public void copybuttononClick(View view)
    {
        TextView amazingone = (TextView) findViewById(R.id.amazingone);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(amazingone.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void sharebuttononClick(View view)
    {
        TextView amazingone = (TextView) findViewById(R.id.amazingone);

        String s = amazingone.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy1buttononClick(View view)
    {
        TextView amazingtwo = (TextView) findViewById(R.id.amazingtwo);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(amazingtwo.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share1buttononClick(View view)
    {
        TextView amazingtwo = (TextView) findViewById(R.id.amazingtwo);

        String s = amazingtwo.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy2buttononClick(View view)
    {
        TextView amazingthree = (TextView) findViewById(R.id.amazingthree);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(amazingthree.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share2buttononClick(View view)
    {
        TextView amazingthree = (TextView) findViewById(R.id.amazingthree);

        String s = amazingthree.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy4buttononClick(View view)
    {
        TextView amazingfour = (TextView) findViewById(R.id.amazingfour);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(amazingfour.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share4buttononClick(View view)
    {
        TextView amazingfour = (TextView) findViewById(R.id.amazingfour);

        String s = amazingfour.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy5buttononClick(View view)
    {
        TextView amazingfive = (TextView) findViewById(R.id.amazingfive);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(amazingfive.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share5buttononClick(View view)
    {
        TextView amazingfive = (TextView) findViewById(R.id.amazingfive);

        String s = amazingfive.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy6buttononClick(View view)
    {
        TextView amazingsix = (TextView) findViewById(R.id.amazingsix);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(amazingsix.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share6buttononClick(View view)
    {
        TextView amazingsix = (TextView) findViewById(R.id.amazingsix);

        String s = amazingsix.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy7buttononClick(View view)
    {
        TextView amazingseven = (TextView) findViewById(R.id.amazingseven);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(amazingseven.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share7buttononClick(View view)
    {
        TextView amazingseven = (TextView) findViewById(R.id.amazingseven);

        String s = amazingseven.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy8buttononClick(View view)
    {
        TextView amazingeight = (TextView) findViewById(R.id.amazingeight);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(amazingeight.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share8buttononClick(View view)
    {
        TextView amazingeight = (TextView) findViewById(R.id.amazingeight);

        String s = amazingeight.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy9buttononClick(View view)
    {
        TextView amazingnine = (TextView) findViewById(R.id.amazingnine);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(amazingnine.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share9buttononClick(View view)
    {
        TextView amazingnine = (TextView) findViewById(R.id.amazingnine);

        String s = amazingnine.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy10buttononClick(View view)
    {
        TextView amazingten = (TextView) findViewById(R.id.amazingten);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(amazingten.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share10buttononClick(View view)
    {
        TextView amazingten = (TextView) findViewById(R.id.amazingten);

        String s = amazingten.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
}
