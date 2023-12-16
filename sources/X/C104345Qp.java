package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.5Qp  reason: invalid class name and case insensitive filesystem */
public class C104345Qp {
    public final C116985rC A00;
    public final C116985rC A01;
    public final C64773Ex A02;
    public final C56982ss A03;
    public final AnonymousClass2R8 A04;
    public final AnonymousClass1VX A05;
    public final AnonymousClass5N3 A06;
    public final List A07 = AnonymousClass001.A0s();
    public final Map A08 = AnonymousClass001.A0t();

    public synchronized C836349e A00(C108795dZ r3) {
        Map map;
        map = this.A08;
        if (map.isEmpty()) {
            A01();
        }
        return (C836349e) AnonymousClass001.A0i(map, r3.A01);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0018, code lost:
        if (r1.A00.A0Y(X.C58422vE.A01, 6450) == false) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01() {
        /*
            r10 = this;
            java.util.List r4 = r10.A07
            r4.clear()
            X.5N3 r1 = r10.A06
            boolean r0 = r1.A01()
            if (r0 == 0) goto L_0x001a
            X.1VX r2 = r1.A00
            X.2vE r1 = X.C58422vE.A01
            r0 = 6450(0x1932, float:9.038E-42)
            boolean r1 = r2.A0Y(r1, r0)
            r0 = 1
            if (r1 != 0) goto L_0x001b
        L_0x001a:
            r0 = 0
        L_0x001b:
            r8 = 1
            r9 = 0
            if (r0 != 0) goto L_0x0041
            r3 = 2131433279(0x7f0b173f, float:1.848834E38)
            r2 = 2131889349(0x7f120cc5, float:1.941336E38)
            r1 = 2131233653(0x7f080b75, float:1.808345E38)
            X.5dZ r0 = new X.5dZ
            r0.<init>(r9, r3, r2, r1)
            r4.add(r0)
            r3 = 2131433334(0x7f0b1776, float:1.848845E38)
            r2 = 2131889359(0x7f120ccf, float:1.941338E38)
            r1 = 2131233655(0x7f080b77, float:1.8083454E38)
            X.5dZ r0 = new X.5dZ
            r0.<init>(r8, r3, r2, r1)
            r4.add(r0)
        L_0x0041:
            X.1VX r6 = r10.A05
            r0 = 1608(0x648, float:2.253E-42)
            boolean r0 = r6.A0X(r0)
            r7 = 2
            if (r0 != 0) goto L_0x005d
            r3 = 2131433357(0x7f0b178d, float:1.8488497E38)
            r2 = 2131889362(0x7f120cd2, float:1.9413385E38)
            r1 = 2131233657(0x7f080b79, float:1.8083458E38)
            X.5dZ r0 = new X.5dZ
            r0.<init>(r7, r3, r2, r1)
            r4.add(r0)
        L_0x005d:
            r5 = 3
            java.util.Map r4 = r10.A08
            r4.clear()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            X.3Ex r2 = r10.A02
            X.5lI r0 = new X.5lI
            r0.<init>(r2)
            r4.put(r1, r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            X.5lJ r0 = new X.5lJ
            r0.<init>(r2)
            r4.put(r1, r0)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            X.2ss r2 = r10.A03
            X.2R8 r1 = r10.A04
            X.5lM r0 = new X.5lM
            r0.<init>(r2, r1, r6)
            r4.put(r3, r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            X.3FC r0 = new X.3FC
            r0.<init>(r2)
            r4.put(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C104345Qp.A01():void");
    }

    public C104345Qp(C116985rC r2, C116985rC r3, C64773Ex r4, C56982ss r5, AnonymousClass2R8 r6, AnonymousClass1VX r7, AnonymousClass5N3 r8) {
        this.A05 = r7;
        this.A03 = r5;
        this.A01 = r2;
        this.A00 = r3;
        this.A02 = r4;
        this.A06 = r8;
        this.A04 = r6;
    }
}
