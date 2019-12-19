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

public class Incorrectfactsstatus extends AppCompatActivity {
    private AdView incorrectfactsstatusbanner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_incorrectfactsstatus);
        MobileAds.initialize(this, "ca-app-pub-3609953011019731~1851437217");
        incorrectfactsstatusbanner = findViewById(R.id.incorrectfactsstatusbanner);
        AdRequest adRequest = new AdRequest.Builder().build();
        incorrectfactsstatusbanner.loadAd(adRequest);
    }
    public void copybuttononClick(View view)
    {
        TextView incorrectfactsone = (TextView) findViewById(R.id.incorrectfactsone);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(incorrectfactsone.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void sharebuttononClick(View view)
    {
        TextView incorrectfactsone = (TextView) findViewById(R.id.incorrectfactsone);

        String s = incorrectfactsone.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy1buttononClick(View view)
    {
        TextView incorrectfactstwo = (TextView) findViewById(R.id.incorrectfactstwo);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(incorrectfactstwo.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share1buttononClick(View view)
    {
        TextView incorrectfactstwo = (TextView) findViewById(R.id.incorrectfactstwo);

        String s = incorrectfactstwo.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy2buttononClick(View view)
    {
        TextView incorrectfactsthree = (TextView) findViewById(R.id.incorrectfactsthree);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(incorrectfactsthree.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share2buttononClick(View view)
    {
        TextView incorrectfactsthree = (TextView) findViewById(R.id.incorrectfactsthree);

        String s = incorrectfactsthree.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy4buttononClick(View view)
    {
        TextView incorrectfactsfour = (TextView) findViewById(R.id.incorrectfactsfour);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(incorrectfactsfour.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share4buttononClick(View view)
    {
        TextView incorrectfactsfour = (TextView) findViewById(R.id.incorrectfactsfour);

        String s = incorrectfactsfour.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy5buttononClick(View view)
    {
        TextView incorrectfactsfive = (TextView) findViewById(R.id.incorrectfactsfive);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(incorrectfactsfive.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share5buttononClick(View view)
    {
        TextView incorrectfactsfive = (TextView) findViewById(R.id.incorrectfactsfive);

        String s = incorrectfactsfive.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy6buttononClick(View view)
    {
        TextView incorrectfactssix = (TextView) findViewById(R.id.incorrectfactssix);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(incorrectfactssix.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share6buttononClick(View view)
    {
        TextView incorrectfactssix = (TextView) findViewById(R.id.incorrectfactssix);

        String s = incorrectfactssix.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy7buttononClick(View view)
    {
        TextView incorrectfactsseven = (TextView) findViewById(R.id.incorrectfactsseven);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(incorrectfactsseven.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share7buttononClick(View view)
    {
        TextView incorrectfactsseven = (TextView) findViewById(R.id.incorrectfactsseven);

        String s = incorrectfactsseven.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy8buttononClick(View view)
    {
        TextView incorrectfactseight = (TextView) findViewById(R.id.incorrectfactseight);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(incorrectfactseight.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share8buttononClick(View view)
    {
        TextView incorrectfactseight = (TextView) findViewById(R.id.incorrectfactseight);

        String s = incorrectfactseight.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy9buttononClick(View view)
    {
        TextView incorrectfactsnine = (TextView) findViewById(R.id.incorrectfactsnine);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(incorrectfactsnine.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share9buttononClick(View view)
    {
        TextView incorrectfactsnine = (TextView) findViewById(R.id.incorrectfactsnine);

        String s = incorrectfactsnine.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy10buttononClick(View view)
    {
        TextView incorrectfactsten = (TextView) findViewById(R.id.incorrectfactsten);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(incorrectfactsten.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share10buttononClick(View view)
    {
        TextView incorrectfactsten = (TextView) findViewById(R.id.incorrectfactsten);

        String s = incorrectfactsten.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
}
