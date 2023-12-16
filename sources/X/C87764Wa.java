package X;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.whatsapp.R;

/* renamed from: X.4Wa  reason: invalid class name and case insensitive filesystem */
public class C87764Wa extends AnonymousClass0R6 {
    public final Activity A00;
    public final AnonymousClass0QY A01;
    public final AnonymousClass64J A02;
    public final AnonymousClass2FF A03;
    public final AnonymousClass5ZU A04;
    public final C105365Uq A05;
    public final C620733j A06;
    public final C56892sj A07;
    public final C59862xc A08;

    public int A0G() {
        return this.A01.A03;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00f4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void BNf(X.C05570Ua r11, int r12) {
        /*
            r10 = this;
            X.4Yb r11 = (X.C88264Yb) r11
            X.0QY r0 = r10.A01
            java.lang.Object r8 = r0.A01(r12)
            X.3ZH r8 = (X.AnonymousClass3ZH) r8
            X.5ZU r7 = r10.A04
            X.5Uq r2 = r10.A05
            X.2FF r6 = r10.A03
            X.2Ls r0 = r8.A0J
            if (r0 == 0) goto L_0x00fb
            int r1 = r0.A00
            r0 = 3
            if (r1 != r0) goto L_0x00fb
            com.whatsapp.components.button.ThumbnailButton r9 = r11.A03
            X.2xc r5 = r11.A05
            android.content.res.Resources r4 = r9.getResources()
            boolean r0 = X.C1001059l.A03
            r3 = 2131231003(0x7f08011b, float:1.8078075E38)
            if (r0 == 0) goto L_0x002b
            r3 = 2131231004(0x7f08011c, float:1.8078077E38)
        L_0x002b:
            r0 = 1
            X.922 r2 = new X.922
            r2.<init>(r0)
            r1 = 0
            X.1VX r0 = r5.A00
            android.graphics.drawable.Drawable r0 = X.C59862xc.A00(r1, r4, r2, r0, r3)
        L_0x0038:
            r9.setImageDrawable(r0)
        L_0x003b:
            X.2Ls r0 = r8.A0J
            if (r0 == 0) goto L_0x00f4
            int r1 = r0.A00
            r0 = 3
            if (r1 != r0) goto L_0x00f4
            X.5YB r0 = r11.A01
            r1 = 2131887935(0x7f12073f, float:1.9410491E38)
            com.whatsapp.TextEmojiLabel r0 = r0.A02
            r0.setText(r1)
        L_0x004e:
            X.2Ls r0 = r8.A0J
            if (r0 == 0) goto L_0x00b3
            int r1 = r0.A00
            r0 = 3
            if (r1 != r0) goto L_0x00b3
            com.whatsapp.TextEmojiLabel r0 = r11.A00
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131886430(0x7f12015e, float:1.9407439E38)
        L_0x0060:
            java.lang.CharSequence r1 = r1.getText(r0)
        L_0x0064:
            com.whatsapp.TextEmojiLabel r0 = r11.A00
            r2 = 0
            r0.A0K(r2, r1)
            X.2Ls r0 = r8.A0J
            if (r0 == 0) goto L_0x00aa
            int r1 = r0.A00
            r0 = 3
            if (r1 != r0) goto L_0x00aa
            com.whatsapp.WaImageButton r4 = r11.A02
            r4.setOnClickListener(r2)
            r0 = 4
        L_0x0079:
            r4.setVisibility(r0)
            android.content.Context r1 = r4.getContext()
            r0 = 2131893004(0x7f121b0c, float:1.9420772E38)
            X.C18300x5.A13(r1, r4, r0)
            android.content.Context r5 = r4.getContext()
            r2 = 2131886183(0x7f120067, float:1.9406938E38)
            java.lang.Object[] r1 = X.AnonymousClass002.A0L()
            r0 = -1
            r3 = 0
            java.lang.String r0 = r7.A0R(r8, r0, r3)
            java.lang.String r2 = X.AnonymousClass002.A0F(r5, r0, r1, r3, r2)
            r0 = 1
            X.7Go[] r1 = new X.C148007Go[r0]
            X.6eS r0 = new X.6eS
            r0.<init>(r2)
            r1[r3] = r0
            r0 = 1
            X.C86614Ku.A1H(r4, r1, r0)
            return
        L_0x00aa:
            com.whatsapp.WaImageButton r4 = r11.A02
            r0 = 10
            X.AnonymousClass547.A00(r4, r8, r11, r6, r0)
            r0 = 0
            goto L_0x0079
        L_0x00b3:
            java.lang.Class<X.1fK> r1 = X.C28001fK.class
            com.whatsapp.jid.Jid r0 = r8.A0I(r1)
            if (r0 == 0) goto L_0x00db
            com.whatsapp.jid.Jid r1 = X.AnonymousClass3ZH.A05(r8, r1)
            X.1fL r1 = (X.C28011fL) r1
            X.2sj r0 = r11.A04
            X.33k r0 = X.C56892sj.A01(r0, r1)
            X.6aS r0 = r0.A04()
            int r0 = r0.size()
            if (r0 > 0) goto L_0x00e9
            com.whatsapp.TextEmojiLabel r0 = r11.A00
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131895597(0x7f12252d, float:1.9426032E38)
            goto L_0x0060
        L_0x00db:
            java.lang.Class<X.1fL> r1 = X.C28011fL.class
            com.whatsapp.jid.Jid r0 = r8.A0I(r1)
            if (r0 == 0) goto L_0x00f0
            com.whatsapp.jid.Jid r1 = X.AnonymousClass3ZH.A05(r8, r1)
            X.1fL r1 = (X.C28011fL) r1
        L_0x00e9:
            r0 = 1
            java.lang.String r1 = r7.A0U(r1, r0, r0)
            goto L_0x0064
        L_0x00f0:
            java.lang.String r1 = ""
            goto L_0x0064
        L_0x00f4:
            X.5YB r0 = r11.A01
            r0.A08(r8)
            goto L_0x004e
        L_0x00fb:
            if (r2 == 0) goto L_0x0104
            com.whatsapp.components.button.ThumbnailButton r0 = r11.A03
            r2.A08(r0, r8)
            goto L_0x003b
        L_0x0104:
            com.whatsapp.components.button.ThumbnailButton r9 = r11.A03
            X.2xc r5 = r11.A05
            android.content.res.Resources r4 = r9.getResources()
            android.content.res.Resources$Theme r3 = X.C86614Ku.A0C(r9)
            r0 = 1
            X.6B0 r2 = new X.6B0
            r2.<init>(r0)
            r1 = 2131231014(0x7f080126, float:1.8078097E38)
            X.1VX r0 = r5.A00
            android.graphics.drawable.Drawable r0 = X.C59862xc.A00(r3, r4, r2, r0, r1)
            goto L_0x0038
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C87764Wa.BNf(X.0Ua, int):void");
    }

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        C59862xc r4 = this.A08;
        C56892sj r3 = this.A07;
        return new C88264Yb(AnonymousClass001.A0R(LayoutInflater.from(this.A00), viewGroup, R.layout.f8nameremoved), this.A02, r3, r4);
    }

    public C87764Wa(Activity activity, AnonymousClass64J r5, AnonymousClass2FF r6, AnonymousClass5ZU r7, C105365Uq r8, C620733j r9, C56892sj r10, C59862xc r11) {
        this.A04 = r7;
        this.A06 = r9;
        this.A08 = r11;
        this.A05 = r8;
        this.A07 = r10;
        this.A02 = r5;
        this.A00 = activity;
        this.A01 = new AnonymousClass0QY(new AnonymousClass4ZN(this, r7), AnonymousClass3ZH.class);
        this.A03 = r6;
    }
}
