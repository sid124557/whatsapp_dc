package X;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.CircularProgressBar;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaDynamicRoundCornerImageView;
import com.whatsapp.WaImageView;
import com.whatsapp.calling.callgrid.view.VoiceParticipantAudioWave;
import com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.jid.UserJid;
import java.util.Map;

/* renamed from: X.4j8  reason: invalid class name and case insensitive filesystem */
public class C91224j8 extends AnonymousClass4Z7 {
    public int A00;
    public ValueAnimator A01;
    public CircularProgressBar A02;
    public AnonymousClass5MO A03;
    public AnonymousClass5UY A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final View A0A;
    public final View A0B;
    public final ViewGroup A0C;
    public final ViewGroup A0D;
    public final ViewGroup A0E;
    public final TextView A0F;
    public final TextEmojiLabel A0G;
    public final AnonymousClass5YB A0H;
    public final WaDynamicRoundCornerImageView A0I;
    public final WaImageView A0J;
    public final WaImageView A0K;
    public final AnonymousClass5O4 A0L;
    public final VoiceParticipantAudioWave A0M;
    public final ThumbnailButton A0N;
    public final ThumbnailButton A0O;
    public final C620733j A0P;
    public final AnonymousClass1VX A0Q;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C91224j8(android.view.View r16, X.AnonymousClass64J r17, X.AnonymousClass30B r18, X.AnonymousClass7D2 r19, com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r20, X.AnonymousClass5UX r21, X.AnonymousClass5ZU r22, X.C620733j r23, X.AnonymousClass1VX r24) {
        /*
            r15 = this;
            r8 = r15
            r9 = r16
            r10 = r18
            r11 = r19
            r12 = r20
            r13 = r21
            r14 = r22
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r0 = r24
            r15.A0Q = r0
            r0 = r23
            r15.A0P = r0
            r0 = 2131427761(0x7f0b01b1, float:1.8477147E38)
            android.view.ViewGroup r0 = X.C86644Kx.A0I(r9, r0)
            r15.A0C = r0
            r1 = 2131427763(0x7f0b01b3, float:1.8477151E38)
            com.whatsapp.TextEmojiLabel r0 = X.C86644Kx.A0M(r9, r1)
            r15.A0G = r0
            r3 = 0
            if (r0 == 0) goto L_0x016b
            r0 = r17
            X.5YB r0 = X.AnonymousClass5YB.A00(r9, r0, r1)
            r15.A0H = r0
        L_0x0035:
            r0 = 2131427764(0x7f0b01b4, float:1.8477153E38)
            com.whatsapp.components.button.ThumbnailButton r5 = X.C86664Kz.A16(r9, r0)
            r15.A0N = r5
            r0 = 2131427765(0x7f0b01b5, float:1.8477155E38)
            android.view.View r0 = r9.findViewById(r0)
            com.whatsapp.calling.callgrid.view.VoiceParticipantAudioWave r0 = (com.whatsapp.calling.callgrid.view.VoiceParticipantAudioWave) r0
            r15.A0M = r0
            r0 = 2131431626(0x7f0b10ca, float:1.8484987E38)
            com.whatsapp.WaImageView r0 = X.C86664Kz.A11(r9, r0)
            r15.A0J = r0
            r0 = 2131434272(0x7f0b1b20, float:1.8490353E38)
            com.whatsapp.WaImageView r0 = X.C86664Kz.A11(r9, r0)
            r15.A0K = r0
            r0 = 2131428414(0x7f0b043e, float:1.8478472E38)
            android.view.View r0 = r9.findViewById(r0)
            com.whatsapp.WaDynamicRoundCornerImageView r0 = (com.whatsapp.WaDynamicRoundCornerImageView) r0
            r15.A0I = r0
            r0 = 2131429259(0x7f0b078b, float:1.8480186E38)
            android.view.View r0 = r9.findViewById(r0)
            r15.A0A = r0
            r0 = 2131433889(0x7f0b19a1, float:1.8489576E38)
            android.view.ViewGroup r1 = X.C86644Kx.A0J(r9, r0)
            r15.A0E = r1
            r0 = 2131432444(0x7f0b13fc, float:1.8486646E38)
            android.view.ViewGroup r0 = X.C86644Kx.A0J(r9, r0)
            r15.A0D = r0
            r0 = 2131432445(0x7f0b13fd, float:1.8486648E38)
            android.view.View r4 = r9.findViewById(r0)
            com.whatsapp.components.button.ThumbnailButton r4 = (com.whatsapp.components.button.ThumbnailButton) r4
            r15.A0O = r4
            r0 = r3
            if (r1 == 0) goto L_0x0096
            r0 = 2131433880(0x7f0b1998, float:1.8489558E38)
            android.widget.TextView r0 = X.AnonymousClass002.A09(r1, r0)
        L_0x0096:
            r15.A0F = r0
            r0 = 2131433829(0x7f0b1965, float:1.8489455E38)
            android.view.View r7 = r9.findViewById(r0)
            r15.A0B = r7
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131168572(0x7f070d3c, float:1.795145E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r15.A06 = r0
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131168574(0x7f070d3e, float:1.7951454E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r15.A08 = r0
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131165540(0x7f070164, float:1.79453E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r15.A01 = r0
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131168573(0x7f070d3d, float:1.7951452E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r15.A07 = r0
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131168575(0x7f070d3f, float:1.7951456E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r15.A09 = r0
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131168606(0x7f070d5e, float:1.7951519E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r15.A05 = r0
            android.content.res.Resources$Theme r2 = X.C86614Ku.A0C(r9)
            android.util.TypedValue r6 = X.AnonymousClass4L0.A0B()
            r0 = 2130968848(0x7f040110, float:1.7546361E38)
            r1 = 1
            r2.resolveAttribute(r0, r6, r1)
            int r0 = r6.resourceId
            if (r0 != 0) goto L_0x0103
            r1 = 0
        L_0x0103:
            X.C626936e.A0B(r1)
            if (r7 == 0) goto L_0x011d
            android.graphics.drawable.Drawable r2 = r7.getBackground()
            android.graphics.drawable.GradientDrawable r2 = (android.graphics.drawable.GradientDrawable) r2
            if (r2 == 0) goto L_0x011d
            android.content.res.Resources r1 = r9.getResources()
            int r0 = r6.resourceId
            float r0 = X.C86664Kz.A01(r1, r0)
            r2.setCornerRadius(r0)
        L_0x011d:
            r7 = r9
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            java.util.ArrayList r6 = X.AnonymousClass001.A0s()
            android.view.ViewGroup r0 = r15.A0C
            r6.add(r0)
            com.whatsapp.WaDynamicRoundCornerImageView r0 = r15.A0I
            if (r0 == 0) goto L_0x0130
            r6.add(r0)
        L_0x0130:
            android.view.ViewGroup r2 = r15.A0D
            if (r2 == 0) goto L_0x0140
            X.1VX r0 = r15.A0Q
            int r1 = X.C86664Kz.A0J(r0)
            r0 = 3
            if (r1 < r0) goto L_0x0140
            r6.add(r2)
        L_0x0140:
            X.5O4 r0 = new X.5O4
            r0.<init>(r7, r6)
            r15.A0L = r0
            android.util.DisplayMetrics r0 = X.C86614Ku.A0E(r9)
            int r0 = r0.widthPixels
            float r1 = (float) r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 + r0
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r0
            r5.A02 = r1
            if (r4 == 0) goto L_0x015a
            r4.A02 = r1
        L_0x015a:
            r0 = 2131429181(0x7f0b073d, float:1.8480027E38)
            android.view.View r0 = r9.findViewById(r0)
            if (r0 == 0) goto L_0x0168
            X.5UY r3 = new X.5UY
            r3.<init>(r0)
        L_0x0168:
            r15.A04 = r3
            return
        L_0x016b:
            r15.A0H = r3
            goto L_0x0035
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C91224j8.<init>(android.view.View, X.64J, X.30B, X.7D2, com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel, X.5UX, X.5ZU, X.33j, X.1VX):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a6, code lost:
        if (r0 != false) goto L_0x00a8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0A(int r9) {
        /*
            r8 = this;
            int r0 = r8.A02
            if (r9 == r0) goto L_0x003e
            r8.A02 = r9
            boolean r0 = r8 instanceof X.C91194j5
            if (r0 == 0) goto L_0x019c
            X.5Tw r0 = r8.A07
            if (r0 == 0) goto L_0x0034
            com.whatsapp.components.button.ThumbnailButton r3 = r8.A0N
            android.content.res.Resources r2 = X.C18290x4.A0G(r3)
            int r0 = r8.A02
            switch(r0) {
                case 4: goto L_0x018e;
                case 5: goto L_0x018e;
                case 6: goto L_0x0180;
                case 7: goto L_0x0180;
                case 8: goto L_0x0180;
                case 9: goto L_0x017b;
                default: goto L_0x0019;
            }
        L_0x0019:
            X.5Tw r0 = r8.A07
            boolean r0 = r0.A0K
            r1 = 2131168624(0x7f070d70, float:1.7951555E38)
            if (r0 == 0) goto L_0x0025
            r1 = 2131168654(0x7f070d8e, float:1.7951616E38)
        L_0x0025:
            int r1 = r2.getDimensionPixelSize(r1)
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            r0.height = r1
            r0.width = r1
            r3.setLayoutParams(r0)
        L_0x0034:
            r0 = 0
            com.whatsapp.calling.callgrid.view.VoiceParticipantAudioWave r2 = r8.A0M
            if (r2 == 0) goto L_0x003e
            float r1 = (float) r0
            r0 = 1
            r2.A02(r1, r0)
        L_0x003e:
            r5 = r8
            boolean r0 = r8 instanceof X.C91194j5
            if (r0 == 0) goto L_0x0141
            X.4j5 r5 = (X.C91194j5) r5
            X.5Tw r0 = r5.A07
            if (r0 == 0) goto L_0x00df
            com.whatsapp.TextEmojiLabel r4 = r5.A0G
            android.content.res.Resources r2 = X.C18290x4.A0G(r4)
            int r1 = r5.A02
            r0 = 4
            if (r1 == r0) goto L_0x0138
            r0 = 5
            if (r1 == r0) goto L_0x0138
            X.5Tw r0 = r5.A07
            boolean r1 = r0.A0K
            r0 = 2131168618(0x7f070d6a, float:1.7951543E38)
        L_0x005e:
            if (r1 == 0) goto L_0x0063
            r0 = 2131168648(0x7f070d88, float:1.7951604E38)
        L_0x0063:
            int r0 = r2.getDimensionPixelSize(r0)
            r3 = 0
            float r0 = (float) r0
            r4.setTextSize(r3, r0)
            X.5Tw r0 = r5.A07
            if (r0 == 0) goto L_0x00df
            com.whatsapp.components.button.ThumbnailButton r0 = r5.A0N
            android.content.res.Resources r2 = X.C18290x4.A0G(r0)
            int r7 = r5.A02
            r0 = 4
            if (r7 == r0) goto L_0x0113
            r0 = 5
            if (r7 == r0) goto L_0x0113
            r0 = 6
            if (r7 == r0) goto L_0x00ef
            r0 = 7
            if (r7 == r0) goto L_0x00ef
            r1 = 9
            r0 = 2131168616(0x7f070d68, float:1.7951539E38)
            int r6 = r2.getDimensionPixelSize(r0)
            if (r7 == r1) goto L_0x00e7
            X.5Tw r0 = r5.A07
            boolean r1 = r0.A0K
            r0 = 2131168621(0x7f070d6d, float:1.795155E38)
            if (r1 == 0) goto L_0x009b
            r0 = 2131168651(0x7f070d8b, float:1.795161E38)
        L_0x009b:
            int r7 = r2.getDimensionPixelSize(r0)
            X.5Tw r0 = r5.A07
            boolean r0 = r0.A0K
            r1 = 2131168613(0x7f070d65, float:1.7951533E38)
            if (r0 == 0) goto L_0x00ab
        L_0x00a8:
            r1 = 2131168647(0x7f070d87, float:1.7951602E38)
        L_0x00ab:
            int r2 = r2.getDimensionPixelSize(r1)
            android.view.ViewGroup$MarginLayoutParams r0 = X.AnonymousClass001.A0T(r4)
            r0.setMargins(r3, r7, r3, r3)
            r0.height = r6
            r4.setLayoutParams(r0)
            android.widget.TextView r1 = r5.A00
            android.view.ViewGroup$MarginLayoutParams r0 = X.AnonymousClass001.A0T(r1)
            r0.setMargins(r3, r2, r3, r3)
            r1.setLayoutParams(r0)
            android.widget.TextView r1 = r5.A01
            android.view.ViewGroup$MarginLayoutParams r0 = X.AnonymousClass001.A0T(r1)
            r0.setMargins(r3, r2, r3, r3)
            r1.setLayoutParams(r0)
            com.whatsapp.calling.callgrid.view.VoiceParticipantAudioWave r1 = r5.A0M
            android.view.ViewGroup$MarginLayoutParams r0 = X.AnonymousClass001.A0T(r1)
            r0.setMargins(r3, r2, r3, r3)
            r1.setLayoutParams(r0)
        L_0x00df:
            android.view.ViewGroup r1 = r8.A0E
            android.widget.TextView r0 = r8.A0F
            r8.A0D(r1, r0)
            return
        L_0x00e7:
            r0 = 2131168651(0x7f070d8b, float:1.795161E38)
            int r7 = r2.getDimensionPixelSize(r0)
            goto L_0x00a8
        L_0x00ef:
            r0 = 2131168615(0x7f070d67, float:1.7951537E38)
            int r6 = r2.getDimensionPixelSize(r0)
            X.5Tw r0 = r5.A07
            boolean r1 = r0.A0K
            r0 = 2131168620(0x7f070d6c, float:1.7951547E38)
            if (r1 == 0) goto L_0x0102
            r0 = 2131168650(0x7f070d8a, float:1.7951608E38)
        L_0x0102:
            int r7 = r2.getDimensionPixelSize(r0)
            X.5Tw r0 = r5.A07
            boolean r0 = r0.A0K
            r1 = 2131168612(0x7f070d64, float:1.795153E38)
            if (r0 == 0) goto L_0x00ab
            r1 = 2131168646(0x7f070d86, float:1.79516E38)
            goto L_0x00ab
        L_0x0113:
            r0 = 2131168614(0x7f070d66, float:1.7951535E38)
            int r6 = r2.getDimensionPixelSize(r0)
            X.5Tw r0 = r5.A07
            boolean r1 = r0.A0K
            r0 = 2131168619(0x7f070d6b, float:1.7951545E38)
            if (r1 == 0) goto L_0x0126
            r0 = 2131168649(0x7f070d89, float:1.7951606E38)
        L_0x0126:
            int r7 = r2.getDimensionPixelSize(r0)
            X.5Tw r0 = r5.A07
            boolean r0 = r0.A0K
            r1 = 2131168611(0x7f070d63, float:1.7951529E38)
            if (r0 == 0) goto L_0x00ab
            r1 = 2131168645(0x7f070d85, float:1.7951598E38)
            goto L_0x00ab
        L_0x0138:
            X.5Tw r0 = r5.A07
            boolean r1 = r0.A0K
            r0 = 2131168617(0x7f070d69, float:1.795154E38)
            goto L_0x005e
        L_0x0141:
            com.whatsapp.TextEmojiLabel r3 = r8.A0G
            if (r3 == 0) goto L_0x00df
            int r1 = r8.A02
            if (r1 == 0) goto L_0x00df
            int r4 = r8.A09
            r0 = 1
            if (r1 == r0) goto L_0x0151
            r0 = 3
            if (r1 != r0) goto L_0x016a
        L_0x0151:
            android.view.View r0 = r8.A0H
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            int r2 = r0.height
            int r0 = r8.A05
            int r2 = r2 - r0
            if (r2 <= 0) goto L_0x0171
            float r1 = (float) r2
            r0 = 1042536202(0x3e23d70a, float:0.16)
            float r1 = r1 * r0
            int r1 = (int) r1
            int r0 = r8.A07
            int r4 = java.lang.Math.min(r1, r0)
        L_0x016a:
            r1 = 0
            float r0 = (float) r4
            r3.setTextSize(r1, r0)
            goto L_0x00df
        L_0x0171:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "VoiceParticipantViewHolder/updateParticipantNameTextSize, gridHeight <= 0: "
            X.C18260x0.A0y(r0, r1, r2)
            goto L_0x016a
        L_0x017b:
            r1 = 2131168638(0x7f070d7e, float:1.7951583E38)
            goto L_0x0025
        L_0x0180:
            X.5Tw r0 = r8.A07
            boolean r0 = r0.A0K
            r1 = 2131168623(0x7f070d6f, float:1.7951553E38)
            if (r0 == 0) goto L_0x0025
            r1 = 2131168653(0x7f070d8d, float:1.7951614E38)
            goto L_0x0025
        L_0x018e:
            X.5Tw r0 = r8.A07
            boolean r0 = r0.A0K
            r1 = 2131168622(0x7f070d6e, float:1.7951551E38)
            if (r0 == 0) goto L_0x0025
            r1 = 2131168652(0x7f070d8c, float:1.7951612E38)
            goto L_0x0025
        L_0x019c:
            r0 = 2
            r3 = 1050253722(0x3e99999a, float:0.3)
            if (r9 == r0) goto L_0x01ba
            r3 = 1051260355(0x3ea8f5c3, float:0.33)
            if (r9 == r0) goto L_0x01ba
            int r2 = r8.A06
        L_0x01a9:
            com.whatsapp.components.button.ThumbnailButton r1 = r8.A0N
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            X.02c r0 = (X.C001702c) r0
            r0.A04 = r3
            r0.A0X = r2
            r1.setLayoutParams(r0)
            goto L_0x0034
        L_0x01ba:
            int r2 = r8.A08
            goto L_0x01a9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C91224j8.A0A(int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0228, code lost:
        if (r2 != false) goto L_0x022a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0198, code lost:
        if (r0.A0D == r13.A0D) goto L_0x019a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01e2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0G(X.C105175Tw r13) {
        /*
            r12 = this;
            X.5Tw r0 = r12.A07
            r3 = 0
            if (r0 == 0) goto L_0x000f
            com.whatsapp.jid.UserJid r1 = r0.A0b
            com.whatsapp.jid.UserJid r0 = r13.A0b
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0072
        L_0x000f:
            r12.A0K(r13)
            android.view.View r4 = r12.A0H
            android.content.res.Resources r1 = r4.getResources()
            int r2 = r13.A02
            r0 = -1
            if (r2 != r0) goto L_0x0307
            r0 = 2131103222(0x7f060df6, float:1.7818904E38)
            int r1 = r1.getColor(r0)
        L_0x0024:
            r12.A00 = r1
            boolean r0 = r12 instanceof X.C91194j5
            if (r0 == 0) goto L_0x02fe
            com.whatsapp.TextEmojiLabel r2 = r12.A0G
            if (r2 == 0) goto L_0x0038
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131103222(0x7f060df6, float:1.7818904E38)
            X.C18320x8.A11(r1, r2, r0)
        L_0x0038:
            r12.A08 = r3
            android.view.View r0 = r12.A0B
            if (r0 == 0) goto L_0x004b
            android.graphics.drawable.Drawable r1 = r0.getBackground()
            android.graphics.drawable.GradientDrawable r1 = (android.graphics.drawable.GradientDrawable) r1
            int r0 = r12.A01
            if (r1 == 0) goto L_0x004b
            r1.setStroke(r0, r3)
        L_0x004b:
            r12.A0H()
            r0 = 142(0x8e, float:1.99E-43)
            X.92m r5 = X.AnonymousClass4L0.A0G(r12, r0)
            r12.A05 = r5
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r0 = r12.A06
            if (r0 == 0) goto L_0x006f
            X.7SG r4 = r0.A0Y
            com.whatsapp.jid.UserJid r2 = r13.A0b
            java.util.Map r1 = r4.A01
            boolean r0 = r1.containsKey(r2)
            if (r0 != 0) goto L_0x006a
            r0 = 0
            r1.put(r2, r0)
        L_0x006a:
            java.util.Map r0 = r4.A00
            r0.put(r2, r5)
        L_0x006f:
            r12.A0L(r13, r3)
        L_0x0072:
            android.view.View r4 = r12.A0H
            float r0 = r13.A00
            r4.setAlpha(r0)
            r12.A0J(r13)
            boolean r0 = r13.A0D
            r6 = 0
            r5 = 8
            if (r0 == 0) goto L_0x02e0
            android.view.ViewGroup r0 = r12.A0D
            if (r0 == 0) goto L_0x02e0
            r1 = 0
            r6 = 8
        L_0x008a:
            android.view.ViewGroup r0 = r12.A0E
            if (r0 == 0) goto L_0x0091
            r0.setVisibility(r6)
        L_0x0091:
            android.view.ViewGroup r6 = r12.A0C
            r6.setVisibility(r5)
            android.view.ViewGroup r5 = r12.A0D
            if (r5 == 0) goto L_0x009d
            r5.setVisibility(r1)
        L_0x009d:
            r12.A0K(r13)
            int r0 = r6.getVisibility()
            if (r0 != 0) goto L_0x0113
            boolean r0 = r13.A0E
            if (r0 == 0) goto L_0x0113
            com.whatsapp.CircularProgressBar r0 = r12.A02
            r7 = -1
            if (r0 != 0) goto L_0x00d8
            android.content.Context r1 = r4.getContext()
            com.whatsapp.CircularProgressBar r0 = new com.whatsapp.CircularProgressBar
            r0.<init>(r1)
            r12.A02 = r0
            r0.A0C = r7
            android.content.res.Resources r1 = X.C18290x4.A0G(r4)
            r0 = 2131165545(0x7f070169, float:1.794531E38)
            int r0 = r1.getDimensionPixelSize(r0)
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r2.<init>(r0, r0)
            r0 = 17
            r2.gravity = r0
            r1 = r4
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            com.whatsapp.CircularProgressBar r0 = r12.A02
            r1.addView(r0, r2)
        L_0x00d8:
            com.whatsapp.CircularProgressBar r0 = r12.A02
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x00e4
            android.animation.ValueAnimator r0 = r12.A01
            if (r0 != 0) goto L_0x0113
        L_0x00e4:
            com.whatsapp.CircularProgressBar r0 = r12.A02
            r0.setVisibility(r3)
            android.view.View r1 = r12.A0A
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.setAlpha(r0)
            int[] r0 = X.C86664Kz.A1Z()
            r0 = {0, 100} // fill-array
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofInt(r0)
            r12.A01 = r2
            r0 = 750(0x2ee, double:3.705E-321)
            r2.setDuration(r0)
            android.animation.ValueAnimator r0 = r12.A01
            r0.setRepeatCount(r7)
            android.animation.ValueAnimator r1 = r12.A01
            r0 = 11
            X.C86614Ku.A0z(r1, r12, r0)
            android.animation.ValueAnimator r0 = r12.A01
            r0.start()
        L_0x0113:
            int r0 = r6.getVisibility()
            if (r0 != 0) goto L_0x0122
            com.whatsapp.calling.callgrid.view.VoiceParticipantAudioWave r1 = r12.A0M
            if (r1 == 0) goto L_0x02d1
            boolean r0 = r13.A0U
            r1.setMuteIconVisibility(r0)
        L_0x0122:
            int r0 = r6.getVisibility()
            if (r0 != 0) goto L_0x018f
            com.whatsapp.calling.callgrid.view.VoiceParticipantAudioWave r2 = r12.A0M
            if (r2 == 0) goto L_0x018f
            int r1 = r13.A01
            r0 = -1
            if (r1 == r0) goto L_0x02cd
            android.content.res.Resources r1 = r2.getResources()
            int r0 = r13.A01
            int r0 = r1.getColor(r0)
        L_0x013b:
            r2.setColor(r0)
            boolean r0 = r13.A0N
            if (r0 == 0) goto L_0x0146
            r0 = 0
            r2.A02(r0, r3)
        L_0x0146:
            boolean r1 = r13.A0O
            android.animation.ValueAnimator r0 = r2.A07
            if (r0 == 0) goto L_0x014f
            r0.cancel()
        L_0x014f:
            if (r1 == 0) goto L_0x0180
            r8 = 2
            float[] r0 = new float[r8]
            r0 = {1036831949, 1058642330} // fill-array
            android.animation.ValueAnimator r7 = android.animation.ValueAnimator.ofFloat(r0)
            r2.A07 = r7
            r0 = 1000(0x3e8, double:4.94E-321)
            r7.setDuration(r0)
            android.animation.ValueAnimator r1 = r2.A07
            android.view.animation.Interpolator r0 = r2.A0H
            r1.setInterpolator(r0)
            android.animation.ValueAnimator r1 = r2.A07
            r0 = -1
            r1.setRepeatCount(r0)
            android.animation.ValueAnimator r0 = r2.A07
            r0.setRepeatMode(r8)
            android.animation.ValueAnimator r1 = r2.A07
            r0 = 13
            X.C86604Kt.A0w(r1, r2, r0)
            android.animation.ValueAnimator r0 = r2.A07
            r0.start()
        L_0x0180:
            X.7Qw r1 = r13.A09
            if (r1 == 0) goto L_0x02b8
            android.content.Context r0 = r2.getContext()
            java.lang.CharSequence r0 = r1.A00(r0)
        L_0x018c:
            r2.setContentDescription(r0)
        L_0x018f:
            X.5Tw r0 = r12.A07
            if (r0 == 0) goto L_0x019a
            boolean r2 = r0.A0D
            boolean r0 = r13.A0D
            r1 = 1
            if (r2 != r0) goto L_0x019b
        L_0x019a:
            r1 = 0
        L_0x019b:
            int r7 = r13.A06
            int r0 = r12.A03
            if (r0 != r7) goto L_0x022e
            if (r1 != 0) goto L_0x022e
        L_0x01a3:
            boolean r0 = r13.A0P
            if (r0 != 0) goto L_0x01ab
            boolean r0 = r13.A0Q
            if (r0 == 0) goto L_0x01af
        L_0x01ab:
            r0 = 2
            X.C86654Ky.A19(r4, r12, r0)
        L_0x01af:
            boolean r0 = r13.A0P
            if (r0 == 0) goto L_0x01b8
            r0 = 42
            X.C109705f3.A00(r4, r12, r13, r0)
        L_0x01b8:
            boolean r0 = r13.A0Q
            if (r0 == 0) goto L_0x01c5
            r1 = 1
            X.919 r0 = new X.919
            r0.<init>(r12, r1, r13)
            r4.setOnLongClickListener(r0)
        L_0x01c5:
            boolean r0 = r13.A0K
            if (r0 == 0) goto L_0x020c
            boolean r5 = r13.A0F
            boolean r2 = r13.A0B
            boolean r1 = r13.A0D
            boolean r0 = r13.A00()
            if (r0 != 0) goto L_0x022a
            if (r1 == 0) goto L_0x0223
            r0 = 2131165546(0x7f07016a, float:1.7945312E38)
        L_0x01da:
            int r2 = X.C86614Ku.A05(r4, r0)
            int r0 = r12.A00
            if (r0 == r2) goto L_0x020c
            r12.A00 = r2
            com.whatsapp.WaImageView r1 = r12.A0K
            boolean r0 = r1 instanceof com.whatsapp.WaDynamicRoundCornerImageView
            if (r0 == 0) goto L_0x01f0
            com.whatsapp.WaDynamicRoundCornerImageView r1 = (com.whatsapp.WaDynamicRoundCornerImageView) r1
            float r0 = (float) r2
            r1.setRadius(r0)
        L_0x01f0:
            com.whatsapp.WaDynamicRoundCornerImageView r1 = r12.A0I
            if (r1 == 0) goto L_0x01fa
            int r0 = r12.A00
            float r0 = (float) r0
            r1.setRadius(r0)
        L_0x01fa:
            android.view.View r0 = r12.A0B
            if (r0 == 0) goto L_0x020c
            android.graphics.drawable.Drawable r1 = r0.getBackground()
            android.graphics.drawable.GradientDrawable r1 = (android.graphics.drawable.GradientDrawable) r1
            if (r1 == 0) goto L_0x020c
            int r0 = r12.A00
            float r0 = (float) r0
            r1.setCornerRadius(r0)
        L_0x020c:
            X.5UY r1 = r12.A04
            if (r1 == 0) goto L_0x021d
            boolean r0 = r13.A0S
            if (r0 == 0) goto L_0x0220
            boolean r0 = r13.A00()
            if (r0 != 0) goto L_0x0220
        L_0x021a:
            r1.A06(r3)
        L_0x021d:
            r12.A07 = r13
            return
        L_0x0220:
            r3 = 8
            goto L_0x021a
        L_0x0223:
            if (r5 == 0) goto L_0x022a
            r0 = 2131165551(0x7f07016f, float:1.7945322E38)
            if (r2 == 0) goto L_0x01da
        L_0x022a:
            r0 = 2131165539(0x7f070163, float:1.7945298E38)
            goto L_0x01da
        L_0x022e:
            r12.A03 = r7
            boolean r0 = r13.A0F
            if (r0 == 0) goto L_0x02a8
            float r2 = (float) r7
            r0 = -1028390912(0xffffffffc2b40000, float:-90.0)
            float r2 = r2 * r0
            com.whatsapp.WaDynamicRoundCornerImageView r0 = r12.A0I
            if (r0 == 0) goto L_0x023f
            X.AnonymousClass5AH.A00(r0, r7)
        L_0x023f:
            int r1 = r12.A03
            r7 = 3
            r10 = 1127481344(0x43340000, float:180.0)
            r9 = 1
            r8 = 0
            if (r1 == r9) goto L_0x0299
            r0 = 2
            if (r1 == r0) goto L_0x0257
            if (r1 != r7) goto L_0x02a6
            int r1 = r12.A02
            r0 = 8
            if (r1 != r0) goto L_0x02a5
            float r2 = r2 - r10
            r8 = r2
            r2 = 1127481344(0x43340000, float:180.0)
        L_0x0257:
            com.whatsapp.calling.callgrid.view.VoiceParticipantAudioWave r10 = r12.A0M
            if (r10 == 0) goto L_0x0276
            android.view.ViewGroup$MarginLayoutParams r11 = X.AnonymousClass001.A0T(r10)
            int r1 = r12.A03
            r0 = 0
            if (r1 == r9) goto L_0x0266
            if (r1 != r7) goto L_0x0271
        L_0x0266:
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131165339(0x7f07009b, float:1.7944892E38)
            int r0 = r1.getDimensionPixelSize(r0)
        L_0x0271:
            r11.topMargin = r0
            r10.setLayoutParams(r11)
        L_0x0276:
            com.whatsapp.components.button.ThumbnailButton r0 = r12.A0N
            r0.setRotation(r8)
            if (r10 == 0) goto L_0x0280
            r10.setRotation(r8)
        L_0x0280:
            if (r5 == 0) goto L_0x0294
            X.1VX r0 = r12.A0Q
            int r0 = X.C86664Kz.A0J(r0)
            if (r0 < r7) goto L_0x0294
            r5.setRotation(r2)
            com.whatsapp.components.button.ThumbnailButton r0 = r12.A0O
            if (r0 == 0) goto L_0x0294
            r0.setRotation(r8)
        L_0x0294:
            r6.setRotation(r2)
            goto L_0x01a3
        L_0x0299:
            int r1 = r12.A02
            r0 = 8
            if (r1 == r0) goto L_0x02a5
            float r8 = r2 - r10
            r0 = 1119092736(0x42b40000, float:90.0)
            float r2 = r2 - r0
            goto L_0x0257
        L_0x02a5:
            r8 = r2
        L_0x02a6:
            r2 = 0
            goto L_0x0257
        L_0x02a8:
            X.5O4 r1 = r12.A0L
            r0 = 1
            r1.A03 = r0
            int r0 = r1.A02
            if (r7 == r0) goto L_0x01a3
            r1.A02 = r7
            r1.A00()
            goto L_0x01a3
        L_0x02b8:
            boolean r0 = r13.A0U
            if (r0 == 0) goto L_0x02c9
            android.content.res.Resources r1 = r2.getResources()
            r0 = 2131895405(0x7f12246d, float:1.9425642E38)
            java.lang.String r0 = r1.getString(r0)
            goto L_0x018c
        L_0x02c9:
            java.lang.String r0 = ""
            goto L_0x018c
        L_0x02cd:
            int r0 = r12.A00
            goto L_0x013b
        L_0x02d1:
            com.whatsapp.WaImageView r1 = r12.A0J
            if (r1 == 0) goto L_0x0122
            boolean r0 = r13.A0U
            int r0 = X.AnonymousClass001.A08(r0)
            r1.setVisibility(r0)
            goto L_0x0122
        L_0x02e0:
            android.widget.TextView r2 = r12.A0F
            if (r2 == 0) goto L_0x02f7
            boolean r0 = r13.A0K
            if (r0 == 0) goto L_0x02f7
            X.7Qw r1 = r13.A09
            if (r1 == 0) goto L_0x02f7
            android.content.Context r0 = r2.getContext()
            X.C86614Ku.A12(r0, r2, r1)
            r1 = 8
            goto L_0x008a
        L_0x02f7:
            r1 = 8
            r6 = 8
            r5 = 0
            goto L_0x008a
        L_0x02fe:
            com.whatsapp.TextEmojiLabel r0 = r12.A0G
            if (r0 == 0) goto L_0x0038
            r0.setTextColor(r1)
            goto L_0x0038
        L_0x0307:
            r0 = 2130903082(0x7f03002a, float:1.7412972E38)
            int[] r1 = r1.getIntArray(r0)
            int r0 = r1.length
            int r2 = r2 % r0
            r1 = r1[r2]
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C91224j8.A0G(X.5Tw):void");
    }

    public final void A0H() {
        if (this.A02 != null) {
            ValueAnimator valueAnimator = this.A01;
            if (valueAnimator != null) {
                valueAnimator.end();
                this.A01 = null;
            }
            this.A02.setVisibility(8);
            this.A0A.setAlpha(0.0f);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000e, code lost:
        if (r1.A0U != false) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0I(int r6) {
        /*
            r5 = this;
            boolean r0 = r5 instanceof X.C91214j7
            if (r0 != 0) goto L_0x005b
            X.5Tw r1 = r5.A07
            if (r1 == 0) goto L_0x005b
            r4 = 1
            if (r6 <= 0) goto L_0x0010
            boolean r0 = r1.A0U
            r3 = 1
            if (r0 == 0) goto L_0x0011
        L_0x0010:
            r3 = 0
        L_0x0011:
            boolean r0 = r5.A08
            if (r0 == r3) goto L_0x0031
            boolean r0 = r1.A0M
            if (r0 == 0) goto L_0x005f
            if (r3 == 0) goto L_0x005f
        L_0x001b:
            android.view.View r0 = r5.A0B
            if (r0 == 0) goto L_0x0031
            android.graphics.drawable.Drawable r2 = r0.getBackground()
            android.graphics.drawable.GradientDrawable r2 = (android.graphics.drawable.GradientDrawable) r2
            int r1 = r5.A00
            int r0 = r5.A01
            if (r2 == 0) goto L_0x0031
            if (r4 != 0) goto L_0x002e
            r1 = 0
        L_0x002e:
            r2.setStroke(r0, r1)
        L_0x0031:
            X.5Tw r0 = r5.A07
            boolean r0 = r0.A0N
            if (r0 == 0) goto L_0x0038
            r6 = 0
        L_0x0038:
            com.whatsapp.calling.callgrid.view.VoiceParticipantAudioWave r2 = r5.A0M
            if (r2 == 0) goto L_0x0041
            float r1 = (float) r6
            r0 = 1
            r2.A02(r1, r0)
        L_0x0041:
            X.5Tw r0 = r5.A07
            boolean r0 = r0.A0N
            if (r0 != 0) goto L_0x0059
            if (r2 == 0) goto L_0x0059
            if (r3 == 0) goto L_0x005c
            android.content.res.Resources r1 = r2.getResources()
            r0 = 2131895393(0x7f122461, float:1.9425618E38)
            java.lang.String r0 = r1.getString(r0)
        L_0x0056:
            r2.setContentDescription(r0)
        L_0x0059:
            r5.A08 = r3
        L_0x005b:
            return
        L_0x005c:
            java.lang.String r0 = ""
            goto L_0x0056
        L_0x005f:
            r4 = 0
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C91224j8.A0I(int):void");
    }

    public void A0J(C105175Tw r6) {
        AnonymousClass5YB r2;
        TextEmojiLabel textEmojiLabel = this.A0G;
        if (textEmojiLabel != null && (r2 = this.A0H) != null) {
            textEmojiLabel.setVisibility(AnonymousClass001.A08(r6.A0V ? 1 : 0));
            if (r6.A0J) {
                r2.A05();
                return;
            }
            AnonymousClass3ZH r4 = r6.A0a;
            if (r4.A0V()) {
                AnonymousClass1VX r3 = this.A0Q;
                if (r3.A0N(4067) >= 2 && r3.A0X(4455)) {
                    r2.A08(r4);
                    return;
                }
            }
            CallGridViewModel callGridViewModel = this.A06;
            if (callGridViewModel != null && C86604Kt.A1Z(callGridViewModel.A0r) && !r4.A0Q()) {
                AnonymousClass5ZU r1 = this.A0C;
                if (AnonymousClass5ZU.A05(r4)) {
                    r2.A02.setText(AnonymousClass5ZU.A03(r1, r4));
                    return;
                }
            }
            String A0H2 = this.A0C.A0H(r4);
            TextEmojiLabel textEmojiLabel2 = r2.A02;
            textEmojiLabel2.setText(A0H2);
            textEmojiLabel2.A0E();
        }
    }

    public final void A0K(C105175Tw r6) {
        WaImageView waImageView;
        boolean z;
        String A0H2;
        TextEmojiLabel textEmojiLabel;
        if (r6 != null && (waImageView = this.A0K) != null) {
            int i = 1;
            if (this.A0C.getVisibility() == 8 || (textEmojiLabel = this.A0G) == null || textEmojiLabel.getVisibility() == 8) {
                z = true;
                if (r6.A0J) {
                    A0H2 = waImageView.getContext().getString(R.string.f11nameremoved);
                } else {
                    A0H2 = this.A0C.A0H(r6.A0a);
                }
            } else {
                z = false;
                A0H2 = "";
            }
            waImageView.setContentDescription(A0H2);
            if (!z) {
                i = 2;
            }
            waImageView.setImportantForAccessibility(i);
        }
    }

    public void A0L(C105175Tw r5, boolean z) {
        AnonymousClass3ZH r3 = r5.A0a;
        A0E(this.A0N, r3, false, false);
        ThumbnailButton thumbnailButton = this.A0O;
        if (thumbnailButton != null) {
            A0E(thumbnailButton, r3, false, false);
        }
        WaDynamicRoundCornerImageView waDynamicRoundCornerImageView = this.A0I;
        if (waDynamicRoundCornerImageView != null && r5.A0Y) {
            A0E(waDynamicRoundCornerImageView, r3, true, z);
            waDynamicRoundCornerImageView.setVisibility(0);
        }
    }

    public void A08() {
        C105175Tw r0;
        C15930sC r4;
        if (A06()) {
            CallGridViewModel callGridViewModel = this.A06;
            if (!(callGridViewModel == null || (r0 = this.A07) == null || (r4 = this.A05) == null)) {
                AnonymousClass7SG r1 = callGridViewModel.A0Y;
                UserJid userJid = r0.A0b;
                Map map = r1.A01;
                if (map.containsKey(userJid)) {
                    Map map2 = r1.A00;
                    if (r4.equals(map2.get(userJid))) {
                        map2.remove(userJid);
                        map.remove(userJid);
                    }
                }
                this.A05 = null;
            }
            this.A07 = null;
            A0H();
        }
    }
}
