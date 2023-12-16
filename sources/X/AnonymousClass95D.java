package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.95D  reason: invalid class name */
public class AnonymousClass95D extends AnonymousClass0R6 {
    public final Context A00;
    public final C202109lO A01;
    public final C54722pB A02;
    public final C105895Wv A03;
    public final List A04 = AnonymousClass001.A0s();

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b6, code lost:
        if (getItemViewType(r16 + 1) == 0) goto L_0x00b8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BNf(X.C05570Ua r15, int r16) {
        /*
            r14 = this;
            r9 = r15
            r11 = r14
            java.util.List r4 = r14.A04
            int r0 = r4.size()
            r12 = r16
            if (r12 >= r0) goto L_0x0026
            java.lang.Object r2 = r4.get(r12)
            X.9SY r2 = (X.AnonymousClass9SY) r2
            int r1 = r2.A00
            if (r1 == 0) goto L_0x00bd
            r3 = 1
            if (r1 == r3) goto L_0x0027
            r0 = 2
            if (r1 != r0) goto L_0x0027
            X.95J r9 = (X.AnonymousClass95J) r9
            android.widget.TextView r1 = r9.A00
            r0 = 2131891889(0x7f1216b1, float:1.941851E38)
            r1.setText(r0)
        L_0x0026:
            return
        L_0x0027:
            X.99H r10 = r2.A01
            X.9lO r0 = r14.A01
            com.whatsapp.payments.onboarding.IndiaUpiBankPickerActivity r0 = (com.whatsapp.payments.onboarding.IndiaUpiBankPickerActivity) r0
            java.lang.String r1 = r0.A0A
            java.util.ArrayList r0 = r0.A0B
            android.util.Pair r5 = X.AnonymousClass0x9.A0C(r1, r0)
            android.content.Context r0 = r14.A00
            android.content.res.Resources r2 = r0.getResources()
            boolean r0 = r10.A0K
            r1 = 2131231063(0x7f080157, float:1.8078196E38)
            if (r0 == 0) goto L_0x0045
            r1 = 2131231064(0x7f080158, float:1.8078198E38)
        L_0x0045:
            r0 = 0
            android.graphics.drawable.Drawable r6 = X.C02680He.A00(r0, r2, r1)
            r2 = r9
            X.95O r2 = (X.AnonymousClass95O) r2
            java.lang.Object r7 = r5.first
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r5.second
            java.util.Collection r8 = (java.util.Collection) r8
            java.lang.String r0 = r10.A03
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x008a
            X.2pB r5 = r2.A03
            java.lang.String r1 = r10.A03
            X.C626936e.A06(r1)
            android.widget.ImageView r0 = r2.A01
            r5.A02(r6, r6, r0, r1)
        L_0x0069:
            java.util.ArrayList r6 = X.AnonymousClass001.A0s()
            if (r8 == 0) goto L_0x0072
            r6.addAll(r8)
        L_0x0072:
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L_0x0090
            r5 = 0
        L_0x0079:
            int r0 = r7.length()
            if (r5 >= r0) goto L_0x0090
            int r1 = r5 + 1
            java.lang.String r0 = r7.substring(r5, r1)
            r6.add(r0)
            r5 = r1
            goto L_0x0079
        L_0x008a:
            android.widget.ImageView r0 = r2.A01
            r0.setImageDrawable(r6)
            goto L_0x0069
        L_0x0090:
            com.whatsapp.TextEmojiLabel r1 = r2.A02
            java.lang.String r0 = r10.A0C()
            r1.A0K(r6, r0)
            android.view.View r0 = r15.A0H
            r13 = 0
            X.9ov r8 = new X.9ov
            r8.<init>(r9, r10, r11, r12, r13)
            r0.setOnClickListener(r8)
            android.view.View r2 = r2.A00
            if (r2 == 0) goto L_0x0026
            int r0 = r4.size()
            int r0 = r0 - r3
            if (r12 == r0) goto L_0x00b8
            int r0 = r16 + 1
            int r1 = r14.getItemViewType(r0)
            r0 = 0
            if (r1 != 0) goto L_0x00b9
        L_0x00b8:
            r0 = 4
        L_0x00b9:
            r2.setVisibility(r0)
            return
        L_0x00bd:
            X.95J r9 = (X.AnonymousClass95J) r9
            android.widget.TextView r1 = r9.A00
            java.lang.String r0 = r2.A02
            r1.setText(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass95D.BNf(X.0Ua, int):void");
    }

    public int A0G() {
        return this.A04.size();
    }

    public int getItemViewType(int i) {
        List list = this.A04;
        if (i >= list.size()) {
            return -1;
        }
        return ((AnonymousClass9SY) list.get(i)).A00;
    }

    public AnonymousClass95D(Context context, C202109lO r3, C54722pB r4, C105895Wv r5) {
        this.A00 = context;
        this.A01 = r3;
        this.A03 = r5;
        this.A02 = r4;
    }

    public C05570Ua BQR(ViewGroup viewGroup, int i) {
        int i2;
        int i3;
        LayoutInflater A0D = C18280x3.A0D(viewGroup);
        if (i != 0) {
            if (i == 1) {
                i3 = R.layout.f8nameremoved;
            } else if (i == 2) {
                i2 = R.layout.f8nameremoved;
            } else if (i == 3) {
                i3 = R.layout.f8nameremoved;
            } else {
                Object[] objArr = new Object[1];
                AnonymousClass000.A1P(objArr, i, 0);
                throw AnonymousClass002.A0G(String.format("PAY: BankListAdapter/onCreateViewHolder  unsupported view type %d", objArr));
            }
            return new AnonymousClass95O(A0D.inflate(i3, viewGroup, false), this.A02);
        }
        i2 = R.layout.f8nameremoved;
        return new AnonymousClass95J(A0D.inflate(i2, viewGroup, false));
    }
}
