package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;

/* renamed from: X.4LJ  reason: invalid class name */
public final class AnonymousClass4LJ extends BroadcastReceiver {
    public final /* synthetic */ C111645iR A00;

    public void onReceive(Context context, Intent intent) {
        String A0P;
        C162457s7.A0J(intent, 1);
        C111645iR r2 = this.A00;
        if (!C107385bE.A03()) {
            A0P = "BackgroundRestrictionManager; received event on unsupported OS version.";
        } else if (!"android.net.conn.RESTRICT_BACKGROUND_CHANGED".equals(intent.getAction())) {
            A0P = AnonymousClass000.A0P(intent, "BackgroundRestrictionManager; received unsupported intent: ", AnonymousClass001.A0o());
        } else {
            Log.d("BackgroundRestrictionManager; background restriction change event.");
            for (C112705kA r3 : (Iterable) C18300x5.A0b(r2.A02)) {
                StringBuilder A0o = AnonymousClass001.A0o();
                C18260x0.A1T(A0o, "BackgroundRestrictionManager;   notifying ", r3);
                AnonymousClass0x2.A18(A0o);
                if (r3.A02.A03()) {
                    r3.A03.execute(new C117125rQ(r3, 41));
                }
            }
            return;
        }
        Log.w(A0P);
    }

    public AnonymousClass4LJ(C111645iR r1) {
        this.A00 = r1;
    }
}
