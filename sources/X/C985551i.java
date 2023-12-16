package X;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import com.whatsapp.InteractiveAnnotation;
import com.whatsapp.SerializableLocation;
import com.whatsapp.mediacomposer.doodle.DoodleView;
import com.whatsapp.mediaview.PhotoView;
import com.whatsapp.newsletter.NewsletterLinkLauncher;
import com.whatsapp.util.Log;
import com.whatsapp.videoplayback.ExoPlayerErrorFrame;
import java.util.List;

/* renamed from: X.51i  reason: invalid class name and case insensitive filesystem */
public class C985551i extends C105395Ut {
    public float A00;
    public AnonymousClass5NW A01;
    public AnonymousClass5YG A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07 = true;
    public final View A08;
    public final FrameLayout A09;
    public final FrameLayout A0A;
    public final C56612sH A0B;
    public final C54292oU A0C;
    public final AnonymousClass1VX A0D;
    public final C28071fd A0E;
    public final DoodleView A0F;
    public final PhotoView A0G;
    public final NewsletterLinkLauncher A0H;
    public final C31981pC A0I;
    public final AnonymousClass66H A0J;
    public final AnonymousClass5U7 A0K;
    public final C33141sV A0L;
    public final ExoPlayerErrorFrame A0M;
    public final C105855Wr A0N;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C985551i(X.C111095hX r18, X.C64393Dh r19, X.C69263Wi r20, X.C620633i r21, X.C56612sH r22, X.C54292oU r23, X.C620733j r24, X.AnonymousClass5Y0 r25, X.AnonymousClass1VX r26, X.C28071fd r27, X.C48132eP r28, com.whatsapp.newsletter.NewsletterLinkLauncher r29, X.C624134x r30, X.C104035Pj r31, X.AnonymousClass5U7 r32, X.AnonymousClass33O r33, X.C33141sV r34, X.C105855Wr r35) {
        /*
            r17 = this;
            r2 = r30
            r7 = 1
            r6 = 17
            r10 = r17
            r15 = r28
            r13 = r21
            r12 = r20
            r16 = r31
            r11 = r18
            r14 = r24
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r0 = r22
            r10.A0B = r0
            r0 = r26
            r10.A0D = r0
            r0 = r23
            r10.A0C = r0
            r0 = r27
            r10.A0E = r0
            r0 = r34
            r10.A0L = r0
            r0 = r35
            r10.A0N = r0
            r0 = r29
            r10.A0H = r0
            r0 = r32
            r10.A0K = r0
            r10.A07 = r7
            X.C626936e.A06(r2)
            X.1pC r2 = (X.C31981pC) r2
            r10.A0I = r2
            android.content.Context r0 = r10.A03()
            android.app.Activity r1 = X.C111095hX.A02(r0)
            r0 = 2131434672(0x7f0b1cb0, float:1.8491165E38)
            android.view.View r0 = r1.findViewById(r0)
            X.C162457s7.A0D(r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r10.A0A = r0
            android.content.Context r0 = r10.A03()
            android.app.Activity r1 = X.C111095hX.A02(r0)
            r0 = 2131434673(0x7f0b1cb1, float:1.8491167E38)
            android.view.View r0 = r1.findViewById(r0)
            X.C162457s7.A0D(r0)
            r10.A08 = r0
            android.content.Context r0 = r10.A03()
            android.widget.FrameLayout r5 = new android.widget.FrameLayout
            r5.<init>(r0)
            r10.A09 = r5
            android.content.Context r0 = r10.A03()
            com.whatsapp.mediaview.PhotoView r8 = new com.whatsapp.mediaview.PhotoView
            r8.<init>(r0)
            r10.A0G = r8
            r0 = 0
            r8.A01 = r0
            r4 = 0
            r8.A08(r4)
            r8.A0V = r4
            r8.setEnabled(r4)
            android.content.Context r0 = r10.A03()
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131099845(0x7f0600c5, float:1.7812055E38)
            X.C86624Kv.A0l(r1, r8, r0)
            android.content.Context r1 = r10.A03()
            r3 = 0
            com.whatsapp.videoplayback.ExoPlayerErrorFrame r0 = new com.whatsapp.videoplayback.ExoPlayerErrorFrame
            r0.<init>(r1, r3, r4)
            r10.A0M = r0
            r5.addView(r8)
            r5.addView(r0)
            r0 = 2131433916(0x7f0b19bc, float:1.8489631E38)
            r5.setId(r0)
            r0 = 2
            X.AnonymousClass0YY.A06(r5, r0)
            r10.A0H()
            X.33C r1 = r2.A01
            if (r1 == 0) goto L_0x0109
            X.2z0 r0 = r2.A1J
            boolean r0 = r0.A02
            r2 = 0
            if (r0 == 0) goto L_0x00ff
            boolean r0 = r1.A0R
            if (r0 != 0) goto L_0x00ff
            boolean r0 = r1.A0Q
            if (r0 != 0) goto L_0x00ff
            java.lang.String r0 = r1.A0H
            if (r0 == 0) goto L_0x00ff
            r1 = r19
            java.io.File r1 = X.C107655bf.A0R(r1, r0)
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x00ff
            android.content.Context r0 = r10.A03()
            com.whatsapp.mediacomposer.doodle.DoodleView r2 = new com.whatsapp.mediacomposer.doodle.DoodleView
            r2.<init>(r0)
            android.content.Context r0 = r10.A03()
            r9 = r25
            r8 = r33
            X.5aV r0 = X.C106985aV.A02(r0, r14, r9, r8, r1)
            if (r0 == 0) goto L_0x00ff
            r2.setLayerType(r7, r3)
            r2.setEnabled(r4)
            r2.setDoodle(r0)
            r0 = -1
            X.C86654Ky.A17(r2, r5, r0, r6)
        L_0x00ff:
            r10.A0F = r2
            X.8Jb r0 = new X.8Jb
            r0.<init>(r10)
            r10.A0J = r0
            return
        L_0x0109:
            java.lang.IllegalArgumentException r0 = X.C18300x5.A0X()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C985551i.<init>(X.5hX, X.3Dh, X.3Wi, X.33i, X.2sH, X.2oU, X.33j, X.5Y0, X.1VX, X.1fd, X.2eP, com.whatsapp.newsletter.NewsletterLinkLauncher, X.34x, X.5Pj, X.5U7, X.33O, X.1sV, X.5Wr):void");
    }

    public long A02() {
        int i;
        long j;
        C31981pC r0 = this.A0I;
        AnonymousClass33C A002 = C30471mV.A00(r0);
        if (r0.A1J.A02 && !A002.A0R && !A002.A0Q) {
            long j2 = A002.A0D;
            if (j2 >= 0) {
                long j3 = A002.A0E;
                if (j3 > 0) {
                    j = j3 - j2;
                    return Math.min(C56952sp.A04(this.A0D, 6728), j);
                }
            }
        }
        AnonymousClass5YG r02 = this.A02;
        if (r02 != null) {
            i = r02.A06();
        } else {
            i = 0;
        }
        j = (long) i;
        return Math.min(C56952sp.A04(this.A0D, 6728), j);
    }

    public void A07() {
        AnonymousClass66H r2 = this.A0J;
        if (r2 != null) {
            AnonymousClass5U7 r1 = this.A0K;
            List list = r1.A04;
            if (list == null) {
                list = AnonymousClass001.A0s();
                r1.A04 = list;
            }
            list.add(r2);
        }
        A0K(this.A0K.A05);
        int i = 0;
        if (this.A06) {
            this.A06 = false;
            A0D();
        }
        if (!this.A04) {
            A0E();
            AnonymousClass5YG r11 = this.A02;
            if (r11 != null) {
                C31981pC r0 = this.A0I;
                AnonymousClass33C r10 = r0.A01;
                if (r10 != null) {
                    boolean z = r10.A0R;
                    boolean z2 = r10.A0Q;
                    boolean z3 = r0.A1J.A02;
                    if (z3 && !z2) {
                        long j = r10.A0D;
                        if (j >= 0 && r10.A0E > 0) {
                            i = (int) j;
                        }
                    }
                    r11.A0P(i);
                    if (z3 && !z && !z2 && r10.A0P) {
                        A0K(true);
                    }
                    AnonymousClass5YG r02 = this.A02;
                    if (r02 != null) {
                        r02.A0F();
                    }
                    DoodleView doodleView = this.A0F;
                    if (doodleView != null) {
                        doodleView.A0F.A0A = true;
                        SystemClock.elapsedRealtime();
                        doodleView.invalidate();
                    }
                    A0G();
                    return;
                }
                throw C18300x5.A0X();
            }
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("video player is null for ");
            throw AnonymousClass001.A0e(AnonymousClass000.A0R(this.A0I.A1J, A0o));
        }
    }

    public void A08() {
        List list;
        A0J("stopPlayback");
        AnonymousClass5YG r1 = this.A02;
        if (r1 != null && !r1.A0c()) {
            r1.A0G();
        }
        DoodleView doodleView = this.A0F;
        if (doodleView != null) {
            doodleView.A0F.A0A = false;
            doodleView.invalidate();
        }
        AnonymousClass5U7 r2 = this.A0K;
        r2.A02(this);
        this.A03 = false;
        A0F();
        this.A08.setVisibility(0);
        A0H();
        this.A00 = 0.0f;
        this.A07 = true;
        AnonymousClass66H r12 = this.A0J;
        if (r12 != null && (list = r2.A04) != null) {
            list.remove(r12);
        }
    }

    public final int A0B() {
        int i = 0;
        if (this.A02 == null) {
            return 0;
        }
        C31981pC r0 = this.A0I;
        AnonymousClass33C A002 = C30471mV.A00(r0);
        boolean z = r0.A1J.A02;
        boolean z2 = A002.A0R;
        boolean z3 = A002.A0Q;
        AnonymousClass5YG r02 = this.A02;
        if (r02 != null) {
            i = r02.A05();
        }
        if (!z || z2 || z3) {
            return i;
        }
        long j = A002.A0D;
        if (j < 0 || A002.A0E <= 0) {
            return i;
        }
        return i - ((int) j);
    }

    public final void A0D() {
        PhotoView photoView = this.A0G;
        if (photoView.getVisibility() == 0) {
            View A0Q = AnonymousClass001.A0Q(C111095hX.A02(A03()));
            C162457s7.A0D(A0Q);
            this.A0L.A09(photoView, this.A0I, new C100625Bq(this, Math.max(A0Q.getWidth(), A0Q.getHeight()), 2));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x012b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0E() {
        /*
            r44 = this;
            r4 = r44
            X.5YG r0 = r4.A02
            if (r0 != 0) goto L_0x0028
            java.lang.String r0 = "initViewPlayer/player null"
            r4.A0J(r0)
            X.1pC r3 = r4.A0I
            X.33C r0 = r3.A01
            r16 = r0
            if (r0 == 0) goto L_0x059e
            java.io.File r0 = r0.A0F
            if (r0 == 0) goto L_0x002f
            boolean r0 = r0.exists()
            if (r0 != 0) goto L_0x002f
        L_0x001d:
            com.whatsapp.mediaview.PhotoView r2 = r4.A0G
            X.2sH r1 = r4.A0B
            X.564 r0 = new X.564
            r0.<init>(r2, r1)
            r4.A02 = r0
        L_0x0028:
            android.widget.FrameLayout r1 = r4.A0A
            r0 = 0
            r1.setVisibility(r0)
            return
        L_0x002f:
            X.1VX r6 = r4.A0D
            r0 = 5913(0x1719, float:8.286E-42)
            java.lang.String r0 = r6.A0Q(r0)
            boolean r0 = X.C107535bT.A0D(r0)
            if (r0 != 0) goto L_0x056e
            r0 = 2917(0xb65, float:4.088E-42)
            java.lang.String r0 = r6.A0Q(r0)
            boolean r0 = X.C107535bT.A0C(r0)
            if (r0 != 0) goto L_0x056e
            com.whatsapp.videoplayback.ExoPlayerErrorFrame r0 = r4.A0M
            r1 = 0
            r0.setVisibility(r1)
            X.5Wr r2 = r4.A0N
            android.widget.FrameLayout r1 = r4.A09
            android.content.Context r18 = X.C18290x4.A0F(r1)
            X.1VX r11 = r2.A0C
            r1 = 5175(0x1437, float:7.252E-42)
            boolean r1 = r11.A0X(r1)
            if (r1 == 0) goto L_0x032b
            X.567 r1 = r2.A01
            r10 = 0
            if (r1 != 0) goto L_0x0223
            r1 = 6394(0x18fa, float:8.96E-42)
            boolean r17 = r11.A0X(r1)
            X.2sH r1 = r2.A07
            r19 = r1
            X.3Wi r1 = r2.A02
            r36 = r1
            X.4FV r1 = r2.A0D
            r21 = r1
            X.2eP r6 = r2.A0F
            X.33i r1 = r2.A06
            r37 = r1
            X.4FS r1 = r2.A0K
            r41 = r1
            X.8qC r1 = r2.A0L
            java.lang.Object r9 = X.C18300x5.A0b(r1)
            X.5NV r9 = (X.AnonymousClass5NV) r9
            X.33C r5 = X.C30471mV.A00(r3)
            X.1I7 r12 = r6.A00(r5)
            java.io.File r8 = r5.A0F
            boolean r7 = X.C105855Wr.A00(r5, r12)
            r1 = 0
            if (r7 != 0) goto L_0x01a1
            boolean r7 = X.AnonymousClass35Z.A02(r11, r3)
            if (r7 != 0) goto L_0x01a1
            if (r8 == 0) goto L_0x0118
            android.net.Uri r13 = android.net.Uri.fromFile(r8)
            X.2re r1 = r2.A0E
            X.5Ne r6 = new X.5Ne
            r0 = r36
            r6.<init>(r0, r1, r3)
            android.app.Activity r35 = X.C111095hX.A02(r18)
            X.2oU r12 = r2.A08
            X.569 r7 = new X.569
            r7.<init>(r12, r1, r3, r6)
            int r0 = r3.A0B
            long r0 = (long) r0
            r29 = r0
            X.2z0 r0 = r3.A1J
            boolean r0 = r0.A02
            int r23 = X.C86654Ky.A01(r0)
            java.io.File r0 = r5.A0F
            if (r0 == 0) goto L_0x019d
            long r27 = r0.lastModified()
        L_0x00d0:
            java.lang.Integer r22 = X.C18290x4.A0c()
            r24 = 3
            long r0 = r3.A00
            r31 = r0
            int r0 = r5.A08
            long r14 = (long) r0
            int r0 = r5.A06
            long r0 = (long) r0
            X.1uQ r18 = new X.1uQ
            r20 = r11
            r25 = r29
            r29 = r31
            r31 = r14
            r33 = r0
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r27, r29, r31, r33)
            r42 = 0
            X.567 r1 = new X.567
            r34 = r1
            r38 = r12
            r39 = r9
            r40 = r41
            r41 = r18
            r43 = r42
            r34.<init>(r35, r36, r37, r38, r39, r40, r41, r42, r43)
            r1.A03 = r13
            r9 = 1
            X.AnonymousClass567.A01(r1, r7)
            X.7bE r5 = r1.A0B
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.videoplayback.VideoLocalStat"
            X.C162457s7.A0K(r5, r0)
            X.1uQ r5 = (X.C34221uQ) r5
            r2.A01(r5, r8)
            r6.A01 = r1
            r1.A0B = r9
        L_0x0118:
            r2.A01 = r1
            if (r1 == 0) goto L_0x0125
            r0 = 1
            r1.A0K = r0
            if (r17 == 0) goto L_0x0124
            r1.A0I()
        L_0x0124:
            r10 = r1
        L_0x0125:
            r4.A02 = r10
        L_0x0127:
            X.5YG r9 = r4.A02
            if (r9 == 0) goto L_0x001d
            X.5qQ r0 = new X.5qQ
            r0.<init>(r4)
            r9.A08 = r0
            X.8K2 r0 = new X.8K2
            r0.<init>(r4)
            r9.A09 = r0
            X.5qP r0 = new X.5qP
            r0.<init>(r4)
            r9.A06 = r0
            boolean r0 = r4.A05
            r9.A0Z(r0)
            X.2z0 r0 = r3.A1J
            boolean r2 = r0.A02
            r0 = r16
            boolean r1 = r0.A0R
            boolean r0 = r0.A0Q
            if (r2 == 0) goto L_0x019b
            if (r1 != 0) goto L_0x019b
            if (r0 != 0) goto L_0x019b
            r0 = r16
            long r5 = r0.A0D
            r7 = 0
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x019b
            r0 = r16
            long r1 = r0.A0E
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x019b
            int r0 = (int) r5
        L_0x0168:
            r9.A0P(r0)
            boolean r0 = r4 instanceof X.C985451h
            if (r0 == 0) goto L_0x0177
            X.5YG r1 = r4.A02
            if (r1 == 0) goto L_0x0177
            r0 = 1
            r1.A0Z(r0)
        L_0x0177:
            X.5YG r0 = r4.A02
            r5 = 0
            if (r0 == 0) goto L_0x0188
            android.view.View r5 = r0.A09()
            if (r5 == 0) goto L_0x0188
            android.view.ViewParent r0 = r5.getParent()
            if (r0 != 0) goto L_0x0028
        L_0x0188:
            android.widget.FrameLayout r3 = r4.A0A
            r3.removeAllViews()
            r2 = 17
            r0 = -1
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r1.<init>(r0, r0, r2)
            r0 = 0
            r3.addView(r5, r0, r1)
            goto L_0x0028
        L_0x019b:
            r0 = 0
            goto L_0x0168
        L_0x019d:
            r27 = 0
            goto L_0x00d0
        L_0x01a1:
            X.36Y r8 = r2.A0B
            if (r12 == 0) goto L_0x0221
            X.2sf r7 = r12.A0h
        L_0x01a7:
            r26 = 2
            r27 = 3
            r28 = 5
            X.2hp r5 = r2.A0H
            X.2Yl r1 = r2.A0I
            X.6qD r30 = new X.6qD
            r19 = r30
            r20 = r8
            r22 = r7
            r23 = r3
            r24 = r5
            r25 = r1
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28)
            android.app.Activity r32 = X.C111095hX.A02(r18)
            X.2oU r14 = r2.A08
            X.33m r13 = r2.A03
            X.2zf r12 = r2.A09
            X.5ZU r11 = r2.A05
            X.33d r8 = r2.A0G
            X.1ip r7 = r2.A04
            X.3Lo r1 = r2.A0A
            X.4ea r19 = X.C111095hX.A05(r18)
            X.568 r5 = new X.568
            r24 = r14
            r25 = r12
            r26 = r1
            r27 = r6
            r28 = r8
            r29 = r3
            r18 = r5
            r20 = r36
            r21 = r13
            r22 = r7
            r23 = r11
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r7 = 0
            X.567 r1 = new X.567
            r40 = r7
            r31 = r1
            r33 = r36
            r34 = r37
            r35 = r14
            r36 = r9
            r37 = r41
            r38 = r30
            r39 = r7
            r31.<init>(r32, r33, r34, r35, r36, r37, r38, r39, r40)
            r6 = 1
            X.AnonymousClass567.A01(r1, r5)
            X.2ms r5 = new X.2ms
            r5.<init>(r0, r10, r7)
            r5.A01()
            r1.A0U(r5)
            r1.A0J()
            r1.A0B = r6
            goto L_0x0118
        L_0x0221:
            r7 = r10
            goto L_0x01a7
        L_0x0223:
            X.33C r7 = X.C30471mV.A00(r3)
            X.2eP r8 = r2.A0F
            X.1I7 r5 = r8.A00(r7)
            X.C162457s7.A0H(r7)
            boolean r1 = X.C105855Wr.A00(r7, r5)
            if (r1 != 0) goto L_0x02b2
            boolean r1 = X.AnonymousClass35Z.A02(r11, r3)
            if (r1 != 0) goto L_0x02b2
            java.io.File r9 = r7.A0F
            if (r9 == 0) goto L_0x0125
            X.3Wi r0 = r2.A02
            X.2re r8 = r2.A0E
            X.5Ne r6 = new X.5Ne
            r6.<init>(r0, r8, r3)
            X.567 r5 = r2.A01
            if (r5 == 0) goto L_0x02ab
            X.2sH r0 = r2.A07
            r34 = r0
            X.4FV r0 = r2.A0D
            r20 = r0
            int r0 = r3.A0B
            long r0 = (long) r0
            r28 = r0
            X.2z0 r0 = r3.A1J
            boolean r0 = r0.A02
            int r22 = X.C86654Ky.A01(r0)
            java.io.File r0 = r7.A0F
            if (r0 == 0) goto L_0x02af
            long r26 = r0.lastModified()
        L_0x026a:
            java.lang.Integer r21 = X.C18290x4.A0c()
            r23 = 3
            long r0 = r3.A00
            r17 = r0
            int r0 = r7.A08
            long r14 = (long) r0
            int r0 = r7.A06
            long r12 = (long) r0
            X.1uQ r0 = new X.1uQ
            r19 = r11
            r24 = r28
            r28 = r17
            r30 = r14
            r32 = r12
            r17 = r0
            r18 = r34
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r26, r28, r30, r32)
            r5.A0B = r0
            r2.A01(r0, r9)
            java.io.File r0 = r7.A0F
            if (r0 == 0) goto L_0x0299
            r5.A0X(r0)
        L_0x0299:
            X.2oU r1 = r2.A08
            X.569 r0 = new X.569
            r0.<init>(r1, r8, r3, r6)
            X.AnonymousClass567.A01(r5, r0)
            r6.A01 = r5
            r5.A0U(r10)
            r5.A0M()
        L_0x02ab:
            X.567 r10 = r2.A01
            goto L_0x0125
        L_0x02af:
            r26 = 0
            goto L_0x026a
        L_0x02b2:
            X.4FV r9 = r2.A0D
            X.36Y r7 = r2.A0B
            if (r5 == 0) goto L_0x0329
            X.2sf r6 = r5.A0h
        L_0x02ba:
            r26 = 2
            r27 = 3
            r28 = 5
            X.2hp r5 = r2.A0H
            X.2Yl r1 = r2.A0I
            X.6qD r11 = new X.6qD
            r19 = r11
            r20 = r7
            r21 = r9
            r22 = r6
            r23 = r3
            r24 = r5
            r25 = r1
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r5 = 0
            X.2ms r1 = new X.2ms
            r1.<init>(r0, r10, r5)
            X.567 r0 = r2.A01
            if (r0 == 0) goto L_0x02e4
            r0.A0U(r1)
        L_0x02e4:
            r1.A01()
            X.567 r15 = r2.A01
            if (r15 == 0) goto L_0x02ab
            X.2oU r14 = r2.A08
            X.3Wi r13 = r2.A02
            X.33m r12 = r2.A03
            X.2zf r10 = r2.A09
            X.5ZU r9 = r2.A05
            X.33d r7 = r2.A0G
            X.1ip r6 = r2.A04
            X.3Lo r5 = r2.A0A
            android.app.Activity r1 = X.C111095hX.A01(r18)
            X.4ea r1 = (X.C89654ea) r1
            X.568 r0 = new X.568
            r23 = r14
            r24 = r10
            r25 = r5
            r26 = r8
            r27 = r7
            r28 = r3
            r29 = r11
            r21 = r6
            r22 = r9
            r17 = r0
            r18 = r1
            r19 = r13
            r20 = r12
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r15.A0B = r11
            X.AnonymousClass567.A01(r15, r0)
            r15.A0M()
            goto L_0x02ab
        L_0x0329:
            r6 = r10
            goto L_0x02ba
        L_0x032b:
            X.6qG r1 = r2.A00
            r10 = 0
            if (r1 != 0) goto L_0x0466
            X.2sH r14 = r2.A07
            X.3Wi r1 = r2.A02
            r35 = r1
            X.4FV r1 = r2.A0D
            r15 = r1
            X.2eP r6 = r2.A0F
            X.33i r1 = r2.A06
            r36 = r1
            X.33C r5 = X.C30471mV.A00(r3)
            X.1I7 r9 = r6.A00(r5)
            java.io.File r8 = r5.A0F
            boolean r7 = X.C105855Wr.A00(r5, r9)
            r1 = 0
            if (r7 != 0) goto L_0x03db
            boolean r7 = X.AnonymousClass35Z.A02(r11, r3)
            if (r7 != 0) goto L_0x03db
            if (r8 == 0) goto L_0x03cf
            android.net.Uri r9 = android.net.Uri.fromFile(r8)
            X.2re r1 = r2.A0E
            X.5Ne r6 = new X.5Ne
            r0 = r35
            r6.<init>(r0, r1, r3)
            android.app.Activity r34 = X.C111095hX.A02(r18)
            X.2oU r0 = r2.A08
            X.55y r7 = new X.55y
            r7.<init>(r0, r1, r3, r6)
            int r0 = r3.A0B
            long r0 = (long) r0
            r28 = r0
            X.2z0 r0 = r3.A1J
            boolean r0 = r0.A02
            int r22 = X.C86654Ky.A01(r0)
            java.io.File r0 = r5.A0F
            if (r0 == 0) goto L_0x03d8
            long r26 = r0.lastModified()
        L_0x0385:
            java.lang.Integer r21 = X.C18290x4.A0c()
            r23 = 3
            long r0 = r3.A00
            r30 = r0
            int r0 = r5.A08
            long r12 = (long) r0
            int r0 = r5.A06
            long r0 = (long) r0
            X.1uQ r17 = new X.1uQ
            r19 = r11
            r20 = r15
            r24 = r28
            r28 = r30
            r30 = r12
            r32 = r0
            r18 = r14
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r26, r28, r30, r32)
            r40 = 0
            X.6qG r1 = new X.6qG
            r33 = r1
            r37 = r11
            r38 = r10
            r39 = r17
            r41 = r40
            r33.<init>(r34, r35, r36, r37, r38, r39, r40, r41)
            r1.A04 = r9
            r1.A0i(r7)
            X.7bE r5 = r1.A08
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.videoplayback.VideoLocalStat"
            X.C162457s7.A0K(r5, r0)
            X.1uQ r5 = (X.C34221uQ) r5
            r2.A01(r5, r8)
            r6.A01 = r1
            r0 = 1
            r1.A0B = r0
        L_0x03cf:
            r2.A00 = r1
            if (r1 == 0) goto L_0x0125
            r0 = 1
            r1.A0C = r0
            goto L_0x0124
        L_0x03d8:
            r26 = 0
            goto L_0x0385
        L_0x03db:
            X.36Y r8 = r2.A0B
            if (r9 == 0) goto L_0x0463
            X.2sf r7 = r9.A0h
        L_0x03e1:
            r26 = 2
            r27 = 3
            r28 = 5
            X.2hp r5 = r2.A0H
            X.2Yl r1 = r2.A0I
            X.6qD r29 = new X.6qD
            r19 = r29
            r20 = r8
            r21 = r15
            r22 = r7
            r23 = r3
            r24 = r5
            r25 = r1
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28)
            java.lang.Class<X.4ea> r5 = X.C89654ea.class
            r1 = r18
            android.app.Activity r31 = X.C111095hX.A03(r1, r5)
            X.2oU r15 = r2.A08
            X.33m r14 = r2.A03
            X.2zf r13 = r2.A09
            X.5ZU r12 = r2.A05
            X.33d r9 = r2.A0G
            X.1ip r8 = r2.A04
            X.3Lo r7 = r2.A0A
            android.app.Activity r1 = X.C111095hX.A03(r1, r5)
            X.4ea r1 = (X.C89654ea) r1
            X.55x r5 = new X.55x
            r23 = r15
            r24 = r13
            r25 = r7
            r26 = r6
            r27 = r9
            r28 = r3
            r19 = r35
            r20 = r14
            r21 = r8
            r22 = r12
            r17 = r5
            r18 = r1
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r6 = 0
            X.6qG r1 = new X.6qG
            r38 = r6
            r30 = r1
            r32 = r35
            r33 = r36
            r34 = r11
            r35 = r10
            r36 = r29
            r37 = r6
            r30.<init>(r31, r32, r33, r34, r35, r36, r37, r38)
            r1.A0i(r5)
            X.2ms r5 = new X.2ms
            r5.<init>(r0, r10, r6)
            r5.A01()
            r1.A0U(r5)
            r1.A0J()
            r0 = 1
            r1.A0B = r0
            goto L_0x03cf
        L_0x0463:
            r7 = r10
            goto L_0x03e1
        L_0x0466:
            X.33C r7 = X.C30471mV.A00(r3)
            X.2eP r8 = r2.A0F
            X.1I7 r5 = r8.A00(r7)
            X.C162457s7.A0H(r7)
            boolean r1 = X.C105855Wr.A00(r7, r5)
            if (r1 != 0) goto L_0x04f5
            boolean r1 = X.AnonymousClass35Z.A02(r11, r3)
            if (r1 != 0) goto L_0x04f5
            java.io.File r9 = r7.A0F
            if (r9 == 0) goto L_0x0125
            X.3Wi r0 = r2.A02
            X.2re r8 = r2.A0E
            X.5Ne r6 = new X.5Ne
            r6.<init>(r0, r8, r3)
            X.6qG r5 = r2.A00
            if (r5 == 0) goto L_0x04ee
            X.2sH r0 = r2.A07
            r34 = r0
            X.4FV r0 = r2.A0D
            r20 = r0
            int r0 = r3.A0B
            long r0 = (long) r0
            r28 = r0
            X.2z0 r0 = r3.A1J
            boolean r0 = r0.A02
            int r22 = X.C86654Ky.A01(r0)
            java.io.File r0 = r7.A0F
            if (r0 == 0) goto L_0x04f2
            long r26 = r0.lastModified()
        L_0x04ad:
            java.lang.Integer r21 = X.C18290x4.A0c()
            r23 = 3
            long r0 = r3.A00
            r17 = r0
            int r0 = r7.A08
            long r14 = (long) r0
            int r0 = r7.A06
            long r12 = (long) r0
            X.1uQ r0 = new X.1uQ
            r19 = r11
            r24 = r28
            r28 = r17
            r30 = r14
            r32 = r12
            r17 = r0
            r18 = r34
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r26, r28, r30, r32)
            r5.A08 = r0
            r2.A01(r0, r9)
            java.io.File r0 = r7.A0F
            if (r0 == 0) goto L_0x04dc
            r5.A0X(r0)
        L_0x04dc:
            X.2oU r1 = r2.A08
            X.55y r0 = new X.55y
            r0.<init>(r1, r8, r3, r6)
            r5.A0i(r0)
            r6.A01 = r5
            r5.A0U(r10)
            r5.A0M()
        L_0x04ee:
            X.6qG r10 = r2.A00
            goto L_0x0125
        L_0x04f2:
            r26 = 0
            goto L_0x04ad
        L_0x04f5:
            X.4FV r9 = r2.A0D
            X.36Y r7 = r2.A0B
            if (r5 == 0) goto L_0x056c
            X.2sf r6 = r5.A0h
        L_0x04fd:
            r27 = 3
            r28 = 5
            X.2hp r5 = r2.A0H
            X.2Yl r1 = r2.A0I
            r26 = 2
            X.6qD r11 = new X.6qD
            r19 = r11
            r20 = r7
            r21 = r9
            r22 = r6
            r23 = r3
            r24 = r5
            r25 = r1
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r5 = 0
            X.2ms r1 = new X.2ms
            r1.<init>(r0, r10, r5)
            X.6qG r0 = r2.A00
            if (r0 == 0) goto L_0x0527
            r0.A0U(r1)
        L_0x0527:
            r1.A01()
            X.6qG r15 = r2.A00
            if (r15 == 0) goto L_0x04ee
            X.2oU r14 = r2.A08
            X.3Wi r13 = r2.A02
            X.33m r12 = r2.A03
            X.2zf r10 = r2.A09
            X.5ZU r9 = r2.A05
            X.33d r7 = r2.A0G
            X.1ip r6 = r2.A04
            X.3Lo r5 = r2.A0A
            android.app.Activity r1 = X.C111095hX.A01(r18)
            X.4ea r1 = (X.C89654ea) r1
            X.55x r0 = new X.55x
            r23 = r14
            r24 = r10
            r25 = r5
            r26 = r8
            r27 = r7
            r28 = r3
            r29 = r11
            r21 = r6
            r22 = r9
            r17 = r0
            r18 = r1
            r19 = r13
            r20 = r12
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r15.A08 = r11
            r15.A0i(r0)
            r15.A0M()
            goto L_0x04ee
        L_0x056c:
            r6 = r10
            goto L_0x04fd
        L_0x056e:
            r0 = r16
            java.io.File r5 = r0.A0F
            if (r5 == 0) goto L_0x0127
            X.3Wi r2 = r4.A01
            X.33i r1 = r4.A02
            android.widget.FrameLayout r0 = r4.A09
            android.content.Context r17 = r0.getContext()
            X.2oU r0 = r4.A0C
            r27 = 1
            r22 = 0
            r26 = 0
            r24 = r22
            r29 = r26
            r23 = r22
            r25 = r5
            r28 = r26
            r18 = r2
            r19 = r1
            r20 = r0
            r21 = r6
            X.5YG r10 = X.AnonymousClass5YG.A02(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            goto L_0x0125
        L_0x059e:
            java.lang.IllegalArgumentException r0 = X.C18300x5.A0X()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C985551i.A0E():void");
    }

    public final void A0F() {
        A0J("releaseVideoPlayer");
        this.A0M.setVisibility(8);
        AnonymousClass5YG r3 = this.A02;
        if (r3 != null) {
            r3.A07 = null;
            r3.A09 = null;
            r3.A08 = null;
            r3.A06 = null;
            if (r3.A0c()) {
                C105855Wr r1 = this.A0N;
                C138386qG r0 = r1.A00;
                if (r0 != null) {
                    r0.A0O();
                }
                AnonymousClass567 r02 = r1.A01;
                if (r02 != null) {
                    r02.A0O();
                }
            } else {
                r3.A0G();
            }
            try {
                r3.A0D();
            } catch (Exception unused) {
                Log.w("Failed to post field stats from status player release");
            }
        }
        this.A02 = null;
    }

    public final void A0G() {
        if (!this.A05 && !this.A03 && this.A05.A00.A06) {
            this.A03 = true;
            this.A0K.A03(this);
        }
    }

    public final void A0H() {
        PhotoView photoView = this.A0G;
        if (photoView.getVisibility() != 0) {
            A0J("showThumbnail");
            photoView.setVisibility(0);
        }
    }

    public final void A0I(Context context, InteractiveAnnotation interactiveAnnotation) {
        AnonymousClass59N r7;
        Object obj = interactiveAnnotation.data;
        C162457s7.A0C(obj);
        Context context2 = context;
        if (obj instanceof SerializableLocation) {
            SerializableLocation serializableLocation = (SerializableLocation) obj;
            this.A0E.A08(context2, serializableLocation.name, (String) null, serializableLocation.latitude, serializableLocation.longitude);
        } else if (obj instanceof C53042mS) {
            C53042mS r3 = (C53042mS) obj;
            C372721p r0 = r3.A02;
            boolean z = interactiveAnnotation.skipConfirmation;
            if (r0 != null) {
                int ordinal = r0.ordinal();
                if (ordinal == 0) {
                    r7 = AnonymousClass59N.FORWARDED_MESSAGE;
                } else if (ordinal == 1) {
                    r7 = AnonymousClass59N.STATUS_POST_TOOLTIP;
                } else if (ordinal != 2) {
                    return;
                } else {
                    if (z) {
                        r7 = AnonymousClass59N.STATUS_LINK_BUTTON;
                    } else {
                        r7 = AnonymousClass59N.STATUS_LINK_TOOLTIP;
                    }
                }
                this.A0H.A03(context2, r3.A01, r7, 3, (long) r3.A00);
            }
        }
    }

    public void A0K(boolean z) {
        if (!(this instanceof C985451h)) {
            this.A05 = z;
            AnonymousClass5YG r0 = this.A02;
            if (r0 != null) {
                r0.A0Z(z);
            }
            A0G();
        }
    }

    public final String A0C() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("videoContainer=");
        A0o.append(AnonymousClass000.A1T(this.A0A.getVisibility()));
        A0o.append("videoPlaybackContainerOverlay=");
        A0o.append(C86604Kt.A1Y(this.A08));
        A0o.append("photoView=");
        A0o.append(C86604Kt.A1Y(this.A0G));
        A0o.append("mainView=");
        A0o.append(C86654Ky.A1U(this.A09));
        A0o.append(" isPlaybackStarted=");
        return C18300x5.A0m(A0o, this.A05.A00.A06);
    }

    public final void A0J(String str) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("StatusPlaybackVideo/");
        A0o.append(str);
        A0o.append(' ');
        A0o.append(A0C());
        A0o.append(" id=");
        C18260x0.A1J(A0o, this.A0I.A1J.A01);
    }
}
