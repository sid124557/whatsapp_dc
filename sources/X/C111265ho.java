package X;

import android.graphics.Color;
import android.widget.FrameLayout;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.5ho  reason: invalid class name and case insensitive filesystem */
public abstract class C111265ho implements C184998st {
    public C833748d A00;
    public boolean A01;
    public final FrameLayout A02;
    public final AnonymousClass5S3 A03;
    public final AnonymousClass5HH A04;
    public final AnonymousClass1VX A05;
    public final AnonymousClass4FS A06;
    public final AnonymousClass66R A07 = C154517dI.A01(new C118865w3(this));
    public final AnonymousClass66R A08 = C154517dI.A01(new C118875w4(this));

    public C111265ho(FrameLayout frameLayout, AnonymousClass5S3 r3, AnonymousClass5HH r4, AnonymousClass1VX r5, AnonymousClass4FS r6) {
        C162457s7.A0J(r3, 1);
        C18260x0.A0b(r6, r4, r5, 3);
        this.A03 = r3;
        this.A02 = frameLayout;
        this.A06 = r6;
        this.A04 = r4;
        this.A05 = r5;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x012e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.AnonymousClass5K6 r13) {
        /*
            r12 = this;
            r2 = 0
            boolean r4 = r12 instanceof X.C90144fu
            if (r4 == 0) goto L_0x0159
            X.48d r3 = r13.A02
        L_0x0007:
            r1 = r12
            if (r4 == 0) goto L_0x0143
            X.4fu r1 = (X.C90144fu) r1
            boolean r0 = r1.A00
        L_0x000e:
            if (r0 == 0) goto L_0x00ea
            if (r3 == 0) goto L_0x00ea
            X.48d r0 = r12.A00
            if (r0 != 0) goto L_0x0023
            android.widget.FrameLayout r1 = r12.A02
            X.66R r0 = r12.A07
            java.lang.Object r0 = X.C18300x5.A0d(r0)
            android.view.View r0 = (android.view.View) r0
            r1.addView(r0)
        L_0x0023:
            r12.A00 = r3
            X.66R r4 = r12.A07
            java.lang.Object r0 = X.C18300x5.A0d(r4)
            boolean r0 = r0 instanceof com.whatsapp.wds.components.banners.WDSBanner
            if (r0 == 0) goto L_0x0135
            java.lang.Object r5 = X.C18300x5.A0d(r4)
            android.view.View r5 = (android.view.View) r5
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.wds.components.banners.WDSBanner"
            X.C162457s7.A0K(r5, r0)
            com.whatsapp.wds.components.banners.WDSBanner r5 = (com.whatsapp.wds.components.banners.WDSBanner) r5
            X.C162457s7.A0J(r5, r2)
            com.whatsapp.WaTextView r1 = r5.A02
            if (r1 == 0) goto L_0x0047
            r0 = 5
            r1.setTextDirection(r0)
        L_0x0047:
            r9 = r3
            X.3YL r9 = (X.AnonymousClass3YL) r9
            X.2TD r6 = r9.A07
            if (r6 == 0) goto L_0x00bf
            android.content.Context r8 = X.C18290x4.A0F(r5)
            X.2Ru r0 = r6.A01
            if (r0 == 0) goto L_0x0131
            java.lang.String r7 = r0.A02
            boolean r0 = X.C107575bX.A0F(r7)
            if (r0 != 0) goto L_0x0131
            java.lang.String r1 = r6.A05
            java.lang.String r0 = ""
            if (r1 != 0) goto L_0x0065
            r1 = r0
        L_0x0065:
            if (r7 == 0) goto L_0x0068
            r0 = r7
        L_0x0068:
            android.text.Spanned r7 = X.AnonymousClass5VU.A01(r8, r1, r0)
        L_0x006c:
            X.2Iu r10 = r9.A06
            r11 = 0
            if (r10 == 0) goto L_0x012e
            java.util.Map r1 = r10.A00
            java.lang.String r0 = "wa_wds_icon"
            java.lang.String r8 = X.C18310x6.A0o(r0, r1)
        L_0x0079:
            X.2PK r0 = r6.A04
            if (r0 == 0) goto L_0x007f
            byte[] r11 = r0.A02
        L_0x007f:
            android.content.res.Resources r9 = r5.getResources()
            X.C162457s7.A0D(r9)
            r1 = 1
            if (r8 == 0) goto L_0x0120
            int r0 = r8.length()
            if (r0 == 0) goto L_0x0120
            r12.A01 = r1
            r0 = 2
            byte[] r0 = android.util.Base64.decode(r8, r0)
            X.C162457s7.A0D(r0)
            X.56g r8 = new X.56g
            r8.<init>(r9, r0)
        L_0x009e:
            if (r7 == 0) goto L_0x00bf
            X.5OR r9 = new X.5OR
            r9.<init>()
            boolean r0 = r12 instanceof X.C90104fq
            if (r0 == 0) goto L_0x00ee
            if (r8 == 0) goto L_0x00eb
            X.56c r0 = new X.56c
            r0.<init>(r8)
        L_0x00b0:
            r9.A02 = r0
            java.lang.String r0 = r6.A06
            r9.A04 = r0
            r9.A03 = r7
            X.5KM r0 = r9.A00()
            r5.setState(r0)
        L_0x00bf:
            X.639 r1 = new X.639
            r1.<init>(r13, r12, r3)
            r0 = 4
            X.C18320x8.A15(r5, r1, r0)
            X.638 r6 = new X.638
            r6.<init>(r13, r12, r3)
            r1 = 5
            X.5f1 r0 = new X.5f1
            r0.<init>((java.lang.Object) r6, (int) r1)
            r5.setOnDismissListener((android.view.View.OnClickListener) r0)
        L_0x00d6:
            java.lang.Object r0 = X.C18300x5.A0d(r4)
            android.view.View r0 = (android.view.View) r0
            r0.setVisibility(r2)
            X.48d r2 = r12.A00
            if (r2 == 0) goto L_0x00ea
            X.4FS r1 = r12.A06
            r0 = 27
            X.C117165rU.A00(r1, r12, r2, r0)
        L_0x00ea:
            return
        L_0x00eb:
            X.56Z r0 = X.AnonymousClass56Z.A00
            goto L_0x00b0
        L_0x00ee:
            if (r10 == 0) goto L_0x0110
            java.util.Map r1 = r10.A00
            java.lang.String r0 = "wa_wds_style"
            java.lang.Object r1 = r1.get(r0)
        L_0x00f8:
            java.lang.String r0 = "default"
            boolean r0 = X.C162457s7.A0P(r1, r0)
            if (r0 != 0) goto L_0x0115
            java.lang.String r0 = "warning"
            boolean r0 = X.C162457s7.A0P(r1, r0)
            if (r0 == 0) goto L_0x0115
            if (r8 == 0) goto L_0x0112
            X.56d r0 = new X.56d
            r0.<init>(r8)
            goto L_0x00b0
        L_0x0110:
            r1 = 0
            goto L_0x00f8
        L_0x0112:
            X.56a r0 = X.C995156a.A00
            goto L_0x00b0
        L_0x0115:
            if (r8 == 0) goto L_0x011d
            X.56b r0 = new X.56b
            r0.<init>(r8)
            goto L_0x00b0
        L_0x011d:
            X.56Y r0 = X.AnonymousClass56Y.A00
            goto L_0x00b0
        L_0x0120:
            if (r11 == 0) goto L_0x012b
            r12.A01 = r1
            X.56g r8 = new X.56g
            r8.<init>(r9, r11)
            goto L_0x009e
        L_0x012b:
            r8 = 0
            goto L_0x009e
        L_0x012e:
            r8 = r11
            goto L_0x0079
        L_0x0131:
            java.lang.String r7 = r6.A05
            goto L_0x006c
        L_0x0135:
            X.66R r0 = r12.A08
            java.lang.Object r1 = r0.getValue()
            X.5K7 r1 = (X.AnonymousClass5K7) r1
            X.48d r0 = r12.A00
            r12.A02(r13, r1, r0)
            goto L_0x00d6
        L_0x0143:
            boolean r0 = r12 instanceof X.C90134ft
            if (r0 == 0) goto L_0x014d
            X.4ft r1 = (X.C90134ft) r1
            boolean r0 = r1.A00
            goto L_0x000e
        L_0x014d:
            X.4fp r1 = (X.C90094fp) r1
            X.1VX r1 = r1.A00
            r0 = 3712(0xe80, float:5.202E-42)
            boolean r0 = r1.A0X(r0)
            goto L_0x000e
        L_0x0159:
            boolean r0 = r12 instanceof X.C90134ft
            if (r0 == 0) goto L_0x0161
            X.48d r3 = r13.A01
            goto L_0x0007
        L_0x0161:
            X.48d r3 = r13.A00
            goto L_0x0007
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C111265ho.A01(X.5K6):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x006a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(X.AnonymousClass5K6 r11, X.AnonymousClass5K7 r12, X.C833748d r13) {
        /*
            r10 = this;
            r7 = 0
            X.C162457s7.A0J(r12, r7)
            r2 = 0
            if (r13 == 0) goto L_0x00b0
            r0 = r13
            X.3YL r0 = (X.AnonymousClass3YL) r0
            X.2TD r6 = r0.A07
            if (r6 == 0) goto L_0x00b0
            android.widget.FrameLayout r5 = r10.A02
            android.content.res.Resources r4 = r5.getResources()
            android.widget.TextView r3 = r12.A04
            X.2Ru r0 = r6.A01
            if (r0 == 0) goto L_0x00ad
            java.lang.String r8 = r0.A02
            boolean r0 = X.C107575bX.A0F(r8)
            if (r0 != 0) goto L_0x00ad
            android.content.Context r9 = r5.getContext()
            android.content.Context r2 = r5.getContext()
            r1 = 2130968626(0x7f040032, float:1.754591E38)
            r0 = 2131099690(0x7f06002a, float:1.781174E38)
            int r2 = X.AnonymousClass5Yj.A03(r2, r9, r1, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = r6.A05
            r1.append(r0)
            java.lang.String r0 = " <b><font color=\""
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = "\">"
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = "</b></font>"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            android.text.Spanned r0 = X.AnonymousClass0x9.A0B(r0)
        L_0x0057:
            r3.setText(r0)
            r0 = 5
            r3.setTextDirection(r0)
            android.content.Context r0 = r5.getContext()
            boolean r2 = X.C107405bG.A0D(r0)
            X.2PK r3 = r6.A04
            if (r3 == 0) goto L_0x008c
            if (r2 == 0) goto L_0x00aa
            byte[] r1 = r3.A01
        L_0x006e:
            if (r1 == 0) goto L_0x008c
            X.C162457s7.A0H(r4)
            int r0 = r1.length
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeByteArray(r1, r7, r0)
            if (r1 == 0) goto L_0x008c
            android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable
            r0.<init>(r4, r1)
            android.widget.ImageView r1 = r12.A02
            r1.setImageDrawable(r0)
            java.lang.String r0 = r3.A00
            r1.setContentDescription(r0)
            r0 = 1
            r10.A01 = r0
        L_0x008c:
            android.view.View r1 = r12.A00
            int r0 = r10.A00(r13, r2)
            r1.setBackgroundColor(r0)
            X.639 r1 = new X.639
            r1.<init>(r11, r10, r13)
            r0 = 6
            X.C18320x8.A15(r5, r1, r0)
            android.widget.ImageView r2 = r12.A03
            X.638 r1 = new X.638
            r1.<init>(r11, r10, r13)
            r0 = 7
            X.C18320x8.A15(r2, r1, r0)
            return
        L_0x00aa:
            byte[] r1 = r3.A02
            goto L_0x006e
        L_0x00ad:
            java.lang.String r0 = r6.A05
            goto L_0x0057
        L_0x00b0:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "InAppBannerQP/setViewProperties viewHolder:"
            r1.append(r0)
            r1.append(r12)
            java.lang.String r0 = " primaryCreative:"
            r1.append(r0)
            if (r13 == 0) goto L_0x00c7
            X.3YL r13 = (X.AnonymousClass3YL) r13
            X.2TD r2 = r13.A07
        L_0x00c7:
            X.C18260x0.A0n(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C111265ho.A02(X.5K6, X.5K7, X.48d):void");
    }

    public int A00(C833748d r6, boolean z) {
        String str;
        C41062Iu r4 = ((AnonymousClass3YL) r6).A06;
        FrameLayout frameLayout = this.A02;
        int A032 = AnonymousClass5Yj.A03(frameLayout.getContext(), frameLayout.getContext(), R.attr.f3nameremoved, R.color.f5nameremoved);
        if (r4 != null) {
            Map map = r4.A00;
            if (z) {
                str = "colors_DarkBackground";
            } else {
                str = "colors_LightBackground";
            }
            String A0o = C18310x6.A0o(str, map);
            if (!C107575bX.A0F(A0o)) {
                try {
                    return Color.parseColor(AnonymousClass0x2.A0e(A0o, AnonymousClass001.A0o(), '#'));
                } catch (IllegalArgumentException unused) {
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    A0o2.append("InAppBannerQP/Illegal Argument exception parsing color:");
                    A0o2.append(A0o);
                    Log.e(AnonymousClass000.A0b(", isDarkMode?", A0o2, z));
                }
            }
        }
        return A032;
    }

    public void BFb() {
        C86634Kw.A1R(C18300x5.A0d(this.A07));
    }

    public boolean Bo4() {
        return false;
    }

    public void BrS() {
    }
}
