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

public class Creepystatus extends AppCompatActivity {
    private AdView creepystatusbanner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creepystatus);
        MobileAds.initialize(this, "ca-app-pub-3609953011019731~1851437217");
        creepystatusbanner = findViewById(R.id.creepystatusbanner);
        AdRequest adRequest = new AdRequest.Builder().build();
        creepystatusbanner.loadAd(adRequest);
    }
    public void copybuttononClick(View view)
    {
        TextView creepyone = (TextView) findViewById(R.id.creepyone);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(creepyone.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void sharebuttononClick(View view)
    {
        TextView creepyone = (TextView) findViewById(R.id.creepyone);

        String s = creepyone.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy1buttononClick(View view)
    {
        TextView creepytwo = (TextView) findViewById(R.id.creepytwo);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(creepytwo.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share1buttononClick(View view)
    {
        TextView creepytwo = (TextView) findViewById(R.id.creepytwo);

        String s = creepytwo.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy2buttononClick(View view)
    {
        TextView creepythree = (TextView) findViewById(R.id.creepythree);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(creepythree.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share2buttononClick(View view)
    {
        TextView creepythree = (TextView) findViewById(R.id.creepythree);

        String s = creepythree.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy4buttononClick(View view)
    {
        TextView creepyfour = (TextView) findViewById(R.id.creepyfour);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(creepyfour.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share4buttononClick(View view)
    {
        TextView creepyfour = (TextView) findViewById(R.id.creepyfour);

        String s = creepyfour.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy5buttononClick(View view)
    {
        TextView creepyfive = (TextView) findViewById(R.id.creepyfive);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(creepyfive.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share5buttononClick(View view)
    {
        TextView creepyfive = (TextView) findViewById(R.id.creepyfive);

        String s = creepyfive.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy6buttononClick(View view)
    {
        TextView creepysix = (TextView) findViewById(R.id.creepysix);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(creepysix.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share6buttononClick(View view)
    {
        TextView creepysix = (TextView) findViewById(R.id.creepysix);

        String s = creepysix.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy7buttononClick(View view)
    {
        TextView creepyseven = (TextView) findViewById(R.id.creepyseven);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(creepyseven.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share7buttononClick(View view)
    {
        TextView creepyseven = (TextView) findViewById(R.id.creepyseven);

        String s = creepyseven.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy8buttononClick(View view)
    {
        TextView creepyeight = (TextView) findViewById(R.id.creepyeight);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(creepyeight.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share8buttononClick(View view)
    {
        TextView creepyeight = (TextView) findViewById(R.id.creepyeight);

        String s = creepyeight.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy9buttononClick(View view)
    {
        TextView creepynine = (TextView) findViewById(R.id.creepynine);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(creepynine.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share9buttononClick(View view)
    {
        TextView creepynine = (TextView) findViewById(R.id.creepynine);

        String s = creepynine.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy10buttononClick(View view)
    {
        TextView creepyten = (TextView) findViewById(R.id.creepyten);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(creepyten.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share10buttononClick(View view)
    {
        TextView creepyten = (TextView) findViewById(R.id.creepyten);

        String s = creepyten.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
}
