package X;

import com.whatsapp.util.Log;

/* renamed from: X.5pZ  reason: invalid class name and case insensitive filesystem */
public class C115995pZ implements AnonymousClass66I {
    public final C183538qC A00;

    public void BMb() {
        Log.d("RoadblocksAsyncAppUpdatedObserver: handling Roadblocks");
        AnonymousClass5XU r5 = (AnonymousClass5XU) this.A00.get();
        Log.i("Roadblocks/onAppUpdated");
        AnonymousClass33p r4 = r5.A03;
        C18270x1.A0i(C18270x1.A03(r4), "software_forced_expiration", 0);
        Log.i("wa-shared-prefs/clear-client-expiration-time");
        C18270x1.A0g(C18270x1.A03(r4), "client_expiration_time");
        r5.A01 = false;
    }

    public /* synthetic */ void BMc() {
    }

    public C115995pZ(C183538qC r1) {
        this.A00 = r1;
    }
}
