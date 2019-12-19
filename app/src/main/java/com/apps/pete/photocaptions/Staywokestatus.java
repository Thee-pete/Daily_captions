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

public class Staywokestatus extends AppCompatActivity {
    private AdView staywokestatusbanner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_staywokestatus);
        MobileAds.initialize(this, "ca-app-pub-3609953011019731~1851437217");
        staywokestatusbanner = findViewById(R.id.staywokestatusbanner);
        AdRequest adRequest = new AdRequest.Builder().build();
        staywokestatusbanner.loadAd(adRequest);
    }
    public void copybuttononClick(View view)
    {
        TextView staywokeone = (TextView) findViewById(R.id.staywokeone);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(staywokeone.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void sharebuttononClick(View view)
    {
        TextView staywokeone = (TextView) findViewById(R.id.staywokeone);

        String s = staywokeone.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy1buttononClick(View view)
    {
        TextView staywoketwo = (TextView) findViewById(R.id.staywoketwo);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(staywoketwo.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share1buttononClick(View view)
    {
        TextView staywoketwo = (TextView) findViewById(R.id.staywoketwo);

        String s = staywoketwo.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy2buttononClick(View view)
    {
        TextView staywokethree = (TextView) findViewById(R.id.staywokethree);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(staywokethree.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share2buttononClick(View view)
    {
        TextView staywokethree = (TextView) findViewById(R.id.staywokethree);

        String s = staywokethree.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy4buttononClick(View view)
    {
        TextView staywokefour = (TextView) findViewById(R.id.staywokefour);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(staywokefour.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share4buttononClick(View view)
    {
        TextView staywokefour = (TextView) findViewById(R.id.staywokefour);

        String s = staywokefour.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy5buttononClick(View view)
    {
        TextView staywokefive = (TextView) findViewById(R.id.staywokefive);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(staywokefive.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share5buttononClick(View view)
    {
        TextView staywokefive = (TextView) findViewById(R.id.staywokefive);

        String s = staywokefive.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy6buttononClick(View view)
    {
        TextView staywokesix = (TextView) findViewById(R.id.staywokesix);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(staywokesix.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share6buttononClick(View view)
    {
        TextView staywokesix = (TextView) findViewById(R.id.staywokesix);

        String s = staywokesix.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy7buttononClick(View view)
    {
        TextView staywokeseven = (TextView) findViewById(R.id.staywokeseven);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(staywokeseven.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share7buttononClick(View view)
    {
        TextView staywokeseven = (TextView) findViewById(R.id.staywokeseven);

        String s = staywokeseven.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy8buttononClick(View view)
    {
        TextView staywokeeight = (TextView) findViewById(R.id.staywokeeight);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(staywokeeight.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share8buttononClick(View view)
    {
        TextView staywokeeight = (TextView) findViewById(R.id.staywokeeight);

        String s = staywokeeight.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy9buttononClick(View view)
    {
        TextView staywokenine = (TextView) findViewById(R.id.staywokenine);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(staywokenine.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share9buttononClick(View view)
    {
        TextView staywokenine = (TextView) findViewById(R.id.staywokenine);

        String s = staywokenine.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy10buttononClick(View view)
    {
        TextView staywoketen = (TextView) findViewById(R.id.staywoketen);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(staywoketen.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share10buttononClick(View view)
    {
        TextView staywoketen = (TextView) findViewById(R.id.staywoketen);

        String s = staywoketen.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
}
