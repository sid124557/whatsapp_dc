package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.util.Log;

/* renamed from: X.0xV  reason: invalid class name and case insensitive filesystem */
public final class C18490xV extends BroadcastReceiver {
    public AnonymousClass4FS A00;
    public final Object A01 = AnonymousClass002.A0D();
    public volatile boolean A02 = false;

    public void onReceive(Context context, Intent intent) {
        String str;
        if (!this.A02) {
            synchronized (this.A01) {
                if (!this.A02) {
                    AnonymousClass2A1.A00(context).ARn(this);
                    this.A02 = true;
                }
            }
        }
        int resultCode = getResultCode();
        Bundle resultExtras = getResultExtras(true);
        Log.i("FoaBackupTokenRequesterResponseReceiver/onReceive");
        if (context != null && resultCode == -1) {
            if (intent != null) {
                str = intent.getAction();
            } else {
                str = null;
            }
            if (C162457s7.A0P(str, "com.facebook.GET_FOA_BACKUP_TOKEN") && resultExtras != null) {
                Log.i("FoaBackupTokenRequesterResponseReceiver/onReceive/success");
                String string = resultExtras.getString("foa_backup_token");
                if (string != null) {
                    Log.i("FoaBackupTokenRequesterResponseReceiver/onReceive/success token present");
                    AnonymousClass4FS r2 = this.A00;
                    if (r2 != null) {
                        r2.BkM(new C71373c0(7, string, context));
                        return;
                    }
                    throw C18270x1.A0S("waWorkers");
                }
            }
        }
    }
}
