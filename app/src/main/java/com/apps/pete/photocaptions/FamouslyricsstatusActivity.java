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

public class FamouslyricsstatusActivity extends AppCompatActivity {
    private AdView lyricsstatusbanner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_famouslyricsstatus);
        MobileAds.initialize(this, "ca-app-pub-3609953011019731~1851437217");
        lyricsstatusbanner = findViewById(R.id.famouslyricsstatusbanner);
        AdRequest adRequest = new AdRequest.Builder().build();
        lyricsstatusbanner.loadAd(adRequest);
    }
    public void copybuttononClick(View view)
    {
        TextView famlyricone = (TextView) findViewById(R.id.famlyricone);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(famlyricone.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void sharebuttononClick(View view)
    {
        TextView famlyricone = (TextView) findViewById(R.id.famlyricone);

        String s = famlyricone.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy1buttononClick(View view)
    {
        TextView famlyrictwo = (TextView) findViewById(R.id.famlyrictwo);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(famlyrictwo.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share1buttononClick(View view)
    {
        TextView famlyrictwo = (TextView) findViewById(R.id.famlyrictwo);

        String s = famlyrictwo.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy2buttononClick(View view)
    {
        TextView famlyricthree = (TextView) findViewById(R.id.famlyricthree);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(famlyricthree.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share2buttononClick(View view)
    {
        TextView famlyricthree = (TextView) findViewById(R.id.famlyricthree);

        String s = famlyricthree.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy4buttononClick(View view)
    {
        TextView famlyricfour = (TextView) findViewById(R.id.famlyricfour);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(famlyricfour.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share4buttononClick(View view)
    {
        TextView famlyricfour = (TextView) findViewById(R.id.famlyricfour);

        String s = famlyricfour.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy5buttononClick(View view)
    {
        TextView famlyricfive = (TextView) findViewById(R.id.famlyricfive);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(famlyricfive.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share5buttononClick(View view)
    {
        TextView famlyricfive = (TextView) findViewById(R.id.famlyricfive);

        String s = famlyricfive.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy6buttononClick(View view)
    {
        TextView famlyricsix = (TextView) findViewById(R.id.famlyricsix);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(famlyricsix.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share6buttononClick(View view)
    {
        TextView famlyricsix = (TextView) findViewById(R.id.famlyricsix);

        String s = famlyricsix.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy7buttononClick(View view)
    {
        TextView famlyricseven = (TextView) findViewById(R.id.famlyricseven);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(famlyricseven.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share7buttononClick(View view)
    {
        TextView famlyricseven = (TextView) findViewById(R.id.famlyricseven);

        String s = famlyricseven.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy8buttononClick(View view)
    {
        TextView famlyriceight = (TextView) findViewById(R.id.famlyriceight);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(famlyriceight.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share8buttononClick(View view)
    {
        TextView famlyriceight = (TextView) findViewById(R.id.famlyriceight);

        String s = famlyriceight.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy9buttononClick(View view)
    {
        TextView famlyricnine = (TextView) findViewById(R.id.famlyricnine);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(famlyricnine.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share9buttononClick(View view)
    {
        TextView famlyricnine = (TextView) findViewById(R.id.famlyricnine);

        String s = famlyricnine.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy10buttononClick(View view)
    {
        TextView famlyricten = (TextView) findViewById(R.id.famlyricten);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(famlyricten.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share10buttononClick(View view)
    {
        TextView famlyricten = (TextView) findViewById(R.id.famlyricten);

        String s = famlyricten.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
}
