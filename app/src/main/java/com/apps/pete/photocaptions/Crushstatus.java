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

public class Crushstatus extends AppCompatActivity {
    private AdView crushstatusbanner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crushstatus);
        MobileAds.initialize(this, "ca-app-pub-3609953011019731~1851437217");
        crushstatusbanner = findViewById(R.id.crushstatusbanner);
        AdRequest adRequest = new AdRequest.Builder().build();
        crushstatusbanner.loadAd(adRequest);
    }
    public void copybuttononClick(View view)
    {
        TextView crushone = (TextView) findViewById(R.id.crushone);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(crushone.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void sharebuttononClick(View view)
    {
        TextView crushone = (TextView) findViewById(R.id.crushone);

        String s = crushone.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy1buttononClick(View view)
    {
        TextView crushtwo = (TextView) findViewById(R.id.crushtwo);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(crushtwo.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share1buttononClick(View view)
    {
        TextView crushtwo = (TextView) findViewById(R.id.crushtwo);

        String s = crushtwo.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy2buttononClick(View view)
    {
        TextView crushthree = (TextView) findViewById(R.id.crushthree);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(crushthree.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share2buttononClick(View view)
    {
        TextView crushthree = (TextView) findViewById(R.id.crushthree);

        String s = crushthree.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy4buttononClick(View view)
    {
        TextView crushfour = (TextView) findViewById(R.id.crushfour);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(crushfour.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share4buttononClick(View view)
    {
        TextView crushfour = (TextView) findViewById(R.id.crushfour);

        String s = crushfour.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy5buttononClick(View view)
    {
        TextView crushfive = (TextView) findViewById(R.id.crushfive);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(crushfive.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share5buttononClick(View view)
    {
        TextView crushfive = (TextView) findViewById(R.id.crushfive);

        String s = crushfive.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy6buttononClick(View view)
    {
        TextView crushsix = (TextView) findViewById(R.id.crushsix);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(crushsix.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share6buttononClick(View view)
    {
        TextView crushsix = (TextView) findViewById(R.id.crushsix);

        String s = crushsix.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy7buttononClick(View view)
    {
        TextView crushseven = (TextView) findViewById(R.id.crushseven);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(crushseven.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share7buttononClick(View view)
    {
        TextView crushseven = (TextView) findViewById(R.id.crushseven);

        String s = crushseven.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy8buttononClick(View view)
    {
        TextView crusheight = (TextView) findViewById(R.id.crusheight);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(crusheight.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share8buttononClick(View view)
    {
        TextView crusheight = (TextView) findViewById(R.id.crusheight);

        String s = crusheight.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy9buttononClick(View view)
    {
        TextView crushnine = (TextView) findViewById(R.id.crushnine);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(crushnine.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share9buttononClick(View view)
    {
        TextView crushnine = (TextView) findViewById(R.id.crushnine);

        String s = crushnine.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy10buttononClick(View view)
    {
        TextView crushten = (TextView) findViewById(R.id.crushten);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(crushten.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share10buttononClick(View view)
    {
        TextView crushten = (TextView) findViewById(R.id.crushten);

        String s = crushten.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
}
