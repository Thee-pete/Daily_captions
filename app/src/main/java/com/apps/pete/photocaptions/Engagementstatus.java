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

public class Engagementstatus extends AppCompatActivity {
    private AdView engagementstatusbanner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_engagementstatus);
        MobileAds.initialize(this, "ca-app-pub-3609953011019731~1851437217");
        engagementstatusbanner = findViewById(R.id.engagementstatusbanner);
        AdRequest adRequest = new AdRequest.Builder().build();
        engagementstatusbanner.loadAd(adRequest);
    }
    public void copybuttononClick(View view)
    {
        TextView engagementone = (TextView) findViewById(R.id.engagementone);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(engagementone.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void sharebuttononClick(View view)
    {
        TextView engagementone = (TextView) findViewById(R.id.engagementone);

        String s = engagementone.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy1buttononClick(View view)
    {
        TextView engagementtwo = (TextView) findViewById(R.id.engagementtwo);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(engagementtwo.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share1buttononClick(View view)
    {
        TextView engagementtwo = (TextView) findViewById(R.id.engagementtwo);

        String s = engagementtwo.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy2buttononClick(View view)
    {
        TextView engagementthree = (TextView) findViewById(R.id.engagementthree);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(engagementthree.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share2buttononClick(View view)
    {
        TextView engagementthree = (TextView) findViewById(R.id.engagementthree);

        String s = engagementthree.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy4buttononClick(View view)
    {
        TextView engagementfour = (TextView) findViewById(R.id.engagementfour);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(engagementfour.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share4buttononClick(View view)
    {
        TextView engagementfour = (TextView) findViewById(R.id.engagementfour);

        String s = engagementfour.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy5buttononClick(View view)
    {
        TextView engagementfive = (TextView) findViewById(R.id.engagementfive);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(engagementfive.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share5buttononClick(View view)
    {
        TextView engagementfive = (TextView) findViewById(R.id.engagementfive);

        String s = engagementfive.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy6buttononClick(View view)
    {
        TextView engagementsix = (TextView) findViewById(R.id.engagementsix);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(engagementsix.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share6buttononClick(View view)
    {
        TextView engagementsix = (TextView) findViewById(R.id.engagementsix);

        String s = engagementsix.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy7buttononClick(View view)
    {
        TextView engagementseven = (TextView) findViewById(R.id.engagementseven);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(engagementseven.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share7buttononClick(View view)
    {
        TextView engagementseven = (TextView) findViewById(R.id.engagementseven);

        String s = engagementseven.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy8buttononClick(View view)
    {
        TextView engagementeight = (TextView) findViewById(R.id.engagementeight);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(engagementeight.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share8buttononClick(View view)
    {
        TextView engagementeight = (TextView) findViewById(R.id.engagementeight);

        String s = engagementeight.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy9buttononClick(View view)
    {
        TextView engagementnine = (TextView) findViewById(R.id.engagementnine);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(engagementnine.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share9buttononClick(View view)
    {
        TextView engagementnine = (TextView) findViewById(R.id.engagementnine);

        String s = engagementnine.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy10buttononClick(View view)
    {
        TextView engagementten = (TextView) findViewById(R.id.engagementten);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(engagementten.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share10buttononClick(View view)
    {
        TextView engagementten = (TextView) findViewById(R.id.engagementten);

        String s = engagementten.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
}
