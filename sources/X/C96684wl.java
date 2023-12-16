package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaTextView;

/* renamed from: X.4wl  reason: invalid class name and case insensitive filesystem */
public class C96684wl extends AnonymousClass6mM {
    public final WaTextView A00;
    public final WaTextView A01;
    public final WaTextView A02;
    public final WaTextView A03;
    public final C105355Up A04;

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ae  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A09(java.lang.Object r6) {
        /*
            r5 = this;
            X.4w9 r6 = (X.C96304w9) r6
            com.whatsapp.WaTextView r1 = r5.A01
            int r3 = r6.A00
            switch(r3) {
                case 0: goto L_0x00a9;
                case 1: goto L_0x00a4;
                case 2: goto L_0x009f;
                case 3: goto L_0x009a;
                case 4: goto L_0x0009;
                case 5: goto L_0x0009;
                case 6: goto L_0x0095;
                case 7: goto L_0x0090;
                default: goto L_0x0009;
            }
        L_0x0009:
            r0 = 2131886740(0x7f120294, float:1.9408067E38)
        L_0x000c:
            r1.setText(r0)
            X.8uO r2 = r6.A01
            r0 = 1
            r1 = 0
            if (r3 == r0) goto L_0x007b
            r0 = 2
            if (r3 == r0) goto L_0x007b
            if (r3 == 0) goto L_0x0084
            r0 = 7
            if (r3 == r0) goto L_0x0084
            r0 = 6
            if (r3 == r0) goto L_0x0084
            com.whatsapp.WaTextView r1 = r5.A02
            r0 = 8
            r1.setVisibility(r0)
            android.view.View r1 = r5.A0H
            r0 = 0
            r1.setOnClickListener(r0)
        L_0x002d:
            com.whatsapp.WaTextView r4 = r5.A00
            r0 = 0
            r4.setVisibility(r0)
            if (r3 == 0) goto L_0x006e
            r0 = 3
            if (r3 == r0) goto L_0x006e
            r0 = 4
            if (r3 == r0) goto L_0x0062
            r0 = 5
            if (r3 == r0) goto L_0x0059
            r0 = 6
            if (r3 == r0) goto L_0x006e
            r0 = 7
            if (r3 == r0) goto L_0x006e
            r0 = 8
            r4.setVisibility(r0)
            r1 = 0
        L_0x004a:
            r4.setOnClickListener(r1)
        L_0x004d:
            com.whatsapp.WaTextView r1 = r5.A03
            if (r3 != 0) goto L_0x00ae
            r0 = 0
            r1.setVisibility(r0)
            X.C18300x5.A18(r1, r2, r0)
            return
        L_0x0059:
            r0 = 2131886662(0x7f120246, float:1.940791E38)
            r4.setText(r0)
            r0 = 49
            goto L_0x006a
        L_0x0062:
            r0 = 2131886775(0x7f1202b7, float:1.9408138E38)
            r4.setText(r0)
            r0 = 48
        L_0x006a:
            X.C18290x4.A1H(r4, r2, r0)
            goto L_0x004d
        L_0x006e:
            r0 = 2131886705(0x7f120271, float:1.9407996E38)
            r4.setText(r0)
            r0 = 2
            X.5f2 r1 = new X.5f2
            r1.<init>(r2, r3, r0)
            goto L_0x004a
        L_0x007b:
            com.whatsapp.WaTextView r0 = r5.A02
            r0.setVisibility(r1)
            android.view.View r1 = r5.A0H
            r0 = 1
            goto L_0x008c
        L_0x0084:
            com.whatsapp.WaTextView r0 = r5.A02
            r0.setVisibility(r1)
            android.view.View r1 = r5.A0H
            r0 = 2
        L_0x008c:
            X.C18300x5.A18(r1, r2, r0)
            goto L_0x002d
        L_0x0090:
            r0 = 2131886687(0x7f12025f, float:1.940796E38)
            goto L_0x000c
        L_0x0095:
            r0 = 2131891203(0x7f121403, float:1.941712E38)
            goto L_0x000c
        L_0x009a:
            r0 = 2131886741(0x7f120295, float:1.940807E38)
            goto L_0x000c
        L_0x009f:
            r0 = 2131886749(0x7f12029d, float:1.9408086E38)
            goto L_0x000c
        L_0x00a4:
            r0 = 2131886744(0x7f120298, float:1.9408075E38)
            goto L_0x000c
        L_0x00a9:
            r0 = 2131886742(0x7f120296, float:1.9408071E38)
            goto L_0x000c
        L_0x00ae:
            r0 = 8
            r1.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C96684wl.A09(java.lang.Object):void");
    }

    public C96684wl(View view, C105355Up r3) {
        super(view);
        this.A04 = r3;
        this.A01 = AnonymousClass0x7.A0L(view, R.id.error_message);
        this.A02 = AnonymousClass0x7.A0L(view, R.id.retry_button);
        this.A03 = AnonymousClass0x7.A0L(view, R.id.settings_btn);
        this.A00 = AnonymousClass0x7.A0L(view, R.id.fallback_action_button);
    }
}
