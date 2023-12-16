package X;

import android.content.Context;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.99x  reason: invalid class name and case insensitive filesystem */
public class C1908099x extends C197739dn {
    public int A00;
    public C197109ca A01;
    public AnonymousClass9B3 A02;
    public String A03;
    public final C153607bd A04;
    public final String A05;

    public static C166157yE A00(AnonymousClass36K r5) {
        return new C166157yE(new C166557yt(new AnonymousClass3QD(), String.class, r5.A0r("alias_value", (String) null), "upiAlias"), r5.A0q("alias_type"), r5.A0q("alias_id"), r5.A0q("alias_status").toLowerCase(Locale.US));
    }

    public C1908099x(Context context, C69263Wi r2, C40602Ha r3, C153607bd r4, C197109ca r5, AnonymousClass9B3 r6, String str, String str2, int i) {
        super(context, r3, r2);
        this.A05 = str;
        this.A04 = r4;
        this.A01 = r5;
        this.A00 = i;
        this.A03 = str2;
        this.A02 = r6;
    }

    public static String A01(String str, String str2, String str3, String str4, StringBuilder sb) {
        sb.append(str);
        sb.append(str2);
        sb.append(" seqNumPrefix: ");
        sb.append(str3);
        sb.append(" bindID: ");
        return C195009Vm.A01(str4);
    }

    public void A03(AnonymousClass34V r5) {
        String str;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("PAY: onRequestError action: ");
        String str2 = this.A05;
        A0o.append(str2);
        C18260x0.A1R(A0o, " error: ", r5);
        C197109ca r2 = this.A01;
        if (r2 != null) {
            r2.A08(r5, this.A00, 1);
        }
        C153607bd r1 = this.A04;
        if (r1 != null) {
            r1.A05(str2, r5.A00);
        }
        AnonymousClass9B3 r12 = this.A02;
        if (r12 != null && (str = this.A03) != null) {
            r12.A06(r5, str);
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void A04(X.AnonymousClass34V r6) {
        /*
            r5 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "PAY: onResponseError action: "
            r1.append(r0)
            java.lang.String r4 = r5.A05
            r1.append(r4)
            java.lang.String r0 = " error: "
            X.C18260x0.A1R(r1, r0, r6)
            X.9ca r2 = r5.A01
            if (r2 == 0) goto L_0x001d
            int r1 = r5.A00
            r0 = 1
            r2.A08(r6, r1, r0)
        L_0x001d:
            X.9B3 r1 = r5.A02
            if (r1 == 0) goto L_0x0028
            java.lang.String r0 = r5.A03
            if (r0 == 0) goto L_0x0028
            r1.A06(r6, r0)
        L_0x0028:
            X.7bd r3 = r5.A04
            if (r3 == 0) goto L_0x0082
            int r0 = r6.A00
            r3.A05(r4, r0)
            int r4 = r6.A00
            r0 = 403(0x193, float:5.65E-43)
            if (r4 == r0) goto L_0x006b
            r0 = 405(0x195, float:5.68E-43)
            if (r4 == r0) goto L_0x006b
            r0 = 406(0x196, float:5.69E-43)
            if (r4 == r0) goto L_0x006b
            r0 = 426(0x1aa, float:5.97E-43)
            if (r4 == r0) goto L_0x006b
            r0 = 460(0x1cc, float:6.45E-43)
            if (r4 == r0) goto L_0x006b
            r0 = 410(0x19a, float:5.75E-43)
            if (r4 == r0) goto L_0x006b
            r0 = 409(0x199, float:5.73E-43)
            if (r4 == r0) goto L_0x006b
            r0 = 2826008(0x2b1f18, float:3.96008E-39)
            if (r4 == r0) goto L_0x006b
            r0 = 440(0x1b8, float:6.17E-43)
            if (r4 != r0) goto L_0x0082
            monitor-enter(r3)
            r3.A02 = r4     // Catch:{ all -> 0x007e }
            java.util.concurrent.CopyOnWriteArrayList r2 = r3.A07     // Catch:{ all -> 0x007e }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x007e }
            java.lang.String r0 = "tos-"
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r4)     // Catch:{ all -> 0x007e }
            r2.add(r0)     // Catch:{ all -> 0x007e }
            goto L_0x0081
        L_0x006b:
            monitor-enter(r3)
            r3.A01 = r4     // Catch:{ all -> 0x007e }
            java.util.concurrent.CopyOnWriteArrayList r2 = r3.A07     // Catch:{ all -> 0x007e }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x007e }
            java.lang.String r0 = "payability-"
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r4)     // Catch:{ all -> 0x007e }
            r2.add(r0)     // Catch:{ all -> 0x007e }
            goto L_0x0081
        L_0x007e:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0081:
            monitor-exit(r3)
        L_0x0082:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1908099x.A04(X.34V):void");
    }

    public void A05(AnonymousClass36K r6) {
        String str;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("PAY: onResponseSuccess for op: action: ");
        String str2 = this.A05;
        C18260x0.A1L(A0o, str2);
        C197109ca r2 = this.A01;
        if (r2 != null) {
            r2.A08((AnonymousClass34V) null, this.A00, 2);
        }
        AnonymousClass9B3 r0 = this.A02;
        if (!(r0 == null || (str = this.A03) == null)) {
            Map map = r0.A03.A03;
            AnonymousClass316 r02 = (AnonymousClass316) map.get(str);
            if (r02 != null) {
                r02.A0E(2);
                map.remove(str);
            }
        }
        C153607bd r03 = this.A04;
        if (r03 != null) {
            r03.A04(str2);
        }
    }

    public C1908099x(Context context, C69263Wi r3, C40602Ha r4, C153607bd r5, C197109ca r6, String str, int i) {
        super(context, r4, r3);
        this.A03 = null;
        this.A02 = null;
        this.A05 = str;
        this.A04 = r5;
        this.A01 = r6;
        this.A00 = i;
    }

    public C1908099x(Context context, C69263Wi r4, C40602Ha r5, C153607bd r6, String str) {
        super(context, r5, r4);
        this.A01 = null;
        this.A00 = 0;
        this.A03 = null;
        this.A02 = null;
        this.A05 = str;
        this.A04 = r6;
    }
}
