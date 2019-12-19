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

public class Excitedstatus extends AppCompatActivity {
    private AdView excitedstatusbanner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_excitedstatus);
        MobileAds.initialize(this, "ca-app-pub-3609953011019731~1851437217");
        excitedstatusbanner = findViewById(R.id.excitedstatusbanner);
        AdRequest adRequest = new AdRequest.Builder().build();
        excitedstatusbanner.loadAd(adRequest);
    }
    public void copybuttononClick(View view)
    {
        TextView excitedone = (TextView) findViewById(R.id.excitedone);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(excitedone.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void sharebuttononClick(View view)
    {
        TextView excitedone = (TextView) findViewById(R.id.excitedone);

        String s = excitedone.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy1buttononClick(View view)
    {
        TextView excitedtwo = (TextView) findViewById(R.id.excitedtwo);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(excitedtwo.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share1buttononClick(View view)
    {
        TextView excitedtwo = (TextView) findViewById(R.id.excitedtwo);

        String s = excitedtwo.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy2buttononClick(View view)
    {
        TextView excitedthree = (TextView) findViewById(R.id.excitedthree);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(excitedthree.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share2buttononClick(View view)
    {
        TextView excitedthree = (TextView) findViewById(R.id.excitedthree);

        String s = excitedthree.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy4buttononClick(View view)
    {
        TextView excitedfour = (TextView) findViewById(R.id.excitedfour);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(excitedfour.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share4buttononClick(View view)
    {
        TextView excitedfour = (TextView) findViewById(R.id.excitedfour);

        String s = excitedfour.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy5buttononClick(View view)
    {
        TextView excitedfive = (TextView) findViewById(R.id.excitedfive);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(excitedfive.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share5buttononClick(View view)
    {
        TextView excitedfive = (TextView) findViewById(R.id.excitedfive);

        String s = excitedfive.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy6buttononClick(View view)
    {
        TextView excitedsix = (TextView) findViewById(R.id.excitedsix);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(excitedsix.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share6buttononClick(View view)
    {
        TextView excitedsix = (TextView) findViewById(R.id.excitedsix);

        String s = excitedsix.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy7buttononClick(View view)
    {
        TextView excitedseven = (TextView) findViewById(R.id.excitedseven);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(excitedseven.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share7buttononClick(View view)
    {
        TextView excitedseven = (TextView) findViewById(R.id.excitedseven);

        String s = excitedseven.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy8buttononClick(View view)
    {
        TextView excitedeight = (TextView) findViewById(R.id.excitedeight);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(excitedeight.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share8buttononClick(View view)
    {
        TextView excitedeight = (TextView) findViewById(R.id.excitedeight);

        String s = excitedeight.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy9buttononClick(View view)
    {
        TextView excitednine = (TextView) findViewById(R.id.excitednine);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(excitednine.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share9buttononClick(View view)
    {
        TextView excitednine = (TextView) findViewById(R.id.excitednine);

        String s = excitednine.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy10buttononClick(View view)
    {
        TextView excitedten = (TextView) findViewById(R.id.excitedten);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(excitedten.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share10buttononClick(View view)
    {
        TextView excitedten = (TextView) findViewById(R.id.excitedten);

        String s = excitedten.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
}
