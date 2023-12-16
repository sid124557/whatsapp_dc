package com.whatsapp.migration.android.api;

import X.AnonymousClass000;
import X.AnonymousClass002;
import X.AnonymousClass1VX;
import X.AnonymousClass2A1;
import X.AnonymousClass4FV;
import X.C18280x3;
import X.C24501Xq;
import X.C56082rO;
import X.C56972sr;
import X.C58422vE;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;

public class DeferredRestoreBroadcastReceiver extends BroadcastReceiver {
    public C56972sr A00;
    public C56082rO A01;
    public AnonymousClass1VX A02;
    public AnonymousClass4FV A03;
    public final Object A04;
    public volatile boolean A05;

    public void onReceive(Context context, Intent intent) {
        String str;
        if (!this.A05) {
            synchronized (this.A04) {
                if (!this.A05) {
                    AnonymousClass2A1.A00(context).ARO(this);
                    this.A05 = true;
                }
            }
        }
        Log.i("DeferredRestoreBroadcastReceiver/on-receive");
        if (intent != null && C18280x3.A1V(intent, "com.google.android.apps.pixelmigrate.IOS_APP_DATA_AVAILABLE")) {
            if (!this.A02.A0Y(C58422vE.A02, 835)) {
                str = "DeferredRestoreBroadcastReceiver/sendWamEventIfApplicable/did not send data because ab prop is not enabled";
            } else {
                C24501Xq r4 = new C24501Xq();
                boolean z = false;
                r4.A01 = Boolean.valueOf(AnonymousClass000.A1W(C56972sr.A00(this.A00)));
                try {
                    String A012 = this.A01.A01("cross_platform_migration_completed");
                    if (!(A012 == null || Integer.parseInt(A012) == 0)) {
                        z = true;
                    }
                    r4.A00 = Boolean.valueOf(z);
                } catch (RuntimeException e) {
                    Log.e("DeferredRestoreBroadcastReceiver/sendWamEventIfApplicable/", e);
                    r4.A00 = Boolean.FALSE;
                }
                C18280x3.A0t(r4, this.A03, true);
                str = "DeferredRestoreBroadcastReceiver/sendWamEventIfApplicable/sent wam event";
            }
            Log.i(str);
        }
    }

    public DeferredRestoreBroadcastReceiver(int i) {
        this.A05 = false;
        this.A04 = AnonymousClass002.A0D();
    }

    public DeferredRestoreBroadcastReceiver() {
        this(0);
    }
}
