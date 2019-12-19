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

public class Christmasstatus extends AppCompatActivity {
    private AdView christmasstatusbanner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_christmasstatus);
        MobileAds.initialize(this, "ca-app-pub-3609953011019731~1851437217");
        christmasstatusbanner = findViewById(R.id.christmasstatusbanner);
        AdRequest adRequest = new AdRequest.Builder().build();
        christmasstatusbanner.loadAd(adRequest);
    }
    public void copybuttononClick(View view)
    {
        TextView christmasone = (TextView) findViewById(R.id.christmasone);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(christmasone.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void sharebuttononClick(View view)
    {
        TextView christmasone = (TextView) findViewById(R.id.christmasone);

        String s = christmasone.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy1buttononClick(View view)
    {
        TextView christmastwo = (TextView) findViewById(R.id.christmastwo);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(christmastwo.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share1buttononClick(View view)
    {
        TextView christmastwo = (TextView) findViewById(R.id.christmastwo);

        String s = christmastwo.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy2buttononClick(View view)
    {
        TextView christmasthree = (TextView) findViewById(R.id.christmasthree);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(christmasthree.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share2buttononClick(View view)
    {
        TextView christmasthree = (TextView) findViewById(R.id.christmasthree);

        String s = christmasthree.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy4buttononClick(View view)
    {
        TextView christmasfour = (TextView) findViewById(R.id.christmasfour);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(christmasfour.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share4buttononClick(View view)
    {
        TextView christmasfour = (TextView) findViewById(R.id.christmasfour);

        String s = christmasfour.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy5buttononClick(View view)
    {
        TextView christmasfive = (TextView) findViewById(R.id.christmasfive);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(christmasfive.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share5buttononClick(View view)
    {
        TextView christmasfive = (TextView) findViewById(R.id.christmasfive);

        String s = christmasfive.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy6buttononClick(View view)
    {
        TextView christmassix = (TextView) findViewById(R.id.christmassix);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(christmassix.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share6buttononClick(View view)
    {
        TextView christmassix = (TextView) findViewById(R.id.christmassix);

        String s = christmassix.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy7buttononClick(View view)
    {
        TextView christmasseven = (TextView) findViewById(R.id.christmasseven);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(christmasseven.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share7buttononClick(View view)
    {
        TextView christmasseven = (TextView) findViewById(R.id.christmasseven);

        String s = christmasseven.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy8buttononClick(View view)
    {
        TextView christmaseight = (TextView) findViewById(R.id.christmaseight);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(christmaseight.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share8buttononClick(View view)
    {
        TextView christmaseight = (TextView) findViewById(R.id.christmaseight);

        String s = christmaseight.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy9buttononClick(View view)
    {
        TextView christmasnine = (TextView) findViewById(R.id.christmasnine);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(christmasnine.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share9buttononClick(View view)
    {
        TextView christmasnine = (TextView) findViewById(R.id.christmasnine);

        String s = christmasnine.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy10buttononClick(View view)
    {
        TextView christmasten = (TextView) findViewById(R.id.christmasten);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(christmasten.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share10buttononClick(View view)
    {
        TextView christmasten = (TextView) findViewById(R.id.christmasten);

        String s = christmasten.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
}
