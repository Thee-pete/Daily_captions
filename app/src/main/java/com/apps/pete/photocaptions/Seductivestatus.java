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

public class Seductivestatus extends AppCompatActivity {
    private AdView seductivestatusbanner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seductivestatus);
        MobileAds.initialize(this, "ca-app-pub-3609953011019731~1851437217");
        seductivestatusbanner = findViewById(R.id.seductivestatusbanner);
        AdRequest adRequest = new AdRequest.Builder().build();
        seductivestatusbanner.loadAd(adRequest);
    }
    public void copybuttononClick(View view)
    {
        TextView seductiveone = (TextView) findViewById(R.id.seductiveone);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(seductiveone.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void sharebuttononClick(View view)
    {
        TextView seductiveone = (TextView) findViewById(R.id.seductiveone);

        String s = seductiveone.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy1buttononClick(View view)
    {
        TextView seductivetwo = (TextView) findViewById(R.id.seductivetwo);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(seductivetwo.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share1buttononClick(View view)
    {
        TextView seductivetwo = (TextView) findViewById(R.id.seductivetwo);

        String s = seductivetwo.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy2buttononClick(View view)
    {
        TextView seductivethree = (TextView) findViewById(R.id.seductivethree);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(seductivethree.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share2buttononClick(View view)
    {
        TextView seductivethree = (TextView) findViewById(R.id.seductivethree);

        String s = seductivethree.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy4buttononClick(View view)
    {
        TextView seductivefour = (TextView) findViewById(R.id.seductivefour);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(seductivefour.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share4buttononClick(View view)
    {
        TextView seductivefour = (TextView) findViewById(R.id.seductivefour);

        String s = seductivefour.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy5buttononClick(View view)
    {
        TextView seductivefive = (TextView) findViewById(R.id.seductivefive);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(seductivefive.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share5buttononClick(View view)
    {
        TextView seductivefive = (TextView) findViewById(R.id.seductivefive);

        String s = seductivefive.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy6buttononClick(View view)
    {
        TextView seductivesix = (TextView) findViewById(R.id.seductivesix);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(seductivesix.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share6buttononClick(View view)
    {
        TextView seductivesix = (TextView) findViewById(R.id.seductivesix);

        String s = seductivesix.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy7buttononClick(View view)
    {
        TextView seductiveseven = (TextView) findViewById(R.id.seductiveseven);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(seductiveseven.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share7buttononClick(View view)
    {
        TextView seductiveseven = (TextView) findViewById(R.id.seductiveseven);

        String s = seductiveseven.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy8buttononClick(View view)
    {
        TextView seductiveeight = (TextView) findViewById(R.id.seductiveeight);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(seductiveeight.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share8buttononClick(View view)
    {
        TextView seductiveeight = (TextView) findViewById(R.id.seductiveeight);

        String s = seductiveeight.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy9buttononClick(View view)
    {
        TextView seductivenine = (TextView) findViewById(R.id.seductivenine);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(seductivenine.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share9buttononClick(View view)
    {
        TextView seductivenine = (TextView) findViewById(R.id.seductivenine);

        String s = seductivenine.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy10buttononClick(View view)
    {
        TextView seductiveten = (TextView) findViewById(R.id.seductiveten);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(seductiveten.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share10buttononClick(View view)
    {
        TextView seductiveten = (TextView) findViewById(R.id.seductiveten);

        String s = seductiveten.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
}
