package X;

import com.whatsapp.util.Log;

/* renamed from: X.9px  reason: invalid class name and case insensitive filesystem */
public class C204809px implements C203119n9 {
    public Object A00;
    public final int A01;

    public C204809px(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BRy() {
        if (this.A01 != 0) {
            Log.e("PAY: PaymentIncentiveManager/syncIncentiveData/refreshUserClaimInfo failed");
            ((AnonymousClass9RJ) this.A00).A00.BRy();
            return;
        }
        Log.e("PAY: PaymentIncentiveManager/refreshUserClaimInfo/processSuccessfulGetClaimInfo failed");
        C203119n9 r0 = ((AnonymousClass9P1) this.A00).A01;
        if (r0 != null) {
            r0.BRy();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0033, code lost:
        if (r0 != false) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bd6(X.C194839Ur r6) {
        /*
            r5 = this;
            int r0 = r5.A01
            if (r0 == 0) goto L_0x0014
            java.lang.Object r0 = r5.A00
            X.9RJ r0 = (X.AnonymousClass9RJ) r0
            X.9mu r1 = r0.A00
            X.9Vi r0 = r0.A01
            X.9VG r0 = r0.A00()
            r1.Bd5(r0)
        L_0x0013:
            return
        L_0x0014:
            java.lang.Object r4 = r5.A00
            X.9P1 r4 = (X.AnonymousClass9P1) r4
            X.9Vi r3 = r4.A02
            X.9Uu r2 = r3.A02()
            X.1VX r1 = r3.A09
            r0 = 889(0x379, float:1.246E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x0035
            boolean r0 = r3.A0A()
            if (r0 == 0) goto L_0x0035
            if (r2 == 0) goto L_0x0035
            boolean r0 = r2.A02
            r2 = 1
            if (r0 == 0) goto L_0x0036
        L_0x0035:
            r2 = 0
        L_0x0036:
            X.4FS r1 = r3.A0F
            X.9hx r0 = new X.9hx
            r0.<init>(r5, r2)
            r1.BkM(r0)
            X.9n9 r0 = r4.A01
            if (r0 == 0) goto L_0x0013
            r0.Bd6(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C204809px.Bd6(X.9Ur):void");
    }
}
