package com.whatsapp.otp;

import X.AnonymousClass002;
import X.AnonymousClass1VX;
import X.AnonymousClass2A1;
import X.AnonymousClass2RY;
import X.AnonymousClass33Z;
import X.AnonymousClass4FS;
import X.C18260x0;
import X.C18270x1;
import X.C58422vE;
import X.C70493aa;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import org.json.JSONArray;

public final class OtpIdentityHashRequestedReceiver extends BroadcastReceiver {
    public AnonymousClass33Z A00;
    public AnonymousClass1VX A01;
    public AnonymousClass2RY A02;
    public AnonymousClass4FS A03;
    public final Object A04;
    public volatile boolean A05;

    public void onReceive(Context context, Intent intent) {
        String creatorPackage;
        String stringExtra;
        Context context2 = context;
        if (!this.A05) {
            synchronized (this.A04) {
                if (!this.A05) {
                    AnonymousClass2A1.A00(context).ART(this);
                    this.A05 = true;
                }
            }
        }
        C18260x0.A0O(context, intent);
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("_ci_");
        if (pendingIntent != null && (creatorPackage = pendingIntent.getCreatorPackage()) != null && (stringExtra = intent.getStringExtra("request_id")) != null) {
            AnonymousClass1VX r2 = this.A01;
            if (r2 != null) {
                JSONArray jSONArray = r2.A0T(C58422vE.A02, 5790).getJSONArray("packages");
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    if (creatorPackage.equals(jSONArray.getString(i))) {
                        AnonymousClass4FS r0 = this.A03;
                        if (r0 != null) {
                            r0.BkM(new C70493aa(this, context2, creatorPackage, stringExtra, 5));
                            return;
                        }
                        throw C18270x1.A0S("waWorker");
                    }
                }
                return;
            }
            throw C18270x1.A0S("abprops");
        }
    }

    public OtpIdentityHashRequestedReceiver(int i) {
        this.A05 = false;
        this.A04 = AnonymousClass002.A0D();
    }

    public OtpIdentityHashRequestedReceiver() {
        this(0);
    }
}
