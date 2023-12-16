package X;

import android.net.Uri;
import android.os.ConditionVariable;
import com.whatsapp.Mp4Ops;
import com.whatsapp.media.magi.Magi;
import com.whatsapp.stickers.WebpUtils;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1I7  reason: invalid class name */
public class AnonymousClass1I7 extends AnonymousClass1I8 implements Comparable, AnonymousClass4D9 {
    public AnonymousClass2YO A00;
    public AnonymousClass5LM A01;
    public AnonymousClass1fz A02;
    public File A03;
    public File A04;
    public URL A05;
    public boolean A06;
    public final int A07;
    public final long A08;
    public final ConditionVariable A09;
    public final C55682qk A0A;
    public final C64393Dh A0B;
    public final AnonymousClass36E A0C;
    public final Mp4Ops A0D;
    public final C56492s4 A0E;
    public final C153407bG A0F;
    public final AnonymousClass3XB A0G;
    public final AnonymousClass3XB A0H;
    public final AnonymousClass3XB A0I = AnonymousClass3XB.A00();
    public final AnonymousClass3XB A0J = AnonymousClass3XB.A00();
    public final AnonymousClass3XB A0K = AnonymousClass3XB.A00();
    public final AnonymousClass3XB A0L = AnonymousClass3XB.A00();
    public final AnonymousClass3XB A0M = AnonymousClass3XB.A00();
    public final C56612sH A0N;
    public final C54292oU A0O;
    public final C61072zf A0P;
    public final C60872zJ A0Q;
    public final AnonymousClass2ZV A0R;
    public final AnonymousClass319 A0S;
    public final AnonymousClass1VX A0T;
    public final AnonymousClass4FV A0U;
    public final C55002pd A0V;
    public final C54672p6 A0W;
    public final C55972rD A0X;
    public final C60132y3 A0Y;
    public final C54882pR A0Z;
    public final AnonymousClass2YR A0a;
    public final C55812qx A0b;
    public final C55572qZ A0c;
    public final C56902sk A0d;
    public final C47662dc A0e;
    public final Magi A0f;
    public final C162287rd A0g;
    public final C56852sf A0h;
    public final C60152y5 A0i;
    public final AnonymousClass65W A0j;
    public final C29011i8 A0k;
    public final AnonymousClass1R1 A0l;
    public final WebpUtils A0m;
    public final C45122Yt A0n;
    public final C56742sU A0o;
    public final C107105ah A0p;
    public final C989053r A0q;
    public final C59132wP A0r;
    public final C107085af A0s;
    public final AnonymousClass4FS A0t;
    public final AnonymousClass5TD A0u;
    public final AnonymousClass2JB A0v;
    public final C34171uL A0w;
    public final Object A0x;
    public final LinkedList A0y = AnonymousClass0x9.A18();
    public final CountDownLatch A0z = new CountDownLatch(1);
    public final AtomicBoolean A10 = new AtomicBoolean();
    public final boolean A11;
    public volatile int A12;
    public volatile boolean A13;
    public volatile boolean A14;

    public final AnonymousClass1g3 A09(boolean z) {
        C56612sH r3 = this.A0N;
        AnonymousClass1VX r5 = this.A0T;
        C56492s4 r2 = this.A0E;
        C61072zf r4 = this.A0P;
        C29011i8 r8 = this.A0k;
        C28241fx r1 = new C28241fx(r2, r3, r4, r5, this.A0V, this, r8, z);
        r1.AwR(new AnonymousClass4IX(this));
        return r1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0I(X.C56902sk r13, java.io.File r14, java.lang.String r15, boolean r16) {
        /*
            r12 = this;
            r6 = r15
            long r0 = r14.length()
            r13.A0C(r0)
            X.2dc r2 = r12.A0e
            java.io.File r0 = r2.A0E
            if (r0 == 0) goto L_0x0025
            boolean r1 = r0.exists()
            if (r1 != 0) goto L_0x0025
            int r1 = com.whatsapp.files.FileUtils$OsRename.attempt(r14, r0)
            if (r1 <= 0) goto L_0x00ae
            int r1 = com.whatsapp.files.FileUtils$OsRename.attempt(r14, r0)
            if (r1 <= 0) goto L_0x00a9
            java.lang.String r1 = "media-file-utils/Second try rename failed"
            com.whatsapp.util.Log.i((java.lang.String) r1)
        L_0x0025:
            boolean r9 = r2.A0Y
            X.20h r4 = r2.A0B
            boolean r10 = r2.A0W
            boolean r11 = r2.A0b
            X.38t r3 = r2.A0A
            int r7 = r2.A04
            int r8 = r2.A01
            java.lang.String r5 = r2.A0K
            java.lang.String r1 = r2.A0L
            if (r15 != 0) goto L_0x003f
            if (r1 == 0) goto L_0x00a7
            java.lang.String r6 = X.C627536m.A08(r1)
        L_0x003f:
            X.3Dh r1 = r12.A0B
            X.2y5 r2 = r12.A0i
            java.io.File r2 = X.C107655bf.A0O(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r13.A0E(r2)
            int r1 = com.whatsapp.files.FileUtils$OsRename.attempt(r14, r2)
            if (r1 <= 0) goto L_0x005b
            int r1 = com.whatsapp.files.FileUtils$OsRename.attempt(r14, r2)
            if (r1 <= 0) goto L_0x00a4
            java.lang.String r1 = "media-file-utils/Second try rename failed"
        L_0x0058:
            com.whatsapp.util.Log.i((java.lang.String) r1)
        L_0x005b:
            if (r16 != 0) goto L_0x00b3
            java.io.File r5 = r13.A03()
            java.io.File r4 = r12.A04
            if (r5 == 0) goto L_0x00a3
            X.38t r1 = X.C633138t.A0C
            boolean r1 = X.AnonymousClass36O.A04(r1)
            if (r1 == 0) goto L_0x00a3
            X.1VX r3 = r12.A0T
            r2 = 3116(0xc2c, float:4.366E-42)
            if (r9 == 0) goto L_0x0075
            r2 = 6269(0x187d, float:8.785E-42)
        L_0x0075:
            X.2vE r1 = X.C58422vE.A01
            boolean r1 = r3.A0Y(r1, r2)
            if (r1 == 0) goto L_0x00a3
            if (r0 == 0) goto L_0x0090
            java.lang.String r2 = r5.getAbsolutePath()
            java.lang.String r1 = r0.getAbsolutePath()
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x0090
            X.C18270x1.A0x(r0)
        L_0x0090:
            if (r4 == 0) goto L_0x00a3
            java.lang.String r1 = r5.getAbsolutePath()
            java.lang.String r0 = r4.getAbsolutePath()
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00a3
            X.C18270x1.A0x(r4)
        L_0x00a3:
            return
        L_0x00a4:
            java.lang.String r1 = "media-file-utils/Second try rename succeeded"
            goto L_0x0058
        L_0x00a7:
            r6 = 0
            goto L_0x003f
        L_0x00a9:
            java.lang.String r1 = "media-file-utils/Second try rename succeeded"
            com.whatsapp.util.Log.i((java.lang.String) r1)
        L_0x00ae:
            r13.A0E(r0)
            if (r16 == 0) goto L_0x00a3
        L_0x00b3:
            java.io.File r0 = r13.A03()
            if (r0 == 0) goto L_0x00a3
            X.53r r1 = r12.A0q
            java.io.File r0 = r13.A03()
            r1.A0I(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1I7.A0I(X.2sk, java.io.File, java.lang.String, boolean):void");
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x029e  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02f7 A[SYNTHETIC, Splitter:B:113:0x02f7] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x033e  */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x06e6  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0154  */
    public /* bridge */ /* synthetic */ java.lang.Object A07() {
        /*
            r35 = this;
            r0 = r35
            boolean r1 = r0.A11
            if (r1 == 0) goto L_0x0124
            X.2dc r15 = r0.A0e
            java.lang.String r13 = r15.A0L
            r14 = 0
            r1 = 0
            if (r13 != 0) goto L_0x001a
            java.lang.String r0 = "MediaDownload/call/expressPathDownload download url is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 8
        L_0x0015:
            X.35m r5 = X.C625435m.A00(r1, r0, r14)
            return r5
        L_0x001a:
            java.lang.String r3 = r15.A0G
            if (r3 != 0) goto L_0x0026
            java.lang.String r0 = "MediaDownload/call/expressPathDownload enc hash is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 27
            goto L_0x0015
        L_0x0026:
            java.io.File r12 = r15.A0D
            X.C626936e.A06(r12)
            boolean r1 = r12.exists()
            if (r1 != 0) goto L_0x0040
            boolean r1 = r12.createNewFile()
            if (r1 != 0) goto L_0x0040
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "MediaDownload/create unable to create encrypted file; mediaEncHash="
            X.C18260x0.A0t(r1, r3, r2)
        L_0x0040:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "mediadownload/expresspathdownload Start download for url: "
            X.C18260x0.A0q(r1, r13, r2)
            android.os.ConditionVariable r2 = r0.A09
            if (r2 == 0) goto L_0x0054
            boolean r1 = r0.A13
            if (r1 != 0) goto L_0x0054
            r2.block()
        L_0x0054:
            r0.A08()
            X.2zf r1 = r0.A0P
            r18 = r1
            long r7 = r18.A02()
            long r9 = r18.A04()
            long r5 = r15.A07
            r16 = 16
            long r1 = r5 % r16
            long r3 = r5 - r1
            long r3 = r3 + r16
            r1 = 10
            long r3 = r3 + r1
            long r5 = r5 + r3
            X.1VX r11 = r0.A0T
            long r3 = X.C56952sp.A03(r11)
            r1 = 32000000(0x1e84800, double:1.58101007E-316)
            long r2 = java.lang.Math.max(r1, r3)
            long r2 = r2 + r5
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x00a3
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MediaDownload/call/nospace total: "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = " free: "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " need: "
            X.C18260x0.A11(r0, r1, r5)
            r14 = 4
        L_0x009d:
            X.35m r5 = new X.35m
            r5.<init>(r14)
            return r5
        L_0x00a3:
            X.2qk r3 = r0.A0A     // Catch:{ Exception -> 0x00ba }
            X.319 r2 = r0.A0S     // Catch:{ Exception -> 0x00ba }
            X.1R1 r1 = r0.A0l     // Catch:{ Exception -> 0x00ba }
            X.1mV r1 = X.AnonymousClass36U.A04(r3, r2, r15, r1)     // Catch:{ Exception -> 0x00ba }
            X.C626936e.A06(r1)     // Catch:{ Exception -> 0x00ba }
            java.io.File r1 = X.C30471mV.A01(r1)     // Catch:{ Exception -> 0x00ba }
            X.C626936e.A06(r1)     // Catch:{ Exception -> 0x00ba }
            if (r1 == 0) goto L_0x00bf
            goto L_0x009d
        L_0x00ba:
            java.lang.String r1 = "MediaDownload/call/unable to find existing file."
            com.whatsapp.util.Log.w((java.lang.String) r1)
        L_0x00bf:
            r0.A08()
            X.2sH r6 = r0.A0N
            X.2s4 r5 = r0.A0E
            X.1i8 r4 = r0.A0k
            X.2pd r3 = r0.A0V
            X.38t r2 = r15.A0A
            X.2sf r1 = r0.A0h
            X.2cG r23 = r0.A0A()
            X.1fz r14 = new X.1fz
            r19 = r3
            r20 = r1
            r21 = r2
            r22 = r4
            r24 = r12
            r25 = r13
            r15 = r5
            r16 = r6
            r17 = r18
            r18 = r11
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r2 = 0
            X.4Ib r1 = new X.4Ib
            r1.<init>(r0, r2)
            r14.AwR(r1)
            java.lang.Object r1 = r0.A0x
            monitor-enter(r1)
            r0.A02 = r14     // Catch:{ all -> 0x0121 }
            monitor-exit(r1)     // Catch:{ all -> 0x0121 }
            X.7E5 r2 = r14.A02()
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "mediadownload/expresspathdownload Finish download for url: "
            r1.append(r0)
            r1.append(r13)
            java.lang.String r0 = " file: "
            r1.append(r0)
            java.lang.String r0 = r12.getCanonicalPath()
            r1.append(r0)
            java.lang.String r0 = " with size: "
            java.lang.String r0 = X.AnonymousClass000.A0N(r12, r0, r1)
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.35m r5 = r2.A00
            return r5
        L_0x0121:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0121 }
            throw r0
        L_0x0124:
            X.2dc r1 = r0.A0e
            java.lang.String r14 = r1.A0H
            r19 = 0
            r15 = 0
            if (r14 != 0) goto L_0x01ce
            java.lang.String r2 = "MediaDownload/call/media hash is null"
            com.whatsapp.util.Log.e((java.lang.String) r2)
            r3 = 28
        L_0x0134:
            r2 = r19
            X.35m r5 = X.C625435m.A00(r2, r3, r15)
        L_0x013a:
            java.lang.StringBuilder r6 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "mediadownload/call start updateMessageAfterDownload, ts = "
            r6.append(r2)
            X.2sH r4 = r0.A0N
            long r2 = r4.A0H()
            X.C18260x0.A1H(r6, r2)
            int r2 = r5.A01
            boolean r2 = X.AnonymousClass000.A1T(r2)
            if (r2 == 0) goto L_0x06e6
            r0.A0F(r5)
            X.2sk r7 = r0.A0d
            java.io.File r2 = r0.A03
            long r2 = r2.length()
            r7.A0C(r2)
            X.2sU r6 = r0.A0o
            if (r6 == 0) goto L_0x016a
            r2 = 2
            r6.A06(r2)
        L_0x016a:
            boolean r2 = r1.A0Z
            if (r2 != 0) goto L_0x01b6
            int r3 = r7.A00()
            r2 = 1
            if (r3 == r2) goto L_0x01b6
            int r3 = r7.A00()
            r2 = 3
            if (r3 != r2) goto L_0x0181
            java.lang.String r2 = "MediaDownload/updateMessageAfterExecution/keeping suspicious download file"
            com.whatsapp.util.Log.i((java.lang.String) r2)
        L_0x0181:
            java.io.File r8 = r5.A02
            if (r8 == 0) goto L_0x01c6
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "MediaDownload/set downloadData.file to "
            X.AnonymousClass000.A10(r8, r2, r3)
            java.lang.String r2 = ", delete downloadFile="
            r3.append(r2)
            java.io.File r2 = r0.A03
            java.lang.String r2 = r2.getAbsolutePath()
            X.C18260x0.A1J(r3, r2)
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "MediaDownload/delete downloadFile "
            r3.append(r2)
            java.io.File r2 = r0.A03
            java.lang.String r2 = r2.getAbsolutePath()
            X.C18260x0.A1J(r3, r2)
            r7.A0E(r8)
            java.io.File r0 = r0.A03
            r0.delete()
        L_0x01b6:
            if (r6 == 0) goto L_0x06f6
            java.io.File r0 = r7.A03()
            r6.A09(r0)
            r0 = 3
            r6.A06(r0)
            monitor-enter(r6)
            goto L_0x06dd
        L_0x01c6:
            java.io.File r3 = r0.A03
            java.lang.String r2 = r5.A03
            r0.A0I(r7, r3, r2, r15)
            goto L_0x01b6
        L_0x01ce:
            java.io.File r2 = r1.A0C
            X.C626936e.A06(r2)
            r0.A03 = r2
            X.2sf r2 = r0.A0h
            X.2y3 r3 = r0.A0Y
            r34 = r3
            r13 = 1
            java.lang.Float r3 = r3.A01(r13)
            r2.A0N = r3
            int r4 = r1.A02
            r3 = 3
            if (r4 == r3) goto L_0x01ec
            r3 = 2
            r18 = 0
            if (r4 != r3) goto L_0x01ee
        L_0x01ec:
            r18 = 1
        L_0x01ee:
            r16 = 0
            if (r18 == 0) goto L_0x0215
            X.2sU r4 = r0.A0o
            java.io.File r3 = r0.A03
            r4.A09(r3)
            r4.A06(r13)
            java.io.File r3 = r0.A03
            boolean r3 = r3.exists()
            if (r3 != 0) goto L_0x061a
            java.io.File r3 = r0.A03
            boolean r3 = r3.createNewFile()
            if (r3 != 0) goto L_0x0215
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()
            java.lang.String r3 = "MediaDownload/create unable to create decryption file; mediaHash="
            X.C18260x0.A0t(r3, r14, r4)
        L_0x0215:
            int r3 = r0.A12
            if (r3 == 0) goto L_0x026a
            android.os.ConditionVariable r4 = r0.A09
            if (r4 == 0) goto L_0x0224
            boolean r3 = r0.A13
            if (r3 != 0) goto L_0x0224
            r4.block()
        L_0x0224:
            r0.A08()
            X.2zf r3 = r0.A0P
            long r5 = r3.A02()
            long r11 = r3.A04()
            long r3 = r1.A07
            X.1VX r7 = r0.A0T
            long r9 = X.C56952sp.A03(r7)
            r7 = 32000000(0x1e84800, double:1.58101007E-316)
            long r8 = java.lang.Math.max(r7, r9)
            boolean r7 = r1.A0Z
            if (r7 != 0) goto L_0x026a
            long r8 = r8 + r3
            int r7 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r7 >= 0) goto L_0x026a
            java.lang.StringBuilder r7 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "MediaDownload/call/nospace total: "
            r7.append(r2)
            r7.append(r11)
            java.lang.String r2 = " free: "
            r7.append(r2)
            r7.append(r5)
            java.lang.String r2 = " need: "
            X.C18260x0.A11(r2, r7, r3)
            r2 = 4
        L_0x0263:
            X.35m r5 = new X.35m
            r5.<init>(r2)
            goto L_0x013a
        L_0x026a:
            long r3 = android.os.SystemClock.elapsedRealtime()
            r2.A0A = r3
            r2.A03 = r15
            X.2rD r10 = r0.A0X
            java.lang.String r6 = r1.A0I
            int r3 = r0.A12
            boolean r7 = X.AnonymousClass000.A1T(r3)
            boolean r5 = r1.A0Z
            if (r6 == 0) goto L_0x02a2
            X.2qx r4 = r10.A0J
            r3 = 1
            if (r5 == 0) goto L_0x0286
            r3 = 3
        L_0x0286:
            X.5LM r4 = r4.A02(r6, r3)
            if (r4 == 0) goto L_0x02a2
            if (r7 == 0) goto L_0x0294
            int r3 = r4.A03
            int r3 = r3 + 1
            r4.A03 = r3
        L_0x0294:
            r0.A01 = r4
            java.lang.String r4 = r4.A0D
            boolean r3 = r4.equals(r6)
            if (r3 != 0) goto L_0x02bf
            X.2sk r3 = r0.A0d
            monitor-enter(r3)
            goto L_0x02ad
        L_0x02a2:
            X.2qx r4 = r10.A0J
            r3 = 1
            if (r5 == 0) goto L_0x02a8
            r3 = 3
        L_0x02a8:
            X.5LM r4 = r4.A01(r6, r3)
            goto L_0x0294
        L_0x02ad:
            r3.A0F = r4     // Catch:{ all -> 0x0707 }
            monitor-exit(r3)
            X.5LM r3 = r0.A01
            java.lang.String r4 = r3.A0D
            X.3XB r3 = r0.A0M
            r3.A05(r4)
            X.5LM r3 = r0.A01
            int r3 = r3.A02
            r2.A04 = r3
        L_0x02bf:
            X.2sH r3 = r0.A0N
            r33 = r3
            long r6 = android.os.SystemClock.elapsedRealtime()
            X.1i8 r3 = r0.A0k
            r32 = r3
            r32.A0D()
            long r3 = X.AnonymousClass0x7.A0E(r6)
            java.lang.Long r6 = java.lang.Long.valueOf(r3)
            r2.A0V = r6
            java.lang.StringBuilder r7 = X.AnonymousClass001.A0o()
            java.lang.String r6 = "MediaDownload/requestRoutesAndWaitForAuth/took "
            r7.append(r6)
            r7.append(r3)
            java.lang.String r3 = " ms to get routes"
            X.C18260x0.A1J(r7, r3)
            r0.A08()
            X.2y5 r4 = r0.A0i
            X.3Dh r3 = r0.A0B
            r31 = r3
            X.C107655bf.A0Z(r3, r4)
            if (r5 == 0) goto L_0x0326
            int r4 = r1.A05     // Catch:{ Exception -> 0x0406 }
            r3 = 9
            if (r4 != r3) goto L_0x0326
            java.lang.String r4 = r1.A0F     // Catch:{ Exception -> 0x0406 }
            if (r4 == 0) goto L_0x0326
            r3 = r31
            java.io.File r21 = r3.A0T(r4)     // Catch:{ Exception -> 0x0406 }
            long r4 = r21.length()     // Catch:{ Exception -> 0x0406 }
            int r3 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r3 <= 0) goto L_0x0326
            java.lang.String r3 = r21.getAbsolutePath()     // Catch:{ Exception -> 0x0406 }
            java.lang.String r22 = X.C627536m.A08(r3)     // Catch:{ Exception -> 0x0406 }
            X.35m r5 = new X.35m     // Catch:{ Exception -> 0x0406 }
            r24 = r15
            r20 = r5
            r23 = r15
            r25 = r13
            r20.<init>(r21, r22, r23, r24, r25)     // Catch:{ Exception -> 0x0406 }
            goto L_0x013a
        L_0x0326:
            X.2qk r6 = r0.A0A     // Catch:{ Exception -> 0x0406 }
            X.319 r4 = r0.A0S     // Catch:{ Exception -> 0x0406 }
            X.1R1 r3 = r0.A0l     // Catch:{ Exception -> 0x0406 }
            X.1mV r3 = X.AnonymousClass36U.A04(r6, r4, r1, r3)     // Catch:{ Exception -> 0x0406 }
            X.C626936e.A06(r3)     // Catch:{ Exception -> 0x0406 }
            X.33C r4 = X.C30471mV.A00(r3)     // Catch:{ Exception -> 0x0406 }
            java.io.File r3 = r4.A0F     // Catch:{ Exception -> 0x0406 }
            X.C626936e.A06(r3)     // Catch:{ Exception -> 0x0406 }
            if (r3 == 0) goto L_0x040b
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "MediaDownload/call/file exists for hash; mediaHash="
            r5.append(r2)
            r5.append(r14)
            java.lang.String r2 = " directoryType="
            r5.append(r2)
            int r2 = r1.A01
            r5.append(r2)
            java.lang.String r2 = " file="
            java.lang.String r2 = X.AnonymousClass0x7.A0o(r3, r2, r5)
            X.C18260x0.A1L(r5, r2)
            X.2oU r10 = r0.A0O
            X.4FV r9 = r0.A0U
            X.7rd r7 = r0.A0g
            X.2sk r5 = r0.A0d
            X.7bG r2 = r0.A0F
            X.2Yt r8 = r0.A0n
            r18 = r2
            r19 = r10
            r20 = r9
            r21 = r0
            r22 = r5
            r23 = r1
            r24 = r7
            r25 = r8
            r26 = r3
            r16 = r6
            r17 = r31
            X.AnonymousClass36U.A06(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            X.2sU r2 = r0.A0o
            if (r2 == 0) goto L_0x03ad
            java.lang.StringBuilder r7 = X.AnonymousClass001.A0o()
            X.C626936e.A06(r14)
            X.AnonymousClass0x2.A1M(r7, r14)
            java.lang.String r2 = ".chk.tmp"
            java.lang.String r7 = X.AnonymousClass000.A0X(r2, r7)
            r2 = r31
            java.io.File r7 = X.C64393Dh.A00(r2, r7)
            boolean r2 = r7.exists()
            if (r2 == 0) goto L_0x03ad
            boolean r2 = r7.delete()
            if (r2 != 0) goto L_0x03ad
            java.lang.String r2 = "MediaDownload/call/unable to delete chunk store file on file hash match"
            com.whatsapp.util.Log.w((java.lang.String) r2)
        L_0x03ad:
            X.38t r9 = r1.A0A
            boolean r7 = r1.A0Y
            boolean r2 = X.C106695a0.A03(r9)
            if (r2 != 0) goto L_0x03c5
            boolean r2 = X.AnonymousClass36O.A06(r9)
            if (r2 != 0) goto L_0x03c5
            boolean r2 = X.AnonymousClass36O.A04(r9)
            if (r2 == 0) goto L_0x03f1
            if (r7 == 0) goto L_0x03f1
        L_0x03c5:
            X.5ah r4 = r0.A0p
            X.5af r2 = r0.A0s
            r17 = r5
            r18 = r1
            r19 = r8
            r20 = r4
            r21 = r2
            r22 = r3
            X.AnonymousClass36U.A07(r16, r17, r18, r19, r20, r21, r22)
            r0.A0B()
        L_0x03db:
            r0.A0J(r3)
            java.lang.String r2 = r3.getAbsolutePath()
            java.lang.String r7 = X.C627536m.A08(r2)
            X.35m r5 = new X.35m
            r9 = r15
            r10 = r15
            r6 = r3
            r8 = r15
            r5.<init>(r6, r7, r8, r9, r10)
            goto L_0x013a
        L_0x03f1:
            int r2 = r4.A02
            monitor-enter(r5)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x070a }
            r5.A09 = r2     // Catch:{ all -> 0x070a }
            monitor-exit(r5)
            int r2 = r4.A03
            monitor-enter(r5)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x070a }
            r5.A0A = r2     // Catch:{ all -> 0x070a }
            monitor-exit(r5)
            goto L_0x03db
        L_0x0406:
            java.lang.String r3 = "MediaDownload/call/unable to find existing file."
            com.whatsapp.util.Log.w((java.lang.String) r3)
        L_0x040b:
            java.io.File r3 = r0.A03
            long r3 = r3.length()
            r2.A09 = r3
            java.io.File r9 = r1.A0D
            java.lang.String r7 = r1.A0G
            if (r9 == 0) goto L_0x04db
            long r4 = r9.length()
            int r3 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r3 <= 0) goto L_0x04db
            if (r7 == 0) goto L_0x04db
            X.1VX r3 = r0.A0T
            boolean r3 = X.C56952sp.A0I(r3)
            if (r3 == 0) goto L_0x04db
            X.2YR r8 = r0.A0a
            monitor-enter(r8)
            X.1RC r3 = r8.A01     // Catch:{ IllegalArgumentException -> 0x04c9 }
            X.4GK r11 = r3.get()     // Catch:{ IllegalArgumentException -> 0x04c9 }
            r3 = r11
            X.3H0 r3 = (X.AnonymousClass3H0) r3     // Catch:{ all -> 0x04bf }
            X.2sg r6 = r3.A03     // Catch:{ all -> 0x04bf }
            java.lang.String r5 = "SELECT + enc_file_hash, ep_saved_time_ms, ep_saved_bytes, last_update_time FROM express_path_download_data WHERE enc_file_hash=?"
            java.lang.String[] r4 = new java.lang.String[r13]     // Catch:{ all -> 0x04bf }
            r4[r15] = r7     // Catch:{ all -> 0x04bf }
            java.lang.String r3 = "ExpressPathDownloadDataStore/get"
            android.database.Cursor r4 = r6.A0E(r5, r3, r4)     // Catch:{ all -> 0x04bf }
            boolean r3 = r4.moveToLast()     // Catch:{ all -> 0x04b3 }
            if (r3 == 0) goto L_0x04ac
            java.lang.String r3 = "ep_saved_time_ms"
            int r6 = r4.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x04b3 }
            java.lang.String r3 = "ep_saved_bytes"
            int r5 = r4.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x04b3 }
            java.lang.String r3 = "last_update_time"
            int r3 = r4.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x04b3 }
            long r22 = r4.getLong(r6)     // Catch:{ all -> 0x04b3 }
            long r24 = r4.getLong(r5)     // Catch:{ all -> 0x04b3 }
            long r26 = r4.getLong(r3)     // Catch:{ all -> 0x04b3 }
            X.5No r3 = new X.5No     // Catch:{ all -> 0x04b3 }
            r20 = r3
            r21 = r7
            r20.<init>(r21, r22, r24, r26)     // Catch:{ all -> 0x04b3 }
            r4.close()     // Catch:{ all -> 0x04bf }
            r11.close()     // Catch:{ IllegalArgumentException -> 0x04c9 }
            monitor-exit(r8)
            r2.A0d = r13
            long r5 = r3.A02
            r2.A0C = r5
            long r3 = r3.A01
            r2.A0B = r3
            java.lang.StringBuilder r11 = X.AnonymousClass001.A0o()
            java.lang.String r12 = "MediaDownload/download Benefit from EP when download file hash "
            r11.append(r12)
            r11.append(r7)
            java.lang.String r12 = ", saved time: "
            r11.append(r12)
            r11.append(r5)
            java.lang.String r5 = ", saved bytes: "
            X.C18260x0.A10(r5, r11, r3)
            boolean r3 = r8.A00(r7)
            if (r3 != 0) goto L_0x04db
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()
            java.lang.String r3 = "MediaDownload/download failed to delete EP gain metric in DB with encHash: "
            X.C18260x0.A0r(r3, r7, r4)
            goto L_0x04db
        L_0x04ac:
            r4.close()     // Catch:{ all -> 0x04bf }
            r11.close()     // Catch:{ IllegalArgumentException -> 0x04c9 }
            goto L_0x04da
        L_0x04b3:
            r5 = move-exception
            if (r4 == 0) goto L_0x04be
            r4.close()     // Catch:{ all -> 0x04ba }
            goto L_0x04be
        L_0x04ba:
            r3 = move-exception
            r5.addSuppressed(r3)     // Catch:{ all -> 0x04bf }
        L_0x04be:
            throw r5     // Catch:{ all -> 0x04bf }
        L_0x04bf:
            r4 = move-exception
            r11.close()     // Catch:{ all -> 0x04c4 }
            goto L_0x04c8
        L_0x04c4:
            r3 = move-exception
            r4.addSuppressed(r3)     // Catch:{ IllegalArgumentException -> 0x04c9 }
        L_0x04c8:
            throw r4     // Catch:{ IllegalArgumentException -> 0x04c9 }
        L_0x04c9:
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x070d }
            java.lang.String r3 = "ExpressPathDownloadDataStore/get/"
            r4.append(r3)     // Catch:{ all -> 0x070d }
            r4.append(r7)     // Catch:{ all -> 0x070d }
            java.lang.String r3 = "/at-least-one-column-not-found"
            X.C18260x0.A1K(r4, r3)     // Catch:{ all -> 0x070d }
        L_0x04da:
            monitor-exit(r8)
        L_0x04db:
            r0.A08()
            if (r7 == 0) goto L_0x04e7
            byte[] r3 = r1.A0d
            if (r3 != 0) goto L_0x04e7
            r3 = 5
            goto L_0x0134
        L_0x04e7:
            java.lang.Boolean r3 = r10.A05()
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x057e
            if (r18 != 0) goto L_0x057e
            int r3 = r0.A12
            if (r3 == r13) goto L_0x04fb
            int r3 = r0.A12
            if (r3 != 0) goto L_0x057e
        L_0x04fb:
            java.lang.String r3 = "MediaDownload/download media using native API's"
            com.whatsapp.util.Log.i((java.lang.String) r3)
            X.2JB r4 = r0.A0v
            X.2PH r3 = new X.2PH
            r3.<init>(r0, r4)
            X.38t r4 = r1.A0A
            int r29 = X.C387729e.A00(r4)
            int r4 = r0.A12
            boolean r30 = X.AnonymousClass000.A1S(r4)
            X.C626936e.A06(r9)
            r4 = 2
            byte[] r27 = android.util.Base64.decode(r7, r4)
            byte[] r28 = android.util.Base64.decode(r14, r4)
            X.5LI r5 = r32.A0B()
            r4 = r33
            java.lang.String r24 = X.C57552tp.A00(r4, r5)
            X.C626936e.A06(r24)
            java.lang.String r25 = r1.toString()
            java.lang.String r21 = r9.getPath()
            java.io.File r4 = r0.A03
            java.lang.String r22 = r4.getPath()
            java.lang.String r6 = r1.A0F
            byte[] r5 = r1.A0d
            X.C626936e.A06(r5)
            X.7UY r4 = new X.7UY
            r20 = r4
            r23 = r6
            r26 = r5
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            X.90E r5 = new X.90E
            r5.<init>(r4, r3, r3, r15)
            r3.A00 = r5
            java.lang.Object r5 = X.C105935Wz.A00(r5)
            X.35m r5 = (X.C625435m) r5
            if (r5 != 0) goto L_0x0563
            r4 = 17
            r3 = r19
            X.35m r5 = X.C625435m.A00(r3, r4, r15)
        L_0x0563:
            java.lang.StringBuilder r6 = X.AnonymousClass001.A0o()
            java.lang.String r3 = "mediadownload/download finish the transfer retry, ts = "
            r6.append(r3)
            long r3 = r33.A0H()
            X.C18260x0.A1H(r6, r3)
            if (r5 != 0) goto L_0x0624
            java.lang.String r2 = "MediaDownload/call/didn't get a selected route"
            com.whatsapp.util.Log.w((java.lang.String) r2)
            r2 = 11
            goto L_0x0263
        L_0x057e:
            int r3 = r1.A03
            r6 = 2
            if (r3 != r6) goto L_0x058b
            java.lang.String r3 = r1.A0L
            if (r3 != 0) goto L_0x05b5
            r2 = 8
            goto L_0x0263
        L_0x058b:
            X.38t r3 = r1.A0A
            java.lang.String r5 = r3.A02
            boolean r3 = X.AnonymousClass36O.A05(r3)
            if (r3 != 0) goto L_0x0596
            r14 = r7
        L_0x0596:
            java.lang.String r4 = r1.A0F
            int r3 = r0.A12
            if (r3 == 0) goto L_0x059d
            r6 = 1
        L_0x059d:
            X.C626936e.A0C(r13)
            if (r5 != 0) goto L_0x05a4
            java.lang.String r5 = "image"
        L_0x05a4:
            r20 = r32
            r21 = r5
            r22 = r14
            r23 = r4
            r24 = r6
            r25 = r15
            X.2YO r3 = r20.A09(r21, r22, r23, r24, r25)
            goto L_0x05ea
        L_0x05b5:
            X.3UO r6 = new X.3UO
            r6.<init>(r3)
            android.net.Uri r4 = android.net.Uri.parse(r3)
            java.lang.String r3 = "category"
            java.lang.String r4 = r4.getQueryParameter(r3)
            java.lang.String r3 = "PSA"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0613
            X.1VX r5 = r0.A0T
            r4 = 2037(0x7f5, float:2.854E-42)
            X.2vE r3 = X.C58422vE.A02
            boolean r3 = r5.A0Y(r3, r4)
            if (r3 == 0) goto L_0x0613
            X.38t r3 = r1.A0A
            java.lang.String r3 = r3.A02
            r21 = r13
            r16 = r32
            r17 = r3
            r18 = r7
            r20 = r13
            X.2YO r3 = r16.A09(r17, r18, r19, r20, r21)
        L_0x05ea:
            r0.A00 = r3
            boolean r3 = r1.A0O
            if (r3 == 0) goto L_0x05f9
            r0.A14 = r13
            X.65W r4 = r0.A0j
            r3 = r32
            r3.A06(r4)
        L_0x05f9:
            X.2YO r4 = r0.A00
            X.4Ke r3 = new X.4Ke
            r3.<init>(r0, r13, r9)
            java.lang.Object r5 = r4.A00(r3)
            X.35m r5 = (X.C625435m) r5
            X.2YO r3 = r0.A00
            java.util.concurrent.atomic.AtomicInteger r3 = r3.A01
            int r3 = r3.get()
            long r3 = (long) r3
            r2.A0G = r3
            goto L_0x0563
        L_0x0613:
            r3 = r32
            X.2YO r3 = r3.A08(r6, r13)
            goto L_0x05ea
        L_0x061a:
            java.lang.System.currentTimeMillis()
            java.io.File r3 = r0.A03
            r3.lastModified()
            goto L_0x0215
        L_0x0624:
            int r3 = r5.A01
            boolean r3 = X.AnonymousClass000.A1T(r3)
            if (r3 == 0) goto L_0x06da
            X.38t r3 = r2.A0g
            long r9 = r2.A05()
            long r11 = r2.A02()
            r6 = r34
            r7 = r3
            r8 = r13
            r6.A02(r7, r8, r9, r11)
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "mediadownload/download finish add bandwidth measurement, ts = "
            r4.append(r2)
            long r2 = r33.A0H()
            X.C18260x0.A1H(r4, r2)
            X.2oU r10 = r0.A0O
            X.2qk r9 = r0.A0A
            X.4FV r6 = r0.A0U
            X.7rd r4 = r0.A0g
            X.2sk r8 = r0.A0d
            X.7bG r3 = r0.A0F
            X.2Yt r7 = r0.A0n
            java.io.File r2 = r0.A03
            r20 = r9
            r21 = r31
            r22 = r3
            r23 = r10
            r24 = r6
            r25 = r0
            r26 = r8
            r27 = r1
            r28 = r4
            r29 = r7
            r30 = r2
            X.AnonymousClass36U.A06(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "mediadownload/download finish check suspicious content, ts = "
            r4.append(r2)
            long r2 = r33.A0H()
            X.C18260x0.A1H(r4, r2)
            java.util.concurrent.FutureTask r2 = r0.A02
            boolean r2 = r2.isCancelled()
            r6 = 13
            if (r2 != 0) goto L_0x06d2
            X.5ah r4 = r0.A0p
            X.5af r3 = r0.A0s
            java.io.File r2 = r0.A03
            r21 = r8
            r22 = r1
            r23 = r7
            r24 = r4
            r25 = r3
            r26 = r2
            X.AnonymousClass36U.A07(r20, r21, r22, r23, r24, r25, r26)
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "mediadownload/download finish createMessageThumbnailToStoreInDB, ts = "
            r4.append(r2)
            long r2 = r33.A0H()
            X.C18260x0.A1H(r4, r2)
            java.io.File r2 = r0.A03
            r0.A0J(r2)
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "mediadownload/download finish processVCardDocument, ts = "
            r4.append(r2)
            long r2 = r33.A0H()
            X.C18260x0.A1H(r4, r2)
        L_0x06ca:
            java.util.concurrent.FutureTask r2 = r0.A02
            boolean r2 = r2.isCancelled()
            if (r2 == 0) goto L_0x013a
        L_0x06d2:
            r2 = r19
            X.35m r5 = X.C625435m.A00(r2, r6, r15)
            goto L_0x013a
        L_0x06da:
            r6 = 13
            goto L_0x06ca
        L_0x06dd:
            java.util.List r0 = r6.A0G     // Catch:{ all -> 0x06e3 }
            r0.clear()     // Catch:{ all -> 0x06e3 }
            goto L_0x06ea
        L_0x06e3:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x06e6:
            r0.A0G(r5)
            goto L_0x06f6
        L_0x06ea:
            monitor-exit(r6)
            r6.A04()
            java.io.File r0 = r1.A0D
            X.C626936e.A06(r0)
            r0.delete()
        L_0x06f6:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "mediadownload/call finish updateMessageAfterDownload, ts = "
            r2.append(r0)
            long r0 = r4.A0H()
            X.C18260x0.A1H(r2, r0)
            return r5
        L_0x0707:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x070a:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x070d:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1I7.A07():java.lang.Object");
    }

    public final C46822cG A0A() {
        String str;
        Integer valueOf;
        String A002 = C106695a0.A00(this.A07);
        int i = this.A12;
        if (i == 0) {
            str = "manual";
        } else if (i == 1) {
            str = "full";
        } else if (i == 2) {
            str = "prefetch";
        } else if (i != 3) {
            str = "unknown";
        } else {
            str = "aggressive_prefetch";
        }
        AnonymousClass1VX r1 = this.A0T;
        String str2 = this.A0e.A0A.A02;
        AnonymousClass2YO r0 = this.A00;
        if (r0 == null) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(r0.A01.get());
        }
        return new C46822cG(r1, valueOf, A002, str2, str, false);
    }

    public void A0B() {
        byte[] A0H2 = this.A0d.A0H();
        if (A0H2 != null) {
            this.A0L.A05(A0H2);
        } else if (this.A0T.A0Y(C58422vE.A02, 2959) || this.A0e.A05 == 53) {
            this.A0L.A05(new byte[0]);
        }
    }

    public void A0C(long j) {
        this.A0K.A05(Long.valueOf(j));
    }

    public void A0D(C625435m r5) {
        C56902sk r2 = this.A0d;
        A0H(r2);
        C18260x0.A1P(AnonymousClass001.A0o(), "MediaDownload/populateDuplicatesWithResult/status=", r5);
        LinkedList linkedList = this.A0y;
        synchronized (linkedList) {
            C56902sk A022 = r2.A02();
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                ((AnonymousClass4EV) it.next()).BRX(r5, A022);
            }
            linkedList.clear();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0217, code lost:
        if (r13 == X.C633138t.A0U) goto L_0x0219;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x026e, code lost:
        if (r13 == 82) goto L_0x0270;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0389, code lost:
        if (r11 == 2) goto L_0x038b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x03b0, code lost:
        if (r4 == 15) goto L_0x03b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x009b, code lost:
        if (r5 == 23) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x019b, code lost:
        if (r3 == 15) goto L_0x019d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01d7, code lost:
        if (r2 >= 0) goto L_0x01d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01fc, code lost:
        if (r1 == false) goto L_0x01fe;
     */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01ba  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0E(X.C625435m r20) {
        /*
            r19 = this;
            r9 = r19
            X.2sf r8 = r9.A0h
            r0 = 0
            r10 = r20
            X.C162457s7.A0J(r10, r0)
            r8.A0J = r10
            long r0 = android.os.SystemClock.elapsedRealtime()
            r8.A07 = r0
            r0 = 4
            r8.A03 = r0
            X.2sH r0 = r9.A0N
            long r0 = r0.A0H()
            r8.A08 = r0
            boolean r0 = r9.A11
            if (r0 == 0) goto L_0x0032
            boolean r0 = r8 instanceof X.C28231fw
            if (r0 == 0) goto L_0x0032
            X.2dc r0 = r9.A0e
            java.lang.String r0 = r0.A0G
            if (r0 == 0) goto L_0x0032
            X.4FS r1 = r9.A0t
            r0 = 29
            X.C71533cG.A00(r1, r9, r0)
        L_0x0032:
            int r5 = r10.A01
            r0 = 22
            if (r5 != r0) goto L_0x005b
            X.2zJ r6 = r9.A0Q
            java.lang.Exception r1 = r8.A0M
            boolean r0 = r1 instanceof X.C1000359d
            if (r0 == 0) goto L_0x005b
            java.lang.Throwable r4 = r1.getCause()
            if (r4 != 0) goto L_0x0047
            r4 = r1
        L_0x0047:
            r3 = 0
            X.1VX r2 = r6.A03
            r1 = 5478(0x1566, float:7.676E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x005b
            java.lang.String r0 = X.C60872zJ.A00(r4, r3)
            r6.A01(r0)
        L_0x005b:
            X.5LM r4 = r9.A01
            if (r4 == 0) goto L_0x0085
            long r2 = r8.A04()
            long r0 = r4.A07
            long r0 = r0 + r2
            r4.A07 = r0
            X.2sU r0 = r9.A0o
            if (r0 == 0) goto L_0x0076
            boolean r0 = r0.A0E
            if (r0 == 0) goto L_0x0076
            int r0 = r4.A02
            int r0 = r0 + 1
            r4.A02 = r0
        L_0x0076:
            boolean r2 = X.AnonymousClass000.A1T(r5)
            X.4FS r1 = r9.A0t
            r0 = 31
            if (r2 == 0) goto L_0x0082
            r0 = 30
        L_0x0082:
            X.C71533cG.A00(r1, r9, r0)
        L_0x0085:
            boolean r0 = r10.A04
            if (r0 == 0) goto L_0x008f
            java.lang.String r0 = "MediaDownload/sendStat skipping reporting events as we found media in the cache"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x008e:
            return
        L_0x008f:
            X.2sk r2 = r9.A0d
            monitor-enter(r2)
            boolean r0 = r2.A0I     // Catch:{ all -> 0x049e }
            monitor-exit(r2)
            if (r0 != 0) goto L_0x009d
            r0 = 23
            r17 = 0
            if (r5 != r0) goto L_0x009f
        L_0x009d:
            r17 = 1
        L_0x009f:
            X.2dc r7 = r9.A0e
            boolean r0 = r7.A0S
            if (r0 != 0) goto L_0x01f1
            X.1bV r1 = r10.A00
            if (r1 == 0) goto L_0x01f1
            X.4FV r0 = r9.A0U
            r0.BhD(r1)
        L_0x00ae:
            X.36E r5 = r9.A0C
            X.5LM r3 = r9.A01
            X.1VX r2 = r5.A0F
            r1 = 5367(0x14f7, float:7.521E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x01a8
            java.lang.String r1 = r8.A0W
            boolean r0 = X.C107575bX.A0F(r1)
            if (r0 != 0) goto L_0x01a8
            X.2gm r0 = r5.A0L
            X.5ZC r0 = r0.A03
            boolean r0 = r0.A01(r1)
            if (r0 == 0) goto L_0x01a8
            X.1b9 r4 = new X.1b9
            r4.<init>()
            r4.A0E = r1
            if (r3 != 0) goto L_0x01df
            r2 = 0
        L_0x00db:
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r4.A0D = r0
            int r3 = r8.A00
            boolean r0 = r7.A0Z
            r2 = 5
            if (r0 != 0) goto L_0x00f3
            r1 = 2
            r0 = 1
            r2 = 2
            if (r3 == r0) goto L_0x00f3
            r2 = 3
            if (r3 == r1) goto L_0x00f3
            if (r3 == r2) goto L_0x00f3
            r2 = 1
        L_0x00f3:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r4.A04 = r0
            long r0 = r8.A05()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            long r0 = X.C106495Zf.A02(r0)
            java.lang.Double r0 = X.C18330xA.A07(r0)
            r4.A01 = r0
            long r0 = r8.A08
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.A0A = r0
            long r0 = r8.A04()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            long r0 = X.C106495Zf.A02(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.A0B = r0
            java.lang.Boolean r0 = r8.A0K
            r4.A00 = r0
            long r0 = r7.A07
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            long r0 = X.C106495Zf.A02(r0)
            java.lang.Double r0 = X.C18330xA.A07(r0)
            r4.A03 = r0
            X.1ip r0 = r5.A04
            X.2hc r0 = r0.A0A()
            java.lang.Integer r0 = X.AnonymousClass26q.A00(r0)
            r4.A05 = r0
            java.lang.String r1 = r7.A0F
            java.lang.String r0 = r7.A0L
            int r0 = r5.A09(r1, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.A06 = r0
            X.35m r0 = r8.A0J
            if (r0 != 0) goto L_0x01db
            r0 = -1
        L_0x0158:
            int r3 = X.C106495Zf.A01(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r4.A07 = r0
            int r0 = r7.A05
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.A09 = r0
            long r0 = r8.A0B
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            long r0 = X.C106495Zf.A02(r0)
            java.lang.Double r0 = X.C18330xA.A07(r0)
            r4.A02 = r0
            long r0 = r8.A0C
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            long r0 = X.C106495Zf.A02(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.A0C = r0
            boolean r0 = r8.A0d
            if (r0 != 0) goto L_0x01be
            r0 = 4
        L_0x018f:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0193:
            r4.A08 = r0
            r2 = 1
            if (r3 == r2) goto L_0x019d
            r0 = 15
            r1 = 1
            if (r3 != r0) goto L_0x019e
        L_0x019d:
            r1 = 0
        L_0x019e:
            X.4FV r0 = r5.A0G
            if (r1 == 0) goto L_0x01ba
            X.C18280x3.A0t(r4, r0, r2)
        L_0x01a5:
            r0.BKX()
        L_0x01a8:
            long r3 = r8.A05()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x008e
            X.4FS r1 = r9.A0t
            r0 = 29
            X.C71353by.A01(r1, r9, r10, r0)
            return
        L_0x01ba:
            r0.BhD(r4)
            goto L_0x01a5
        L_0x01be:
            long r0 = r8.A0B
            long r6 = r8.A05()
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 != 0) goto L_0x01ca
            r0 = 3
            goto L_0x018f
        L_0x01ca:
            r6 = 0
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 <= 0) goto L_0x01d9
            long r6 = r8.A05()
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            r0 = 2
            if (r2 < 0) goto L_0x018f
        L_0x01d9:
            r0 = 0
            goto L_0x0193
        L_0x01db:
            int r0 = r0.A01
            goto L_0x0158
        L_0x01df:
            java.lang.String r0 = r3.A0D
            java.util.UUID r0 = java.util.UUID.fromString(r0)
            long r2 = r0.getLeastSignificantBits()
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r2 = r2 & r0
            goto L_0x00db
        L_0x01f1:
            X.36E r6 = r9.A0C
            X.5LM r5 = r9.A01
            X.2sU r0 = r9.A0o
            if (r0 == 0) goto L_0x01fe
            boolean r1 = r0.A0D
            r0 = 1
            if (r1 != 0) goto L_0x01ff
        L_0x01fe:
            r0 = 0
        L_0x01ff:
            int r14 = r9.A07
            java.lang.Integer r11 = r2.A08
            if (r0 != 0) goto L_0x00ae
            X.35m r0 = r8.A0J
            if (r0 != 0) goto L_0x049a
            r0 = -1
        L_0x020a:
            int r4 = X.C106495Zf.A01(r0)
            X.38t r13 = r8.A0g
            X.38t r0 = X.C633138t.A0I
            if (r13 == r0) goto L_0x0219
            X.38t r0 = X.C633138t.A0U
            r3 = 0
            if (r13 != r0) goto L_0x021a
        L_0x0219:
            r3 = 1
        L_0x021a:
            X.1bV r2 = new X.1bV
            r2.<init>()
            int r12 = r7.A05
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
            r2.A0I = r0
            boolean r0 = r8.A0e
            if (r0 == 0) goto L_0x0496
            r0 = 4
        L_0x022d:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A0Y = r0
            long r0 = r8.A0G
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A0a = r0
            long r0 = r7.A07
            java.lang.Double r0 = X.C18330xA.A07(r0)
            r2.A09 = r0
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r2.A04 = r0
            r2.A05 = r0
            int r0 = r8.A02
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A0D = r0
            java.lang.Integer r0 = r8.A0P
            r2.A0A = r0
            java.lang.String r0 = r8.A0X
            r2.A0g = r0
            java.net.URL r0 = r8.A0c
            if (r0 == 0) goto L_0x0493
            java.lang.String r0 = r0.getHost()
        L_0x0261:
            r2.A0h = r0
            byte r13 = r13.A00
            boolean r0 = X.C627636p.A0I(r13)
            if (r0 != 0) goto L_0x0270
            r1 = 82
            r0 = 0
            if (r13 != r1) goto L_0x0271
        L_0x0270:
            r0 = 1
        L_0x0271:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A03 = r0
            long r0 = r8.A0E
            r15 = 0
            int r13 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r13 <= 0) goto L_0x048f
            long r15 = X.AnonymousClass0x9.A05(r0)
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r15 = r15 / r0
        L_0x0287:
            java.lang.Long r0 = java.lang.Long.valueOf(r15)
            r2.A0J = r0
            r0 = 8
            if (r4 == r0) goto L_0x02b7
            r0 = 6
            if (r4 == r0) goto L_0x02b7
            r0 = 9
            if (r4 == r0) goto L_0x02b7
            r0 = 29
            if (r4 == r0) goto L_0x02b7
            r0 = 10
            if (r4 == r0) goto L_0x02b7
            r0 = 35
            if (r4 == r0) goto L_0x02b7
            r0 = 36
            if (r4 == r0) goto L_0x02b7
            r0 = 37
            if (r4 == r0) goto L_0x02b7
            r0 = 38
            if (r4 == r0) goto L_0x02b7
            r0 = 39
            if (r4 == r0) goto L_0x02b7
            r0 = 2
            if (r4 != r0) goto L_0x02c7
        L_0x02b7:
            X.1VX r13 = r6.A0F
            r1 = 3820(0xeec, float:5.353E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r13.A0Y(r0, r1)
            if (r0 == 0) goto L_0x02c7
            java.lang.String r0 = r8.A0W
            r2.A0c = r0
        L_0x02c7:
            X.7YG r1 = r7.A09
            if (r1 == 0) goto L_0x02da
            X.1VX r13 = r6.A0F
            r0 = 2
            if (r12 != r0) goto L_0x0470
            r12 = 3349(0xd15, float:4.693E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r13.A0Y(r0, r12)
            if (r0 != 0) goto L_0x047d
        L_0x02da:
            int r0 = r8.A01
            long r0 = (long) r0
            r15 = 32
            int r12 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r12 > 0) goto L_0x02e5
            r0 = 32
        L_0x02e5:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A0K = r0
            if (r17 == 0) goto L_0x02f1
            java.lang.Integer r11 = X.C18280x3.A0S()
        L_0x02f1:
            r2.A0B = r11
            long r11 = r8.A04()
            r17 = 0
            int r0 = (r11 > r17 ? 1 : (r11 == r17 ? 0 : -1))
            if (r0 <= 0) goto L_0x0307
            java.lang.Long r0 = java.lang.Long.valueOf(r11)
            java.lang.Long r0 = X.C106495Zf.A03(r0, r3)
            r2.A0b = r0
        L_0x0307:
            long r0 = r8.A0A
            r15 = -1
            int r11 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r11 != 0) goto L_0x0468
            r0 = 0
        L_0x0310:
            java.lang.Long r0 = X.C106495Zf.A03(r0, r3)
            r2.A0Z = r0
            java.lang.Long r0 = r8.A0V
            if (r0 == 0) goto L_0x031c
            r2.A0V = r0
        L_0x031c:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r2.A0H = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r14)
            r2.A0G = r0
            int r12 = r8.A00
            boolean r0 = r7.A0Z
            r11 = 5
            if (r0 != 0) goto L_0x033a
            r1 = 2
            r0 = 1
            r11 = 2
            if (r12 == r0) goto L_0x033a
            r11 = 3
            if (r12 == r1) goto L_0x033a
            if (r12 == r11) goto L_0x033a
            r11 = 1
        L_0x033a:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            r2.A0F = r0
            java.lang.Long r0 = r8.A0S
            java.lang.Long r0 = X.C106495Zf.A03(r0, r3)
            r2.A0X = r0
            long r0 = r8.A09
            int r11 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r11 != 0) goto L_0x0350
            r0 = 0
        L_0x0350:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A0O = r0
            long r0 = r8.A01()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Long r0 = X.C106495Zf.A03(r0, r3)
            r2.A0L = r0
            long r0 = r8.A02()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Long r0 = X.C106495Zf.A03(r0, r3)
            r2.A0N = r0
            java.lang.Boolean r0 = r8.A0K
            r2.A00 = r0
            java.lang.Long r0 = r8.A0U
            r2.A0M = r0
            java.lang.String r0 = r8.A0a
            java.lang.Integer r0 = X.C619833a.A00(r0)
            r2.A0C = r0
            int r11 = r7.A02
            r0 = 3
            if (r11 == r0) goto L_0x038b
            r1 = 2
            r0 = 0
            if (r11 != r1) goto L_0x038c
        L_0x038b:
            r0 = 1
        L_0x038c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A01 = r0
            long r0 = r8.A05()
            java.lang.Double r0 = X.C18330xA.A07(r0)
            r2.A06 = r0
            long r0 = r8.A03()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Long r0 = X.C106495Zf.A03(r0, r3)
            r2.A0P = r0
            r0 = 1
            if (r4 == r0) goto L_0x03b2
            r0 = 15
            r11 = 1
            if (r4 != r0) goto L_0x03b3
        L_0x03b2:
            r11 = 0
        L_0x03b3:
            r1 = 0
            if (r11 == 0) goto L_0x0465
            java.lang.String r0 = r8.A0b
        L_0x03b8:
            r2.A0e = r0
            java.lang.String r0 = r8.A0Z
            r2.A0i = r0
            if (r11 == 0) goto L_0x0462
            java.net.URL r0 = r8.A0c
            java.lang.String r0 = X.AnonymousClass0x7.A0q(r0)
        L_0x03c6:
            r2.A0f = r0
            if (r11 == 0) goto L_0x03cc
            java.lang.String r1 = r8.A0Y
        L_0x03cc:
            r2.A0d = r1
            if (r5 == 0) goto L_0x044f
            int r0 = r5.A03
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r0)
            r2.A0U = r0
            long r0 = r5.A07
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Long r0 = X.C106495Zf.A03(r0, r3)
            r2.A0W = r0
            java.lang.String r0 = r5.A0D
            java.lang.Long r0 = X.C18290x4.A0g(r0)
            r2.A0T = r0
        L_0x03ec:
            java.lang.Float r1 = r8.A0N
            if (r1 == 0) goto L_0x0407
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r3 = r1.floatValue()
            float r0 = r0 - r3
            float r1 = java.lang.Math.abs(r0)
            r0 = 1
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0407
            double r0 = (double) r3
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r2.A07 = r0
        L_0x0407:
            java.lang.String r0 = r7.A0F
            java.lang.String r3 = r7.A0L
            int r0 = r6.A09(r0, r3)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A0E = r0
            boolean r0 = r8.A0d
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A02 = r0
            long r0 = r8.A0B
            java.lang.Double r0 = X.C18330xA.A07(r0)
            r2.A08 = r0
            long r0 = r8.A0C
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A0Q = r0
            X.4FV r4 = r6.A0G
            boolean r0 = X.C617832f.A00(r3)
            if (r0 == 0) goto L_0x044b
            X.1VX r3 = r6.A0F
            r1 = 2810(0xafa, float:3.938E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r3.A0Y(r0, r1)
            if (r0 != 0) goto L_0x044b
            X.5ZC r0 = X.C617832f.A04
            r4.BhC(r2, r0)
        L_0x0446:
            r4.BKX()
            goto L_0x00ae
        L_0x044b:
            r4.BhD(r2)
            goto L_0x0446
        L_0x044f:
            java.lang.Long r0 = java.lang.Long.valueOf(r17)
            r2.A0a = r0
            r2.A0U = r0
            r2.A0T = r0
            java.lang.Long r0 = r2.A0b
            java.lang.Long r0 = X.C106495Zf.A03(r0, r3)
            r2.A0W = r0
            goto L_0x03ec
        L_0x0462:
            r0 = r1
            goto L_0x03c6
        L_0x0465:
            r0 = r1
            goto L_0x03b8
        L_0x0468:
            long r11 = r8.A0f
            java.lang.Long r0 = X.C18310x6.A0f(r0, r11)
            goto L_0x0310
        L_0x0470:
            r0 = 3
            if (r12 != r0) goto L_0x02da
            r12 = 4468(0x1174, float:6.261E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r13.A0Y(r0, r12)
            if (r0 == 0) goto L_0x02da
        L_0x047d:
            int r0 = r1.A00
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r0)
            r2.A0R = r0
            int r0 = r1.A01
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r0)
            r2.A0S = r0
            goto L_0x02da
        L_0x048f:
            r15 = -1
            goto L_0x0287
        L_0x0493:
            r0 = 0
            goto L_0x0261
        L_0x0496:
            r0 = 3
            goto L_0x022d
        L_0x049a:
            int r0 = r0.A01
            goto L_0x020a
        L_0x049e:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1I7.A0E(X.35m):void");
    }

    public final void A0J(File file) {
        AnonymousClass1VX r2 = this.A0T;
        int i = this.A0e.A04;
        long length = file.length();
        if (i == 7 && length < C56952sp.A06(r2, 6736) * 1024) {
            try {
                List A002 = C106325Yn.A00(this.A0u.A01(Uri.fromFile(file)));
                if (A002 != null) {
                    C56902sk r1 = this.A0d;
                    Integer A0l2 = AnonymousClass0x9.A0l(A002);
                    synchronized (r1) {
                        r1.A07 = A0l2;
                    }
                }
            } catch (IOException e) {
                Log.e("vcardloader/splitvcards/exception", e);
            }
        }
    }

    public void AwR(AnonymousClass4EV r3) {
        LinkedList linkedList = this.A0y;
        synchronized (linkedList) {
            linkedList.add(r3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0042, code lost:
        if (r3 == false) goto L_0x0044;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Ayd(boolean r12) {
        /*
            r11 = this;
            if (r12 == 0) goto L_0x0005
            r11.A02()
        L_0x0005:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MediaDownload/cancelMediaDownload/mediaHash="
            r1.append(r0)
            X.2dc r4 = r11.A0e
            java.lang.String r0 = r4.A0H
            r1.append(r0)
            r1.append(r0)
            java.lang.String r0 = " url="
            r1.append(r0)
            java.net.URL r0 = r11.A05
            X.C18260x0.A0o(r0, r1)
            java.lang.Object r2 = r11.A0x
            monitor-enter(r2)
            X.1fz r1 = r11.A02     // Catch:{ all -> 0x007b }
            if (r1 == 0) goto L_0x002d
            r0 = 1
            r1.A04(r0)     // Catch:{ all -> 0x007b }
        L_0x002d:
            monitor-exit(r2)     // Catch:{ all -> 0x007b }
            r11.cancel()
            X.2sk r1 = r11.A0d
            java.lang.Boolean r0 = r1.A04()
            r9 = 0
            if (r0 == 0) goto L_0x005d
            java.lang.Boolean r0 = r1.A04()
            boolean r3 = r0.booleanValue()
            if (r3 != 0) goto L_0x0059
        L_0x0044:
            r6 = 0
            r8 = 13
            X.35m r5 = new X.35m
            r7 = r6
            r10 = r9
            r5.<init>(r6, r7, r8, r9, r10)
            int r0 = r4.A01
            r1.A0D(r5, r0, r9)
            r1.A05()
            r11.A0H(r1)
        L_0x0059:
            java.util.LinkedList r2 = r11.A0y
            monitor-enter(r2)
            goto L_0x005f
        L_0x005d:
            r3 = 0
            goto L_0x0044
        L_0x005f:
            java.util.Iterator r1 = r2.iterator()     // Catch:{ all -> 0x0078 }
        L_0x0063:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0078 }
            if (r0 == 0) goto L_0x0073
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0078 }
            X.4EV r0 = (X.AnonymousClass4EV) r0     // Catch:{ all -> 0x0078 }
            r0.BRW(r3)     // Catch:{ all -> 0x0078 }
            goto L_0x0063
        L_0x0073:
            r2.clear()     // Catch:{ all -> 0x0078 }
            monitor-exit(r2)     // Catch:{ all -> 0x0078 }
            return
        L_0x0078:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0078 }
            throw r0
        L_0x007b:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x007b }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1I7.Ayd(boolean):void");
    }

    public int compareTo(Object obj) {
        if (!(obj instanceof AnonymousClass1I7)) {
            return 0;
        }
        long j = ((AnonymousClass1I7) obj).A08;
        long j2 = this.A08;
        if (j < j2) {
            return -1;
        }
        if (j2 >= j) {
            return 0;
        }
        return 1;
    }

    public static boolean A00(C64393Dh r2, File file) {
        File A002 = C64393Dh.A00(r2, AnonymousClass000.A0X(".chck", C18320x8.A0l(file)));
        if (A002.exists() && !A002.delete()) {
            C18260x0.A1S(AnonymousClass001.A0o(), "MediaDownload/MMS failed to delete stream check success file ", A002);
        }
        return file.delete();
    }

    public void A02() {
        super.A02();
        this.A0K.A02();
        this.A0I.A02();
        this.A0L.A02();
        this.A0H.A02();
        this.A0G.A02();
        this.A0J.A02();
    }

    public final void A0F(C625435m r5) {
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("MediaDownload/updateMessageAfterDownload/mediaHash=");
        C47662dc r3 = this.A0e;
        A0o2.append(r3.A0H);
        A0o2.append(" url=");
        A0o2.append(AnonymousClass0x7.A0q(this.A0h.A0c));
        C18260x0.A1R(A0o2, " status=", r5);
        if (this.A14) {
            this.A0k.A07(this.A0j);
        }
        this.A0d.A0D(r5, r3.A01, AnonymousClass000.A1T(r5.A01));
    }

    public final void A0G(C625435m r7) {
        AnonymousClass4FS r1;
        int i;
        int i2;
        A0F(r7);
        C56742sU r2 = this.A0o;
        if (r2 != null) {
            int i3 = r7.A01;
            boolean A022 = C625435m.A02(i3);
            synchronized (r2) {
                r2.A0C = A022;
                r2.A02 = i3;
            }
            r2.A06(4);
            synchronized (r2) {
                r2.A0G.clear();
            }
        }
        if (this.A0T.A0Y(C58422vE.A02, 6039)) {
            r1 = this.A0t;
            i = 32;
        } else {
            File file = this.A03;
            if (file != null && file.length() == 0) {
                r1 = this.A0t;
                i = 28;
            }
            i2 = r7.A01;
            if (i2 == 5 || i2 == 12 || i2 == 4) {
                this.A0d.A05();
            }
            return;
        }
        C71533cG.A00(r1, this, i);
        i2 = r7.A01;
        if (!(i2 == 5 || i2 == 12)) {
        }
        this.A0d.A05();
    }

    public void A0H(C56902sk r3) {
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("MediaDownload/publishDownloadDataWhenComplete; mediaHash=");
        A0o2.append(this.A0e.A0H);
        C18260x0.A1L(A0o2, C18300x5.A0k(r3, " downloadData=", A0o2));
        this.A0G.A05(r3.A02());
    }

    public AnonymousClass1I7(ConditionVariable conditionVariable, C55682qk r11, C64393Dh r12, C69263Wi r13, AnonymousClass36E r14, Mp4Ops mp4Ops, C56492s4 r16, C153407bG r17, C56612sH r18, C54292oU r19, C61072zf r20, C60872zJ r21, AnonymousClass2ZV r22, AnonymousClass319 r23, AnonymousClass1VX r24, AnonymousClass4FV r25, C55002pd r26, C54672p6 r27, C55972rD r28, C60132y3 r29, C54882pR r30, AnonymousClass2YR r31, C55812qx r32, C55572qZ r33, C47662dc r34, Magi magi, C162287rd r36, C60152y5 r37, C29011i8 r38, AnonymousClass1R1 r39, WebpUtils webpUtils, C45122Yt r41, C107105ah r42, C989053r r43, C59132wP r44, C107085af r45, AnonymousClass4FS r46, AnonymousClass5TD r47, AnonymousClass2JB r48, C34171uL r49, int i, int i2, long j, boolean z) {
        C56852sf r1;
        boolean z2 = true;
        AnonymousClass3XB A002 = AnonymousClass3XB.A00();
        this.A0H = A002;
        this.A0G = AnonymousClass3XB.A00();
        boolean z3 = false;
        this.A0j = new C86514Kk(this, 0);
        this.A0x = AnonymousClass002.A0D();
        this.A0f = magi;
        this.A0N = r18;
        this.A0D = mp4Ops;
        this.A0T = r24;
        this.A0O = r19;
        this.A0A = r11;
        this.A0t = r46;
        this.A0m = webpUtils;
        this.A0B = r12;
        this.A0E = r16;
        this.A0U = r25;
        this.A0v = r48;
        this.A0u = r47;
        this.A0X = r28;
        this.A0P = r20;
        this.A0Q = r21;
        this.A0k = r38;
        this.A0p = r42;
        this.A0n = r41;
        this.A0C = r14;
        this.A0g = r36;
        this.A0s = r45;
        this.A0q = r43;
        this.A0w = r49;
        this.A0Y = r29;
        this.A0F = r17;
        this.A0l = r39;
        this.A0S = r23;
        this.A0b = r32;
        this.A0c = r33;
        this.A0r = r44;
        this.A0W = r27;
        this.A0R = r22;
        this.A0V = r26;
        this.A0i = r37;
        this.A09 = conditionVariable;
        this.A0a = r31;
        C47662dc r7 = r34;
        this.A0e = r7;
        this.A12 = i;
        this.A0Z = r30;
        int i3 = r7.A03;
        boolean A1U = AnonymousClass000.A1U(i3, 3);
        this.A11 = A1U;
        C633138t r5 = r7.A0A;
        int i4 = this.A12;
        if (A1U) {
            r1 = new C28231fw(r5, i4);
        } else {
            C162457s7.A0J(r5, 1);
            r1 = new C56852sf(r5, i4);
        }
        this.A0h = r1;
        r1.A0e = AnonymousClass000.A1T(i3);
        this.A13 = false;
        this.A08 = j;
        this.A07 = i2;
        this.A0d = new C56902sk();
        StringBuilder A0o2 = AnonymousClass001.A0o();
        C47662dc.A00(r7, "MediaDownload/initialized;mediaHash=", A0o2);
        A0o2.append(" autoDownload=");
        A0o2.append(this.A12);
        A0o2.append(" streamable=");
        int i5 = r7.A02;
        z3 = (i5 == 3 || i5 == 2) ? true : z3;
        C18260x0.A1V(A0o2, z3);
        AnonymousClass92X r0 = new AnonymousClass92X(this, 7);
        Executor executor = r13.A08;
        A04(r0, executor);
        this.A00.A04(new C86234Ji(this, 15), executor);
        this.A00.A04(new AnonymousClass92X(this, 8), executor);
        if (z3) {
            C56742sU r52 = new C56742sU();
            this.A0o = r52;
            long j2 = r7.A07;
            synchronized (r52) {
                r52.A04 = j2;
            }
        } else {
            this.A0o = null;
        }
        if (!(2 == this.A12 || 3 == this.A12)) {
            z2 = false;
        }
        A002.A05(new AnonymousClass2LK(z2, z3));
        this.A06 = z;
    }
}
