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

public class Hornystatus extends AppCompatActivity {
    private AdView hornystatusbanner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hornystatus);
        MobileAds.initialize(this, "ca-app-pub-3609953011019731~1851437217");
        hornystatusbanner = findViewById(R.id.hornystatusbanner);
        AdRequest adRequest = new AdRequest.Builder().build();
        hornystatusbanner.loadAd(adRequest);
    }
    public void copybuttononClick(View view)
    {
        TextView hornyone = (TextView) findViewById(R.id.hornyone);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(hornyone.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void sharebuttononClick(View view)
    {
        TextView hornyone = (TextView) findViewById(R.id.hornyone);

        String s = hornyone.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy1buttononClick(View view)
    {
        TextView hornytwo = (TextView) findViewById(R.id.hornytwo);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(hornytwo.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share1buttononClick(View view)
    {
        TextView hornytwo = (TextView) findViewById(R.id.hornytwo);

        String s = hornytwo.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy2buttononClick(View view)
    {
        TextView hornythree = (TextView) findViewById(R.id.hornythree);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(hornythree.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share2buttononClick(View view)
    {
        TextView hornythree = (TextView) findViewById(R.id.hornythree);

        String s = hornythree.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy4buttononClick(View view)
    {
        TextView hornyfour = (TextView) findViewById(R.id.hornyfour);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(hornyfour.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share4buttononClick(View view)
    {
        TextView hornyfour = (TextView) findViewById(R.id.hornyfour);

        String s = hornyfour.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy5buttononClick(View view)
    {
        TextView hornyfive = (TextView) findViewById(R.id.hornyfive);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(hornyfive.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share5buttononClick(View view)
    {
        TextView hornyfive = (TextView) findViewById(R.id.hornyfive);

        String s = hornyfive.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy6buttononClick(View view)
    {
        TextView hornysix = (TextView) findViewById(R.id.hornysix);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(hornysix.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share6buttononClick(View view)
    {
        TextView hornysix = (TextView) findViewById(R.id.hornysix);

        String s = hornysix.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy7buttononClick(View view)
    {
        TextView hornyseven = (TextView) findViewById(R.id.hornyseven);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(hornyseven.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share7buttononClick(View view)
    {
        TextView hornyseven = (TextView) findViewById(R.id.hornyseven);

        String s = hornyseven.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy8buttononClick(View view)
    {
        TextView hornyeight = (TextView) findViewById(R.id.hornyeight);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(hornyeight.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share8buttononClick(View view)
    {
        TextView hornyeight = (TextView) findViewById(R.id.hornyeight);

        String s = hornyeight.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy9buttononClick(View view)
    {
        TextView hornynine = (TextView) findViewById(R.id.hornynine);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(hornynine.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share9buttononClick(View view)
    {
        TextView hornynine = (TextView) findViewById(R.id.hornynine);

        String s = hornynine.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy10buttononClick(View view)
    {
        TextView hornyten = (TextView) findViewById(R.id.hornyten);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(hornyten.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share10buttononClick(View view)
    {
        TextView hornyten = (TextView) findViewById(R.id.hornyten);

        String s = hornyten.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
}
