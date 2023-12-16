package X;

import android.content.Context;

/* renamed from: X.3cB  reason: invalid class name and case insensitive filesystem */
public class C71483cB implements Runnable {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public String A05;
    public final int A06;

    public C71483cB(Context context, AnonymousClass4CV r4, C43842Tr r5, C53652nR r6) {
        this.A06 = 1;
        this.A01 = r6;
        this.A02 = r5;
        this.A03 = context;
        this.A00 = 3;
        this.A05 = "XFAM_WFS";
        this.A04 = r4;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: X.2ZG} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: X.2PB} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: X.2ZG} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: X.2ZG} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r16 = this;
            r0 = r16
            int r1 = r0.A06
            switch(r1) {
                case 0: goto L_0x0046;
                case 1: goto L_0x0083;
                case 2: goto L_0x00a2;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r11 = r0.A01
            X.2PB r11 = (X.AnonymousClass2PB) r11
            java.lang.String r7 = r0.A05
            int r10 = r0.A00
            java.lang.Object r14 = r0.A02
            java.lang.Object r13 = r0.A03
            java.lang.Object r12 = r0.A04
            X.2Ds r0 = r11.A00
            X.3dX r0 = r0.A00
            X.3Db r0 = r0.A01
            X.1VX r3 = X.C64333Db.A4B(r0)
            X.3FI r5 = X.C64333Db.A8x(r0)
            X.2s4 r1 = X.C64333Db.A07(r0)
            X.33p r2 = X.C64333Db.A2s(r0)
            X.8qC r6 = X.C64333Db.A9V(r0)
            X.4C1 r8 = r0.A0F
            X.4C1 r9 = r0.A0M
            X.28T r4 = X.C64333Db.A7R(r0)
            X.1vW r0 = new X.1vW
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r15 = 3
        L_0x003d:
            X.4Ka r10 = new X.4Ka
            r10.<init>(r11, r12, r13, r14, r15)
            r0.Bh4(r10)
            return
        L_0x0046:
            java.lang.Object r11 = r0.A01
            X.2ZG r11 = (X.AnonymousClass2ZG) r11
            java.lang.String r7 = r0.A05
            int r10 = r0.A00
            java.lang.Object r14 = r0.A02
            java.lang.Object r12 = r0.A03
            java.lang.Object r13 = r0.A04
            X.2Dp r1 = r11.A00
            if (r1 == 0) goto L_0x00d2
            X.3dX r0 = r1.A00
            X.3Db r0 = r0.A01
            X.1VX r3 = X.C64333Db.A4B(r0)
            X.3dX r0 = r1.A00
            X.3Db r0 = r0.A01
            X.3FI r5 = X.C64333Db.A8x(r0)
            X.2s4 r1 = X.C64333Db.A07(r0)
            X.33p r2 = X.C64333Db.A2s(r0)
            X.8qC r6 = X.C64333Db.A9V(r0)
            X.4C1 r8 = r0.A0L
            X.4C1 r9 = r0.A0M
            X.28T r4 = X.C64333Db.A7R(r0)
            X.1vX r0 = new X.1vX
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r15 = 0
            goto L_0x003d
        L_0x0083:
            java.lang.Object r5 = r0.A01
            X.2nR r5 = (X.C53652nR) r5
            java.lang.Object r4 = r0.A02
            X.2Tr r4 = (X.C43842Tr) r4
            java.lang.Object r2 = r0.A03
            android.content.Context r2 = (android.content.Context) r2
            java.lang.String r6 = "XFAM_WFS"
            java.lang.Object r3 = r0.A04
            X.4CV r3 = (X.AnonymousClass4CV) r3
            r8 = 3
            r7 = 0
            com.whatsapp.bridge.wfs.WfsManager$startWfs$1$1 r1 = new com.whatsapp.bridge.wfs.WfsManager$startWfs$1$1
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            X.3du r0 = X.C72553du.A00
            X.C380725l.A00(r0, r1)
            return
        L_0x00a2:
            java.lang.String r6 = r0.A05
            int r5 = r0.A00
            java.lang.Object r3 = r0.A01
            X.3Dh r3 = (X.C64393Dh) r3
            java.lang.Object r2 = r0.A02
            X.2sH r2 = (X.C56612sH) r2
            java.lang.Object r1 = r0.A03
            X.1vA r1 = (X.C34441vA) r1
            java.lang.Object r4 = r0.A04
            X.4FV r4 = (X.AnonymousClass4FV) r4
            X.5Rx r0 = new X.5Rx
            r0.<init>(r2, r1)
            long r2 = X.AnonymousClass35X.A00(r3, r0)
            X.1aK r1 = new X.1aK
            r1.<init>()
            r0 = 2
            X.AnonymousClass296.A00(r1, r6, r0, r5)
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r1.A05 = r0
            r4.BhD(r1)
            return
        L_0x00d2:
            java.lang.String r0 = "accountLinkingNonceGraphqlRequestFactory"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71483cB.run():void");
    }

    public C71483cB(Object obj, Object obj2, Object obj3, Object obj4, String str, int i, int i2) {
        this.A06 = i2;
        this.A01 = obj;
        this.A05 = str;
        this.A00 = i;
        this.A02 = obj2;
        this.A03 = obj3;
        this.A04 = obj4;
    }
}
