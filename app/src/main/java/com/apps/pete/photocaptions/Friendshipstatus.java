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

public class Friendshipstatus extends AppCompatActivity {
    private AdView friendshipstatusbanner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friendshipstatus);
        MobileAds.initialize(this, "ca-app-pub-3609953011019731~1851437217");
        friendshipstatusbanner = findViewById(R.id.friendshipstatusbanner);
        AdRequest adRequest = new AdRequest.Builder().build();
        friendshipstatusbanner.loadAd(adRequest);
    }
    public void copybuttononClick(View view)
    {
        TextView friendshipone = (TextView) findViewById(R.id.friendshipone);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(friendshipone.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void sharebuttononClick(View view)
    {
        TextView friendshipone = (TextView) findViewById(R.id.friendshipone);

        String s = friendshipone.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy1buttononClick(View view)
    {
        TextView friendshiptwo = (TextView) findViewById(R.id.friendshiptwo);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(friendshiptwo.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share1buttononClick(View view)
    {
        TextView friendshiptwo = (TextView) findViewById(R.id.friendshiptwo);

        String s = friendshiptwo.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy2buttononClick(View view)
    {
        TextView friendshipthree = (TextView) findViewById(R.id.friendshipthree);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(friendshipthree.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share2buttononClick(View view)
    {
        TextView friendshipthree = (TextView) findViewById(R.id.friendshipthree);

        String s = friendshipthree.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy4buttononClick(View view)
    {
        TextView friendshipfour = (TextView) findViewById(R.id.friendshipfour);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(friendshipfour.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share4buttononClick(View view)
    {
        TextView friendshipfour = (TextView) findViewById(R.id.friendshipfour);

        String s = friendshipfour.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy5buttononClick(View view)
    {
        TextView friendshipfive = (TextView) findViewById(R.id.friendshipfive);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(friendshipfive.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share5buttononClick(View view)
    {
        TextView friendshipfive = (TextView) findViewById(R.id.friendshipfive);

        String s = friendshipfive.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy6buttononClick(View view)
    {
        TextView friendshipsix = (TextView) findViewById(R.id.friendshipsix);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(friendshipsix.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share6buttononClick(View view)
    {
        TextView friendshipsix = (TextView) findViewById(R.id.friendshipsix);

        String s = friendshipsix.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy7buttononClick(View view)
    {
        TextView friendshipseven = (TextView) findViewById(R.id.friendshipseven);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(friendshipseven.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share7buttononClick(View view)
    {
        TextView friendshipseven = (TextView) findViewById(R.id.friendshipseven);

        String s = friendshipseven.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy8buttononClick(View view)
    {
        TextView friendshipeight = (TextView) findViewById(R.id.friendshipeight);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(friendshipeight.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share8buttononClick(View view)
    {
        TextView friendshipeight = (TextView) findViewById(R.id.friendshipeight);

        String s = friendshipeight.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy9buttononClick(View view)
    {
        TextView friendshipnine = (TextView) findViewById(R.id.friendshipnine);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(friendshipnine.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share9buttononClick(View view)
    {
        TextView friendshipnine = (TextView) findViewById(R.id.friendshipnine);

        String s = friendshipnine.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy10buttononClick(View view)
    {
        TextView friendshipten = (TextView) findViewById(R.id.friendshipten);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(friendshipten.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share10buttononClick(View view)
    {
        TextView friendshipten = (TextView) findViewById(R.id.friendshipten);

        String s = friendshipten.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
}
