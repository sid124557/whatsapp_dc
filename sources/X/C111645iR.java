package X;

import android.content.Context;
import android.content.IntentFilter;
import com.whatsapp.util.Log;

/* renamed from: X.5iR  reason: invalid class name and case insensitive filesystem */
public final class C111645iR implements AnonymousClass66U {
    public final Context A00;
    public final AnonymousClass4LJ A01 = new AnonymousClass4LJ(this);
    public final C183538qC A02;

    public C111645iR(Context context, C183538qC r3) {
        C162457s7.A0J(r3, 2);
        this.A00 = context;
        this.A02 = r3;
    }

    public String BDW() {
        return "BackgroundRestrictionManager";
    }

    public /* synthetic */ void BMe() {
    }

    public void BMd() {
        if (!C107385bE.A03()) {
            Log.w("BackgroundRestrictionManager; init on unsupported OS version.");
            return;
        }
        IntentFilter intentFilter = new IntentFilter("android.net.conn.RESTRICT_BACKGROUND_CHANGED");
        C154317cy.A01(this.A01, this.A00, intentFilter, true);
        Log.d("BackgroundRestrictionManager; background restrictions receiver registered.");
        for (C112705kA r3 : (Iterable) C18300x5.A0b(this.A02)) {
            StringBuilder A0o = AnonymousClass001.A0o();
            C18260x0.A1T(A0o, "BackgroundRestrictionManager;   notifying ", r3);
            AnonymousClass0x2.A18(A0o);
            if (r3.A02.A03()) {
                r3.A03.execute(new C117125rQ(r3, 41));
            }
        }
    }
}
