package X;

import com.whatsapp.jid.UserJid;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.54T  reason: invalid class name */
public class AnonymousClass54T extends AnonymousClass5ZM {
    public final WeakReference A00;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        AnonymousClass51w r0 = (AnonymousClass51w) this.A00.get();
        if (r0 == null) {
            return null;
        }
        AnonymousClass2W3 A002 = r0.A0L.A00(r0.A06);
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator A0u = AnonymousClass001.A0u(A002.A00);
        while (A0u.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0u);
            long A01 = ((C60722z3) A0w.getValue()).A01(13);
            if (A01 > 0) {
                A0s.add(new C102225Hy((UserJid) A0w.getKey(), A01));
            }
        }
        AnonymousClass6A6.A00(A0s, 11);
        return A0s;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00b3, code lost:
        if (r0 != 0) goto L_0x00b5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A0C(java.lang.Object r12) {
        /*
            r11 = this;
            java.util.List r12 = (java.util.List) r12
            java.lang.ref.WeakReference r0 = r11.A00
            java.lang.Object r2 = r0.get()
            X.51v r2 = (X.AnonymousClass51v) r2
            if (r2 == 0) goto L_0x00c2
            if (r12 == 0) goto L_0x00c2
            X.33p r0 = r2.A0G
            boolean r10 = r0.A2G()
            X.51t r3 = r2.A0Q()
            X.5TV r4 = r3.A08
            if (r10 == 0) goto L_0x00c3
            com.whatsapp.WaTextView r9 = r4.A08
            X.33j r8 = r4.A0I
            r7 = 2131755398(0x7f100186, float:1.9141674E38)
            int r0 = r12.size()
            long r0 = (long) r0
            java.lang.Object[] r6 = X.AnonymousClass002.A0L()
            int r5 = r12.size()
            boolean r5 = X.C18300x5.A1Y(r6, r5)
            java.lang.String r0 = r8.A0L(r6, r7, r0)
            r9.setText(r0)
            X.4Wh r0 = r4.A0L
            r0.A00 = r12
            r0.A05()
            android.widget.TextView r1 = r4.A05
            boolean r0 = r12.isEmpty()
            int r0 = X.AnonymousClass001.A08(r0)
            r1.setVisibility(r0)
            androidx.recyclerview.widget.RecyclerView r1 = r4.A06
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L_0x0059
            r5 = 8
        L_0x0059:
            r1.setVisibility(r5)
        L_0x005c:
            r4.A00()
            android.widget.TextView r1 = r3.A07
            r4 = 0
            int r0 = X.AnonymousClass001.A08(r10)
            r1.setVisibility(r0)
            android.widget.TextView r6 = r3.A07
            X.33j r5 = r2.A0H
            java.text.NumberFormat r2 = r5.A0M()
            int r0 = r12.size()
            long r0 = (long) r0
            X.C86634Kw.A1K(r6, r2, r0)
            android.view.ViewGroup r2 = r3.A0A
            int r1 = r12.size()
            r0 = 2131755398(0x7f100186, float:1.9141674E38)
            java.lang.String r0 = X.C86604Kt.A0p(r5, r1, r0)
            r2.setContentDescription(r0)
            r0 = 2131890909(0x7f1212dd, float:1.9416523E38)
            X.C107295b4.A03(r2, r0)
            android.view.ViewGroup r0 = r3.A0A
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x00aa
            android.view.ViewGroup r0 = r3.A0A
            r0.setVisibility(r4)
            android.view.animation.AlphaAnimation r2 = X.C86604Kt.A0H()
            r0 = 120(0x78, double:5.93E-322)
            r2.setDuration(r0)
            android.view.ViewGroup r0 = r3.A0A
            r0.startAnimation(r2)
        L_0x00aa:
            if (r10 != 0) goto L_0x00b5
            int r0 = r12.size()
            r1 = 2131232760(0x7f0807f8, float:1.8081638E38)
            if (r0 == 0) goto L_0x00b8
        L_0x00b5:
            r1 = 2131232849(0x7f080851, float:1.8081819E38)
        L_0x00b8:
            android.widget.ImageView r0 = r3.A06
            r0.setImageResource(r1)
            android.view.ViewGroup r0 = r3.A08
            r0.requestLayout()
        L_0x00c2:
            return
        L_0x00c3:
            com.whatsapp.WaTextView r1 = r4.A08
            r0 = 2131895135(0x7f12235f, float:1.9425094E38)
            r1.setText(r0)
            android.widget.TextView r1 = r4.A05
            r0 = 0
            r1.setVisibility(r0)
            goto L_0x005c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass54T.A0C(java.lang.Object):void");
    }

    public AnonymousClass54T(AnonymousClass51v r2) {
        this.A00 = AnonymousClass0x9.A14(r2);
    }
}
