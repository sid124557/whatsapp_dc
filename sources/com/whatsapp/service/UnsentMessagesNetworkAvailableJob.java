package com.whatsapp.service;

import X.AnonymousClass002;
import X.AnonymousClass3YV;
import X.AnonymousClass4FS;
import X.AnonymousClass4FW;
import X.AnonymousClass4GJ;
import X.C124166Bf;
import X.C22031Ec;
import X.C29431io;
import X.C55562qY;
import X.C64323Da;
import X.C64333Db;
import X.C66523Lt;
import X.C71283br;
import X.C72303dV;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Handler;
import com.whatsapp.util.Log;

public class UnsentMessagesNetworkAvailableJob extends JobService implements AnonymousClass4GJ {
    public JobParameters A00;
    public C29431io A01;
    public C72303dV A02;
    public C55562qY A03;
    public C66523Lt A04;
    public AnonymousClass4FS A05;
    public boolean A06;
    public final Handler A07;
    public final AnonymousClass4FW A08;
    public final Object A09;
    public final Runnable A0A;
    public volatile AnonymousClass3YV A0B;

    public final void A00() {
        if (this.A00 != null) {
            Log.d("UnsentMessagesNetworkAvailableJob/finishing job");
            jobFinished(this.A00, false);
            this.A00 = null;
        }
    }

    public final Object generatedComponent() {
        if (this.A0B == null) {
            synchronized (this.A09) {
                if (this.A0B == null) {
                    this.A0B = new AnonymousClass3YV(this);
                }
            }
        }
        return this.A0B.generatedComponent();
    }

    public void onCreate() {
        Log.i("UnsentMessagesNetworkAvailableJob/onCreate");
        if (!this.A06) {
            this.A06 = true;
            C64333Db r1 = ((C22031Ec) ((C64323Da) generatedComponent())).A06;
            this.A05 = C64333Db.A8y(r1);
            this.A04 = (C66523Lt) r1.ASB.get();
            this.A01 = C64333Db.A3K(r1);
            this.A03 = (C55562qY) r1.AZC.get();
            this.A02 = (C72303dV) r1.AMC.get();
        }
        super.onCreate();
    }

    public void onDestroy() {
        Log.i("UnsentMessagesNetworkAvailableJob/onDestroy");
        super.onDestroy();
    }

    public boolean onStartJob(JobParameters jobParameters) {
        Log.d("UnsentMessagesNetworkAvailableJob/onStartJob called");
        if (jobParameters.getJobId() != 6 || this.A00 != null) {
            return false;
        }
        this.A00 = jobParameters;
        this.A05.BkM(new C71283br((Object) this, 37));
        return true;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        Log.d("UnsentMessagesNetworkAvailableJob/onStopJob called");
        if (this.A00 == null) {
            return true;
        }
        this.A01.A07(this.A08);
        this.A07.removeCallbacks(this.A0A);
        this.A00 = null;
        return true;
    }

    public UnsentMessagesNetworkAvailableJob(int i) {
        this.A09 = AnonymousClass002.A0D();
        this.A06 = false;
    }

    public UnsentMessagesNetworkAvailableJob() {
        this(0);
        this.A07 = new Handler();
        this.A08 = new C124166Bf(this, 20);
        this.A0A = new C71283br((Object) this, 39);
    }
}
