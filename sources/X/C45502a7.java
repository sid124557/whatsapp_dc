package X;

import com.whatsapp.service.RestoreChatConnectionWorker;
import com.whatsapp.util.Log;

/* renamed from: X.2a7  reason: invalid class name and case insensitive filesystem */
public class C45502a7 {
    public final C620633i A00;
    public final C54292oU A01;
    public final C34171uL A02;

    public void A00() {
        Log.i("Scheduling job to restore chat connection");
        C06310Xb A012 = C72333dY.A01(this.A02);
        C02320Fs r2 = C02320Fs.KEEP;
        AnonymousClass0Aw r1 = new AnonymousClass0Aw(RestoreChatConnectionWorker.class);
        r1.A04(C18270x1.A07());
        A012.A07(r2, AnonymousClass0x9.A0I(r1), "com.whatsapp.service.restoreChatConnection");
    }

    public C45502a7(C620633i r1, C54292oU r2, C34171uL r3) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }
}
