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

public class Hormonalstatus extends AppCompatActivity {
    private AdView hormonalstatusbanner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hormonalstatus);
        MobileAds.initialize(this, "ca-app-pub-3609953011019731~1851437217");
        hormonalstatusbanner = findViewById(R.id.hormonalstatusbanner);
        AdRequest adRequest = new AdRequest.Builder().build();
        hormonalstatusbanner.loadAd(adRequest);
    }
    public void copybuttononClick(View view)
    {
        TextView hormonalone = (TextView) findViewById(R.id.hormonalone);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(hormonalone.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void sharebuttononClick(View view)
    {
        TextView hormonalone = (TextView) findViewById(R.id.hormonalone);

        String s = hormonalone.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy1buttononClick(View view)
    {
        TextView hormonaltwo = (TextView) findViewById(R.id.hormonaltwo);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(hormonaltwo.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share1buttononClick(View view)
    {
        TextView hormonaltwo = (TextView) findViewById(R.id.hormonaltwo);

        String s = hormonaltwo.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy2buttononClick(View view)
    {
        TextView hormonalthree = (TextView) findViewById(R.id.hormonalthree);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(hormonalthree.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share2buttononClick(View view)
    {
        TextView hormonalthree = (TextView) findViewById(R.id.hormonalthree);

        String s = hormonalthree.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy4buttononClick(View view)
    {
        TextView hormonalfour = (TextView) findViewById(R.id.hormonalfour);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(hormonalfour.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share4buttononClick(View view)
    {
        TextView hormonalfour = (TextView) findViewById(R.id.hormonalfour);

        String s = hormonalfour.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy5buttononClick(View view)
    {
        TextView hormonalfive = (TextView) findViewById(R.id.hormonalfive);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(hormonalfive.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share5buttononClick(View view)
    {
        TextView hormonalfive = (TextView) findViewById(R.id.hormonalfive);

        String s = hormonalfive.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy6buttononClick(View view)
    {
        TextView hormonalsix = (TextView) findViewById(R.id.hormonalsix);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(hormonalsix.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share6buttononClick(View view)
    {
        TextView hormonalsix = (TextView) findViewById(R.id.hormonalsix);

        String s = hormonalsix.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy7buttononClick(View view)
    {
        TextView hormonalseven = (TextView) findViewById(R.id.hormonalseven);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(hormonalseven.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share7buttononClick(View view)
    {
        TextView hormonalseven = (TextView) findViewById(R.id.hormonalseven);

        String s = hormonalseven.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy8buttononClick(View view)
    {
        TextView hormonaleight = (TextView) findViewById(R.id.hormonaleight);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(hormonaleight.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share8buttononClick(View view)
    {
        TextView hormonaleight = (TextView) findViewById(R.id.hormonaleight);

        String s = hormonaleight.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy9buttononClick(View view)
    {
        TextView hormonalnine = (TextView) findViewById(R.id.hormonalnine);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(hormonalnine.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share9buttononClick(View view)
    {
        TextView hormonalnine = (TextView) findViewById(R.id.hormonalnine);

        String s = hormonalnine.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy10buttononClick(View view)
    {
        TextView hormonalten = (TextView) findViewById(R.id.hormonalten);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(hormonalten.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share10buttononClick(View view)
    {
        TextView hormonalten = (TextView) findViewById(R.id.hormonalten);

        String s = hormonalten.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
}

