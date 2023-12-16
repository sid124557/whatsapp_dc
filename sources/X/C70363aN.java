package X;

import com.facebook.msys.mci.DataTask;
import com.facebook.msys.mci.NetworkSession;
import com.facebook.msys.mci.NetworkUtils;
import com.facebook.msys.mci.UrlRequest;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;

/* renamed from: X.3aN  reason: invalid class name and case insensitive filesystem */
public class C70363aN implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public static Long A00(File file) {
        return Long.valueOf((C627536m.A00((AnonymousClass0QU) null, file) / 10000000) * 10000000);
    }

    public C70363aN(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
    }

    /* JADX INFO: finally extract failed */
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:871)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:128)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void run() {
        /*
            r64 = this;
            r1 = r64
            int r0 = r1.A03
            switch(r0) {
                case 0: goto L_0x05c2;
                case 1: goto L_0x0946;
                case 2: goto L_0x0959;
                case 3: goto L_0x005a;
                case 4: goto L_0x0969;
                case 5: goto L_0x09cc;
                case 6: goto L_0x0a03;
                case 7: goto L_0x0a21;
                case 8: goto L_0x0a43;
                case 9: goto L_0x003d;
                case 10: goto L_0x00a6;
                case 11: goto L_0x00ef;
                case 12: goto L_0x0abc;
                case 13: goto L_0x0ae8;
                case 14: goto L_0x02df;
                case 15: goto L_0x0b15;
                case 16: goto L_0x031a;
                case 17: goto L_0x03ee;
                case 18: goto L_0x043a;
                case 19: goto L_0x0b2c;
                case 20: goto L_0x0b5e;
                case 21: goto L_0x0487;
                case 22: goto L_0x0c99;
                case 23: goto L_0x04e6;
                case 24: goto L_0x0d27;
                case 25: goto L_0x0505;
                case 26: goto L_0x0529;
                case 27: goto L_0x0d4d;
                case 28: goto L_0x0d60;
                case 29: goto L_0x0d9b;
                case 30: goto L_0x0568;
                case 31: goto L_0x0581;
                case 32: goto L_0x0db7;
                case 33: goto L_0x0dc7;
                case 34: goto L_0x0e27;
                case 35: goto L_0x0e57;
                case 36: goto L_0x0e6b;
                case 37: goto L_0x0efe;
                case 38: goto L_0x0f0e;
                case 39: goto L_0x1027;
                case 40: goto L_0x1040;
                case 41: goto L_0x1060;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r1.A00
            X.5YA r0 = (X.AnonymousClass5YA) r0
            java.lang.Object r5 = r1.A01
            android.content.Context r5 = (android.content.Context) r5
            java.lang.Object r4 = r1.A02
            X.1mW r4 = (X.C30481mW) r4
            X.8qC r0 = r0.A0H
            java.lang.Object r3 = r0.get()
            X.2r9 r3 = (X.C55932r9) r3
            java.lang.String r0 = "XFamilyCrosspostRequestSessionManager/handleNewAutoShareRecordCreationForTextStatus start text status burning"
            X.C106245Ye.A00(r0)
            X.5Se r0 = r3.A03
            X.1VX r2 = r0.A01
            r1 = 4437(0x1155, float:6.218E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x05b7
            X.8qC r0 = r3.A0A
            java.lang.Object r0 = r0.get()
            X.2hP r0 = (X.C49972hP) r0
            r0.A00(r5, r4)
            r3.A02(r4)
        L_0x003c:
            return
        L_0x003d:
            java.lang.Object r3 = r1.A00
            X.4Yw r3 = (X.C88474Yw) r3
            java.lang.Object r0 = r1.A01
            X.33C r0 = (X.AnonymousClass33C) r0
            java.lang.Object r2 = r1.A02
            boolean r1 = r0.A03()
            r0 = 49
            if (r1 == 0) goto L_0x0051
            r0 = 48
        L_0x0051:
            X.3a1 r1 = new X.3a1
            r1.<init>(r3, r0, r2)
            X.3Wi r0 = r3.A0F
            goto L_0x0501
        L_0x005a:
            java.lang.Object r7 = r1.A00
            X.2yI r7 = (X.C60282yI) r7
            java.lang.Object r6 = r1.A01
            X.66C r6 = (X.AnonymousClass66C) r6
            java.lang.Object r5 = r1.A02
            X.30Y r5 = (X.AnonymousClass30Y) r5
            X.8qC r0 = r7.A06
            java.lang.Object r4 = r0.get()
            X.8vZ r4 = (X.C186568vZ) r4
            java.util.concurrent.atomic.AtomicInteger r0 = X.C60282yI.A09
            int r3 = r0.getAndIncrement()
            r2 = 916783105(0x36a50001, float:4.9173836E-6)
            r4.markerStart(r2, r3)
            java.lang.String r1 = r6.B9C()
            java.lang.String r0 = "job"
            r4.markerAnnotate((int) r2, (int) r3, (java.lang.String) r0, (java.lang.String) r1)
            int r1 = r5.A00
            java.lang.String r0 = "marker_id"
            r4.markerAnnotate((int) r2, (int) r3, (java.lang.String) r0, (int) r1)
            r6.B27(r5)     // Catch:{ Exception -> 0x0092 }
            r0 = 2
            r4.markerEnd(r2, r3, r0)     // Catch:{ Exception -> 0x0092 }
            goto L_0x0096
        L_0x0092:
            r0 = 3
            r4.markerEnd(r2, r3, r0)     // Catch:{ all -> 0x1078 }
        L_0x0096:
            java.util.concurrent.ConcurrentHashMap r1 = r7.A08
            int r0 = r5.A01
            java.lang.Object r0 = X.C18290x4.A0j(r1, r0)
            java.util.concurrent.atomic.AtomicInteger r0 = (java.util.concurrent.atomic.AtomicInteger) r0
            if (r0 == 0) goto L_0x003c
            r0.decrementAndGet()
            return
        L_0x00a6:
            java.lang.Object r5 = r1.A00
            X.2hs r5 = (X.C50252hs) r5
            java.lang.Object r6 = r1.A01
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r4 = r1.A02
            X.34x r4 = (X.C624134x) r4
            X.1VX r2 = r5.A05
            r1 = 2039(0x7f7, float:2.857E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            r3 = 0
            if (r0 == 0) goto L_0x00db
            java.util.ArrayList r0 = X.AnonymousClass002.A0J(r6)
            java.util.List r2 = java.util.Collections.synchronizedList(r0)
            java.util.Iterator r1 = r2.iterator()
        L_0x00cb:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x003c
            X.34x r0 = X.C18300x5.A0T(r1)
            r5.A00(r0, r4, r2, r3)
            int r3 = r3 + 1
            goto L_0x00cb
        L_0x00db:
            java.util.Iterator r1 = r6.iterator()
        L_0x00df:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x003c
            X.34x r0 = X.C18300x5.A0T(r1)
            r5.A00(r0, r4, r6, r3)
            int r3 = r3 + 1
            goto L_0x00df
        L_0x00ef:
            java.lang.Object r5 = r1.A00
            X.5mK r5 = (X.C113995mK) r5
            java.lang.Object r2 = r1.A01
            X.5R3 r2 = (X.AnonymousClass5R3) r2
            java.lang.Object r10 = r1.A02
            java.util.List r10 = (java.util.List) r10
            r14 = 0
            r8 = 2
            X.2pt r0 = r5.A05
            com.whatsapp.jid.UserJid r7 = r2.A05
            java.util.List r9 = r0.A01(r7)
            java.util.HashMap r4 = X.AnonymousClass001.A0t()
            int r6 = r9.size()
            r3 = 0
        L_0x010e:
            if (r3 >= r6) goto L_0x012a
            X.34x r0 = X.C18320x8.A0R(r9, r3)
            java.lang.String r2 = X.AnonymousClass2z0.A06(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            java.lang.Object r0 = r9.get(r3)
            X.0PJ r0 = X.AnonymousClass0x9.A0G(r1, r0)
            r4.put(r2, r0)
            int r3 = r3 + 1
            goto L_0x010e
        L_0x012a:
            java.util.Iterator r16 = r10.iterator()
        L_0x012e:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x003c
            java.lang.Object r6 = r16.next()
            X.2w8 r6 = (X.C58982w8) r6
            boolean r0 = r7 instanceof X.C135216kJ
            r9 = 1
            if (r0 == 0) goto L_0x019b
            java.lang.String r3 = r6.A0M
            boolean r0 = r4.containsKey(r3)
            if (r0 == 0) goto L_0x019b
            java.lang.Object r10 = X.C18290x4.A0i(r3, r4)
            X.0PJ r10 = (X.AnonymousClass0PJ) r10
            java.lang.Object r2 = r10.A01
            X.34x r2 = (X.C624134x) r2
            X.2z0 r0 = r2.A1J
            java.lang.String r1 = r0.A01
            boolean r0 = X.C162457s7.A0P(r3, r1)
            if (r0 == 0) goto L_0x019b
            java.lang.Object r0 = r10.A00
            java.lang.Number r0 = (java.lang.Number) r0
            java.lang.Long r0 = X.C18280x3.A0U(r0)
            r6.A0I = r0
            X.2W5 r0 = r5.A06
            X.33F r2 = r0.A00(r2)
            java.lang.String r0 = r2.A04
            r6.A0J = r0
            java.util.Map r0 = r5.A0G
            java.lang.Number r0 = X.AnonymousClass0x9.A0q(r3, r0)
            int r0 = X.C18310x6.A06(r0)
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r0)
            r6.A0H = r0
            java.lang.String r0 = r2.A03
            boolean r0 = X.AnonymousClass000.A1W(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.A0C = r0
            boolean r0 = X.AnonymousClass0x9.A1Q(r0)
            if (r0 == 0) goto L_0x019b
            java.util.Map r0 = r5.A0H
            java.lang.Object r0 = r0.get(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r6.A0D = r0
        L_0x019b:
            X.3Ex r0 = r5.A03
            com.whatsapp.jid.UserJid r13 = r6.A0L
            X.3ZH r1 = r0.A07(r13)
            if (r1 == 0) goto L_0x01b9
            boolean r0 = r1.A0R()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.A0A = r0
            boolean r0 = r1.A0Q()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.A0B = r0
        L_0x01b9:
            java.lang.Integer r3 = r6.A0E
            r12 = 3
            if (r3 == 0) goto L_0x01c9
            int r0 = r3.intValue()
            if (r0 != r8) goto L_0x02ce
            X.2pR r0 = r5.A09
            r0.A02(r8, r12)
        L_0x01c9:
            X.1bN r2 = new X.1bN
            r2.<init>()
            java.lang.Boolean r0 = r6.A0A
            r2.A00 = r0
            java.lang.Boolean r0 = r6.A0B
            r2.A01 = r0
            long r0 = r6.A09
            java.lang.Long r10 = java.lang.Long.valueOf(r0)
            r2.A0J = r10
            int r15 = r6.A02
            java.lang.Integer r0 = java.lang.Integer.valueOf(r15)
            r2.A07 = r0
            int r0 = r6.A01
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r0)
            r2.A0I = r0
            int r0 = r6.A04
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A06 = r0
            r2.A05 = r3
            long r0 = r6.A07
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A0E = r0
            long r0 = r6.A08
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A0H = r0
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r0 = r6.A06
            long r0 = r12.toSeconds(r0)
            long r0 = r11.toMillis(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A0D = r0
            int r0 = r6.A00
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r0)
            r2.A0F = r0
            int r0 = r6.A03
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r0)
            r2.A0G = r0
            long r0 = r6.A05
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A0B = r0
            boolean r0 = r6.A0K
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r0)
            r2.A04 = r11
            java.lang.Long r0 = r6.A0I
            r2.A0C = r0
            java.lang.String r1 = r6.A0J
            r2.A0K = r1
            java.lang.Long r0 = r6.A0H
            r2.A0A = r0
            java.lang.Boolean r0 = r6.A0C
            r2.A02 = r0
            java.lang.Boolean r0 = r6.A0D
            r2.A03 = r0
            java.lang.Integer r0 = r6.A0G
            r2.A09 = r0
            java.lang.Integer r0 = r6.A0F
            r2.A08 = r0
            if (r1 == 0) goto L_0x02c8
            int r0 = r1.length()
            if (r0 == 0) goto L_0x02c8
            X.4FV r1 = r5.A08
            X.5ZC r0 = X.C106595Zp.A00
            r1.Bh7(r2, r0, r9)
        L_0x0267:
            java.lang.String r12 = r6.A0M
            boolean r0 = r4.containsKey(r12)
            if (r0 == 0) goto L_0x012e
            java.lang.Object r0 = X.C18290x4.A0i(r12, r4)
            X.0PJ r0 = (X.AnonymousClass0PJ) r0
            java.lang.Object r9 = r0.A01
            X.34x r9 = (X.C624134x) r9
            if (r3 == 0) goto L_0x02c5
            int r1 = r3.intValue()
            r0 = 4
            if (r1 == r0) goto L_0x0285
            r0 = 3
            if (r1 != r0) goto L_0x02c5
        L_0x0285:
            long r0 = r6.A08
            long r2 = r6.A06
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            boolean r0 = X.AnonymousClass001.A1U(r6)
            java.lang.Boolean r19 = java.lang.Boolean.valueOf(r0)
        L_0x0293:
            int r0 = X.C58982w8.A00(r15)
            java.lang.Integer r21 = java.lang.Integer.valueOf(r0)
            X.7Yv r3 = r5.A0D
            X.C162457s7.A0H(r9)
            X.C162457s7.A0J(r9, r14)
            r2 = 1
            boolean r0 = r3.A02(r9)
            if (r0 == 0) goto L_0x012e
            r18 = r13
            r20 = r11
            r22 = r10
            r23 = r12
            r17 = r3
            X.6iJ r1 = r17.A00(r18, r19, r20, r21, r22, r23)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r1.A05 = r0
            X.4FV r0 = r3.A01
            X.C18280x3.A0t(r1, r0, r2)
            goto L_0x012e
        L_0x02c5:
            java.lang.Boolean r19 = java.lang.Boolean.TRUE
            goto L_0x0293
        L_0x02c8:
            X.4FV r0 = r5.A08
            r0.BhD(r2)
            goto L_0x0267
        L_0x02ce:
            if (r0 != r12) goto L_0x01c9
            long r0 = r6.A08
            r10 = 400(0x190, double:1.976E-321)
            int r2 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r2 <= 0) goto L_0x01c9
            X.2pR r0 = r5.A09
            r0.A02(r12, r12)
            goto L_0x01c9
        L_0x02df:
            java.lang.Object r2 = r1.A00
            X.1el r2 = (X.C27841el) r2
            java.lang.Object r4 = r1.A01
            X.39M r4 = (X.AnonymousClass39M) r4
            java.lang.Object r1 = r1.A02
            X.4BM r1 = (X.AnonymousClass4BM) r1
            java.lang.String r5 = r4.A0D
            if (r5 == 0) goto L_0x003c
            X.2oo r0 = r2.A05
            java.lang.String r6 = r0.A00(r5)
            r8 = 0
            java.lang.String r7 = r4.A05
            X.2hJ r3 = new X.2hJ
            r3.<init>(r4, r5, r6, r7, r8)
            r2.A07(r3)
            if (r1 == 0) goto L_0x0308
            java.lang.String r0 = r4.A0D
            r1.BQg(r0)
        L_0x0308:
            X.3Wi r3 = r2.A01
            X.1ih r2 = r2.A07
            java.util.Objects.requireNonNull(r2)
            r1 = 21
            X.5sF r0 = new X.5sF
            r0.<init>(r2, r1)
            r3.A0S(r0)
            return
        L_0x031a:
            java.lang.Object r4 = r1.A00
            X.2Tw r4 = (X.C43892Tw) r4
            java.lang.Object r2 = r1.A01
            X.1b4 r2 = (X.C25781b4) r2
            java.lang.Object r3 = r1.A02
            X.5ZC r3 = (X.AnonymousClass5ZC) r3
            X.2sr r0 = r4.A01
            com.whatsapp.Me r0 = X.C56972sr.A00(r0)
            if (r0 == 0) goto L_0x003c
            X.3dV r0 = r4.A06
            boolean r0 = X.C72303dV.A00(r0)
            if (r0 == 0) goto L_0x003c
            X.2jE r0 = r4.A0A
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x003c
            X.2zf r5 = r4.A04
            long r0 = r5.A03()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A0C = r0
            long r0 = r5.A05()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A0D = r0
            long r0 = r5.A02()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A05 = r0
            long r0 = r5.A04()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A06 = r0
            X.2W1 r0 = r4.A05
            java.lang.Long r0 = r0.A00()
            r2.A00 = r0
            java.util.concurrent.atomic.AtomicBoolean r6 = X.C18280x3.A0l()
            X.3Gy r5 = new X.3Gy
            r5.<init>(r2, r4, r6)
            X.2yK r1 = r4.A07
            java.util.concurrent.CopyOnWriteArrayList r0 = r1.A0A
            r0.add(r5)
            r0 = 0
            r1.A02(r0, r6)
            X.2oU r0 = r4.A03
            android.content.Context r1 = r0.A00
            java.io.File r0 = r1.getFilesDir()
            java.io.File r0 = r0.getParentFile()
            java.lang.Long r0 = A00(r0)
            r2.A0B = r0
            java.io.File r0 = r1.getFilesDir()
            java.lang.Long r0 = A00(r0)
            r2.A0A = r0
            java.lang.String r0 = "ignore"
            java.io.File r0 = r1.getDatabasePath(r0)
            java.io.File r0 = r0.getParentFile()
            java.lang.Long r0 = A00(r0)
            r2.A09 = r0
            java.io.File r0 = r1.getCacheDir()
            java.lang.Long r0 = A00(r0)
            r2.A08 = r0
            X.310 r1 = r4.A02
            java.io.File r0 = X.AnonymousClass310.A00(r1)
            java.lang.Long r0 = A00(r0)
            r2.A07 = r0
            X.3Dh r0 = r4.A00
            java.io.File r0 = r0.A0G()
            java.lang.Long r0 = A00(r0)
            r2.A04 = r0
            java.io.File r0 = r1.A03()
            java.lang.Long r0 = A00(r0)
            r2.A03 = r0
            java.io.File r0 = r1.A02()
            java.lang.Long r0 = A00(r0)
            r2.A02 = r0
            X.4FV r1 = r4.A09
            int r0 = r3.A01
            r1.BhE(r2, r0)
            return
        L_0x03ee:
            java.lang.Object r4 = r1.A00
            com.whatsapp.storage.StorageUsageActivity r4 = (com.whatsapp.storage.StorageUsageActivity) r4
            java.lang.Object r5 = r1.A01
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r2 = r1.A02
            java.util.List r2 = (java.util.List) r2
            X.4X8 r3 = r4.A0H
            X.C626936e.A06(r5)
            java.lang.String r1 = r4.A0P
            java.util.List r0 = r4.A0R
            r3.A06 = r5
            r3.A05 = r1
            r3.A07 = r0
            r0 = 1
            r3.A08 = r0
            if (r2 == 0) goto L_0x0425
            java.util.Iterator r2 = r2.iterator()
        L_0x0412:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0428
            int r1 = X.C18280x3.A05(r2)
            int r0 = r3.A0K()
            int r1 = r1 + r0
            r3.A07(r1)
            goto L_0x0412
        L_0x0425:
            r3.A05()
        L_0x0428:
            X.5RU r3 = r4.A0G
            android.view.View r2 = r4.A00
            java.lang.String r1 = "manage_storage"
            java.lang.String r0 = r4.A0O
            boolean r0 = r3.A02(r2, r1, r0)
            if (r0 == 0) goto L_0x003c
            r0 = 0
            r4.A0O = r0
            return
        L_0x043a:
            java.lang.Object r0 = r1.A00
            X.29a r0 = (X.AnonymousClass29a) r0
            java.lang.Object r6 = r1.A01
            java.lang.Object r5 = r1.A02
            X.39K r5 = (X.AnonymousClass39K) r5
            java.lang.Object r0 = r0.A00
            com.whatsapp.storage.StorageUsageActivity r0 = (com.whatsapp.storage.StorageUsageActivity) r0
            X.4X8 r4 = r0.A0H
            java.util.List r0 = r4.A06
            java.util.Iterator r2 = r0.iterator()
        L_0x0450:
            boolean r0 = r2.hasNext()
            r3 = -1
            if (r0 == 0) goto L_0x003c
            java.lang.Object r1 = r2.next()
            X.3ZS r1 = (X.AnonymousClass3ZS) r1
            X.4uZ r0 = r1.A01()
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x0450
            java.util.List r0 = r4.A06
            int r2 = r0.indexOf(r1)
            if (r2 == r3) goto L_0x003c
            java.util.List r0 = r4.A06
            java.lang.Object r1 = r0.get(r2)
            X.3ZS r1 = (X.AnonymousClass3ZS) r1
            r1.A00 = r5
            java.util.List r0 = r4.A06
            r0.set(r2, r1)
            java.util.List r0 = r4.A06
            java.util.Collections.sort(r0)
            r4.A05()
            return
        L_0x0487:
            java.lang.Object r0 = r1.A00
            X.4Me r0 = (X.C86874Me) r0
            java.lang.Object r2 = r1.A01
            java.io.File r2 = (java.io.File) r2
            java.lang.Object r7 = r1.A02
            java.io.File r7 = (java.io.File) r7
            java.lang.ref.WeakReference r0 = r0.A0D
            java.lang.Object r6 = r0.get()
            X.5pp r6 = (X.C116155pp) r6
            r6.A09 = r2
            r6.A0A = r7
            X.1sp r0 = r6.A05
            r5 = 0
            r4 = 1
            if (r0 != 0) goto L_0x04c3
            int r0 = r6.A00
            X.7IR r3 = new X.7IR
            r3.<init>(r7, r0)
            r1 = 9
            X.6A8 r0 = new X.6A8
            r0.<init>(r6, r1)
            X.1sp r2 = new X.1sp
            r2.<init>(r0)
            r6.A05 = r2
            X.4FS r1 = r6.A0L
            X.7IR[] r0 = new X.AnonymousClass7IR[r4]
            r0[r5] = r3
            r1.BkL(r2, r0)
        L_0x04c3:
            X.1sp r0 = r6.A04
            if (r0 != 0) goto L_0x003c
            r0 = 192(0xc0, float:2.69E-43)
            X.7IR r3 = new X.7IR
            r3.<init>(r7, r0)
            r1 = 10
            X.6A8 r0 = new X.6A8
            r0.<init>(r6, r1)
            X.1sp r2 = new X.1sp
            r2.<init>(r0)
            r6.A04 = r2
            X.4FS r1 = r6.A0L
            X.7IR[] r0 = new X.AnonymousClass7IR[r4]
            r0[r5] = r3
            r1.BkL(r2, r0)
            return
        L_0x04e6:
            java.lang.Object r3 = r1.A00
            X.1mV r3 = (X.C30471mV) r3
            java.lang.Object r2 = r1.A01
            X.5Jy r2 = (X.C102705Jy) r2
            java.lang.Object r4 = r1.A02
            X.33C r0 = r3.A01
            if (r0 == 0) goto L_0x003c
            boolean r6 = r0.A03()
            X.3Wi r0 = r2.A01
            r5 = 24
            X.3cR r1 = new X.3cR
            r1.<init>(r2, r3, r4, r5, r6)
        L_0x0501:
            r0.A0S(r1)
            return
        L_0x0505:
            java.lang.Object r2 = r1.A00
            X.2yL r2 = (X.C60312yL) r2
            java.lang.Object r3 = r1.A01
            java.lang.Object r4 = r1.A02
            X.5mA r0 = r2.A07
            boolean r0 = r0.A0B()
            if (r0 == 0) goto L_0x051b
            boolean r0 = X.C107535bT.A0A()
            if (r0 != 0) goto L_0x003c
        L_0x051b:
            r5 = 5
            java.util.concurrent.ExecutorService r0 = r2.A04
            r6 = 33
            X.3c6 r1 = new X.3c6
            r1.<init>(r2, r3, r4, r5, r6)
            r0.submit(r1)
            return
        L_0x0529:
            java.lang.Object r0 = r1.A00
            X.1uI r0 = (X.C34141uI) r0
            java.lang.Object r5 = r1.A01
            X.7O7 r5 = (X.AnonymousClass7O7) r5
            java.lang.Object r4 = r1.A02
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4
            X.2iL r0 = r0.A04
            java.util.concurrent.atomic.AtomicInteger r0 = r0.A0D
            r0.decrementAndGet()
            X.1sV r2 = r5.A03
            X.34x r3 = r5.A01
            monitor-enter(r2)
            java.lang.String r1 = X.C33141sV.A02(r3)     // Catch:{ all -> 0x108c }
            monitor-enter(r2)     // Catch:{ all -> 0x108c }
            java.util.HashMap r0 = r2.A06     // Catch:{ all -> 0x1089 }
            r0.remove(r1)     // Catch:{ all -> 0x1089 }
            if (r4 == 0) goto L_0x0552
            X.1sU r0 = r2.A02     // Catch:{ all -> 0x1089 }
            r0.A09(r1, r4)     // Catch:{ all -> 0x1089 }
        L_0x0552:
            monitor-exit(r2)     // Catch:{ all -> 0x108c }
            monitor-exit(r2)
            java.lang.Object r2 = r5.A04
            android.view.View r1 = r5.A00
            java.lang.Object r0 = r1.getTag()
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003c
            X.8tp r0 = r5.A02
            r0.Bof(r4, r1, r3)
            return
        L_0x0568:
            java.lang.Object r3 = r1.A00
            X.5ZT r3 = (X.AnonymousClass5ZT) r3
            java.lang.Object r2 = r1.A01
            X.5TQ r2 = (X.AnonymousClass5TQ) r2
            java.lang.Object r1 = r1.A02
            X.8py r1 = (X.C183398py) r1
            java.lang.String r0 = "VoiceNoteRecordingUI/initializeForResume/set voice recorder"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            r3.A0L = r2
            if (r1 == 0) goto L_0x003c
            r1.AyL()
            return
        L_0x0581:
            java.lang.Object r4 = r1.A00
            X.4ao r4 = (X.C88794ao) r4
            java.lang.Object r3 = r1.A01
            android.view.View r3 = (android.view.View) r3
            java.lang.Object r2 = r1.A02
            r0 = 8
            r3.setVisibility(r0)
            X.5ZT r0 = r4.A04
            X.5TQ r0 = r0.A0L
            if (r0 != 0) goto L_0x003c
            r6 = 1
            r7 = 0
            r13 = 1065353216(0x3f800000, float:1.0)
            android.view.animation.TranslateAnimation r5 = new android.view.animation.TranslateAnimation
            r10 = r6
            r11 = r7
            r12 = r6
            r8 = r6
            r9 = r7
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            r1 = 9
            X.67q r0 = new X.67q
            r0.<init>(r2, r1, r4)
            r5.setAnimationListener(r0)
            r0 = 213(0xd5, double:1.05E-321)
            r5.setDuration(r0)
            r3.startAnimation(r5)
            return
        L_0x05b7:
            r3.A01(r4)
            java.util.List r0 = X.C18290x4.A12(r4)
            r3.A05(r5, r0)
            return
        L_0x05c2:
            java.lang.Object r0 = r1.A00
            r36 = r0
            r0 = r36
            X.1gP r0 = (X.AnonymousClass1gP) r0
            r36 = r0
            java.lang.Object r0 = r1.A01
            r35 = r0
            r0 = r35
            X.39T r0 = (X.AnonymousClass39T) r0
            r35 = r0
            java.lang.Object r12 = r1.A02
            X.36K r12 = (X.AnonymousClass36K) r12
            r45 = 0
            java.lang.String r0 = "notification"
            java.lang.String[] r42 = X.AnonymousClass36K.A0Z(r12, r0)     // Catch:{ 24Y -> 0x0934 }
            java.lang.Class<java.lang.String> r38 = java.lang.String.class
            java.lang.String r41 = "psa"
            java.lang.Long r39 = X.AnonymousClass0x2.A0R()     // Catch:{ 24Y -> 0x0934 }
            java.lang.Long r40 = X.AnonymousClass0x2.A0S()     // Catch:{ 24Y -> 0x0934 }
            r43 = 0
            r37 = r12
            X.C626836d.A06(r37, r38, r39, r40, r41, r42, r43)     // Catch:{ 24Y -> 0x0934 }
            java.lang.String[] r46 = X.AnonymousClass0x9.A1b()     // Catch:{ 24Y -> 0x0934 }
            java.lang.Class<com.whatsapp.jid.UserJid> r42 = com.whatsapp.jid.UserJid.class
            r4 = 0
            r41 = r12
            r43 = r39
            r44 = r40
            r47 = r4
            X.C626836d.A06(r41, r42, r43, r44, r45, r46, r47)     // Catch:{ 24Y -> 0x0934 }
            java.lang.String r0 = "banner"
            java.lang.String r34 = "id"
            r1 = r34
            java.lang.String[] r10 = new java.lang.String[]{r0, r1}     // Catch:{ 24Y -> 0x0934 }
            r5 = r12
            r6 = r38
            r7 = r39
            r8 = r40
            r9 = r45
            r11 = r4
            java.lang.Object r33 = X.C626836d.A06(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ 24Y -> 0x0934 }
            r1 = r33
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ 24Y -> 0x0934 }
            r33 = r1
            java.lang.String r2 = "surface"
            r1 = r34
            java.lang.String[] r10 = new java.lang.String[]{r0, r2, r1}     // Catch:{ 24Y -> 0x0934 }
            java.lang.Object r32 = X.C626836d.A06(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ 24Y -> 0x0934 }
            r1 = r32
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ 24Y -> 0x0934 }
            r32 = r1
            java.lang.String r31 = "title"
            java.lang.String r2 = "#elementValue"
            r1 = r31
            java.lang.String[] r10 = new java.lang.String[]{r0, r1, r2}     // Catch:{ 24Y -> 0x0934 }
            java.lang.Object r30 = X.C626836d.A06(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ 24Y -> 0x0934 }
            r1 = r30
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ 24Y -> 0x0934 }
            r30 = r1
            java.lang.String r29 = "text"
            r1 = r29
            java.lang.String[] r10 = new java.lang.String[]{r0, r1, r2}     // Catch:{ 24Y -> 0x0934 }
            java.lang.Object r28 = X.C626836d.A06(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ 24Y -> 0x0934 }
            r1 = r28
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ 24Y -> 0x0934 }
            r28 = r1
            java.lang.String r1 = "description"
            java.lang.String r3 = "icon"
            java.lang.String[] r10 = new java.lang.String[]{r0, r3, r1}     // Catch:{ 24Y -> 0x0934 }
            r27 = 0
            java.lang.Object r26 = X.C626836d.A06(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ 24Y -> 0x0934 }
            r1 = r26
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ 24Y -> 0x0934 }
            r26 = r1
            java.lang.String r1 = "light"
            java.lang.String[] r46 = new java.lang.String[]{r0, r3, r1, r2}     // Catch:{ 24Y -> 0x0934 }
            java.lang.Class<byte[]> r42 = byte[].class
            java.lang.Object r25 = X.C626836d.A06(r41, r42, r43, r44, r45, r46, r47)     // Catch:{ 24Y -> 0x0934 }
            r1 = r25
            byte[] r1 = (byte[]) r1     // Catch:{ 24Y -> 0x0934 }
            r25 = r1
            java.lang.String r1 = "dark"
            java.lang.String[] r46 = new java.lang.String[]{r0, r3, r1, r2}     // Catch:{ 24Y -> 0x0934 }
            java.lang.Object r24 = X.C626836d.A06(r41, r42, r43, r44, r45, r46, r47)     // Catch:{ 24Y -> 0x0934 }
            r1 = r24
            byte[] r1 = (byte[]) r1     // Catch:{ 24Y -> 0x0934 }
            r24 = r1
            java.lang.String r6 = "action"
            r1 = r29
            java.lang.String[] r17 = new java.lang.String[]{r0, r6, r1}     // Catch:{ 24Y -> 0x0934 }
            r13 = r38
            r14 = r7
            r15 = r8
            r16 = r9
            r18 = r4
            java.lang.Object r23 = X.C626836d.A06(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ 24Y -> 0x0934 }
            r1 = r23
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ 24Y -> 0x0934 }
            r23 = r1
            java.lang.String r1 = "universal_link"
            java.lang.String[] r17 = new java.lang.String[]{r0, r6, r1}     // Catch:{ 24Y -> 0x0934 }
            java.lang.Object r22 = X.C626836d.A06(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ 24Y -> 0x0934 }
            r1 = r22
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ 24Y -> 0x0934 }
            r22 = r1
            java.lang.String r1 = "deep_link"
            java.lang.String[] r17 = new java.lang.String[]{r0, r6, r1}     // Catch:{ 24Y -> 0x0934 }
            java.lang.Object r21 = X.C626836d.A06(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ 24Y -> 0x0934 }
            r1 = r21
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ 24Y -> 0x0934 }
            r21 = r1
            java.lang.String r1 = "background"
            java.lang.String r11 = "color"
            java.lang.String[] r17 = new java.lang.String[]{r0, r11, r1}     // Catch:{ 24Y -> 0x0934 }
            X.C626836d.A06(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ 24Y -> 0x0934 }
            java.lang.String r1 = "highlight"
            java.lang.String[] r17 = new java.lang.String[]{r0, r11, r1}     // Catch:{ 24Y -> 0x0934 }
            X.C626836d.A06(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ 24Y -> 0x0934 }
            java.lang.String r2 = "consecutive"
            java.lang.String r1 = "pacing"
            java.lang.String r10 = "duration"
            java.lang.String[] r46 = new java.lang.String[]{r0, r1, r10, r2}     // Catch:{ 24Y -> 0x0934 }
            java.lang.Class<java.lang.Long> r42 = java.lang.Long.class
            java.lang.Object r13 = X.C626836d.A06(r41, r42, r43, r44, r45, r46, r47)     // Catch:{ 24Y -> 0x0934 }
            java.lang.Number r13 = (java.lang.Number) r13     // Catch:{ 24Y -> 0x0934 }
            java.lang.String r5 = "max"
            java.lang.String[] r46 = new java.lang.String[]{r0, r1, r10, r5}     // Catch:{ 24Y -> 0x0934 }
            java.lang.Object r14 = X.C626836d.A06(r41, r42, r43, r44, r45, r46, r47)     // Catch:{ 24Y -> 0x0934 }
            java.lang.Number r14 = (java.lang.Number) r14     // Catch:{ 24Y -> 0x0934 }
            java.lang.String r2 = "interaction"
            java.lang.String r9 = "dismiss"
            java.lang.String r7 = "cooldown"
            java.lang.String[] r46 = new java.lang.String[]{r0, r1, r2, r9, r7}     // Catch:{ 24Y -> 0x0934 }
            java.lang.Object r20 = X.C626836d.A06(r41, r42, r43, r44, r45, r46, r47)     // Catch:{ 24Y -> 0x0934 }
            r3 = r20
            java.lang.Number r3 = (java.lang.Number) r3     // Catch:{ 24Y -> 0x0934 }
            r20 = r3
            java.lang.String[] r46 = new java.lang.String[]{r0, r1, r2, r9, r5}     // Catch:{ 24Y -> 0x0934 }
            java.lang.Object r19 = X.C626836d.A06(r41, r42, r43, r44, r45, r46, r47)     // Catch:{ 24Y -> 0x0934 }
            r3 = r19
            java.lang.Number r3 = (java.lang.Number) r3     // Catch:{ 24Y -> 0x0934 }
            r19 = r3
            java.lang.String r8 = "tap"
            java.lang.String[] r46 = new java.lang.String[]{r0, r1, r2, r8, r7}     // Catch:{ 24Y -> 0x0934 }
            java.lang.Object r18 = X.C626836d.A06(r41, r42, r43, r44, r45, r46, r47)     // Catch:{ 24Y -> 0x0934 }
            r3 = r18
            java.lang.Number r3 = (java.lang.Number) r3     // Catch:{ 24Y -> 0x0934 }
            r18 = r3
            java.lang.String[] r46 = new java.lang.String[]{r0, r1, r2, r8, r5}     // Catch:{ 24Y -> 0x0934 }
            java.lang.Object r17 = X.C626836d.A06(r41, r42, r43, r44, r45, r46, r47)     // Catch:{ 24Y -> 0x0934 }
            r3 = r17
            java.lang.Number r3 = (java.lang.Number) r3     // Catch:{ 24Y -> 0x0934 }
            r17 = r3
            java.lang.String r3 = "impression"
            java.lang.String[] r46 = new java.lang.String[]{r0, r1, r2, r3, r7}     // Catch:{ 24Y -> 0x0934 }
            java.lang.Object r16 = X.C626836d.A06(r41, r42, r43, r44, r45, r46, r47)     // Catch:{ 24Y -> 0x0934 }
            r7 = r16
            java.lang.Number r7 = (java.lang.Number) r7     // Catch:{ 24Y -> 0x0934 }
            r16 = r7
            java.lang.String[] r46 = new java.lang.String[]{r0, r1, r2, r3, r5}     // Catch:{ 24Y -> 0x0934 }
            java.lang.Object r7 = X.C626836d.A06(r41, r42, r43, r44, r45, r46, r47)     // Catch:{ 24Y -> 0x0934 }
            java.lang.Number r7 = (java.lang.Number) r7     // Catch:{ 24Y -> 0x0934 }
            r5 = 12
            X.92a r15 = new X.92a     // Catch:{ 24Y -> 0x0934 }
            r15.<init>(r5)     // Catch:{ 24Y -> 0x0934 }
            java.lang.String[] r5 = new java.lang.String[r4]     // Catch:{ 24Y -> 0x0934 }
            X.C626836d.A04(r12, r15, r5)     // Catch:{ 24Y -> 0x0934 }
            java.lang.String[] r39 = new java.lang.String[]{r0, r6}     // Catch:{ 24Y -> 0x0934 }
            X.6Br r5 = new X.6Br     // Catch:{ 24Y -> 0x0934 }
            r5.<init>(r4)     // Catch:{ 24Y -> 0x0934 }
            r40 = 1
            r38 = r5
            r42 = r40
            java.util.List r5 = X.C626836d.A0B(r37, r38, r39, r40, r42)     // Catch:{ 24Y -> 0x0934 }
            r5.get(r4)     // Catch:{ 24Y -> 0x0934 }
            java.lang.String[] r39 = new java.lang.String[]{r0, r11}     // Catch:{ 24Y -> 0x0934 }
            r6 = 1
            X.6Br r5 = new X.6Br     // Catch:{ 24Y -> 0x0934 }
            r5.<init>(r6)     // Catch:{ 24Y -> 0x0934 }
            r38 = r5
            java.util.List r5 = X.C626836d.A0B(r37, r38, r39, r40, r42)     // Catch:{ 24Y -> 0x0934 }
            r5.get(r4)     // Catch:{ 24Y -> 0x0934 }
            java.lang.String[] r39 = new java.lang.String[]{r0, r1, r10}     // Catch:{ 24Y -> 0x0934 }
            r5 = 2
            X.6Br r6 = new X.6Br     // Catch:{ 24Y -> 0x0934 }
            r6.<init>(r5)     // Catch:{ 24Y -> 0x0934 }
            r38 = r6
            java.util.List r6 = X.C626836d.A0B(r37, r38, r39, r40, r42)     // Catch:{ 24Y -> 0x0934 }
            r6.get(r4)     // Catch:{ 24Y -> 0x0934 }
            java.lang.String[] r39 = new java.lang.String[]{r0, r1, r2, r9}     // Catch:{ 24Y -> 0x0934 }
            r9 = 3
            X.6Br r6 = new X.6Br     // Catch:{ 24Y -> 0x0934 }
            r6.<init>(r9)     // Catch:{ 24Y -> 0x0934 }
            r38 = r6
            java.util.List r6 = X.C626836d.A0B(r37, r38, r39, r40, r42)     // Catch:{ 24Y -> 0x0934 }
            r6.get(r4)     // Catch:{ 24Y -> 0x0934 }
            java.lang.String[] r39 = new java.lang.String[]{r0, r1, r2, r3}     // Catch:{ 24Y -> 0x0934 }
            r6 = 4
            X.6Br r3 = new X.6Br     // Catch:{ 24Y -> 0x0934 }
            r3.<init>(r6)     // Catch:{ 24Y -> 0x0934 }
            r38 = r3
            java.util.List r3 = X.C626836d.A0B(r37, r38, r39, r40, r42)     // Catch:{ 24Y -> 0x0934 }
            r3.get(r4)     // Catch:{ 24Y -> 0x0934 }
            java.lang.String[] r39 = new java.lang.String[]{r0, r1, r2, r8}     // Catch:{ 24Y -> 0x0934 }
            r1 = 5
            X.6Br r0 = new X.6Br     // Catch:{ 24Y -> 0x0934 }
            r0.<init>(r1)     // Catch:{ 24Y -> 0x0934 }
            r38 = r0
            java.util.List r0 = X.C626836d.A0B(r37, r38, r39, r40, r42)     // Catch:{ 24Y -> 0x0934 }
            r0.get(r4)     // Catch:{ 24Y -> 0x0934 }
            byte[] r44 = r30.getBytes()     // Catch:{ NumberFormatException -> 0x0920 }
            byte[] r45 = r28.getBytes()     // Catch:{ NumberFormatException -> 0x0920 }
            long r48 = r13.longValue()     // Catch:{ NumberFormatException -> 0x0920 }
            long r50 = r14.longValue()     // Catch:{ NumberFormatException -> 0x0920 }
            long r52 = r20.longValue()     // Catch:{ NumberFormatException -> 0x0920 }
            long r54 = r19.longValue()     // Catch:{ NumberFormatException -> 0x0920 }
            long r56 = r18.longValue()     // Catch:{ NumberFormatException -> 0x0920 }
            long r58 = r17.longValue()     // Catch:{ NumberFormatException -> 0x0920 }
            long r60 = r16.longValue()     // Catch:{ NumberFormatException -> 0x0920 }
            long r62 = r7.longValue()     // Catch:{ NumberFormatException -> 0x0920 }
            X.2UF r0 = new X.2UF     // Catch:{ NumberFormatException -> 0x0920 }
            r38 = r33
            r39 = r23
            r40 = r22
            r41 = r21
            r42 = r32
            r43 = r26
            r46 = r25
            r47 = r24
            r37 = r0
            r37.<init>(r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r50, r52, r54, r56, r58, r60, r62)     // Catch:{ NumberFormatException -> 0x0920 }
            r1 = r36
            X.2Ox r3 = r1.A0C     // Catch:{ 24Y -> 0x0934 }
            monitor-enter(r3)     // Catch:{ 24Y -> 0x0934 }
            X.2Hy r4 = r3.A02     // Catch:{ all -> 0x0931 }
            monitor-enter(r4)     // Catch:{ all -> 0x0931 }
            org.json.JSONObject r2 = X.AnonymousClass0x9.A1G()     // Catch:{ all -> 0x091d }
            java.lang.String r6 = r0.A0C     // Catch:{ JSONException -> 0x08f9 }
            r1 = r34
            r2.put(r1, r6)     // Catch:{ JSONException -> 0x08f9 }
            java.lang.String r6 = "action_text"
            java.lang.String r1 = r0.A09     // Catch:{ JSONException -> 0x08f9 }
            r2.put(r6, r1)     // Catch:{ JSONException -> 0x08f9 }
            java.lang.String r6 = "action_universal_link"
            java.lang.String r1 = r0.A0A     // Catch:{ JSONException -> 0x08f9 }
            r2.put(r6, r1)     // Catch:{ JSONException -> 0x08f9 }
            java.lang.String r6 = "action_deep_link"
            java.lang.String r1 = r0.A08     // Catch:{ JSONException -> 0x08f9 }
            r2.put(r6, r1)     // Catch:{ JSONException -> 0x08f9 }
            java.lang.String r6 = "surface_id"
            java.lang.String r1 = r0.A0D     // Catch:{ JSONException -> 0x08f9 }
            r2.put(r6, r1)     // Catch:{ JSONException -> 0x08f9 }
            byte[] r1 = r0.A0H     // Catch:{ JSONException -> 0x08f9 }
            java.lang.String r6 = android.util.Base64.encodeToString(r1, r5)     // Catch:{ JSONException -> 0x08f9 }
            r1 = r31
            r2.put(r1, r6)     // Catch:{ JSONException -> 0x08f9 }
            byte[] r1 = r0.A0G     // Catch:{ JSONException -> 0x08f9 }
            java.lang.String r6 = android.util.Base64.encodeToString(r1, r5)     // Catch:{ JSONException -> 0x08f9 }
            r1 = r29
            r2.put(r1, r6)     // Catch:{ JSONException -> 0x08f9 }
            java.lang.String r6 = "icon_light"
            byte[] r1 = r0.A0F     // Catch:{ JSONException -> 0x08f9 }
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r5)     // Catch:{ JSONException -> 0x08f9 }
            r2.put(r6, r1)     // Catch:{ JSONException -> 0x08f9 }
            java.lang.String r6 = "icon_dark"
            byte[] r1 = r0.A0E     // Catch:{ JSONException -> 0x08f9 }
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r5)     // Catch:{ JSONException -> 0x08f9 }
            r2.put(r6, r1)     // Catch:{ JSONException -> 0x08f9 }
            java.lang.String r5 = "icon_description"
            java.lang.String r1 = r0.A0B     // Catch:{ JSONException -> 0x08f9 }
            r2.put(r5, r1)     // Catch:{ JSONException -> 0x08f9 }
            java.lang.String r1 = "pacing_duration_consecutive"
            long r5 = r0.A00     // Catch:{ JSONException -> 0x08f9 }
            r2.put(r1, r5)     // Catch:{ JSONException -> 0x08f9 }
            java.lang.String r1 = "pacing_duration_max"
            long r5 = r0.A01     // Catch:{ JSONException -> 0x08f9 }
            r2.put(r1, r5)     // Catch:{ JSONException -> 0x08f9 }
            java.lang.String r1 = "pacing_interaction_dismiss_cooldown"
            long r5 = r0.A02     // Catch:{ JSONException -> 0x08f9 }
            r2.put(r1, r5)     // Catch:{ JSONException -> 0x08f9 }
            java.lang.String r1 = "pacing_interaction_dismiss_max"
            long r5 = r0.A03     // Catch:{ JSONException -> 0x08f9 }
            r2.put(r1, r5)     // Catch:{ JSONException -> 0x08f9 }
            java.lang.String r1 = "pacing_interaction_tap_cooldown"
            long r5 = r0.A06     // Catch:{ JSONException -> 0x08f9 }
            r2.put(r1, r5)     // Catch:{ JSONException -> 0x08f9 }
            java.lang.String r1 = "pacing_interaction_tap_max"
            long r5 = r0.A07     // Catch:{ JSONException -> 0x08f9 }
            r2.put(r1, r5)     // Catch:{ JSONException -> 0x08f9 }
            java.lang.String r1 = "pacing_interaction_impression_cooldown"
            long r5 = r0.A04     // Catch:{ JSONException -> 0x08f9 }
            r2.put(r1, r5)     // Catch:{ JSONException -> 0x08f9 }
            java.lang.String r5 = "pacing_interaction_impression_max"
            long r0 = r0.A05     // Catch:{ JSONException -> 0x08f9 }
            r2.put(r5, r0)     // Catch:{ JSONException -> 0x08f9 }
            java.lang.String r1 = "state_tap_count"
            r0 = r27
            r2.put(r1, r0)     // Catch:{ JSONException -> 0x08f9 }
            java.lang.String r1 = "state_dismiss_count"
            r2.put(r1, r0)     // Catch:{ JSONException -> 0x08f9 }
            java.lang.String r1 = "state_impression_count"
            r2.put(r1, r0)     // Catch:{ JSONException -> 0x08f9 }
            java.lang.String r0 = "state_first_impression_timestamp"
            r5 = 0
            r2.put(r0, r5)     // Catch:{ JSONException -> 0x08f9 }
            java.lang.String r0 = "state_latest_impression_timestamp"
            r2.put(r0, r5)     // Catch:{ JSONException -> 0x08f9 }
            java.lang.String r0 = "state_total_impression_time"
            r2.put(r0, r5)     // Catch:{ JSONException -> 0x08f9 }
            java.lang.String r0 = "state_latest_dismiss_timestamp"
            r2.put(r0, r5)     // Catch:{ JSONException -> 0x08f9 }
            java.lang.String r0 = "state_latest_tap_timestamp"
            r2.put(r0, r5)     // Catch:{ JSONException -> 0x08f9 }
            goto L_0x08ff
        L_0x08f9:
            r1 = move-exception
            java.lang.String r0 = "InAppBannerRepository/Error converting banner to json."
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x091d }
        L_0x08ff:
            java.lang.String r0 = "InAppBannerRepository/Successfully converted InAppBannerConfig to JSON"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x091d }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x091d }
            android.content.SharedPreferences r0 = r4.A00     // Catch:{ all -> 0x091d }
            android.content.SharedPreferences$Editor r1 = r0.edit()     // Catch:{ all -> 0x091d }
            java.lang.String r0 = "in_app_banners_key"
            X.C18270x1.A0j(r1, r0, r2)     // Catch:{ all -> 0x091d }
            monitor-exit(r4)     // Catch:{ all -> 0x0931 }
            monitor-exit(r3)     // Catch:{ 24Y -> 0x0934 }
            r1 = r35
            r0 = r36
            r0.A03(r1)     // Catch:{ 24Y -> 0x0934 }
            return
        L_0x091d:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0931 }
            throw r0     // Catch:{ all -> 0x0931 }
        L_0x0920:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 24Y -> 0x0934 }
            java.lang.String r0 = "PSANotificationHandler/InAppBanner corrupted cooldowns: "
            X.C18260x0.A1Q(r1, r0, r2)     // Catch:{ 24Y -> 0x0934 }
            java.lang.String r0 = "Corrupted inAppBannerConfig"
            X.24Y r0 = X.AnonymousClass24Y.A01(r0)     // Catch:{ 24Y -> 0x0934 }
            goto L_0x0933
        L_0x0931:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ 24Y -> 0x0934 }
        L_0x0933:
            throw r0     // Catch:{ 24Y -> 0x0934 }
        L_0x0934:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "PSANotificationHandler/InAppBanner corrupted banner: "
            X.C18260x0.A1Q(r1, r0, r2)
            r1 = r35
            r0 = r36
            r0.A04(r1)
            return
        L_0x0946:
            java.lang.Object r3 = r1.A00
            X.5a4 r3 = (X.C106735a4) r3
            java.lang.Object r2 = r1.A01
            X.0Wx r2 = (X.C06270Wx) r2
            java.lang.Object r1 = r1.A02
            X.0sC r1 = (X.C15930sC) r1
            r0 = 0
            r3.A0A = r0
            r2.A0F(r1)
            return
        L_0x0959:
            java.lang.Object r3 = r1.A00
            X.5a4 r3 = (X.C106735a4) r3
            java.lang.Object r2 = r1.A01
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            java.lang.Object r0 = r1.A02
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            X.C106735a4.A02(r3, r2, r0)
            return
        L_0x0969:
            java.lang.Object r6 = r1.A00
            com.whatsapp.registration.VerifyEmail r6 = (com.whatsapp.registration.VerifyEmail) r6
            java.lang.Object r5 = r1.A01
            java.lang.Long r5 = (java.lang.Long) r5
            java.lang.Object r7 = r1.A02
            java.lang.Integer r7 = (java.lang.Integer) r7
            r0 = 3
            X.C621433s.A00(r6, r0)
            if (r5 == 0) goto L_0x09be
            r3 = 0
            long r1 = r5.longValue()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x09be
            com.whatsapp.WaTextView r4 = r6.A05
            java.lang.String r3 = "resendCodeText"
            if (r4 != 0) goto L_0x0991
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r3)
            throw r0
        L_0x0991:
            r0 = 0
            r4.setClickable(r0)
            com.whatsapp.WaTextView r4 = r6.A05
            if (r4 != 0) goto L_0x099e
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r3)
            throw r0
        L_0x099e:
            android.content.res.Resources r3 = r6.getResources()
            r0 = 2131099873(0x7f0600e1, float:1.7812111E38)
            X.C18320x8.A11(r3, r4, r0)
            X.3Wh r4 = r6.A75()
            r0 = 8
            X.3cH r3 = new X.3cH
            r3.<init>((java.lang.Object) r6, (int) r0)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            long r1 = r0.toMillis(r1)
            android.os.Handler r0 = r4.A00
            r0.postDelayed(r3, r1)
        L_0x09be:
            com.whatsapp.registration.VerifyEmail.A0C(r6, r7, r5)
            X.2eI r3 = r6.A74()
            java.lang.String r2 = r6.A0H
            int r1 = r6.A00
            r0 = 26
            goto L_0x09ff
        L_0x09cc:
            java.lang.Object r6 = r1.A00
            com.whatsapp.registration.VerifyEmail r6 = (com.whatsapp.registration.VerifyEmail) r6
            java.lang.Object r5 = r1.A01
            java.lang.Long r5 = (java.lang.Long) r5
            java.lang.Object r4 = r1.A02
            java.lang.Integer r4 = (java.lang.Integer) r4
            r0 = 2
            X.C621433s.A00(r6, r0)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            long r0 = X.AnonymousClass0x2.A0D(r5)
            long r2 = r2.toMillis(r0)
            X.2sH r0 = r6.A06
            long r0 = r0.A0H()
            long r2 = r2 + r0
            r6.A01 = r2
            com.whatsapp.registration.VerifyEmail.A0L(r6, r5)
            com.whatsapp.registration.VerifyEmail.A0C(r6, r4, r5)
            X.2eI r3 = r6.A74()
            java.lang.String r2 = r6.A0H
            int r1 = r6.A00
            r0 = 15
        L_0x09ff:
            r3.A01(r2, r1, r0)
            return
        L_0x0a03:
            java.lang.Object r0 = r1.A00
            X.2mq r0 = (X.C53282mq) r0
            java.lang.Object r2 = r1.A01
            android.content.Intent r2 = (android.content.Intent) r2
            java.lang.Object r8 = r1.A02
            android.os.Bundle r8 = (android.os.Bundle) r8
            X.2oU r0 = r0.A00
            android.content.Context r1 = r0.A00
            java.lang.String r3 = "com.whatsapp.permission.REGISTRATION"
            X.0xW r4 = new X.0xW
            r4.<init>()
            r5 = 0
            r6 = 1
            r7 = r5
            r1.sendOrderedBroadcast(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0a21:
            java.lang.Object r2 = r1.A00
            X.55p r2 = (X.C994055p) r2
            java.lang.Object r4 = r1.A01
            X.8t9 r4 = (X.C185138t9) r4
            java.lang.Object r3 = r1.A02
            X.0PJ r3 = (X.AnonymousClass0PJ) r3
            boolean r0 = r2.A0G
            java.lang.String r2 = r2.A0C
            r4.BFe(r0, r2)
            java.lang.Object r1 = r3.A00
            X.C626936e.A06(r1)
            X.58p r1 = (X.C998958p) r1
            java.lang.Object r0 = r3.A01
            X.5do r0 = (X.C108935do) r0
            r4.BPK(r1, r0, r2)
            return
        L_0x0a43:
            java.lang.Object r5 = r1.A00
            X.30F r5 = (X.AnonymousClass30F) r5
            java.lang.Object r9 = r1.A01
            X.4uZ r9 = (X.C95814uZ) r9
            java.lang.Object r4 = r1.A02
            long r2 = java.lang.System.currentTimeMillis()
            X.2qK r6 = r5.A08
            r7 = 900000(0xdbba0, double:4.44659E-318)
            long r0 = r2 - r7
            r7 = 4
            java.lang.String[] r8 = new java.lang.String[r7]
            X.2sm r7 = r6.A03
            X.C56922sm.A01(r7, r9, r8)
            r9 = 1
            java.lang.String r7 = java.lang.String.valueOf(r9)
            r8[r9] = r7
            r7 = 2
            X.AnonymousClass0x2.A1S(r8, r7, r0)
            r0 = 3
            X.AnonymousClass0x2.A1S(r8, r0, r2)
            X.3dV r0 = r6.A05
            X.4GK r3 = r0.get()
            r0 = r3
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0ab2 }
            X.2sg r2 = r0.A03     // Catch:{ all -> 0x0ab2 }
            java.lang.String r1 = " SELECT creation_message_row_id, key_id, key_from_me, key_chat_row_id, call_type, scheduled_timestamp, call_title, creator_jid_row_id, is_upcoming, call_log_row_id FROM scheduled_calls WHERE key_chat_row_id = ?  AND is_upcoming = ?  AND scheduled_timestamp > ?  AND scheduled_timestamp <= ?  ORDER BY scheduled_timestamp DESC  LIMIT 1"
            java.lang.String r0 = "SELECT_LATEST_SCHEDULED_CALL_IN_TIMERANGE_IN_CHAT"
            android.database.Cursor r2 = r2.A0E(r1, r0, r8)     // Catch:{ all -> 0x0ab2 }
            boolean r0 = r2.moveToFirst()     // Catch:{ all -> 0x0aa6 }
            if (r0 != 0) goto L_0x0a8c
            r2.close()     // Catch:{ all -> 0x0ab2 }
            goto L_0x0a97
        L_0x0a8c:
            X.2i6 r1 = r6.A01(r2)     // Catch:{ all -> 0x0aa6 }
            r2.close()     // Catch:{ all -> 0x0ab2 }
            r3.close()
            goto L_0x0a9b
        L_0x0a97:
            r3.close()
            r1 = 0
        L_0x0a9b:
            X.3Wi r3 = r5.A00
            r0 = 27
            X.3a1 r2 = new X.3a1
            r2.<init>(r4, r0, r1)
            goto L_0x0c90
        L_0x0aa6:
            r1 = move-exception
            if (r2 == 0) goto L_0x0ab1
            r2.close()     // Catch:{ all -> 0x0aad }
            goto L_0x0ab1
        L_0x0aad:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0ab2 }
        L_0x0ab1:
            throw r1     // Catch:{ all -> 0x0ab2 }
        L_0x0ab2:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0ab7 }
            throw r1
        L_0x0ab7:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x0abc:
            java.lang.Object r0 = r1.A00
            X.0eF r0 = (X.C08310eF) r0
            java.lang.Object r4 = r1.A01
            android.view.View r4 = (android.view.View) r4
            java.lang.Object r3 = r1.A02
            android.view.View r3 = (android.view.View) r3
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r4.getGlobalVisibleRect(r2)
            android.content.res.Resources r1 = X.C08310eF.A09(r0)
            r0 = 2131168319(0x7f070c3f, float:1.7950936E38)
            int r0 = r1.getDimensionPixelOffset(r0)
            int r0 = -r0
            r2.inset(r0, r0)
            android.view.TouchDelegate r0 = new android.view.TouchDelegate
            r0.<init>(r2, r4)
            r3.setTouchDelegate(r0)
            return
        L_0x0ae8:
            java.lang.Object r6 = r1.A00
            X.5JV r6 = (X.AnonymousClass5JV) r6
            java.lang.Object r5 = r1.A01
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r4 = r1.A02
            X.2Ue r4 = (X.C43972Ue) r4
            java.util.Iterator r3 = r5.iterator()
        L_0x0af8:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0b11
            java.lang.Object r2 = r3.next()
            X.2iT r2 = (X.C50612iT) r2
            X.2MF r0 = r6.A01
            java.lang.String r1 = r2.A0G
            java.util.Map r0 = r0.A01
            boolean r0 = r0.containsKey(r1)
            r2.A06 = r0
            goto L_0x0af8
        L_0x0b11:
            r4.A00(r5)
            return
        L_0x0b15:
            java.lang.Object r3 = r1.A00
            X.6oT r3 = (X.C137306oT) r3
            java.lang.Object r2 = r1.A01
            X.39M r2 = (X.AnonymousClass39M) r2
            java.lang.Object r1 = r1.A02
            X.39M r1 = (X.AnonymousClass39M) r1
            X.6pT r0 = r3.A0L
            r0.A05(r2)
            X.6pR r0 = r3.A0M
            r0.A05(r1)
            return
        L_0x0b2c:
            java.lang.Object r3 = r1.A00
            com.whatsapp.support.faq.SearchFAQ r3 = (com.whatsapp.support.faq.SearchFAQ) r3
            java.lang.Object r2 = r1.A01
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.lang.Object r4 = r1.A02
            android.os.Bundle r4 = (android.os.Bundle) r4
            if (r2 == 0) goto L_0x0b4a
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0b4a
            r1 = 1
            r0 = 3
            android.content.Intent r0 = X.C627736r.A0K(r3, r4, r2, r1, r0)
        L_0x0b46:
            r3.startActivity(r0)
            return
        L_0x0b4a:
            X.5WY r2 = r3.A01
            X.2mi r0 = r3.A03
            boolean r11 = r0.A00()
            java.lang.String r7 = r3.A06
            r5 = 0
            r8 = r5
            r9 = r5
            r10 = r5
            r6 = r5
            android.content.Intent r0 = r2.A00(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            goto L_0x0b46
        L_0x0b5e:
            java.lang.Object r4 = r1.A00
            com.whatsapp.textstatus.AddTextStatusActivity r4 = (com.whatsapp.textstatus.AddTextStatusActivity) r4
            java.lang.Object r8 = r1.A01
            X.3Yw r8 = (X.C69883Yw) r8
            java.lang.Object r1 = r1.A02
            r9 = 0
            r7 = 1
            java.lang.String r10 = "null"
            java.io.File r0 = r4.getFilesDir()
            java.lang.String r2 = "customTSValues"
            boolean r0 = X.C18300x5.A1V(r0, r2)
            r12 = 0
            if (r0 == 0) goto L_0x0c14
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            java.io.FileInputStream r0 = r4.openFileInput(r2)     // Catch:{ Exception -> 0x0be8 }
            java.io.ObjectInputStream r6 = new java.io.ObjectInputStream     // Catch:{ Exception -> 0x0be8 }
            r6.<init>(r0)     // Catch:{ Exception -> 0x0be8 }
            java.lang.Object r5 = r6.readObject()     // Catch:{ all -> 0x0be1 }
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.String"
            X.C162457s7.A0K(r5, r0)     // Catch:{ all -> 0x0be1 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x0be1 }
            java.lang.String r2 = "\n"
            X.5rB r0 = new X.5rB     // Catch:{ all -> 0x0be1 }
            r0.<init>((java.lang.String) r2)     // Catch:{ all -> 0x0be1 }
            java.util.List r0 = r0.A01(r5, r9)     // Catch:{ all -> 0x0be1 }
            r8 = 2
            java.util.List r0 = X.C73723fy.A0I(r0, r8)     // Catch:{ all -> 0x0be1 }
            java.util.Iterator r11 = r0.iterator()     // Catch:{ all -> 0x0be1 }
        L_0x0ba7:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x0be1 }
            if (r0 == 0) goto L_0x0bdd
            java.lang.Object r5 = r11.next()     // Catch:{ all -> 0x0be1 }
            java.util.List r5 = (java.util.List) r5     // Catch:{ all -> 0x0be1 }
            int r0 = r5.size()     // Catch:{ all -> 0x0be1 }
            if (r0 != r8) goto L_0x0ba7
            java.lang.Object r0 = r5.get(r9)     // Catch:{ all -> 0x0be1 }
            boolean r0 = X.C162457s7.A0P(r0, r10)     // Catch:{ all -> 0x0be1 }
            if (r0 != 0) goto L_0x0bdb
            java.lang.String r2 = X.AnonymousClass001.A0n(r5, r9)     // Catch:{ all -> 0x0be1 }
        L_0x0bc7:
            java.lang.Object r0 = r5.get(r7)     // Catch:{ all -> 0x0be1 }
            boolean r0 = X.C162457s7.A0P(r0, r10)     // Catch:{ all -> 0x0be1 }
            if (r0 != 0) goto L_0x0bd9
            java.lang.String r0 = X.AnonymousClass001.A0n(r5, r7)     // Catch:{ all -> 0x0be1 }
        L_0x0bd5:
            X.AnonymousClass3Z6.A03(r2, r0, r3)     // Catch:{ all -> 0x0be1 }
            goto L_0x0ba7
        L_0x0bd9:
            r0 = r12
            goto L_0x0bd5
        L_0x0bdb:
            r2 = r12
            goto L_0x0bc7
        L_0x0bdd:
            r6.close()     // Catch:{ Exception -> 0x0be8 }
            goto L_0x0bee
        L_0x0be1:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0be3 }
        L_0x0be3:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r6, r2)     // Catch:{ Exception -> 0x0be8 }
            throw r0     // Catch:{ Exception -> 0x0be8 }
        L_0x0be8:
            r2 = move-exception
            java.lang.String r0 = "GetCustomValues/serialization_error"
            com.whatsapp.util.Log.w(r0, r2)
        L_0x0bee:
            java.util.Iterator r3 = r3.iterator()
        L_0x0bf2:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0c87
            java.lang.Object r2 = r3.next()
            X.3Z6 r2 = (X.AnonymousClass3Z6) r2
            java.util.List r0 = r4.A0L
            java.lang.Object r8 = r2.second
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r11 = r2.first
            java.lang.String r11 = (java.lang.String) r11
            r6 = 0
            X.2mD r5 = new X.2mD
            r9 = r6
            r5.<init>(r6, r8, r9, r11)
            r0.add(r5)
            goto L_0x0bf2
        L_0x0c14:
            android.content.res.Resources r2 = r4.getResources()
            r0 = 2130903079(0x7f030027, float:1.7412966E38)
            android.content.res.TypedArray r6 = r2.obtainTypedArray(r0)
            X.C162457s7.A0D(r6)
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x0c94 }
            int r3 = r6.length()     // Catch:{ all -> 0x0c94 }
            r2 = 0
        L_0x0c2b:
            if (r2 >= r3) goto L_0x0c39
            java.lang.String r0 = r6.getString(r2)     // Catch:{ all -> 0x0c94 }
            if (r0 == 0) goto L_0x0c36
            r5.add(r0)     // Catch:{ all -> 0x0c94 }
        L_0x0c36:
            int r2 = r2 + 1
            goto L_0x0c2b
        L_0x0c39:
            r6.recycle()
            java.util.Iterator r11 = r5.iterator()
        L_0x0c40:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0c87
            java.lang.String r15 = X.AnonymousClass001.A0m(r11)
            int[] r5 = new int[r7]
            int[] r3 = X.C100805Ci.A00
            int r2 = r8.element
            int r0 = r2 + 1
            r8.element = r0
            r0 = r3[r2]
            r5[r9] = r0
            X.4qr r0 = new X.4qr
            r0.<init>(r5)
            java.lang.StringBuilder r10 = X.AnonymousClass001.A0o()
            int[] r6 = r0.A01
            int r5 = r6.length
            r3 = 0
        L_0x0c65:
            if (r3 >= r5) goto L_0x0c74
            r2 = r6[r3]
            r0 = 65039(0xfe0f, float:9.1139E-41)
            if (r2 == r0) goto L_0x0c71
            r10.appendCodePoint(r2)
        L_0x0c71:
            int r3 = r3 + 1
            goto L_0x0c65
        L_0x0c74:
            java.lang.String r18 = X.C18290x4.A0o(r10)
            java.util.List r0 = r4.A0L
            r13 = 0
            X.2mD r12 = new X.2mD
            r16 = r13
            r12.<init>(r13, r15, r16, r18)
            r0.add(r12)
            goto L_0x0c40
        L_0x0c87:
            X.3Wi r3 = r4.A05
            r0 = 37
            X.3cK r2 = new X.3cK
            r2.<init>(r4, r0, r1)
        L_0x0c90:
            r3.A0S(r2)
            return
        L_0x0c94:
            r1 = move-exception
            r6.recycle()
            throw r1
        L_0x0c99:
            java.lang.Object r5 = r1.A00
            X.3Wa r5 = (X.C69183Wa) r5
            java.lang.Object r4 = r1.A01
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r3 = r1.A02
            java.util.List r3 = (java.util.List) r3
            X.31C r2 = r5.A06
            X.1ip r1 = r5.A03
            X.5I2 r0 = new X.5I2
            r0.<init>(r5, r4)
            X.3Sy r9 = new X.3Sy
            r9.<init>(r1, r2, r0, r3)
            X.1ip r0 = r9.A00
            boolean r0 = r0.A0F()
            if (r0 != 0) goto L_0x0cc5
            X.5I2 r0 = r9.A02
            X.3Wa r0 = r0.A00
            X.2zM r0 = r0.A0A
            r0.A02()
            return
        L_0x0cc5:
            X.31C r8 = r9.A01
            java.lang.String r11 = r8.A03()
            r12 = 290(0x122, float:4.06E-43)
            java.util.List r0 = r9.A03
            java.util.ArrayList r3 = X.C73783g4.A0c(r0)
            java.util.Iterator r2 = r0.iterator()
        L_0x0cd7:
            boolean r0 = r2.hasNext()
            java.lang.String r7 = "id"
            r6 = 1
            r5 = 0
            if (r0 == 0) goto L_0x0cf1
            java.lang.String r0 = X.AnonymousClass001.A0m(r2)
            X.39V[] r1 = new X.AnonymousClass39V[r6]
            X.AnonymousClass39V.A0B(r7, r0, r1, r5)
            java.lang.String r0 = "notice"
            X.AnonymousClass36K.A0R(r0, r3, r1)
            goto L_0x0cd7
        L_0x0cf1:
            X.39V[] r2 = new X.AnonymousClass39V[r6]
            java.lang.String r0 = "session_update"
            java.lang.String r4 = "type"
            X.AnonymousClass39V.A0B(r4, r0, r2, r5)
            X.36K[] r1 = X.C18280x3.A1a(r3, r5)
            java.lang.String r0 = "request"
            X.36K r3 = X.AnonymousClass36K.A0J(r0, r2, r1)
            X.39V[] r2 = X.AnonymousClass0x9.A1W()
            X.AnonymousClass39V.A0E(r2, r5)
            X.AnonymousClass39V.A0B(r7, r11, r2, r6)
            java.lang.String r1 = "xmlns"
            java.lang.String r0 = "tos"
            X.AnonymousClass39V.A06(r1, r0, r2)
            java.lang.String r0 = "set"
            X.36K r10 = X.AnonymousClass36K.A0E(r3, r4, r0, r2)
            r13 = 32000(0x7d00, double:1.581E-319)
            r8.A0E(r9, r10, r11, r12, r13)
            return
        L_0x0d27:
            java.lang.Object r4 = r1.A00
            X.2na r4 = (X.C53742na) r4
            java.lang.Object r3 = r1.A01
            X.3Ot r3 = (X.C67303Ot) r3
            java.lang.Object r2 = r1.A02
            X.4Dh r2 = (X.C84684Dh) r2
            X.1ip r0 = r4.A02
            boolean r0 = r0.A0F()
            if (r0 == 0) goto L_0x0d45
            r1 = 4
            X.4Kd r0 = new X.4Kd
            r0.<init>(r2, r1, r4)
            r3.Bh4(r0)
            return
        L_0x0d45:
            java.lang.Integer r0 = X.AnonymousClass001.A0f()
            r2.BSq(r0)
            return
        L_0x0d4d:
            java.lang.Object r2 = r1.A00
            X.1uQ r2 = (X.C34221uQ) r2
            java.lang.Object r1 = r1.A02
            java.io.File r1 = (java.io.File) r1
            r0 = 0
            X.C162457s7.A0J(r2, r0)
            long r0 = X.C989053r.A01(r1)
            r2.A00 = r0
            return
        L_0x0d60:
            java.lang.Object r6 = r1.A00
            X.5TM r6 = (X.AnonymousClass5TM) r6
            java.lang.Object r5 = r1.A01
            X.5NV r5 = (X.AnonymousClass5NV) r5
            java.lang.Object r3 = r1.A02
            android.content.Context r3 = (android.content.Context) r3
            r4 = 0
            java.util.HashMap r2 = X.AnonymousClass001.A0t()
            X.8LG r1 = r5.A00()
            X.8vg r0 = X.C186628vg.A00
            X.7l9 r3 = X.C159117l9.A00(r3, r1, r0, r2)
            r6.A04 = r3
            X.5hH r2 = new X.5hH
            r2.<init>(r6)
            X.8LG r1 = r5.A00()
            X.7t6 r0 = new X.7t6
            r0.<init>(r2, r3, r1)
            r6.A02 = r0
            r0.A0K(r4)
            android.view.TextureView r1 = r6.A0A
            X.7zC r0 = new X.7zC
            r0.<init>(r6)
            r1.setSurfaceTextureListener(r0)
            return
        L_0x0d9b:
            java.lang.Object r0 = r1.A00
            X.6BH r0 = (X.AnonymousClass6BH) r0
            java.lang.Object r3 = r1.A01
            java.util.Collection r3 = (java.util.Collection) r3
            java.lang.Object r2 = r1.A02
            X.5ZQ r2 = (X.AnonymousClass5ZQ) r2
            java.lang.Object r1 = r0.A00
            X.5qb r1 = (X.C116635qb) r1
            java.util.List r0 = r1.A0L
            r0.clear()
            r0.addAll(r3)
            r1.A03(r2, r0)
            return
        L_0x0db7:
            java.lang.Object r3 = r1.A00
            com.whatsapp.voipcalling.camera.VoipPhysicalCamera r3 = (com.whatsapp.voipcalling.camera.VoipPhysicalCamera) r3
            java.lang.Object r2 = r1.A01
            java.util.concurrent.Exchanger r2 = (java.util.concurrent.Exchanger) r2
            java.lang.Object r0 = r1.A02
            java.util.concurrent.Callable r0 = (java.util.concurrent.Callable) r0
            com.whatsapp.voipcalling.camera.VoipPhysicalCamera.$r8$lambda$_CnR6mdFp5FMdyFQSTj2kjOqrv8(r3, r2, r0)
            return
        L_0x0dc7:
            java.lang.Object r5 = r1.A00
            X.4DK r5 = (X.AnonymousClass4DK) r5
            java.lang.Object r6 = r1.A02
            java.util.Map r6 = (java.util.Map) r6
            r7 = 0
            X.C162457s7.A0J(r5, r7)
            r2 = 0
            if (r6 == 0) goto L_0x0e25
            java.lang.String r0 = "data"
            java.lang.Object r1 = r6.get(r0)
        L_0x0ddc:
            boolean r0 = r1 instanceof java.util.Map
            if (r0 == 0) goto L_0x0dea
            java.util.Map r1 = (java.util.Map) r1
            if (r1 == 0) goto L_0x0dea
            java.lang.String r0 = "error_message"
            java.lang.Object r2 = r1.get(r0)
        L_0x0dea:
            boolean r0 = r2 instanceof java.lang.String
            if (r0 == 0) goto L_0x0e21
            if (r2 == 0) goto L_0x0e21
            X.21y r0 = X.C373621y.ERROR
            java.lang.String r4 = r0.key
            r0 = 2
            X.3Z6[] r3 = new X.AnonymousClass3Z6[r0]
            X.21y r0 = X.C373621y.ERROR_MESSAGE
            java.lang.String r0 = r0.key
            X.AnonymousClass3Z6.A09(r0, r2, r3, r7)
            X.21y r0 = X.C373621y.ERROR_PARAMS
            java.lang.String r2 = r0.key
            java.lang.String r1 = "is_data_channel_error"
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            java.util.Map r0 = X.C57692u3.A04(r1, r0)
            X.AnonymousClass3Z6.A05(r2, r0, r3)
            java.util.Map r0 = X.C73813g7.A0F(r3)
            java.util.Map r1 = X.C57692u3.A04(r4, r0)
            X.C162457s7.A0J(r6, r7)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>(r6)
            r0.putAll(r1)
            r6 = r0
        L_0x0e21:
            r5.BdH(r6)
            return
        L_0x0e25:
            r1 = r2
            goto L_0x0ddc
        L_0x0e27:
            java.lang.Object r5 = r1.A00
            java.lang.Object r0 = r1.A01
            X.49I r0 = (X.AnonymousClass49I) r0
            java.lang.Object r4 = r1.A02
            java.util.List r4 = (java.util.List) r4
            X.48t r3 = r0.B3r()
            X.7Xj r2 = new X.7Xj
            r2.<init>()
            r1 = 0
        L_0x0e3b:
            int r0 = r4.size()
            if (r1 >= r0) goto L_0x0e4b
            java.lang.Object r0 = r4.get(r1)
            r2.A04(r0, r1)
            int r1 = r1 + 1
            goto L_0x0e3b
        L_0x0e4b:
            X.6dJ r1 = X.AnonymousClass8DJ.A03(r5)
            X.7jD r0 = r2.A03()
            X.C157157hp.A00(r1, r0, r3)
            return
        L_0x0e57:
            java.lang.Object r3 = r1.A00
            X.2aM r3 = (X.C45652aM) r3
            java.lang.Object r2 = r1.A01
            X.2Qe r2 = (X.C42952Qe) r2
            java.lang.Object r1 = r1.A02
            X.2p5 r1 = (X.C54662p5) r1
            r0 = 2
            X.C162457s7.A0J(r1, r0)
            r3.A00(r1, r2)
            return
        L_0x0e6b:
            java.lang.Object r0 = r1.A00
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.lang.Object r2 = r1.A01
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r3 = r1.A02
            X.30E r3 = (X.AnonymousClass30E) r3
            java.util.ArrayList r8 = X.C73783g4.A0c(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0e7f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0e89
            X.C624134x.A0Z(r8, r1)
            goto L_0x0e7f
        L_0x0e89:
            X.3Wi r7 = r3.A00
            X.1iJ r6 = r3.A06
            X.8qC r0 = r3.A0D
            java.lang.Object r4 = r0.get()
            X.2py r4 = (X.C55202py) r4
            java.util.ArrayList r9 = X.AnonymousClass001.A0s()
            java.util.ArrayList r3 = X.C73783g4.A0d(r8)
            java.util.Iterator r1 = r8.iterator()
        L_0x0ea1:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0eab
            X.C18270x1.A1M(r3, r1)
            goto L_0x0ea1
        L_0x0eab:
            r9.addAll(r3)
            java.util.ArrayList r3 = X.C73783g4.A0d(r2)
            java.util.Iterator r1 = r2.iterator()
        L_0x0eb6:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0ec8
            java.lang.Object r0 = r1.next()
            X.223 r0 = (X.AnonymousClass223) r0
            int r0 = r0.databaseValue
            X.AnonymousClass0x7.A1I(r3, r0)
            goto L_0x0eb6
        L_0x0ec8:
            r9.addAll(r3)
            X.3dV r0 = r4.A00
            X.4Fq r5 = r0.A04()
            r0 = r5
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0ef7 }
            X.2sg r4 = r0.A03     // Catch:{ all -> 0x0ef7 }
            java.lang.String r3 = "status_crossposting_v3"
            int r1 = r8.size()     // Catch:{ all -> 0x0ef7 }
            int r0 = r2.size()     // Catch:{ all -> 0x0ef7 }
            java.lang.String r2 = X.AnonymousClass26G.A00(r1, r0)     // Catch:{ all -> 0x0ef7 }
            java.lang.String[] r1 = X.C18300x5.A1b(r9)     // Catch:{ all -> 0x0ef7 }
            java.lang.String r0 = "[WAFFLE] WaffleStatusCrosspostingStore/DELETE_CROSSPOSTING_COLUMN_BY_MESSAGE_AND_DESTINATION_IDS"
            r4.A07(r3, r2, r0, r1)     // Catch:{ all -> 0x0ef7 }
            r5.close()
            r0 = 40
            X.C69263Wi.A06(r7, r6, r8, r0)
            return
        L_0x0ef7:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0ef9 }
        L_0x0ef9:
            r1 = move-exception
            X.AnonymousClass2A8.A00(r5, r0)
            throw r1
        L_0x0efe:
            java.lang.Object r3 = r1.A01
            X.2cM r3 = (X.C46882cM) r3
            java.lang.Object r2 = r1.A00
            X.2p5 r2 = (X.C54662p5) r2
            java.lang.Object r0 = r1.A02
            X.2yH r0 = (X.C60272yH) r0
            r3.A00(r0, r2)
            return
        L_0x0f0e:
            java.lang.Object r3 = r1.A00
            X.3Ao r3 = (X.C63763Ao) r3
            java.lang.Object r12 = r1.A01
            com.facebook.msys.mci.DataTask r12 = (com.facebook.msys.mci.DataTask) r12
            java.lang.Object r5 = r1.A02
            com.facebook.msys.mci.NetworkSession r5 = (com.facebook.msys.mci.NetworkSession) r5
            int r2 = r12.mTaskType
            if (r2 == 0) goto L_0x0ff1
            r0 = 1
            if (r2 == r0) goto L_0x0fb7
            r0 = 2
            if (r2 == r0) goto L_0x0ff1
            r0 = 3
            if (r2 == r0) goto L_0x0f66
            r0 = 4
            if (r2 != r0) goto L_0x0f4f
            X.3Ap r4 = r3.A00
            java.util.Map r3 = r4.A09     // Catch:{ IOException -> 0x0f3e }
            java.lang.String r2 = r12.mTaskIdentifier     // Catch:{ IOException -> 0x0f3e }
            X.7IY r1 = new X.7IY     // Catch:{ IOException -> 0x0f3e }
            r1.<init>(r12, r4)     // Catch:{ IOException -> 0x0f3e }
            X.2i4 r0 = new X.2i4     // Catch:{ IOException -> 0x0f3e }
            r0.<init>(r12, r5, r1, r4)     // Catch:{ IOException -> 0x0f3e }
            r3.put(r2, r0)     // Catch:{ IOException -> 0x0f3e }
            return
        L_0x0f3e:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "wa-msys/NetworkSession: "
            r1.append(r0)
            java.lang.String r0 = "Failed to create StreamingUploadDataTask"
            X.C18260x0.A15(r0, r1, r2)
            return
        L_0x0f4f:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "DataTask type "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " not yet supported"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            java.lang.UnsupportedOperationException r0 = X.AnonymousClass002.A0G(r0)
            throw r0
        L_0x0f66:
            X.3Ap r4 = r3.A00
            com.facebook.msys.mci.UrlRequest r6 = r12.mUrlRequest
            java.io.ByteArrayOutputStream r8 = X.AnonymousClass0x9.A0e()     // Catch:{ IOException | IllegalArgumentException | IndexOutOfBoundsException -> 0x0faf }
            java.lang.String r2 = r12.mContentUrl     // Catch:{ all -> 0x0fa5 }
            java.lang.String r1 = "file://"
            java.lang.String r0 = ""
            java.lang.String r2 = r2.replaceFirst(r1, r0)     // Catch:{ all -> 0x0fa5 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0fa5 }
            java.lang.String r0 = "wa-msys/NetworkSession: handleUploadTaskType called with path: "
            X.C18260x0.A0q(r0, r2, r1)     // Catch:{ all -> 0x0fa5 }
            java.io.File r0 = X.AnonymousClass002.A0B(r2)     // Catch:{ all -> 0x0fa5 }
            java.io.FileInputStream r7 = X.AnonymousClass0x9.A0g(r0)     // Catch:{ all -> 0x0fa5 }
            java.lang.String r9 = r12.mTaskIdentifier     // Catch:{ all -> 0x0fa5 }
            r10 = 1
            r11 = 0
            com.facebook.msys.mci.UrlResponse r14 = r4.A00(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0fa5 }
            byte[] r16 = r8.toByteArray()     // Catch:{ all -> 0x0fa5 }
            java.lang.String r15 = "wa-msys/NetworkSession: "
            r17 = 0
            r13 = r5
            r18 = r17
            com.facebook.msys.mci.NetworkUtils.markDataTaskCompleted(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x0fa5 }
            r8.close()     // Catch:{ IOException | IllegalArgumentException | IndexOutOfBoundsException -> 0x0faf }
            return
        L_0x0fa5:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x0faa }
            goto L_0x0fae
        L_0x0faa:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException | IllegalArgumentException | IndexOutOfBoundsException -> 0x0faf }
        L_0x0fae:
            throw r1     // Catch:{ IOException | IllegalArgumentException | IndexOutOfBoundsException -> 0x0faf }
        L_0x0faf:
            r1 = move-exception
            java.lang.String r0 = "wa-msys/NetworkSession: Exception while executing handleUploadDataTask"
            A01(r12, r5, r6, r0, r1)
            return
        L_0x0fb7:
            X.3Ap r4 = r3.A00
            com.facebook.msys.mci.UrlRequest r6 = r12.mUrlRequest
            java.lang.String r1 = "NetworkSessionDownload"
            java.io.File r0 = r4.A08     // Catch:{ IOException | IllegalArgumentException | IndexOutOfBoundsException -> 0x0fe9 }
            r7 = 0
            java.io.File r17 = java.io.File.createTempFile(r1, r7, r0)     // Catch:{ IOException | IllegalArgumentException | IndexOutOfBoundsException -> 0x0fe9 }
            java.io.FileOutputStream r8 = X.AnonymousClass0x9.A0h(r17)     // Catch:{ IOException | IllegalArgumentException | IndexOutOfBoundsException -> 0x0fe9 }
            java.lang.String r9 = r12.mTaskIdentifier     // Catch:{ all -> 0x0fdf }
            r10 = 0
            r11 = 1
            com.facebook.msys.mci.UrlResponse r14 = r4.A00(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0fdf }
            java.lang.String r15 = "wa-msys/NetworkSession: "
            r18 = r7
            r13 = r5
            r16 = r7
            com.facebook.msys.mci.NetworkUtils.markDataTaskCompleted(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x0fdf }
            r8.close()     // Catch:{ IOException | IllegalArgumentException | IndexOutOfBoundsException -> 0x0fe9 }
            return
        L_0x0fdf:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x0fe4 }
            goto L_0x0fe8
        L_0x0fe4:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException | IllegalArgumentException | IndexOutOfBoundsException -> 0x0fe9 }
        L_0x0fe8:
            throw r1     // Catch:{ IOException | IllegalArgumentException | IndexOutOfBoundsException -> 0x0fe9 }
        L_0x0fe9:
            r1 = move-exception
            java.lang.String r0 = "wa-msys/NetworkSession: Exception while executing handleDownloadDataTask"
            A01(r12, r5, r6, r0, r1)
            return
        L_0x0ff1:
            X.3Ap r4 = r3.A00
            com.facebook.msys.mci.UrlRequest r6 = r12.mUrlRequest
            java.io.ByteArrayOutputStream r8 = X.AnonymousClass0x9.A0e()     // Catch:{ IOException | IllegalArgumentException | IndexOutOfBoundsException -> 0x101f }
            java.lang.String r9 = r12.mTaskIdentifier     // Catch:{ all -> 0x1015 }
            r10 = 1
            r11 = 0
            r7 = 0
            com.facebook.msys.mci.UrlResponse r14 = r4.A00(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x1015 }
            byte[] r16 = r8.toByteArray()     // Catch:{ all -> 0x1015 }
            java.lang.String r15 = "wa-msys/NetworkSession: "
            r18 = r7
            r13 = r5
            r17 = r7
            com.facebook.msys.mci.NetworkUtils.markDataTaskCompleted(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x1015 }
            r8.close()     // Catch:{ IOException | IllegalArgumentException | IndexOutOfBoundsException -> 0x101f }
            return
        L_0x1015:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x101a }
            goto L_0x101e
        L_0x101a:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException | IllegalArgumentException | IndexOutOfBoundsException -> 0x101f }
        L_0x101e:
            throw r1     // Catch:{ IOException | IllegalArgumentException | IndexOutOfBoundsException -> 0x101f }
        L_0x101f:
            r1 = move-exception
            java.lang.String r0 = "wa-msys/NetworkSession: Exception while executing handleDataDataTask"
            A01(r12, r5, r6, r0, r1)
            return
        L_0x1027:
            java.lang.Object r4 = r1.A00
            X.5KN r4 = (X.AnonymousClass5KN) r4
            java.lang.Object r3 = r1.A01
            X.57D r3 = (X.AnonymousClass57D) r3
            java.lang.Object r1 = r1.A02
            X.4GP r1 = (X.AnonymousClass4GP) r1
            X.5Wc r2 = r4.A04
            X.5zN r0 = new X.5zN
            r0.<init>(r4, r3, r1)
            monitor-enter(r2)
            r0.invoke()     // Catch:{ all -> 0x108c }
            monitor-exit(r2)
            return
        L_0x1040:
            java.lang.Object r5 = r1.A00
            com.whatsapp.xfamily.accountlinking.ui.AccountLinkingNativeAuthActivity r5 = (com.whatsapp.xfamily.accountlinking.ui.AccountLinkingNativeAuthActivity) r5
            java.lang.Object r4 = r1.A01
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.lang.Object r3 = r1.A02
            java.lang.Integer r3 = (java.lang.Integer) r3
            r2 = 0
            X.4xg r1 = r5.A03
            if (r1 == 0) goto L_0x1059
            r0 = 0
            r1.A08(r0, r4, r3, r2)
            r5.finish()
            return
        L_0x1059:
            java.lang.String r0 = "accountLinkingResultObservers"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x1060:
            java.lang.Object r0 = r1.A00
            X.5YA r0 = (X.AnonymousClass5YA) r0
            java.lang.Object r2 = r1.A01
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r1 = r1.A02
            X.1mW r1 = (X.C30481mW) r1
            X.8qC r0 = r0.A0I
            java.lang.Object r0 = r0.get()
            X.2hP r0 = (X.C49972hP) r0
            r0.A00(r2, r1)
            return
        L_0x1078:
            r2 = move-exception
            java.util.concurrent.ConcurrentHashMap r1 = r7.A08
            int r0 = r5.A01
            java.lang.Object r0 = X.C18290x4.A0j(r1, r0)
            java.util.concurrent.atomic.AtomicInteger r0 = (java.util.concurrent.atomic.AtomicInteger) r0
            if (r0 == 0) goto L_0x1088
            r0.decrementAndGet()
        L_0x1088:
            throw r2
        L_0x1089:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x108c }
            throw r0     // Catch:{ all -> 0x108c }
        L_0x108c:
            r1 = move-exception
            monitor-exit(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70363aN.run():void");
    }

    public static void A01(DataTask dataTask, NetworkSession networkSession, UrlRequest urlRequest, String str, Throwable th) {
        Log.e(str, th);
        NetworkUtils.markDataTaskCompleted(dataTask, networkSession, NetworkUtils.newErrorURLResponse(urlRequest), "wa-msys/NetworkSession: ", (byte[]) null, (File) null, new IOException(th));
    }
}
