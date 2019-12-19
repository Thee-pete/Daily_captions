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

public class InspirationstatusActivity extends AppCompatActivity {
    private AdView inspirationstatusbanner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inspirationstatus);
        MobileAds.initialize(this, "ca-app-pub-3609953011019731~1851437217");
        inspirationstatusbanner = findViewById(R.id.inspirationstatusbanner);
        AdRequest adRequest = new AdRequest.Builder().build();
        inspirationstatusbanner.loadAd(adRequest);
    }
    public void copybuttononClick(View view)
    {
        TextView inspirationone = (TextView) findViewById(R.id.inspirationone);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(inspirationone.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void sharebuttononClick(View view)
    {
        TextView inspirationone = (TextView) findViewById(R.id.inspirationone);

        String s = inspirationone.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy1buttononClick(View view)
    {
        TextView inspirationtwo = (TextView) findViewById(R.id.inspirationtwo);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(inspirationtwo.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share1buttononClick(View view)
    {
        TextView inspirationtwo = (TextView) findViewById(R.id.inspirationtwo);

        String s = inspirationtwo.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy2buttononClick(View view)
    {
        TextView inspirationthree = (TextView) findViewById(R.id.inspirationthree);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(inspirationthree.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share2buttononClick(View view)
    {
        TextView inspirationthree = (TextView) findViewById(R.id.inspirationthree);

        String s = inspirationthree.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy4buttononClick(View view)
    {
        TextView inspirationfour = (TextView) findViewById(R.id.inspirationfour);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(inspirationfour.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share4buttononClick(View view)
    {
        TextView inspirationfour = (TextView) findViewById(R.id.inspirationfour);

        String s = inspirationfour.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy5buttononClick(View view)
    {
        TextView inspirationfive = (TextView) findViewById(R.id.inspirationfive);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(inspirationfive.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share5buttononClick(View view)
    {
        TextView inspirationfive = (TextView) findViewById(R.id.inspirationfive);

        String s = inspirationfive.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy6buttononClick(View view)
    {
        TextView inspirationsix = (TextView) findViewById(R.id.inspirationsix);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(inspirationsix.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share6buttononClick(View view)
    {
        TextView inspirationsix = (TextView) findViewById(R.id.inspirationsix);

        String s = inspirationsix.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy7buttononClick(View view)
    {
        TextView inspirationseven = (TextView) findViewById(R.id.inspirationseven);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(inspirationseven.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share7buttononClick(View view)
    {
        TextView inspirationseven = (TextView) findViewById(R.id.inspirationseven);

        String s = inspirationseven.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy8buttononClick(View view)
    {
        TextView inspirationeight = (TextView) findViewById(R.id.inspirationeight);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(inspirationeight.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share8buttononClick(View view)
    {
        TextView inspirationeight = (TextView) findViewById(R.id.inspirationeight);

        String s = inspirationeight.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy9buttononClick(View view)
    {
        TextView inspirationnine = (TextView) findViewById(R.id.inspirationnine);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(inspirationnine.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share9buttononClick(View view)
    {
        TextView inspirationnine = (TextView) findViewById(R.id.inspirationnine);

        String s = inspirationnine.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy10buttononClick(View view)
    {
        TextView inspirationten = (TextView) findViewById(R.id.inspirationten);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(inspirationten.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share10buttononClick(View view)
    {
        TextView inspirationten = (TextView) findViewById(R.id.inspirationten);

        String s = inspirationten.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
}
