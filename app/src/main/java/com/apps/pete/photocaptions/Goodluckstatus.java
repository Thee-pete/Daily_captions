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

public class Goodluckstatus extends AppCompatActivity {
    private AdView goodluckstatusbanner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goodluckstatus);
        MobileAds.initialize(this, "ca-app-pub-3609953011019731~1851437217");
        goodluckstatusbanner = findViewById(R.id.goodluckstatusbanner);
        AdRequest adRequest = new AdRequest.Builder().build();
        goodluckstatusbanner.loadAd(adRequest);
    }
    public void copybuttononClick(View view)
    {
        TextView goodluckone = (TextView) findViewById(R.id.goodluckone);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(goodluckone.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void sharebuttononClick(View view)
    {
        TextView goodluckone = (TextView) findViewById(R.id.goodluckone);

        String s = goodluckone.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy1buttononClick(View view)
    {
        TextView goodlucktwo = (TextView) findViewById(R.id.goodlucktwo);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(goodlucktwo.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share1buttononClick(View view)
    {
        TextView goodlucktwo = (TextView) findViewById(R.id.goodlucktwo);

        String s = goodlucktwo.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy2buttononClick(View view)
    {
        TextView goodluckthree = (TextView) findViewById(R.id.goodluckthree);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(goodluckthree.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share2buttononClick(View view)
    {
        TextView goodluckthree = (TextView) findViewById(R.id.goodluckthree);

        String s = goodluckthree.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy4buttononClick(View view)
    {
        TextView goodluckfour = (TextView) findViewById(R.id.goodluckfour);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(goodluckfour.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share4buttononClick(View view)
    {
        TextView goodluckfour = (TextView) findViewById(R.id.goodluckfour);

        String s = goodluckfour.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy5buttononClick(View view)
    {
        TextView goodluckfive = (TextView) findViewById(R.id.goodluckfive);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(goodluckfive.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share5buttononClick(View view)
    {
        TextView goodluckfive = (TextView) findViewById(R.id.goodluckfive);

        String s = goodluckfive.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy6buttononClick(View view)
    {
        TextView goodlucksix = (TextView) findViewById(R.id.goodlucksix);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(goodlucksix.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share6buttononClick(View view)
    {
        TextView goodlucksix = (TextView) findViewById(R.id.goodlucksix);

        String s = goodlucksix.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy7buttononClick(View view)
    {
        TextView goodluckseven = (TextView) findViewById(R.id.goodluckseven);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(goodluckseven.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share7buttononClick(View view)
    {
        TextView goodluckseven = (TextView) findViewById(R.id.goodluckseven);

        String s = goodluckseven.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy8buttononClick(View view)
    {
        TextView goodluckeight = (TextView) findViewById(R.id.goodluckeight);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(goodluckeight.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share8buttononClick(View view)
    {
        TextView goodluckeight = (TextView) findViewById(R.id.goodluckeight);

        String s = goodluckeight.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy9buttononClick(View view)
    {
        TextView goodlucknine = (TextView) findViewById(R.id.goodlucknine);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(goodlucknine.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share9buttononClick(View view)
    {
        TextView goodlucknine = (TextView) findViewById(R.id.goodlucknine);

        String s = goodlucknine.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy10buttononClick(View view)
    {
        TextView goodluckten = (TextView) findViewById(R.id.goodluckten);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(goodluckten.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share10buttononClick(View view)
    {
        TextView goodluckten = (TextView) findViewById(R.id.goodluckten);

        String s = goodluckten.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
}
