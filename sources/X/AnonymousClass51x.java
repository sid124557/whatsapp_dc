package X;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.CircularProgressBar;
import com.whatsapp.R;
import com.whatsapp.status.playback.StatusPlaybackActivity;
import com.whatsapp.status.playback.fragment.StatusPlaybackBaseFragment;
import com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment;
import com.whatsapp.status.playback.page.StatusPlaybackPageItem$2;
import com.whatsapp.status.playback.page.StatusPlaybackPageItem$4;
import com.whatsapp.status.playback.widget.StatusPlaybackProgressView;
import com.whatsapp.ui.media.MediaCaptionTextView;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.51x  reason: invalid class name */
public abstract class AnonymousClass51x extends C105285Uh implements AnonymousClass66G {
    public BottomSheetBehavior A00;
    public AnonymousClass5LV A01;
    public StatusPlaybackProgressView A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08 = true;
    public final Handler A09 = AnonymousClass000.A0A();
    public final C184988ss A0A;
    public final C111095hX A0B;
    public final AnonymousClass64E A0C = new C111275hp(this);
    public final C69263Wi A0D;
    public final AnonymousClass5Ul A0E;
    public final C621033m A0F;
    public final C620633i A0G;
    public final C56612sH A0H;
    public final C620733j A0I;
    public final C66543Lv A0J;
    public final C114635nM A0K;
    public final C54012o2 A0L;
    public final C620233e A0M;
    public final AnonymousClass36Y A0N;
    public final AnonymousClass1VX A0O;
    public final C28071fd A0P;
    public final C48132eP A0Q;
    public final AnonymousClass1R1 A0R;
    public final C113995mK A0S;
    public final AnonymousClass5SJ A0T;
    public final AnonymousClass647 A0U = new C115885pO(this);
    public final C55832qz A0V;
    public final C105025Tg A0W;
    public final AnonymousClass33M A0X = new AnonymousClass33M(true);
    public final AnonymousClass33M A0Y = new AnonymousClass33M(true);
    public final AnonymousClass33M A0Z = new AnonymousClass33M(true);
    public final AnonymousClass4FS A0a;
    public final C105215Ua A0b;
    public final Runnable A0c = new C117635sF(this, 13);

    public void A0A() {
        this.A04 = true;
        AnonymousClass5SJ r3 = this.A0T;
        StatusPlaybackContactFragment statusPlaybackContactFragment = r3.A02;
        statusPlaybackContactFragment.A0a.A01(r3.A00, statusPlaybackContactFragment.A0o);
    }

    public abstract void A0G();

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0035, code lost:
        if (X.AnonymousClass35Z.A04((X.AnonymousClass1nB) r8) == false) goto L_0x0037;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0O(boolean r12) {
        /*
            r11 = this;
            r0 = r11
            X.51w r0 = (X.AnonymousClass51w) r0
            X.5X9 r4 = r0.A0A
            X.34x r8 = r0.A06
            X.5Gp r1 = new X.5Gp
            r1.<init>(r0)
            r7 = 0
            X.C162457s7.A0J(r8, r7)
            boolean r0 = r8 instanceof X.C30471mV
            r2 = 0
            if (r0 == 0) goto L_0x0048
            java.util.concurrent.ConcurrentHashMap r5 = r4.A05
            r5.put(r8, r1)
            X.2z0 r6 = r8.A1J
            boolean r0 = r6.A02
            r9 = 1
            if (r0 == 0) goto L_0x004a
            r3 = r8
            X.1mV r3 = (X.C30471mV) r3
            boolean r0 = r3.A21()
            if (r0 == 0) goto L_0x004a
            boolean r0 = r8 instanceof X.C31971pB
            if (r0 == 0) goto L_0x0037
            r0 = r8
            X.1nB r0 = (X.AnonymousClass1nB) r0
            boolean r0 = X.AnonymousClass35Z.A04(r0)
            if (r0 != 0) goto L_0x004a
        L_0x0037:
            X.35m r1 = X.AnonymousClass5X9.A07
        L_0x0039:
            java.lang.Object r0 = r5.get(r3)
            X.5Gp r0 = (X.C101875Gp) r0
            if (r0 == 0) goto L_0x0048
            X.51w r0 = r0.A00
            r0.A00 = r1
            r5.remove(r3)
        L_0x0048:
            r0 = 0
            return r0
        L_0x004a:
            r3 = r8
            X.1mV r3 = (X.C30471mV) r3
            X.33C r1 = X.C30471mV.A00(r3)
            boolean r0 = r1.A0R
            if (r0 == 0) goto L_0x0062
            int r0 = r1.A07
            if (r0 == r9) goto L_0x005f
            boolean r0 = r3.A22()
            if (r0 != 0) goto L_0x0037
        L_0x005f:
            X.35m r1 = X.AnonymousClass5X9.A08
            goto L_0x0039
        L_0x0062:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "statusdownload/downloadifneeded "
            r1.append(r0)
            r1.append(r12)
            r5 = 32
            r1.append(r5)
            X.AnonymousClass2z0.A0A(r6, r1)
            r1.append(r5)
            X.4uZ r0 = r3.A0n()
            X.C18260x0.A0o(r0, r1)
            if (r12 == 0) goto L_0x00d0
            X.33d r8 = r4.A03
            java.util.Collection r0 = r8.A04()
            java.util.Iterator r10 = r0.iterator()
        L_0x008c:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x00e7
            X.1mV r9 = X.C18320x8.A0S(r10)
            X.2z0 r2 = r9.A1J
            X.4uZ r0 = r2.A00
            boolean r0 = r0 instanceof X.C135166kE
            if (r0 == 0) goto L_0x00c3
            boolean r0 = r2.equals(r6)
            if (r0 != 0) goto L_0x00c3
            r8.A0B(r9)
            java.util.ArrayList r0 = r4.A04
            r0.add(r9)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "statusdownload/cancel "
        L_0x00b2:
            r1.append(r0)
            X.AnonymousClass2z0.A0A(r2, r1)
            r1.append(r5)
            X.4uZ r0 = r9.A0n()
            X.C18260x0.A0o(r0, r1)
            goto L_0x008c
        L_0x00c3:
            boolean r0 = r2.equals(r6)
            if (r0 == 0) goto L_0x008c
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "statusdownload/is-current "
            goto L_0x00b2
        L_0x00d0:
            X.1mV r0 = r4.A00
            if (r0 != 0) goto L_0x00e1
            X.1VX r0 = r4.A02
            boolean r0 = X.AnonymousClass35Z.A01(r0, r8)
            if (r0 == 0) goto L_0x00dd
            r2 = 3
        L_0x00dd:
            r4.A01(r3, r2)
            goto L_0x00ea
        L_0x00e1:
            java.util.ArrayList r0 = r4.A04
            r0.add(r8)
            goto L_0x00ea
        L_0x00e7:
            r4.A01(r3, r7)
        L_0x00ea:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass51x.A0O(boolean):boolean");
    }

    public View A07(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        String str;
        C113995mK r6 = this.A0S;
        C624134x r2 = ((AnonymousClass51w) this).A06;
        AnonymousClass2z0 r4 = r2.A1J;
        int hashCode = r4.A01.hashCode();
        byte b = r2.A1I;
        if (b == 0 || b == 27) {
            str = "TEXT";
        } else if (b == 1 || b == 25) {
            str = "IMAGE";
        } else if (b == 3 || b == 28) {
            str = "VIDEO";
        } else if (b == 13 || b == 29) {
            str = "GIF";
        } else if (b == 15) {
            str = "DELETING";
        } else if (b == 2) {
            str = "VOICE";
        } else {
            str = "UNKNOWN";
        }
        boolean z = r4.A02;
        AnonymousClass8JP r3 = r6.A0A;
        r3.markerStart(453119185, hashCode);
        r3.markerAnnotate(453119185, hashCode, "is_outgoing", z);
        r3.markerAnnotate(453119185, hashCode, "media_type", str);
        r3.markerPoint(453119185, hashCode, "PLAYBACK_PAGE_ITEM_ON_CREATE_VIEW_START");
        this.A02 = (StatusPlaybackProgressView) this.A0T.A01.A0J().findViewById(R.id.playback_progress);
        View A0F2 = C86604Kt.A0F(layoutInflater, R.layout.f8nameremoved);
        AnonymousClass5LV A092 = A09();
        A092.A03 = A0F2.findViewById(R.id.content_sheet);
        A092.A09 = C86644Kx.A0J(A0F2, R.id.content);
        A092.A07 = A0F2.findViewById(R.id.click_handler);
        A092.A0B = AnonymousClass002.A09(A0F2, R.id.control_btn);
        A092.A04 = A0F2.findViewById(R.id.control_frame);
        A092.A0F = (MediaCaptionTextView) A0F2.findViewById(R.id.caption);
        A092.A01 = A0F2.findViewById(R.id.caption_container);
        A092.A02 = A0F2.findViewById(R.id.caption_padding);
        A092.A08 = C86644Kx.A0J(A0F2, R.id.bottom_sheet);
        A092.A06 = A0F2.findViewById(R.id.status_details_background);
        A092.A00 = A0F2.findViewById(R.id.cancel_btn);
        A092.A0D = (CircularProgressBar) A0F2.findViewById(R.id.progress_bar);
        A092.A0C = AnonymousClass002.A09(A0F2, R.id.error);
        A092.A0A = C86644Kx.A0J(A0F2, R.id.info);
        A092.A0E = C86644Kx.A0O(A0F2, R.id.info_btn);
        A092.A0G = C18290x4.A0X(A0F2, R.id.reply_bar);
        A092.A05 = A0F2.findViewById(R.id.extra_padding);
        r3.markerPoint(453119185, hashCode, "PLAYBACK_PAGE_ITEM_ON_CREATE_VIEW_END");
        return A0F2;
    }

    /* JADX WARNING: type inference failed for: r13v3, types: [X.5Ut] */
    /* JADX WARNING: type inference failed for: r15v7, types: [X.51j] */
    /* JADX WARNING: type inference failed for: r15v8, types: [X.51f] */
    /* JADX WARNING: type inference failed for: r15v9, types: [X.51i] */
    /* JADX WARNING: type inference failed for: r15v10, types: [X.51h] */
    /* JADX WARNING: type inference failed for: r15v11, types: [X.51e] */
    /* JADX WARNING: type inference failed for: r17v9, types: [X.51g] */
    /* JADX WARNING: type inference failed for: r17v10, types: [X.51d] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C105395Ut A08() {
        /*
            r34 = this;
            r14 = r34
            X.51w r14 = (X.AnonymousClass51w) r14
            X.5Ut r13 = r14.A01
            if (r13 != 0) goto L_0x0074
            X.5Lc r0 = r14.A0B
            X.34x r12 = r14.A06
            X.5Pj r16 = new X.5Pj
            r1 = r16
            r1.<init>(r14)
            X.5Uq r8 = r14.A03
            X.5hX r11 = r14.A0B
            r1 = 0
            X.C162457s7.A0J(r12, r1)
            r5 = 1
            r4 = 2
            X.C162457s7.A0J(r8, r4)
            r3 = 3
            X.C162457s7.A0J(r11, r3)
            byte r2 = r12.A1I
            if (r2 == 0) goto L_0x01b2
            r1 = 27
            if (r2 == r1) goto L_0x01b2
            if (r2 == r5) goto L_0x017c
            r1 = 25
            if (r2 == r1) goto L_0x017c
            if (r2 == r3) goto L_0x0130
            r1 = 28
            if (r2 == r1) goto L_0x0130
            r1 = 13
            if (r2 == r1) goto L_0x00e4
            r1 = 29
            if (r2 == r1) goto L_0x00e4
            r1 = 15
            if (r2 != r1) goto L_0x0075
            X.3Wi r9 = r0.A03
            X.4Fm r8 = r0.A04
            X.33i r7 = r0.A08
            X.33j r6 = r0.A0B
            X.2eP r5 = r0.A0I
            X.2sH r4 = r0.A09
            r1 = 4500(0x1194, double:2.2233E-320)
            X.5Sn r3 = new X.5Sn
            r3.<init>(r4, r1)
            X.8qC r0 = r0.A0R
            X.51d r13 = new X.51d
            r17 = r13
            r18 = r9
            r19 = r8
            r20 = r7
            r21 = r6
            r22 = r5
            r23 = r12
            r24 = r3
            r25 = r16
            r26 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26)
        L_0x0072:
            r14.A01 = r13
        L_0x0074:
            return r13
        L_0x0075:
            if (r2 != r4) goto L_0x00b1
            X.1VX r3 = r0.A0F
            X.2vE r2 = X.C58422vE.A01
            r1 = 1875(0x753, float:2.627E-42)
            boolean r1 = r3.A0Y(r2, r1)
            if (r1 == 0) goto L_0x00b1
            X.3Wi r7 = r0.A03
            X.33i r6 = r0.A08
            X.33j r5 = r0.A0B
            X.2eP r4 = r0.A0I
            X.4Fm r3 = r0.A04
            X.5U7 r2 = r0.A0L
            X.5Fg r1 = r0.A00
            X.5Td r0 = r0.A0N
            X.51g r13 = new X.51g
            r17 = r13
            r18 = r3
            r19 = r1
            r20 = r7
            r21 = r8
            r22 = r6
            r23 = r5
            r24 = r4
            r25 = r12
            r26 = r16
            r27 = r2
            r28 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            goto L_0x0072
        L_0x00b1:
            X.2sH r9 = r0.A09
            X.1VX r8 = r0.A0F
            X.2i5 r7 = r0.A05
            X.3Wi r6 = r0.A03
            X.4Fm r5 = r0.A04
            X.33i r4 = r0.A08
            X.33j r3 = r0.A0B
            X.2eP r2 = r0.A0I
            X.5ST r1 = r0.A07
            X.2nM r0 = r0.A06
            X.51e r13 = new X.51e
            r25 = r2
            r26 = r12
            r27 = r16
            r18 = r7
            r19 = r0
            r20 = r1
            r21 = r4
            r22 = r9
            r23 = r3
            r24 = r8
            r15 = r13
            r16 = r6
            r17 = r5
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            goto L_0x0072
        L_0x00e4:
            X.2sH r1 = r0.A09
            r20 = r1
            X.1VX r1 = r0.A0F
            r24 = r1
            X.3Wi r1 = r0.A03
            r17 = r1
            X.2oU r15 = r0.A0A
            X.3Dh r10 = r0.A02
            X.5Y0 r9 = r0.A0E
            X.1fd r8 = r0.A0H
            X.33i r7 = r0.A08
            X.33j r6 = r0.A0B
            X.2eP r5 = r0.A0I
            X.1sV r4 = r0.A0P
            X.5Wr r3 = r0.A0Q
            com.whatsapp.newsletter.NewsletterLinkLauncher r2 = r0.A0K
            X.33O r1 = r0.A0M
            X.5U7 r0 = r0.A0L
            X.51h r13 = new X.51h
            r25 = r8
            r26 = r5
            r27 = r2
            r28 = r12
            r29 = r16
            r30 = r0
            r31 = r1
            r32 = r4
            r33 = r3
            r18 = r17
            r19 = r7
            r21 = r15
            r22 = r6
            r23 = r9
            r15 = r13
            r16 = r11
            r17 = r10
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            goto L_0x0072
        L_0x0130:
            X.2sH r1 = r0.A09
            r20 = r1
            X.1VX r1 = r0.A0F
            r24 = r1
            X.2oU r1 = r0.A0A
            r17 = r1
            X.3Wi r15 = r0.A03
            X.3Dh r10 = r0.A02
            X.5Y0 r9 = r0.A0E
            X.1fd r8 = r0.A0H
            X.33i r7 = r0.A08
            X.33j r6 = r0.A0B
            X.2eP r5 = r0.A0I
            X.1sV r4 = r0.A0P
            X.5Wr r3 = r0.A0Q
            com.whatsapp.newsletter.NewsletterLinkLauncher r2 = r0.A0K
            X.33O r1 = r0.A0M
            X.5U7 r0 = r0.A0L
            X.51i r13 = new X.51i
            r25 = r8
            r26 = r5
            r27 = r2
            r28 = r12
            r29 = r16
            r30 = r0
            r31 = r1
            r32 = r4
            r33 = r3
            r18 = r15
            r19 = r7
            r21 = r17
            r22 = r6
            r23 = r9
            r15 = r13
            r16 = r11
            r17 = r10
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            goto L_0x0072
        L_0x017c:
            X.2sH r9 = r0.A09
            X.1VX r8 = r0.A0F
            X.3Wi r7 = r0.A03
            X.2r1 r6 = r0.A0J
            X.1fd r5 = r0.A0H
            X.33i r4 = r0.A08
            X.33j r3 = r0.A0B
            X.2eP r2 = r0.A0I
            X.1sV r1 = r0.A0P
            com.whatsapp.newsletter.NewsletterLinkLauncher r0 = r0.A0K
            X.51f r13 = new X.51f
            r25 = r0
            r26 = r12
            r27 = r16
            r28 = r1
            r18 = r4
            r19 = r9
            r20 = r3
            r21 = r8
            r22 = r5
            r23 = r2
            r24 = r6
            r15 = r13
            r16 = r11
            r17 = r7
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            goto L_0x0072
        L_0x01b2:
            X.1VX r10 = r0.A0F
            X.3Wi r9 = r0.A03
            X.5Zz r8 = r0.A0G
            X.4Fm r7 = r0.A04
            X.33i r6 = r0.A08
            X.33j r5 = r0.A0B
            X.2rN r4 = r0.A0O
            X.2eP r3 = r0.A0I
            X.5nM r2 = r0.A0C
            X.1sV r1 = r0.A0P
            X.36Y r0 = r0.A0D
            X.51j r13 = new X.51j
            r25 = r12
            r26 = r16
            r27 = r4
            r28 = r1
            r18 = r6
            r19 = r5
            r20 = r2
            r21 = r0
            r22 = r10
            r23 = r8
            r24 = r3
            r15 = r13
            r16 = r9
            r17 = r7
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            goto L_0x0072
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass51x.A08():X.5Ut");
    }

    public AnonymousClass5LV A09() {
        if (this instanceof AnonymousClass51v) {
            return ((AnonymousClass51v) this).A0Q();
        }
        AnonymousClass5LV r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass5LV r02 = new AnonymousClass5LV();
        this.A01 = r02;
        return r02;
    }

    public void A0B() {
        if (this.A06 && !this.A05) {
            StringBuilder A0o = AnonymousClass001.A0o();
            C86604Kt.A1W(A0o, "playbackPage/pausePlayback page=", this);
            C18260x0.A0o(this.A0T.A01, A0o);
            this.A05 = true;
            A08().A05();
            this.A0Y.A09();
        }
    }

    public void A0C() {
        if (this.A04 && this.A06 && !this.A02 && this.A00.A0O == 4 && !this.A01.A0F.A0M()) {
            A08();
            StringBuilder A0o = AnonymousClass001.A0o();
            C86604Kt.A1W(A0o, "playbackPage/resumePlayback page=", this);
            StatusPlaybackBaseFragment statusPlaybackBaseFragment = this.A0T.A01;
            C18260x0.A0o(statusPlaybackBaseFragment, A0o);
            C003203q A0Q2 = statusPlaybackBaseFragment.A0Q();
            if (A0Q2 instanceof StatusPlaybackActivity) {
                StatusPlaybackActivity statusPlaybackActivity = (StatusPlaybackActivity) A0Q2;
                if (statusPlaybackActivity.A0N) {
                    statusPlaybackActivity.A0N = false;
                    new Handler().postDelayed(new C117635sF(this, 14), 1000);
                    return;
                }
            }
            this.A05 = false;
            A08().A06();
            this.A0Y.A07();
            A0F();
        }
    }

    public void A0D() {
        if (!this.A04 || this.A06 || !A08().A0A()) {
            StringBuilder A0o = AnonymousClass001.A0o();
            AnonymousClass000.A17(this, "playbackPage/startPlayback not possible page=", "; host=", A0o);
            C18270x1.A17(this.A0T.A01, A0o);
            return;
        }
        StringBuilder A0o2 = AnonymousClass001.A0o();
        AnonymousClass000.A17(this, "playbackPage/startPlayback page=", "; host=", A0o2);
        C18260x0.A0o(this.A0T.A01, A0o2);
        this.A06 = true;
        this.A05 = false;
        A08().A07();
        this.A02.setProgressProvider(this.A0U);
        A0F();
        this.A0X.A07();
        this.A0Z.A09();
        if (this.A02 || !this.A03 || this.A00.A0O != 4 || this.A01.A0F.A0M()) {
            A0B();
        } else {
            A08();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        if (r0.A0R == false) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0E() {
        /*
            r17 = this;
            r2 = r17
            X.5Ut r3 = r2.A08()
            boolean r0 = r3 instanceof X.C985351g
            if (r0 == 0) goto L_0x0025
            X.51g r3 = (X.C985351g) r3
            X.1mu r0 = r3.A09
            X.33C r0 = r0.A01
            if (r0 == 0) goto L_0x0017
            boolean r0 = r0.A0R
            r1 = 0
            if (r0 != 0) goto L_0x0018
        L_0x0017:
            r1 = 1
        L_0x0018:
            X.4Pf r0 = r3.A0A
            r0.setBlurEnabled(r1)
        L_0x001d:
            boolean r0 = r2.A0N()
            r2.A0L(r0)
            return
        L_0x0025:
            boolean r0 = r3 instanceof X.C985551i
            if (r0 == 0) goto L_0x003e
            X.51i r3 = (X.C985551i) r3
            boolean r0 = r3.A0A()
            if (r0 != 0) goto L_0x003a
            r3.A0F()
            r3.A0H()
            r3.A0C()
        L_0x003a:
            r3.A0D()
            goto L_0x001d
        L_0x003e:
            boolean r0 = r3 instanceof X.C985151e
            if (r0 == 0) goto L_0x00b9
            X.51e r3 = (X.C985151e) r3
            X.2i5 r0 = r3.A02
            android.net.Uri r7 = r0.A00()
            X.C162457s7.A0D(r7)
            X.34x r0 = r3.A05
            X.2z0 r0 = r0.A1J
            boolean r0 = r0.A02
            r1 = 2131889497(0x7f120d59, float:1.941366E38)
            if (r0 == 0) goto L_0x005b
            r1 = 2131889496(0x7f120d58, float:1.9413657E38)
        L_0x005b:
            android.content.Context r0 = r3.A03()
            java.lang.String r1 = X.AnonymousClass5Z5.A01(r0, r7, r1)
            X.C162457s7.A0D(r1)
            r9 = 0
            android.text.Spanned r0 = X.AnonymousClass0x9.A0B(r1)
            android.text.SpannableString r8 = android.text.SpannableString.valueOf(r0)
            X.C162457s7.A0D(r8)
            int r1 = r1.length()
            java.lang.Class<android.text.style.URLSpan> r0 = android.text.style.URLSpan.class
            java.lang.Object[] r6 = r8.getSpans(r9, r1, r0)
            android.text.style.URLSpan[] r6 = (android.text.style.URLSpan[]) r6
            X.C162457s7.A0H(r6)
            int r5 = r6.length
            r4 = 0
        L_0x0083:
            if (r4 >= r5) goto L_0x00ad
            r11 = r6[r4]
            int r1 = r8.getSpanStart(r11)
            int r0 = r8.getSpanEnd(r11)
            r8.removeSpan(r11)
            com.whatsapp.TextEmojiLabel r10 = r3.A01
            android.content.Context r12 = r10.getContext()
            X.3Wi r14 = r3.A01
            X.33i r15 = r3.A02
            X.8ss r13 = r3.A00
            java.lang.String r16 = r11.getURL()
            X.4b3 r11 = new X.4b3
            r11.<init>(r12, r13, r14, r15, r16)
            r8.setSpan(r11, r1, r0, r9)
            int r4 = r4 + 1
            goto L_0x0083
        L_0x00ad:
            com.whatsapp.TextEmojiLabel r1 = r3.A01
            r1.setText(r8)
            r0 = 27
            X.AnonymousClass54E.A00(r1, r3, r7, r0)
            goto L_0x001d
        L_0x00b9:
            boolean r0 = r3 instanceof X.C985651j
            if (r0 != 0) goto L_0x001d
            boolean r0 = r3 instanceof X.C985251f
            if (r0 == 0) goto L_0x001d
            X.51f r3 = (X.C985251f) r3
            com.whatsapp.mediaview.PhotoView r5 = r3.A06
            android.app.Activity r0 = X.C111095hX.A04(r5)
            android.view.View r0 = X.AnonymousClass001.A0Q(r0)
            X.C162457s7.A0D(r0)
            int r1 = r0.getWidth()
            int r0 = r0.getHeight()
            int r0 = java.lang.Math.max(r1, r0)
            r9 = 1
            X.5Bq r7 = new X.5Bq
            r7.<init>(r3, r0, r9)
            boolean r0 = r3.A02
            if (r0 == 0) goto L_0x00f1
            X.1sV r4 = r3.A0A
            X.1n2 r6 = r3.A08
            X.2z0 r8 = r6.A1J
            r4.A0D(r5, r6, r7, r8, r9)
            goto L_0x001d
        L_0x00f1:
            X.1sV r1 = r3.A0A
            X.1n2 r0 = r3.A08
            r1.A0F(r5, r0, r7, r9)
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass51x.A0E():void");
    }

    public final void A0F() {
        C626936e.A04(this.A00);
        this.A09.removeCallbacks(this.A0c);
        if (this.A01.A08.getVisibility() != 0) {
            AlphaAnimation A0H2 = C86604Kt.A0H();
            A0H2.setDuration(300);
            if (this.A01.A01.getVisibility() != 0) {
                this.A01.A01.startAnimation(A0H2);
                this.A01.A01.setVisibility(0);
            }
            if (this.A01.A0F.getVisibility() == 0 && this.A01.A02.getVisibility() != 0) {
                this.A01.A02.startAnimation(A0H2);
                this.A01.A02.setVisibility(0);
            }
            if (this.A01.A08.getVisibility() == 4) {
                this.A01.A08.startAnimation(A0H2);
                this.A01.A08.setVisibility(0);
            }
            AnonymousClass5LT A0c2 = C86654Ky.A0c(this.A0T.A01);
            C626936e.A06(A0c2);
            View view = A0c2.A06;
            if (view.getVisibility() != 0) {
                AlphaAnimation A0H3 = C86604Kt.A0H();
                C86604Kt.A1H(view, A0H3);
                StatusPlaybackProgressView statusPlaybackProgressView = A0c2.A0F;
                statusPlaybackProgressView.startAnimation(A0H3);
                view.setVisibility(0);
                statusPlaybackProgressView.setVisibility(0);
                Button button = A0c2.A00;
                if (button != null) {
                    button.startAnimation(A0H3);
                    A0c2.A00.setVisibility(0);
                }
            }
            this.A00.setSystemUiVisibility(1792);
        }
    }

    public void BP9() {
    }

    public AnonymousClass51x(C184988ss r3, C111095hX r4, C69263Wi r5, AnonymousClass5Ul r6, C621033m r7, C620633i r8, C56612sH r9, C620733j r10, C66543Lv r11, C114635nM r12, C54012o2 r13, C620233e r14, AnonymousClass36Y r15, AnonymousClass1VX r16, C28071fd r17, C48132eP r18, AnonymousClass1R1 r19, C113995mK r20, AnonymousClass5SJ r21, C55832qz r22, C105025Tg r23, AnonymousClass4FS r24, C105215Ua r25) {
        this.A0H = r9;
        AnonymousClass1VX r1 = r16;
        this.A0O = r1;
        this.A0W = r23;
        this.A0D = r5;
        this.A0E = r6;
        this.A0a = r24;
        this.A0M = r14;
        this.A0F = r7;
        this.A0B = r4;
        this.A0P = r17;
        this.A0L = r13;
        this.A0I = r10;
        this.A0N = r15;
        this.A0Q = r18;
        this.A0K = r12;
        this.A0A = r3;
        this.A0J = r11;
        this.A0V = r22;
        this.A0R = r19;
        this.A0b = r25;
        this.A0S = r20;
        this.A0G = r8;
        this.A0T = r21;
        this.A03 = r1.A0X(6828);
    }

    public void A00() {
        AnonymousClass5NW r0;
        super.A00();
        C105395Ut A082 = A08();
        if (A082 instanceof C985551i) {
            r0 = ((C985551i) A082).A01;
        } else if (A082 instanceof C985651j) {
            ((C985651j) A082).A0B();
            return;
        } else if (A082 instanceof C985251f) {
            r0 = ((C985251f) A082).A00;
        } else {
            return;
        }
        if (r0 != null) {
            r0.A02.dismiss();
        }
    }

    public void A01() {
        AnonymousClass5NW r0;
        Handler handler;
        super.A01();
        StatusPlaybackProgressView statusPlaybackProgressView = this.A02;
        if (statusPlaybackProgressView != null) {
            if (statusPlaybackProgressView.A03 == this.A0U) {
                statusPlaybackProgressView.A03 = null;
            }
            statusPlaybackProgressView.invalidate();
        }
        C105395Ut A082 = A08();
        if (A082 instanceof C985351g) {
            C985351g r3 = (C985351g) A082;
            C86884Mf r2 = r3.A01;
            if (!(r2 == null || (handler = r2.A02) == null)) {
                C117635sF.A00(handler, r2, 7);
            }
            r3.A01 = null;
            r3.A0B.A02(r3);
            r3.A02 = false;
            return;
        }
        if (A082 instanceof C985551i) {
            C985551i r32 = (C985551i) A082;
            r32.A0F();
            r32.A0K.A02(r32);
            r32.A03 = false;
            r0 = r32.A01;
        } else if (!(A082 instanceof C985151e) && !(A082 instanceof C985651j) && (A082 instanceof C985251f)) {
            r0 = ((C985251f) A082).A00;
        } else {
            return;
        }
        if (r0 != null) {
            r0.A02.dismiss();
        }
    }

    public void A02() {
        super.A02();
        A0B();
        if (this.A04) {
            this.A0Z.A07();
            this.A0Y.A07();
        }
    }

    public void A03() {
        super.A03();
        A0C();
        if (this.A04) {
            this.A0Z.A09();
        }
    }

    public void A04() {
        super.A04();
        AnonymousClass51w r0 = (AnonymousClass51w) this;
        this.A07 = r0.A0M.A0H(r0.A06);
        AnonymousClass33M r2 = this.A0X;
        r2.A01 = 0;
        r2.A00 = 0;
        if (A0O(true)) {
            r2.A09();
        }
        A0G();
        A0D();
    }

    public void A05() {
        super.A05();
        this.A0Z.A07();
        this.A0X.A07();
        StringBuilder A0o = AnonymousClass001.A0o();
        C86604Kt.A1W(A0o, "playbackPage/stopPlayback page=", this);
        C18260x0.A0o(this.A0T.A01, A0o);
        this.A06 = false;
        this.A05 = false;
        StatusPlaybackProgressView statusPlaybackProgressView = this.A02;
        if (statusPlaybackProgressView.A03 == this.A0U) {
            statusPlaybackProgressView.A03 = null;
        }
        statusPlaybackProgressView.invalidate();
        A08().A08();
        A0F();
        A0F();
    }

    public void A06(Rect rect) {
        super.A06(rect);
        AnonymousClass5LV A092 = A09();
        A092.A01.setPadding(rect.left, 0, rect.right, rect.bottom);
        A092.A05.setPadding(rect.left, 0, rect.right, rect.bottom);
        BottomSheetBehavior bottomSheetBehavior = this.A00;
        View view = this.A00;
        C626936e.A04(view);
        bottomSheetBehavior.A0U(C18290x4.A0G(view).getDimensionPixelSize(R.dimen.f6nameremoved) + rect.bottom, false);
        ViewGroup viewGroup = this.A01.A08;
        Rect rect2 = this.A06;
        viewGroup.setPadding(rect2.left, viewGroup.getPaddingTop(), rect2.right, rect2.bottom);
        C105395Ut A082 = A08();
        if (A082 instanceof C985651j) {
            C985651j r2 = (C985651j) A082;
            int dimensionPixelSize = r2.A03().getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
            r2.A0E.setPadding(rect.left, rect.top + dimensionPixelSize, rect.right, dimensionPixelSize + rect.bottom);
        }
    }

    public void A0H(int i) {
        AnonymousClass5LV A092 = A09();
        if (i == 4) {
            A092.A06.setVisibility(8);
            A092.A0A.setAlpha(1.0f);
            A092.A0G.A04().setAlpha(1.0f);
            A0C();
        } else if (i != 3) {
            A0B();
            ViewGroup viewGroup = this.A01.A08;
            Rect rect = this.A06;
            viewGroup.setPadding(rect.left, viewGroup.getPaddingTop(), rect.right, rect.bottom);
        }
    }

    public void A0I(int i) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("playbackPage/reportStatusExitStats exit-method=");
        String str = "UNKNOWN";
        switch (i) {
            case 1:
                str = "SWIPE_DOWN";
                break;
            case 2:
                str = "BACK_ARROW_TAP";
                break;
            case 3:
                str = "BACK_BUTTON_TAP";
                break;
            case 4:
                str = "STATUS_TIMEOUT";
                break;
            case 5:
                str = "STATUS_DISMISSED";
                break;
            case 6:
                str = "BACKWARD_SWIPE";
                break;
            case 7:
                str = "FORWARD_SWIPE";
                break;
            case 8:
                str = "BACKWARD_TAP";
                break;
            case 9:
                str = "FORWARD_TAP";
                break;
        }
        A0o.append(str);
        C86604Kt.A1W(A0o, "; page=", this);
        C18260x0.A0o(this.A0T.A01, A0o);
    }

    public void A0J(int i, boolean z) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("playbackPage/reportStatusEnterStats entry-method=");
        String str = "UNKNOWN";
        switch (i) {
            case 1:
                str = "DIRECT_TAP";
                break;
            case 2:
                str = "BACKWARD_SWIPE";
                break;
            case 3:
                str = "FORWARD_SWIPE";
                break;
            case 4:
                str = "BACKWARD_TAP";
                break;
            case 5:
                str = "FORWARD_TAP";
                break;
            case 6:
                str = "PREVIOUS_STATUS_TIMEOUT";
                break;
            case 7:
                str = "PREVIOUS_STATUS_DISMISSED";
                break;
        }
        A0o.append(str);
        C86604Kt.A1W(A0o, "; page=", this);
        C18260x0.A0o(this.A0T.A01, A0o);
    }

    public void A0K(View view) {
        StringBuilder A0o = AnonymousClass001.A0o();
        C86604Kt.A1W(A0o, "playbackPage/onViewCreated page=", this);
        C18260x0.A0o(this.A0T.A01, A0o);
        C113995mK r1 = this.A0S;
        C624134x r4 = ((AnonymousClass51w) this).A06;
        int hashCode = r4.A1J.A01.hashCode();
        AnonymousClass8JP r2 = r1.A0A;
        r2.markerPoint(453119185, hashCode, "PLAYBACK_PAGE_ITEM_ON_VIEW_CREATED_START");
        AnonymousClass5LV r11 = this.A01;
        C626936e.A06(r11);
        String str = null;
        r11.A0F.setOnClickListener((View.OnClickListener) null);
        r11.A0F.setClickable(false);
        r11.A0F.A02 = new C1235868z(this, 0, r11);
        this.A00 = new StatusPlaybackPageItem$2(this);
        C002002f A0W2 = AnonymousClass001.A0W(r11.A08);
        BottomSheetBehavior bottomSheetBehavior = this.A00;
        A0W2.A01(bottomSheetBehavior);
        C1232167o.A00(bottomSheetBehavior, this, 12);
        StatusPlaybackPageItem$4 statusPlaybackPageItem$4 = new StatusPlaybackPageItem$4(this);
        C86634Kw.A1C(r11.A03, statusPlaybackPageItem$4);
        statusPlaybackPageItem$4.A0a(new C88594aF(r11, this));
        r11.A0D.setMax(100);
        r11.A09.addView(A08().A04());
        if (!(A08() instanceof C985651j) && ((r4 instanceof AnonymousClass4FG) || !(r4 instanceof C30471mV) || (str = ((C30471mV) r4).A1w()) == null)) {
            if (r4 instanceof C30481mW) {
                str = ((C30481mW) r4).A06;
            } else {
                str = null;
            }
        }
        r11.A0F.A0N(this.A0C, C107575bX.A0D(str, EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH), this.A0O.A0X(2032));
        r11.A02.setVisibility(r11.A0F.getVisibility());
        PointF pointF = new PointF();
        AtomicLong atomicLong = new AtomicLong();
        r11.A07.setOnTouchListener(new C100695Bx(pointF, this, atomicLong, 1));
        A08().A04().setOnClickListener(new C109565ep(this, atomicLong, r11, pointF, 12));
        C105395Ut A082 = A08();
        if (A082 instanceof C985251f) {
            C985251f r6 = (C985251f) A082;
            AnonymousClass33C r0 = r6.A08.A01;
            if (r0 != null) {
                C55852r1 r5 = r6.A05;
                if (r5.A03(new AnonymousClass7YG(r0.A08, r0.A06), true) && r5.A02.A0Y(C58422vE.A01, 6033)) {
                    C18300x5.A13(r6.A03(), r6.A06, R.string.f11nameremoved);
                }
            }
        }
        r2.markerPoint(453119185, hashCode, "PLAYBACK_PAGE_ITEM_ON_VIEW_CREATED_END");
        r2.markerEnd(453119185, hashCode, 2);
    }

    public void A0L(boolean z) {
        Drawable drawable;
        AnonymousClass5LV A092 = A09();
        ViewGroup viewGroup = A092.A0A;
        Drawable drawable2 = null;
        if (z) {
            View view = this.A00;
            C626936e.A04(view);
            drawable = AnonymousClass0RP.A00(view.getContext(), R.drawable.ic_center_shadow);
        } else {
            drawable = null;
        }
        viewGroup.setBackground(drawable);
        View A042 = A092.A0G.A04();
        if (z) {
            View view2 = this.A00;
            C626936e.A04(view2);
            drawable2 = AnonymousClass0RP.A00(view2.getContext(), R.drawable.ic_center_shadow);
        }
        A042.setBackground(drawable2);
    }

    public final void A0M(boolean z, boolean z2) {
        AnonymousClass5LV A092 = A09();
        C626936e.A04(this.A00);
        if (A092.A08.getVisibility() != 4 || A092.A01.getVisibility() != 4) {
            AlphaAnimation A0G2 = C86604Kt.A0G();
            A0G2.setDuration(300);
            if (z) {
                A092.A01.startAnimation(A0G2);
                A092.A01.setVisibility(4);
            }
            if (z2) {
                this.A00.setSystemUiVisibility(1798);
                if (A092.A02.getVisibility() == 0) {
                    A092.A02.startAnimation(A0G2);
                    A092.A02.setVisibility(4);
                }
            }
            if (A092.A08.getVisibility() == 0) {
                A092.A08.startAnimation(A0G2);
                A092.A08.setVisibility(4);
            }
            AnonymousClass5LT A0c2 = C86654Ky.A0c(this.A0T.A01);
            C626936e.A06(A0c2);
            View view = A0c2.A06;
            if (view.getVisibility() != 4) {
                AlphaAnimation A0G3 = C86604Kt.A0G();
                C86604Kt.A1H(view, A0G3);
                StatusPlaybackProgressView statusPlaybackProgressView = A0c2.A0F;
                statusPlaybackProgressView.startAnimation(A0G3);
                view.setVisibility(4);
                statusPlaybackProgressView.setVisibility(4);
                Button button = A0c2.A00;
                if (button != null) {
                    button.startAnimation(A0G3);
                    A0c2.A00.setVisibility(4);
                }
            }
        }
    }

    public boolean A0N() {
        if (!(A08() instanceof C985651j)) {
            C624134x r2 = ((AnonymousClass51w) this).A06;
            String str = null;
            if (!(r2 instanceof AnonymousClass4FG) && (r2 instanceof C30471mV)) {
                str = ((C30471mV) r2).A1w();
            }
            if (!TextUtils.isEmpty(str)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public void BR6() {
        A0C();
    }
}
