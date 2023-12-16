package X;

import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.expressionstray.stickers.StickerExpressionsFragment;

/* renamed from: X.11j  reason: invalid class name and case insensitive filesystem */
public final class C194911j extends AnonymousClass09G {
    public final StickerExpressionsFragment A00;

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        C162457s7.A0J(viewGroup, 0);
        int i2 = R.layout.f8nameremoved;
        if (i == 1) {
            i2 = R.layout.f8nameremoved;
        }
        return new AnonymousClass12Z(C18300x5.A0F(C18280x3.A0D(viewGroup), viewGroup, i2));
    }

    public C194911j(StickerExpressionsFragment stickerExpressionsFragment) {
        super((AnonymousClass0O4) new AnonymousClass11Z());
        this.A00 = stickerExpressionsFragment;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x004e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void BNf(X.C05570Ua r12, int r13) {
        /*
            r11 = this;
            X.12Z r12 = (X.AnonymousClass12Z) r12
            r0 = 0
            X.C162457s7.A0J(r12, r0)
            java.lang.Object r6 = r11.A0K(r13)
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.expressionstray.stickers.packlist.StickerPackListViewData"
            X.C162457s7.A0K(r6, r0)
            X.2ix r6 = (X.C50902ix) r6
            com.whatsapp.expressionstray.stickers.StickerExpressionsFragment r5 = r11.A00
            X.C18270x1.A14(r6, r5)
            boolean r4 = r6 instanceof X.AnonymousClass1UP
            java.lang.String r3 = "starred"
            java.lang.String r2 = "recent"
            if (r4 == 0) goto L_0x00c5
            r0 = r6
            X.1UP r0 = (X.AnonymousClass1UP) r0
            java.lang.String r0 = r0.A03
        L_0x0026:
            com.google.android.material.imageview.ShapeableImageView r1 = r12.A02
            if (r0 == 0) goto L_0x00bf
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r1.setImageURI(r0)
        L_0x0031:
            com.google.android.material.imageview.ShapeableImageView r8 = r12.A02
            boolean r10 = r6.A01()
            r8.setSelected(r10)
            android.view.View r7 = r12.A01
            r0 = 4
            X.C18310x6.A19(r7, r5, r6, r0)
            com.whatsapp.WaImageView r9 = r12.A03
            r1 = 0
            int r0 = X.AnonymousClass001.A08(r10)
            r9.setVisibility(r0)
            boolean r0 = r6 instanceof X.AnonymousClass1UO
            if (r0 == 0) goto L_0x00a7
            r0 = r6
            X.1UO r0 = (X.AnonymousClass1UO) r0
            java.lang.String r0 = r0.A01
        L_0x0053:
            r8.setContentDescription(r0)
            boolean r0 = r6 instanceof X.AnonymousClass1UQ
            if (r0 == 0) goto L_0x0068
            android.view.View r4 = r12.A00
            r0 = r6
            X.1UQ r0 = (X.AnonymousClass1UQ) r0
            boolean r0 = r0.A03
            if (r0 != 0) goto L_0x0065
            r1 = 8
        L_0x0065:
            r4.setVisibility(r1)
        L_0x0068:
            X.2UW r4 = r6.A00()
            boolean r0 = r4 instanceof X.C23571Tt
            if (r0 == 0) goto L_0x012f
            r0 = r4
            X.1Tt r0 = (X.C23571Tt) r0
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x012f
            android.view.View r0 = r12.A0H
            android.content.Context r1 = r0.getContext()
            r0 = 2131101268(0x7f060654, float:1.781494E38)
            int r0 = X.AnonymousClass0Y8.A04(r1, r0)
            r8.setColorFilter(r0)
            java.lang.String r1 = r4.A00()
            boolean r0 = X.C162457s7.A0P(r1, r2)
            if (r0 == 0) goto L_0x009c
            r1 = 23
        L_0x0093:
            X.39p r0 = new X.39p
            r0.<init>((com.whatsapp.expressionstray.stickers.StickerExpressionsFragment) r5, (int) r1)
        L_0x0098:
            r7.setOnClickListener(r0)
            return
        L_0x009c:
            boolean r0 = X.C162457s7.A0P(r1, r3)
            if (r0 == 0) goto L_0x00a5
            r1 = 24
            goto L_0x0093
        L_0x00a5:
            r0 = 0
            goto L_0x0098
        L_0x00a7:
            boolean r0 = r6 instanceof X.AnonymousClass1UQ
            if (r0 == 0) goto L_0x00b1
            r0 = r6
            X.1UQ r0 = (X.AnonymousClass1UQ) r0
            java.lang.String r0 = r0.A01
            goto L_0x0053
        L_0x00b1:
            if (r4 == 0) goto L_0x00b9
            r0 = r6
            X.1UP r0 = (X.AnonymousClass1UP) r0
            java.lang.String r0 = r0.A02
            goto L_0x0053
        L_0x00b9:
            r0 = r6
            X.1UN r0 = (X.AnonymousClass1UN) r0
            java.lang.String r0 = r0.A02
            goto L_0x0053
        L_0x00bf:
            r0 = 0
            r1.setImageDrawable(r0)
            goto L_0x0031
        L_0x00c5:
            boolean r0 = r6 instanceof X.AnonymousClass1UN
            if (r0 == 0) goto L_0x0119
            com.google.android.material.imageview.ShapeableImageView r7 = r12.A02
            r0 = r6
            X.1UN r0 = (X.AnonymousClass1UN) r0
            int r0 = r0.A00
            r7.setImageResource(r0)
            boolean r0 = r6.A01()
            r1 = 2131101268(0x7f060654, float:1.781494E38)
            if (r0 == 0) goto L_0x00df
            r1 = 2131102845(0x7f060c7d, float:1.781814E38)
        L_0x00df:
            android.view.View r0 = r12.A0H
            android.content.Context r0 = r0.getContext()
            X.AnonymousClass0x2.A0p(r0, r7, r1)
            X.2UW r0 = r6.A00()
            java.lang.String r1 = r0.A00()
            boolean r0 = X.C162457s7.A0P(r1, r2)
            if (r0 != 0) goto L_0x00fc
            boolean r0 = X.C162457s7.A0P(r1, r3)
            if (r0 == 0) goto L_0x0031
        L_0x00fc:
            boolean r0 = X.C1001059l.A04
            if (r0 == 0) goto L_0x0031
            android.content.res.Resources r1 = X.C18290x4.A0G(r7)
            r0 = 2131165362(0x7f0700b2, float:1.7944939E38)
            int r1 = r1.getDimensionPixelSize(r0)
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            r0.width = r1
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            r0.height = r1
            goto L_0x0031
        L_0x0119:
            boolean r0 = r6 instanceof X.AnonymousClass1UQ
            if (r0 == 0) goto L_0x0124
            r0 = r6
            X.1UQ r0 = (X.AnonymousClass1UQ) r0
            java.lang.String r0 = r0.A02
            goto L_0x0026
        L_0x0124:
            boolean r0 = r6 instanceof X.AnonymousClass1UO
            if (r0 == 0) goto L_0x0031
            r0 = r6
            X.1UO r0 = (X.AnonymousClass1UO) r0
            java.lang.String r0 = r0.A02
            goto L_0x0026
        L_0x012f:
            r8.clearColorFilter()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C194911j.BNf(X.0Ua, int):void");
    }

    public int getItemViewType(int i) {
        Object A0K = A0K(i);
        if ((A0K instanceof AnonymousClass1UP) || (A0K instanceof AnonymousClass1UO) || (A0K instanceof AnonymousClass1UQ)) {
            return 0;
        }
        if (A0K instanceof AnonymousClass1UN) {
            return 1;
        }
        throw C73153f1.A00();
    }
}
