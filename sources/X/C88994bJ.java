package X;

import android.app.Activity;
import com.whatsapp.R;

/* renamed from: X.4bJ  reason: invalid class name and case insensitive filesystem */
public final class C88994bJ extends AnonymousClass4LB {
    public final C111095hX A00;
    public final AnonymousClass1VX A01;
    public final AnonymousClass5T0 A02;
    public final C106715a2 A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C88994bJ(Activity activity, C111095hX r8, C620633i r9, C56612sH r10, C620733j r11, AnonymousClass1VX r12, AnonymousClass5T0 r13, C106715a2 r14) {
        super(activity, r9, r10, r11, R.layout.f8nameremoved);
        C18260x0.A0e(r10, r9, r11, r12);
        C18260x0.A0U(r14, r8);
        this.A01 = r12;
        this.A03 = r14;
        this.A00 = r8;
        this.A02 = r13;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0026, code lost:
        if (r11.length() == 0) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r13) {
        /*
            r12 = this;
            super.onCreate(r13)
            X.5T0 r0 = r12.A02
            java.lang.String r11 = r0.A03
            java.lang.String r9 = r0.A00
            boolean r8 = r0.A05
            java.lang.String r4 = r0.A02
            java.lang.String r3 = r0.A01
            r0 = 2131433812(0x7f0b1954, float:1.848942E38)
            android.view.View r7 = X.AnonymousClass0HG.A00(r12, r0)
            java.lang.String r5 = "null cannot be cast to non-null type com.whatsapp.WaTextView"
            X.C162457s7.A0K(r7, r5)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r10 = 0
            r6 = 1
            if (r11 == 0) goto L_0x0028
            int r1 = r11.length()
            r0 = 0
            if (r1 != 0) goto L_0x0029
        L_0x0028:
            r0 = 1
        L_0x0029:
            r2 = 8
            if (r0 == 0) goto L_0x0113
            r7.setVisibility(r2)
        L_0x0030:
            r0 = 2131433810(0x7f0b1952, float:1.8489416E38)
            android.view.View r7 = X.AnonymousClass0HG.A00(r12, r0)
            X.C162457s7.A0K(r7, r5)
            android.widget.TextView r7 = (android.widget.TextView) r7
            if (r9 == 0) goto L_0x010e
            int r0 = r9.length()
            if (r0 == 0) goto L_0x010e
            X.5a2 r1 = r12.A03
            android.content.Context r0 = r7.getContext()
            android.text.SpannableString r0 = r1.A03(r0, r9)
            X.C86664Kz.A1T(r7, r0)
            android.text.method.LinkMovementMethod r0 = new android.text.method.LinkMovementMethod
            r0.<init>()
            r7.setMovementMethod(r0)
            X.33i r1 = r12.A02
            X.4TJ r0 = new X.4TJ
            r0.<init>(r7, r1)
            X.C06560Yg.A0O(r7, r0)
        L_0x0063:
            if (r8 == 0) goto L_0x00b3
            r0 = 2131429240(0x7f0b0778, float:1.8480147E38)
            android.view.View r0 = X.AnonymousClass0HG.A00(r12, r0)
            r0.setVisibility(r2)
        L_0x006f:
            r0 = 2131429568(0x7f0b08c0, float:1.8480812E38)
            android.view.View r5 = X.AnonymousClass0HG.A00(r12, r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.wds.components.button.WDSButton"
            X.C162457s7.A0K(r5, r0)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r5.setText(r4)
            r0 = 10
            X.5ee r1 = new X.5ee
            r1.<init>(r0, r3, r12)
            r5.setOnClickListener(r1)
            r0 = 2131434518(0x7f0b1c16, float:1.8490852E38)
            android.view.View r0 = X.AnonymousClass0HG.A00(r12, r0)
            r0.setOnClickListener(r1)
            r0 = 2131427933(0x7f0b025d, float:1.8477496E38)
            android.view.View r0 = X.AnonymousClass0HG.A00(r12, r0)
            r0.setVisibility(r2)
            r0 = 2131427932(0x7f0b025c, float:1.8477494E38)
            android.view.View r0 = X.AnonymousClass0HG.A00(r12, r0)
            r0.setVisibility(r2)
            r1 = 12
            X.68w r0 = new X.68w
            r0.<init>(r12, r1)
            r12.setOnCancelListener(r0)
            return
        L_0x00b3:
            X.33j r0 = r12.A04
            java.util.Locale r1 = X.C620733j.A02(r0)
            r0 = 2
            java.text.DateFormat r9 = java.text.DateFormat.getDateInstance(r0, r1)
            android.app.Activity r8 = r12.A01
            r7 = 2131893920(0x7f121ea0, float:1.942263E38)
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            java.lang.String r0 = r9.format(r0)
            r1[r10] = r0
            r0 = 2131895980(0x7f1226ac, float:1.9426808E38)
            java.lang.String r0 = r8.getString(r0)
            java.lang.String r8 = X.C18300x5.A0e(r8, r0, r1, r6, r7)
            r0 = 2131429240(0x7f0b0778, float:1.8480147E38)
            android.view.View r7 = X.AnonymousClass0HG.A00(r12, r0)
            X.C162457s7.A0K(r7, r5)
            android.widget.TextView r7 = (android.widget.TextView) r7
            X.5a2 r6 = r12.A03
            android.content.Context r5 = r7.getContext()
            r0 = 38
            X.3cH r1 = new X.3cH
            r1.<init>((java.lang.Object) r12, (int) r0)
            java.lang.String r0 = "date-settings"
            android.text.SpannableStringBuilder r0 = r6.A05(r5, r1, r8, r0)
            r7.setText(r0)
            X.1VX r0 = r12.A01
            X.C18270x1.A0q(r7, r0)
            X.33i r1 = r12.A02
            X.4TJ r0 = new X.4TJ
            r0.<init>(r7, r1)
            X.C06560Yg.A0O(r7, r0)
            goto L_0x006f
        L_0x010e:
            r7.setVisibility(r2)
            goto L_0x0063
        L_0x0113:
            r7.setText(r11)
            goto L_0x0030
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C88994bJ.onCreate(android.os.Bundle):void");
    }
}
