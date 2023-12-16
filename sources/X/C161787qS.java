package X;

import android.content.Context;
import android.os.Handler;
import com.facebook.android.exoplayer2.util.Util;
import com.facebook.video.heroplayer.service.ServiceEventCallbackImpl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.7qS  reason: invalid class name and case insensitive filesystem */
public class C161787qS {
    public static final C158037jK[] A0a = {C158037jK.A02, C158037jK.A05, C158037jK.A06};
    public float A00 = 1.0f;
    public C153737br A01;
    public C186328v7 A02;
    public C158167jX A03 = C158167jX.A05;
    public C185778uE A04;
    public C152767a5 A05;
    public AnonymousClass6KH A06;
    public AnonymousClass0Xd A07;
    public C05300Su A08;
    public C177918gf A09;
    public AnonymousClass7OP A0A;
    public C152777a6 A0B;
    public ServiceEventCallbackImpl A0C;
    public C151937Ww A0D;
    public C161427pc A0E;
    public C157767iq A0F;
    public String A0G = "";
    public AtomicReference A0H;
    public C187398x9[] A0I;
    public final Context A0J;
    public final Handler A0K;
    public final C158037jK A0L;
    public final C1444171m A0M;
    public final C150157Pl A0N;
    public final C146597Aw A0O;
    public final C162987t5 A0P;
    public final AnonymousClass81X A0Q;
    public final AnonymousClass8LG A0R;
    public final AnonymousClass8L8 A0S;
    public final C177928gg A0T;
    public final List A0U = new CopyOnWriteArrayList();
    public final Map A0V;
    public final AtomicBoolean A0W;
    public final AtomicBoolean A0X;
    public final AtomicBoolean A0Y;
    public final boolean A0Z;

    public static String A00(C152767a5 r5) {
        C150777Se r0;
        List<AnonymousClass7PZ> list;
        String str;
        if (r5 == null) {
            return null;
        }
        List list2 = r5.A0A;
        if (list2.size() < 1 || (r0 = (C150777Se) list2.get(0)) == null || (list = r0.A01) == null) {
            return null;
        }
        ArrayList A0s = AnonymousClass001.A0s();
        for (AnonymousClass7PZ r2 : list) {
            if (r2.A00 == 3) {
                A0s.add(r2);
            }
        }
        ArrayList A0s2 = AnonymousClass001.A0s();
        Iterator it = A0s.iterator();
        while (it.hasNext()) {
            List list3 = ((AnonymousClass7PZ) it.next()).A05;
            if (list3 != null && !list3.isEmpty()) {
                A0s2.add(list3.get(0));
            }
        }
        if (A0s2.size() != 1 || (str = ((C152937aP) A0s2.get(0)).A00.A0R) == null) {
            return null;
        }
        return str;
    }

    public static /* synthetic */ void A01(C161787qS r6) {
        int i = r6.A0R.playbackAboutToFinishCallbackTriggeringRemainingDuration;
        if (i <= 0) {
            i = 2000;
        }
        long A012 = r6.A01.A01() - ((long) i);
        if (A012 > r6.A01.A01()) {
            A012 = r6.A01.A01() / 2;
        }
        C153097af A042 = r6.A01.A04(new C1673080o(r6));
        C159197lM.A02(!A042.A07);
        A042.A02 = A012;
        A042.A00();
    }

    public int A02(int i) {
        if (((AnonymousClass6KG) this.A06.A02.get()).A02.get(i)) {
            return -1;
        }
        return 0;
    }

    public long A03() {
        if (this.A0R.isExo2UseAbsolutePosition) {
            C153737br r1 = this.A01;
            if (r1.A0C()) {
                return r1.A05;
            }
            return Util.A05(r1.A08.A0D);
        }
        C153737br r2 = this.A01;
        if (r2.A0C()) {
            return r2.A06;
        }
        return r2.A02(r2.A08.A0D);
    }

    public void A04() {
        Context context = this.A0J;
        Map map = this.A0V;
        ServiceEventCallbackImpl serviceEventCallbackImpl = this.A0C;
        AnonymousClass0Xd r3 = this.A07;
        AtomicBoolean atomicBoolean = this.A0Y;
        AtomicBoolean atomicBoolean2 = this.A0X;
        C150157Pl r5 = this.A0N;
        C157767iq r1 = new C157767iq(context, r3, this.A09, r5, serviceEventCallbackImpl, this.A0T, map, atomicBoolean, atomicBoolean2);
        this.A0F = r1;
        this.A0E = new C161427pc(context, this.A0K, r5, this.A0P, serviceEventCallbackImpl, r1, map);
    }

    public void A05(int i, int i2) {
        AnonymousClass6KF r1 = new AnonymousClass6KF((AnonymousClass6KG) this.A06.A02.get());
        r1.A00(i, AnonymousClass000.A1U(i2, -1));
        this.A06.A03(r1);
    }

    public void A06(long j) {
        C152777a6 r0 = this.A0B;
        if (r0 != null && r0.A0F.A01() && !this.A0R.skipAV1PreviousKeyFrameSeek) {
            C153737br r02 = this.A01;
            C150717Rx.A00(r02.A0K.A0j, C158037jK.A06, 5);
        }
        if (this.A0R.isExo2UseAbsolutePosition) {
            this.A01.A08(j);
            return;
        }
        C153737br r1 = this.A01;
        r1.A07(r1.A00(), j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0059, code lost:
        if (r5 >= 12000) goto L_0x005b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(long r10, boolean r12) {
        /*
            r9 = this;
            X.7a6 r0 = r9.A0B
            if (r0 == 0) goto L_0x002e
            X.7yv r0 = r0.A0F
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x002e
            X.8LG r0 = r9.A0R
            boolean r0 = r0.skipAV1PreviousKeyFrameSeek
            if (r0 != 0) goto L_0x002e
            X.7br r0 = r9.A01
            X.7jK r1 = X.C158037jK.A06
        L_0x0016:
            if (r1 != 0) goto L_0x001a
            X.7jK r1 = X.C158037jK.A03
        L_0x001a:
            X.81Q r0 = r0.A0K
            X.7nD r0 = r0.A0j
            r4 = 5
            X.C150717Rx.A00(r0, r1, r4)
            X.8LG r7 = r9.A0R
            boolean r0 = r7.isExo2UseAbsolutePosition
            if (r0 == 0) goto L_0x0038
            X.7br r0 = r9.A01
            r0.A08(r10)
            return
        L_0x002e:
            X.7br r0 = r9.A01
            if (r12 == 0) goto L_0x0035
            X.7jK r1 = r9.A0L
            goto L_0x0016
        L_0x0035:
            X.7jK r1 = X.C158037jK.A03
            goto L_0x0016
        L_0x0038:
            boolean r0 = r7.enableBackwardJumpSeekKeyframeSync
            if (r0 == 0) goto L_0x0078
            long r1 = r9.A03()
            int r0 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            boolean r8 = X.AnonymousClass001.A1W(r0)
            long r0 = r9.A03()
            long r5 = X.AnonymousClass6C9.A0N(r0, r10)
            r1 = 8000(0x1f40, double:3.9525E-320)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x005b
            r1 = 12000(0x2ee0, double:5.929E-320)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            r3 = 1
            if (r0 < 0) goto L_0x005c
        L_0x005b:
            r3 = 0
        L_0x005c:
            int r2 = r7.seekParameterOptionIndex
            if (r2 < 0) goto L_0x0078
            X.7jK[] r1 = A0a
            int r0 = r1.length
            if (r2 >= r0) goto L_0x0078
            if (r8 == 0) goto L_0x0078
            if (r3 == 0) goto L_0x0078
            r1 = r1[r2]
            X.7br r0 = r9.A01
            if (r1 != 0) goto L_0x0071
            X.7jK r1 = X.C158037jK.A03
        L_0x0071:
            X.81Q r0 = r0.A0K
            X.7nD r0 = r0.A0j
            X.C150717Rx.A00(r0, r1, r4)
        L_0x0078:
            X.7br r1 = r9.A01
            int r0 = r1.A00()
            r1.A07(r0, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C161787qS.A07(long, boolean):void");
    }

    public void A08(C186008ub r4) {
        List list = this.A0U;
        if (list.isEmpty()) {
            C151937Ww r1 = new C151937Ww(this);
            this.A0D = r1;
            this.A01.A0R.add(r1);
        }
        list.add(r4);
    }

    /* JADX WARNING: type inference failed for: r22v1, types: [X.82Z] */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0465, code lost:
        if (r0.A0B != false) goto L_0x0467;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0022, code lost:
        if (r0.A0D == false) goto L_0x0024;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x02af A[Catch:{ Exception -> 0x01cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x02c3 A[Catch:{ Exception -> 0x01cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x02d1 A[Catch:{ Exception -> 0x01cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0329 A[Catch:{ Exception -> 0x01cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x034d A[Catch:{ Exception -> 0x01cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x035a A[Catch:{ Exception -> 0x01cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0364 A[Catch:{ Exception -> 0x01cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x036d A[Catch:{ Exception -> 0x01cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0385 A[Catch:{ Exception -> 0x01cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x043d A[Catch:{ Exception -> 0x01cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0161 A[Catch:{ Exception -> 0x01cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01ab A[Catch:{ Exception -> 0x01cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01ae A[Catch:{ Exception -> 0x01cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01e2 A[SYNTHETIC, Splitter:B:71:0x01e2] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0274 A[Catch:{ Exception -> 0x01cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0289 A[Catch:{ Exception -> 0x01cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x029c A[Catch:{ Exception -> 0x01cb }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void A09(X.C152777a6 r38, boolean r39) {
        /*
            r37 = this;
            r3 = r37
            monitor-enter(r3)
            X.7iq r4 = r3.A0F     // Catch:{ all -> 0x04d5 }
            X.8L8 r2 = r3.A0S     // Catch:{ all -> 0x04d5 }
            java.util.concurrent.atomic.AtomicBoolean r1 = r3.A0Y     // Catch:{ all -> 0x04d5 }
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.A0W     // Catch:{ all -> 0x04d5 }
            r9 = 0
            r15 = r38
            X.8v7 r0 = r4.A01(r15, r2, r1, r0)     // Catch:{ all -> 0x04d5 }
            r3.A02 = r0     // Catch:{ all -> 0x04d5 }
            X.8LG r6 = r3.A0R     // Catch:{ all -> 0x04d5 }
            boolean r0 = r6.enableMixedCodecManifestSupport     // Catch:{ all -> 0x04d5 }
            if (r0 == 0) goto L_0x0024
            X.7a5 r0 = r3.A05     // Catch:{ all -> 0x04d5 }
            if (r0 == 0) goto L_0x0024
            boolean r0 = r0.A0D     // Catch:{ all -> 0x04d5 }
            r18 = 1
            if (r0 != 0) goto L_0x0026
        L_0x0024:
            r18 = 0
        L_0x0026:
            boolean r0 = r6.useDefaultTrackSelector     // Catch:{ all -> 0x04d5 }
            if (r0 == 0) goto L_0x0082
            r0 = 0
            X.6KH r10 = new X.6KH     // Catch:{ all -> 0x04d5 }
            r10.<init>(r0)     // Catch:{ all -> 0x04d5 }
        L_0x0030:
            r3.A06 = r10     // Catch:{ all -> 0x04d5 }
            boolean r0 = r6.useExoPlayerBuilder     // Catch:{ all -> 0x04d5 }
            if (r0 == 0) goto L_0x0441
            android.content.Context r0 = r3.A0J     // Catch:{ all -> 0x04d5 }
            X.7Pu r4 = new X.7Pu     // Catch:{ all -> 0x04d5 }
            r4.<init>(r0)     // Catch:{ all -> 0x04d5 }
            X.80r r1 = new X.80r     // Catch:{ all -> 0x04d5 }
            r1.<init>(r3)     // Catch:{ all -> 0x04d5 }
            boolean r0 = r4.A09     // Catch:{ all -> 0x04d5 }
            r16 = r0 ^ 1
            X.C159197lM.A02(r16)     // Catch:{ all -> 0x04d5 }
            r0 = 4
            X.75z r10 = new X.75z     // Catch:{ all -> 0x04d5 }
            r10.<init>(r1, r0)     // Catch:{ all -> 0x04d5 }
            r4.A07 = r10     // Catch:{ all -> 0x04d5 }
            X.6KH r1 = r3.A06     // Catch:{ all -> 0x04d5 }
            X.C159197lM.A02(r16)     // Catch:{ all -> 0x04d5 }
            X.75z r0 = new X.75z     // Catch:{ all -> 0x04d5 }
            r0.<init>(r1, r9)     // Catch:{ all -> 0x04d5 }
            r4.A08 = r0     // Catch:{ all -> 0x04d5 }
            X.8v7 r1 = r3.A02     // Catch:{ all -> 0x04d5 }
            X.C159197lM.A02(r16)     // Catch:{ all -> 0x04d5 }
            r12 = 1
            X.75z r0 = new X.75z     // Catch:{ all -> 0x04d5 }
            r0.<init>(r1, r12)     // Catch:{ all -> 0x04d5 }
            r4.A06 = r0     // Catch:{ all -> 0x04d5 }
            boolean r0 = r6.updateLoadingPriorityExo2     // Catch:{ all -> 0x04d5 }
            r21 = r0
            boolean r0 = r6.checkReadToEndBeforeUpdatingFinalState     // Catch:{ all -> 0x04d5 }
            r22 = r0
            boolean r0 = r6.continueLoadingOnSeekbarExo2     // Catch:{ all -> 0x04d5 }
            r23 = r0
            X.7a5 r0 = r3.A05     // Catch:{ all -> 0x04d5 }
            if (r0 == 0) goto L_0x0375
            boolean r0 = r0.A0B     // Catch:{ all -> 0x04d5 }
            r24 = 0
            if (r0 == 0) goto L_0x0377
            goto L_0x0375
        L_0x0082:
            X.7pc r11 = r3.A0E     // Catch:{ all -> 0x04d5 }
            r22 = 0
            X.8LG r13 = r11.A0C     // Catch:{ all -> 0x04d5 }
            com.facebook.video.heroplayer.service.ServiceEventCallbackImpl r1 = r11.A09     // Catch:{ all -> 0x04d5 }
            X.7yv r8 = r15.A0F     // Catch:{ all -> 0x04d5 }
            java.lang.String r5 = r8.A0H     // Catch:{ all -> 0x04d5 }
            if (r5 != 0) goto L_0x009b
            java.lang.String r4 = "AbrMonitorFactory"
            java.lang.String r2 = "request.mVideoSource.mVideoId is null"
            java.lang.Object[] r0 = new java.lang.Object[r9]     // Catch:{ all -> 0x04d5 }
            X.AnonymousClass6C8.A1B(r2, r4, r0)     // Catch:{ all -> 0x04d5 }
            goto L_0x02ab
        L_0x009b:
            boolean r0 = r13.abrMonitorEnabled     // Catch:{ all -> 0x04d5 }
            if (r0 == 0) goto L_0x02ab
            X.7FL r12 = new X.7FL     // Catch:{ all -> 0x04d5 }
            r12.<init>(r1)     // Catch:{ all -> 0x04d5 }
        L_0x00a4:
            boolean r0 = r13.abrMonitorEnabled     // Catch:{ all -> 0x04d5 }
            if (r0 == 0) goto L_0x02b8
            X.7FL r17 = new X.7FL     // Catch:{ all -> 0x04d5 }
            r0 = r17
            r0.<init>(r1)     // Catch:{ all -> 0x04d5 }
        L_0x00af:
            X.7iq r10 = r11.A0B     // Catch:{ all -> 0x04d5 }
            X.7Zl r23 = X.C157767iq.A00(r15)     // Catch:{ all -> 0x04d5 }
            X.8LG r7 = r10.A0B     // Catch:{ all -> 0x04d5 }
            X.8L1 r0 = r7.abrSetting     // Catch:{ all -> 0x04d5 }
            X.0Xd r5 = r10.A05     // Catch:{ all -> 0x04d5 }
            r10.A02 = r12     // Catch:{ all -> 0x04d5 }
            com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration r14 = new com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration     // Catch:{ all -> 0x04d5 }
            r25 = r9
            r20 = r14
            r21 = r0
            r24 = r9
            r20.<init>(r21, r22, r23, r24, r25)     // Catch:{ all -> 0x04d5 }
            X.71v r4 = r10.A0C     // Catch:{ all -> 0x04d5 }
            X.81h r2 = new X.81h     // Catch:{ all -> 0x04d5 }
            r2.<init>(r14, r4)     // Catch:{ all -> 0x04d5 }
            r10.A00 = r2     // Catch:{ all -> 0x04d5 }
            android.content.Context r0 = r10.A03     // Catch:{ all -> 0x04d5 }
            r20 = r0
            X.8L1 r1 = r7.abrSetting     // Catch:{ all -> 0x04d5 }
            boolean r0 = r1.forceUpdateFormatListIfFormatSizeChanged     // Catch:{ all -> 0x04d5 }
            X.82Z r16 = new X.82Z     // Catch:{ all -> 0x04d5 }
            r25 = r22
            r28 = r22
            r21 = r2
            r24 = r22
            r26 = r14
            r27 = r12
            r29 = r0
            r19 = r16
            r19.<init>((android.content.Context) r20, (X.C177658gE) r21, (X.C177658gE) r22, (X.C152587Zl) r23, (X.AnonymousClass82Z) r24, (X.AnonymousClass703) r25, (com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration) r26, (X.AnonymousClass7FL) r27, (X.AnonymousClass707) r28, (boolean) r29)     // Catch:{ all -> 0x04d5 }
            r0 = r16
            r10.A01 = r0     // Catch:{ all -> 0x04d5 }
            X.8LF r10 = X.AnonymousClass8LF.A00     // Catch:{ all -> 0x04d5 }
            X.71l r0 = new X.71l     // Catch:{ all -> 0x04d5 }
            r0.<init>()     // Catch:{ all -> 0x04d5 }
            X.8L0 r0 = new X.8L0     // Catch:{ all -> 0x04d5 }
            r0.<init>()     // Catch:{ all -> 0x04d5 }
            r14 = -1
            X.7ft r2 = new X.7ft     // Catch:{ all -> 0x04d5 }
            r2.<init>(r0, r10)     // Catch:{ all -> 0x04d5 }
            X.82b r0 = new X.82b     // Catch:{ all -> 0x04d5 }
            r0.<init>(r2)     // Catch:{ all -> 0x04d5 }
            X.82a r23 = new X.82a     // Catch:{ all -> 0x04d5 }
            r23.<init>()     // Catch:{ all -> 0x04d5 }
            java.util.Map r11 = r11.A0D     // Catch:{ all -> 0x04d5 }
            boolean r2 = r1.enableAudioIbrEvaluator     // Catch:{ all -> 0x04d5 }
            if (r2 != 0) goto L_0x0259
            boolean r2 = r1.enableAudioAbrEvaluator     // Catch:{ all -> 0x04d5 }
            if (r2 != 0) goto L_0x0259
            boolean r1 = r1.enableMultiAudioSupport     // Catch:{ all -> 0x04d5 }
            if (r1 != 0) goto L_0x0259
        L_0x011e:
            X.7U2 r1 = new X.7U2     // Catch:{ all -> 0x04d5 }
            r19 = r1
            r20 = r16
            r21 = r22
            r22 = r0
            r24 = r13
            r25 = r11
            r19.<init>(r20, r21, r22, r23, r24, r25)     // Catch:{ all -> 0x04d5 }
            X.6KH r10 = new X.6KH     // Catch:{ all -> 0x04d5 }
            r10.<init>(r1)     // Catch:{ all -> 0x04d5 }
            java.util.concurrent.atomic.AtomicReference r0 = r10.A02     // Catch:{ all -> 0x04d5 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x04d5 }
            X.6KG r0 = (X.AnonymousClass6KG) r0     // Catch:{ all -> 0x04d5 }
            X.6KF r13 = new X.6KF     // Catch:{ all -> 0x04d5 }
            r13.<init>(r0)     // Catch:{ all -> 0x04d5 }
            boolean r0 = r15.A00()     // Catch:{ all -> 0x04d5 }
            r12 = 1
            if (r0 == 0) goto L_0x0163
            X.8L1 r0 = r6.abrSetting     // Catch:{ all -> 0x04d5 }
            boolean r0 = r0.liveShouldFilterHardwareCapabilities     // Catch:{ all -> 0x04d5 }
            if (r0 != 0) goto L_0x0169
        L_0x014e:
            boolean r0 = r6.exceedRendererCapabilitiesIfAllFilteredOut     // Catch:{ all -> 0x04d5 }
            r13.A04 = r0     // Catch:{ all -> 0x04d5 }
            X.8L1 r1 = r6.abrSetting     // Catch:{ all -> 0x04d5 }
            boolean r0 = r1.enableAudioAbrEvaluator     // Catch:{ all -> 0x04d5 }
            if (r0 != 0) goto L_0x02bc
            boolean r0 = r1.enableAudioIbrEvaluator     // Catch:{ all -> 0x04d5 }
            if (r0 != 0) goto L_0x02bc
            boolean r1 = r1.enableMultiAudioSupport     // Catch:{ all -> 0x04d5 }
            r0 = 0
            if (r1 == 0) goto L_0x02bd
            goto L_0x02bc
        L_0x0163:
            X.8L1 r0 = r6.abrSetting     // Catch:{ all -> 0x04d5 }
            boolean r0 = r0.shouldFilterHardwareCapabilities     // Catch:{ all -> 0x04d5 }
            if (r0 == 0) goto L_0x014e
        L_0x0169:
            android.content.Context r11 = r3.A0J     // Catch:{ all -> 0x04d5 }
            java.lang.String r0 = "display"
            java.lang.Object r0 = r11.getSystemService(r0)     // Catch:{ all -> 0x04d5 }
            android.hardware.display.DisplayManager r0 = (android.hardware.display.DisplayManager) r0     // Catch:{ all -> 0x04d5 }
            if (r0 == 0) goto L_0x017b
            android.view.Display r7 = r0.getDisplay(r9)     // Catch:{ all -> 0x04d5 }
            if (r7 != 0) goto L_0x018a
        L_0x017b:
            java.lang.String r0 = "window"
            java.lang.Object r0 = r11.getSystemService(r0)     // Catch:{ all -> 0x04d5 }
            r0.getClass()     // Catch:{ all -> 0x04d5 }
            android.view.WindowManager r0 = (android.view.WindowManager) r0     // Catch:{ all -> 0x04d5 }
            android.view.Display r7 = r0.getDefaultDisplay()     // Catch:{ all -> 0x04d5 }
        L_0x018a:
            int r0 = r7.getDisplayId()     // Catch:{ all -> 0x04d5 }
            if (r0 != 0) goto L_0x0202
            android.content.Context r1 = r11.getApplicationContext()     // Catch:{ all -> 0x04d5 }
            java.lang.String r0 = "uimode"
            java.lang.Object r0 = r1.getSystemService(r0)     // Catch:{ all -> 0x04d5 }
            android.app.UiModeManager r0 = (android.app.UiModeManager) r0     // Catch:{ all -> 0x04d5 }
            if (r0 == 0) goto L_0x0202
            int r1 = r0.getCurrentModeType()     // Catch:{ all -> 0x04d5 }
            r0 = 4
            if (r1 != r0) goto L_0x0202
            int r1 = com.facebook.android.exoplayer2.util.Util.A00     // Catch:{ all -> 0x04d5 }
            r0 = 28
            if (r1 >= r0) goto L_0x01ae
            java.lang.String r5 = "sys.display-size"
            goto L_0x01b0
        L_0x01ae:
            java.lang.String r5 = "vendor.display-size"
        L_0x01b0:
            java.lang.String r0 = "android.os.SystemProperties"
            java.lang.Class r4 = java.lang.Class.forName(r0)     // Catch:{ Exception -> 0x01cb }
            java.lang.String r2 = "get"
            java.lang.Class[] r1 = new java.lang.Class[r12]     // Catch:{ Exception -> 0x01cb }
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.reflect.Method r1 = X.AnonymousClass001.A0r(r4, r0, r2, r1, r9)     // Catch:{ Exception -> 0x01cb }
            java.lang.Object[] r0 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x01cb }
            r0[r9] = r5     // Catch:{ Exception -> 0x01cb }
            java.lang.Object r1 = r1.invoke(r4, r0)     // Catch:{ Exception -> 0x01cb }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x01cb }
            goto L_0x01dc
        L_0x01cb:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x04d5 }
            java.lang.String r0 = "Failed to read system property "
            java.lang.String r1 = X.AnonymousClass000.A0V(r0, r5, r1)     // Catch:{ all -> 0x04d5 }
            java.lang.String r0 = "Util"
            android.util.Log.e(r0, r1, r2)     // Catch:{ all -> 0x04d5 }
            r1 = 0
        L_0x01dc:
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x04d5 }
            if (r0 != 0) goto L_0x0224
            java.lang.String r2 = r1.trim()     // Catch:{ NumberFormatException -> 0x0215 }
            java.lang.String r0 = "x"
            java.lang.String[] r5 = r2.split(r0, r14)     // Catch:{ NumberFormatException -> 0x0215 }
            int r2 = r5.length     // Catch:{ NumberFormatException -> 0x0215 }
            r0 = 2
            if (r2 != r0) goto L_0x0215
            int r4 = X.AnonymousClass6CA.A0F(r5, r9)     // Catch:{ NumberFormatException -> 0x0215 }
            int r0 = X.AnonymousClass6CA.A0F(r5, r12)     // Catch:{ NumberFormatException -> 0x0215 }
            if (r4 <= 0) goto L_0x0215
            if (r0 <= 0) goto L_0x0215
            android.graphics.Point r2 = new android.graphics.Point     // Catch:{ NumberFormatException -> 0x0215 }
            r2.<init>(r4, r0)     // Catch:{ NumberFormatException -> 0x0215 }
            goto L_0x024d
        L_0x0202:
            android.graphics.Point r2 = new android.graphics.Point     // Catch:{ all -> 0x04d5 }
            r2.<init>()     // Catch:{ all -> 0x04d5 }
            int r1 = com.facebook.android.exoplayer2.util.Util.A00     // Catch:{ all -> 0x04d5 }
            r0 = 23
            if (r1 < r0) goto L_0x0211
            com.facebook.android.exoplayer2.util.Util.A09(r2, r7)     // Catch:{ all -> 0x04d5 }
            goto L_0x024d
        L_0x0211:
            r7.getRealSize(r2)     // Catch:{ all -> 0x04d5 }
            goto L_0x024d
        L_0x0215:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x04d5 }
            java.lang.String r0 = "Invalid display size: "
            java.lang.String r1 = X.AnonymousClass000.A0V(r0, r1, r2)     // Catch:{ all -> 0x04d5 }
            java.lang.String r0 = "Util"
            android.util.Log.e(r0, r1)     // Catch:{ all -> 0x04d5 }
        L_0x0224:
            java.lang.String r1 = "Sony"
            java.lang.String r0 = com.facebook.android.exoplayer2.util.Util.A03     // Catch:{ all -> 0x04d5 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x04d5 }
            if (r0 == 0) goto L_0x0202
            java.lang.String r1 = com.facebook.android.exoplayer2.util.Util.A04     // Catch:{ all -> 0x04d5 }
            java.lang.String r0 = "BRAVIA"
            boolean r0 = r1.startsWith(r0)     // Catch:{ all -> 0x04d5 }
            if (r0 == 0) goto L_0x0202
            android.content.pm.PackageManager r1 = r11.getPackageManager()     // Catch:{ all -> 0x04d5 }
            java.lang.String r0 = "com.sony.dtv.hardware.panel.qfhd"
            boolean r0 = r1.hasSystemFeature(r0)     // Catch:{ all -> 0x04d5 }
            if (r0 == 0) goto L_0x0202
            r1 = 3840(0xf00, float:5.381E-42)
            r0 = 2160(0x870, float:3.027E-42)
            android.graphics.Point r2 = new android.graphics.Point     // Catch:{ all -> 0x04d5 }
            r2.<init>(r1, r0)     // Catch:{ all -> 0x04d5 }
        L_0x024d:
            int r1 = r2.x     // Catch:{ all -> 0x04d5 }
            int r0 = r2.y     // Catch:{ all -> 0x04d5 }
            r13.A0F = r1     // Catch:{ all -> 0x04d5 }
            r13.A0E = r0     // Catch:{ all -> 0x04d5 }
            r13.A0P = r12     // Catch:{ all -> 0x04d5 }
            goto L_0x014e
        L_0x0259:
            X.7Zl r27 = X.C157767iq.A00(r15)     // Catch:{ all -> 0x04d5 }
            X.8L1 r1 = r7.abrSetting     // Catch:{ all -> 0x04d5 }
            com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration r2 = new com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration     // Catch:{ all -> 0x04d5 }
            r29 = r9
            r25 = r1
            r28 = r9
            r24 = r2
            r26 = r22
            r24.<init>(r25, r26, r27, r28, r29)     // Catch:{ all -> 0x04d5 }
            boolean r1 = r2.getShouldEnableAudioIbrCache()     // Catch:{ all -> 0x04d5 }
            if (r1 == 0) goto L_0x027e
            X.7AJ r10 = new X.7AJ     // Catch:{ all -> 0x04d5 }
            r10.<init>(r5)     // Catch:{ all -> 0x04d5 }
            X.7J6 r1 = new X.7J6     // Catch:{ all -> 0x04d5 }
            r1.<init>(r10, r5, r7)     // Catch:{ all -> 0x04d5 }
        L_0x027e:
            X.81h r1 = new X.81h     // Catch:{ all -> 0x04d5 }
            r1.<init>(r2, r4)     // Catch:{ all -> 0x04d5 }
            X.8L1 r2 = r7.abrSetting     // Catch:{ all -> 0x04d5 }
            boolean r4 = r2.enableAudioAbrEvaluator     // Catch:{ all -> 0x04d5 }
            if (r4 == 0) goto L_0x029c
            X.8xH r26 = r5.A08()     // Catch:{ all -> 0x04d5 }
            X.82Y r22 = new X.82Y     // Catch:{ all -> 0x04d5 }
            r24 = r22
            r25 = r1
            r28 = r17
            r29 = r2
            r24.<init>(r25, r26, r27, r28, r29)     // Catch:{ all -> 0x04d5 }
            goto L_0x011e
        L_0x029c:
            boolean r1 = r2.enableMultiAudioSupport     // Catch:{ all -> 0x04d5 }
            if (r1 != 0) goto L_0x02a4
            boolean r1 = r2.enableAudioIbrEvaluator     // Catch:{ all -> 0x04d5 }
            if (r1 == 0) goto L_0x011e
        L_0x02a4:
            X.82Z r22 = new X.82Z     // Catch:{ all -> 0x04d5 }
            r22.<init>()     // Catch:{ all -> 0x04d5 }
            goto L_0x011e
        L_0x02ab:
            r12 = r22
            if (r5 != 0) goto L_0x00a4
            java.lang.String r2 = "AbrMonitorFactory"
            java.lang.String r1 = "request.mVideoSource.mVideoId is null"
            java.lang.Object[] r0 = new java.lang.Object[r9]     // Catch:{ all -> 0x04d5 }
            X.AnonymousClass6C8.A1B(r1, r2, r0)     // Catch:{ all -> 0x04d5 }
        L_0x02b8:
            r17 = r22
            goto L_0x00af
        L_0x02bc:
            r0 = 1
        L_0x02bd:
            r13.A01 = r0     // Catch:{ all -> 0x04d5 }
            r13.A0O = r12     // Catch:{ all -> 0x04d5 }
            if (r18 == 0) goto L_0x02c5
            r13.A02 = r12     // Catch:{ all -> 0x04d5 }
        L_0x02c5:
            int r1 = r15.A01     // Catch:{ all -> 0x04d5 }
            X.6uz[] r0 = X.C141076uz.values()     // Catch:{ all -> 0x04d5 }
            r11 = r0[r1]     // Catch:{ all -> 0x04d5 }
            android.net.Uri r0 = r8.A04     // Catch:{ all -> 0x04d5 }
            if (r0 != 0) goto L_0x0308
            X.7a5 r1 = r3.A05     // Catch:{ all -> 0x04d5 }
            if (r1 == 0) goto L_0x0306
            java.util.List r2 = r1.A0A     // Catch:{ all -> 0x04d5 }
            int r0 = r2.size()     // Catch:{ all -> 0x04d5 }
            if (r0 <= 0) goto L_0x02fd
            java.lang.Object r0 = r2.get(r9)     // Catch:{ all -> 0x04d5 }
            X.7Se r0 = (X.C150777Se) r0     // Catch:{ all -> 0x04d5 }
            java.util.List r0 = r0.A01     // Catch:{ all -> 0x04d5 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x04d5 }
            if (r0 != 0) goto L_0x02fd
            java.lang.Object r0 = r2.get(r9)     // Catch:{ all -> 0x04d5 }
            X.7Se r0 = (X.C150777Se) r0     // Catch:{ all -> 0x04d5 }
            X.7PZ r0 = X.C150777Se.A00(r0, r9)     // Catch:{ all -> 0x04d5 }
            java.util.List r0 = r0.A04     // Catch:{ all -> 0x04d5 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x04d5 }
            if (r0 == 0) goto L_0x0308
        L_0x02fd:
            boolean r0 = r1.A0H     // Catch:{ all -> 0x04d5 }
            if (r0 == 0) goto L_0x0306
            boolean r0 = r6.enableUsingASRCaptions     // Catch:{ all -> 0x04d5 }
            if (r0 == 0) goto L_0x0306
            goto L_0x0308
        L_0x0306:
            r2 = 0
            goto L_0x0309
        L_0x0308:
            r2 = 1
        L_0x0309:
            boolean r0 = r6.enableEmsgTrackForAll     // Catch:{ all -> 0x04d5 }
            boolean r8 = X.AnonymousClass6C9.A1L(r0)
            X.7a5 r1 = r3.A05     // Catch:{ all -> 0x04d5 }
            if (r1 == 0) goto L_0x034e
            boolean r0 = r1.A0H     // Catch:{ all -> 0x04d5 }
            if (r0 == 0) goto L_0x034e
            boolean r0 = r6.enableUsingASRCaptions     // Catch:{ all -> 0x04d5 }
            if (r0 == 0) goto L_0x034e
            java.lang.String r2 = A00(r1)     // Catch:{ all -> 0x04d5 }
            if (r2 == 0) goto L_0x034d
            java.lang.String r0 = "default"
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x04d5 }
            if (r0 != 0) goto L_0x034d
            java.lang.String[] r0 = new java.lang.String[r12]     // Catch:{ all -> 0x04d5 }
            r0[r9] = r2     // Catch:{ all -> 0x04d5 }
            r13.A01(r0)     // Catch:{ all -> 0x04d5 }
            X.7t5 r7 = r3.A0P     // Catch:{ all -> 0x04d5 }
            java.util.List r1 = java.util.Collections.singletonList(r2)     // Catch:{ all -> 0x04d5 }
            X.7jM r0 = new X.7jM     // Catch:{ all -> 0x04d5 }
            r0.<init>(r2, r1, r12)     // Catch:{ all -> 0x04d5 }
            android.os.Handler r5 = r7.A0l     // Catch:{ all -> 0x04d5 }
            r4 = 37
            java.util.List r2 = r0.A01     // Catch:{ all -> 0x04d5 }
            java.lang.String r1 = r0.A00     // Catch:{ all -> 0x04d5 }
            X.7jM r0 = new X.7jM     // Catch:{ all -> 0x04d5 }
            r0.<init>(r1, r2, r12)     // Catch:{ all -> 0x04d5 }
            X.C162987t5.A01(r5, r7, r0, r4)     // Catch:{ all -> 0x04d5 }
            r2 = 1
            goto L_0x034e
        L_0x034d:
            r2 = 0
        L_0x034e:
            r1 = 2
            if (r2 == 0) goto L_0x0355
            boolean r0 = r6.disableLiveCaptioningOnPlayerInit     // Catch:{ all -> 0x04d5 }
            if (r0 == 0) goto L_0x0358
        L_0x0355:
            r13.A00(r1, r12)     // Catch:{ all -> 0x04d5 }
        L_0x0358:
            if (r8 != 0) goto L_0x035e
            r0 = 3
            r13.A00(r0, r12)     // Catch:{ all -> 0x04d5 }
        L_0x035e:
            int r0 = r11.ordinal()     // Catch:{ all -> 0x04d5 }
            if (r0 == r1) goto L_0x036d
            if (r0 != r12) goto L_0x0370
            r13.A00(r9, r12)     // Catch:{ all -> 0x04d5 }
            r13.A00(r1, r12)     // Catch:{ all -> 0x04d5 }
            goto L_0x0370
        L_0x036d:
            r13.A00(r12, r12)     // Catch:{ all -> 0x04d5 }
        L_0x0370:
            r10.A03(r13)     // Catch:{ all -> 0x04d5 }
            goto L_0x0030
        L_0x0375:
            r24 = 1
        L_0x0377:
            boolean r0 = r6.enableCancelOngoingRequestPause     // Catch:{ all -> 0x04d5 }
            r18 = r0
            boolean r0 = r6.reportUnexpectedStopLoading     // Catch:{ all -> 0x04d5 }
            r17 = r0
            boolean r0 = r15.A00()     // Catch:{ all -> 0x04d5 }
            if (r0 == 0) goto L_0x043d
            long r1 = r6.ignoreLiveStreamErrorsTimeoutMs     // Catch:{ all -> 0x04d5 }
        L_0x0387:
            boolean r15 = r6.callbackFirstCaughtStreamError     // Catch:{ all -> 0x04d5 }
            int r14 = r6.microStallThresholdMsToUseMinBuffer     // Catch:{ all -> 0x04d5 }
            boolean r13 = r6.useMultiPeriodBufferCalculation     // Catch:{ all -> 0x04d5 }
            boolean r11 = r6.useThreadSafeStandaloneClock     // Catch:{ all -> 0x04d5 }
            boolean r9 = r6.useHttpPriorityIncrementalForStreaming     // Catch:{ all -> 0x04d5 }
            boolean r8 = r6.improveLooping     // Catch:{ all -> 0x04d5 }
            boolean r7 = r6.preventTextRendererDelay     // Catch:{ all -> 0x04d5 }
            boolean r5 = r6.fixPeriodTransitionWithNonZeroStartPosition     // Catch:{ all -> 0x04d5 }
            boolean r6 = r6.exoPlayerUpgrade218verifyApplicationThread     // Catch:{ all -> 0x04d5 }
            X.7hb r0 = new X.7hb     // Catch:{ all -> 0x04d5 }
            r25 = r18
            r26 = r17
            r27 = r15
            r28 = r13
            r29 = r11
            r30 = r9
            r31 = r8
            r32 = r7
            r33 = r5
            r34 = r6
            r17 = r0
            r18 = r14
            r19 = r1
            r17.<init>(r18, r19, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)     // Catch:{ all -> 0x04d5 }
            r4.A04 = r0     // Catch:{ all -> 0x04d5 }
            X.C159197lM.A02(r16)     // Catch:{ all -> 0x04d5 }
            r4.A09 = r12     // Catch:{ all -> 0x04d5 }
            r6 = 0
            java.lang.Object r5 = r10.get()     // Catch:{ all -> 0x04d5 }
            X.8wC r5 = (X.C186948wC) r5     // Catch:{ all -> 0x04d5 }
            r8 = r6
            r9 = r6
            r10 = r6
            r11 = r6
            r7 = r6
            X.8x9[] r19 = r5.B0x(r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x04d5 }
            X.8mZ r0 = r4.A08     // Catch:{ all -> 0x04d5 }
            java.lang.Object r13 = r0.get()     // Catch:{ all -> 0x04d5 }
            X.7FC r13 = (X.AnonymousClass7FC) r13     // Catch:{ all -> 0x04d5 }
            X.8mZ r0 = r4.A06     // Catch:{ all -> 0x04d5 }
            java.lang.Object r12 = r0.get()     // Catch:{ all -> 0x04d5 }
            X.8v7 r12 = (X.C186328v7) r12     // Catch:{ all -> 0x04d5 }
            X.8mZ r0 = r4.A05     // Catch:{ all -> 0x04d5 }
            java.lang.Object r11 = r0.get()     // Catch:{ all -> 0x04d5 }
            X.8gE r11 = (X.C177658gE) r11     // Catch:{ all -> 0x04d5 }
            X.8vc r0 = r4.A03     // Catch:{ all -> 0x04d5 }
            r18 = r0
            X.7hb r0 = r4.A04     // Catch:{ all -> 0x04d5 }
            boolean r1 = r0.A0C     // Catch:{ all -> 0x04d5 }
            r23 = r1
            boolean r1 = r0.A04     // Catch:{ all -> 0x04d5 }
            r24 = r1
            boolean r1 = r0.A02     // Catch:{ all -> 0x04d5 }
            r25 = r1
            boolean r1 = r0.A08     // Catch:{ all -> 0x04d5 }
            r26 = r1
            boolean r1 = r0.A05     // Catch:{ all -> 0x04d5 }
            r17 = r1
            boolean r1 = r0.A0B     // Catch:{ all -> 0x04d5 }
            r16 = r1
            long r4 = r0.A01     // Catch:{ all -> 0x04d5 }
            boolean r15 = r0.A03     // Catch:{ all -> 0x04d5 }
            int r14 = r0.A00     // Catch:{ all -> 0x04d5 }
            boolean r10 = r0.A0E     // Catch:{ all -> 0x04d5 }
            boolean r8 = r0.A0F     // Catch:{ all -> 0x04d5 }
            boolean r7 = r0.A0D     // Catch:{ all -> 0x04d5 }
            boolean r6 = r0.A09     // Catch:{ all -> 0x04d5 }
            boolean r2 = r0.A0A     // Catch:{ all -> 0x04d5 }
            boolean r1 = r0.A07     // Catch:{ all -> 0x04d5 }
            boolean r0 = r0.A06     // Catch:{ all -> 0x04d5 }
            X.7br r9 = new X.7br     // Catch:{ all -> 0x04d5 }
            r20 = r14
            r21 = r4
            r27 = r17
            r28 = r16
            r29 = r15
            r30 = r10
            r31 = r8
            r32 = r7
            r33 = r6
            r34 = r2
            r35 = r1
            r36 = r0
            r14 = r9
            r15 = r12
            r16 = r13
            r17 = r11
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)     // Catch:{ all -> 0x04d5 }
            goto L_0x04aa
        L_0x043d:
            long r1 = r6.ignoreStreamErrorsTimeoutMs     // Catch:{ all -> 0x04d5 }
            goto L_0x0387
        L_0x0441:
            X.8x9[] r0 = r3.A0I     // Catch:{ all -> 0x04d5 }
            r17 = r0
            X.8v7 r0 = r3.A02     // Catch:{ all -> 0x04d5 }
            r36 = r0
            X.7iq r0 = r3.A0F     // Catch:{ all -> 0x04d5 }
            X.8gE r0 = r0.A00     // Catch:{ all -> 0x04d5 }
            r35 = r0
            X.8vc r16 = X.C186588vc.A00     // Catch:{ all -> 0x04d5 }
            boolean r0 = r6.updateLoadingPriorityExo2     // Catch:{ all -> 0x04d5 }
            r21 = r0
            boolean r0 = r6.checkReadToEndBeforeUpdatingFinalState     // Catch:{ all -> 0x04d5 }
            r22 = r0
            boolean r0 = r6.continueLoadingOnSeekbarExo2     // Catch:{ all -> 0x04d5 }
            r23 = r0
            X.7a5 r0 = r3.A05     // Catch:{ all -> 0x04d5 }
            if (r0 == 0) goto L_0x0467
            boolean r0 = r0.A0B     // Catch:{ all -> 0x04d5 }
            r24 = 0
            if (r0 == 0) goto L_0x0469
        L_0x0467:
            r24 = 1
        L_0x0469:
            boolean r0 = r6.enableCancelOngoingRequestPause     // Catch:{ all -> 0x04d5 }
            r25 = r0
            boolean r14 = r6.reportUnexpectedStopLoading     // Catch:{ all -> 0x04d5 }
            boolean r0 = r15.A00()     // Catch:{ all -> 0x04d5 }
            if (r0 == 0) goto L_0x04ad
            long r0 = r6.ignoreLiveStreamErrorsTimeoutMs     // Catch:{ all -> 0x04d5 }
        L_0x0477:
            boolean r13 = r6.callbackFirstCaughtStreamError     // Catch:{ all -> 0x04d5 }
            int r12 = r6.microStallThresholdMsToUseMinBuffer     // Catch:{ all -> 0x04d5 }
            boolean r11 = r6.useMultiPeriodBufferCalculation     // Catch:{ all -> 0x04d5 }
            boolean r8 = r6.useThreadSafeStandaloneClock     // Catch:{ all -> 0x04d5 }
            boolean r7 = r6.useHttpPriorityIncrementalForStreaming     // Catch:{ all -> 0x04d5 }
            boolean r5 = r6.improveLooping     // Catch:{ all -> 0x04d5 }
            boolean r4 = r6.preventTextRendererDelay     // Catch:{ all -> 0x04d5 }
            boolean r2 = r6.fixPeriodTransitionWithNonZeroStartPosition     // Catch:{ all -> 0x04d5 }
            boolean r6 = r6.exoPlayerUpgrade218verifyApplicationThread     // Catch:{ all -> 0x04d5 }
            X.7br r9 = new X.7br     // Catch:{ all -> 0x04d5 }
            r18 = r12
            r19 = r0
            r26 = r14
            r27 = r13
            r28 = r11
            r29 = r8
            r30 = r7
            r31 = r5
            r32 = r4
            r33 = r2
            r34 = r6
            r12 = r9
            r13 = r36
            r14 = r10
            r15 = r35
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)     // Catch:{ all -> 0x04d5 }
        L_0x04aa:
            r3.A01 = r9     // Catch:{ all -> 0x04d5 }
            goto L_0x04b0
        L_0x04ad:
            long r0 = r6.ignoreStreamErrorsTimeoutMs     // Catch:{ all -> 0x04d5 }
            goto L_0x0477
        L_0x04b0:
            if (r39 == 0) goto L_0x04b9
            X.7Ww r1 = r3.A0D     // Catch:{ all -> 0x04d5 }
            java.util.concurrent.CopyOnWriteArraySet r0 = r9.A0R     // Catch:{ all -> 0x04d5 }
            r0.add(r1)     // Catch:{ all -> 0x04d5 }
        L_0x04b9:
            X.7br r2 = r3.A01     // Catch:{ all -> 0x04d5 }
            X.8x9[] r1 = r3.A0I     // Catch:{ all -> 0x04d5 }
            r0 = 0
            r0 = r1[r0]     // Catch:{ all -> 0x04d5 }
            X.7af r1 = r2.A04(r0)     // Catch:{ all -> 0x04d5 }
            r0 = 7
            r1.A01(r0)     // Catch:{ all -> 0x04d5 }
            X.7Ax r0 = new X.7Ax     // Catch:{ all -> 0x04d5 }
            r0.<init>(r3)     // Catch:{ all -> 0x04d5 }
            r1.A02(r0)     // Catch:{ all -> 0x04d5 }
            r1.A00()     // Catch:{ all -> 0x04d5 }
            monitor-exit(r3)
            return
        L_0x04d5:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C161787qS.A09(X.7a6, boolean):void");
    }

    public void A0A(boolean z) {
        List list;
        int size;
        C161787qS r1;
        C152777a6 r0;
        C153737br r6 = this.A01;
        if (r6.A0F != z) {
            r6.A0F = z;
            r6.A03++;
            C160207nD r3 = r6.A0K.A0j;
            C150717Rx A002 = C160207nD.A00();
            A002.A00 = r3.A00.obtainMessage(1, z ? 1 : 0, 0);
            A002.A01 = r3;
            A002.A01();
            C160477nh r4 = r6.A08;
            if (!z) {
                r6.A0G = z;
                Iterator it = r6.A0R.iterator();
                while (it.hasNext()) {
                    C151937Ww r32 = (C151937Ww) it.next();
                    if (r32 != null) {
                        int i = r4.A00;
                        if (i == 3 && (r0 = r1.A0B) != null && r0.A0F.A0R) {
                            A01((r1 = r32.A05));
                        }
                        for (C186008ub BYN : r32.A05.A0U) {
                            BYN.BYN(i, false, false);
                        }
                    } else {
                        throw AnonymousClass001.A0g("onPlayerStateChanged");
                    }
                }
            }
        }
        C185778uE r42 = this.A04;
        if (r42 instanceof AnonymousClass6K3) {
            AnonymousClass6K3 r33 = (AnonymousClass6K3) r42;
            int i2 = 0;
            while (true) {
                synchronized (r42) {
                    list = r33.A08;
                    size = list.size();
                }
                if (i2 < size) {
                    synchronized (r42) {
                        list.get(i2);
                    }
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    public C161787qS(Context context, Handler handler, AnonymousClass0Xd r11, C177918gf r12, C1444171m r13, AnonymousClass7OP r14, C152777a6 r15, C150157Pl r16, C146597Aw r17, C162987t5 r18, ServiceEventCallbackImpl serviceEventCallbackImpl, AnonymousClass8L8 r20, C177928gg r21, Map map, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, AtomicBoolean atomicBoolean3, AtomicReference atomicReference) {
        C150157Pl r0 = r16;
        this.A0N = r0;
        C162987t5 r2 = r18;
        this.A0P = r2;
        AnonymousClass8LG r3 = r0.A05;
        this.A0R = r3;
        this.A0J = context;
        this.A0K = handler;
        this.A0H = atomicReference;
        this.A07 = r11;
        this.A0V = map;
        this.A0C = serviceEventCallbackImpl;
        this.A0A = r14;
        this.A0M = r13;
        this.A09 = r12;
        this.A0T = r21;
        this.A0Q = new AnonymousClass81X(r2, r3, r3.disableTextRendererOn404LoadError, r3.disableTextRendererOn404InitSegmentLoadError, r3.disableTextRendererOn500LoadError, r3.disableTextRendererOn500InitSegmentLoadError);
        this.A0Y = atomicBoolean;
        this.A0X = atomicBoolean3;
        A04();
        this.A05 = null;
        try {
            if (r15.A0F.A0A != null) {
                this.A05 = C161427pc.A00(r15, r3);
            }
        } catch (C143156yQ | IOException e) {
            this.A0C.AyO(new C126386Nr(r15.A0F.A0H, "MANIFEST", "MANIFEST_PARSE_ERROR", AnonymousClass000.A0X(e.getMessage(), C18330xA.A0A("Exception: "))));
        }
        if (this.A0R.exo2ReuseManifestAfterInitialParse) {
            this.A0B = r15;
        }
        this.A0I = this.A0E.A07(this.A05, r15);
        boolean z = false;
        this.A0S = r20;
        this.A0W = atomicBoolean2;
        this.A0O = r17;
        A09(r15, false);
        this.A0L = new C158037jK(2000000, 0);
        Random random = new Random();
        AnonymousClass8LG r1 = this.A0R;
        if (r1.enableSecondaryChannelLoggingForLite && (r1.secondaryChannelLoggingSamplingFactor <= 0 || Double.compare(random.nextDouble(), 1.0d / ((double) this.A0R.secondaryChannelLoggingSamplingFactor)) < 0)) {
            z = true;
        }
        this.A0Z = z;
        if (z) {
            this.A08 = new C05300Su();
        }
    }
}
