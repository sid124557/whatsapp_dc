package X;

import android.content.Context;
import android.util.Pair;

/* renamed from: X.55Q  reason: invalid class name */
public class AnonymousClass55Q extends AnonymousClass5ZM {
    public final C69263Wi A00;
    public final C66413Li A01;
    public final C149737Nr A02;
    public final AnonymousClass31C A03;
    public final String A04;

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Pair pair = (Pair) obj;
        this.A00.A0D();
        C149737Nr r0 = this.A02;
        C105815Wn r4 = r0.A01;
        String str = r0.A03;
        Context context = r0.A00;
        String str2 = r0.A04;
        C624134x r1 = r0.A02;
        r4.A00 = null;
        if (pair != null) {
            r4.A06.A00.put(str, pair);
        }
        C162457s7.A0H(str);
        C105815Wn.A00(context, pair, r4, str, str2, r1.A1J.A02);
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        try {
            this.A03.A08(32000);
            return this.A01.A00(AnonymousClass227.A0D, this.A04);
        } catch (C376223j unused) {
            return null;
        }
    }

    public AnonymousClass55Q(C69263Wi r1, C66413Li r2, C149737Nr r3, AnonymousClass31C r4, String str) {
        this.A00 = r1;
        this.A03 = r4;
        this.A01 = r2;
        this.A04 = str;
        this.A02 = r3;
    }
}
