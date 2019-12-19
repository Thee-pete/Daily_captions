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

public class Creativestatus extends AppCompatActivity {
    private AdView creativestatusbanner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creativestatus);
        MobileAds.initialize(this, "ca-app-pub-3609953011019731~1851437217");
        creativestatusbanner = findViewById(R.id.creativestatusbanner);
        AdRequest adRequest = new AdRequest.Builder().build();
        creativestatusbanner.loadAd(adRequest);
    }
    public void copybuttononClick(View view)
    {
        TextView creativeone = (TextView) findViewById(R.id.creativeone);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(creativeone.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void sharebuttononClick(View view)
    {
        TextView creativeone = (TextView) findViewById(R.id.creativeone);

        String s = creativeone.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy1buttononClick(View view)
    {
        TextView creativetwo = (TextView) findViewById(R.id.creativetwo);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(creativetwo.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share1buttononClick(View view)
    {
        TextView creativetwo = (TextView) findViewById(R.id.creativetwo);

        String s = creativetwo.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy2buttononClick(View view)
    {
        TextView creativethree = (TextView) findViewById(R.id.creativethree);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(creativethree.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share2buttononClick(View view)
    {
        TextView creativethree = (TextView) findViewById(R.id.creativethree);

        String s = creativethree.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy4buttononClick(View view)
    {
        TextView creativefour = (TextView) findViewById(R.id.creativefour);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(creativefour.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share4buttononClick(View view)
    {
        TextView creativefour = (TextView) findViewById(R.id.creativefour);

        String s = creativefour.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy5buttononClick(View view)
    {
        TextView creativefive = (TextView) findViewById(R.id.creativefive);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(creativefive.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share5buttononClick(View view)
    {
        TextView creativefive = (TextView) findViewById(R.id.creativefive);

        String s = creativefive.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy6buttononClick(View view)
    {
        TextView creativesix = (TextView) findViewById(R.id.creativesix);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(creativesix.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share6buttononClick(View view)
    {
        TextView creativesix = (TextView) findViewById(R.id.creativesix);

        String s = creativesix.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy7buttononClick(View view)
    {
        TextView creativeseven = (TextView) findViewById(R.id.creativeseven);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(creativeseven.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share7buttononClick(View view)
    {
        TextView creativeseven = (TextView) findViewById(R.id.creativeseven);

        String s = creativeseven.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy8buttononClick(View view)
    {
        TextView creativeeight = (TextView) findViewById(R.id.creativeeight);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(creativeeight.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share8buttononClick(View view)
    {
        TextView creativeeight = (TextView) findViewById(R.id.creativeeight);

        String s = creativeeight.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy9buttononClick(View view)
    {
        TextView creativenine = (TextView) findViewById(R.id.creativenine);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(creativenine.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share9buttononClick(View view)
    {
        TextView creativenine = (TextView) findViewById(R.id.creativenine);

        String s = creativenine.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy10buttononClick(View view)
    {
        TextView creativeten = (TextView) findViewById(R.id.creativeten);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(creativeten.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share10buttononClick(View view)
    {
        TextView creativeten = (TextView) findViewById(R.id.creativeten);

        String s = creativeten.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
}
