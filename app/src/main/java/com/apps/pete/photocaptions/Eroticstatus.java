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

public class Eroticstatus extends AppCompatActivity {
    private AdView eroticstatusbanner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eroticstatus);
        MobileAds.initialize(this, "ca-app-pub-3609953011019731~1851437217");
        eroticstatusbanner = findViewById(R.id.eroticstatusbanner);
        AdRequest adRequest = new AdRequest.Builder().build();
        eroticstatusbanner.loadAd(adRequest);
    }
    public void copybuttononClick(View view)
    {
        TextView eroticone = (TextView) findViewById(R.id.eroticone);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(eroticone.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void sharebuttononClick(View view)
    {
        TextView eroticone = (TextView) findViewById(R.id.eroticone);

        String s = eroticone.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy1buttononClick(View view)
    {
        TextView erotictwo = (TextView) findViewById(R.id.erotictwo);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(erotictwo.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share1buttononClick(View view)
    {
        TextView erotictwo = (TextView) findViewById(R.id.erotictwo);

        String s = erotictwo.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy2buttononClick(View view)
    {
        TextView eroticthree = (TextView) findViewById(R.id.eroticthree);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(eroticthree.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share2buttononClick(View view)
    {
        TextView eroticthree = (TextView) findViewById(R.id.eroticthree);

        String s = eroticthree.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy4buttononClick(View view)
    {
        TextView eroticfour = (TextView) findViewById(R.id.eroticfour);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(eroticfour.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share4buttononClick(View view)
    {
        TextView eroticfour = (TextView) findViewById(R.id.eroticfour);

        String s = eroticfour.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy5buttononClick(View view)
    {
        TextView eroticfive = (TextView) findViewById(R.id.eroticfive);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(eroticfive.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share5buttononClick(View view)
    {
        TextView eroticfive = (TextView) findViewById(R.id.eroticfive);

        String s = eroticfive.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy6buttononClick(View view)
    {
        TextView eroticsix = (TextView) findViewById(R.id.eroticsix);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(eroticsix.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share6buttononClick(View view)
    {
        TextView eroticsix = (TextView) findViewById(R.id.eroticsix);

        String s = eroticsix.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy7buttononClick(View view)
    {
        TextView eroticseven = (TextView) findViewById(R.id.eroticseven);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(eroticseven.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share7buttononClick(View view)
    {
        TextView eroticseven = (TextView) findViewById(R.id.eroticseven);

        String s = eroticseven.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy8buttononClick(View view)
    {
        TextView eroticeight = (TextView) findViewById(R.id.eroticeight);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(eroticeight.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share8buttononClick(View view)
    {
        TextView eroticeight = (TextView) findViewById(R.id.eroticeight);

        String s = eroticeight.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy9buttononClick(View view)
    {
        TextView eroticnine = (TextView) findViewById(R.id.eroticnine);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(eroticnine.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share9buttononClick(View view)
    {
        TextView eroticnine = (TextView) findViewById(R.id.eroticnine);

        String s = eroticnine.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy10buttononClick(View view)
    {
        TextView eroticten = (TextView) findViewById(R.id.eroticten);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(eroticten.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share10buttononClick(View view)
    {
        TextView eroticten = (TextView) findViewById(R.id.eroticten);

        String s = eroticten.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
}
