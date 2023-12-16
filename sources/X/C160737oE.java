package X;

import android.content.Context;
import android.net.Uri;
import com.facebook.exoplayer.monitor.VpsEventCallback;
import com.facebook.video.heroplayer.common.GlobalPlayerStateMonitor;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.7oE  reason: invalid class name and case insensitive filesystem */
public class C160737oE {
    public C180378kw A00;
    public AnonymousClass82Z A01;
    public final Context A02;
    public final AnonymousClass7UA A03;
    public final AnonymousClass71E A04;
    public final AnonymousClass0Xd A05;
    public final C146567At A06;
    public final C146587Av A07;
    public final C161397pY A08;
    public final AnonymousClass8LG A09;
    public final C1445071v A0A;
    public final Object A0B = AnonymousClass002.A0D();
    public final Map A0C;
    public final Map A0D;
    public final Queue A0E;
    public final AtomicReference A0F;
    public final AtomicReference A0G;

    /* JADX WARNING: Can't wrap try/catch for region: R(5:42|43|(2:45|(1:48))|49|50) */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a2, code lost:
        if (r1.equals("TPM171E") == false) goto L_0x00fc;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00f0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int[] A02(android.content.Context r17, X.C187008wI r18, X.C152767a5 r19, X.C150857Sm r20, java.util.List r21, boolean r22) {
        /*
            r2 = 0
            r6 = r20
            r16 = r19
            java.lang.String r0 = "window"
            r4 = r17
            java.lang.Object r0 = r4.getSystemService(r0)     // Catch:{ 6yN -> 0x022a }
            android.view.WindowManager r0 = (android.view.WindowManager) r0     // Catch:{ 6yN -> 0x022a }
            if (r0 != 0) goto L_0x0027
            r0 = -1
            android.graphics.Point r10 = new android.graphics.Point     // Catch:{ 6yN -> 0x022a }
            r10.<init>(r0, r0)     // Catch:{ 6yN -> 0x022a }
        L_0x0017:
            java.util.ArrayList r7 = X.AnonymousClass001.A0s()     // Catch:{ 6yN -> 0x022a }
            r8 = r21
            int r9 = r8.size()     // Catch:{ 6yN -> 0x022a }
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()     // Catch:{ 6yN -> 0x022a }
            goto L_0x010f
        L_0x0027:
            android.view.Display r7 = r0.getDefaultDisplay()     // Catch:{ 6yN -> 0x022a }
            java.lang.String r8 = "Util"
            if (r7 != 0) goto L_0x0036
            r0 = -1
            android.graphics.Point r10 = new android.graphics.Point     // Catch:{ 6yN -> 0x022a }
            r10.<init>(r0, r0)     // Catch:{ 6yN -> 0x022a }
            goto L_0x0017
        L_0x0036:
            int r5 = com.facebook.android.exoplayer2.util.Util.A00     // Catch:{ 6yN -> 0x022a }
            r0 = 25
            if (r5 >= r0) goto L_0x00fc
            int r0 = r7.getDisplayId()     // Catch:{ 6yN -> 0x022a }
            if (r0 != 0) goto L_0x00fc
            java.lang.String r3 = com.facebook.android.exoplayer2.util.Util.A03     // Catch:{ 6yN -> 0x022a }
            java.lang.String r0 = "Sony"
            boolean r0 = r0.equals(r3)     // Catch:{ 6yN -> 0x022a }
            if (r0 == 0) goto L_0x006c
            java.lang.String r1 = com.facebook.android.exoplayer2.util.Util.A04     // Catch:{ 6yN -> 0x022a }
            java.lang.String r0 = "BRAVIA"
            boolean r0 = r1.startsWith(r0)     // Catch:{ 6yN -> 0x022a }
            if (r0 == 0) goto L_0x006c
            android.content.pm.PackageManager r1 = r4.getPackageManager()     // Catch:{ 6yN -> 0x022a }
            java.lang.String r0 = "com.sony.dtv.hardware.panel.qfhd"
            boolean r0 = r1.hasSystemFeature(r0)     // Catch:{ 6yN -> 0x022a }
            if (r0 == 0) goto L_0x006c
            r1 = 3840(0xf00, float:5.381E-42)
            r0 = 2160(0x870, float:3.027E-42)
            android.graphics.Point r10 = new android.graphics.Point     // Catch:{ 6yN -> 0x022a }
            r10.<init>(r1, r0)     // Catch:{ 6yN -> 0x022a }
            goto L_0x0017
        L_0x006c:
            java.lang.String r0 = "NVIDIA"
            boolean r0 = r0.equals(r3)     // Catch:{ 6yN -> 0x022a }
            if (r0 == 0) goto L_0x007e
            java.lang.String r1 = com.facebook.android.exoplayer2.util.Util.A04     // Catch:{ 6yN -> 0x022a }
            java.lang.String r0 = "SHIELD"
            boolean r0 = r1.contains(r0)     // Catch:{ 6yN -> 0x022a }
            if (r0 != 0) goto L_0x00a4
        L_0x007e:
            java.lang.String r1 = "philips"
            java.lang.String r0 = X.C1447272s.A00(r3)     // Catch:{ 6yN -> 0x022a }
            boolean r0 = r1.equals(r0)     // Catch:{ 6yN -> 0x022a }
            if (r0 == 0) goto L_0x00fc
            java.lang.String r1 = com.facebook.android.exoplayer2.util.Util.A04     // Catch:{ 6yN -> 0x022a }
            java.lang.String r0 = "QM1"
            boolean r0 = r1.startsWith(r0)     // Catch:{ 6yN -> 0x022a }
            if (r0 != 0) goto L_0x00a4
            java.lang.String r0 = "QV151E"
            boolean r0 = r1.equals(r0)     // Catch:{ 6yN -> 0x022a }
            if (r0 != 0) goto L_0x00a4
            java.lang.String r0 = "TPM171E"
            boolean r0 = r1.equals(r0)     // Catch:{ 6yN -> 0x022a }
            if (r0 == 0) goto L_0x00fc
        L_0x00a4:
            r9 = 1
            java.lang.String r0 = "android.os.SystemProperties"
            java.lang.Class r4 = java.lang.Class.forName(r0)     // Catch:{ Exception -> 0x00c2 }
            java.lang.String r3 = "get"
            java.lang.Class[] r1 = new java.lang.Class[r9]     // Catch:{ Exception -> 0x00c2 }
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.reflect.Method r3 = X.AnonymousClass001.A0r(r4, r0, r3, r1, r2)     // Catch:{ Exception -> 0x00c2 }
            java.lang.Object[] r1 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x00c2 }
            java.lang.String r0 = "sys.display-size"
            r1[r2] = r0     // Catch:{ Exception -> 0x00c2 }
            java.lang.Object r4 = r3.invoke(r4, r1)     // Catch:{ Exception -> 0x00c2 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x00c2 }
            goto L_0x00c9
        L_0x00c2:
            r1 = move-exception
            java.lang.String r0 = "Failed to read sys.display-size"
            android.util.Log.e(r8, r0, r1)     // Catch:{ 6yN -> 0x022a }
            r4 = 0
        L_0x00c9:
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch:{ 6yN -> 0x022a }
            if (r0 != 0) goto L_0x00fc
            java.lang.String r1 = r4.trim()     // Catch:{ NumberFormatException -> 0x00f0 }
            java.lang.String r0 = "x"
            java.lang.String[] r3 = r1.split(r0)     // Catch:{ NumberFormatException -> 0x00f0 }
            int r1 = r3.length     // Catch:{ NumberFormatException -> 0x00f0 }
            r0 = 2
            if (r1 != r0) goto L_0x00f0
            int r1 = X.AnonymousClass6CA.A0F(r3, r2)     // Catch:{ NumberFormatException -> 0x00f0 }
            int r0 = X.AnonymousClass6CA.A0F(r3, r9)     // Catch:{ NumberFormatException -> 0x00f0 }
            if (r1 <= 0) goto L_0x00f0
            if (r0 <= 0) goto L_0x00f0
            android.graphics.Point r10 = new android.graphics.Point     // Catch:{ NumberFormatException -> 0x00f0 }
            r10.<init>(r1, r0)     // Catch:{ NumberFormatException -> 0x00f0 }
            goto L_0x0017
        L_0x00f0:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 6yN -> 0x022a }
            java.lang.String r0 = "Invalid sys.display-size: "
            r1.append(r0)     // Catch:{ 6yN -> 0x022a }
            X.AnonymousClass000.A1D(r4, r8, r1)     // Catch:{ 6yN -> 0x022a }
        L_0x00fc:
            android.graphics.Point r10 = new android.graphics.Point     // Catch:{ 6yN -> 0x022a }
            r10.<init>()     // Catch:{ 6yN -> 0x022a }
            r0 = 23
            if (r5 < r0) goto L_0x010a
            com.facebook.android.exoplayer2.util.Util.A09(r10, r7)     // Catch:{ 6yN -> 0x022a }
            goto L_0x0017
        L_0x010a:
            r7.getRealSize(r10)     // Catch:{ 6yN -> 0x022a }
            goto L_0x0017
        L_0x010f:
            r3 = 0
            r5 = 2147483647(0x7fffffff, float:NaN)
        L_0x0113:
            if (r3 >= r9) goto L_0x01b3
            java.lang.Object r0 = r8.get(r3)     // Catch:{ 6yN -> 0x022a }
            X.7aP r0 = (X.C152937aP) r0     // Catch:{ 6yN -> 0x022a }
            X.7z1 r12 = r0.A00     // Catch:{ 6yN -> 0x022a }
            r0 = r22
            r1 = r18
            int r2 = X.C125856Jt.A02(r12, r1, r0, r2)     // Catch:{ 6yN -> 0x022a }
            boolean r0 = X.AnonymousClass6C8.A1O(r2)
            if (r0 == 0) goto L_0x017c
            X.C18270x1.A1K(r7, r3)     // Catch:{ 6yN -> 0x022a }
            int r14 = r12.A0I     // Catch:{ 6yN -> 0x022a }
            if (r14 <= 0) goto L_0x01ae
            int r13 = r12.A09     // Catch:{ 6yN -> 0x022a }
            if (r13 <= 0) goto L_0x01ae
            int r11 = r10.x     // Catch:{ 6yN -> 0x022a }
            if (r11 <= 0) goto L_0x01ae
            int r15 = r10.y     // Catch:{ 6yN -> 0x022a }
            if (r15 <= 0) goto L_0x01ae
            r2 = r15
            r1 = 1
            boolean r0 = X.C86624Kv.A1W(r14, r13)
            if (r11 > r15) goto L_0x0147
            r1 = 0
        L_0x0147:
            if (r0 != r1) goto L_0x014b
            r2 = r11
            r11 = r15
        L_0x014b:
            int r1 = r14 * r11
            int r0 = r13 * r2
            if (r1 < r0) goto L_0x015b
            int r0 = r0 + r14
            int r0 = r0 + -1
            int r0 = r0 / r14
            android.graphics.Point r14 = new android.graphics.Point     // Catch:{ 6yN -> 0x022a }
            r14.<init>(r2, r0)     // Catch:{ 6yN -> 0x022a }
            goto L_0x0164
        L_0x015b:
            int r1 = r1 + r13
            int r0 = r1 + -1
            int r0 = r0 / r13
            android.graphics.Point r14 = new android.graphics.Point     // Catch:{ 6yN -> 0x022a }
            r14.<init>(r0, r11)     // Catch:{ 6yN -> 0x022a }
        L_0x0164:
            int r13 = r12.A0I     // Catch:{ 6yN -> 0x022a }
            int r11 = r12.A09     // Catch:{ 6yN -> 0x022a }
            int r2 = r13 * r11
            int r0 = r14.x     // Catch:{ 6yN -> 0x022a }
            float r0 = (float) r0     // Catch:{ 6yN -> 0x022a }
            r1 = 1065017672(0x3f7ae148, float:0.98)
            float r0 = r0 * r1
            int r0 = (int) r0     // Catch:{ 6yN -> 0x022a }
            if (r13 < r0) goto L_0x01ae
            int r0 = r14.y     // Catch:{ 6yN -> 0x022a }
            float r0 = (float) r0     // Catch:{ 6yN -> 0x022a }
            float r0 = r0 * r1
            int r0 = (int) r0     // Catch:{ 6yN -> 0x022a }
            if (r11 < r0) goto L_0x01ae
            goto L_0x01ab
        L_0x017c:
            java.lang.String r11 = "rendererSupportsFormatResult=%s, Format=%s"
            java.lang.String r1 = ""
            if (r2 == 0) goto L_0x0192
            r0 = 1
            if (r2 == r0) goto L_0x018f
            r0 = 2
            if (r2 == r0) goto L_0x018c
            r0 = 3
            if (r2 != r0) goto L_0x0197
            goto L_0x0195
        L_0x018c:
            java.lang.String r1 = "FORMAT_UNSUPPORTED_DRM"
            goto L_0x0197
        L_0x018f:
            java.lang.String r1 = "FORMAT_UNSUPPORTED_SUBTYPE"
            goto L_0x0197
        L_0x0192:
            java.lang.String r1 = "FORMAT_UNSUPPORTED_TYPE"
            goto L_0x0197
        L_0x0195:
            java.lang.String r1 = "FORMAT_EXCEEDS_CAPABILITIES"
        L_0x0197:
            r0 = 2
            java.lang.Object[] r2 = X.AnonymousClass6C9.A1Z(r1, r0)     // Catch:{ 6yN -> 0x022a }
            java.lang.String r1 = r12.toString()     // Catch:{ 6yN -> 0x022a }
            r0 = 1
            r2[r0] = r1     // Catch:{ 6yN -> 0x022a }
            java.lang.String r0 = java.lang.String.format(r11, r2)     // Catch:{ 6yN -> 0x022a }
            r4.add(r0)     // Catch:{ 6yN -> 0x022a }
            goto L_0x01ae
        L_0x01ab:
            if (r2 >= r5) goto L_0x01ae
            r5 = r2
        L_0x01ae:
            int r3 = r3 + 1
            r2 = 0
            goto L_0x0113
        L_0x01b3:
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r5 == r0) goto L_0x01e2
            int r3 = r7.size()     // Catch:{ 6yN -> 0x022a }
            r0 = 1
            int r3 = r3 - r0
        L_0x01be:
            if (r3 < 0) goto L_0x01e2
            int r0 = X.C86614Ku.A07(r7, r3)     // Catch:{ 6yN -> 0x022a }
            java.lang.Object r0 = r8.get(r0)     // Catch:{ 6yN -> 0x022a }
            X.7aP r0 = (X.C152937aP) r0     // Catch:{ 6yN -> 0x022a }
            X.7z1 r0 = r0.A00     // Catch:{ 6yN -> 0x022a }
            int r2 = r0.A0I     // Catch:{ 6yN -> 0x022a }
            r1 = -1
            if (r2 == r1) goto L_0x01d7
            int r0 = r0.A09     // Catch:{ 6yN -> 0x022a }
            if (r0 == r1) goto L_0x01d7
            int r1 = r2 * r0
        L_0x01d7:
            r0 = -1
            if (r1 == r0) goto L_0x01dc
            if (r1 <= r5) goto L_0x01df
        L_0x01dc:
            r7.remove(r3)     // Catch:{ 6yN -> 0x022a }
        L_0x01df:
            int r3 = r3 + -1
            goto L_0x01be
        L_0x01e2:
            boolean r0 = r7.isEmpty()     // Catch:{ 6yN -> 0x022a }
            if (r0 == 0) goto L_0x0218
            java.lang.String r3 = "manifestId=%s, errors=%s"
            r0 = 2
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ 6yN -> 0x01ee }
            goto L_0x01f0
        L_0x01ee:
            r3 = move-exception
            goto L_0x022c
        L_0x01f0:
            r0 = r16
            java.lang.String r1 = r0.A07     // Catch:{ 6yN -> 0x022a }
            r0 = 0
            r2[r0] = r1     // Catch:{ 6yN -> 0x022a }
            java.lang.String r1 = r4.toString()     // Catch:{ 6yN -> 0x022a }
            r0 = 1
            r2[r0] = r1     // Catch:{ 6yN -> 0x022a }
            java.lang.String r5 = java.lang.String.format(r3, r2)     // Catch:{ 6yN -> 0x022a }
            com.facebook.exoplayer.monitor.VpsEventCallback r4 = r6.A00     // Catch:{ 6yN -> 0x022a }
            X.7yW r0 = r6.A01     // Catch:{ 6yN -> 0x022a }
            X.7yv r0 = r0.A0E     // Catch:{ 6yN -> 0x022a }
            java.lang.String r3 = r0.A0H     // Catch:{ 6yN -> 0x022a }
            if (r3 == 0) goto L_0x0218
            java.lang.String r2 = "MANIFEST"
            java.lang.String r1 = "FALLBACK_TRIGGERED"
            X.6Nr r0 = new X.6Nr     // Catch:{ 6yN -> 0x022a }
            r0.<init>(r3, r2, r1, r5)     // Catch:{ 6yN -> 0x022a }
            r4.AyO(r0)     // Catch:{ 6yN -> 0x022a }
        L_0x0218:
            int r3 = r7.size()     // Catch:{ 6yN -> 0x022a }
            int[] r2 = new int[r3]     // Catch:{ 6yN -> 0x022a }
            r1 = 0
        L_0x021f:
            if (r1 >= r3) goto L_0x0259
            int r0 = X.C86614Ku.A07(r7, r1)     // Catch:{ 6yN -> 0x022a }
            r2[r1] = r0     // Catch:{ 6yN -> 0x022a }
            int r1 = r1 + 1
            goto L_0x021f
        L_0x022a:
            r3 = move-exception
            r0 = 2
        L_0x022c:
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r0 = r16
            java.lang.String r1 = r0.A07
            r0 = 0
            r2[r0] = r1
            java.lang.String r1 = r3.toString()
            r0 = 1
            r2[r0] = r1
            java.lang.String r0 = "manifestId=%s, exception=%s"
            java.lang.String r5 = java.lang.String.format(r0, r2)
            com.facebook.exoplayer.monitor.VpsEventCallback r4 = r6.A00
            X.7yW r0 = r6.A01
            X.7yv r0 = r0.A0E
            java.lang.String r3 = r0.A0H
            if (r3 == 0) goto L_0x0258
            java.lang.String r2 = "MANIFEST"
            java.lang.String r1 = "FALLBACK_TRIGGERED"
            X.6Nr r0 = new X.6Nr
            r0.<init>(r3, r2, r1, r5)
            r4.AyO(r0)
        L_0x0258:
            r2 = 0
        L_0x0259:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C160737oE.A02(android.content.Context, X.8wI, X.7a5, X.7Sm, java.util.List, boolean):int[]");
    }

    public void A06(C152937aP r22, C141886wI r23, VpsEventCallback vpsEventCallback, C187458xF r25, C166337yW r26, String str, String str2, boolean z, boolean z2, boolean z3) {
        C141696vz r1 = C141696vz.PROGRESSIVE;
        C166337yW r13 = r26;
        C166577yv r5 = r13.A0E;
        if (r1 == r5.A07 && r13.A02 == 0) {
            r13.A02 = this.A09.progressivePrefetchBytesCell;
        }
        AnonymousClass8LG r14 = this.A09;
        C126456Ny r7 = new C126456Ny(r22, r23, vpsEventCallback, r25, this.A05, r13, r14, this.A0A, str, str2, z, z2, z3);
        C161157p6.A01("UnifiedPrefetchManager", "video: %s queuing prefetch task, from origin %s subOrigin %s with tag %s and module %s", str, r5.A0B, r5.A0C, r13.A0P, r13.A0O);
        if (r14.abrSetting.enableDelayedPrefetchQualitySelection) {
            r7.A02();
            r7.A01();
            return;
        }
        A08(r13.A0D, r7);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v0, resolved type: X.7aP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: X.707} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: X.80z} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: X.7aP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: X.7aP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: X.7aP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v1, resolved type: X.7J6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v2, resolved type: X.703} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r37v2, resolved type: X.7FL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v2, resolved type: X.707} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v2, resolved type: X.8gE} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v2, resolved type: X.7FL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: X.7aP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v4, resolved type: X.7yW} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v4, resolved type: X.7aP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: X.7aP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v5, resolved type: X.7aP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v12, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v13, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v41, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v14, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v15, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v6, resolved type: X.7aP} */
    /* JADX WARNING: type inference failed for: r4v4, types: [java.lang.Object, X.7aP] */
    /* JADX WARNING: type inference failed for: r2v102, types: [X.8kw] */
    /* JADX WARNING: type inference failed for: r31v3, types: [X.8vL] */
    /* JADX WARNING: type inference failed for: r19v2 */
    /* JADX WARNING: type inference failed for: r19v3 */
    /* JADX WARNING: type inference failed for: r29v11, types: [X.82Z] */
    /* JADX WARNING: type inference failed for: r29v12, types: [X.82Y] */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0308, code lost:
        r15 = r3.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x0516, code lost:
        if (r12 == false) goto L_0x0519;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x0538, code lost:
        if (r2.contains(r11) != false) goto L_0x053a;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A07(com.facebook.exoplayer.monitor.VpsEventCallback r75, X.C166337yW r76) {
        /*
            r74 = this;
            r7 = 0
            r5 = r76
            X.7yv r10 = r5.A0E     // Catch:{ 6yQ -> 0x07bd }
            if (r10 == 0) goto L_0x0009
            java.lang.String r7 = r10.A0H     // Catch:{ 6yQ -> 0x07bd }
        L_0x0009:
            r1 = r74
            X.8LG r0 = r1.A09     // Catch:{ 6yQ -> 0x07bd }
            boolean r6 = r0.parseManifestIdentifier     // Catch:{ 6yQ -> 0x07bd }
            boolean r3 = r0.enableDashManifestPool     // Catch:{ 6yQ -> 0x07bd }
            int r2 = r0.dashManifestPoolSize     // Catch:{ 6yQ -> 0x07bd }
            X.8g3 r4 = new X.8g3     // Catch:{ 6yQ -> 0x07bd }
            r4.<init>(r7, r2, r6, r3)     // Catch:{ 6yQ -> 0x07bd }
            android.net.Uri r3 = r10.A05     // Catch:{ 6yQ -> 0x07bd }
            java.lang.String r2 = r10.A0A     // Catch:{ 6yQ -> 0x07bd }
            X.7a5 r6 = X.C153957cL.A01(r3, r4, r2)     // Catch:{ 6yQ -> 0x07bd }
            if (r6 == 0) goto L_0x07c8
            java.lang.String r2 = r10.A0H
            r20 = r2
            r73 = r75
            X.7Av r7 = r1.A07     // Catch:{ 6zR -> 0x003d }
            boolean r4 = r0.proxyDrmProvisioningRequests     // Catch:{ 6zR -> 0x003d }
            boolean r3 = r0.enableDrmProvisioningRetry     // Catch:{ 6zR -> 0x003d }
            boolean r2 = r0.removeGifPrefixForDRMKeyRequest     // Catch:{ 6zR -> 0x003d }
            r11 = r6
            r12 = r7
            r13 = r20
            r14 = r4
            r15 = r3
            r16 = r2
            X.8tG r23 = X.C161047ou.A00(r11, r12, r13, r14, r15, r16)     // Catch:{ 6zR -> 0x003d }
            goto L_0x0061
        L_0x003d:
            r4 = move-exception
            java.lang.String r8 = "DRM"
            java.lang.String r7 = "CANT_INITIALIZE_DRM_WITH_MANIFEST"
            java.lang.String r2 = "Device: "
            java.lang.StringBuilder r3 = X.C18330xA.A0A(r2)
            java.lang.String r2 = android.os.Build.MODEL
            r3.append(r2)
            java.lang.String r2 = "; Exception: "
            java.lang.String r4 = X.AnonymousClass000.A0a(r2, r3, r4)
            X.6Nr r3 = new X.6Nr
            r2 = r20
            r3.<init>(r2, r8, r7, r4)
            r2 = r73
            r2.AyO(r3)
            r23 = 0
        L_0x0061:
            X.8L1 r2 = r0.abrSetting
            boolean r2 = r2.shouldFilterHardwareCapabilities
            if (r2 == 0) goto L_0x00d1
            android.content.Context r14 = r1.A02
        L_0x0069:
            boolean r13 = r0.prefetchBypassFilter
            X.8wI r25 = X.C187008wI.A00
            boolean r15 = r0.ignoreEmptyProfileLevels
            X.7Sm r12 = new X.7Sm
            r2 = r73
            r12.<init>(r2, r5, r1)
            boolean r2 = r0.enableMixedCodecManifestSupport
            if (r2 == 0) goto L_0x011f
            r19 = 0
            java.util.List r2 = r6.A0A
            r41 = r2
            int r2 = r41.size()
            r11 = 1
            if (r2 < r11) goto L_0x07c8
            r9 = 0
            r2 = r41
            java.lang.Object r2 = r2.get(r9)
            X.7Se r2 = (X.C150777Se) r2
            java.util.ArrayList r8 = X.AnonymousClass001.A0s()
            java.util.ArrayList r7 = X.AnonymousClass001.A0s()
            java.util.List r2 = r2.A01
            java.util.Iterator r16 = r2.iterator()
        L_0x009e:
            boolean r2 = r16.hasNext()
            if (r2 == 0) goto L_0x00d3
            java.lang.Object r4 = r16.next()
            X.7PZ r4 = (X.AnonymousClass7PZ) r4
            int r3 = r4.A00
            if (r3 == r11) goto L_0x00c1
            r2 = 2
            if (r3 != r2) goto L_0x009e
            java.util.List r2 = r4.A05
            java.util.Iterator r2 = r2.iterator()
        L_0x00b7:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x009e
            X.C18310x6.A1R(r8, r2)
            goto L_0x00b7
        L_0x00c1:
            java.util.List r2 = r4.A05
            java.util.Iterator r2 = r2.iterator()
        L_0x00c7:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x009e
            X.C18310x6.A1R(r7, r2)
            goto L_0x00c7
        L_0x00d1:
            r14 = 0
            goto L_0x0069
        L_0x00d3:
            boolean r2 = r8.isEmpty()
            if (r2 != 0) goto L_0x0103
            if (r13 != 0) goto L_0x0103
            if (r14 == 0) goto L_0x0103
            r24 = r14
            r26 = r6
            r27 = r12
            r28 = r8
            r29 = r15
            int[] r11 = A02(r24, r25, r26, r27, r28, r29)
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
            if (r11 == 0) goto L_0x0102
            int r3 = r11.length
            if (r3 <= 0) goto L_0x0102
        L_0x00f4:
            r2 = r11[r9]
            java.lang.Object r2 = r8.get(r2)
            r4.add(r2)
            int r9 = r9 + 1
            if (r9 >= r3) goto L_0x0102
            goto L_0x00f4
        L_0x0102:
            r8 = r4
        L_0x0103:
            boolean r2 = r8.isEmpty()
            if (r2 == 0) goto L_0x010b
            r8 = r19
        L_0x010b:
            boolean r2 = r7.isEmpty()
            if (r2 == 0) goto L_0x0113
            r7 = r19
        L_0x0113:
            if (r8 != 0) goto L_0x0118
            if (r7 != 0) goto L_0x0118
            return
        L_0x0118:
            X.7Fl r3 = new X.7Fl
            r3.<init>(r8, r7)
            goto L_0x01b2
        L_0x011f:
            r19 = 0
            java.util.List r2 = r6.A0A
            r41 = r2
            int r2 = r41.size()
            r11 = 1
            if (r2 < r11) goto L_0x07c8
            r9 = 0
            r2 = r41
            java.lang.Object r2 = r2.get(r9)
            X.7Se r2 = (X.C150777Se) r2
            java.util.List r2 = r2.A01
            java.util.Iterator r16 = r2.iterator()
            r8 = r19
            r7 = r8
        L_0x013e:
            boolean r2 = r16.hasNext()
            if (r2 == 0) goto L_0x0159
            java.lang.Object r4 = r16.next()
            X.7PZ r4 = (X.AnonymousClass7PZ) r4
            int r3 = r4.A00
            if (r3 == r11) goto L_0x0155
            r2 = 2
            if (r3 != r2) goto L_0x013e
            if (r8 != 0) goto L_0x013e
            r8 = r4
            goto L_0x013e
        L_0x0155:
            if (r7 != 0) goto L_0x013e
            r7 = r4
            goto L_0x013e
        L_0x0159:
            if (r8 == 0) goto L_0x018e
            java.util.List r3 = r8.A05
            if (r3 == 0) goto L_0x018e
            boolean r2 = r3.isEmpty()
            if (r2 != 0) goto L_0x018e
            if (r13 != 0) goto L_0x0191
            if (r14 == 0) goto L_0x0191
            r24 = r14
            r26 = r6
            r27 = r12
            r28 = r3
            r29 = r15
            int[] r8 = A02(r24, r25, r26, r27, r28, r29)
            java.util.ArrayList r11 = X.AnonymousClass001.A0s()
            if (r8 == 0) goto L_0x0192
            int r4 = r8.length
            if (r4 <= 0) goto L_0x0192
        L_0x0180:
            r2 = r8[r9]
            java.lang.Object r2 = r3.get(r2)
            r11.add(r2)
            int r9 = r9 + 1
            if (r9 >= r4) goto L_0x0192
            goto L_0x0180
        L_0x018e:
            r11 = r19
            goto L_0x0192
        L_0x0191:
            r11 = r3
        L_0x0192:
            if (r7 == 0) goto L_0x019e
            java.util.List r4 = r7.A05
            if (r4 == 0) goto L_0x019e
            boolean r2 = r4.isEmpty()
            if (r2 == 0) goto L_0x01a0
        L_0x019e:
            r4 = r19
        L_0x01a0:
            if (r11 == 0) goto L_0x01aa
            boolean r2 = r11.isEmpty()
            if (r2 == 0) goto L_0x01ad
            r11 = r19
        L_0x01aa:
            if (r4 != 0) goto L_0x01ad
            return
        L_0x01ad:
            X.7Fl r3 = new X.7Fl
            r3.<init>(r11, r4)
        L_0x01b2:
            java.util.List r2 = r3.A01
            r25 = r2
            if (r2 == 0) goto L_0x01be
            boolean r2 = r25.isEmpty()
            if (r2 == 0) goto L_0x01e9
        L_0x01be:
            boolean r2 = r0.enableProgressivePrefetchWhenNoRepresentations
            if (r2 == 0) goto L_0x01e9
            java.lang.String r3 = "UnifiedPrefetchManager"
            java.lang.Object[] r2 = X.AnonymousClass002.A0L()
            r14 = 0
            r2[r14] = r20
            java.lang.String r0 = "video: %s has no valid video rep. Falling back to progressive"
            X.C161157p6.A01(r3, r0, r2)
            X.6vz r0 = X.C141696vz.PROGRESSIVE
            r10.A07 = r0
            X.8xF r0 = r5.A0A
            X.6wI r8 = X.C141886wI.HIGH
            r13 = r19
            r16 = r14
            r6 = r1
            r7 = r13
            r9 = r73
            r10 = r0
            r11 = r5
            r12 = r20
            r15 = r14
            r6.A06(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x01e9:
            boolean r2 = r0.getPlaybackPrefFromPrefetchRequest
            X.7Zl r8 = new X.7Zl
            r8.<init>()
            boolean r12 = r10.A0O
            if (r2 == 0) goto L_0x0214
            r8.A00(r12)
            if (r20 == 0) goto L_0x01fb
            monitor-enter(r8)
            monitor-exit(r8)
        L_0x01fb:
            boolean r2 = r10.A0P
            monitor-enter(r8)
            r8.A05 = r2     // Catch:{ all -> 0x07ba }
            monitor-exit(r8)
            java.lang.String r2 = r10.A0B
            if (r2 == 0) goto L_0x0209
            monitor-enter(r8)
            r8.A00 = r2     // Catch:{ all -> 0x07ba }
            monitor-exit(r8)
        L_0x0209:
            java.lang.String r2 = r10.A0C
            if (r2 == 0) goto L_0x0211
            monitor-enter(r8)
            r8.A01 = r2     // Catch:{ all -> 0x07ba }
            monitor-exit(r8)
        L_0x0211:
            android.net.Uri r2 = r10.A05
            goto L_0x0219
        L_0x0214:
            r8.A00(r12)
            android.net.Uri r2 = r10.A05
        L_0x0219:
            if (r2 == 0) goto L_0x0220
            r2.getHost()
            monitor-enter(r8)
            monitor-exit(r8)
        L_0x0220:
            int r13 = r5.A04
            X.6xv[] r11 = X.C142866xv.values()
            int r9 = r11.length
            r7 = 0
        L_0x0228:
            if (r7 >= r9) goto L_0x0233
            r4 = r11[r7]
            int r2 = r4.value
            if (r2 == r13) goto L_0x0235
            int r7 = r7 + 1
            goto L_0x0228
        L_0x0233:
            X.6xv r4 = X.C142866xv.A06
        L_0x0235:
            X.6xv r2 = X.C142866xv.A03
            if (r4 == r2) goto L_0x0241
            X.6xv r2 = X.C142866xv.A05
            if (r4 == r2) goto L_0x0241
            X.6xv r2 = X.C142866xv.A04
            if (r4 != r2) goto L_0x0243
        L_0x0241:
            monitor-enter(r8)
            monitor-exit(r8)
        L_0x0243:
            boolean r2 = r5.A0S
            r53 = r2
            monitor-enter(r8)
            r8.A06 = r2     // Catch:{ all -> 0x07ba }
            monitor-exit(r8)
            boolean r2 = r5.A0R
            r54 = r2
            monitor-enter(r8)
            r8.A03 = r2     // Catch:{ all -> 0x07ba }
            monitor-exit(r8)
            boolean r2 = r5.A0Q
            r55 = r2
            r8.A02 = r2
            X.8L1 r2 = r0.abrSetting
            r28 = 0
            r7 = 0
            r26 = 1
            com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration r9 = new com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration
            r13 = r9
            r14 = r2
            r15 = r19
            r16 = r8
            r17 = r7
            r18 = r26
            r13.<init>(r14, r15, r16, r17, r18)
            X.71v r2 = r1.A0A
            X.81h r4 = new X.81h
            r4.<init>(r9, r2)
            java.util.List r13 = r3.A00
            X.7UA r3 = r1.A03
            java.util.LinkedList r2 = r3.A05
            monitor-enter(r2)
            r2.size()     // Catch:{ all -> 0x07b7 }
            monitor-exit(r2)     // Catch:{ all -> 0x07b7 }
            java.lang.String r11 = r10.A0B
            r40 = r11
            java.lang.String r11 = r10.A0C
            if (r25 == 0) goto L_0x03f5
            boolean r14 = r25.isEmpty()
            if (r14 != 0) goto L_0x03f5
            int r4 = r5.A02
            r37 = r4
            int r4 = r5.A03
            r36 = r4
            long r12 = r6.A01
            boolean r4 = r10.A0P
            r24 = r4
            boolean r4 = r10.A0J
            r23 = r4
            monitor-enter(r8)
            boolean r4 = r8.A06     // Catch:{ all -> 0x04dd }
            r22 = r4
            monitor-exit(r8)
            X.0Xd r4 = r1.A05
            r18 = r4
            if (r4 == 0) goto L_0x03b8
            X.8xH r4 = r18.A08()
            if (r4 == 0) goto L_0x03b8
            X.8L1 r4 = r0.abrSetting
            boolean r4 = r4.hashUrlForUnique
            r21 = r4
            X.6wI r30 = X.C141886wI.NONE
            X.7bc r4 = new X.7bc
            r33 = r15
            r29 = r4
            r31 = r15
            r32 = r20
            r34 = r26
            r29.<init>(r30, r31, r32, r33, r34)
            X.7Xs r8 = new X.7Xs
            r8.<init>(r4, r7)
            monitor-enter(r2)
            java.util.HashSet r3 = r3.A04     // Catch:{ all -> 0x03b5 }
            java.util.Iterator r5 = r3.iterator()     // Catch:{ all -> 0x03b5 }
        L_0x02d6:
            boolean r3 = r5.hasNext()     // Catch:{ all -> 0x03b5 }
            if (r3 == 0) goto L_0x02ec
            java.lang.Object r4 = r5.next()     // Catch:{ all -> 0x03b5 }
            X.7Xs r4 = (X.C152147Xs) r4     // Catch:{ all -> 0x03b5 }
            boolean r3 = r4.equals(r8)     // Catch:{ all -> 0x03b5 }
            if (r3 == 0) goto L_0x02d6
            X.7bc r3 = r4.A00     // Catch:{ all -> 0x03b5 }
            monitor-exit(r2)     // Catch:{ all -> 0x03b5 }
            goto L_0x0308
        L_0x02ec:
            java.util.Iterator r5 = r2.iterator()     // Catch:{ all -> 0x03b5 }
        L_0x02f0:
            boolean r3 = r5.hasNext()     // Catch:{ all -> 0x03b5 }
            if (r3 == 0) goto L_0x0306
            java.lang.Object r4 = r5.next()     // Catch:{ all -> 0x03b5 }
            X.7Xs r4 = (X.C152147Xs) r4     // Catch:{ all -> 0x03b5 }
            boolean r3 = r4.equals(r8)     // Catch:{ all -> 0x03b5 }
            if (r3 == 0) goto L_0x02f0
            X.7bc r3 = r4.A00     // Catch:{ all -> 0x03b5 }
            monitor-exit(r2)     // Catch:{ all -> 0x03b5 }
            goto L_0x0308
        L_0x0306:
            monitor-exit(r2)     // Catch:{ all -> 0x03b5 }
            goto L_0x030a
        L_0x0308:
            java.lang.String r15 = r3.A02
        L_0x030a:
            java.util.Iterator r17 = r25.iterator()
        L_0x030e:
            boolean r2 = r17.hasNext()
            if (r2 == 0) goto L_0x03b8
            java.lang.Object r10 = r17.next()
            X.7aP r10 = (X.C152937aP) r10
            X.7z1 r9 = r10.A00
            java.lang.String r2 = r9.A0Q
            boolean r2 = r2.equals(r15)
            if (r2 != 0) goto L_0x03a5
            boolean r2 = r10 instanceof X.AnonymousClass6K7
            if (r2 == 0) goto L_0x030e
            r14 = r10
            X.6K7 r14 = (X.AnonymousClass6K7) r14
            X.7Z3 r2 = r14.A01
            if (r2 == 0) goto L_0x030e
            java.lang.String r11 = r10.A02
            android.net.Uri r2 = A01(r2, r11)
            if (r2 == 0) goto L_0x030e
            X.7B0 r2 = new X.7B0
            r2.<init>(r1)
            r26 = r1
            r27 = r10
            r29 = r73
            r30 = r20
            r31 = r40
            r32 = r37
            r33 = r36
            r34 = r24
            r35 = r23
            X.7Fn r2 = r26.A05(r27, r28, r29, r30, r31, r32, r33, r34, r35)
            int r2 = r2.A01
            long r7 = (long) r2
            int r2 = r0.numMsToPrefetch
            double r4 = (double) r2
            double r2 = (double) r12
            int r16 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r16 <= 0) goto L_0x035f
            r7 = 100
        L_0x035f:
            X.81f r4 = r14.A03
            X.7Z3 r2 = r10.A01
            if (r4 == 0) goto L_0x039d
            if (r2 == 0) goto L_0x030e
            android.net.Uri r30 = A01(r2, r11)
            long r2 = r2.A01
            r29 = r18
            r31 = r20
            r32 = r2
            r34 = r21
            r35 = r22
            boolean r2 = r29.A0E(r30, r31, r32, r34, r35)
            if (r2 == 0) goto L_0x030e
            long r2 = r4.B7h()
            X.7Z3 r2 = r4.BCd(r2)
            if (r2 == 0) goto L_0x03a5
            android.net.Uri r30 = A01(r2, r11)
        L_0x038b:
            r29 = r18
            r31 = r20
            r32 = r7
            r34 = r21
            r35 = r22
            boolean r2 = r29.A0E(r30, r31, r32, r34, r35)
            if (r2 != 0) goto L_0x03a5
            goto L_0x030e
        L_0x039d:
            android.net.Uri r30 = A01(r2, r11)
            if (r30 != 0) goto L_0x038b
            goto L_0x030e
        L_0x03a5:
            if (r19 == 0) goto L_0x03b1
            r2 = r19
            X.7z1 r2 = r2.A00
            int r3 = r2.A04
            int r2 = r9.A04
            if (r3 >= r2) goto L_0x030e
        L_0x03b1:
            r19 = r10
            goto L_0x030e
        L_0x03b5:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x03b5 }
            throw r0
        L_0x03b8:
            X.82Z r0 = new X.82Z
            r0.<init>()
            r1.A01 = r0
            r25.size()
            r1 = 0
        L_0x03c3:
            int r0 = r25.size()
            if (r1 >= r0) goto L_0x03d1
            r0 = r25
            r0.get(r1)
            int r1 = r1 + 1
            goto L_0x03c3
        L_0x03d1:
            r6.A01()
            r6.A00()
            int r0 = r41.size()
            if (r0 == 0) goto L_0x03ee
            java.lang.Object r2 = X.C18290x4.A0k(r41)
            X.7Se r2 = (X.C150777Se) r2
            r0 = 2
            int r1 = r2.A01(r0)
            r0 = -1
            if (r1 == r0) goto L_0x03ee
            X.C150777Se.A00(r2, r1)
        L_0x03ee:
            java.lang.String r0 = "mFormat"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x03f5:
            if (r13 == 0) goto L_0x04e0
            boolean r2 = r13.isEmpty()
            if (r2 != 0) goto L_0x04e0
            monitor-enter(r8)
            boolean r2 = r8.A06     // Catch:{ all -> 0x04dd }
            monitor-exit(r8)
            if (r2 != 0) goto L_0x04e0
            boolean r2 = r0.enableBitrateAwareAudioPrefetch
            if (r2 != 0) goto L_0x0419
            X.8L1 r3 = r0.abrSetting
            boolean r2 = r3.enableAudioAbrEvaluator
            if (r2 != 0) goto L_0x0419
            boolean r2 = r3.enableAudioIbrEvaluator
            if (r2 != 0) goto L_0x0419
            java.lang.Object r4 = r13.get(r7)
            X.7aP r4 = (X.C152937aP) r4
            goto L_0x04e1
        L_0x0419:
            X.8kw r2 = r1.A00
            if (r2 != 0) goto L_0x046f
            java.lang.Object r8 = r1.A0B
            monitor-enter(r8)
            X.8kw r2 = r1.A00     // Catch:{ all -> 0x046c }
            if (r2 != 0) goto L_0x0440
            X.8L1 r3 = r0.abrSetting     // Catch:{ all -> 0x046c }
            boolean r2 = r3.enableAudioAbrEvaluator     // Catch:{ all -> 0x046c }
            if (r2 == 0) goto L_0x0442
            X.7Zl r32 = new X.7Zl     // Catch:{ all -> 0x046c }
            r32.<init>()     // Catch:{ all -> 0x046c }
            X.82Y r2 = new X.82Y     // Catch:{ all -> 0x046c }
            r33 = r15
            r29 = r2
            r30 = r4
            r31 = r15
            r34 = r3
            r29.<init>(r30, r31, r32, r33, r34)     // Catch:{ all -> 0x046c }
        L_0x043e:
            r1.A00 = r2     // Catch:{ all -> 0x046c }
        L_0x0440:
            monitor-exit(r8)     // Catch:{ all -> 0x046c }
            goto L_0x046f
        L_0x0442:
            boolean r2 = r3.enableMultiAudioSupport     // Catch:{ all -> 0x046c }
            if (r2 != 0) goto L_0x044a
            boolean r2 = r3.enableAudioIbrEvaluator     // Catch:{ all -> 0x046c }
            if (r2 == 0) goto L_0x0440
        L_0x044a:
            android.content.Context r15 = r1.A02     // Catch:{ all -> 0x046c }
            X.82Z r14 = r1.A01     // Catch:{ all -> 0x046c }
            boolean r3 = r3.forceUpdateFormatListIfFormatSizeChanged     // Catch:{ all -> 0x046c }
            X.82Z r2 = new X.82Z     // Catch:{ all -> 0x046c }
            r33 = r19
            r35 = r19
            r37 = r19
            r38 = r19
            r29 = r2
            r30 = r15
            r31 = r4
            r32 = r19
            r34 = r14
            r36 = r9
            r39 = r3
            r29.<init>((android.content.Context) r30, (X.C177658gE) r31, (X.C177658gE) r32, (X.AnonymousClass7J6) r33, (X.AnonymousClass82Z) r34, (X.AnonymousClass703) r35, (com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration) r36, (X.AnonymousClass7FL) r37, (X.AnonymousClass707) r38, (boolean) r39)     // Catch:{ all -> 0x046c }
            goto L_0x043e
        L_0x046c:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x046c }
            throw r0
        L_0x046f:
            X.8kw r15 = r1.A00
            r3 = 0
            boolean r2 = r13.isEmpty()
            if (r2 == 0) goto L_0x04c1
            X.7z1[] r14 = new X.C166637z1[r7]
        L_0x047a:
            boolean r9 = r6.A01()
            android.util.Pair r8 = r6.A00()
            int r2 = r41.size()
            if (r2 == 0) goto L_0x0499
            java.lang.Object r4 = X.C18290x4.A0k(r41)
            X.7Se r4 = (X.C150777Se) r4
            r2 = 2
            int r3 = r4.A01(r2)
            r2 = -1
            if (r3 == r2) goto L_0x0499
            X.C150777Se.A00(r4, r3)
        L_0x0499:
            X.7FJ r2 = new X.7FJ
            r2.<init>(r8, r9)
            X.7z1 r8 = r15.Bl9(r2, r14)
            if (r8 == 0) goto L_0x04da
            java.util.Iterator r9 = r13.iterator()
        L_0x04a8:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L_0x04da
            java.lang.Object r4 = r9.next()
            X.7aP r4 = (X.C152937aP) r4
            X.7z1 r2 = r4.A00
            java.lang.String r3 = r2.A0Q
            java.lang.String r2 = r8.A0Q
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x04a8
            goto L_0x04e1
        L_0x04c1:
            int r2 = r13.size()
            X.7z1[] r14 = new X.C166637z1[r2]
        L_0x04c7:
            int r2 = r13.size()
            if (r3 >= r2) goto L_0x047a
            java.lang.Object r2 = r13.get(r3)
            X.7aP r2 = (X.C152937aP) r2
            X.7z1 r2 = r2.A00
            r14[r3] = r2
            int r3 = r3 + 1
            goto L_0x04c7
        L_0x04da:
            r4 = r19
            goto L_0x04e1
        L_0x04dd:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L_0x04e0:
            r4 = r15
        L_0x04e1:
            X.7B0 r2 = new X.7B0
            r2.<init>(r1)
            int r9 = r5.A02
            int r8 = r5.A03
            boolean r3 = r10.A0P
            boolean r2 = r10.A0J
            r13 = r1
            r14 = r19
            r15 = r4
            r16 = r73
            r17 = r20
            r18 = r40
            r19 = r9
            r20 = r8
            r21 = r3
            r22 = r2
            X.7Fn r10 = r13.A05(r14, r15, r16, r17, r18, r19, r20, r21, r22)
            X.7Fn r9 = new X.7Fn
            r9.<init>(r7, r7)
            boolean r13 = X.AnonymousClass000.A1W(r4)
            boolean r2 = r0.skipAudioPrefetch
            if (r2 == 0) goto L_0x0518
            boolean r2 = r5.A0I
            if (r2 != 0) goto L_0x0518
            r8 = 1
            if (r12 == 0) goto L_0x0519
        L_0x0518:
            r8 = 0
        L_0x0519:
            r1.A09(r5)
            boolean r2 = r1.A09(r5)
            if (r2 == 0) goto L_0x053a
            if (r4 == 0) goto L_0x053a
            java.lang.String r3 = r0.prefetchSubOriginBlockList
            if (r3 == 0) goto L_0x063c
            java.lang.String r2 = ";"
            java.lang.String[] r2 = r3.split(r2)
            java.util.List r2 = java.util.Arrays.asList(r2)
            if (r11 == 0) goto L_0x063c
            boolean r2 = r2.contains(r11)
            if (r2 == 0) goto L_0x063c
        L_0x053a:
            if (r13 == 0) goto L_0x070e
            if (r8 != 0) goto L_0x070e
            long r2 = r6.A01
            int r8 = (int) r2
            r72 = r8
            int r2 = r10.A00
            r29 = r2
            boolean r2 = r6.A0E
            r71 = r2
            boolean r2 = r6.A0F
            r70 = r2
            boolean r2 = r6.A0B
            r69 = r2
            X.6uz r24 = X.C141076uz.AUDIO_VIDEO
            int r2 = r9.A00
            long r2 = (long) r2
            r67 = r2
            X.7yv r3 = r5.A0E
            java.lang.String r2 = r3.A0B
            r66 = r2
            java.lang.String r2 = r3.A0C
            r65 = r2
            java.lang.String r2 = r3.A0D
            r64 = r2
            java.lang.String r2 = r3.A0H
            r22 = r2
            if (r2 == 0) goto L_0x070e
            boolean r2 = r3.A0O
            r63 = r2
            boolean r2 = r3.A0P
            r62 = r2
            X.6vy r2 = r5.A0D
            r61 = r2
            long r2 = r5.A09
            r59 = r2
            boolean r2 = r5.A0K
            r51 = r2
            long r2 = r5.A08
            r18 = r2
            long r2 = r5.A06
            r57 = r2
            java.lang.String r2 = r5.A0P
            r21 = r2
            java.lang.String r2 = r5.A0O
            r56 = r2
            long r2 = (long) r8
            int r5 = (r18 > r2 ? 1 : (r18 == r2 ? 0 : -1))
            if (r5 < 0) goto L_0x0599
            r18 = -1
        L_0x0599:
            java.lang.String r20 = "UnifiedPrefetchManager"
            r5 = 6
            java.lang.Object[] r9 = new java.lang.Object[r5]
            r9[r7] = r22
            X.7z1 r12 = r4.A00
            java.lang.String r5 = r12.A0Q
            r17 = r5
            r9[r26] = r5
            int r5 = r12.A0I
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)
            r6 = r66
            r5 = r65
            X.AnonymousClass6C7.A19(r8, r6, r5, r9)
            r5 = 5
            r9[r5] = r21
            java.lang.String r6 = "video: %s representation id: %s, width: %d from origin %s and suborigin %s and source(tag) %s is being prefetched"
            r5 = r20
            X.C161157p6.A01(r5, r6, r9)
            java.util.ArrayList r13 = X.AnonymousClass001.A0s()
            boolean r5 = r4 instanceof X.AnonymousClass6K7
            if (r5 == 0) goto L_0x0638
            r5 = r4
            X.6K7 r5 = (X.AnonymousClass6K7) r5
            X.81f r8 = r5.A03
        L_0x05cc:
            X.7Z3 r6 = r4.A01
            if (r6 == 0) goto L_0x0666
            if (r8 == 0) goto L_0x0657
            java.lang.String r5 = r4.A02
            r27 = r5
            android.net.Uri r10 = A01(r6, r5)
            long r5 = r6.A01
            int r9 = (int) r5
            android.util.Pair r5 = X.C18290x4.A0K(r10, r9)
            r13.add(r5)
            long r5 = r8.B7h()
            int r9 = (int) r5
            int r2 = r8.BCc(r2)
            int r2 = r2 + r9
            int r15 = r2 + -1
            r2 = -1
            if (r15 != r2) goto L_0x05f4
            r15 = r9
        L_0x05f4:
            r11 = r29
        L_0x05f6:
            if (r9 > r15) goto L_0x0666
            long r2 = (long) r9
            X.7Z3 r14 = r8.BCd(r2)
            long r5 = r14.A01
            int r10 = (int) r5
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r5 = r8.B7C(r2, r5)
            if (r10 >= 0) goto L_0x0618
            float r3 = (float) r5
            r2 = 1232348160(0x49742400, float:1000000.0)
            float r3 = r3 / r2
            int r2 = r12.A04
            float r2 = (float) r2
            float r3 = r3 * r2
            r2 = 1090519040(0x41000000, float:8.0)
            float r3 = r3 / r2
            int r10 = (int) r3
        L_0x0618:
            long r2 = r0.maxDurationUsForFullSegmentPrefetch
            int r16 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r16 > 0) goto L_0x0632
            r3 = -1
        L_0x061f:
            r2 = r27
            android.net.Uri r2 = A01(r14, r2)
            android.util.Pair r2 = X.C18290x4.A0K(r2, r3)
            r13.add(r2)
            int r11 = r11 - r10
            if (r11 < 0) goto L_0x0666
            int r9 = r9 + 1
            goto L_0x05f6
        L_0x0632:
            r3 = r29
            if (r11 >= r10) goto L_0x061f
            r3 = r11
            goto L_0x061f
        L_0x0638:
            r8 = r4
            X.6K8 r8 = (X.AnonymousClass6K8) r8
            goto L_0x05cc
        L_0x063c:
            boolean r2 = r0.avoidSecondPhaseOnCell
            if (r2 != 0) goto L_0x053a
            boolean r2 = r0.enableSecondPhasePrefetchWebm
            if (r2 != 0) goto L_0x0650
            java.lang.String r3 = r4.A02
            java.lang.String r2 = "webm"
            boolean r2 = r3.contains(r2)
            if (r2 == 0) goto L_0x0650
            goto L_0x053a
        L_0x0650:
            java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
            r2.<init>()
            goto L_0x053a
        L_0x0657:
            java.lang.String r2 = r4.A02
            android.net.Uri r3 = A01(r6, r2)
            r2 = r29
            android.util.Pair r2 = X.C18290x4.A0K(r3, r2)
            r13.add(r2)
        L_0x0666:
            java.util.Iterator r8 = r13.iterator()
        L_0x066a:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L_0x070e
            java.lang.Object r6 = r8.next()
            android.util.Pair r6 = (android.util.Pair) r6
            java.lang.Object r3 = r6.second
            java.lang.Number r3 = (java.lang.Number) r3
            int r38 = r3.intValue()
            java.lang.Object[] r5 = X.AnonymousClass0x9.A1X()
            r5[r7] = r22
            java.lang.Object r2 = r6.first
            X.C18300x5.A1K(r2, r3, r5)
            java.lang.String r3 = "video prefetch: %s url: %s %d"
            r2 = r20
            X.C161157p6.A01(r2, r3, r5)
            java.lang.Object r2 = r6.first
            android.net.Uri r2 = (android.net.Uri) r2
            X.6vz r42 = X.C141696vz.DASH_VOD
            java.util.Map r48 = java.util.Collections.emptyMap()
            java.lang.String r47 = r24.toString()
            X.6vA r41 = X.C141186vA.GENERAL
            X.7yv r32 = new X.7yv
            r39 = r32
            r40 = r2
            r43 = r22
            r44 = r66
            r45 = r65
            r46 = r64
            r49 = r63
            r50 = r62
            r39.<init>(r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50)
            int r5 = r12.A04
            X.7xp r2 = r12.A0K
            java.lang.String r2 = r2.A05
            if (r2 != 0) goto L_0x06c2
            java.lang.String r2 = new java.lang.String
            r2.<init>()
        L_0x06c2:
            X.6vI r29 = X.C141266vI.PREFETCH
            X.7yM r30 = new X.7yM
            r30.<init>()
            X.7yW r3 = new X.7yW
            r52 = r7
            r27 = r3
            r31 = r61
            r33 = r28
            r34 = r2
            r35 = r20
            r36 = r21
            r37 = r56
            r39 = r26
            r40 = r7
            r41 = r5
            r42 = r72
            r43 = r67
            r45 = r59
            r47 = r18
            r49 = r57
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r45, r47, r49, r51, r52, r53, r54, r55)
            r1.A09(r3)
            X.6vy r2 = r3.A0D
            X.6wI r31 = r1.A04(r2)
            r29 = r1
            r30 = r4
            r32 = r73
            r34 = r3
            r35 = r22
            r36 = r17
            r37 = r71
            r38 = r70
            r39 = r69
            r29.A06(r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            goto L_0x066a
        L_0x070e:
            boolean r0 = r0.enableVodDrmPrefetch
            if (r0 == 0) goto L_0x07c8
            if (r25 == 0) goto L_0x07c8
            boolean r0 = r25.isEmpty()
            if (r0 != 0) goto L_0x07c8
            r0 = r25
            java.lang.Object r0 = r0.get(r7)
            X.7aP r0 = (X.C152937aP) r0
            X.7z1 r0 = r0.A00
            X.7z3 r3 = r0.A0L
            if (r3 == 0) goto L_0x07c8
            X.7yl[] r6 = r3.A03
            int r1 = r6.length
            r0 = r26
            if (r1 < r0) goto L_0x07c8
            X.7mn r2 = X.C159977mn.A00()
            android.os.Looper r4 = android.os.Looper.myLooper()
            monitor-enter(r2)
            android.util.LruCache r0 = r2.A00     // Catch:{ all -> 0x07b4 }
            if (r0 == 0) goto L_0x07b2
            if (r4 == 0) goto L_0x07b2
            if (r23 == 0) goto L_0x07b2
            r0 = r23
            X.80z r0 = (X.C1674180z) r0     // Catch:{ all -> 0x07b4 }
            java.util.UUID r5 = r0.A07     // Catch:{ all -> 0x07b4 }
            r0 = r26
            X.7yl r0 = X.C1674180z.A00(r3, r5, r0)     // Catch:{ all -> 0x07b4 }
            if (r0 != 0) goto L_0x076d
            int r1 = r3.A01     // Catch:{ all -> 0x07b4 }
            r0 = r26
            if (r1 != r0) goto L_0x07b2
            r1 = r6[r7]     // Catch:{ all -> 0x07b4 }
            java.util.UUID r0 = X.C155567f7.A01     // Catch:{ all -> 0x07b4 }
            boolean r0 = r1.A00(r0)     // Catch:{ all -> 0x07b4 }
            if (r0 == 0) goto L_0x07b2
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x07b4 }
            java.lang.String r0 = "DrmInitData only contains common PSSH SchemeData. Assuming support for: "
            java.lang.String r1 = X.AnonymousClass000.A0P(r5, r0, r1)     // Catch:{ all -> 0x07b4 }
            java.lang.String r0 = "DefaultDrmSessionMgr"
            android.util.Log.w(r0, r1)     // Catch:{ all -> 0x07b4 }
        L_0x076d:
            java.lang.String r1 = r3.A02     // Catch:{ all -> 0x07b4 }
            if (r1 == 0) goto L_0x0797
            java.lang.String r0 = "cenc"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x07b4 }
            if (r0 != 0) goto L_0x0797
            java.lang.String r0 = "cbc1"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x07b4 }
            if (r0 != 0) goto L_0x0791
            java.lang.String r0 = "cbcs"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x07b4 }
            if (r0 != 0) goto L_0x0791
            java.lang.String r0 = "cens"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x07b4 }
            if (r0 == 0) goto L_0x0797
        L_0x0791:
            int r1 = com.facebook.android.exoplayer2.util.Util.A00     // Catch:{ all -> 0x07b4 }
            r0 = 25
            if (r1 < r0) goto L_0x07b2
        L_0x0797:
            java.util.UUID r0 = X.C155567f7.A04     // Catch:{ all -> 0x07b4 }
            X.7yl r5 = X.C1674180z.A00(r3, r0, r7)     // Catch:{ all -> 0x07b4 }
            if (r5 == 0) goto L_0x07b2
            android.util.LruCache r0 = r2.A00     // Catch:{ all -> 0x07b4 }
            java.lang.Object r0 = r0.get(r5)     // Catch:{ all -> 0x07b4 }
            if (r0 != 0) goto L_0x07b2
            r0 = r23
            X.8sN r1 = r0.AwH(r4, r3)     // Catch:{ all -> 0x07b4 }
            android.util.LruCache r0 = r2.A00     // Catch:{ all -> 0x07b4 }
            r0.put(r5, r1)     // Catch:{ all -> 0x07b4 }
        L_0x07b2:
            monitor-exit(r2)
            return
        L_0x07b4:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x07b7:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x07b7 }
            throw r0
        L_0x07ba:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L_0x07bd:
            java.lang.String r2 = "ServiceEventCallbackImpl"
            java.lang.Object[] r1 = X.AnonymousClass4L0.A0U()
            java.lang.String r0 = "skipping log because listener is null for event type: "
            X.C161157p6.A01(r2, r0, r1)
        L_0x07c8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C160737oE.A07(com.facebook.exoplayer.monitor.VpsEventCallback, X.7yW):void");
    }

    public static int A00(C152937aP r7, int i, int i2) {
        long j;
        AnonymousClass7Z3 r0;
        if (r7 == null) {
            return 0;
        }
        if (!(r7 instanceof AnonymousClass6K7) || (r0 = ((AnonymousClass6K7) r7).A01) == null) {
            j = 0;
        } else {
            j = r0.A02 + r0.A01;
        }
        return Math.min((int) (j + ((long) ((((double) r7.A00.A04) / 8.0d) * (((double) i2) / 1000.0d)))), i);
    }

    public static Uri A01(AnonymousClass7Z3 r0, String str) {
        return Uri.parse(C159207lN.A00(str, r0.A03));
    }

    public final int A03(C152937aP r8, int i) {
        long j;
        AnonymousClass7Z3 r0;
        if (r8 == null) {
            return 0;
        }
        int i2 = this.A09.maxBytesToPrefetchCellVOD;
        if (!(r8 instanceof AnonymousClass6K7) || (r0 = ((AnonymousClass6K7) r8).A01) == null) {
            j = 0;
        } else {
            j = r0.A02 + r0.A01;
        }
        return Math.min((int) (j + ((long) (((((double) r8.A00.A04) / 8.0d) * ((double) i)) / 1000.0d))), i2);
    }

    public AnonymousClass7Fn A05(C152937aP r8, C152937aP r9, VpsEventCallback vpsEventCallback, String str, String str2, int i, int i2, boolean z, boolean z2) {
        int i3;
        int i4;
        long j;
        AnonymousClass7Z3 r0;
        int A032;
        int A033;
        int i5;
        int i6;
        AnonymousClass8LG r2 = this.A09;
        int i7 = 0;
        if (r2.usePrefetchSegmentOffset) {
            AnonymousClass6C8.A1B("Manifest for videoId %s is missing prefetch segment range", "UnifiedPrefetchManager", new Object[]{str});
            vpsEventCallback.AyO(new C126386Nr(str, "MANIFEST", "MANIFEST_MISSING_PREFETCH_SEGMENT_RANGE", "Manifest is missing prefetch segment range"));
        }
        if (i <= 0) {
            if (z2 && r2.enableAdBreakEnhancedPrefetch) {
                i5 = r2.maxBytesToPrefetchCellVOD;
                i6 = r2.adBreakEnahncedPrefetchDurationMs;
            } else if (z && r2.enableAllLongerPrefetchAds) {
                i5 = r2.maxWifiBytesToPrefetchAds;
                i6 = r2.maxWifiPrefetchDurationMsAds;
            } else if (i2 >= 0) {
                return new AnonymousClass7Fn(0, 0);
            } else {
                int i8 = r2.numMsToPrefetch;
                A032 = A03(r8, i8);
                A033 = A03(r9, i8);
                return new AnonymousClass7Fn(A032, A033);
            }
            A032 = A00(r8, i5, i6);
            A033 = A00(r9, i5, i6);
            return new AnonymousClass7Fn(A032, A033);
        }
        if (r8 != null) {
            i3 = r8.A00.A04;
        } else {
            i3 = 0;
        }
        if (r9 != null) {
            i4 = r9.A00.A04;
        } else {
            i4 = 0;
        }
        int i9 = i3 + i4;
        if (i9 <= 0) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("The sum of bitrates from all representations must be greater than 0, videoId: ");
            A0o.append(str);
            A0o.append(" ,playOrigin: ");
            A0o.append(str2);
            A0o.append(" ,sponsored: ");
            A0o.append(z);
            vpsEventCallback.AyO(new C126386Nr(str, "PREFETCH_MANAGER", "ZERO_AUDIO_VIDEO_BITRATE", AnonymousClass000.A0Y(" ,optionalPrefetchBudgetInBytes: ", A0o, i)));
            if (r9 != null) {
                i7 = i / 10;
            }
            return new AnonymousClass7Fn(i - i7, i7);
        }
        if (r9 == null || !(r9 instanceof AnonymousClass6K7) || (r0 = ((AnonymousClass6K7) r9).A01) == null) {
            j = 0;
        } else {
            j = r0.A02 + r0.A01;
        }
        int i10 = ((int) ((((float) i4) * ((float) i)) / ((float) i9))) + ((int) j);
        return new AnonymousClass7Fn(i - i10, i10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0033, code lost:
        if (r6 == X.C141686vy.Urgent_front) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A08(X.C141686vy r6, X.C153597bc r7) {
        /*
            r5 = this;
            X.8LG r4 = r5.A09
            boolean r0 = r4.isVideoQplPipelineEnabled
            if (r0 == 0) goto L_0x0026
            X.7At r3 = r5.A06
            if (r3 == 0) goto L_0x0026
            X.7yW r2 = r7.A01
            X.7UA r0 = r5.A03
            java.util.LinkedList r1 = r0.A05
            monitor-enter(r1)
            int r0 = r1.size()     // Catch:{ all -> 0x0017 }
            monitor-exit(r1)     // Catch:{ all -> 0x0017 }
            goto L_0x001a
        L_0x0017:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0017 }
            throw r0
        L_0x001a:
            X.6Nv r1 = new X.6Nv
            r1.<init>(r2, r0)
            X.7l9 r0 = r3.A00
            com.facebook.video.heroplayer.service.ServiceEventCallbackImpl r0 = r0.A0A
            r0.AyO(r1)
        L_0x0026:
            boolean r3 = r4.prefetchTaskQueuePutInFront
            X.6vy r0 = X.C141686vy.Unspecified
            if (r6 == r0) goto L_0x0036
            X.6vy r0 = X.C141686vy.Front
            if (r6 == r0) goto L_0x0035
            X.6vy r0 = X.C141686vy.Urgent_front
            r3 = 0
            if (r6 != r0) goto L_0x0036
        L_0x0035:
            r3 = 1
        L_0x0036:
            X.7UA r2 = r5.A03
            int r1 = r4.prefetchTaskQueueRetryNumber
            X.7Xs r0 = new X.7Xs
            r0.<init>(r7, r1)
            r2.A01(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C160737oE.A08(X.6vy, X.7bc):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0032, code lost:
        if (r5.A09.disableSecondPhasePrefetchForReels == false) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0027, code lost:
        if (r6.A0P.contains("UnifiedPlayer") != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A09(X.C166337yW r6) {
        /*
            r5 = this;
            X.7yv r0 = r6.A0E
            java.lang.String r1 = r0.A0D
            java.lang.String r0 = "FB_SHORTS_UNIFIED_PLAYER"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L_0x0029
            java.lang.String r0 = "unified_video_player"
            java.lang.String r1 = r6.A0O
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L_0x0029
            java.lang.String r0 = "reels_tab"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L_0x0029
            java.lang.String r1 = r6.A0P
            java.lang.String r0 = "UnifiedPlayer"
            boolean r1 = r1.contains(r0)
            r0 = 0
            if (r1 == 0) goto L_0x002a
        L_0x0029:
            r0 = 1
        L_0x002a:
            r4 = 0
            if (r0 == 0) goto L_0x0034
            X.8LG r0 = r5.A09
            boolean r0 = r0.disableSecondPhasePrefetchForReels
            r3 = 1
            if (r0 != 0) goto L_0x0035
        L_0x0034:
            r3 = 0
        L_0x0035:
            X.8LG r2 = r5.A09
            X.7pY r1 = r5.A08
            if (r1 == 0) goto L_0x0040
            r0 = 16
            r1.A01(r0)
        L_0x0040:
            boolean r0 = r2.enableSecondPhasePrefetch
            if (r0 == 0) goto L_0x0049
            if (r3 != 0) goto L_0x0049
        L_0x0046:
            r0 = r4 ^ 1
            return r0
        L_0x0049:
            r4 = 1
            goto L_0x0046
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C160737oE.A09(X.7yW):boolean");
    }

    public C160737oE(Context context, AnonymousClass71E r4, AnonymousClass0Xd r5, C146567At r6, C146587Av r7, C161397pY r8, AnonymousClass8LG r9, C1445071v r10, Map map, AtomicReference atomicReference) {
        this.A03 = new AnonymousClass7UA(new AnonymousClass7JO(r8, this, r9));
        this.A05 = r5;
        this.A0D = map;
        this.A09 = r9;
        this.A04 = r4;
        this.A0A = r10;
        this.A06 = r6;
        this.A02 = context;
        this.A07 = r7;
        AtomicReference atomicReference2 = new AtomicReference();
        this.A0G = atomicReference2;
        atomicReference2.set(Boolean.FALSE);
        this.A0F = atomicReference;
        this.A0C = AnonymousClass001.A0t();
        this.A08 = r8;
        C146537Aq r1 = (C146537Aq) atomicReference.get();
        if (r9.disableSecondPhasePrefetchOnAppScrolling && r1 != null) {
            r1.A00.add(this);
        }
        this.A0E = AnonymousClass6CA.A0a();
        GlobalPlayerStateMonitor globalPlayerStateMonitor = GlobalPlayerStateMonitor.A02;
        globalPlayerStateMonitor.A01.add(new C146627Az(this));
    }

    public C141886wI A04(C141686vy r2) {
        switch (r2.ordinal()) {
            case 3:
                return C141886wI.LOW;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return C141886wI.URGENT;
            default:
                return C141886wI.HIGH;
        }
    }
}
