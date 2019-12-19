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

public class BreakupstatusActivity extends AppCompatActivity {
    private AdView breakupstatusbanner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breakupstatus);
        MobileAds.initialize(this, "ca-app-pub-3609953011019731~1851437217");
        breakupstatusbanner = findViewById(R.id.breakupbanner);
        AdRequest adRequest = new AdRequest.Builder().build();
        breakupstatusbanner.loadAd(adRequest);
    }
    public void copybuttononClick(View view)
    {
        TextView breakupone = (TextView) findViewById(R.id.breakupone);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(breakupone.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void sharebuttononClick(View view)
    {
        TextView breakupone = (TextView) findViewById(R.id.breakupone);

        String s = breakupone.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy1buttononClick(View view)
    {
        TextView breakuptwo = (TextView) findViewById(R.id.breakuptwo);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(breakuptwo.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share1buttononClick(View view)
    {
        TextView breakuptwo = (TextView) findViewById(R.id.breakuptwo);

        String s = breakuptwo.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy2buttononClick(View view)
    {
        TextView breakupthree = (TextView) findViewById(R.id.breakupthree);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(breakupthree.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share2buttononClick(View view)
    {
        TextView breakupthree = (TextView) findViewById(R.id.breakupthree);

        String s = breakupthree.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy4buttononClick(View view)
    {
        TextView breakupfour = (TextView) findViewById(R.id.breakupfour);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(breakupfour.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share4buttononClick(View view)
    {
        TextView breakupfour = (TextView) findViewById(R.id.breakupfour);

        String s = breakupfour.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy5buttononClick(View view)
    {
        TextView breakupfive = (TextView) findViewById(R.id.breakupfive);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(breakupfive.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share5buttononClick(View view)
    {
        TextView breakupfive = (TextView) findViewById(R.id.breakupfive);

        String s = breakupfive.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy6buttononClick(View view)
    {
        TextView breakupsix = (TextView) findViewById(R.id.breakupsix);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(breakupsix.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share6buttononClick(View view)
    {
        TextView breakupsix = (TextView) findViewById(R.id.breakupsix);

        String s = breakupsix.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy7buttononClick(View view)
    {
        TextView breakupseven = (TextView) findViewById(R.id.breakupseven);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(breakupseven.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share7buttononClick(View view)
    {
        TextView breakupseven = (TextView) findViewById(R.id.breakupseven);

        String s = breakupseven.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy8buttononClick(View view)
    {
        TextView breakupeight = (TextView) findViewById(R.id.breakupeight);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(breakupeight.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share8buttononClick(View view)
    {
        TextView breakupeight = (TextView) findViewById(R.id.breakupeight);

        String s = breakupeight.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy9buttononClick(View view)
    {
        TextView breakupnine = (TextView) findViewById(R.id.breakupnine);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(breakupnine.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share9buttononClick(View view)
    {
        TextView breakupnine = (TextView) findViewById(R.id.breakupnine);

        String s = breakupnine.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy10buttononClick(View view)
    {
        TextView breakupten = (TextView) findViewById(R.id.breakupten);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(breakupten.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share10buttononClick(View view)
    {
        TextView breakupten = (TextView) findViewById(R.id.breakupten);

        String s = breakupten.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
}
