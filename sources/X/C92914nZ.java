package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.conversation.conversationrow.MediaProgressRing;
import com.whatsapp.conversation.conversationrow.MediaTimeDisplay;
import com.whatsapp.conversation.conversationrow.PushToVideoInlineVideoPlayer;
import java.io.File;

/* renamed from: X.4nZ  reason: invalid class name and case insensitive filesystem */
public class C92914nZ extends C93244oC {
    public static final Interpolator A0b = C05030Rp.A00(0.85f, 0.0f, 0.15f, 1.0f);
    public int A00 = -1;
    public int A01 = -1;
    public AnimatorSet A02;
    public AnonymousClass5HY A03;
    public C106965aS A04;
    public AnonymousClass2z0 A05 = null;
    public AnonymousClass2z0 A06 = null;
    public AnonymousClass33D A07 = AnonymousClass33D.A01;
    public AnonymousClass5RW A08;
    public boolean A09;
    public boolean A0A = false;
    public boolean A0B = false;
    public boolean A0C = false;
    public boolean A0D = false;
    public final int A0E;
    public final Animator.AnimatorListener A0F = new AnonymousClass90J(this, 3);
    public final View.OnClickListener A0G = new C109345eT(this, 31);
    public final View.OnTouchListener A0H = new C159677mH(this, 8);
    public final View A0I;
    public final View A0J = C06560Yg.A02(this, R.id.upload_download_frame);
    public final ViewGroup A0K = C86644Kx.A0I(this, R.id.media_container);
    public final ViewGroup A0L = C86644Kx.A0I(this, R.id.overlay_button_container);
    public final ViewGroup A0M = C86644Kx.A0I(this, R.id.progress_bar_container);
    public final ViewGroup A0N;
    public final TextView A0O = C18300x5.A0G(this, R.id.media_retry_btn);
    public final AnonymousClass08M A0P = C18330xA.A01((Object) null);
    public final C15930sC A0Q = AnonymousClass6C6.A00(this, 183);
    public final WaImageView A0R = AnonymousClass0x9.A0L(this, R.id.play_button);
    public final MediaProgressRing A0S;
    public final MediaTimeDisplay A0T;
    public final PushToVideoInlineVideoPlayer A0U = ((PushToVideoInlineVideoPlayer) C06560Yg.A02(this, R.id.inline_video_player));
    public final AnonymousClass107 A0V = AnonymousClass4L0.A0O(Boolean.FALSE);
    public final C109665ez A0W = new AnonymousClass54F(this, 42);
    public final C109665ez A0X = new AnonymousClass54F(this, 43);
    public final AnonymousClass5UY A0Y = AnonymousClass0x2.A0M(this, R.id.cancel_download);
    public final AnonymousClass5UY A0Z = AnonymousClass0x2.A0M(this, R.id.progress_bar);
    public final C183348pt A0a = new AnonymousClass69Q(this, 0);

    public void A1H() {
        A1t(false);
        A01(this, false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v34, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v36, resolved type: boolean} */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x009a, code lost:
        if (r31.getPlaybackState() != 3) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00b2, code lost:
        if (r11.A0D != false) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00c5, code lost:
        if (r11.A0B != false) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0184, code lost:
        if (r1.A03() == 0) goto L_0x0186;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0087, code lost:
        if (r31.getPlaybackState() != 3) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x024b, code lost:
        if (r12 == r11.A00) goto L_0x01da;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0251  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0254  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x025e  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0262  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0272  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01b4  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0249  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.C92914nZ r30, boolean r31) {
        /*
            r11 = r30
            X.34x r10 = r11.A0S
            X.1mV r10 = (X.C30471mV) r10
            X.1pC r10 = (X.C31981pC) r10
            r14 = r31
            if (r31 == 0) goto L_0x001c
            X.33D r0 = X.AnonymousClass33D.A01
            r11.A07 = r0
            X.2z0 r1 = r10.A1J
            X.5HY r0 = r11.A03
            X.08M r0 = r0.A01
            boolean r0 = X.C86614Ku.A1W(r0, r1)
            r11.A0A = r0
        L_0x001c:
            X.34x r0 = r11.A0S
            X.2z0 r0 = r0.A1J
            boolean r1 = r0.A02
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "conversation/row/ptv/fillView for "
            X.2z0 r9 = X.C624134x.A08(r10, r0, r2)
            r2.append(r9)
            java.lang.String r0 = " is-new = "
            r2.append(r0)
            r2.append(r14)
            java.lang.String r18 = " conversationRowPtv="
            r0 = r18
            X.C18280x3.A1G(r2, r0, r11)
            java.lang.String r0 = " isActive="
            r2.append(r0)
            boolean r0 = r11.A0A
            r2.append(r0)
            java.lang.String r0 = " fromMe="
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = " isMediaTransferInProgress="
            r2.append(r0)
            boolean r0 = X.C87094Nz.A0m(r11)
            r2.append(r0)
            java.lang.String r0 = " isMediaTransferSuccessful="
            r2.append(r0)
            boolean r0 = X.C87094Nz.A0j(r11)
            r2.append(r0)
            java.lang.String r0 = " isMediaDownloadable="
            r2.append(r0)
            boolean r0 = X.C87094Nz.A0k(r11)
            X.C18260x0.A1U(r2, r0)
            com.whatsapp.conversation.conversationrow.PushToVideoInlineVideoPlayer r0 = r11.A0U
            r31 = r0
            X.566 r4 = r0.A09
            X.5Xh r0 = r4.A00
            boolean r0 = r0.A07
            r2 = 3
            r8 = 1
            if (r0 == 0) goto L_0x0089
            int r0 = r31.getPlaybackState()
            r3 = 1
            if (r0 == r2) goto L_0x008a
        L_0x0089:
            r3 = 0
        L_0x008a:
            boolean r0 = r11.A0A
            r13 = 2
            if (r0 == 0) goto L_0x027a
            X.5Xh r0 = r4.A00
            boolean r0 = r0.A07
            if (r0 != 0) goto L_0x009c
            int r0 = r31.getPlaybackState()
            r1 = 1
            if (r0 == r2) goto L_0x009d
        L_0x009c:
            r1 = 0
        L_0x009d:
            int r0 = r31.getPlaybackState()
            boolean r0 = X.AnonymousClass001.A1X(r0, r8)
            if (r1 != 0) goto L_0x00a9
            if (r0 != 0) goto L_0x00b4
        L_0x00a9:
            if (r3 != 0) goto L_0x00b4
            boolean r0 = r11.A0B
            if (r0 != 0) goto L_0x00b4
            boolean r0 = r11.A0D
            r12 = 3
            if (r0 == 0) goto L_0x00b5
        L_0x00b4:
            r12 = 0
        L_0x00b5:
            r1 = 2
            r7 = 0
        L_0x00b7:
            r6 = 1
            r23 = 0
        L_0x00ba:
            com.whatsapp.conversation.conversationrow.MediaProgressRing r5 = r11.A0S
            boolean r0 = r11.A0A
            r4 = 8
            if (r0 == 0) goto L_0x00c7
            boolean r3 = r11.A0B
            r0 = 0
            if (r3 == 0) goto L_0x00c9
        L_0x00c7:
            r0 = 8
        L_0x00c9:
            r5.setVisibility(r0)
            com.whatsapp.conversation.conversationrow.MediaTimeDisplay r3 = r11.A0T
            int r0 = X.C86614Ku.A09(r6)
            r3.setVisibility(r0)
            android.view.View r0 = r11.A0I
            if (r7 == 0) goto L_0x00da
            r4 = 0
        L_0x00da:
            r0.setVisibility(r4)
            if (r1 == r8) goto L_0x0272
            r17 = 0
            if (r1 == r13) goto L_0x026e
            if (r1 == r2) goto L_0x026a
            r15 = r17
        L_0x00e7:
            r11.A1L()
            boolean r0 = r11.A0A
            r7 = 0
            if (r0 == 0) goto L_0x0262
            r6 = 1
        L_0x00f0:
            if (r14 != 0) goto L_0x025e
            int r0 = r11.A01
            if (r6 == r0) goto L_0x015b
            r3 = 100
            if (r6 == 0) goto L_0x0258
            if (r6 == r8) goto L_0x025a
        L_0x00fc:
            android.view.ViewGroup r0 = r11.A0N
            r16 = r0
            int r2 = r16.getWidth()
            if (r6 != r8) goto L_0x0254
            int r1 = r11.getActiveBubbleSize()
        L_0x010a:
            int[] r0 = new int[r13]
            r0[r7] = r2
            android.animation.ValueAnimator r5 = X.C86664Kz.A0Q(r0, r1)
            android.view.animation.Interpolator r2 = A0b
            r5.setInterpolator(r2)
            X.5Ae r0 = new X.5Ae
            r0.<init>(r5, r8, r11)
            r5.addUpdateListener(r0)
            float r16 = r16.getScaleX()
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r6 != r13) goto L_0x012a
            r1 = 1064514355(0x3f733333, float:0.95)
        L_0x012a:
            float[] r0 = new float[r13]
            r0[r7] = r16
            android.animation.ValueAnimator r0 = X.C86664Kz.A0P(r0, r1)
            r0.setInterpolator(r2)
            r1 = 11
            X.C100295Aj.A03(r0, r11, r1)
            android.animation.AnimatorSet r1 = X.C86664Kz.A0O()
            android.animation.Animator[] r0 = X.C86664Kz.A1b(r5, r0, r13, r7)
            r1.playTogether(r0)
            r1.setDuration(r3)
            android.animation.Animator$AnimatorListener r0 = r11.A0F
            r1.addListener(r0)
            r11.A01 = r6
            android.animation.AnimatorSet r0 = r11.A02
            if (r0 == 0) goto L_0x0156
            r0.cancel()
        L_0x0156:
            r11.A02 = r1
            r1.start()
        L_0x015b:
            android.view.View r2 = r11.A0J
            X.5UY r0 = r11.A0Z
            X.5UY r1 = r11.A0Y
            android.widget.TextView r3 = r11.A0O
            r25 = r7
            r26 = r7
            r19 = r2
            r20 = r3
            r21 = r0
            r22 = r1
            r24 = r7
            X.C93244oC.A04(r19, r20, r21, r22, r23, r24, r25, r26)
            android.view.ViewGroup r4 = r11.A0M
            int r0 = r0.A03()
            r2 = 8
            if (r0 == 0) goto L_0x0186
            int r1 = r1.A03()
            r0 = 8
            if (r1 != 0) goto L_0x0187
        L_0x0186:
            r0 = 0
        L_0x0187:
            r4.setVisibility(r0)
            if (r12 == 0) goto L_0x0251
            if (r12 == r8) goto L_0x024e
            if (r12 == r13) goto L_0x024e
            com.whatsapp.WaImageView r1 = r11.A0R
        L_0x0192:
            r0 = 8
            if (r1 != r3) goto L_0x0197
            r0 = 0
        L_0x0197:
            r3.setVisibility(r0)
            android.view.ViewGroup r4 = r11.A0L
            int r0 = X.C86644Kx.A08(r1)
            r4.setVisibility(r0)
            if (r14 == 0) goto L_0x0249
            X.34x r0 = r11.A0S
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r3.setTag(r0)
        L_0x01ae:
            r11.A00 = r12
            com.whatsapp.WaImageView r0 = r11.A0R
            if (r1 != r0) goto L_0x01b5
            r2 = 0
        L_0x01b5:
            r0.setVisibility(r2)
            if (r1 != r3) goto L_0x01da
            if (r12 == r8) goto L_0x0240
            if (r12 != r13) goto L_0x02af
            r4 = 2131887188(0x7f120454, float:1.9408976E38)
            r2 = 2131231121(0x7f080191, float:1.8078314E38)
            X.5ez r1 = r11.A0W
            X.34x r0 = r11.A0S
            X.1mV r0 = (X.C30471mV) r0
            X.C87094Nz.A0H(r3, r11, r0)
        L_0x01cd:
            android.content.Context r0 = X.C86654Ky.A0B(r11, r3, r4)
            X.C18300x5.A13(r0, r3, r4)
            r3.setCompoundDrawablesWithIntrinsicBounds(r2, r7, r7, r7)
            r3.setOnClickListener(r1)
        L_0x01da:
            boolean r3 = r11.A0A
            boolean r28 = X.C87094Nz.A0j(r11)
            boolean r29 = r11.A2A()
            boolean r0 = r11.A0D
            if (r0 != 0) goto L_0x01ed
            boolean r0 = r11.A0B
            if (r0 != 0) goto L_0x01ed
            r8 = 0
        L_0x01ed:
            X.1sV r2 = r11.A22
            r0 = 43
            X.5rM r26 = X.C117085rM.A00(r11, r0)
            android.view.View$OnLongClickListener r1 = r11.A2T
            X.8pt r0 = r11.A0a
            r23 = r10
            r24 = r2
            r25 = r0
            r27 = r3
            r30 = r8
            r19 = r31
            r20 = r15
            r21 = r1
            r22 = r17
            r19.A04(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r11.A29()
            r11.A28()
            X.5HY r0 = r11.A03
            X.2z0 r2 = r0.A00
            boolean r0 = r9.equals(r2)
            if (r0 == 0) goto L_0x022e
            boolean r0 = X.C87094Nz.A0j(r11)
            if (r0 == 0) goto L_0x022e
            X.5HY r1 = r11.A03
            r0 = 0
            r1.A00 = r0
            X.08M r0 = r1.A01
            r0.A0H(r2)
        L_0x022e:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "conversation/row/ptv/fillView/end for "
            r1.append(r0)
            r1.append(r9)
            r0 = r18
            X.C86604Kt.A1V(r1, r0, r11)
            return
        L_0x0240:
            r4 = 2131893203(0x7f121bd3, float:1.9421176E38)
            r2 = 2131231174(0x7f0801c6, float:1.8078422E38)
            X.5ez r1 = r11.A0A
            goto L_0x01cd
        L_0x0249:
            int r0 = r11.A00
            if (r12 != r0) goto L_0x01ae
            goto L_0x01da
        L_0x024e:
            r1 = r3
            goto L_0x0192
        L_0x0251:
            r1 = 0
            goto L_0x0192
        L_0x0254:
            int r1 = r11.A0E
            goto L_0x010a
        L_0x0258:
            if (r0 != r8) goto L_0x00fc
        L_0x025a:
            r3 = 250(0xfa, double:1.235E-321)
            goto L_0x00fc
        L_0x025e:
            r3 = 0
            goto L_0x00fc
        L_0x0262:
            boolean r0 = r11.A0D
            int r6 = X.C18310x6.A02(r0)
            goto L_0x00f0
        L_0x026a:
            X.5ez r15 = r11.A0W
            goto L_0x00e7
        L_0x026e:
            android.view.View$OnClickListener r15 = r11.A0G
            goto L_0x00e7
        L_0x0272:
            X.5ez r15 = r11.A0X
            android.view.View$OnTouchListener r0 = r11.A0H
            r17 = r0
            goto L_0x00e7
        L_0x027a:
            boolean r0 = X.C87094Nz.A0m(r11)
            if (r0 == 0) goto L_0x0287
            r12 = 0
            r7 = 0
            r6 = 0
            r23 = 1
            goto L_0x00ba
        L_0x0287:
            boolean r0 = X.C87094Nz.A0j(r11)
            if (r0 == 0) goto L_0x02a2
            int r1 = r31.getPlaybackState()
            r0 = 4
            boolean r0 = X.AnonymousClass000.A1U(r1, r0)
            r7 = r0 ^ 1
            r12 = 0
            if (r0 == 0) goto L_0x029c
            r12 = 3
        L_0x029c:
            r6 = 1
            r23 = 0
            r1 = 1
            goto L_0x00ba
        L_0x02a2:
            boolean r0 = X.C87094Nz.A0k(r11)
            r1 = 1
            r12 = 1
            if (r0 == 0) goto L_0x02ac
            r1 = 3
            r12 = 2
        L_0x02ac:
            r7 = 1
            goto L_0x00b7
        L_0x02af:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Unexpected overlayButtonAction: "
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r12)
            java.lang.UnsupportedOperationException r0 = X.AnonymousClass002.A0G(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92914nZ.A01(X.4nZ, boolean):void");
    }

    /* access modifiers changed from: private */
    public int getVideoDuration() {
        int A062 = this.A0U.A09.A06();
        if (A062 == 0) {
            return ((C30471mV) this.A0S).A0B * 1000;
        }
        return A062;
    }

    public void A0v() {
        if (!this.A09) {
            this.A09 = true;
            C88864av A0C2 = C87094Nz.A0C(this);
            C64333Db r2 = A0C2.A0K;
            C87094Nz.A0W(r2, this);
            C87094Nz.A0X(r2, this);
            C87094Nz.A0Y(r2, this);
            C87094Nz.A0Z(r2, this);
            C87094Nz.A0a(r2, this, C87094Nz.A0D(r2));
            C116985rC A0A2 = C87094Nz.A0A(r2, this);
            C87094Nz.A0R(r2, r2.A00, this);
            C87094Nz.A0M(A0A2, r2, this, r2.A4V);
            C87094Nz.A0S(r2, A0C2, this);
            C87094Nz.A0b(r2, this, C87094Nz.A0E(r2));
            C87094Nz.A0I(A0A2, r2, A0C2, this, C86604Kt.A0i(r2));
            C87094Nz.A0P(A0A2, r2, this);
            this.A03 = (AnonymousClass5HY) r2.A00.A9x.get();
            this.A08 = (AnonymousClass5RW) r2.A00.A47.get();
            this.A04 = (C106965aS) r2.A00.ABl.get();
        }
    }

    public void A1N() {
        if (this.A02 == null || C87094Nz.A0l(this)) {
            C30471mV r0 = (C30471mV) this.A0S;
            AnonymousClass33C A002 = C30471mV.A00(r0);
            AnonymousClass2z0 r3 = r0.A1J;
            if (!r3.A02 && !A002.A0R) {
                return;
            }
            if (A002.A07 == 1) {
                this.A0X.A0F(R.string.f11nameremoved, 1);
            } else if (A2A()) {
                AnonymousClass5HY r1 = this.A03;
                r1.A00 = null;
                r1.A01.A0H(r3);
                this.A0U.setPlayWhenReadyAndActive(true);
            }
        }
    }

    public void A1q(C624134x r2, boolean z) {
        boolean A1W = C18300x5.A1W(r2, this.A0S);
        super.A1q(r2, z);
        if (z || A1W) {
            A01(this, A1W);
        }
    }

    public final void A28() {
        AnonymousClass2z0 r1;
        AnonymousClass2z0 r2 = this.A05;
        if (this.A0C) {
            r1 = this.A0S.A1J;
        } else {
            r1 = null;
        }
        this.A05 = r1;
        if (!AnonymousClass75J.A00(r1, r2)) {
            MediaTimeDisplay mediaTimeDisplay = this.A0T;
            Runnable runnable = mediaTimeDisplay.A06;
            if (runnable != null) {
                runnable.run();
            }
            if (r1 != null) {
                C624134x r22 = this.A0S;
                C15910sA A002 = AnonymousClass0IY.A00(getRootView());
                if (A002 != null) {
                    mediaTimeDisplay.A03(A002, new C113025kl(this, r22));
                }
            }
        }
    }

    public final void A29() {
        AnonymousClass2z0 r1;
        C15910sA A002;
        AnonymousClass2z0 r2 = this.A06;
        if (this.A0C) {
            r1 = this.A0S.A1J;
        } else {
            r1 = null;
        }
        this.A06 = r1;
        if (!AnonymousClass75J.A00(r1, r2)) {
            MediaProgressRing mediaProgressRing = this.A0S;
            Runnable runnable = mediaProgressRing.A05;
            if (runnable != null) {
                runnable.run();
            }
            if (r1 != null && (A002 = AnonymousClass0IY.A00(getRootView())) != null) {
                mediaProgressRing.A01(A002, new C113005kj(this));
            }
        }
    }

    public final boolean A2A() {
        File file;
        Uri fromFile;
        AnonymousClass33D r1 = this.A07;
        if (r1.A00 == null) {
            boolean z = false;
            if (!C87094Nz.A0j(this)) {
                return false;
            }
            AnonymousClass33C r0 = ((C30471mV) this.A0S).A01;
            if (!(r0 == null || (file = r0.A0F) == null || (fromFile = Uri.fromFile(file)) == null || !C18310x6.A0a(fromFile).exists())) {
                z = true;
            }
            r1 = new AnonymousClass33D(Boolean.valueOf(z));
            this.A07 = r1;
        }
        return AnonymousClass001.A1Z(r1.A00());
    }

    public C31951p9 getFMessage() {
        return (C31951p9) ((C30471mV) this.A0S);
    }

    public void setFMessage(C624134x r2) {
        C626936e.A0C(r2 instanceof C31951p9);
        super.setFMessage(r2);
    }

    public C92914nZ(Context context, AnonymousClass677 r6, C31951p9 r7) {
        super(context, r6, r7);
        A0v();
        ViewGroup A0I2 = C86644Kx.A0I(this, R.id.ptv_bubble_container);
        this.A0N = A0I2;
        this.A0I = C06560Yg.A02(this, R.id.mute_btn);
        this.A0T = (MediaTimeDisplay) C06560Yg.A02(this, R.id.media_time_display);
        this.A0S = (MediaProgressRing) C06560Yg.A02(this, R.id.playback_progress_ring);
        this.A0E = Math.min(C18290x4.A0G(A0I2).getDimensionPixelSize(R.dimen.f6nameremoved), AnonymousClass5YO.A01(A0I2.getContext(), 65));
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("conversation/row/ptv/init/messageId=");
        C18260x0.A1J(A0o, this.A0S.A1J.A01);
        ViewGroup viewGroup = this.A0K;
        C107235av.A01(viewGroup);
        AnonymousClass5UY r1 = this.A0Z;
        AnonymousClass5UY.A02(r1, this, 7);
        r1.A07(this.A08);
        this.A0N.setContentDescription(getResources().getString(R.string.f11nameremoved));
        viewGroup.setContentDescription(getResources().getString(R.string.f11nameremoved));
        A01(this, true);
    }

    private int getActiveBubbleSize() {
        int A002 = AnonymousClass5YO.A00(getContext());
        AnonymousClass679 r1 = this.A0n;
        return C86664Kz.A09(getResources(), R.dimen.f6nameremoved, AnonymousClass000.A06(this, (A002 - r1.B4q()) - r1.B4r(this.A0S)));
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A0C = true;
        C15910sA A002 = AnonymousClass0IY.A00(getRootView());
        if (A002 != null) {
            this.A03.A01.A0B(A002, this.A0Q);
        }
        A01(this, false);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C624134x r2 = this.A0S;
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass2z0 A082 = C624134x.A08(r2, "conversation/row/ptv/onDetachedFromWindow/", A0o);
        AnonymousClass2z0.A0A(A082, A0o);
        C86604Kt.A1V(A0o, " conversationRowPtv=", this);
        this.A0C = false;
        this.A03.A01.A0F(this.A0Q);
        AnonymousClass5HY r1 = this.A03;
        if (A082.equals(r1.A00)) {
            r1.A00 = null;
        }
        A29();
        A28();
    }

    public int getCenteredLayoutId() {
        return R.layout.f8nameremoved;
    }

    public int getIncomingLayoutId() {
        return R.layout.f8nameremoved;
    }

    public int getOutgoingLayoutId() {
        return R.layout.f8nameremoved;
    }
}
