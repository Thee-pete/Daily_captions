package com.apps.pete.photocaptions;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class BibleversesstatusActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bibleversesstatus);


    }
    public void copybuttononClick(View view)
    {
        TextView biblverseone = (TextView) findViewById(R.id.bibleverseone);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(biblverseone.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void sharebuttononClick(View view)
    {
        TextView bibleverseone = (TextView) findViewById(R.id.bibleverseone);

        String s = bibleverseone.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy1buttononClick(View view)
    {
        TextView bibleversetwo = (TextView) findViewById(R.id.bibleversetwo);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(bibleversetwo.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share1buttononClick(View view)
    {
        TextView bibleversetwo = (TextView) findViewById(R.id.bibleversetwo);

        String s = bibleversetwo.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy2buttononClick(View view)
    {
        TextView bibleversethree = (TextView) findViewById(R.id.bibleversethree);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(bibleversethree.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share2buttononClick(View view)
    {
        TextView bibleversethree = (TextView) findViewById(R.id.bibleversethree);

        String s = bibleversethree.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy4buttononClick(View view)
    {
        TextView bibleversefour = (TextView) findViewById(R.id.bibleversefour);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(bibleversefour.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share4buttononClick(View view)
    {
        TextView bibleversefour = (TextView) findViewById(R.id.bibleversefour);

        String s = bibleversefour.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy5buttononClick(View view)
    {
        TextView bibleversefive = (TextView) findViewById(R.id.bibleversefive);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(bibleversefive.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share5buttononClick(View view)
    {
        TextView bibleversefive = (TextView) findViewById(R.id.bibleversefive);

        String s = bibleversefive.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy6buttononClick(View view)
    {
        TextView bibleversesix = (TextView) findViewById(R.id.bibleversesix);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(bibleversesix.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share6buttononClick(View view)
    {
        TextView bibleversesix = (TextView) findViewById(R.id.bibleversesix);

        String s = bibleversesix.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy7buttononClick(View view)
    {
        TextView bibleverseseven = (TextView) findViewById(R.id.bibleverseseven);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(bibleverseseven.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share7buttononClick(View view)
    {
        TextView bibleverseseven = (TextView) findViewById(R.id.bibleverseseven);

        String s = bibleverseseven.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy8buttononClick(View view)
    {
        TextView bibleverseeight = (TextView) findViewById(R.id.bibleverseeight);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(bibleverseeight.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share8buttononClick(View view)
    {
        TextView bibleverseeight = (TextView) findViewById(R.id.bibleverseeight);

        String s = bibleverseeight.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy9buttononClick(View view)
    {
        TextView bibleversenine = (TextView) findViewById(R.id.bibleversenine);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(bibleversenine.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share9buttononClick(View view)
    {
        TextView bibleversenine = (TextView) findViewById(R.id.bibleversenine);

        String s = bibleversenine.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
    public void copy10buttononClick(View view)
    {
        TextView bibleverseten = (TextView) findViewById(R.id.bibleverseten);

        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(bibleverseten.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Copied to clipboard", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void share10buttononClick(View view)
    {
        TextView bibleverseten = (TextView) findViewById(R.id.bibleverseten);

        String s = bibleverseten.getText().toString();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
        startActivity(Intent.createChooser(sharingIntent, "Share status via"));
    }
}
