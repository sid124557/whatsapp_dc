package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.stickers.StickerView;

/* renamed from: X.5TP  reason: invalid class name */
public class AnonymousClass5TP {
    public float A00;
    public int A01 = -1;
    public View A02;
    public ImageView A03;
    public ImageView A04;
    public ImageView A05;
    public LinearLayout A06;
    public C30471mV A07;
    public final ImageView A08;
    public final LinearLayout A09;
    public final TextView A0A;
    public final C106145Xu A0B;
    public final StickerView A0C;
    public final /* synthetic */ C93294oH A0D;

    public AnonymousClass5TP(LinearLayout linearLayout, C93294oH r20) {
        C93294oH r3 = r20;
        this.A0D = r3;
        LinearLayout linearLayout2 = linearLayout;
        this.A0C = (StickerView) linearLayout2.findViewById(R.id.sticker_image);
        this.A0A = AnonymousClass002.A09(linearLayout2, R.id.date);
        this.A08 = AnonymousClass0x9.A0F(linearLayout2, R.id.status);
        AnonymousClass1VX r11 = r3.A0O;
        AnonymousClass5Ul r7 = r3.A0a;
        C621033m r8 = r3.A0h;
        C55732qp r14 = r3.A03;
        C620733j r10 = r3.A0M;
        C33141sV r1 = r3.A22;
        this.A0B = new C106145Xu(linearLayout2, r7, r8, r3.A00, r10, r11, r3.A01, r3.A02, r14, r3.A04, r3.A05, r1);
        this.A09 = C86664Kz.A0v(linearLayout2, R.id.date_wrapper);
        linearLayout2.setClipChildren(false);
        linearLayout2.setClipToPadding(false);
        LinearLayout.LayoutParams A0C2 = C86624Kv.A0C();
        A0C2.gravity = 8388613;
        C93294oH r32 = this.A0D;
        A0C2.topMargin = -r32.getReactionsViewVerticalOverlap();
        boolean A042 = C620733j.A04(r32.A0M);
        int A052 = C86654Ky.A05(r32);
        if (A042) {
            A0C2.rightMargin = A052;
        } else {
            A0C2.leftMargin = A052;
        }
        if (this.A06 == null) {
            LinearLayout linearLayout3 = new LinearLayout(r32.getContext());
            this.A06 = linearLayout3;
            linearLayout3.setOrientation(0);
            linearLayout2.addView(this.A06, A0C2);
            this.A06.bringToFront();
        }
    }

    public final void A00() {
        View view = this.A02;
        if (view != null) {
            view.setVisibility(0);
            return;
        }
        AnonymousClass4NN r1 = new AnonymousClass4NN(this.A0D.getContext(), this);
        this.A02 = r1;
        r1.setClickable(true);
        C109345eT.A00(this.A02, this, 32);
        C86664Kz.A0l(this.A0C).addView(this.A02, C86664Kz.A0q());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008f, code lost:
        if (r3 == -1) goto L_0x0091;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0205  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x021b  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0225  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.C30471mV r20, boolean r21) {
        /*
            r19 = this;
            r6 = r19
            r7 = r20
            r6.A07 = r7
            X.4oH r5 = r6.A0D
            boolean r2 = X.C87094Nz.A0h(r5)
            android.view.View r0 = r5.A08
            r1 = -2
            if (r2 == 0) goto L_0x0012
            r1 = -1
        L_0x0012:
            X.C86644Kx.A0y(r0, r1)
            android.view.View r0 = r5.A07
            X.C86644Kx.A0y(r0, r1)
            X.677 r8 = r5.A0m
            if (r8 == 0) goto L_0x0285
            boolean r0 = r8.BFW()
            if (r0 == 0) goto L_0x0285
            r6.A00()
            android.view.View r1 = r6.A02
            boolean r0 = r8.BIB(r7)
            r1.setSelected(r0)
        L_0x0030:
            r4 = 0
            if (r20 == 0) goto L_0x028c
            r9 = r21
            if (r21 == 0) goto L_0x004f
            if (r8 == 0) goto L_0x0282
            boolean r3 = r8.BJC(r7)
            X.5Xu r0 = r6.A0B
            com.whatsapp.stickers.StickerView r2 = r0.A0F
            if (r3 == 0) goto L_0x027e
            r1 = 1
            X.67l r0 = new X.67l
            r0.<init>(r6, r1, r7)
            r2.A01 = r0
        L_0x004b:
            X.5Xu r0 = r6.A0B
            r0.A02 = r3
        L_0x004f:
            X.5Xu r0 = r6.A0B
            r18 = r0
            r1 = r7
            X.1nE r1 = (X.AnonymousClass1nE) r1
            r0.A03(r1, r9)
            X.1mV r11 = r6.A07
            int r3 = r6.A01
            if (r8 == 0) goto L_0x025b
            X.5Rh r1 = r5.A0I
            int r0 = r8.getContainerType()
            boolean r0 = r1.A02(r11, r0)
            if (r0 == 0) goto L_0x025b
            X.2hZ r1 = r5.A0j
            r0 = 56
            r1.A00(r11, r4, r0)
            X.4FP r10 = r11.A0L
            X.2pu r2 = r5.A1C(r11)
            X.5Rh r8 = r5.A0I
            android.widget.LinearLayout r9 = r6.A06
            if (r10 != 0) goto L_0x0089
            X.2sr r1 = r5.A0Z
            java.util.List r0 = java.util.Collections.emptyList()
            X.5iB r10 = new X.5iB
            r10.<init>(r1, r0)
        L_0x0089:
            r0 = 28
            if (r3 == r0) goto L_0x0091
            r0 = -1
            r13 = 0
            if (r3 != r0) goto L_0x0092
        L_0x0091:
            r13 = 1
        L_0x0092:
            r0 = 23
            X.3bw r12 = new X.3bw
            r12.<init>(r6, r0, r11)
            r0 = 24
            X.3bw r1 = new X.3bw
            r1.<init>(r6, r0, r11)
            r0 = 0
            X.C162457s7.A0J(r9, r0)
        L_0x00a4:
            r0 = 1
            X.C162457s7.A0J(r11, r0)
            r8.A00(r9, r10, r11, r12, r13)
            r8.A01(r9, r2, r1)
        L_0x00ae:
            X.33C r13 = X.C30471mV.A00(r7)
            android.widget.TextView r1 = r6.A0A
            java.lang.String r0 = X.C87094Nz.A0F(r5, r7)
            r1.setText(r0)
            android.widget.LinearLayout r12 = r6.A09
            if (r12 == 0) goto L_0x01ed
            boolean r14 = r7.A1F
            r16 = 3
            r11 = 4
            r10 = 16
            r9 = 8
            r8 = 2
            r3 = 1
            r2 = -2
            r1 = 0
            android.widget.ImageView r0 = r6.A05
            if (r14 == 0) goto L_0x0254
            if (r0 != 0) goto L_0x0109
            android.widget.ImageView r0 = X.C86614Ku.A0H(r5)
            r6.A05 = r0
            android.widget.LinearLayout$LayoutParams r14 = new android.widget.LinearLayout$LayoutParams
            r14.<init>(r2, r2)
            r14.gravity = r10
            android.widget.ImageView r0 = r6.A05
            r0.setLayoutParams(r14)
            X.33j r15 = r5.A0M
            android.widget.ImageView r14 = r6.A05
            int r0 = X.C86624Kv.A01(r5)
            X.C107555bV.A05(r14, r15, r1, r0)
            android.widget.ImageView r14 = r6.A05
            android.view.View[] r15 = new android.view.View[r11]
            r15[r1] = r14
            android.widget.ImageView r0 = r6.A03
            r15[r3] = r0
            android.widget.ImageView r0 = r6.A04
            r15[r8] = r0
            r15[r16] = r4
            int r0 = X.C154307cx.A00(r15, r1)
            r12.addView(r14, r0)
            r12.setClipChildren(r1)
        L_0x0109:
            android.widget.ImageView r0 = r6.A05
            r17 = r0
            android.content.Context r15 = r5.getContext()
            X.C162457s7.A0J(r15, r1)
            r14 = 2131233137(0x7f080971, float:1.8082403E38)
            r0 = 2131101883(0x7f0608bb, float:1.7816188E38)
            android.graphics.drawable.Drawable r14 = X.C107335b8.A04(r15, r14, r0)
            r0 = r17
            r0.setImageDrawable(r14)
            android.widget.ImageView r0 = r6.A05
            r0.setVisibility(r1)
        L_0x0128:
            boolean r14 = X.C106215Yb.A02(r7)
            android.widget.ImageView r0 = r6.A03
            if (r14 == 0) goto L_0x024d
            if (r0 != 0) goto L_0x0169
            android.widget.ImageView r0 = X.C86614Ku.A0H(r5)
            r6.A03 = r0
            android.widget.LinearLayout$LayoutParams r14 = new android.widget.LinearLayout$LayoutParams
            r14.<init>(r2, r2)
            r14.gravity = r10
            android.widget.ImageView r0 = r6.A03
            r0.setLayoutParams(r14)
            X.33j r15 = r5.A0M
            android.widget.ImageView r14 = r6.A03
            int r0 = X.C86624Kv.A01(r5)
            X.C107555bV.A05(r14, r15, r1, r0)
            android.widget.ImageView r14 = r6.A03
            android.view.View[] r15 = new android.view.View[r11]
            android.widget.ImageView r0 = r6.A05
            r15[r1] = r0
            r15[r3] = r14
            android.widget.ImageView r0 = r6.A04
            r15[r8] = r0
            r15[r16] = r4
            int r0 = X.C154307cx.A00(r15, r3)
            r12.addView(r14, r0)
            r12.setClipChildren(r1)
        L_0x0169:
            android.widget.ImageView r0 = r6.A03
            r17 = r0
            android.content.Context r15 = r5.getContext()
            X.C162457s7.A0J(r15, r1)
            r14 = 2131233001(0x7f0808e9, float:1.8082127E38)
            r0 = 2131101883(0x7f0608bb, float:1.7816188E38)
            android.graphics.drawable.Drawable r14 = X.C107335b8.A04(r15, r14, r0)
            r0 = r17
            r0.setImageDrawable(r14)
            android.widget.ImageView r0 = r6.A03
            r0.setVisibility(r1)
        L_0x0188:
            X.2eV r0 = r5.A0R
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x01ed
            X.1me r0 = r7.A1T
            if (r0 != 0) goto L_0x0249
            r14 = 0
        L_0x0195:
            android.widget.ImageView r0 = r6.A04
            if (r14 != r3) goto L_0x0243
            if (r0 != 0) goto L_0x01d2
            android.widget.ImageView r0 = X.C86614Ku.A0H(r5)
            r6.A04 = r0
            android.widget.LinearLayout$LayoutParams r9 = new android.widget.LinearLayout$LayoutParams
            r9.<init>(r2, r2)
            r9.gravity = r10
            android.widget.ImageView r0 = r6.A04
            r0.setLayoutParams(r9)
            X.33j r9 = r5.A0M
            android.widget.ImageView r2 = r6.A04
            int r0 = X.C86624Kv.A01(r5)
            X.C107555bV.A05(r2, r9, r1, r0)
            android.widget.ImageView r9 = r6.A04
            android.view.View[] r2 = new android.view.View[r11]
            android.widget.ImageView r0 = r6.A05
            r2[r1] = r0
            android.widget.ImageView r0 = r6.A03
            r2[r3] = r0
            r2[r8] = r9
            r2[r16] = r4
            int r0 = X.C154307cx.A00(r2, r8)
            r12.addView(r9, r0)
            r12.setClipChildren(r1)
        L_0x01d2:
            android.widget.ImageView r8 = r6.A04
            android.content.Context r3 = r5.getContext()
            X.C162457s7.A0J(r3, r1)
            r2 = 2131234257(0x7f080dd1, float:1.8084675E38)
            r0 = 2131101883(0x7f0608bb, float:1.7816188E38)
            android.graphics.drawable.Drawable r0 = X.C107335b8.A04(r3, r2, r0)
            r8.setImageDrawable(r0)
            android.widget.ImageView r0 = r6.A04
            r0.setVisibility(r1)
        L_0x01ed:
            X.2z0 r8 = r7.A1J
            boolean r3 = r8.A02
            if (r3 == 0) goto L_0x0213
            android.widget.ImageView r9 = r6.A08
            if (r9 == 0) goto L_0x0213
            int r0 = r7.A0D
            int r2 = r5.A19(r0)
            int r0 = r7.A0D
            int r1 = r5.A1A(r0)
            if (r1 == 0) goto L_0x020d
            android.content.Context r0 = r5.getContext()
            android.content.res.ColorStateList r4 = X.AnonymousClass0Y8.A07(r0, r1)
        L_0x020d:
            X.C05040Rr.A00(r4, r9)
            r9.setImageResource(r2)
        L_0x0213:
            boolean r0 = r13.A0c
            if (r0 == 0) goto L_0x0225
            boolean r0 = r13.A0a
            if (r0 != 0) goto L_0x0225
            r18.A01()
        L_0x021e:
            com.whatsapp.stickers.StickerView r1 = r6.A0C
            r0 = 5
            X.C1237169m.A00(r1, r7, r6, r0)
            return
        L_0x0225:
            boolean r0 = r13.A0R
            if (r0 == 0) goto L_0x022f
            boolean r0 = r13.A0Z
            if (r0 == 0) goto L_0x023b
            if (r3 != 0) goto L_0x023b
        L_0x022f:
            boolean r0 = r7.A1B
            if (r0 == 0) goto L_0x023f
            if (r3 == 0) goto L_0x023f
            X.4uZ r0 = r8.A00
            boolean r0 = r0 instanceof X.AnonymousClass1fS
            if (r0 != 0) goto L_0x023f
        L_0x023b:
            r18.A02()
            goto L_0x021e
        L_0x023f:
            r18.A00()
            goto L_0x021e
        L_0x0243:
            if (r0 == 0) goto L_0x01ed
            r0.setVisibility(r9)
            goto L_0x01ed
        L_0x0249:
            int r14 = r0.A00
            goto L_0x0195
        L_0x024d:
            if (r0 == 0) goto L_0x0188
            r0.setVisibility(r9)
            goto L_0x0188
        L_0x0254:
            if (r0 == 0) goto L_0x0128
            r0.setVisibility(r9)
            goto L_0x0128
        L_0x025b:
            android.widget.LinearLayout r9 = r6.A06
            if (r9 == 0) goto L_0x00ae
            X.5Rh r8 = r5.A0I
            X.2sr r1 = r5.A0Z
            java.util.List r0 = java.util.Collections.emptyList()
            X.5iB r10 = new X.5iB
            r10.<init>(r1, r0)
            r2 = 0
            r0 = 21
            X.3bw r12 = new X.3bw
            r12.<init>(r6, r0, r11)
            r0 = 22
            X.3bw r1 = new X.3bw
            r1.<init>(r6, r0, r11)
            r13 = 0
            goto L_0x00a4
        L_0x027e:
            r2.A01 = r4
            goto L_0x004b
        L_0x0282:
            r3 = 0
            goto L_0x004b
        L_0x0285:
            android.view.View r0 = r6.A02
            X.C86604Kt.A1A(r0)
            goto L_0x0030
        L_0x028c:
            com.whatsapp.stickers.StickerView r0 = r6.A0C
            r0.setImageDrawable(r4)
            r0.setOnLongClickListener(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5TP.A01(X.1mV, boolean):void");
    }
}
