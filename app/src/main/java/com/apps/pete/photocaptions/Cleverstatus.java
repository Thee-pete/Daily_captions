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

public class Cleverstatus extends AppCompatActivity {
    private AdView cleverstatusbanner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cleverstatus);
        MobileAds.initialize(this, "ca-app-pub-3609953011019731~1851437217");
        cleverstatusbanner = findViewById(R.id.cleverstatusbanner);
        AdRequest adRequest = new AdRequest.Builder().build();
        cleverstatusbanner.loadAd(adRequest);
    }
    public void copybuttononClick(View view)
    {
        TextView cleverone = (TextView) findViewById(R.id.cleverone);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(cleverone.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void sharebuttononClick(View view)
    {
        TextView cleverone = (TextView) findViewById(R.id.cleverone);

        String s = cleverone.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy1buttononClick(View view)
    {
        TextView clevertwo = (TextView) findViewById(R.id.clevertwo);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(clevertwo.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share1buttononClick(View view)
    {
        TextView clevertwo = (TextView) findViewById(R.id.clevertwo);

        String s = clevertwo.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy2buttononClick(View view)
    {
        TextView cleverthree = (TextView) findViewById(R.id.cleverthree);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(cleverthree.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share2buttononClick(View view)
    {
        TextView cleverthree = (TextView) findViewById(R.id.cleverthree);

        String s = cleverthree.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy4buttononClick(View view)
    {
        TextView cleverfour = (TextView) findViewById(R.id.cleverfour);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(cleverfour.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share4buttononClick(View view)
    {
        TextView cleverfour = (TextView) findViewById(R.id.cleverfour);

        String s = cleverfour.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy5buttononClick(View view)
    {
        TextView cleverfive = (TextView) findViewById(R.id.cleverfive);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(cleverfive.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share5buttononClick(View view)
    {
        TextView cleverfive = (TextView) findViewById(R.id.cleverfive);

        String s = cleverfive.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy6buttononClick(View view)
    {
        TextView cleversix = (TextView) findViewById(R.id.cleversix);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(cleversix.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share6buttononClick(View view)
    {
        TextView cleversix = (TextView) findViewById(R.id.cleversix);

        String s = cleversix.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy7buttononClick(View view)
    {
        TextView cleverseven = (TextView) findViewById(R.id.cleverseven);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(cleverseven.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share7buttononClick(View view)
    {
        TextView cleverseven = (TextView) findViewById(R.id.cleverseven);

        String s = cleverseven.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy8buttononClick(View view)
    {
        TextView clevereight = (TextView) findViewById(R.id.clevereight);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(clevereight.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share8buttononClick(View view)
    {
        TextView clevereight = (TextView) findViewById(R.id.clevereight);

        String s = clevereight.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy9buttononClick(View view)
    {
        TextView clevernine = (TextView) findViewById(R.id.clevernine);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(clevernine.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share9buttononClick(View view)
    {
        TextView clevernine = (TextView) findViewById(R.id.clevernine);

        String s = clevernine.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy10buttononClick(View view)
    {
        TextView cleverten = (TextView) findViewById(R.id.cleverten);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(cleverten.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share10buttononClick(View view)
    {
        TextView cleverten = (TextView) findViewById(R.id.cleverten);

        String s = cleverten.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
}
