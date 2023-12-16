package com.whatsapp.registration;

import X.AnonymousClass002;
import X.AnonymousClass2A1;
import X.AnonymousClass32Y;
import X.AnonymousClass33p;
import X.C18270x1;
import X.C56972sr;
import X.C64333Db;
import X.C86614Ku;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;

public class RegistrationCompletedReceiver extends BroadcastReceiver {
    public C56972sr A00;
    public AnonymousClass33p A01;
    public final Object A02;
    public volatile boolean A03;

    public void onReceive(Context context, Intent intent) {
        if (!this.A03) {
            synchronized (this.A02) {
                if (!this.A03) {
                    C64333Db r1 = AnonymousClass2A1.A00(context).ACP;
                    this.A00 = C86614Ku.A0L(r1);
                    this.A01 = C86614Ku.A0W(r1);
                    this.A03 = true;
                }
            }
        }
        Log.i("RegistrationCompletedReceiver/onReceive/smba was registered on this device");
        if (this.A00.A0a(AnonymousClass32Y.A08(intent.getStringExtra("jid")))) {
            Log.i("RegistrationCompletedReceiver/onReceive/smba registered this clients phone number");
            C18270x1.A0l(C18270x1.A03(this.A01), "registration_biz_registered_on_device", true);
        }
    }

    public RegistrationCompletedReceiver(int i) {
        this.A03 = false;
        this.A02 = AnonymousClass002.A0D();
    }

    public RegistrationCompletedReceiver() {
        this(0);
    }
}
