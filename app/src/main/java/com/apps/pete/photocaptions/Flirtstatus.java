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

public class Flirtstatus extends AppCompatActivity {
    private AdView flirtstatusbanner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flirtstatus);
        MobileAds.initialize(this, "ca-app-pub-3609953011019731~1851437217");
        flirtstatusbanner = findViewById(R.id.flirtystatusbanner);
        AdRequest adRequest = new AdRequest.Builder().build();
        flirtstatusbanner.loadAd(adRequest);
    }
    public void copybuttononClick(View view)
    {
        TextView flirtone = (TextView) findViewById(R.id.flirtone);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(flirtone.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void sharebuttononClick(View view)
    {
        TextView flirtone = (TextView) findViewById(R.id.flirtone);

        String s = flirtone.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy1buttononClick(View view)
    {
        TextView flirttwo = (TextView) findViewById(R.id.flirttwo);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(flirttwo.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share1buttononClick(View view)
    {
        TextView flirttwo = (TextView) findViewById(R.id.flirttwo);

        String s = flirttwo.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy2buttononClick(View view)
    {
        TextView flirtthree = (TextView) findViewById(R.id.flirtthree);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(flirtthree.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share2buttononClick(View view)
    {
        TextView flirtthree = (TextView) findViewById(R.id.flirtthree);

        String s = flirtthree.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy4buttononClick(View view)
    {
        TextView flirtfour = (TextView) findViewById(R.id.flirtfour);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(flirtfour.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share4buttononClick(View view)
    {
        TextView flirtfour = (TextView) findViewById(R.id.flirtfour);

        String s = flirtfour.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy5buttononClick(View view)
    {
        TextView flirtfive = (TextView) findViewById(R.id.flirtfive);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(flirtfive.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share5buttononClick(View view)
    {
        TextView flirtfive = (TextView) findViewById(R.id.flirtfive);

        String s = flirtfive.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy6buttononClick(View view)
    {
        TextView flirtsix = (TextView) findViewById(R.id.flirtsix);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(flirtsix.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share6buttononClick(View view)
    {
        TextView flirtsix = (TextView) findViewById(R.id.flirtsix);

        String s = flirtsix.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy7buttononClick(View view)
    {
        TextView flirtseven = (TextView) findViewById(R.id.flirtseven);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(flirtseven.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share7buttononClick(View view)
    {
        TextView flirtseven = (TextView) findViewById(R.id.flirtseven);

        String s = flirtseven.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy8buttononClick(View view)
    {
        TextView flirteight = (TextView) findViewById(R.id.flirteight);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(flirteight.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share8buttononClick(View view)
    {
        TextView flirteight = (TextView) findViewById(R.id.flirteight);

        String s = flirteight.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy9buttononClick(View view)
    {
        TextView flirtnine = (TextView) findViewById(R.id.flirtnine);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(flirtnine.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share9buttononClick(View view)
    {
        TextView flirtnine = (TextView) findViewById(R.id.flirtnine);

        String s = flirtnine.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy10buttononClick(View view)
    {
        TextView flirtten = (TextView) findViewById(R.id.flirtten);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(flirtten.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share10buttononClick(View view)
    {
        TextView flirtten = (TextView) findViewById(R.id.flirtten);

        String s = flirtten.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
}
