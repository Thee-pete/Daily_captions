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

public class Dirtystatus extends AppCompatActivity {
    private AdView dirtystatusbanner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dirtystatus);
        MobileAds.initialize(this, "ca-app-pub-3609953011019731~1851437217");
        dirtystatusbanner = findViewById(R.id.dirtystatusbanner);
        AdRequest adRequest = new AdRequest.Builder().build();
        dirtystatusbanner.loadAd(adRequest);
    }

    public void copybuttononClick(View view)
    {
        TextView dirtyone = (TextView) findViewById(R.id.dirtyone);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(dirtyone.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void sharebuttononClick(View view)
    {
        TextView dirtyone = (TextView) findViewById(R.id.dirtyone);

        String s = dirtyone.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy1buttononClick(View view)
    {
        TextView dirtytwo = (TextView) findViewById(R.id.dirtytwo);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(dirtytwo.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share1buttononClick(View view)
    {
        TextView dirtytwo = (TextView) findViewById(R.id.dirtytwo);

        String s = dirtytwo.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy2buttononClick(View view)
    {
        TextView dirtythree = (TextView) findViewById(R.id.dirtythree);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(dirtythree.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share2buttononClick(View view)
    {
        TextView dirtythree = (TextView) findViewById(R.id.dirtythree);

        String s = dirtythree.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy4buttononClick(View view)
    {
        TextView dirtyfour = (TextView) findViewById(R.id.dirtyfour);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(dirtyfour.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share4buttononClick(View view)
    {
        TextView dirtyfour = (TextView) findViewById(R.id.dirtyfour);

        String s = dirtyfour.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy5buttononClick(View view)
    {
        TextView dirtyfive = (TextView) findViewById(R.id.dirtyfive);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(dirtyfive.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share5buttononClick(View view)
    {
        TextView dirtyfive = (TextView) findViewById(R.id.dirtyfive);

        String s = dirtyfive.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy6buttononClick(View view)
    {
        TextView dirtysix = (TextView) findViewById(R.id.dirtysix);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(dirtysix.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share6buttononClick(View view)
    {
        TextView dirtysix = (TextView) findViewById(R.id.dirtysix);

        String s = dirtysix.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy7buttononClick(View view)
    {
        TextView dirtyseven = (TextView) findViewById(R.id.dirtyseven);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(dirtyseven.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share7buttononClick(View view)
    {
        TextView dirtyseven = (TextView) findViewById(R.id.dirtyseven);

        String s = dirtyseven.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy8buttononClick(View view)
    {
        TextView dirtyeight = (TextView) findViewById(R.id.dirtyeight);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(dirtyeight.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share8buttononClick(View view)
    {
        TextView dirtyeight = (TextView) findViewById(R.id.dirtyeight);

        String s = dirtyeight.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy9buttononClick(View view)
    {
        TextView dirtynine = (TextView) findViewById(R.id.dirtynine);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(dirtynine.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share9buttononClick(View view)
    {
        TextView dirtynine = (TextView) findViewById(R.id.dirtynine);

        String s = dirtynine.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy10buttononClick(View view)
    {
        TextView dirtyten = (TextView) findViewById(R.id.dirtyten);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(dirtyten.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share10buttononClick(View view)
    {
        TextView dirtyten = (TextView) findViewById(R.id.dirtyten);

        String s = dirtyten.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
}
