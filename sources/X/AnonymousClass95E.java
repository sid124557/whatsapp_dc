package X;

import android.view.ViewGroup;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.payments.ui.IndiaUpiProfileDetailsActivity;
import java.util.List;

/* renamed from: X.95E  reason: invalid class name */
public class AnonymousClass95E extends AnonymousClass0R6 {
    public final AnonymousClass9OL A00;
    public final List A01;
    public final /* synthetic */ IndiaUpiProfileDetailsActivity A02;

    public AnonymousClass95E(AnonymousClass9OL r1, IndiaUpiProfileDetailsActivity indiaUpiProfileDetailsActivity, List list) {
        this.A02 = indiaUpiProfileDetailsActivity;
        this.A01 = list;
        this.A00 = r1;
    }

    public static final void A00(C166157yE r1, C1902695b r2) {
        ImageView imageView;
        int i;
        String str = r1.A03;
        if (str.equals("numeric_id")) {
            imageView = r2.A00;
            i = R.drawable.ic_upi_custom_number;
        } else if (str.equals("mobile_number")) {
            imageView = r2.A00;
            i = R.drawable.ic_settings_phone;
        } else {
            return;
        }
        imageView.setImageResource(i);
    }

    public int A0G() {
        return this.A01.size();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0088, code lost:
        r1.setText(r0);
        r5.A0H.setEnabled(false);
        r5.A00.setImageResource(com.whatsapp.R.drawable.ic_upi_number_loading);
        X.C18320x8.A11(r4.A02.getResources(), r2, com.whatsapp.R.color.f5nameremoved);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00c9, code lost:
        r1.setText(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00cc, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void BNf(X.C05570Ua r5, int r6) {
        /*
            r4 = this;
            X.95b r5 = (X.C1902695b) r5
            java.util.List r0 = r4.A01
            java.lang.Object r3 = r0.get(r6)
            X.7yE r3 = (X.C166157yE) r3
            android.widget.TextView r2 = r5.A02
            X.7yt r0 = r3.A00
            java.lang.Object r0 = r0.A00
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r2.setText(r0)
            java.lang.String r1 = r3.A02
            int r0 = r1.hashCode()
            switch(r0) {
                case -1422950650: goto L_0x00a6;
                case -733902135: goto L_0x007b;
                case -591705762: goto L_0x006d;
                case 24665195: goto L_0x0049;
                case 681442075: goto L_0x003b;
                case 1073361059: goto L_0x002d;
                case 2076720286: goto L_0x001f;
                default: goto L_0x001e;
            }
        L_0x001e:
            return
        L_0x001f:
            java.lang.String r0 = "inactive_status_pending"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001e
            android.widget.TextView r1 = r5.A01
            r0 = 2131894842(0x7f12223a, float:1.94245E38)
            goto L_0x0088
        L_0x002d:
            java.lang.String r0 = "active_status_pending"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001e
            android.widget.TextView r1 = r5.A01
            r0 = 2131894838(0x7f122236, float:1.9424492E38)
            goto L_0x0088
        L_0x003b:
            java.lang.String r0 = "deregistered_pending"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001e
            android.widget.TextView r1 = r5.A01
            r0 = 2131894848(0x7f122240, float:1.9424512E38)
            goto L_0x0088
        L_0x0049:
            java.lang.String r0 = "inactive"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001e
            A00(r3, r5)
            android.view.View r1 = r5.A0H
            r0 = 1
            r1.setEnabled(r0)
            com.whatsapp.payments.ui.IndiaUpiProfileDetailsActivity r0 = r4.A02
            android.content.res.Resources r1 = r0.getResources()
            int r0 = X.AnonymousClass5Yj.A07(r2)
            X.C18320x8.A11(r1, r2, r0)
            android.widget.TextView r1 = r5.A01
            r0 = 2131894845(0x7f12223d, float:1.9424506E38)
            goto L_0x00c9
        L_0x006d:
            java.lang.String r0 = "active_pending"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001e
            android.widget.TextView r1 = r5.A01
            r0 = 2131894840(0x7f122238, float:1.9424496E38)
            goto L_0x0088
        L_0x007b:
            java.lang.String r0 = "available"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001e
            android.widget.TextView r1 = r5.A01
            r0 = 2131894847(0x7f12223f, float:1.942451E38)
        L_0x0088:
            r1.setText(r0)
            android.view.View r1 = r5.A0H
            r0 = 0
            r1.setEnabled(r0)
            android.widget.ImageView r1 = r5.A00
            r0 = 2131232814(0x7f08082e, float:1.8081748E38)
            r1.setImageResource(r0)
            com.whatsapp.payments.ui.IndiaUpiProfileDetailsActivity r0 = r4.A02
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131102351(0x7f060a8f, float:1.7817137E38)
            X.C18320x8.A11(r1, r2, r0)
            return
        L_0x00a6:
            java.lang.String r0 = "active"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001e
            A00(r3, r5)
            android.view.View r1 = r5.A0H
            r0 = 1
            r1.setEnabled(r0)
            com.whatsapp.payments.ui.IndiaUpiProfileDetailsActivity r0 = r4.A02
            android.content.res.Resources r1 = r0.getResources()
            int r0 = X.AnonymousClass5Yj.A07(r2)
            X.C18320x8.A11(r1, r2, r0)
            android.widget.TextView r1 = r5.A01
            r0 = 2131894839(0x7f122237, float:1.9424494E38)
        L_0x00c9:
            r1.setText(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass95E.BNf(X.0Ua, int):void");
    }

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        return new C1902695b(AnonymousClass001.A0R(this.A02.getLayoutInflater(), viewGroup, R.layout.f8nameremoved), this.A00);
    }
}
