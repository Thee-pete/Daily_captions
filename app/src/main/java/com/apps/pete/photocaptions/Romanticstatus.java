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

public class Romanticstatus extends AppCompatActivity {
    private AdView romanticstatusbanner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_romanticstatus);
        MobileAds.initialize(this, "ca-app-pub-3609953011019731~1851437217");
        romanticstatusbanner = findViewById(R.id.romanticstatusbanner);
        AdRequest adRequest = new AdRequest.Builder().build();
        romanticstatusbanner.loadAd(adRequest);

    }
    public void copybuttononClick(View view)
    {
        TextView romanticone = (TextView) findViewById(R.id.romanticone);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(romanticone.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void sharebuttononClick(View view)
    {
        TextView romanticone = (TextView) findViewById(R.id.romanticone);

        String s = romanticone.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy1buttononClick(View view)
    {
        TextView romantictwo = (TextView) findViewById(R.id.romantictwo);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(romantictwo.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share1buttononClick(View view)
    {
        TextView romantictwo = (TextView) findViewById(R.id.romantictwo);

        String s = romantictwo.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy2buttononClick(View view)
    {
        TextView romanticthree = (TextView) findViewById(R.id.romanticthree);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(romanticthree.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share2buttononClick(View view)
    {
        TextView romanticthree = (TextView) findViewById(R.id.romanticthree);

        String s = romanticthree.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy4buttononClick(View view)
    {
        TextView romanticfour = (TextView) findViewById(R.id.romanticfour);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(romanticfour.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share4buttononClick(View view)
    {
        TextView romanticfour = (TextView) findViewById(R.id.romanticfour);

        String s = romanticfour.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy5buttononClick(View view)
    {
        TextView romanticfive = (TextView) findViewById(R.id.romanticfive);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(romanticfive.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share5buttononClick(View view)
    {
        TextView romanticfive = (TextView) findViewById(R.id.romanticfive);

        String s = romanticfive.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy6buttononClick(View view)
    {
        TextView romanticsix = (TextView) findViewById(R.id.romanticsix);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(romanticsix.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share6buttononClick(View view)
    {
        TextView romanticsix = (TextView) findViewById(R.id.romanticsix);

        String s = romanticsix.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy7buttononClick(View view)
    {
        TextView romanticseven = (TextView) findViewById(R.id.romanticseven);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(romanticseven.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share7buttononClick(View view)
    {
        TextView romanticseven = (TextView) findViewById(R.id.romanticseven);

        String s = romanticseven.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy8buttononClick(View view)
    {
        TextView romanticeight = (TextView) findViewById(R.id.romanticeight);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(romanticeight.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share8buttononClick(View view)
    {
        TextView romanticeight = (TextView) findViewById(R.id.romanticeight);

        String s = romanticeight.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy9buttononClick(View view)
    {
        TextView romanticnine = (TextView) findViewById(R.id.romanticnine);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(romanticnine.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share9buttononClick(View view)
    {
        TextView romanticnine = (TextView) findViewById(R.id.romanticnine);

        String s = romanticnine.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy10buttononClick(View view)
    {
        TextView romanticten = (TextView) findViewById(R.id.romanticten);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(romanticten.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share10buttononClick(View view)
    {
        TextView romanticten = (TextView) findViewById(R.id.romanticten);

        String s = romanticten.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
}
