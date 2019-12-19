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

public class Knowledgestatus extends AppCompatActivity {
    private AdView knowledgestatusbanner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_knowledgestatus);
        MobileAds.initialize(this, "ca-app-pub-3609953011019731~1851437217");
        knowledgestatusbanner = findViewById(R.id.knowledgestatusbanner);
        AdRequest adRequest = new AdRequest.Builder().build();
        knowledgestatusbanner.loadAd(adRequest);
    }
    public void copybuttononClick(View view)
    {
        TextView knowledgeone = (TextView) findViewById(R.id.knowledgeone);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(knowledgeone.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void sharebuttononClick(View view)
    {
        TextView knowledgeone = (TextView) findViewById(R.id.knowledgeone);

        String s = knowledgeone.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy1buttononClick(View view)
    {
        TextView knowledgetwo = (TextView) findViewById(R.id.knowledgetwo);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(knowledgetwo.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share1buttononClick(View view)
    {
        TextView breakuptwo = (TextView) findViewById(R.id.breakuptwo);

        String s = breakuptwo.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy2buttononClick(View view)
    {
        TextView knowledgethree = (TextView) findViewById(R.id.knowledgethree);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(knowledgethree.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share2buttononClick(View view)
    {
        TextView knowledgethree = (TextView) findViewById(R.id.knowledgethree);

        String s = knowledgethree.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy4buttononClick(View view)
    {
        TextView knowledgefour = (TextView) findViewById(R.id.knowledgefour);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(knowledgefour.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share4buttononClick(View view)
    {
        TextView knowledgefour = (TextView) findViewById(R.id.knowledgefour);

        String s = knowledgefour.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy5buttononClick(View view)
    {
        TextView knowledgefive = (TextView) findViewById(R.id.knowledgefive);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(knowledgefive.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share5buttononClick(View view)
    {
        TextView knowledgefive = (TextView) findViewById(R.id.knowledgefive);

        String s = knowledgefive.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy6buttononClick(View view)
    {
        TextView knowledgesix = (TextView) findViewById(R.id.knowledgesix);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(knowledgesix.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share6buttononClick(View view)
    {
        TextView knowledgesix = (TextView) findViewById(R.id.knowledgesix);

        String s = knowledgesix.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy7buttononClick(View view)
    {
        TextView knowledgeseven = (TextView) findViewById(R.id.knowledgeseven);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(knowledgeseven.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share7buttononClick(View view)
    {
        TextView knowledgeseven = (TextView) findViewById(R.id.knowledgeseven);

        String s = knowledgeseven.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy8buttononClick(View view)
    {
        TextView knowledgeeight = (TextView) findViewById(R.id.knowledgeeight);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(knowledgeeight.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share8buttononClick(View view)
    {
        TextView knowledgeeight = (TextView) findViewById(R.id.knowledgeeight);

        String s = knowledgeeight.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy9buttononClick(View view)
    {
        TextView knowledgenine = (TextView) findViewById(R.id.knowledgenine);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(knowledgenine.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share9buttononClick(View view)
    {
        TextView knowledgenine = (TextView) findViewById(R.id.knowledgenine);

        String s = knowledgenine.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy10buttononClick(View view)
    {
        TextView knowledgeten = (TextView) findViewById(R.id.knowledgeten);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(knowledgeten.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share10buttononClick(View view)
    {
        TextView knowledgeten = (TextView) findViewById(R.id.knowledgeten);

        String s = knowledgeten.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
}
