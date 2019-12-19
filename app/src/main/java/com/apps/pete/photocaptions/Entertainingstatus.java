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

public class Entertainingstatus extends AppCompatActivity {
    private AdView entertainingstatusbanner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entertainingstatus);
        MobileAds.initialize(this, "ca-app-pub-3609953011019731~1851437217");
        entertainingstatusbanner = findViewById(R.id.entertainingstatusbanner);
        AdRequest adRequest = new AdRequest.Builder().build();
        entertainingstatusbanner.loadAd(adRequest);
    }
    public void copybuttononClick(View view)
    {
        TextView entertainingone = (TextView) findViewById(R.id.entertainingone);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(entertainingone.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void sharebuttononClick(View view)
    {
        TextView entertainingone = (TextView) findViewById(R.id.entertainingone);

        String s = entertainingone.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy1buttononClick(View view)
    {
        TextView entertainingtwo = (TextView) findViewById(R.id.entertainingtwo);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(entertainingtwo.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share1buttononClick(View view)
    {
        TextView entertainingtwo = (TextView) findViewById(R.id.entertainingtwo);

        String s = entertainingtwo.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy2buttononClick(View view)
    {
        TextView entertainingthree = (TextView) findViewById(R.id.entertainingthree);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(entertainingthree.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share2buttononClick(View view)
    {
        TextView entertainingthree = (TextView) findViewById(R.id.entertainingthree);

        String s = entertainingthree.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy4buttononClick(View view)
    {
        TextView entertainingfour = (TextView) findViewById(R.id.entertainingfour);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(entertainingfour.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share4buttononClick(View view)
    {
        TextView entertainingfour = (TextView) findViewById(R.id.entertainingfour);

        String s = entertainingfour.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy5buttononClick(View view)
    {
        TextView entertainingfive = (TextView) findViewById(R.id.entertainingfive);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(entertainingfive.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share5buttononClick(View view)
    {
        TextView entertainingfive = (TextView) findViewById(R.id.entertainingfive);

        String s = entertainingfive.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy6buttononClick(View view)
    {
        TextView entertainingsix = (TextView) findViewById(R.id.entertainingsix);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(entertainingsix.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share6buttononClick(View view)
    {
        TextView entertainingsix = (TextView) findViewById(R.id.entertainingsix);

        String s = entertainingsix.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy7buttononClick(View view)
    {
        TextView entertainingseven = (TextView) findViewById(R.id.entertainingseven);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(entertainingseven.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share7buttononClick(View view)
    {
        TextView entertainingseven = (TextView) findViewById(R.id.entertainingseven);

        String s = entertainingseven.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy8buttononClick(View view)
    {
        TextView entertainingeight = (TextView) findViewById(R.id.entertainingeight);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(entertainingeight.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share8buttononClick(View view)
    {
        TextView entertainingeight = (TextView) findViewById(R.id.entertainingeight);

        String s = entertainingeight.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy9buttononClick(View view)
    {
        TextView entertainingnine = (TextView) findViewById(R.id.entertainingnine);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(entertainingnine.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share9buttononClick(View view)
    {
        TextView entertainingnine = (TextView) findViewById(R.id.entertainingnine);

        String s = entertainingnine.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy10buttononClick(View view)
    {
        TextView entertainingten = (TextView) findViewById(R.id.entertainingten);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(entertainingten.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share10buttononClick(View view)
    {
        TextView entertainingten = (TextView) findViewById(R.id.entertainingten);

        String s = entertainingten.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
}
