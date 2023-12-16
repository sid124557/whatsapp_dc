package com.whatsapp.accounttransfer;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass2A1;
import X.AnonymousClass4FS;
import X.C107575bX;
import X.C159787mS;
import X.C18260x0;
import X.C620633i;
import X.C64333Db;
import X.C70043Zq;
import X.C86604Kt;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.whatsapp.util.Log;

public class AccountTransferReceiver extends BroadcastReceiver {
    public C620633i A00;
    public AnonymousClass4FS A01;
    public final Object A02;
    public volatile boolean A03;

    public void onReceive(Context context, Intent intent) {
        String str;
        KeyguardManager A09;
        if (!this.A03) {
            synchronized (this.A02) {
                if (!this.A03) {
                    C64333Db r1 = AnonymousClass2A1.A00(context).ACP;
                    this.A01 = C86604Kt.A0g(r1);
                    this.A00 = (C620633i) r1.AYG.get();
                    this.A03 = true;
                }
            }
        }
        String action = intent.getAction();
        C18260x0.A0s("AccountTransferReceiver/onReceive/action=", action, AnonymousClass001.A0o());
        if (C107575bX.A0F(action)) {
            str = "AccountTransferReceiver/onReceive/action is empty";
        } else {
            C620633i r2 = this.A00;
            if (Build.VERSION.SDK_INT < 23 || (A09 = r2.A09()) == null || !A09.isDeviceSecure() || !AnonymousClass000.A1T(C159787mS.A00(context))) {
                str = "AccountTransferReceiver/onReceive/disabled";
            } else if (action.equals("com.google.android.gms.auth.START_ACCOUNT_EXPORT")) {
                this.A01.BkM(new C70043Zq(context, 32));
                return;
            } else {
                return;
            }
        }
        Log.i(str);
    }

    public AccountTransferReceiver(int i) {
        this.A03 = false;
        this.A02 = AnonymousClass002.A0D();
    }

    public AccountTransferReceiver() {
        this(0);
    }
}
