package com.whatsapp.migration.android.integration.service;

import X.AnonymousClass4FM;
import X.AnonymousClass4FS;
import X.C107695bk;
import X.C117705sM;
import X.C18280x3;
import X.C18400xH;
import X.C28841hr;
import X.C32451qQ;
import X.C52572lh;
import X.C54292oU;
import X.C55682qk;
import X.C56502s5;
import X.C620633i;
import X.C625635p;
import X.C64333Db;
import X.C67843Qw;
import X.C70023Zo;
import X.C70113Zy;
import android.content.Intent;
import android.os.IBinder;
import com.whatsapp.R;
import com.whatsapp.util.Log;

public class GoogleMigrateService extends C32451qQ {
    public C55682qk A00;
    public C620633i A01;
    public C625635p A02;
    public C28841hr A03;
    public C52572lh A04;
    public C56502s5 A05;
    public AnonymousClass4FS A06;
    public boolean A07 = false;
    public final AnonymousClass4FM A08 = new C67843Qw(this);

    public GoogleMigrateService() {
        super("GoogleMigrateService", true);
    }

    public void A00() {
        if (!this.A07) {
            this.A07 = true;
            C64333Db A002 = C18400xH.A00(this);
            this.A06 = C64333Db.A8y(A002);
            this.A00 = C64333Db.A01(A002);
            C107695bk r1 = A002.A00;
            this.A05 = (C56502s5) r1.A5N.get();
            this.A01 = C64333Db.A2o(A002);
            this.A03 = (C28841hr) r1.A5h.get();
            this.A02 = (C625635p) r1.A5f.get();
            this.A04 = (C52572lh) r1.A5g.get();
        }
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onDestroy() {
        Log.i("GoogleMigrateService/onDestroy()");
        super.onDestroy();
        stopForeground(true);
        this.A03.A07(this.A08);
    }

    public void onCreate() {
        A00();
        super.onCreate();
        this.A03.A06(this.A08);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        Object r2;
        int i3;
        String str;
        super.onStartCommand(intent, i, i2);
        if (intent == null) {
            str = "GoogleMigrateService/onStartCommand()/intent is null";
        } else if (!"com.whatsapp.migration.android.integration.service.GoogleMigrateService.ACTION_START_IMPORT".equals(intent.getAction()) || !this.A02.A0H()) {
            if (C18280x3.A1V(intent, "com.whatsapp.migration.android.integration.service.GoogleMigrateService.ACTION_CANCEL_IMPORT")) {
                Log.i("GoogleMigrateService/onStartCommand()/action_cancel_import");
                C52572lh r1 = this.A04;
                C18400xH.A01(C54292oU.A00(r1.A00), r1.A00(false), this, R.string.f11nameremoved, i2);
                i3 = 2;
            } else if (C18280x3.A1V(intent, "com.whatsapp.migration.android.integration.service.GoogleMigrateService.ACTION_START_IMPORT")) {
                Log.i("GoogleMigrateService/onStartCommand()/action_start_import");
                C52572lh r12 = this.A04;
                C18400xH.A01(C54292oU.A00(r12.A00), r12.A00(false), this, R.string.f11nameremoved, i2);
                i3 = 3;
            } else {
                if (C18280x3.A1V(intent, "com.whatsapp.migration.android.integration.service.GoogleMigrateService.ACTION_PREPARE_BEFORE_RETRY")) {
                    Log.i("GoogleMigrateService/onStartCommand()/prepare_before_retry");
                    int intExtra = intent.getIntExtra("migration_error_code", 1);
                    C52572lh r13 = this.A04;
                    C18400xH.A01(C54292oU.A00(r13.A00), r13.A00(false), this, R.string.f11nameremoved, i2);
                    r2 = new C117705sM((Object) this, intExtra, 45);
                    C70113Zy.A01(this.A06, this, r2, 21);
                    return 1;
                }
                return 1;
            }
            r2 = new C70023Zo(this, i3);
            C70113Zy.A01(this.A06, this, r2, 21);
            return 1;
        } else {
            str = "GoogleMigrateService/onStartCommand()/import in progress";
        }
        Log.i(str);
        return 1;
    }
}
