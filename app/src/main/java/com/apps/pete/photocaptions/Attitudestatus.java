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

public class Attitudestatus extends AppCompatActivity {
    private AdView attitudestatusbanner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attitudestatus);
        MobileAds.initialize(this, "ca-app-pub-3609953011019731~1851437217");
        attitudestatusbanner = findViewById(R.id.attitudestatusbanner);
        AdRequest adRequest = new AdRequest.Builder().build();
        attitudestatusbanner.loadAd(adRequest);
    }
    public void copybuttononClick(View view)
    {
        TextView attitudeone = (TextView) findViewById(R.id.attitudeone);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(attitudeone.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void sharebuttononClick(View view)
    {
        TextView attitudeone = (TextView) findViewById(R.id.attitudeone);

        String s = attitudeone.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy1buttononClick(View view)
    {
        TextView attitudetwo = (TextView) findViewById(R.id.attitudetwo);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(attitudetwo.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share1buttononClick(View view)
    {
        TextView attitudetwo = (TextView) findViewById(R.id.attitudetwo);

        String s = attitudetwo.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy2buttononClick(View view)
    {
        TextView attitudethree = (TextView) findViewById(R.id.attitudethree);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(attitudethree.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share2buttononClick(View view)
    {
        TextView attitudethree = (TextView) findViewById(R.id.attitudethree);

        String s = attitudethree.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy4buttononClick(View view)
    {
        TextView attitudefour = (TextView) findViewById(R.id.attitudefour);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(attitudefour.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share4buttononClick(View view)
    {
        TextView attitudefour = (TextView) findViewById(R.id.attitudefour);

        String s = attitudefour.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy5buttononClick(View view)
    {
        TextView attitudefive = (TextView) findViewById(R.id.attitudefive);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(attitudefive.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share5buttononClick(View view)
    {
        TextView attitudefive = (TextView) findViewById(R.id.attitudefive);

        String s = attitudefive.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy6buttononClick(View view)
    {
        TextView attitudesix = (TextView) findViewById(R.id.attitudesix);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(attitudesix.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share6buttononClick(View view)
    {
        TextView attitudesix = (TextView) findViewById(R.id.attitudesix);

        String s = attitudesix.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy7buttononClick(View view)
    {
        TextView attitudeseven = (TextView) findViewById(R.id.attitudeseven);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(attitudeseven.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share7buttononClick(View view)
    {
        TextView attitudeseven = (TextView) findViewById(R.id.attitudeseven);

        String s = attitudeseven.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy8buttononClick(View view)
    {
        TextView attitudeeight = (TextView) findViewById(R.id.attitudeeight);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(attitudeeight.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share8buttononClick(View view)
    {
        TextView attitudeeight = (TextView) findViewById(R.id.attitudeeight);

        String s = attitudeeight.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy9buttononClick(View view)
    {
        TextView attitudenine = (TextView) findViewById(R.id.attitudenine);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(attitudenine.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share9buttononClick(View view)
    {
        TextView attitudenine = (TextView) findViewById(R.id.attitudenine);

        String s = attitudenine.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy10buttononClick(View view)
    {
        TextView attitudeten = (TextView) findViewById(R.id.attitudeten);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(attitudeten.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share10buttononClick(View view)
    {
        TextView attitudeten = (TextView) findViewById(R.id.attitudeten);

        String s = attitudeten.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
}
