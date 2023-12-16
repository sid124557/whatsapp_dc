package X;

import android.content.Context;
import android.content.res.Resources;
import android.widget.ImageView;

/* renamed from: X.3be  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C71153be implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ Context A03;
    public final /* synthetic */ Resources A04;
    public final /* synthetic */ ImageView A05;
    public final /* synthetic */ C51912ka A06;
    public final /* synthetic */ C43182Rc A07;
    public final /* synthetic */ C60622yr A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00fe, code lost:
        if (r3 != 2) goto L_0x0100;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r20 = this;
            r0 = r20
            X.2Rc r15 = r0.A07
            int r10 = r0.A00
            java.lang.String r2 = r0.A09
            java.lang.String r6 = r0.A0A
            int r8 = r0.A01
            int r7 = r0.A02
            android.content.res.Resources r5 = r0.A04
            android.widget.ImageView r13 = r0.A05
            android.content.Context r14 = r0.A03
            X.2ka r4 = r0.A06
            X.2yr r11 = r0.A08
            X.2Wp r9 = r15.A01
            java.io.File r0 = r9.A00(r2, r10)
            if (r0 == 0) goto L_0x00da
            boolean r0 = r0.exists()
        L_0x0024:
            java.lang.String r3 = "lottie"
            if (r0 == 0) goto L_0x009f
            java.lang.String r0 = "PrivacyDisclosureIconRender/renderIcon load from file cache"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            boolean r0 = X.C162457s7.A0P(r6, r3)
            if (r0 == 0) goto L_0x0063
            java.io.File r7 = r9.A00(r2, r10)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "PrivacyDisclosureFileCache/loadAnimation icon file path: "
            X.C18260x0.A1P(r1, r0, r7)
            java.io.FileInputStream r7 = X.AnonymousClass0x9.A0g(r7)
            r0 = 1024(0x400, float:1.435E-42)
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream
            r1.<init>(r7, r0)
            r0 = 0
            X.0Tu r0 = X.AnonymousClass0YR.A03(r1, r0)
            java.lang.Object r7 = r0.A00
            if (r7 == 0) goto L_0x009f
            X.3gB r2 = r15.A04
            X.46A r1 = X.AnonymousClass2C4.A03
            r0 = 45
            X.3Zz r10 = new X.3Zz
            r10.<init>(r13, r0, r7)
        L_0x005f:
            r2.A01(r10, r1)
        L_0x0062:
            return
        L_0x0063:
            X.C162457s7.A0H(r5)
            r0 = 4
            java.lang.StringBuilder r1 = X.C18280x3.A0g(r5, r0)
            java.lang.String r0 = "PrivacyDisclosureFileCache/loadDisclosureIcon "
            r1.append(r0)
            r1.append(r10)
            r0 = 32
            r1.append(r0)
            X.C18260x0.A1J(r1, r2)
            java.io.File r1 = r9.A00(r2, r10)
            if (r1 == 0) goto L_0x009f
            X.5WB r0 = new X.5WB
            r0.<init>(r8, r7)
            X.7KE r0 = X.C107245ax.A06(r0, r1)
            android.graphics.Bitmap r0 = r0.A02
            if (r0 == 0) goto L_0x009f
            android.graphics.drawable.BitmapDrawable r12 = new android.graphics.drawable.BitmapDrawable
            r12.<init>(r5, r0)
            X.3gB r2 = r15.A04
            X.46A r1 = X.AnonymousClass2C4.A03
            r15 = 12
            X.3ac r10 = new X.3ac
            r10.<init>(r11, r12, r13, r14, r15)
            goto L_0x005f
        L_0x009f:
            java.lang.String r0 = "PrivacyDisclosureIconRender/renderIcon load from fallback"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            boolean r0 = X.C162457s7.A0P(r6, r3)
            if (r0 == 0) goto L_0x00e7
            boolean r0 = r13 instanceof com.airbnb.lottie.LottieAnimationView
            if (r0 == 0) goto L_0x0062
            X.20f r0 = r4.A01
            int r1 = r0.ordinal()
            r0 = 0
            if (r1 != r0) goto L_0x00dd
            boolean r1 = X.C107405bG.A0D(r14)
            r0 = 2132017156(0x7f140004, float:1.9672582E38)
            if (r1 == 0) goto L_0x00c3
            r0 = 2132017155(0x7f140003, float:1.967258E38)
        L_0x00c3:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 == 0) goto L_0x00dd
            int r3 = r0.intValue()
            X.3Wi r2 = r15.A00
            r1 = 48
            X.5sM r0 = new X.5sM
            r0.<init>((java.lang.Object) r13, (int) r3, (int) r1)
            r2.A0S(r0)
            return
        L_0x00da:
            r0 = 0
            goto L_0x0024
        L_0x00dd:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "PrivacyDisclosureIconRender/getDefaultAnimation no defaultAnimation for "
            X.C18260x0.A1P(r1, r0, r4)
            return
        L_0x00e7:
            X.C162457s7.A0H(r5)
            X.20f r0 = r4.A01
            int r1 = r0.ordinal()
            r0 = 0
            if (r1 == r0) goto L_0x0128
            r0 = 1
            int r3 = r4.A00
            if (r3 == 0) goto L_0x0100
            if (r3 == r0) goto L_0x0124
            r0 = 2
            r1 = 2131232148(0x7f080594, float:1.8080397E38)
            if (r3 == r0) goto L_0x0103
        L_0x0100:
            r1 = 2131232144(0x7f080590, float:1.8080389E38)
        L_0x0103:
            r0 = 0
            android.graphics.drawable.Drawable r17 = X.C02680He.A00(r0, r5, r1)
        L_0x0108:
            if (r17 != 0) goto L_0x0113
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "PrivacyDisclosureIconRender/getDefaultDrawable no defaultDrawble for "
            X.C18260x0.A1P(r1, r0, r4)
        L_0x0113:
            X.3Wi r0 = r15.A00
            r19 = 24
            X.3cN r14 = new X.3cN
            r16 = r13
            r18 = r2
            r14.<init>(r15, r16, r17, r18, r19)
            r0.A0S(r14)
            return
        L_0x0124:
            r1 = 2131232146(0x7f080592, float:1.8080393E38)
            goto L_0x0103
        L_0x0128:
            r1 = 0
            r0 = 2131232150(0x7f080596, float:1.8080401E38)
            android.graphics.drawable.Drawable r17 = X.C02680He.A00(r1, r5, r0)
            goto L_0x0108
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71153be.run():void");
    }

    public /* synthetic */ C71153be(Context context, Resources resources, ImageView imageView, C51912ka r4, C43182Rc r5, C60622yr r6, String str, String str2, int i, int i2, int i3) {
        this.A07 = r5;
        this.A00 = i;
        this.A09 = str;
        this.A0A = str2;
        this.A01 = i2;
        this.A02 = i3;
        this.A04 = resources;
        this.A05 = imageView;
        this.A03 = context;
        this.A06 = r4;
        this.A08 = r6;
    }
}
