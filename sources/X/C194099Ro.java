package X;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: X.9Ro  reason: invalid class name and case insensitive filesystem */
public class C194099Ro {
    public final Context A00;
    public final C69263Wi A01;
    public final C40602Ha A02;
    public final AnonymousClass9U5 A03;
    public final C202639mL A04;
    public final C160757oG A05 = C160757oG.A00("PaymentGetTokenIdAction", "network", "COMMON");

    public C194099Ro(Context context, C69263Wi r5, C40602Ha r6, AnonymousClass9U5 r7, C202639mL r8) {
        this.A00 = context;
        this.A01 = r5;
        this.A03 = r7;
        this.A02 = r6;
        this.A04 = r8;
    }

    public void A00(String str) {
        if (TextUtils.isEmpty(str)) {
            this.A04.BaT((AnonymousClass34V) null, (String) null);
            return;
        }
        this.A05.A06("starts to fetch token id");
        ArrayList A0s = AnonymousClass001.A0s();
        AnonymousClass39V.A03("action", "get-token-id", A0s);
        AnonymousClass39V.A03("credential-id", str, A0s);
        AnonymousClass36K A0T = C1899593h.A0T(A0s);
        this.A03.A0G(new C203889oT(this.A00, this.A02, this.A01, this, 11), A0T, "get", 0);
    }
}
