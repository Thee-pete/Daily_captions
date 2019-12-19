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

public class Homealonestatus extends AppCompatActivity {
    private AdView homealonestatusbanner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homealonestatus);
        MobileAds.initialize(this, "ca-app-pub-3609953011019731~1851437217");
        homealonestatusbanner = findViewById(R.id.homealonestatusbanner);
        AdRequest adRequest = new AdRequest.Builder().build();
        homealonestatusbanner.loadAd(adRequest);
    }
    public void copybuttononClick(View view)
    {
        TextView homealoneone = (TextView) findViewById(R.id.homealoneone);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(homealoneone.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void sharebuttononClick(View view)
    {
        TextView homealoneone = (TextView) findViewById(R.id.homealoneone);

        String s = homealoneone.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy1buttononClick(View view)
    {
        TextView homealonetwo = (TextView) findViewById(R.id.homealonetwo);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(homealonetwo.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share1buttononClick(View view)
    {
        TextView homealonetwo = (TextView) findViewById(R.id.homealonetwo);

        String s = homealonetwo.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy2buttononClick(View view)
    {
        TextView homealonethree = (TextView) findViewById(R.id.homealonethree);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(homealonethree.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share2buttononClick(View view)
    {
        TextView homealonethree = (TextView) findViewById(R.id.homealonethree);

        String s = homealonethree.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy4buttononClick(View view)
    {
        TextView homealonefour = (TextView) findViewById(R.id.homealonefour);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(homealonefour.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share4buttononClick(View view)
    {
        TextView homealonefour = (TextView) findViewById(R.id.homealonefour);

        String s = homealonefour.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy5buttononClick(View view)
    {
        TextView homealonefive = (TextView) findViewById(R.id.homealonefive);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(homealonefive.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share5buttononClick(View view)
    {
        TextView homealonefive = (TextView) findViewById(R.id.homealonefive);

        String s = homealonefive.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy6buttononClick(View view)
    {
        TextView homealonesix = (TextView) findViewById(R.id.homealonesix);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(homealonesix.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share6buttononClick(View view)
    {
        TextView homealonesix = (TextView) findViewById(R.id.homealonesix);

        String s = homealonesix.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy7buttononClick(View view)
    {
        TextView homealoneseven = (TextView) findViewById(R.id.homealoneseven);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(homealoneseven.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share7buttononClick(View view)
    {
        TextView homealoneseven = (TextView) findViewById(R.id.homealoneseven);

        String s = homealoneseven.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy8buttononClick(View view)
    {
        TextView homealoneeight = (TextView) findViewById(R.id.homealoneeight);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(homealoneeight.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share8buttononClick(View view)
    {
        TextView homealoneeight = (TextView) findViewById(R.id.homealoneeight);

        String s = homealoneeight.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy9buttononClick(View view)
    {
        TextView homealonenine = (TextView) findViewById(R.id.homealonenine);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(homealonenine.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share9buttononClick(View view)
    {
        TextView homealonenine = (TextView) findViewById(R.id.homealonenine);

        String s = homealonenine.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy10buttononClick(View view)
    {
        TextView homealoneten = (TextView) findViewById(R.id.homealoneten);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(homealoneten.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share10buttononClick(View view)
    {
        TextView homealoneten = (TextView) findViewById(R.id.homealoneten);

        String s = homealoneten.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
}
