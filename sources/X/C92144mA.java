package X;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewStub;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.conversation.viewmodel.ConversationTitleViewModel;
import com.whatsapp.jid.UserJid;
import com.whatsapp.status.viewmodels.StatusesViewModel;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.profilephoto.WDSProfilePhoto;

/* renamed from: X.4mA  reason: invalid class name and case insensitive filesystem */
public class C92144mA extends C89884fR {
    public long A00;
    public Handler A01;
    public ViewStub A02;
    public C71723cZ A03;
    public ConversationTitleViewModel A04;
    public StatusesViewModel A05;
    public Runnable A06;
    public boolean A07 = false;
    public boolean A08;
    public final C15910sA A09;
    public final C15940sD A0A;
    public final C116985rC A0B;
    public final AnonymousClass5FA A0C;
    public final C56972sr A0D;
    public final C49712gy A0E;
    public final C56612sH A0F;
    public final C56982ss A0G;
    public final AnonymousClass3LP A0H;
    public final C53202mi A0I;
    public final C103295Mi A0J;
    public final C53322mu A0K;
    public final C183538qC A0L;
    public final C183538qC A0M;
    public final C183538qC A0N;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C92144mA(X.C009707r r28, X.C15910sA r29, X.C15940sD r30, X.C116985rC r31, X.C53582nK r32, X.AnonymousClass5FA r33, X.C69263Wi r34, X.C56972sr r35, X.AnonymousClass64J r36, X.C49712gy r37, X.AnonymousClass5MG r38, X.C29291ia r39, X.C29301ib r40, X.AnonymousClass5UX r41, X.C29421in r42, X.AnonymousClass5ZU r43, X.C613330g r44, X.C56612sH r45, X.C620733j r46, X.C50202hn r47, X.C56982ss r48, X.C66473Lo r49, X.AnonymousClass3ZH r50, X.AnonymousClass5Y0 r51, X.AnonymousClass1VX r52, X.AnonymousClass3LP r53, X.C29241iV r54, X.C53202mi r55, X.C95814uZ r56, X.C103295Mi r57, X.C56072rN r58, X.C187958y5 r59, X.AnonymousClass4FS r60, X.C53322mu r61, X.C183538qC r62, X.C183538qC r63, X.C183538qC r64) {
        /*
            r27 = this;
            r2 = r27
            r23 = r56
            r22 = r54
            r21 = r52
            r20 = r51
            r19 = r50
            r18 = r49
            r9 = r39
            r10 = r40
            r3 = r28
            r24 = r58
            r25 = r59
            r26 = r60
            r4 = r32
            r7 = r36
            r5 = r34
            r8 = r38
            r6 = r35
            r11 = r41
            r12 = r42
            r13 = r43
            r14 = r44
            r15 = r46
            r16 = r47
            r1 = r48
            r17 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r0 = 0
            r2.A07 = r0
            r0 = r45
            r2.A0F = r0
            r2.A0D = r6
            r2.A0G = r1
            r0 = r37
            r2.A0E = r0
            r0 = r53
            r2.A0H = r0
            r0 = r61
            r2.A0K = r0
            r0 = r31
            r2.A0B = r0
            r0 = r29
            r2.A09 = r0
            r0 = r30
            r2.A0A = r0
            r0 = r57
            r2.A0J = r0
            r0 = r33
            r2.A0C = r0
            r0 = r55
            r2.A0I = r0
            r0 = r62
            r2.A0N = r0
            r0 = r63
            r2.A0M = r0
            r0 = r64
            r2.A0L = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92144mA.<init>(X.07r, X.0sA, X.0sD, X.5rC, X.2nK, X.5FA, X.3Wi, X.2sr, X.64J, X.2gy, X.5MG, X.1ia, X.1ib, X.5UX, X.1in, X.5ZU, X.30g, X.2sH, X.33j, X.2hn, X.2ss, X.3Lo, X.3ZH, X.5Y0, X.1VX, X.3LP, X.1iV, X.2mi, X.4uZ, X.5Mi, X.2rN, X.8y5, X.4FS, X.2mu, X.8qC, X.8qC, X.8qC):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00e8, code lost:
        if (X.C86644Kx.A1Z(r2.A0o) == false) goto L_0x00ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0270, code lost:
        if (X.AnonymousClass31U.A01(r2.A0U, r2.A0F, r7) == null) goto L_0x0272;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02() {
        /*
            r18 = this;
            r2 = r18
            r2.A0E()
            r2.A0D()
            X.74O r0 = r2.A0K
            if (r0 != 0) goto L_0x0010
            r0 = 1
            r2.A08 = r0
        L_0x000f:
            return
        L_0x0010:
            r10 = 0
            r2.A08 = r10
            r2.A05()
            android.util.Pair r5 = r2.A0C()
            int r0 = X.C18280x3.A03(r5)
            r4 = 1
            if (r0 != r4) goto L_0x00a5
            java.lang.Object r5 = r5.second
            java.lang.String r5 = (java.lang.String) r5
            android.view.View r1 = r2.A02
            r0 = 8
            r1.setVisibility(r0)
            android.view.View r0 = r2.A04
            r0.setVisibility(r10)
            com.whatsapp.TextEmojiLabel r0 = r2.A0F
            r0.setVisibility(r10)
            android.view.View r0 = r2.A04
            int r1 = r0.getWidth()
            com.whatsapp.TextEmojiLabel r0 = r2.A0F
            android.text.TextPaint r0 = r0.getPaint()
            float r3 = r0.measureText(r5)
            float r13 = (float) r1
            int r0 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x009f
            boolean r0 = r2.A0Q
            if (r0 != 0) goto L_0x009f
            r2.A0Q = r4
            com.whatsapp.TextEmojiLabel r0 = r2.A0F
            r0.setText(r5)
            r11 = 0
            X.33j r0 = r2.A0j
            boolean r0 = X.C620733j.A04(r0)
            if (r0 == 0) goto L_0x0060
            float r13 = -r3
        L_0x0060:
            android.view.animation.TranslateAnimation r9 = new android.view.animation.TranslateAnimation
            r14 = r10
            r16 = r10
            r17 = r11
            r12 = r10
            r15 = r11
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            r0 = 3000(0xbb8, double:1.482E-320)
            r9.setDuration(r0)
            r0 = 1000(0x3e8, double:4.94E-321)
            r9.setStartOffset(r0)
            r0 = 3
            X.C1232467r.A00(r9, r2, r0)
            com.whatsapp.TextEmojiLabel r0 = r2.A0F
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            int r0 = (int) r3
            r1.width = r0
            com.whatsapp.TextEmojiLabel r0 = r2.A0F
            r0.setLayoutParams(r1)
            com.whatsapp.TextEmojiLabel r0 = r2.A0F
            r0.startAnimation(r9)
        L_0x008d:
            com.whatsapp.conversation.viewmodel.ConversationTitleViewModel r3 = r2.A04
            X.3ZH r2 = r2.A0L
            boolean r0 = r3.A00
            if (r0 != 0) goto L_0x000f
            r3.A00 = r4
            X.4FS r1 = r3.A06
            r0 = 9
            X.C117155rT.A00(r1, r3, r2, r0)
            return
        L_0x009f:
            com.whatsapp.TextEmojiLabel r0 = r2.A0F
            r0.setText(r5)
            goto L_0x008d
        L_0x00a5:
            boolean r8 = r2.A07()
            if (r8 == 0) goto L_0x00d7
            X.5YB r7 = r2.A0G
            if (r7 == 0) goto L_0x00d7
            X.3ZH r0 = r2.A0L
            java.lang.String r6 = r0.A0L()
            X.07r r3 = r2.A0U
            X.5YB r0 = r2.A0G
            com.whatsapp.TextEmojiLabel r0 = r0.A02
            android.text.TextPaint r1 = r0.getPaint()
            X.5Y0 r0 = r2.A0n
            java.lang.CharSequence r1 = X.C107345b9.A03(r3, r1, r0, r6)
            com.whatsapp.TextEmojiLabel r0 = r7.A02
            r0.setText(r1)
            X.3ZH r0 = r2.A0L
            boolean r0 = r0.A0P()
            if (r0 == 0) goto L_0x00d7
            X.5YB r0 = r2.A0G
            r0.A06(r4)
        L_0x00d7:
            X.2sr r1 = r2.A0D
            X.3ZH r0 = r2.A0L
            boolean r0 = X.C56972sr.A08(r1, r0)
            if (r0 == 0) goto L_0x00ea
            X.1VX r0 = r2.A0o
            boolean r0 = X.C86644Kx.A1Z(r0)
            r3 = 1
            if (r0 != 0) goto L_0x00eb
        L_0x00ea:
            r3 = 0
        L_0x00eb:
            X.3ZH r0 = r2.A0L
            boolean r0 = r0.A0j
            if (r0 == 0) goto L_0x00fa
            com.whatsapp.TextEmojiLabel r2 = r2.A0F
            r0 = 2131895578(0x7f12251a, float:1.9425993E38)
        L_0x00f6:
            r2.setText(r0)
            return
        L_0x00fa:
            boolean r0 = r2.A0H()
            if (r0 == 0) goto L_0x0119
            r2.A0F(r10)
            com.whatsapp.TextEmojiLabel r0 = r2.A0F
            r0.setVisibility(r10)
            X.5rC r1 = r2.A0B
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x000f
            com.whatsapp.TextEmojiLabel r2 = r2.A0F
            r1.A04()
            r0 = 2131886931(0x7f120353, float:1.9408455E38)
            goto L_0x00f6
        L_0x0119:
            X.1VX r11 = r2.A0o
            boolean r0 = X.AnonymousClass75P.A00(r11)
            if (r0 == 0) goto L_0x017d
            X.3ZH r0 = r2.A0L
            boolean r0 = r0.A0T()
            if (r0 == 0) goto L_0x017d
            r2.A0F(r10)
            com.whatsapp.TextEmojiLabel r0 = r2.A0F
            r0.setVisibility(r10)
            r3 = 2131886979(0x7f120383, float:1.9408552E38)
            X.3ZH r0 = r2.A0L
            java.lang.String r5 = r0.A0L()
            X.3ZH r0 = r2.A0L
            boolean r0 = r0.A0Q()
            if (r0 == 0) goto L_0x01b8
            X.3ZH r0 = r2.A0L
            java.lang.String r0 = r0.A0J()
            if (r0 == 0) goto L_0x01b8
            android.widget.TextView r1 = r2.A0D
            X.3ZH r0 = r2.A0L
            java.lang.String r0 = r0.A0J()
            r1.setText(r0)
            if (r5 == 0) goto L_0x016b
            com.whatsapp.TextEmojiLabel r0 = r2.A0F
            r0.setText(r3)
            com.whatsapp.TextEmojiLabel r3 = r2.A0F
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = " · "
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r5, r1)
            r3.append(r0)
        L_0x016b:
            int r1 = X.AnonymousClass29N.A00(r11)
            X.3ZH r0 = r2.A0L
            boolean r0 = r0.A0V()
            if (r0 == 0) goto L_0x000f
            com.whatsapp.TextEmojiLabel r0 = r2.A0F
            r0.setCompoundDrawablesWithIntrinsicBounds(r10, r10, r1, r10)
            return
        L_0x017d:
            X.3ZH r1 = r2.A0L
            X.C18260x0.A0O(r11, r1)
            r0 = 4873(0x1309, float:6.829E-42)
            boolean r0 = r11.A0X(r0)
            if (r0 == 0) goto L_0x01a7
            boolean r0 = r1.A0S()
            if (r0 == 0) goto L_0x01a7
            X.2mu r0 = r2.A0K
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x01a7
            r2.A0F(r10)
            com.whatsapp.TextEmojiLabel r0 = r2.A0F
            r0.setVisibility(r10)
            com.whatsapp.TextEmojiLabel r2 = r2.A0F
            r0 = 2131886972(0x7f12037c, float:1.9408538E38)
            goto L_0x00f6
        L_0x01a7:
            if (r3 == 0) goto L_0x01d0
            r2.A0F(r10)
            com.whatsapp.TextEmojiLabel r0 = r2.A0F
            r0.setVisibility(r10)
            com.whatsapp.TextEmojiLabel r2 = r2.A0F
            r0 = 2131890783(0x7f12125f, float:1.9416268E38)
            goto L_0x00f6
        L_0x01b8:
            android.widget.TextView r0 = r2.A0D
            r0.setText(r5)
            com.whatsapp.TextEmojiLabel r0 = r2.A0F
            r0.setText(r3)
            X.3ZH r0 = r2.A0L
            boolean r0 = r0.A0V()
            if (r0 == 0) goto L_0x000f
            X.5YB r0 = r2.A0H
            r0.A06(r4)
            return
        L_0x01d0:
            r2.A04()
            java.lang.Object r6 = r5.second
            java.lang.String r6 = (java.lang.String) r6
            boolean r0 = X.C107575bX.A0F(r6)
            r3 = 8
            if (r0 != 0) goto L_0x02d5
            r2.A0F(r10)
            com.whatsapp.TextEmojiLabel r0 = r2.A0F
            r0.setVisibility(r10)
            android.widget.TextView r1 = r2.A0C
            int r0 = X.AnonymousClass001.A08(r8)
            r1.setVisibility(r0)
            android.view.View r1 = r2.A02
            int r0 = X.AnonymousClass001.A08(r8)
            r1.setVisibility(r0)
            android.view.View r0 = r2.A04
            if (r0 == 0) goto L_0x0201
            int r10 = r0.getWidth()
        L_0x0201:
            if (r8 == 0) goto L_0x02af
            if (r10 == 0) goto L_0x02af
            android.widget.TextView r0 = r2.A0C
            android.text.TextPaint r1 = r0.getPaint()
            java.lang.String r0 = "•"
            float r0 = r1.measureText(r0)
            double r0 = (double) r0
            double r0 = java.lang.Math.ceil(r0)
            int r7 = (int) r0
            android.widget.TextView r0 = r2.A0C
            int r9 = X.C86664Kz.A0F(r0, r7)
            android.widget.TextView r0 = r2.A0C
            int r0 = r0.getPaddingRight()
            int r9 = r9 + r0
            int r8 = X.AnonymousClass29N.A00(r11)
            X.5YB r0 = r2.A0G
            com.whatsapp.TextEmojiLabel r0 = r0.A02
            android.text.TextPaint r1 = r0.getPaint()
            X.3ZH r0 = r2.A0L
            java.lang.String r0 = r0.A0L()
            float r0 = r1.measureText(r0)
            double r0 = (double) r0
            double r0 = java.lang.Math.ceil(r0)
            int r7 = (int) r0
            X.07r r1 = r2.A0U
            android.content.res.Resources r0 = r1.getResources()
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r8)
            int r0 = r0.getIntrinsicWidth()
            int r7 = r7 + r0
            android.content.res.Resources r1 = r1.getResources()
            r0 = 2131168532(0x7f070d14, float:1.7951368E38)
            int r0 = X.C86654Ky.A02(r1, r0, r7)
            int r0 = r0 + r9
            int r8 = r10 - r0
        L_0x025d:
            r0 = 6172(0x181c, float:8.649E-42)
            boolean r0 = r11.A0X(r0)
            if (r0 == 0) goto L_0x0272
            X.3ZH r7 = r2.A0L
            X.2sH r1 = r2.A0F
            X.07r r0 = r2.A0U
            java.lang.String r1 = X.AnonymousClass31U.A01(r0, r1, r7)
            r0 = 1
            if (r1 != 0) goto L_0x0273
        L_0x0272:
            r0 = 0
        L_0x0273:
            r2.A07 = r0
            com.whatsapp.TextEmojiLabel r0 = r2.A0F
            android.text.TextPaint r0 = r0.getPaint()
            float r1 = r0.measureText(r6)
            r7 = 5
            if (r8 == 0) goto L_0x02b1
            float r0 = (float) r8
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x02b1
            X.3cZ r0 = r2.A03
            if (r0 != 0) goto L_0x02f7
            com.whatsapp.TextEmojiLabel r0 = r2.A0F
            r0.setText(r6)
            X.2sH r4 = r2.A0F
            X.2nK r3 = r2.A0V
            X.5ZU r1 = r2.A0h
            X.33j r0 = r2.A0j
            r17 = 4
            X.3cZ r10 = new X.3cZ
            r15 = r1
            r16 = r0
            r12 = r3
            r13 = r2
            r14 = r4
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            r2.A03 = r10
            X.3Wi r2 = r2.A0W
            r0 = 1500(0x5dc, double:7.41E-321)
            r2.A0T(r10, r0)
            return
        L_0x02af:
            r8 = r10
            goto L_0x025d
        L_0x02b1:
            X.3cZ r1 = r2.A03
            if (r1 == 0) goto L_0x02ba
            X.3Wi r0 = r2.A0W
            r0.A0R(r1)
        L_0x02ba:
            com.whatsapp.TextEmojiLabel r0 = r2.A0F
            r0.setText(r6)
            boolean r0 = r2.A07
            if (r0 == 0) goto L_0x000f
            int r0 = X.C18280x3.A03(r5)
            if (r0 == r7) goto L_0x000f
            android.os.Handler r3 = r2.A01
            if (r3 == 0) goto L_0x000f
            java.lang.Runnable r2 = r2.A06
            r0 = 2500(0x9c4, double:1.235E-320)
            r3.postDelayed(r2, r0)
            return
        L_0x02d5:
            com.whatsapp.TextEmojiLabel r0 = r2.A0F
            r0.setVisibility(r3)
            android.widget.TextView r0 = r2.A0C
            r0.setVisibility(r3)
            if (r8 == 0) goto L_0x02f3
            r2.A0F(r10)
            android.view.View r0 = r2.A02
            r0.setVisibility(r10)
        L_0x02e9:
            X.3cZ r1 = r2.A03
            if (r1 == 0) goto L_0x000f
            X.3Wi r0 = r2.A0W
            r0.A0R(r1)
            return
        L_0x02f3:
            r2.A0F(r3)
            goto L_0x02e9
        L_0x02f7:
            boolean r0 = r2.A0S
            if (r0 == 0) goto L_0x0325
            float r0 = (float) r10
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x031f
            int r0 = X.C18280x3.A03(r5)
            if (r0 == r7) goto L_0x031f
            X.2nK r1 = r2.A0V
            X.3ZH r0 = r2.A0L
            java.lang.String r1 = r1.A02(r0)
            if (r1 == 0) goto L_0x0311
            r4 = 0
        L_0x0311:
            com.whatsapp.TextEmojiLabel r0 = r2.A0F
            if (r4 == 0) goto L_0x0316
            r1 = r6
        L_0x0316:
            r0.setText(r1)
        L_0x0319:
            android.view.View r0 = r2.A02
            r0.setVisibility(r3)
            return
        L_0x031f:
            com.whatsapp.TextEmojiLabel r0 = r2.A0F
            r0.setText(r6)
            goto L_0x0319
        L_0x0325:
            com.whatsapp.TextEmojiLabel r0 = r2.A0F
            r0.setText(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92144mA.A02():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007b, code lost:
        if (r0 >= 0) goto L_0x007d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.util.Pair A0C() {
        /*
            r15 = this;
            X.2sH r3 = r15.A0F
            long r13 = java.lang.System.currentTimeMillis()
            java.lang.Integer r2 = X.C18290x4.A0Z()
            r0 = 0
            android.util.Pair r8 = X.AnonymousClass0x9.A0C(r2, r0)
            java.lang.Object r0 = r8.second
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = X.C107575bX.A0F(r0)
            r12 = r0 ^ 1
            r10 = 5000(0x1388, double:2.4703E-320)
            if (r12 == 0) goto L_0x0025
            long r0 = r15.A00
            long r4 = r13 - r0
            int r0 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r0 < 0) goto L_0x00dd
        L_0x0025:
            X.3LP r0 = r15.A0H
            X.4uZ r1 = r15.A0r
            boolean r0 = X.C57362tW.A00(r0, r1)
            if (r0 != 0) goto L_0x00ba
            X.1VX r0 = r15.A0o
            boolean r0 = X.C616831v.A00(r0, r1)
            if (r0 != 0) goto L_0x00ba
            X.3ZH r0 = r15.A0L
            boolean r0 = r0.A0R()
            r1 = 0
            if (r0 == 0) goto L_0x004d
            java.lang.Integer r2 = X.C18290x4.A0a()
            X.07r r1 = r15.A0U
            r0 = 2131888258(0x7f120882, float:1.9411146E38)
            java.lang.String r1 = r1.getString(r0)
        L_0x004d:
            android.util.Pair r8 = X.AnonymousClass0x9.A0C(r2, r1)
            java.lang.Object r0 = r8.second
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = X.C107575bX.A0F(r0)
            r9 = r0 ^ 1
            java.lang.Integer r2 = X.C18290x4.A0b()
            X.2nK r1 = r15.A0V
            X.3ZH r0 = r15.A0L
            java.lang.String r0 = r1.A00(r0)
            android.util.Pair r2 = X.AnonymousClass0x9.A0C(r2, r0)
            boolean r0 = r15.A07
            if (r0 == 0) goto L_0x00c8
            r6 = 2500(0x9c4, double:1.235E-320)
            if (r9 == 0) goto L_0x007d
            long r0 = r15.A00
            long r4 = r13 - r0
            if (r12 != 0) goto L_0x00b7
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
        L_0x007b:
            if (r0 < 0) goto L_0x00dd
        L_0x007d:
            java.lang.Object r1 = r2.second
            java.lang.String r1 = (java.lang.String) r1
            X.07r r4 = r15.A0U
            r0 = 2131888259(0x7f120883, float:1.9411148E38)
            java.lang.String r0 = r4.getString(r0)
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00dc
            java.lang.Object r0 = r2.second
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = X.C18320x8.A1U(r0)
            if (r0 == 0) goto L_0x00b4
            if (r9 != 0) goto L_0x009e
            if (r12 == 0) goto L_0x00b4
        L_0x009e:
            long r0 = r15.A00
            long r13 = r13 - r0
            int r0 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r0 < 0) goto L_0x00dc
            X.3ZH r0 = r15.A0L
            java.lang.String r1 = X.AnonymousClass31U.A01(r4, r3, r0)
            java.lang.Integer r0 = X.C18290x4.A0c()
            android.util.Pair r0 = X.AnonymousClass0x9.A0C(r0, r1)
            return r0
        L_0x00b4:
            r10 = 2500(0x9c4, double:1.235E-320)
            goto L_0x009e
        L_0x00b7:
            int r0 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            goto L_0x007b
        L_0x00ba:
            java.lang.Integer r2 = X.C18280x3.A0S()
            X.07r r1 = r15.A0U
            r0 = 2131895455(0x7f12249f, float:1.9425743E38)
            java.lang.String r1 = X.AnonymousClass1RT.A00(r1, r0)
            goto L_0x004d
        L_0x00c8:
            if (r9 == 0) goto L_0x00dc
            int r1 = X.C18280x3.A03(r8)
            r0 = 2
            if (r1 == r0) goto L_0x00dd
            long r0 = r15.A00
            long r13 = r13 - r0
            if (r12 == 0) goto L_0x00d8
            r10 = 10000(0x2710, double:4.9407E-320)
        L_0x00d8:
            int r0 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r0 < 0) goto L_0x00dd
        L_0x00dc:
            return r2
        L_0x00dd:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92144mA.A0C():android.util.Pair");
    }

    public final void A0D() {
        C55502qS A002;
        if (this.A02 != null) {
            if (this.A0o.A0X(5869) && (A002 = ((C56422rx) this.A0N.get()).A00(AnonymousClass3ZH.A07(this.A0L))) != null && A002.A01 == 2) {
                C95814uZ r1 = this.A0r;
                C162457s7.A0J(r1, 0);
                this.A0W.A0S(new C71703cX(24, (Object) this, ((C61242zw) this.A0M.get()).A03(r1)));
            }
            if (((C54032o4) this.A0L.get()).A01(AnonymousClass3ZH.A07(this.A0L), this.A0L.A0R())) {
                this.A0W.A0S(new C69973Zj(this, 47));
            }
        }
    }

    public final void A0E() {
        C139986sy r0;
        boolean z = true;
        int i = 0;
        if (this.A0R) {
            C95814uZ r1 = (C95814uZ) AnonymousClass3ZH.A03(this.A0L);
            if (r1 == null || this.A0G.A04(r1) <= 0) {
                z = false;
            }
            WDSProfilePhoto wDSProfilePhoto = (WDSProfilePhoto) this.A0A;
            if (z) {
                r0 = new C139986sy();
            } else {
                r0 = null;
            }
            wDSProfilePhoto.setProfileBadge(r0);
        } else if (this.A0I != null) {
            C95814uZ r12 = (C95814uZ) AnonymousClass3ZH.A03(this.A0L);
            if (r12 == null || this.A0G.A04(r12) <= 0) {
                z = false;
            }
            WaImageView waImageView = this.A0I;
            if (!z) {
                i = 8;
            }
            waImageView.setVisibility(i);
            if (z) {
                this.A0I.setImageResource(R.drawable.ic_ephemeral_v2);
            }
        }
    }

    public final void A0F(int i) {
        View view = this.A04;
        if (view != null) {
            view.setVisibility(i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0031, code lost:
        if (r2 != 10) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0G(android.app.Activity r7) {
        /*
            r6 = this;
            boolean r0 = r6.A0R
            if (r0 != 0) goto L_0x006a
            r1 = 2131434443(0x7f0b1bcb, float:1.84907E38)
            X.07r r0 = r6.A0U
            android.view.View r1 = r0.findViewById(r1)
            X.5MG r0 = r6.A0Z
            android.os.Bundle r3 = X.AnonymousClass5MG.A00(r7, r1, r0)
        L_0x0013:
            X.3ZH r0 = r6.A0L
            com.whatsapp.jid.UserJid r4 = X.C86604Kt.A0d(r0)
            android.content.Intent r1 = r7.getIntent()
            java.lang.String r0 = "mat_entry_point"
            int r2 = X.C18320x8.A01(r1, r0)
            X.1VX r5 = r6.A0o
            r0 = 5431(0x1537, float:7.61E-42)
            boolean r0 = r5.A0X(r0)
            if (r0 == 0) goto L_0x0033
            r1 = 10
            r0 = 26
            if (r2 == r1) goto L_0x0034
        L_0x0033:
            r0 = 2
        L_0x0034:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            boolean r0 = r6.A0R
            r1 = r0 ^ 1
            boolean r0 = r6.A0H()
            if (r0 != 0) goto L_0x0050
            boolean r0 = X.AnonymousClass75P.A00(r5)
            if (r0 == 0) goto L_0x0068
            X.3ZH r0 = r6.A0L
            boolean r0 = r0.A0T()
            if (r0 == 0) goto L_0x0068
        L_0x0050:
            r0 = 1
        L_0x0051:
            android.content.Intent r0 = X.C627736r.A0l(r7, r4, r2, r1, r0)
            X.AnonymousClass0RN.A00(r7, r0, r3)
            X.2hn r2 = r6.A0k
            if (r2 == 0) goto L_0x0067
            X.4uZ r0 = r6.A0r
            com.whatsapp.jid.UserJid r1 = X.AnonymousClass32Y.A03(r0)
            r0 = 11
            r2.A01(r1, r0)
        L_0x0067:
            return
        L_0x0068:
            r0 = 0
            goto L_0x0051
        L_0x006a:
            r3 = 0
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92144mA.A0G(android.app.Activity):void");
    }

    public final boolean A0H() {
        C116985rC r1 = this.A0B;
        if (!r1.A07() || !C116985rC.A03(r1).BH2(this.A0L.A0H)) {
            return false;
        }
        return true;
    }

    public void onActivityDestroyed(Activity activity) {
        Runnable runnable;
        Handler handler = this.A01;
        if (!(handler == null || (runnable = this.A06) == null)) {
            handler.removeCallbacks(runnable);
        }
        super.onActivityDestroyed(activity);
    }

    public void A09() {
        super.A09();
        C116985rC r3 = this.A0B;
        if (r3.A07()) {
            if (!A0H()) {
                AnonymousClass1VX r2 = this.A0o;
                AnonymousClass3ZH r1 = this.A0L;
                C18260x0.A0O(r2, r1);
                if (!r2.A0X(4873) || !r1.A0S() || !this.A0K.A02()) {
                    return;
                }
            }
            C116985rC.A03(r3).AxS(this.A0F, AnonymousClass5Yj.A02(this.A0U, R.attr.f3nameremoved, R.color.f5nameremoved), true);
        }
    }

    public void A0A(Activity activity) {
        super.A0A(activity);
        this.A02 = C86664Kz.A0n(this.A05, R.id.data_disclosure_status);
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        super.onActivityCreated(activity, bundle);
        C15940sD r3 = this.A0A;
        ConversationTitleViewModel conversationTitleViewModel = (ConversationTitleViewModel) AnonymousClass0x9.A0H(r3).A01(ConversationTitleViewModel.class);
        this.A04 = conversationTitleViewModel;
        AnonymousClass08M r1 = conversationTitleViewModel.A01;
        C15910sA r5 = this.A09;
        AnonymousClass6C6.A02(r5, r1, this, 169);
        ConversationTitleViewModel conversationTitleViewModel2 = this.A04;
        C95814uZ r2 = this.A0r;
        conversationTitleViewModel2.A01.A0H(new AnonymousClass74O());
        if (this.A0J.A00.A0X(6210) && this.A0R) {
            UserJid A032 = AnonymousClass32Y.A03(r2);
            if (A032 == null) {
                Log.e("UserJid should not be null");
            } else {
                AnonymousClass5FA r22 = this.A0C;
                C162457s7.A0J(r22, 0);
                this.A05 = C110565gf.A00(r3, r22, true);
                r5.getLifecycle().A00(this.A05);
                StatusesViewModel statusesViewModel = this.A05;
                AnonymousClass6C6.A02(r5, C05110Rz.A00(new C124096Ay(statusesViewModel, 1, A032), statusesViewModel.A04), this, 170);
            }
        }
        A06(new C109465ef(this, 44, activity));
        C107295b4.A03(this.A06, R.string.f11nameremoved);
        A0E();
    }
}
