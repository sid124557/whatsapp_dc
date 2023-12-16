package X;

import android.content.Context;
import java.util.ArrayList;

/* renamed from: X.9Rt  reason: invalid class name and case insensitive filesystem */
public class C194149Rt {
    public final Context A00;
    public final C69263Wi A01;
    public final C40602Ha A02;
    public final AnonymousClass9U5 A03;
    public final AnonymousClass9VU A04;
    public final C160757oG A05 = C160757oG.A00("PaymentProviderKeyAction", "network", "COMMON");
    public final String A06;

    public C194149Rt(Context context, C69263Wi r5, C40602Ha r6, AnonymousClass9U5 r7, AnonymousClass9VU r8, String str) {
        this.A00 = context;
        this.A01 = r5;
        this.A03 = r7;
        this.A02 = r6;
        this.A04 = r8;
        this.A06 = str;
    }

    public void A00(C203069n4 r14, String str) {
        ArrayList A0s = AnonymousClass001.A0s();
        AnonymousClass39V.A03("action", "get-provider-key", A0s);
        AnonymousClass39V.A03("provider", str, A0s);
        AnonymousClass39V.A03("key-scope", this.A06, A0s);
        AnonymousClass36K A0T = C1899593h.A0T(A0s);
        AnonymousClass9U5 r7 = this.A03;
        Context context = this.A00;
        C69263Wi r3 = this.A01;
        r7.A0G(new C203899oU(context, this.A02, r3, this, r14, 21), A0T, "get", 0);
    }
}
