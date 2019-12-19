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

public class Rudestatus extends AppCompatActivity {
    private AdView rudestatusbanner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rudestatus);
        MobileAds.initialize(this, "ca-app-pub-3609953011019731~1851437217");
        rudestatusbanner = findViewById(R.id.rudestatusbanner);
        AdRequest adRequest = new AdRequest.Builder().build();
        rudestatusbanner.loadAd(adRequest);
    }
    public void copybuttononClick(View view)
    {
        TextView rudeone = (TextView) findViewById(R.id.rudeone);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(rudeone.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void sharebuttononClick(View view)
    {
        TextView rudeone = (TextView) findViewById(R.id.rudeone);

        String s = rudeone.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy1buttononClick(View view)
    {
        TextView rudetwo = (TextView) findViewById(R.id.rudetwo);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(rudetwo.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share1buttononClick(View view)
    {
        TextView rudetwo = (TextView) findViewById(R.id.rudetwo);

        String s = rudetwo.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy2buttononClick(View view)
    {
        TextView rudethree = (TextView) findViewById(R.id.rudethree);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(rudethree.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share2buttononClick(View view)
    {
        TextView rudethree = (TextView) findViewById(R.id.rudethree);

        String s = rudethree.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy4buttononClick(View view)
    {
        TextView rudefour = (TextView) findViewById(R.id.rudefour);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(rudefour.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share4buttononClick(View view)
    {
        TextView rudefour = (TextView) findViewById(R.id.rudefour);

        String s = rudefour.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy5buttononClick(View view)
    {
        TextView rudefive = (TextView) findViewById(R.id.rudefive);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(rudefive.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share5buttononClick(View view)
    {
        TextView rudefive = (TextView) findViewById(R.id.rudefive);

        String s = rudefive.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy6buttononClick(View view)
    {
        TextView rudesix = (TextView) findViewById(R.id.rudesix);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(rudesix.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share6buttononClick(View view)
    {
        TextView rudesix = (TextView) findViewById(R.id.rudesix);

        String s = rudesix.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy7buttononClick(View view)
    {
        TextView rudeseven = (TextView) findViewById(R.id.rudeseven);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(rudeseven.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share7buttononClick(View view)
    {
        TextView rudeseven = (TextView) findViewById(R.id.rudeseven);

        String s = rudeseven.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy8buttononClick(View view)
    {
        TextView rudeeight = (TextView) findViewById(R.id.rudeeight);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(rudeeight.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share8buttononClick(View view)
    {
        TextView rudeeight = (TextView) findViewById(R.id.rudeeight);

        String s = rudeeight.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy9buttononClick(View view)
    {
        TextView rudenine = (TextView) findViewById(R.id.rudenine);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(rudenine.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share9buttononClick(View view)
    {
        TextView rudenine = (TextView) findViewById(R.id.rudenine);

        String s = rudenine.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy10buttononClick(View view)
    {
        TextView rudeten = (TextView) findViewById(R.id.rudeten);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(rudeten.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share10buttononClick(View view)
    {
        TextView rudeten = (TextView) findViewById(R.id.rudeten);

        String s = rudeten.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
}
