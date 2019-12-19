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

public class Goodnightstatus extends AppCompatActivity {
    private AdView goodnightstatusbanner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goodnightstatus);
        MobileAds.initialize(this, "ca-app-pub-3609953011019731~1851437217");
        goodnightstatusbanner = findViewById(R.id.goodnightstatusbanner);
        AdRequest adRequest = new AdRequest.Builder().build();
        goodnightstatusbanner.loadAd(adRequest);
    }
    public void copybuttononClick(View view)
    {
        TextView goodnightone = (TextView) findViewById(R.id.goodnightone);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(goodnightone.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void sharebuttononClick(View view)
    {
        TextView goodnightone = (TextView) findViewById(R.id.goodnightone);

        String s = goodnightone.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy1buttononClick(View view)
    {
        TextView goodnighttwo = (TextView) findViewById(R.id.goodnighttwo);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(goodnighttwo.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share1buttononClick(View view)
    {
        TextView goodnighttwo = (TextView) findViewById(R.id.goodnighttwo);

        String s = goodnighttwo.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy2buttononClick(View view)
    {
        TextView goodnightthree = (TextView) findViewById(R.id.goodnightthree);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(goodnightthree.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share2buttononClick(View view)
    {
        TextView goodnightthree = (TextView) findViewById(R.id.goodnightthree);

        String s = goodnightthree.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy4buttononClick(View view)
    {
        TextView goodnightfour = (TextView) findViewById(R.id.goodnightfour);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(goodnightfour.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share4buttononClick(View view)
    {
        TextView goodnightfour = (TextView) findViewById(R.id.goodnightfour);

        String s = goodnightfour.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy5buttononClick(View view)
    {
        TextView goodnightfive = (TextView) findViewById(R.id.goodnightfive);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(goodnightfive.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share5buttononClick(View view)
    {
        TextView goodnightfive = (TextView) findViewById(R.id.goodnightfive);

        String s = goodnightfive.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy6buttononClick(View view)
    {
        TextView goodnightsix = (TextView) findViewById(R.id.goodnightsix);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(goodnightsix.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share6buttononClick(View view)
    {
        TextView goodnightsix = (TextView) findViewById(R.id.goodnightsix);

        String s = goodnightsix.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy7buttononClick(View view)
    {
        TextView goodnightseven = (TextView) findViewById(R.id.goodnightseven);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(goodnightseven.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share7buttononClick(View view)
    {
        TextView goodnightseven = (TextView) findViewById(R.id.goodnightseven);

        String s = goodnightseven.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy8buttononClick(View view)
    {
        TextView goodnighteight = (TextView) findViewById(R.id.goodnighteight);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(goodnighteight.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share8buttononClick(View view)
    {
        TextView goodnighteight = (TextView) findViewById(R.id.goodnighteight);

        String s = goodnighteight.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy9buttononClick(View view)
    {
        TextView goodnightnine = (TextView) findViewById(R.id.goodnightnine);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(goodnightnine.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share9buttononClick(View view)
    {
        TextView goodnightnine = (TextView) findViewById(R.id.goodnightnine);

        String s = goodnightnine.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy10buttononClick(View view)
    {
        TextView goodnightten = (TextView) findViewById(R.id.goodnightten);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(goodnightten.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share10buttononClick(View view)
    {
        TextView goodnightten = (TextView) findViewById(R.id.goodnightten);

        String s = goodnightten.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
}
