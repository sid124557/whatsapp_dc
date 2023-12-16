package X;

import com.whatsapp.companiondevice.sync.HistorySyncWorker;
import com.whatsapp.util.Log;

/* renamed from: X.2Vn  reason: invalid class name and case insensitive filesystem */
public class C44302Vn {
    public final C34171uL A00;

    public void A00() {
        Log.i("HistorySyncWorkManager/startHistorySync");
        C06310Xb A01 = C72333dY.A01(this.A00);
        C02320Fs r2 = C02320Fs.KEEP;
        AnonymousClass0Aw r1 = new AnonymousClass0Aw(HistorySyncWorker.class);
        r1.A05(AnonymousClass0FO.RUN_AS_NON_EXPEDITED_WORK_REQUEST);
        r1.A04(C18270x1.A07());
        A01.A07(r2, AnonymousClass0x9.A0I(r1), "HISTORY_SYNC_WORK_UNIQUE_NAME");
    }

    public C44302Vn(C34171uL r1) {
        this.A00 = r1;
    }
}
