package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.widget.Filter;
import android.widget.Filterable;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.4XF  reason: invalid class name */
public class AnonymousClass4XF extends AnonymousClass0R6 implements Filterable {
    public int A00;
    public int A01 = -1;
    public int A02;
    public C87254Os A03;
    public C117785sU A04;
    public String A05 = "";
    public List A06 = AnonymousClass001.A0s();
    public List A07 = AnonymousClass001.A0s();
    public boolean A08;
    public final int A09;
    public final int A0A;
    public final C116985rC A0B;
    public final C69263Wi A0C;
    public final C56972sr A0D;
    public final AnonymousClass64J A0E;
    public final AnonymousClass5ZU A0F;
    public final C105365Uq A0G;
    public final C56612sH A0H;
    public final C620733j A0I;
    public final AnonymousClass1VX A0J;
    public final C95814uZ A0K;
    public final AnonymousClass65O A0L;
    public final C106195Xz A0M;
    public final boolean A0N;

    public int A0G() {
        return this.A07.size();
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x01d5  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x01fe  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0222  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BNf(X.C05570Ua r24, int r25) {
        /*
            r23 = this;
            r3 = r24
            boolean r0 = r3 instanceof X.AnonymousClass4Z2
            r22 = r25
            if (r0 == 0) goto L_0x0075
            X.4Z2 r3 = (X.AnonymousClass4Z2) r3
            X.4XF r4 = r3.A07
            java.util.List r1 = r4.A07
            r0 = r22
            java.lang.Object r6 = r1.get(r0)
            X.7Hz r6 = (X.C148337Hz) r6
            java.lang.Object r2 = r6.A01
            X.C626936e.A06(r2)
            boolean r0 = r2 instanceof X.C148327Hy
            if (r0 == 0) goto L_0x0093
            int r5 = r6.A00
            X.7Hy r2 = (X.C148327Hy) r2
            X.5rC r0 = r4.A0B
            java.lang.Object r0 = r0.A05()
            if (r0 == 0) goto L_0x0074
            r0 = r22
            r3.A07(r0)
            X.3ZL r6 = r2.A00
            X.5YB r7 = r3.A04
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "/"
            r1.append(r0)
            java.lang.String r0 = r6.A01
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)
            java.lang.String r0 = r4.A05
            java.lang.CharSequence r1 = A00(r1, r0)
            r0 = 0
            r7.A0B(r0, r1)
            com.whatsapp.TextEmojiLabel r1 = r3.A02
            r0 = 0
            r1.setVisibility(r0)
            java.lang.String r0 = r6.A00
            r1.setText(r0)
            r0 = 32
            if (r5 != r0) goto L_0x0064
            com.whatsapp.components.button.ThumbnailButton r1 = r3.A05
            r0 = 2131233828(0x7f080c24, float:1.8083805E38)
            r1.setImageResource(r0)
        L_0x0064:
            android.widget.FrameLayout r1 = r3.A01
            r12 = 2
            X.5eo r0 = new X.5eo
            r7 = r0
            r8 = r3
            r9 = r2
            r10 = r6
            r11 = r5
            r7.<init>(r8, r9, r10, r11, r12)
            r1.setOnClickListener(r0)
        L_0x0074:
            return
        L_0x0075:
            boolean r0 = r3 instanceof X.AnonymousClass4YR
            if (r0 == 0) goto L_0x0074
            X.4YR r3 = (X.AnonymousClass4YR) r3
            android.widget.TextView r2 = r3.A01
            X.4XF r0 = r3.A02
            java.util.List r1 = r0.A07
            r0 = r22
            java.lang.Object r0 = r1.get(r0)
            X.7Hz r0 = (X.C148337Hz) r0
            java.lang.Object r0 = r0.A01
            int r0 = X.AnonymousClass001.A0K(r0)
            r2.setText(r0)
            return
        L_0x0093:
            X.3ZH r2 = (X.AnonymousClass3ZH) r2
            X.4uZ r0 = r4.A0K
            X.1fJ r19 = X.AnonymousClass34R.A01(r0)
            X.5Xz r1 = r4.A0M
            r0 = r19
            X.7HU r18 = r1.A01(r2, r0)
            r0 = r18
            java.lang.String r7 = r0.A01
            X.C626936e.A06(r7)
            X.5YB r5 = r3.A04
            java.lang.String r0 = r4.A05
            java.lang.CharSequence r1 = A00(r7, r0)
            r0 = 0
            r5.A0B(r0, r1)
            boolean r0 = r2.A0W()
            r5.A06(r0)
            r0 = r18
            X.58i r8 = r0.A00
            X.58i r5 = X.C998258i.PUSH_NAME
            if (r8 != r5) goto L_0x00ce
            X.5ZU r1 = r4.A0F
            r0 = 2131895817(0x7f122609, float:1.9426478E38)
            java.lang.String r7 = r1.A0Q(r2, r0)
        L_0x00ce:
            X.5Uq r0 = r4.A0G
            r21 = r0
            com.whatsapp.components.button.ThumbnailButton r1 = r3.A05
            r0.A08(r1, r2)
            boolean r0 = r2.A0U()
            r10 = 8
            r9 = 0
            if (r0 == 0) goto L_0x0259
            r1.setVisibility(r10)
            X.5UY r0 = r3.A06
            r20 = r0
            android.view.View r13 = r20.A04()
            com.whatsapp.community.SubgroupWithParentView r13 = (com.whatsapp.community.SubgroupWithParentView) r13
            android.content.Context r17 = r13.getContext()
            android.content.res.Resources r1 = r13.getResources()
            r0 = 2131165818(0x7f07027a, float:1.7945864E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r13.A01 = r0
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r1.<init>(r0, r0)
            com.whatsapp.WaImageView r0 = r13.A02
            r0.setLayoutParams(r1)
            android.content.res.Resources r1 = r17.getResources()
            r0 = 2131165827(0x7f070283, float:1.7945882E38)
            int r0 = r1.getDimensionPixelSize(r0)
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r1.<init>(r0, r0)
            r0 = 8388693(0x800055, float:1.1755063E-38)
            r1.gravity = r0
            com.whatsapp.components.button.ThumbnailButton r14 = r13.A04
            r14.setLayoutParams(r1)
            android.view.ViewGroup$MarginLayoutParams r16 = X.AnonymousClass001.A0T(r14)
            android.content.res.Resources r0 = r14.getResources()
            r1 = 2131165824(0x7f070280, float:1.7945876E38)
            int r15 = r0.getDimensionPixelSize(r1)
            android.content.res.Resources r0 = r14.getResources()
            r1 = 2131165826(0x7f070282, float:1.794588E38)
            int r12 = r0.getDimensionPixelSize(r1)
            android.content.res.Resources r0 = r14.getResources()
            r1 = 2131165825(0x7f070281, float:1.7945878E38)
            int r11 = r0.getDimensionPixelSize(r1)
            android.content.res.Resources r0 = r14.getResources()
            r1 = 2131165823(0x7f07027f, float:1.7945874E38)
            int r0 = r0.getDimensionPixelSize(r1)
            r1 = r0
            r0 = r16
            r0.setMargins(r15, r12, r11, r1)
            r14.setLayoutParams(r0)
            android.content.res.Resources r1 = r17.getResources()
            r0 = 2131165822(0x7f07027e, float:1.7945872E38)
            float r0 = X.C86664Kz.A01(r1, r0)
            r14.A01 = r0
            android.content.Context r11 = r14.getContext()
            r1 = 2130970113(0x7f040601, float:1.7548927E38)
            r0 = 2131101875(0x7f0608b3, float:1.7816172E38)
            int r0 = X.AnonymousClass5Yj.A02(r11, r1, r0)
            r13.setSubgroupProfilePhotoBorderColor(r0)
            boolean r0 = r4.A0N
            if (r0 == 0) goto L_0x018e
            android.content.Context r11 = r13.getContext()
            r1 = 2130970114(0x7f040602, float:1.7548929E38)
            r0 = 2131101876(0x7f0608b4, float:1.7816174E38)
            int r0 = X.AnonymousClass5Yj.A02(r11, r1, r0)
            r13.setSubgroupProfilePhotoBorderColor(r0)
        L_0x018e:
            r1 = 2
            r0 = r21
            r13.setSubgroupProfilePhoto(r2, r1, r0)
            r0 = r20
            r0.A06(r9)
        L_0x0199:
            android.widget.FrameLayout r1 = r3.A01
            r16 = 10
            X.5ep r0 = new X.5ep
            r11 = r0
            r12 = r3
            r13 = r2
            r14 = r18
            r15 = r6
            r11.<init>(r12, r13, r14, r15, r16)
            r1.setOnClickListener(r0)
            r0 = r22
            r3.A07(r0)
            X.5ZU r11 = r4.A0F
            r0 = r19
            int r12 = r11.A06(r2, r0)
            X.58i r0 = X.C998258i.PHONE_NUMBER
            if (r8 != r0) goto L_0x0248
            java.lang.String r8 = X.AnonymousClass5ZU.A03(r11, r2)
            X.58i r0 = X.C998258i.PUSH_NAME
        L_0x01c2:
            X.7HU r12 = new X.7HU
            r12.<init>(r0, r8)
        L_0x01c7:
            java.lang.String r8 = r12.A01
            X.5rC r13 = r4.A0B
            boolean r0 = r13.A07()
            if (r0 == 0) goto L_0x0222
            int r0 = r6.A00
            if (r0 != r10) goto L_0x0222
            java.lang.Object r5 = r13.A04()
            X.5TH r5 = (X.AnonymousClass5TH) r5
            X.2pP r0 = r5.A03
            boolean r0 = r0.A01()
            if (r0 != 0) goto L_0x0242
            X.2oU r0 = r5.A05
            r5 = 2131886936(0x7f120358, float:1.9408465E38)
            android.content.res.Resources r0 = X.C54292oU.A00(r0)
            java.lang.String r5 = r0.getString(r5)
            if (r5 == 0) goto L_0x0242
            com.whatsapp.TextEmojiLabel r0 = r3.A02
            r0.setText(r5)
            r0.setVisibility(r9)
        L_0x01fa:
            com.whatsapp.TextEmojiLabel r5 = r3.A03
            if (r5 == 0) goto L_0x0211
            X.2sH r3 = r4.A0H
            android.content.Context r0 = r5.getContext()
            java.lang.String r2 = X.AnonymousClass31U.A01(r0, r3, r2)
            boolean r0 = X.C107575bX.A0F(r2)
            if (r0 != 0) goto L_0x0211
            r5.setText(r2)
        L_0x0211:
            android.content.Context r3 = r1.getContext()
            r2 = 2131890676(0x7f1211f4, float:1.941605E38)
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            X.C18280x3.A19(r7, r8, r0)
            X.C86624Kv.A0h(r3, r1, r0, r2)
            return
        L_0x0222:
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L_0x0242
            com.whatsapp.TextEmojiLabel r6 = r3.A02
            java.lang.String r0 = r4.A05
            java.lang.CharSequence r0 = A00(r8, r0)
            r6.setText(r0)
            r6.setVisibility(r9)
            X.58i r0 = r12.A00
            if (r0 != r5) goto L_0x01fa
            r0 = 2131895817(0x7f122609, float:1.9426478E38)
            java.lang.String r8 = r11.A0Q(r2, r0)
            goto L_0x01fa
        L_0x0242:
            com.whatsapp.TextEmojiLabel r0 = r3.A02
            r0.setVisibility(r10)
            goto L_0x01fa
        L_0x0248:
            if (r8 != r5) goto L_0x0254
            r0 = 7
            if (r12 != r0) goto L_0x0254
            r0 = 1
            X.7HU r12 = r11.A0F(r2, r0)
            goto L_0x01c7
        L_0x0254:
            r8 = 0
            X.58i r0 = X.C998258i.UNKNOWN
            goto L_0x01c2
        L_0x0259:
            r1.setVisibility(r9)
            X.5UY r0 = r3.A06
            r0.A06(r10)
            goto L_0x0199
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4XF.BNf(X.0Ua, int):void");
    }

    public Filter getFilter() {
        C87254Os r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        C87254Os r02 = new C87254Os(this);
        this.A03 = r02;
        return r02;
    }

    public int getItemViewType(int i) {
        if (i < 0 || i >= this.A07.size()) {
            return 1;
        }
        return ((C148337Hz) this.A07.get(i)).A00;
    }

    public AnonymousClass4XF(Context context, C116985rC r4, C69263Wi r5, C56972sr r6, AnonymousClass64J r7, AnonymousClass5ZU r8, C114015mM r9, C56612sH r10, C620733j r11, AnonymousClass1VX r12, C95814uZ r13, AnonymousClass65O r14, C106195Xz r15, boolean z, boolean z2) {
        int i;
        this.A0H = r10;
        this.A0J = r12;
        this.A0M = r15;
        this.A0C = r5;
        this.A0D = r6;
        this.A0F = r8;
        this.A0I = r11;
        this.A0B = r4;
        this.A0E = r7;
        this.A0G = r9.A05(context, "mentions-adapter");
        this.A0L = r14;
        this.A0K = r13;
        this.A0N = z;
        if (z) {
            this.A00 = C18300x5.A03(context, R.attr.f3nameremoved, R.color.f5nameremoved);
            this.A02 = AnonymousClass0Y8.A04(context, R.color.f5nameremoved);
            i = AnonymousClass5Yj.A02(context, R.attr.f3nameremoved, R.color.f5nameremoved);
        } else {
            this.A00 = C18300x5.A03(context, R.attr.f3nameremoved, R.color.f5nameremoved);
            this.A02 = AnonymousClass0Y8.A04(context, R.color.f5nameremoved);
            i = R.color.f5nameremoved;
        }
        this.A09 = AnonymousClass0Y8.A04(context, i);
        this.A0A = AnonymousClass4L0.A01(context.getResources(), R.dimen.f6nameremoved);
        this.A08 = z2;
    }

    public static final CharSequence A00(String str, String str2) {
        int indexOf = str.toLowerCase().indexOf(str2);
        int length = str2.length();
        if (length <= 0 || indexOf < 0) {
            return str;
        }
        SpannableStringBuilder A002 = C18330xA.A00(str);
        A002.setSpan(new StyleSpan(1), indexOf, length + indexOf, 33);
        return A002;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        if (r7 != 32) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C05570Ua BQR(android.view.ViewGroup r6, int r7) {
        /*
            r5 = this;
            android.content.Context r4 = r6.getContext()
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r4)
            r0 = 1
            if (r7 == r0) goto L_0x0021
            r0 = 2
            r2 = 0
            if (r7 == r0) goto L_0x003b
            r0 = 4
            if (r7 == r0) goto L_0x002c
            r0 = 8
            if (r7 == r0) goto L_0x003b
            r1 = 16
            r0 = 2131625427(0x7f0e05d3, float:1.8878062E38)
            if (r7 == r1) goto L_0x003e
            r0 = 32
            if (r7 == r0) goto L_0x003b
        L_0x0021:
            android.view.View r1 = new android.view.View
            r1.<init>(r4)
            X.4tU r0 = new X.4tU
            r0.<init>(r1)
            return r0
        L_0x002c:
            r0 = 2131625424(0x7f0e05d0, float:1.8878056E38)
            android.view.View r0 = r3.inflate(r0, r6, r2)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            X.4YR r1 = new X.4YR
            r1.<init>(r0, r5)
            return r1
        L_0x003b:
            r0 = 2131625426(0x7f0e05d2, float:1.887806E38)
        L_0x003e:
            android.view.View r0 = r3.inflate(r0, r6, r2)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            X.4Z2 r1 = new X.4Z2
            r1.<init>(r0, r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4XF.BQR(android.view.ViewGroup, int):X.0Ua");
    }
}
