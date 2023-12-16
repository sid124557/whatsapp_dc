package X;

import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.Map;

/* renamed from: X.3Gq  reason: invalid class name and case insensitive filesystem */
public class C65213Gq implements AnonymousClass4FW, AnonymousClass4CG {
    public final C55562qY A00;
    public final AnonymousClass2OK A01;
    public final C52972mL A02;
    public final AnonymousClass4FS A03;

    public /* synthetic */ void BRi(C624134x r1) {
    }

    public /* synthetic */ void BVB(C95814uZ r1) {
    }

    public void BVi() {
        if (AnonymousClass2OK.A00(this.A01)) {
            Log.d("InstrumentationObserverImpl/onLocalAccountDeletionStarted");
            this.A02.A01();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002f, code lost:
        r8 = r11.A1J;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BWS(X.C624134x r11, int r12) {
        /*
            r10 = this;
            X.2OK r0 = r10.A01
            boolean r0 = X.AnonymousClass2OK.A00(r0)
            if (r0 == 0) goto L_0x007d
            java.lang.String r0 = "InstrumentationObserverImpl/onMessageAdded"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.2mL r0 = r10.A02
            java.lang.Iterable r0 = r0.A00()
            java.util.Iterator r9 = r0.iterator()
        L_0x0017:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x007d
            java.lang.Object r4 = r9.next()
            X.2rh r4 = (X.C56262rh) r4
            boolean r0 = r4 instanceof X.AnonymousClass1f2
            if (r0 == 0) goto L_0x0017
            X.1f2 r4 = (X.AnonymousClass1f2) r4
            X.1iO r0 = r4.A00
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0017
            X.2z0 r8 = r11.A1J
            boolean r7 = r8.A02
            if (r7 != 0) goto L_0x0017
            X.1uP r1 = r4.A08     // Catch:{ SecurityException -> 0x0077 }
            java.lang.String r0 = "com.facebook.stella"
            X.2pD r5 = r1.A02(r0)     // Catch:{ SecurityException -> 0x0077 }
            X.1f5 r6 = r4.A07     // Catch:{ SecurityException -> 0x0077 }
            boolean r0 = r11 instanceof X.C30441mS     // Catch:{ SecurityException -> 0x0077 }
            r3 = 0
            if (r0 == 0) goto L_0x006a
            org.json.JSONObject r2 = X.AnonymousClass0x9.A1G()     // Catch:{ SecurityException -> 0x0077 }
            r0 = r11
            X.1mS r0 = (X.C30441mS) r0     // Catch:{ SecurityException -> 0x0077 }
            java.lang.String r1 = r0.A01     // Catch:{ SecurityException -> 0x0077 }
            X.C626936e.A06(r1)     // Catch:{ SecurityException -> 0x0077 }
            X.4uZ r0 = r8.A00     // Catch:{ SecurityException -> 0x0077 }
            X.2z0 r1 = X.AnonymousClass2z0.A05(r0, r1, r7)     // Catch:{ SecurityException -> 0x0077 }
            X.2YJ r0 = r6.A00     // Catch:{ SecurityException -> 0x0077 }
            java.lang.String r1 = r0.A00(r1, r5)     // Catch:{ SecurityException -> 0x0077 }
            java.lang.String r0 = "message_id"
            r2.put(r0, r1)     // Catch:{ JSONException -> 0x006a }
            java.lang.String r0 = "message_revoked"
            X.2LB r3 = new X.2LB     // Catch:{ SecurityException -> 0x0077 }
            r3.<init>(r0, r2)     // Catch:{ SecurityException -> 0x0077 }
        L_0x006a:
            r4.A06(r3)     // Catch:{ SecurityException -> 0x0077 }
            X.1f7 r0 = r4.A06     // Catch:{ SecurityException -> 0x0077 }
            X.2LB r0 = r0.A00(r11, r5)     // Catch:{ SecurityException -> 0x0077 }
            r4.A06(r0)     // Catch:{ SecurityException -> 0x0077 }
            goto L_0x0017
        L_0x0077:
            java.lang.String r0 = "StellaEventDispatcher/cannot create event for untrusted package"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0017
        L_0x007d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65213Gq.BWS(X.34x, int):void");
    }

    public void BWU(C624134x r3, int i) {
        if (AnonymousClass2OK.A00(this.A01) && r3.A1J.A02 && !r3.A1C && i == 24) {
            Log.d("InstrumentationObserverImpl/onMessageChanged");
            this.A03.BkM(C70003Zm.A00(this, 42));
        }
    }

    public /* synthetic */ void BWW(C624134x r1) {
    }

    public /* synthetic */ void BWY(C624134x r1) {
    }

    public /* synthetic */ void BWf(C95814uZ r1) {
    }

    public /* synthetic */ void BWj(Collection collection) {
    }

    public /* synthetic */ void BX3(C95804uY r1) {
    }

    public /* synthetic */ void BX4(C624134x r1) {
    }

    public /* synthetic */ void BX6(C95804uY r1) {
    }

    public C65213Gq(C55562qY r1, AnonymousClass2OK r2, C52972mL r3, AnonymousClass4FS r4) {
        this.A03 = r4;
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public void BVh() {
    }

    public /* synthetic */ void BXI() {
    }

    public /* synthetic */ void BNb(C624134x r1, int i) {
    }

    public /* synthetic */ void BWX(C624134x r1, C624134x r2) {
    }

    public /* synthetic */ void BWe(Collection collection, int i) {
        C381525x.A00(this, collection, i);
    }

    public /* synthetic */ void BWg(Collection collection, Map map) {
    }

    public /* synthetic */ void BWh(C95814uZ r1, Collection collection, boolean z) {
    }

    public /* synthetic */ void BWi(C95814uZ r1, Collection collection, boolean z) {
    }

    public /* synthetic */ void BX5(C95804uY r1, boolean z) {
    }

    public /* synthetic */ void BY8(C624134x r1, C624134x r2) {
    }

    public /* synthetic */ void BY9(C624134x r1, C624134x r2) {
    }
}
