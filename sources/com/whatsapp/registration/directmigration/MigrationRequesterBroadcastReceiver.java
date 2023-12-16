package com.whatsapp.registration.directmigration;

import X.AnonymousClass002;
import X.AnonymousClass2A1;
import X.AnonymousClass2QW;
import X.AnonymousClass33p;
import X.C18270x1;
import X.C18280x3;
import X.C18330xA;
import X.C25681au;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;

public class MigrationRequesterBroadcastReceiver extends BroadcastReceiver {
    public AnonymousClass33p A00;
    public AnonymousClass2QW A01;
    public final Object A02;
    public volatile boolean A03;

    public void onReceive(Context context, Intent intent) {
        if (!this.A03) {
            synchronized (this.A02) {
                if (!this.A03) {
                    AnonymousClass2A1.A00(context).ARl(this);
                    this.A03 = true;
                }
            }
        }
        if (intent != null) {
            Log.i("MigrationRequesterBroadcastReceiver/received-broadcast");
            if (C18280x3.A1V(intent, "com.whatsapp.registration.directmigration.providerAppMigrationSpaceNeededAction")) {
                long longExtra = intent.getLongExtra("extra_min_storage_needed", 0);
                long longExtra2 = intent.getLongExtra("extra_msg_db_size", 0);
                C25681au r1 = this.A01.A01;
                r1.A03 = Double.valueOf((double) longExtra);
                r1.A02 = C18330xA.A07(longExtra2);
                C18270x1.A0i(C18270x1.A03(this.A00), "registration_sibling_app_min_storage_needed", longExtra);
            }
        }
    }

    public MigrationRequesterBroadcastReceiver(int i) {
        this.A03 = false;
        this.A02 = AnonymousClass002.A0D();
    }

    public MigrationRequesterBroadcastReceiver() {
        this(0);
    }
}
