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

public class SpiritualstatusActivity extends AppCompatActivity {
    private AdView spiritualstatusbanner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spiritualstatus);
        MobileAds.initialize(this, "ca-app-pub-3609953011019731~1851437217");
        spiritualstatusbanner = findViewById(R.id.spiritualstatusbanner);
        AdRequest adRequest = new AdRequest.Builder().build();
        spiritualstatusbanner.loadAd(adRequest);
    }
    public void copybuttononClick(View view)
    {
        TextView spiritone = (TextView) findViewById(R.id.spiritone);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(spiritone.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void sharebuttononClick(View view)
    {
        TextView spiritone = (TextView) findViewById(R.id.spiritone);

        String s = spiritone.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy1buttononClick(View view)
    {
        TextView spirittwo = (TextView) findViewById(R.id.spirittwo);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(spirittwo.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share1buttononClick(View view)
    {
        TextView spirittwo = (TextView) findViewById(R.id.spirittwo);

        String s = spirittwo.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy2buttononClick(View view)
    {
        TextView spiritthree = (TextView) findViewById(R.id.spiritthree);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(spiritthree.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share2buttononClick(View view)
    {
        TextView spiritthree = (TextView) findViewById(R.id.spiritthree);

        String s = spiritthree.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy4buttononClick(View view)
    {
        TextView spiritfour = (TextView) findViewById(R.id.spiritfour);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(spiritfour.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share4buttononClick(View view)
    {
        TextView spiritfour = (TextView) findViewById(R.id.spiritfour);

        String s = spiritfour.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy5buttononClick(View view)
    {
        TextView spiritfive = (TextView) findViewById(R.id.spiritfive);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(spiritfive.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share5buttononClick(View view)
    {
        TextView spiritfive = (TextView) findViewById(R.id.spiritfive);

        String s = spiritfive.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy6buttononClick(View view)
    {
        TextView spiritsix = (TextView) findViewById(R.id.spiritsix);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(spiritsix.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share6buttononClick(View view)
    {
        TextView spiritsix = (TextView) findViewById(R.id.spiritsix);

        String s = spiritsix.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy7buttononClick(View view)
    {
        TextView spiritseven = (TextView) findViewById(R.id.spiritseven);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(spiritseven.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share7buttononClick(View view)
    {
        TextView spiritseven = (TextView) findViewById(R.id.spiritseven);

        String s = spiritseven.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy8buttononClick(View view)
    {
        TextView spiriteight = (TextView) findViewById(R.id.spiriteight);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(spiriteight.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share8buttononClick(View view)
    {
        TextView spiriteight = (TextView) findViewById(R.id.spiriteight);

        String s = spiriteight.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy9buttononClick(View view)
    {
        TextView spiritnine = (TextView) findViewById(R.id.spiritnine);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(spiritnine.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share9buttononClick(View view)
    {
        TextView spiritnine = (TextView) findViewById(R.id.spiritnine);

        String s = spiritnine.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy10buttononClick(View view)
    {
        TextView spiritten = (TextView) findViewById(R.id.spiritten);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(spiritten.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share10buttononClick(View view)
    {
        TextView spiritten = (TextView) findViewById(R.id.spiritten);

        String s = spiritten.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
}
