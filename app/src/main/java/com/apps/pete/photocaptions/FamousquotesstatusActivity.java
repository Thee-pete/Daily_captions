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

public class FamousquotesstatusActivity extends AppCompatActivity {
    private AdView quotesstatusbanner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_famousquotesstatus);
        MobileAds.initialize(this, "ca-app-pub-3609953011019731~1851437217");
        quotesstatusbanner = findViewById(R.id.famousquotesstatusbanner);
        AdRequest adRequest = new AdRequest.Builder().build();
        quotesstatusbanner.loadAd(adRequest);
    }
    public void copybuttononClick(View view)
    {
        TextView famquoteone = (TextView) findViewById(R.id.famquoteone);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(famquoteone.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void sharebuttononClick(View view)
    {
        TextView famquoteone = (TextView) findViewById(R.id.famquoteone);

        String s = famquoteone.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy1buttononClick(View view)
    {
        TextView famquotetwo = (TextView) findViewById(R.id.famquotetwo);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(famquotetwo.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share1buttononClick(View view)
    {
        TextView famquotetwo = (TextView) findViewById(R.id.famquotetwo);

        String s = famquotetwo.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy2buttononClick(View view)
    {
        TextView famquotethree = (TextView) findViewById(R.id.famquotethree);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(famquotethree.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share2buttononClick(View view)
    {
        TextView famquotethree = (TextView) findViewById(R.id.famquotethree);

        String s = famquotethree.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy4buttononClick(View view)
    {
        TextView famquotefour = (TextView) findViewById(R.id.famquotefour);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(famquotefour.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share4buttononClick(View view)
    {
        TextView famquotefour = (TextView) findViewById(R.id.famquotefour);

        String s = famquotefour.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy5buttononClick(View view)
    {
        TextView famquotefive = (TextView) findViewById(R.id.famquotefive);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(famquotefive.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share5buttononClick(View view)
    {
        TextView famquotefive = (TextView) findViewById(R.id.famquotefive);

        String s = famquotefive.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy6buttononClick(View view)
    {
        TextView famquotesix = (TextView) findViewById(R.id.famquotesix);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(famquotesix.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share6buttononClick(View view)
    {
        TextView famquotesix = (TextView) findViewById(R.id.famquotesix);

        String s = famquotesix.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy7buttononClick(View view)
    {
        TextView famquoteseven = (TextView) findViewById(R.id.famquoteseven);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(famquoteseven.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share7buttononClick(View view)
    {
        TextView famquoteseven = (TextView) findViewById(R.id.famquoteseven);

        String s = famquoteseven.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy8buttononClick(View view)
    {
        TextView famquoteeight = (TextView) findViewById(R.id.famquoteeight);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(famquoteeight.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share8buttononClick(View view)
    {
        TextView famquoteeight = (TextView) findViewById(R.id.famquoteeight);

        String s = famquoteeight.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy9buttononClick(View view)
    {
        TextView famquotenine = (TextView) findViewById(R.id.famquotenine);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(famquotenine.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share9buttononClick(View view)
    {
        TextView famquotenine = (TextView) findViewById(R.id.famquotenine);

        String s = famquotenine.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy10buttononClick(View view)
    {
        TextView famquoteten = (TextView) findViewById(R.id.famquoteten);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(famquoteten.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share10buttononClick(View view)
    {
        TextView famquoteten = (TextView) findViewById(R.id.famquoteten);

        String s = famquoteten.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
}
