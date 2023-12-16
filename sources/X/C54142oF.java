package X;

import android.app.Activity;

/* renamed from: X.2oF  reason: invalid class name and case insensitive filesystem */
public class C54142oF {
    public boolean A00;
    public final Activity A01;
    public final C55682qk A02;
    public final C69263Wi A03;
    public final AnonymousClass49C A04;
    public final C56962sq A05;
    public final C43802Tn A06;
    public final C58702vg A07;
    public final C29421in A08;
    public final AnonymousClass33p A09;
    public final C56662sM A0A;
    public final AnonymousClass1VX A0B;
    public final AnonymousClass3LP A0C;
    public final AnonymousClass31C A0D;
    public final Runnable A0E = new C117125rQ(this, 2);
    public final Runnable A0F = new C117125rQ(this, 3);
    public final boolean A0G;

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void A02(java.lang.String r8) {
        /*
            r7 = this;
            X.2Tn r3 = r7.A06
            com.whatsapp.jid.UserJid r5 = r3.A04
            boolean r6 = r3.A0A
            if (r6 == 0) goto L_0x001d
            X.1VX r2 = r7.A0B
            r1 = 4225(0x1081, float:5.92E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 != 0) goto L_0x001d
            X.2sq r2 = r7.A05
            X.4FS r1 = r2.A0c
            r0 = 18
            X.C18290x4.A1M(r1, r3, r2, r0)
        L_0x001d:
            X.2sq r4 = r7.A05
            X.4FS r1 = r4.A0c
            r0 = 21
            X.C18290x4.A1M(r1, r3, r4, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "blocklistresponsehandler/general_request_success jid="
            X.C18260x0.A1R(r1, r0, r5)
            r3 = 1
            r7.A00 = r3
            if (r6 == 0) goto L_0x0049
            r0 = 0
            X.C162457s7.A0J(r5, r0)
            com.whatsapp.jid.UserJid r2 = r4.A02(r5)
            monitor-enter(r4)
            java.util.Set r0 = r4.A0d     // Catch:{ all -> 0x0070 }
            boolean r1 = r0.add(r5)     // Catch:{ all -> 0x0070 }
            if (r2 == 0) goto L_0x005d
            r0.add(r2)     // Catch:{ all -> 0x0070 }
            goto L_0x005d
        L_0x0049:
            r3 = 0
            X.C162457s7.A0J(r5, r3)
            com.whatsapp.jid.UserJid r2 = r4.A02(r5)
            monitor-enter(r4)
            java.util.Set r0 = r4.A0d     // Catch:{ all -> 0x0070 }
            boolean r1 = r0.remove(r5)     // Catch:{ all -> 0x0070 }
            if (r2 == 0) goto L_0x005d
            r0.remove(r2)     // Catch:{ all -> 0x0070 }
        L_0x005d:
            monitor-exit(r4)
            if (r1 == 0) goto L_0x0068
            r4.A0I(r5, r8, r3)
            if (r2 == 0) goto L_0x0068
            r4.A0I(r2, r8, r3)
        L_0x0068:
            X.3Wi r1 = r7.A03
            java.lang.Runnable r0 = r7.A0F
            r1.BkS(r0)
            return
        L_0x0070:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54142oF.A02(java.lang.String):void");
    }

    public C54142oF(Activity activity, C55682qk r4, C69263Wi r5, AnonymousClass49C r6, C56962sq r7, C43802Tn r8, C58702vg r9, C29421in r10, AnonymousClass33p r11, C56662sM r12, AnonymousClass1VX r13, AnonymousClass3LP r14, AnonymousClass31C r15, boolean z) {
        this.A01 = activity;
        this.A03 = r5;
        this.A02 = r4;
        this.A0C = r14;
        this.A0D = r15;
        this.A05 = r7;
        this.A08 = r10;
        this.A0A = r12;
        this.A09 = r11;
        this.A04 = r6;
        this.A0G = z;
        this.A06 = r8;
        this.A07 = r9;
        this.A0B = r13;
    }

    public void A00() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("blocklistresponsehandler/general_request_timeout jid=");
        C18260x0.A0o(this.A06.A04, A0o);
        this.A03.BkS(this.A0E);
    }

    public void A01(int i) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("blocklistresponsehandler/general_request_failed ");
        A0o.append(i);
        A0o.append(" | ");
        C18260x0.A0o(this.A06.A04, A0o);
        this.A03.BkS(this.A0F);
    }
}
