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

public class FunnystatusActivity extends AppCompatActivity {

    private AdView funnystatusbanner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_funnystatus);
        MobileAds.initialize(this, "ca-app-pub-3609953011019731~1851437217");

        funnystatusbanner = findViewById(R.id.funnystatusbanner);
        AdRequest adRequest = new AdRequest.Builder().build();
        funnystatusbanner.loadAd(adRequest);


    }
    public void copybuttononClick(View view)
    {
        TextView funnyone = (TextView) findViewById(R.id.funnyone);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(funnyone.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void sharebuttononClick(View view)
    {
        TextView funnyone = (TextView) findViewById(R.id.funnyone);

        String s = funnyone.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy1buttononClick(View view)
    {
        TextView funnytwo = (TextView) findViewById(R.id.funnytwo);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(funnytwo.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share1buttononClick(View view)
    {
        TextView funnytwo = (TextView) findViewById(R.id.funnytwo);

        String s = funnytwo.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy2buttononClick(View view)
    {
        TextView funnythree = (TextView) findViewById(R.id.funnythree);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(funnythree.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share2buttononClick(View view)
    {
        TextView funnythree = (TextView) findViewById(R.id.funnythree);

        String s = funnythree.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy4buttononClick(View view)
    {
        TextView funnyfour = (TextView) findViewById(R.id.funnyfour);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(funnyfour.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share4buttononClick(View view)
    {
        TextView funnyfour = (TextView) findViewById(R.id.funnyfour);

        String s = funnyfour.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy5buttononClick(View view)
    {
        TextView funnyfive = (TextView) findViewById(R.id.funnyfive);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(funnyfive.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share5buttononClick(View view)
    {
        TextView funnyfive = (TextView) findViewById(R.id.funnyfive);

        String s = funnyfive.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy6buttononClick(View view)
    {
        TextView funnysix = (TextView) findViewById(R.id.funnysix);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(funnysix.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share6buttononClick(View view)
    {
        TextView funnysix = (TextView) findViewById(R.id.funnysix);

        String s = funnysix.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy7buttononClick(View view)
    {
        TextView funnyseven = (TextView) findViewById(R.id.funnyseven);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(funnyseven.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share7buttononClick(View view)
    {
        TextView funnyseven = (TextView) findViewById(R.id.funnyseven);

        String s = funnyseven.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy8buttononClick(View view)
    {
        TextView funnyeight = (TextView) findViewById(R.id.funnyeight);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(funnyeight.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share8buttononClick(View view)
    {
        TextView funnyeight = (TextView) findViewById(R.id.funnyeight);

        String s = funnyeight.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy9buttononClick(View view)
    {
        TextView funnynine = (TextView) findViewById(R.id.funnynine);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(funnynine.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share9buttononClick(View view)
    {
        TextView funnynine = (TextView) findViewById(R.id.funnynine);

        String s = funnynine.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy10buttononClick(View view)
    {
        TextView funnyten = (TextView) findViewById(R.id.funnyten);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(funnyten.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share10buttononClick(View view)
    {
        TextView funnyten = (TextView) findViewById(R.id.funnyten);

        String s = funnyten.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
}
