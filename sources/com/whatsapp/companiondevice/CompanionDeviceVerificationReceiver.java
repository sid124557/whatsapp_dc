package com.whatsapp.companiondevice;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0x2;
import X.AnonymousClass23P;
import X.AnonymousClass2A1;
import X.AnonymousClass2SR;
import X.AnonymousClass33G;
import X.AnonymousClass33T;
import X.AnonymousClass33p;
import X.C05610Ue;
import X.C107145am;
import X.C18260x0;
import X.C18270x1;
import X.C18280x3;
import X.C18310x6;
import X.C29041iB;
import X.C29371ii;
import X.C57112t6;
import X.C57372tX;
import X.C61102zi;
import X.C624735e;
import X.C626936e;
import X.C66553Lw;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.R;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.List;

public class CompanionDeviceVerificationReceiver extends BroadcastReceiver {
    public C29371ii A00;
    public AnonymousClass33p A01;
    public C29041iB A02;
    public final Object A03;
    public volatile boolean A04;

    public void onReceive(Context context, Intent intent) {
        List A0t;
        String str;
        if (!this.A04) {
            synchronized (this.A03) {
                if (!this.A04) {
                    AnonymousClass2A1.A00(context).ARG(this);
                    this.A04 = true;
                }
            }
        }
        Log.d("CompanionDeviceVerificationReceiver/onReceive");
        String A0Z = C18280x3.A0Z(AnonymousClass0x2.A0F(this.A01), "companion_device_verification_ids");
        if (A0Z != null && (A0t = C18310x6.A0t(A0Z)) != null) {
            Iterator it = A0t.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String A0m = AnonymousClass001.A0m(it);
                C29041iB r1 = this.A02;
                DeviceJid nullable = DeviceJid.getNullable(A0m);
                C626936e.A06(nullable);
                AnonymousClass33G A0A = r1.A0A(nullable);
                if (A0A != null) {
                    Iterator A032 = C61102zi.A03(this.A00);
                    while (A032.hasNext()) {
                        AnonymousClass2SR r6 = (AnonymousClass2SR) A032.next();
                        Context context2 = r6.A01.A00;
                        Log.d("CompanionDeviceVerificationReceiver/fireVerificationNotification");
                        String string = context2.getString(R.string.f11nameremoved);
                        String A002 = C107145am.A00(r6.A03, A0A.A05);
                        Object[] A0M = AnonymousClass002.A0M();
                        if (A0A.A08 == AnonymousClass23P.VR) {
                            str = context2.getString(R.string.f11nameremoved);
                        } else {
                            str = A0A.A09;
                        }
                        A0M[0] = str;
                        String A0F = AnonymousClass002.A0F(context2, A002, A0M, 1, R.string.f11nameremoved);
                        C05610Ue A003 = C66553Lw.A00(context2);
                        A003.A0C(string);
                        A003.A0B(string);
                        A003.A0A(A0F);
                        C57372tX.A00(A0A.A07);
                        A003.A09 = C624735e.A00(context2, 0, C57112t6.A01(context2, 4), 0);
                        C18270x1.A0r(A003, A0F);
                        A003.A0E(true);
                        AnonymousClass33T.A02(A003, R.drawable.notify_web_client_connected);
                        AnonymousClass33T.A03(A003, r6.A02, 21);
                    }
                }
            }
        } else {
            Log.e("CompanionDeviceVerificationReceiver/onReceive/ deviceIds are missing from prefs");
        }
        C18260x0.A0K(this.A01, "companion_device_verification_ids");
        PendingIntent A012 = C624735e.A01(context, 0, intent, 536870912);
        if (A012 != null) {
            A012.cancel();
        }
    }

    public CompanionDeviceVerificationReceiver(int i) {
        this.A04 = false;
        this.A03 = AnonymousClass002.A0D();
    }

    public CompanionDeviceVerificationReceiver() {
        this(0);
    }
}
