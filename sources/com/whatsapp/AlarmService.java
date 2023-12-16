package com.whatsapp;

import X.AnonymousClass001;
import X.AnonymousClass0x2;
import X.AnonymousClass4T5;
import X.C105185Tx;
import X.C18260x0;
import X.C18280x3;
import X.C183538qC;
import android.content.Intent;
import android.text.TextUtils;
import com.whatsapp.nativelibloader.WhatsAppLibLoader;
import com.whatsapp.util.Log;
import java.util.Iterator;

public class AlarmService extends AnonymousClass4T5 {
    public WhatsAppLibLoader A00;
    public C183538qC A01;
    public volatile C105185Tx A02;

    public boolean A07() {
        C105185Tx r3 = this.A02;
        if (r3 == null) {
            return false;
        }
        boolean A03 = r3.A03();
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("AlarmService/onStopCurrentWork; retry=");
        A0o.append(A03);
        C18260x0.A1T(A0o, ", handler= ", r3);
        C18280x3.A14(A0o);
        return A03;
    }

    public void onCreate() {
        Log.d("AlarmService/onCreate");
        super.onCreate();
    }

    public void onDestroy() {
        Log.d("AlarmService/onDestroy");
        super.onDestroy();
    }

    public void A08(Intent intent) {
        String action = intent.getAction();
        C18260x0.A0s("AlarmService/onHandleWork received intent with action ", action, AnonymousClass001.A0o());
        if (action == null) {
            Log.w("AlarmService/onHandleWork received null action in intent");
        } else if (!this.A00.A03()) {
            Log.e("AlarmService/onHandleWork skip, native libraries missing");
        } else {
            try {
                if (!TextUtils.equals(action, "com.whatsapp.action.SETUP")) {
                    Iterator A0j = AnonymousClass0x2.A0j(this.A01);
                    while (true) {
                        if (!A0j.hasNext()) {
                            C18260x0.A1S(AnonymousClass001.A0o(), "AlarmService/onHandleWork: received unrecognized intent; intent=", intent);
                            break;
                        }
                        C105185Tx r2 = (C105185Tx) A0j.next();
                        if (r2.A04(intent)) {
                            StringBuilder A0o = AnonymousClass001.A0o();
                            A0o.append("AlarmService/onHandleWork: handling ");
                            A0o.append(action);
                            C18260x0.A1T(A0o, " using ", r2);
                            C18280x3.A14(A0o);
                            this.A02 = r2;
                            r2.A02(intent);
                            break;
                        }
                    }
                } else {
                    C18260x0.A1R(AnonymousClass001.A0o(), "AlarmService/setup; intent=", intent);
                    Iterator A0j2 = AnonymousClass0x2.A0j(this.A01);
                    while (A0j2.hasNext()) {
                        C105185Tx r22 = (C105185Tx) A0j2.next();
                        StringBuilder A0o2 = AnonymousClass001.A0o();
                        C18260x0.A1T(A0o2, "AlarmService/setup: ", r22);
                        C18280x3.A14(A0o2);
                        r22.A01();
                    }
                }
            } finally {
                this.A02 = null;
            }
        }
    }
}
