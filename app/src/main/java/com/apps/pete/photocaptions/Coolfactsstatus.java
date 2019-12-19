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

public class Coolfactsstatus extends AppCompatActivity {
    private AdView coolfactsstatusbanner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coolfactsstatus);
        MobileAds.initialize(this, "ca-app-pub-3609953011019731~1851437217");
        coolfactsstatusbanner = findViewById(R.id.coolfactsstatusbanner);
        AdRequest adRequest = new AdRequest.Builder().build();
        coolfactsstatusbanner.loadAd(adRequest);
    }
    public void copybuttononClick(View view)
    {
        TextView coolfactsone = (TextView) findViewById(R.id.coolfactsone);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(coolfactsone.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void sharebuttononClick(View view)
    {
        TextView coolfactsone = (TextView) findViewById(R.id.coolfactsone);

        String s = coolfactsone.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy1buttononClick(View view)
    {
        TextView coolfactstwo = (TextView) findViewById(R.id.coolfactstwo);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(coolfactstwo.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share1buttononClick(View view)
    {
        TextView coolfactstwo = (TextView) findViewById(R.id.coolfactstwo);

        String s = coolfactstwo.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy2buttononClick(View view)
    {
        TextView coolfactsthree = (TextView) findViewById(R.id.coolfactsthree);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(coolfactsthree.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share2buttononClick(View view)
    {
        TextView coolfactsthree = (TextView) findViewById(R.id.coolfactsthree);

        String s = coolfactsthree.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy4buttononClick(View view)
    {
        TextView coolfactsfour = (TextView) findViewById(R.id.coolfactsfour);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(coolfactsfour.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share4buttononClick(View view)
    {
        TextView coolfactsfour = (TextView) findViewById(R.id.coolfactsfour);

        String s = coolfactsfour.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy5buttononClick(View view)
    {
        TextView coolfactsfive = (TextView) findViewById(R.id.coolfactsfive);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(coolfactsfive.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share5buttononClick(View view)
    {
        TextView coolfactsfive = (TextView) findViewById(R.id.coolfactsfive);

        String s = coolfactsfive.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy6buttononClick(View view)
    {
        TextView coolfactssix = (TextView) findViewById(R.id.coolfactssix);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(coolfactssix.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share6buttononClick(View view)
    {
        TextView coolfactssix = (TextView) findViewById(R.id.coolfactssix);

        String s = coolfactssix.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy7buttononClick(View view)
    {
        TextView coolfactsseven = (TextView) findViewById(R.id.coolfactsseven);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(coolfactsseven.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share7buttononClick(View view)
    {
        TextView coolfactsseven = (TextView) findViewById(R.id.coolfactsseven);

        String s = coolfactsseven.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy8buttononClick(View view)
    {
        TextView coolfactseight = (TextView) findViewById(R.id.coolfactseight);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(coolfactseight.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share8buttononClick(View view)
    {
        TextView coolfactseight = (TextView) findViewById(R.id.coolfactseight);

        String s = coolfactseight.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy9buttononClick(View view)
    {
        TextView coolfactsnine = (TextView) findViewById(R.id.coolfactsnine);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(coolfactsnine.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share9buttononClick(View view)
    {
        TextView coolfactsnine = (TextView) findViewById(R.id.coolfactsnine);

        String s = coolfactsnine.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy10buttononClick(View view)
    {
        TextView coolfactsten = (TextView) findViewById(R.id.coolfactsten);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(coolfactsten.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share10buttononClick(View view)
    {
        TextView coolfactsten = (TextView) findViewById(R.id.coolfactsten);

        String s = coolfactsten.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
}
