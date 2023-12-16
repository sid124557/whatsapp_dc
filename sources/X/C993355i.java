package X;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: X.55i  reason: invalid class name and case insensitive filesystem */
public class C993355i extends AnonymousClass5ZM {
    public final int A00;
    public final long A01;
    public final long A02;
    public final C55682qk A03;
    public final C64393Dh A04;
    public final C69263Wi A05;
    public final C181618n3 A06;
    public final AnonymousClass5Ul A07;
    public final C621033m A08;
    public final C56612sH A09;
    public final C54292oU A0A;
    public final AnonymousClass33p A0B;
    public final C108845de A0C;
    public final AnonymousClass1VX A0D;
    public final AnonymousClass4FV A0E;
    public final C106105Xq A0F;
    public final C55972rD A0G;
    public final C988953q A0H;
    public final AnonymousClass5GW A0I;
    public final C96004vP A0J;
    public final C151207Tv A0K;
    public final C48682fI A0L;
    public final C624134x A0M;
    public final C989053r A0N;
    public final Integer A0O;
    public final Long A0P;
    public final Long A0Q;
    public final Long A0R;
    public final Collection A0S;
    public final HashSet A0T;
    public final HashSet A0U;
    public final List A0V;
    public final List A0W;
    public final Map A0X;
    public final boolean A0Y;
    public final boolean A0Z;
    public final boolean A0a;
    public final boolean A0b;
    public final boolean A0c;
    public final boolean A0d;

    /* JADX WARNING: Code restructure failed: missing block: B:200:0x051a, code lost:
        if (r5.A00() != 0) goto L_0x051c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x058b, code lost:
        if (r15 != null) goto L_0x0527;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x05f9, code lost:
        if (r1 == false) goto L_0x05fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x025b, code lost:
        if (r15.intValue() != 3) goto L_0x025d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x0620  */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x002d A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r45) {
        /*
            r44 = this;
            r0 = r44
            X.5GW r2 = r0.A0I
            boolean r1 = r0.A0Z
            r21 = r1
            X.8JP r8 = r2.A00
            r3 = 453122092(0x1b02182c, float:1.0761158E-22)
            r2 = 1
            r8.markerStart(r3, r2)
            java.lang.String r1 = "SEND_TASK_START"
            r8.markerPoint((int) r3, (int) r2, (java.lang.String) r1)
            if (r21 == 0) goto L_0x0627
            java.lang.String r1 = "ACTUAL_SEND"
        L_0x001a:
            r8.markerPoint((int) r3, (int) r2, (java.lang.String) r1)
            java.util.HashMap r20 = X.AnonymousClass001.A0t()
            java.util.ArrayList r19 = X.AnonymousClass001.A0s()
            java.util.List r1 = r0.A0V
            r43 = r1
            java.util.Iterator r22 = r43.iterator()
        L_0x002d:
            boolean r1 = r22.hasNext()
            if (r1 == 0) goto L_0x062e
            android.net.Uri r1 = X.C86664Kz.A0c(r22)
            X.33p r5 = r0.A0B
            r4 = 1
            android.content.SharedPreferences$Editor r3 = X.C18270x1.A03(r5)
            java.lang.String r2 = "media_quality_has_send_media"
            X.C18270x1.A0l(r3, r2, r4)
            java.lang.Integer r15 = r0.A0O
            int r3 = r15.intValue()
            r2 = 3
            if (r3 != r2) goto L_0x005d
            java.util.HashSet r2 = r0.A0U
            int r2 = r2.size()
            if (r2 <= 0) goto L_0x005d
            android.content.SharedPreferences$Editor r3 = X.C18270x1.A03(r5)
            java.lang.String r2 = "media_quality_has_send_hd_media"
            X.C18270x1.A0l(r3, r2, r4)
        L_0x005d:
            X.5Xq r11 = r0.A0F
            X.5YF r5 = r11.A00(r1)
            boolean r3 = r0.A0d
            if (r3 == 0) goto L_0x00fd
            java.io.File r7 = X.C627536m.A04(r1)
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "MediaComposerActivity/deleteViewOnceCapture/"
            X.C18260x0.A1P(r4, r2, r1)
            if (r7 == 0) goto L_0x00de
            X.3Dh r6 = r0.A04     // Catch:{ IOException -> 0x00ce }
            java.lang.String r4 = r7.getCanonicalPath()     // Catch:{ IOException -> 0x00ce }
            X.2UN r2 = r6.A08()     // Catch:{ IOException -> 0x00ce }
            java.io.File r2 = r2.A06     // Catch:{ IOException -> 0x00ce }
            java.lang.String r2 = r2.getCanonicalPath()     // Catch:{ IOException -> 0x00ce }
            boolean r2 = r4.startsWith(r2)     // Catch:{ IOException -> 0x00ce }
            if (r2 != 0) goto L_0x00a0
            java.lang.String r4 = r7.getCanonicalPath()     // Catch:{ IOException -> 0x00ce }
            X.2UN r2 = r6.A08()     // Catch:{ IOException -> 0x00ce }
            java.io.File r2 = r2.A07     // Catch:{ IOException -> 0x00ce }
            java.lang.String r2 = r2.getCanonicalPath()     // Catch:{ IOException -> 0x00ce }
            boolean r2 = r4.startsWith(r2)     // Catch:{ IOException -> 0x00ce }
            if (r2 == 0) goto L_0x00de
        L_0x00a0:
            boolean r2 = r7.delete()     // Catch:{ IOException -> 0x00ce }
            r7 = 0
            if (r2 != 0) goto L_0x00b2
            X.2qk r6 = r0.A03     // Catch:{ IOException -> 0x00ce }
            java.lang.String r4 = "MediaComposerActivity/failed to delete capture"
            java.lang.String r2 = r1.toString()     // Catch:{ IOException -> 0x00ce }
            r6.A0A(r4, r7, r2)     // Catch:{ IOException -> 0x00ce }
        L_0x00b2:
            java.io.File r2 = r5.A06()     // Catch:{ IOException -> 0x00ce }
            if (r2 == 0) goto L_0x00c2
            java.io.File r2 = r5.A06()     // Catch:{ IOException -> 0x00ce }
            boolean r2 = r2.exists()     // Catch:{ IOException -> 0x00ce }
            if (r2 != 0) goto L_0x00de
        L_0x00c2:
            X.2qk r6 = r0.A03     // Catch:{ IOException -> 0x00ce }
            java.lang.String r4 = "MediaComposerActivity/file missing"
            java.lang.String r2 = r1.toString()     // Catch:{ IOException -> 0x00ce }
            r6.A0A(r4, r7, r2)     // Catch:{ IOException -> 0x00ce }
            goto L_0x00de
        L_0x00ce:
            r2 = move-exception
            java.lang.String r7 = "MediaComposerActivity/deleteInternalCaptureForViewOnce"
            com.whatsapp.util.Log.e(r7, r2)
            X.2qk r6 = r0.A03
            java.lang.String r4 = r2.getMessage()
            r2 = 1
            r6.A0A(r7, r2, r4)
        L_0x00de:
            boolean r2 = r0.A0c
            if (r2 == 0) goto L_0x01af
            java.io.File r2 = X.C627536m.A04(r1)
            r2.delete()     // Catch:{ Exception -> 0x00eb }
            goto L_0x01af
        L_0x00eb:
            r2 = move-exception
            java.lang.String r7 = "MediaComposerActivity/deleteExternalViewOnceIfNewContent"
            com.whatsapp.util.Log.e(r7, r2)
            X.2qk r6 = r0.A03
            java.lang.String r4 = r2.getMessage()
            r2 = 1
            r6.A0A(r7, r2, r4)
            goto L_0x01af
        L_0x00fd:
            X.53r r10 = r0.A0N
            java.io.File r9 = X.C627536m.A04(r1)
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "mediafileutils/move "
            X.C18260x0.A1R(r4, r2, r9)
            if (r9 == 0) goto L_0x01af
            java.lang.String r7 = r9.getName()     // Catch:{ IOException -> 0x016a }
            X.3Dh r6 = r10.A01     // Catch:{ IOException -> 0x016a }
            java.lang.String r4 = r9.getCanonicalPath()     // Catch:{ IOException -> 0x016a }
            X.2UN r2 = r6.A08()     // Catch:{ IOException -> 0x016a }
            java.io.File r2 = r2.A06     // Catch:{ IOException -> 0x016a }
            java.lang.String r2 = r2.getCanonicalPath()     // Catch:{ IOException -> 0x016a }
            boolean r2 = r4.startsWith(r2)     // Catch:{ IOException -> 0x016a }
            if (r2 == 0) goto L_0x013f
            java.io.File r2 = r6.A0E()     // Catch:{ IOException -> 0x016a }
            java.io.File r4 = X.C107655bf.A0S(r2, r7)     // Catch:{ IOException -> 0x016a }
            X.306 r2 = r10.A0A     // Catch:{ IOException -> 0x016a }
            X.C627536m.A0D(r2, r9, r4)     // Catch:{ IOException -> 0x016a }
            java.lang.StringBuilder r6 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x016a }
            java.lang.String r2 = "mediafileutils/moved image "
            X.C18260x0.A1R(r6, r2, r4)     // Catch:{ IOException -> 0x016a }
            goto L_0x0175
        L_0x013f:
            java.lang.String r4 = r9.getCanonicalPath()     // Catch:{ IOException -> 0x016a }
            X.2UN r2 = r6.A08()     // Catch:{ IOException -> 0x016a }
            java.io.File r2 = r2.A07     // Catch:{ IOException -> 0x016a }
            java.lang.String r2 = r2.getCanonicalPath()     // Catch:{ IOException -> 0x016a }
            boolean r2 = r4.startsWith(r2)     // Catch:{ IOException -> 0x016a }
            if (r2 == 0) goto L_0x01af
            java.io.File r2 = r6.A0J()     // Catch:{ IOException -> 0x016a }
            java.io.File r4 = X.C107655bf.A0S(r2, r7)     // Catch:{ IOException -> 0x016a }
            X.306 r2 = r10.A0A     // Catch:{ IOException -> 0x016a }
            X.C627536m.A0D(r2, r9, r4)     // Catch:{ IOException -> 0x016a }
            java.lang.StringBuilder r6 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x016a }
            java.lang.String r2 = "mediafileutils/moved video"
            X.C18260x0.A1R(r6, r2, r4)     // Catch:{ IOException -> 0x016a }
            goto L_0x0175
        L_0x016a:
            r6 = move-exception
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "mediafileutils/unable to move capture to external "
            X.C18260x0.A0k(r9, r2, r4, r6)
            goto L_0x01af
        L_0x0175:
            X.5YF r6 = r11.A00(r1)
            java.util.Map r2 = r11.A00
            r2.remove(r1)
            android.net.Uri r2 = android.net.Uri.fromFile(r4)
            android.net.Uri$Builder r7 = r2.buildUpon()
            r2 = 0
            X.C989053r.A03(r7, r1, r2)
            java.lang.String r2 = "flip-h"
            java.lang.String r9 = r1.getQueryParameter(r2)
            if (r9 == 0) goto L_0x0199
            java.lang.String r1 = r1.getQueryParameter(r2)
            r7.appendQueryParameter(r2, r1)
        L_0x0199:
            android.net.Uri r1 = r7.build()
            X.5YF r2 = new X.5YF
            r2.<init>(r1, r6)
            r2.A0E(r4)
            r11.A04(r2)
            X.2oU r2 = r0.A0A
            android.content.Context r2 = r2.A00
            X.C107655bf.A0Y(r2, r1)
        L_0x01af:
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "MediaComposerActivity/sendmedia/uri = "
            X.C18260x0.A1R(r4, r2, r1)
            boolean r2 = r5.A0J()
            r7 = 13
            if (r2 == 0) goto L_0x01f1
            r6 = 13
        L_0x01c2:
            java.lang.Byte r9 = java.lang.Byte.valueOf(r6)
            r2 = r20
            java.lang.Object r4 = r2.get(r9)
            X.4sn r4 = (X.C95204sn) r4
            if (r4 != 0) goto L_0x01d7
            X.4sn r4 = r0.A0H(r6, r3)
            r2.put(r9, r4)
        L_0x01d7:
            java.lang.Long r2 = r4.A0E
            if (r2 != 0) goto L_0x01e1
            java.lang.Long r2 = X.AnonymousClass0x2.A0T()
            r4.A0E = r2
        L_0x01e1:
            java.lang.Long r2 = X.AnonymousClass0x7.A0j(r2)
            r4.A0E = r2
            r2 = 1
            if (r6 == r2) goto L_0x0397
            r12 = 3
            if (r6 == r12) goto L_0x01f8
            if (r6 == r7) goto L_0x01f8
            goto L_0x002d
        L_0x01f1:
            X.53q r2 = r0.A0H
            byte r6 = r2.A01(r5)
            goto L_0x01c2
        L_0x01f8:
            java.lang.String r6 = "SEND_TASK_VIDEO_START"
            r3 = 453122092(0x1b02182c, float:1.0761158E-22)
            r8.markerPoint((int) r3, (int) r2, (java.lang.String) r6)
            java.util.HashSet r3 = r0.A0U
            boolean r2 = r3.contains(r1)
            if (r2 != 0) goto L_0x0211
            android.net.Uri r2 = r5.A0G
            boolean r2 = r3.contains(r2)
            if (r2 != 0) goto L_0x0211
            r15 = 0
        L_0x0211:
            android.graphics.Point r9 = r5.A02()
            monitor-enter(r5)
            long r2 = r5.A02     // Catch:{ all -> 0x062b }
            monitor-exit(r5)
            int r6 = (int) r2
            r13 = 0
            android.graphics.Point r2 = new android.graphics.Point
            r2.<init>(r13, r6)
            if (r9 == 0) goto L_0x0248
            boolean r2 = r9.equals(r2)
            if (r2 != 0) goto L_0x0248
            int r2 = r9.x
            long r6 = (long) r2
            int r2 = r9.y
            long r9 = (long) r2
            r18 = 0
        L_0x0230:
            X.5YF r2 = r11.A00(r1)
            java.io.File r14 = r2.A07()
            X.C626936e.A06(r14)
            X.33C r11 = new X.33C
            r11.<init>()
            r11.A0F = r14
            r11.A0D = r6
            r11.A0E = r9
            monitor-enter(r5)
            goto L_0x024f
        L_0x0248:
            r9 = 0
            r6 = 0
            r18 = 1
            goto L_0x0230
        L_0x024f:
            boolean r2 = r5.A0E     // Catch:{ all -> 0x062b }
            monitor-exit(r5)
            r11.A0P = r2
            if (r15 == 0) goto L_0x025d
            int r3 = r15.intValue()
            r2 = 1
            if (r3 == r12) goto L_0x025e
        L_0x025d:
            r2 = 0
        L_0x025e:
            r11.A0O = r2
            X.7Tv r15 = r0.A0K
            X.5aV r12 = r15.A01(r5)
            if (r12 == 0) goto L_0x026a
            r18 = 0
        L_0x026a:
            r2 = 1000(0x3e8, double:4.94E-321)
            if (r12 != 0) goto L_0x0341
            long r2 = r2 * r6
            r16 = 0
            int r12 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r12 != 0) goto L_0x0335
            byte[] r28 = X.C107085af.A04(r14)
        L_0x0279:
            r27 = 0
        L_0x027b:
            boolean r2 = r5.A0J()
            if (r2 == 0) goto L_0x032d
            r30 = 13
        L_0x0283:
            if (r18 == 0) goto L_0x0323
            java.lang.Long r2 = r4.A0F
            java.lang.Long r2 = X.C86624Kv.A0Y(r2)
            r4.A0F = r2
        L_0x028d:
            java.lang.String r2 = r5.A09()
            if (r2 != 0) goto L_0x031d
            r3 = 0
        L_0x0294:
            X.2fI r4 = r0.A0L
            java.lang.String r2 = r5.A0B()
            java.util.List r2 = r4.A00(r2)
            if (r21 == 0) goto L_0x02da
            X.3Wi r5 = r0.A05
            r31 = 0
            X.3cC r4 = new X.3cC
            r23 = r4
            r24 = r0
            r25 = r11
            r26 = r2
            r29 = r3
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31)
            r5.A0S(r4)
            android.net.Uri$Builder r12 = r1.buildUpon()
        L_0x02ba:
            X.53r r2 = r15.A04
            X.33i r2 = r2.A03
            X.5UR r2 = r2.A0R()
            java.lang.String r2 = X.C107655bf.A0W(r1, r2)
            java.lang.String r1 = "mime_type"
            r12.appendQueryParameter(r1, r2)
            android.net.Uri r7 = r12.build()
            r3 = 1
            java.lang.String r2 = "SEND_TASK_VIDEO_END"
            r1 = 453122092(0x1b02182c, float:1.0761158E-22)
            r8.markerPoint((int) r1, (int) r3, (java.lang.String) r2)
            goto L_0x061e
        L_0x02da:
            android.net.Uri$Builder r12 = r1.buildUpon()
            if (r3 == 0) goto L_0x02e5
            java.lang.String r13 = "caption"
            r12.appendQueryParameter(r13, r3)
        L_0x02e5:
            if (r2 == 0) goto L_0x02f7
            java.lang.String r3 = r5.A0B()
            r4.A01(r3, r2)
            java.lang.String r3 = "mentions"
            java.lang.String r2 = r5.A0B()
            r12.appendQueryParameter(r3, r2)
        L_0x02f7:
            r3 = 0
            int r2 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x0301
            int r2 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x0313
        L_0x0301:
            java.lang.String r3 = "from"
            java.lang.String r2 = java.lang.Long.toString(r6)
            r12.appendQueryParameter(r3, r2)
            java.lang.String r3 = "to"
            java.lang.String r2 = java.lang.Long.toString(r9)
            r12.appendQueryParameter(r3, r2)
        L_0x0313:
            java.lang.String r3 = r11.A0H
            if (r3 == 0) goto L_0x02ba
            java.lang.String r2 = "doodle"
            r12.appendQueryParameter(r2, r3)
            goto L_0x02ba
        L_0x031d:
            java.lang.String r3 = r5.A09()
            goto L_0x0294
        L_0x0323:
            java.lang.Long r2 = r4.A09
            java.lang.Long r2 = X.C86624Kv.A0Y(r2)
            r4.A09 = r2
            goto L_0x028d
        L_0x032d:
            X.53q r2 = r0.A0H
            byte r30 = r2.A01(r5)
            goto L_0x0283
        L_0x0335:
            android.graphics.Bitmap r3 = X.C107085af.A02(r14, r2)
            r2 = 100
            byte[] r28 = X.C107085af.A03(r3, r2)
            goto L_0x0279
        L_0x0341:
            java.io.File r14 = r11.A0F
            long r2 = r2 * r6
            android.graphics.Bitmap r3 = X.C107085af.A02(r14, r2)
            if (r3 == 0) goto L_0x0392
            boolean r2 = r3.isMutable()
            if (r2 != 0) goto L_0x0359
            android.graphics.Bitmap$Config r14 = android.graphics.Bitmap.Config.ARGB_8888
            r2 = 1
            android.graphics.Bitmap r3 = r3.copy(r14, r2)
            if (r3 == 0) goto L_0x0392
        L_0x0359:
            int r2 = r3.getWidth()
            float r14 = (float) r2
            int r2 = r3.getHeight()
            float r2 = (float) r2
            java.util.List r27 = r12.A05(r14, r2)
            r12.A07(r3, r13, r13, r13)
            r2 = 100
            byte[] r28 = X.C107085af.A03(r3, r2)
        L_0x0370:
            r12.A09(r4)
            java.util.List r2 = r12.A04
            if (r2 == 0) goto L_0x037d
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x037f
        L_0x037d:
            r13 = r18
        L_0x037f:
            java.lang.String r2 = X.C107655bf.A0U()
            r11.A0H = r2
            X.3Dh r3 = r0.A04
            java.io.File r2 = X.C107655bf.A0R(r3, r2)
            r12.A0A(r2)
            r18 = r13
            goto L_0x027b
        L_0x0392:
            r27 = 0
            r28 = 0
            goto L_0x0370
        L_0x0397:
            java.lang.String r6 = "MediaComposerActivity/sendimage"
            com.whatsapp.util.Log.i((java.lang.String) r6)
            java.lang.String r7 = "SEND_TASK_IMAGE_START"
            r6 = 453122092(0x1b02182c, float:1.0761158E-22)
            r8.markerPoint((int) r6, (int) r2, (java.lang.String) r7)
            java.util.HashSet r7 = r0.A0U
            boolean r6 = r7.contains(r1)
            r16 = 0
            if (r6 != 0) goto L_0x03b8
            android.net.Uri r6 = r5.A0G
            boolean r6 = r7.contains(r6)
            if (r6 != 0) goto L_0x03b8
            r15 = r16
        L_0x03b8:
            X.4vP r7 = r0.A0J
            java.util.List r6 = r0.A0W
            r32 = r6
            X.6kE r9 = X.C135166kE.A00
            boolean r12 = r6.contains(r9)
            X.53r r9 = r7.A04
            java.io.File r10 = r5.A05()
            if (r10 == 0) goto L_0x042a
            java.lang.Long r6 = r4.A0A
            java.lang.Long r6 = X.AnonymousClass0x7.A0j(r6)
            r4.A0A = r6
            java.io.File r6 = r5.A07()
            r9.A0J(r6)
            r6 = r16
            r5.A0E(r6)
        L_0x03e0:
            X.C626936e.A06(r10)
            android.net.Uri r6 = android.net.Uri.fromFile(r10)
            android.net.Uri$Builder r6 = r6.buildUpon()
            X.33i r10 = r9.A03
            X.5UR r10 = r10.A0R()
            java.lang.String r11 = X.C107655bf.A0W(r1, r10)
            java.lang.String r10 = "mime_type"
            r6.appendQueryParameter(r10, r11)
            android.net.Uri r13 = r5.A0G
            int r10 = r5.A01()
            X.C989053r.A03(r6, r13, r10)
            java.lang.String r11 = "flip-h"
            java.lang.String r10 = r13.getQueryParameter(r11)
            if (r10 == 0) goto L_0x0412
            java.lang.String r10 = r13.getQueryParameter(r11)
            r6.appendQueryParameter(r11, r10)
        L_0x0412:
            int r13 = r5.A00()
            X.5aV r11 = r7.A01(r5)
            if (r13 != 0) goto L_0x041e
            if (r11 == 0) goto L_0x04e7
        L_0x041e:
            X.2r1 r10 = r7.A02
            X.7Td r10 = r10.A00(r15, r2, r12)
            X.C626936e.A06(r10)
            int r12 = r10.A00
            goto L_0x042f
        L_0x042a:
            java.io.File r10 = r5.A07()
            goto L_0x03e0
        L_0x042f:
            android.net.Uri r6 = r6.build()     // Catch:{ 59c | IOException -> 0x04db }
            android.graphics.Bitmap r12 = r9.A0B(r6, r12, r12)     // Catch:{ 59c | IOException -> 0x04db }
            if (r13 == 0) goto L_0x044e
            boolean r6 = r12.isMutable()
            X.C626936e.A0B(r6)
            r9 = 0
            X.6i2 r6 = r7.A01
            com.whatsapp.filter.FilterUtils.A00(r12, r6, r13, r9)
            java.lang.Long r6 = r4.A0D
            java.lang.Long r6 = X.AnonymousClass0x7.A0j(r6)
            r4.A0D = r6
        L_0x044e:
            if (r11 == 0) goto L_0x04b2
            java.util.List r6 = r11.A04
            r18 = r6
            java.util.Iterator r9 = r18.iterator()
        L_0x0458:
            boolean r6 = r9.hasNext()
            if (r6 == 0) goto L_0x0466
            X.5Uw r6 = X.C86664Kz.A1F(r9)
            r6.A0E()
            goto L_0x0458
        L_0x0466:
            android.graphics.Canvas r9 = X.AnonymousClass4L0.A06(r12)
            int r13 = r11.A00
            int r6 = r12.getWidth()
            float r6 = (float) r6
            r17 = r6
            int r6 = r12.getHeight()
            float r14 = (float) r6
            float r13 = (float) r13
            android.graphics.RectF r6 = r11.A01
            float r26 = r6.width()
            float r27 = r6.height()
            r28 = 0
            r23 = r17
            r24 = r14
            r25 = r13
            r29 = r28
            android.graphics.Matrix r14 = X.C106985aV.A00(r23, r24, r25, r26, r27, r28, r29)
            float r13 = r6.left
            float r13 = -r13
            float r6 = r6.top
            float r6 = -r6
            r14.preTranslate(r13, r6)
            r9.concat(r14)
            java.util.Iterator r13 = r18.iterator()
        L_0x04a1:
            boolean r6 = r13.hasNext()
            if (r6 == 0) goto L_0x04af
            X.5Uw r6 = X.C86664Kz.A1F(r13)
            r6.A0K(r9)
            goto L_0x04a1
        L_0x04af:
            r11.A09(r4)
        L_0x04b2:
            X.3Dh r6 = r7.A00
            java.io.File r11 = X.C96004vP.A00(r1, r6)
            android.net.Uri r6 = android.net.Uri.fromFile(r11)
            android.net.Uri$Builder r6 = r6.buildUpon()
            int r9 = r10.A03     // Catch:{ IOException -> 0x04df }
            boolean r10 = r10 instanceof X.C135646l0     // Catch:{ IOException -> 0x04df }
            com.whatsapp.media.transcode.Mozjpeg r23 = X.C105495Ve.A00     // Catch:{ IOException -> 0x04df }
            java.lang.String r25 = r11.getAbsolutePath()     // Catch:{ IOException -> 0x04df }
            r28 = 0
            r24 = r12
            r26 = r9
            r27 = r2
            r29 = r10
            r23.A00(r24, r25, r26, r27, r28, r29)     // Catch:{ IOException -> 0x04df }
            if (r6 != 0) goto L_0x04e7
            goto L_0x002d
        L_0x04db:
            r2 = move-exception
            java.lang.String r1 = "PrepareAndSendMediaTask/can't load image"
            goto L_0x04e2
        L_0x04df:
            r2 = move-exception
            java.lang.String r1 = "PrepareAndSendMediaTask/can't compress bitmap"
        L_0x04e2:
            com.whatsapp.util.Log.e(r1, r2)
            goto L_0x002d
        L_0x04e7:
            java.lang.String r9 = r5.A09()
            if (r9 == 0) goto L_0x04f8
            java.lang.String r10 = r5.A09()
            if (r10 == 0) goto L_0x04f8
            java.lang.String r9 = "caption"
            r6.appendQueryParameter(r9, r10)
        L_0x04f8:
            java.lang.String r10 = r5.A0B()
            if (r10 == 0) goto L_0x0503
            java.lang.String r9 = "mentions"
            r6.appendQueryParameter(r9, r10)
        L_0x0503:
            int r9 = r5.A01()
            if (r9 != 0) goto L_0x051c
            java.io.File r9 = r5.A05()
            if (r9 != 0) goto L_0x051c
            X.5aV r7 = r7.A01(r5)
            if (r7 != 0) goto L_0x051c
            int r9 = r5.A00()
            r7 = 0
            if (r9 == 0) goto L_0x051d
        L_0x051c:
            r7 = 1
        L_0x051d:
            if (r7 == 0) goto L_0x0581
            java.lang.Long r7 = r4.A09
            java.lang.Long r7 = X.C86624Kv.A0Y(r7)
            r4.A09 = r7
        L_0x0527:
            r39 = 1
        L_0x0529:
            android.net.Uri r7 = r6.build()
            if (r21 == 0) goto L_0x0616
            X.7Tv r4 = r0.A0K
            X.5aV r9 = r4.A01(r5)
            if (r9 == 0) goto L_0x0545
            android.graphics.RectF r4 = r9.A02
            float r5 = r4.width()
            float r4 = r4.height()
            java.util.List r16 = r9.A05(r5, r4)
        L_0x0545:
            X.1VX r5 = r0.A0D
            r4 = 3797(0xed5, float:5.321E-42)
            boolean r4 = r5.A0X(r4)
            if (r4 == 0) goto L_0x0557
            android.net.Uri r4 = X.C989053r.A02(r7)
            android.net.Uri$Builder r6 = r4.buildUpon()
        L_0x0557:
            if (r39 != 0) goto L_0x057f
            if (r3 != 0) goto L_0x057f
            java.util.Map r5 = r0.A0X
            android.net.Uri r4 = r6.build()
            java.lang.Object r5 = r5.get(r4)
            X.65N r5 = (X.AnonymousClass65N) r5
        L_0x0567:
            java.lang.StringBuilder r9 = X.AnonymousClass001.A0o()
            java.lang.String r4 = "PrepareAndSendMediaTask/sendImage optimistic upload mediajob = "
            r9.append(r4)
            r9.append(r5)
            java.lang.String r4 = " ,optimisticLookupUri = "
            X.C18260x0.A1P(r9, r4, r6)
            X.34x r4 = r0.A0M
            r18 = r4
            java.lang.String r6 = "sendmedia/sendimages/share-failed/ "
            goto L_0x058e
        L_0x057f:
            r5 = 0
            goto L_0x0567
        L_0x0581:
            java.lang.Long r7 = r4.A0F
            java.lang.Long r7 = X.C86624Kv.A0Y(r7)
            r4.A0F = r7
            r39 = 0
            if (r15 == 0) goto L_0x0529
            goto L_0x0527
        L_0x058e:
            X.5Ul r4 = r0.A07     // Catch:{ IOException -> 0x05e8, 59c -> 0x05e0, OutOfMemoryError -> 0x05d8, SecurityException -> 0x0603 }
            int r9 = r0.A00     // Catch:{ IOException -> 0x05e8, 59c -> 0x05e0, OutOfMemoryError -> 0x05d8, SecurityException -> 0x0603 }
            int r35 = r0.A0G(r9)     // Catch:{ IOException -> 0x05e8, 59c -> 0x05e0, OutOfMemoryError -> 0x05d8, SecurityException -> 0x0603 }
            X.8n3 r9 = r0.A06     // Catch:{ IOException -> 0x05e8, 59c -> 0x05e0, OutOfMemoryError -> 0x05d8, SecurityException -> 0x0603 }
            r17 = r9
            boolean r14 = r0.A0Y     // Catch:{ IOException -> 0x05e8, 59c -> 0x05e0, OutOfMemoryError -> 0x05d8, SecurityException -> 0x0603 }
            X.5de r13 = r0.A0C     // Catch:{ IOException -> 0x05e8, 59c -> 0x05e0, OutOfMemoryError -> 0x05d8, SecurityException -> 0x0603 }
            boolean r12 = r0.A0a     // Catch:{ IOException -> 0x05e8, 59c -> 0x05e0, OutOfMemoryError -> 0x05d8, SecurityException -> 0x0603 }
            boolean r9 = r0.A0b     // Catch:{ IOException -> 0x05e8, 59c -> 0x05e0, OutOfMemoryError -> 0x05d8, SecurityException -> 0x0603 }
            int r37 = r43.size()     // Catch:{ IOException -> 0x05e8, 59c -> 0x05e0, OutOfMemoryError -> 0x05d8, SecurityException -> 0x0603 }
            X.2fI r11 = r4.A0G     // Catch:{ IOException -> 0x05e8, 59c -> 0x05e0, OutOfMemoryError -> 0x05d8, SecurityException -> 0x0603 }
            java.lang.String r10 = "mentions"
            java.lang.String r10 = r7.getQueryParameter(r10)     // Catch:{ IOException -> 0x05e8, 59c -> 0x05e0, OutOfMemoryError -> 0x05d8, SecurityException -> 0x0603 }
            java.util.List r33 = r11.A00(r10)     // Catch:{ IOException -> 0x05e8, 59c -> 0x05e0, OutOfMemoryError -> 0x05d8, SecurityException -> 0x0603 }
            java.lang.String r10 = "caption"
            java.lang.String r31 = r7.getQueryParameter(r10)     // Catch:{ IOException -> 0x05e8, 59c -> 0x05e0, OutOfMemoryError -> 0x05d8, SecurityException -> 0x0603 }
            r36 = 0
            r23 = r4
            r24 = r7
            r25 = r1
            r26 = r17
            r27 = r13
            r28 = r5
            r29 = r18
            r30 = r15
            r34 = r16
            r38 = r14
            r40 = r3
            r41 = r12
            r42 = r9
            r23.A00(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)     // Catch:{ IOException -> 0x05e8, 59c -> 0x05e0, OutOfMemoryError -> 0x05d8, SecurityException -> 0x0603 }
            goto L_0x0616
        L_0x05d8:
            r1 = move-exception
            com.whatsapp.util.Log.e(r6, r1)
            r5 = 2131889108(0x7f120bd4, float:1.941287E38)
            goto L_0x060a
        L_0x05e0:
            r1 = move-exception
            com.whatsapp.util.Log.e(r6, r1)
            r5 = 2131889079(0x7f120bb7, float:1.9412811E38)
            goto L_0x060a
        L_0x05e8:
            r3 = move-exception
            com.whatsapp.util.Log.e(r6, r3)
            java.lang.String r1 = r3.getMessage()
            if (r1 == 0) goto L_0x05fb
            boolean r1 = X.C86624Kv.A1Z(r3)
            r5 = 2131889102(0x7f120bce, float:1.9412858E38)
            if (r1 != 0) goto L_0x060a
        L_0x05fb:
            r5 = 2131893800(0x7f121e28, float:1.9422387E38)
            X.3Wi r4 = r0.A05
            r3 = 43
            goto L_0x060e
        L_0x0603:
            r1 = move-exception
            com.whatsapp.util.Log.e(r6, r1)
            r5 = 2131891184(0x7f1213f0, float:1.941708E38)
        L_0x060a:
            X.3Wi r4 = r0.A05
            r3 = 42
        L_0x060e:
            X.5sM r1 = new X.5sM
            r1.<init>((X.C993355i) r0, (int) r5, (int) r3)
            r4.A0S(r1)
        L_0x0616:
            java.lang.String r3 = "SEND_TASK_IMAGE_END"
            r1 = 453122092(0x1b02182c, float:1.0761158E-22)
            r8.markerPoint((int) r1, (int) r2, (java.lang.String) r3)
        L_0x061e:
            if (r7 == 0) goto L_0x002d
            r1 = r19
            r1.add(r7)
            goto L_0x002d
        L_0x0627:
            java.lang.String r1 = "INFO_UPDATE"
            goto L_0x001a
        L_0x062b:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x062e:
            r5 = 1
            java.lang.String r1 = "TASK_CLEAN_UP_START"
            r4 = 453122092(0x1b02182c, float:1.0761158E-22)
            r8.markerPoint((int) r4, (int) r5, (java.lang.String) r1)
            java.util.HashSet r6 = r0.A0T
            java.util.Iterator r9 = r6.iterator()
        L_0x063d:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x0679
            java.lang.Object r2 = r9.next()
            X.5YF r2 = (X.AnonymousClass5YF) r2
            X.53q r1 = r0.A0H
            byte r7 = r1.A01(r2)
            boolean r1 = r2.A0J()
            if (r1 == 0) goto L_0x0657
            r7 = 13
        L_0x0657:
            java.lang.Byte r3 = java.lang.Byte.valueOf(r7)
            r1 = r20
            java.lang.Object r2 = r1.get(r3)
            X.4sn r2 = (X.C95204sn) r2
            if (r2 != 0) goto L_0x0670
            boolean r1 = r0.A0d
            X.4sn r2 = r0.A0H(r7, r1)
            r1 = r20
            r1.put(r3, r2)
        L_0x0670:
            java.lang.Long r1 = r2.A0B
            java.lang.Long r1 = X.AnonymousClass0x7.A0j(r1)
            r2.A0B = r1
            goto L_0x063d
        L_0x0679:
            X.53r r2 = r0.A0N
            java.util.Collection r1 = r0.A0S
            java.util.HashSet r1 = X.AnonymousClass0x9.A15(r1)
            X.C989053r.A04(r2, r1, r6)
            java.lang.String r1 = "TASK_CLEAN_UP_END"
            r8.markerPoint((int) r4, (int) r5, (java.lang.String) r1)
            java.util.Iterator r3 = X.C18290x4.A10(r20)
        L_0x068d:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x069f
            java.lang.Object r2 = r3.next()
            X.3ZG r2 = (X.AnonymousClass3ZG) r2
            X.4FV r1 = r0.A0E
            r1.BhB(r2)
            goto L_0x068d
        L_0x069f:
            java.lang.String r0 = "SEND_TASK_END"
            r8.markerPoint((int) r4, (int) r5, (java.lang.String) r0)
            r0 = 2
            r8.markerEnd(r4, r5, r0)
            return r19
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C993355i.A08(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        C187388x8 r0 = (C187388x8) A07(C187388x8.class);
        if (r0 != null) {
            r0.BWL(arrayList);
        }
    }

    public final int A0G(int i) {
        if (this.A0D.A0X(1516)) {
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 4;
            }
            if (i == 3) {
                return 3;
            }
            if (i == 5) {
                return 12;
            }
            if (i == 7) {
                return 1;
            }
            if (i == 30) {
                return 4;
            }
            switch (i) {
                case 10:
                case 11:
                    return 4;
                case 12:
                case 18:
                    return 1;
                case 13:
                case 14:
                case 19:
                case 20:
                case 21:
                    return 2;
                case 15:
                    return 10;
                case 16:
                case 17:
                    return 11;
            }
        } else if (i == 2 || i == 10 || i == 11) {
            return 4;
        } else {
            switch (i) {
                case 15:
                case 16:
                case 17:
                    return 5;
            }
        }
        return 0;
    }

    public final C95204sn A0H(byte b, boolean z) {
        List list = this.A0W;
        boolean contains = list.contains(C135166kE.A00);
        int size = list.size();
        int i = this.A00;
        long j = this.A02;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z2 = this.A0a;
        boolean z3 = this.A0b;
        long j2 = this.A01;
        return AnonymousClass5BG.A00(this.A0B, this.A0D, this.A0O, this.A0P, this.A0Q, this.A0R, b, size, i, j, elapsedRealtime, j2, contains, z, z2, z3);
    }

    public C993355i(C55682qk r3, C64393Dh r4, C69263Wi r5, C181618n3 r6, AnonymousClass5Ul r7, C621033m r8, C56612sH r9, C54292oU r10, AnonymousClass33p r11, C108845de r12, AnonymousClass1VX r13, AnonymousClass4FV r14, C106105Xq r15, C55972rD r16, C988953q r17, AnonymousClass5GW r18, C187388x8 r19, C96004vP r20, C151207Tv r21, C48682fI r22, C624134x r23, C989053r r24, Integer num, Long l, Long l2, Long l3, Collection collection, HashSet hashSet, HashSet hashSet2, List list, List list2, Map map, int i, long j, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        super(r19, true);
        this.A09 = r9;
        this.A0A = r10;
        this.A05 = r5;
        this.A03 = r3;
        this.A07 = r7;
        this.A0I = r18;
        this.A04 = r4;
        this.A0E = r14;
        this.A08 = r8;
        this.A0G = r16;
        this.A0L = r22;
        this.A0N = r24;
        this.A0H = r17;
        this.A0K = r21;
        this.A0J = r20;
        this.A0W = list;
        this.A0V = list2;
        this.A0S = collection;
        this.A0F = r15;
        this.A0M = r23;
        this.A02 = j;
        this.A0Y = z;
        this.A00 = i;
        this.A0Z = z2;
        this.A06 = r6;
        this.A0X = map;
        this.A0T = hashSet;
        this.A0d = z3;
        this.A0c = z4;
        this.A0C = r12;
        this.A0a = z5;
        this.A0b = z6;
        this.A01 = j2;
        this.A0D = r13;
        this.A0O = num;
        this.A0U = hashSet2;
        this.A0B = r11;
        this.A0P = l;
        this.A0Q = l2;
        this.A0R = l3;
    }
}
