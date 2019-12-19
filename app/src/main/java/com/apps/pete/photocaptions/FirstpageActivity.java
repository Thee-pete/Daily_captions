package com.apps.pete.photocaptions;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

import hotchemi.android.rate.AppRate;


public class FirstpageActivity extends AppCompatActivity {
    private InterstitialAd theInterstitialAd;
    private AdView firstadview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstpage);
        MobileAds.initialize(this, "ca-app-pub-3609953011019731~1851437217");

        theInterstitialAd = new InterstitialAd(this);
        theInterstitialAd.setAdUnitId("ca-app-pub-3609953011019731/4641252081");
        theInterstitialAd.loadAd(new AdRequest.Builder().build());
        theInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                theInterstitialAd.loadAd(new AdRequest.Builder().build());
            }

        });

        AppRate.with(this)
                .setInstallDays(0)
                .setLaunchTimes(2)
                .setRemindInterval(2)
                .monitor();

        AppRate.showRateDialogIfMeetsConditions(this);
    }
    public void funnystatusbtnonClick(View view)
    {
        Intent myintent = new Intent(FirstpageActivity.this, FunnystatusActivity.class);
        startActivity(myintent);
        theInterstitialAd.show();

    }
    public void famousquotesbuttononClick(View view)
    {
        Intent myintent = new Intent(FirstpageActivity.this, FamousquotesstatusActivity.class);
        startActivity(myintent);
        theInterstitialAd.show();
    }
    public void inspirationstatusbuttononClick(View view)
    {
        Intent myintent = new Intent(FirstpageActivity.this, InspirationstatusActivity.class);
        startActivity(myintent);
        theInterstitialAd.show();
    }
    public void spiritualstatusbuttononClick(View view)
    {
        Intent myintent = new Intent(FirstpageActivity.this, SpiritualstatusActivity.class);
        startActivity(myintent);
        theInterstitialAd.show();
    }
    public void punsstatusbtnonClick(View view)
    {
        Intent myintent = new Intent(FirstpageActivity.this, PunsstatusActivity.class);
        startActivity(myintent);
        theInterstitialAd.show();
    }
    public void lovestatusbtnonClick(View view)
    {
        Intent myintent = new Intent(FirstpageActivity.this, LovestatusActivity.class);
        startActivity(myintent);
        theInterstitialAd.show();
    }
    public void breakupstatusbtnonClick(View view)
    {
        Intent myintent = new Intent(FirstpageActivity.this, BreakupstatusActivity.class);
        startActivity(myintent);
        theInterstitialAd.show();
    }
    public void bibleversesstatusbtnonClick(View view)
    {
        Intent myintent = new Intent(FirstpageActivity.this, BibleversesstatusActivity.class);
        startActivity(myintent);
    }
    public void holidaymsgsbtnonClick(View view)
    {
        Intent myintent = new Intent(FirstpageActivity.this, HolidaymsgsstatusActivity.class);
        startActivity(myintent);
        theInterstitialAd.show();
    }
    public void famouslyricsstatusonClick(View view)
    {
        Intent myintent = new Intent(FirstpageActivity.this, FamouslyricsstatusActivity.class);
        startActivity(myintent);
        theInterstitialAd.show();
    }
   public void amazingstatusbtnonClick(View view)
    {
        Intent myintent = new Intent(FirstpageActivity.this, Amazingstatus.class);
        startActivity(myintent);
        theInterstitialAd.show();
    }
    public void angrystatusonClick(View view)
    {
        Intent myintent = new Intent(FirstpageActivity.this, Angrystatus.class);
        startActivity(myintent);
        theInterstitialAd.show();
    }
    public void attitudestatusonClick(View view)
    {
        Intent myintent = new Intent(FirstpageActivity.this, Attitudestatus.class);
        startActivity(myintent);
        theInterstitialAd.show();
    }
    public void birthdaystatusonClick(View view)
    {
        Intent myintent = new Intent(FirstpageActivity.this, Birthdaystatus.class);
        startActivity(myintent);
        theInterstitialAd.show();
    }
    public void cleverstatusonClick(View view)
    {
        Intent myintent = new Intent(FirstpageActivity.this, Cleverstatus.class);
        startActivity(myintent);
        theInterstitialAd.show();
    }
    public void crushstatusonClick(View view)
    {
        Intent myintent = new Intent(FirstpageActivity.this, Crushstatus.class);
        startActivity(myintent);
        theInterstitialAd.show();
    }
    public void creativestatusonClick(View view)
    {
        Intent myintent = new Intent(FirstpageActivity.this, Creativestatus.class);
        startActivity(myintent);
        theInterstitialAd.show();
    }
    public void creepystatusonClick(View view)
    {
        Intent myintent = new Intent(FirstpageActivity.this, Creepystatus.class);
        startActivity(myintent);
        theInterstitialAd.show();
    }
    public void childishstatusonClick(View view)
    {
        Intent myintent = new Intent(FirstpageActivity.this, Childishstatus.class);
        startActivity(myintent);
        theInterstitialAd.show();
    }
    public void commonstatusonClick(View view)
    {
        Intent myintent = new Intent(FirstpageActivity.this, Commonstatus.class);
        startActivity(myintent);
        theInterstitialAd.show();
    }
    public void coldstatusonClick(View view)
    {
        Intent myintent = new Intent(FirstpageActivity.this, Coldstatus.class);
        startActivity(myintent);
        theInterstitialAd.show();
    }
    public void coolfactsstatusonClick(View view)
    {
        Intent myintent = new Intent(FirstpageActivity.this, Coolfactsstatus.class);
        startActivity(myintent);
        theInterstitialAd.show();
    }
    public void christmasstatusonClick(View view)
    {
        Intent myintent = new Intent(FirstpageActivity.this, Christmasstatus.class);
        startActivity(myintent);
        theInterstitialAd.show();
    }
    public void dirtystatusonClick(View view)
    {
        Intent myintent = new Intent(FirstpageActivity.this, Dirtystatus.class);
        startActivity(myintent);
        theInterstitialAd.show();
    }
    public void dumbstatusonClick(View view)
    {
        Intent myintent = new Intent(FirstpageActivity.this, Dumbstatus.class);
        startActivity(myintent);
        theInterstitialAd.show();
    }
    public void engagementstatusonClick(View view)
    {
        Intent myintent = new Intent(FirstpageActivity.this, Engagementstatus.class);
        startActivity(myintent);
        theInterstitialAd.show();
    }
    public void entertainingstatusonClick(View view)
    {
        Intent myintent = new Intent(FirstpageActivity.this, Entertainingstatus.class);
        startActivity(myintent);
        theInterstitialAd.show();
    }
    public void eroticstatusonClick(View view)
    {
        Intent myintent = new Intent(FirstpageActivity.this, Eroticstatus.class);
        startActivity(myintent);
        theInterstitialAd.show();
    }
    public void excitedstatusonClick(View view)
    {
        Intent myintent = new Intent(FirstpageActivity.this, Excitedstatus.class);
        startActivity(myintent);
        theInterstitialAd.show();
    }
    public void emotionalstatusonClick(View view)
    {
        Intent myintent = new Intent(FirstpageActivity.this, Emotionalstatus.class);
        startActivity(myintent);
        theInterstitialAd.show();
    }
    public void examstatusonClick(View view)
    {
        Intent myintent = new Intent(FirstpageActivity.this, Examstatus.class);
        startActivity(myintent);
        theInterstitialAd.show();
    }
    public void flirtstatusonClick(View view)
    {
        Intent myintent = new Intent(FirstpageActivity.this, Flirtstatus.class);
        startActivity(myintent);
        theInterstitialAd.show();
    }
    public void friendshipstatusonClick(View view)
    {
        Intent myintent = new Intent(FirstpageActivity.this, Friendshipstatus.class);
        startActivity(myintent);
        theInterstitialAd.show();
    }
    public void factsstatusonClick(View view)
    {
        Intent myintent = new Intent(FirstpageActivity.this, Factsstatus.class);
        startActivity(myintent);
        theInterstitialAd.show();
    }
    public void girlystatusonClick(View view)
    {
        Intent myintent = new Intent(FirstpageActivity.this, Girlystatus.class);
        startActivity(myintent);
        theInterstitialAd.show();
    }
    public void goodluckstatusonClick(View view)
    {
        Intent myintent = new Intent(FirstpageActivity.this, Goodluckstatus.class);
        startActivity(myintent);
        theInterstitialAd.show();
    }
    public void goodmorningstatusonClick(View view)
    {
        Intent myintent = new Intent(FirstpageActivity.this, Goodmorningstatus.class);
        startActivity(myintent);
        theInterstitialAd.show();
    }
    public void goodnightstatusonClick(View view)
    {
        Intent myintent = new Intent(FirstpageActivity.this, Goodnightstatus.class);
        startActivity(myintent);
        theInterstitialAd.show();
    }
    public void hornystatusonClick(View view)
    {
        Intent myintent = new Intent(FirstpageActivity.this, Hornystatus.class);
        startActivity(myintent);
        theInterstitialAd.show();
    }
    public void hormonalstatusonClick(View view)
    {
        Intent myintent = new Intent(FirstpageActivity.this, Hormonalstatus.class);
        startActivity(myintent);
        theInterstitialAd.show();
    }
    public void homealonestatusonClick(View view)
    {
        Intent myintent = new Intent(FirstpageActivity.this, Homealonestatus.class);
        startActivity(myintent);
        theInterstitialAd.show();
    }
    public void incorrectfactsstatusonClick(View view)
    {
        Intent myintent = new Intent(FirstpageActivity.this, Incorrectfactsstatus.class);
        startActivity(myintent);
        theInterstitialAd.show();
    }
    public void insultstatusonClick(View view)
    {
        Intent myintent = new Intent(FirstpageActivity.this, Insultstatus.class);
        startActivity(myintent);
        theInterstitialAd.show();
    }
    public void imaginestatusonClick(View view)
    {
        Intent myintent = new Intent(FirstpageActivity.this, Imaginestatus.class);
        startActivity(myintent);
        theInterstitialAd.show();
    }
    public void kissingstatusonClick(View view)
    {
        Intent myintent = new Intent(FirstpageActivity.this, Kissingstatus.class);
        startActivity(myintent);
        theInterstitialAd.show();
    }
    public void knowledgestatusonClick(View view)
    {
        Intent myintent = new Intent(FirstpageActivity.this, Knowledgestatus.class);
        startActivity(myintent);
        theInterstitialAd.show();
    }
    public void romanticstatusonClick(View view)
    {
        Intent myintent = new Intent(FirstpageActivity.this, Romanticstatus.class);
        startActivity(myintent);
        theInterstitialAd.show();
    }
    public void rudestatusonClick(View view)
    {
        Intent myintent = new Intent(FirstpageActivity.this, Rudestatus.class);
        startActivity(myintent);
        theInterstitialAd.show();
    }
    public void staywokestatusonClick(View view)
    {
        Intent myintent = new Intent(FirstpageActivity.this, Staywokestatus.class);
        startActivity(myintent);
        theInterstitialAd.show();
    }
    public void seductivestatusonClick(View view)
    {
        Intent myintent = new Intent(FirstpageActivity.this, Seductivestatus.class);
        startActivity(myintent);
        theInterstitialAd.show();
    }
    public void sadstatusonClick(View view)
    {
        Intent myintent = new Intent(FirstpageActivity.this, Sadstatus.class);
        startActivity(myintent);
        theInterstitialAd.show();
    }
}
