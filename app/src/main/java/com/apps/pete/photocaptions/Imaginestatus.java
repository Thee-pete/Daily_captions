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

public class Imaginestatus extends AppCompatActivity {
    private AdView imaginestatusbanner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imaginestatus);
        MobileAds.initialize(this, "ca-app-pub-3609953011019731~1851437217");
        imaginestatusbanner = findViewById(R.id.imaginestatusbanner);
        AdRequest adRequest = new AdRequest.Builder().build();
        imaginestatusbanner.loadAd(adRequest);
    }
    public void copybuttononClick(View view)
    {
        TextView imagineone = (TextView) findViewById(R.id.imagineone);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(imagineone.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void sharebuttononClick(View view)
    {
        TextView imagineone = (TextView) findViewById(R.id.imagineone);

        String s = imagineone.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy1buttononClick(View view)
    {
        TextView imaginetwo = (TextView) findViewById(R.id.imaginetwo);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(imaginetwo.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share1buttononClick(View view)
    {
        TextView imaginetwo = (TextView) findViewById(R.id.imaginetwo);

        String s = imaginetwo.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy2buttononClick(View view)
    {
        TextView imaginethree = (TextView) findViewById(R.id.imaginethree);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(imaginethree.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share2buttononClick(View view)
    {
        TextView imaginethree = (TextView) findViewById(R.id.imaginethree);

        String s = imaginethree.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy4buttononClick(View view)
    {
        TextView imaginefour = (TextView) findViewById(R.id.imaginefour);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(imaginefour.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share4buttononClick(View view)
    {
        TextView imaginefour = (TextView) findViewById(R.id.imaginefour);

        String s = imaginefour.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy5buttononClick(View view)
    {
        TextView imaginefive = (TextView) findViewById(R.id.imaginefive);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(imaginefive.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share5buttononClick(View view)
    {
        TextView imaginefive = (TextView) findViewById(R.id.imaginefive);

        String s = imaginefive.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy6buttononClick(View view)
    {
        TextView imaginesix = (TextView) findViewById(R.id.imaginesix);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(imaginesix.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share6buttononClick(View view)
    {
        TextView imaginesix = (TextView) findViewById(R.id.imaginesix);

        String s = imaginesix.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy7buttononClick(View view)
    {
        TextView imagineseven = (TextView) findViewById(R.id.imagineseven);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(imagineseven.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share7buttononClick(View view)
    {
        TextView imagineseven = (TextView) findViewById(R.id.imagineseven);

        String s = imagineseven.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy8buttononClick(View view)
    {
        TextView imagineeight = (TextView) findViewById(R.id.imagineeight);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(imagineeight.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share8buttononClick(View view)
    {
        TextView imagineeight = (TextView) findViewById(R.id.imagineeight);

        String s = imagineeight.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy9buttononClick(View view)
    {
        TextView imaginenine = (TextView) findViewById(R.id.imaginenine);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(imaginenine.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share9buttononClick(View view)
    {
        TextView imaginenine = (TextView) findViewById(R.id.imaginenine);

        String s = imaginenine.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy10buttononClick(View view)
    {
        TextView imagineten = (TextView) findViewById(R.id.imagineten);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(imagineten.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share10buttononClick(View view)
    {
        TextView imagineten = (TextView) findViewById(R.id.imagineten);

        String s = imagineten.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
}
