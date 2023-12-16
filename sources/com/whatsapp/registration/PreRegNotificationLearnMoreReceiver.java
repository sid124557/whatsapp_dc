package com.whatsapp.registration;

import X.AnonymousClass002;
import X.AnonymousClass2A1;
import X.AnonymousClass33T;
import X.AnonymousClass33p;
import X.C111095hX;
import X.C18270x1;
import X.C18310x6;
import X.C64333Db;
import X.C66433Lk;
import X.C86604Kt;
import X.C86614Ku;
import X.C86634Kw;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

public class PreRegNotificationLearnMoreReceiver extends BroadcastReceiver {
    public C111095hX A00;
    public AnonymousClass33T A01;
    public AnonymousClass33p A02;
    public C66433Lk A03;
    public final Object A04;
    public volatile boolean A05;

    public void onReceive(Context context, Intent intent) {
        if (!this.A05) {
            synchronized (this.A04) {
                if (!this.A05) {
                    C64333Db r1 = AnonymousClass2A1.A00(context).ACP;
                    this.A00 = C86634Kw.A0T(r1);
                    this.A03 = C86604Kt.A0e(r1);
                    this.A02 = C86614Ku.A0W(r1);
                    this.A01 = (AnonymousClass33T) r1.Aaf.get();
                    this.A05 = true;
                }
            }
        }
        this.A00.A0A(context, C18310x6.A0D(C66433Lk.A00(this.A03, "30035737")).setFlags(268435456));
        SharedPreferences.Editor A032 = C18270x1.A03(this.A02);
        A032.remove("show_pre_reg_do_not_share_code_warning");
        A032.apply();
        this.A01.A05(20, "PreRegNotificationLearnMoreReceiver");
    }

    public PreRegNotificationLearnMoreReceiver(int i) {
        this.A05 = false;
        this.A04 = AnonymousClass002.A0D();
    }

    public PreRegNotificationLearnMoreReceiver() {
        this(0);
    }
}
