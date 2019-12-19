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

public class Dumbstatus extends AppCompatActivity {
    private AdView dumbstatusbanner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dumbstatus);
        MobileAds.initialize(this, "ca-app-pub-3609953011019731~1851437217");
        dumbstatusbanner = findViewById(R.id.dumbstatusbanner);
        AdRequest adRequest = new AdRequest.Builder().build();
        dumbstatusbanner.loadAd(adRequest);
    }
    public void copybuttononClick(View view)
    {
        TextView dumbone = (TextView) findViewById(R.id.dumbone);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(dumbone.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void sharebuttononClick(View view)
    {
        TextView dumbone = (TextView) findViewById(R.id.dumbone);

        String s = dumbone.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy1buttononClick(View view)
    {
        TextView dumbtwo = (TextView) findViewById(R.id.dumbtwo);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(dumbtwo.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share1buttononClick(View view)
    {
        TextView dumbtwo = (TextView) findViewById(R.id.dumbtwo);

        String s = dumbtwo.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy2buttononClick(View view)
    {
        TextView dumbthree = (TextView) findViewById(R.id.dumbthree);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(dumbthree.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share2buttononClick(View view)
    {
        TextView dumbthree = (TextView) findViewById(R.id.dumbthree);

        String s = dumbthree.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy4buttononClick(View view)
    {
        TextView dumbfour = (TextView) findViewById(R.id.dumbfour);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(dumbfour.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share4buttononClick(View view)
    {
        TextView dumbfour = (TextView) findViewById(R.id.dumbfour);

        String s = dumbfour.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy5buttononClick(View view)
    {
        TextView dumbfive = (TextView) findViewById(R.id.dumbfive);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(dumbfive.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share5buttononClick(View view)
    {
        TextView dumbfive = (TextView) findViewById(R.id.dumbfive);

        String s = dumbfive.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy6buttononClick(View view)
    {
        TextView dumbsix = (TextView) findViewById(R.id.dumbsix);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(dumbsix.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share6buttononClick(View view)
    {
        TextView dumbsix = (TextView) findViewById(R.id.dumbsix);

        String s = dumbsix.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy7buttononClick(View view)
    {
        TextView dumbseven = (TextView) findViewById(R.id.dumbseven);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(dumbseven.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share7buttononClick(View view)
    {
        TextView dumbseven = (TextView) findViewById(R.id.dumbseven);

        String s = dumbseven.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy8buttononClick(View view)
    {
        TextView dumbeight = (TextView) findViewById(R.id.dumbeight);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(dumbeight.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share8buttononClick(View view)
    {
        TextView dumbeight = (TextView) findViewById(R.id.dumbeight);

        String s = dumbeight.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy9buttononClick(View view)
    {
        TextView dumbnine = (TextView) findViewById(R.id.dumbnine);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(dumbnine.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share9buttononClick(View view)
    {
        TextView dumbnine = (TextView) findViewById(R.id.dumbnine);

        String s = dumbnine.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy10buttononClick(View view)
    {
        TextView dumbten = (TextView) findViewById(R.id.dumbten);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(dumbten.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share10buttononClick(View view)
    {
        TextView dumbten = (TextView) findViewById(R.id.dumbten);

        String s = dumbten.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
}
