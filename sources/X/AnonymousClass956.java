package X;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.payments.ui.IndiaUpiBankPickerActivityOld;
import java.util.List;

/* renamed from: X.956  reason: invalid class name */
public class AnonymousClass956 extends AnonymousClass0R6 {
    public List A00 = AnonymousClass001.A0s();
    public final Drawable A01;
    public final boolean A02;
    public final /* synthetic */ IndiaUpiBankPickerActivityOld A03;

    public AnonymousClass956(IndiaUpiBankPickerActivityOld indiaUpiBankPickerActivityOld, boolean z) {
        this.A03 = indiaUpiBankPickerActivityOld;
        this.A02 = z;
        this.A01 = indiaUpiBankPickerActivityOld.getResources().getDrawable(z ? R.drawable.bank_logo_placeholder_with_circle_bg_popular_bank : R.drawable.bank_logo_placeholder_with_circle_bg);
    }

    public int A0G() {
        return this.A00.size();
    }

    public int getItemViewType(int i) {
        if (this.A00.get(i) instanceof String) {
            return 1;
        }
        return 2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008e, code lost:
        if (getItemViewType(r11 + 1) == 1) goto L_0x0090;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BNf(X.C05570Ua r10, int r11) {
        /*
            r9 = this;
            int r0 = r9.getItemViewType(r11)
            r3 = 1
            if (r0 != r3) goto L_0x0015
            X.95K r10 = (X.AnonymousClass95K) r10
            android.widget.TextView r1 = r10.A00
            java.util.List r0 = r9.A00
            java.lang.String r0 = X.AnonymousClass001.A0n(r0, r11)
            r1.setText(r0)
        L_0x0014:
            return
        L_0x0015:
            r5 = r10
            X.95P r5 = (X.AnonymousClass95P) r5
            java.util.List r0 = r9.A00
            java.lang.Object r7 = r0.get(r11)
            X.6hu r7 = (X.C133766hu) r7
            android.graphics.drawable.Drawable r4 = r9.A01
            java.lang.String r0 = r7.A03
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0061
            com.whatsapp.payments.ui.IndiaUpiBankPickerActivityOld r0 = r5.A03
            X.2pB r2 = r0.A0B
            java.lang.String r1 = r7.A03
            X.C626936e.A06(r1)
            android.widget.ImageView r0 = r5.A01
            r2.A02(r4, r4, r0, r1)
        L_0x0038:
            java.util.ArrayList r6 = X.AnonymousClass001.A0s()
            com.whatsapp.payments.ui.IndiaUpiBankPickerActivityOld r8 = r5.A03
            java.util.ArrayList r0 = r8.A0D
            if (r0 == 0) goto L_0x0045
            r6.addAll(r0)
        L_0x0045:
            java.lang.String r0 = r8.A0C
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0067
            r4 = 0
        L_0x004e:
            java.lang.String r2 = r8.A0C
            int r0 = r2.length()
            if (r4 >= r0) goto L_0x0067
            int r1 = r4 + 1
            java.lang.String r0 = r2.substring(r4, r1)
            r6.add(r0)
            r4 = r1
            goto L_0x004e
        L_0x0061:
            android.widget.ImageView r0 = r5.A01
            r0.setImageDrawable(r4)
            goto L_0x0038
        L_0x0067:
            com.whatsapp.TextEmojiLabel r1 = r5.A02
            java.lang.String r0 = r7.A0C()
            r1.A0K(r6, r0)
            android.view.View r1 = r10.A0H
            X.9pH r0 = new X.9pH
            r0.<init>(r10, r9, r11, r3)
            r1.setOnClickListener(r0)
            android.view.View r2 = r5.A00
            if (r2 == 0) goto L_0x0014
            java.util.List r0 = r9.A00
            int r0 = r0.size()
            int r0 = r0 - r3
            if (r11 == r0) goto L_0x0090
            int r0 = r11 + 1
            int r1 = r9.getItemViewType(r0)
            r0 = 0
            if (r1 != r3) goto L_0x0091
        L_0x0090:
            r0 = 4
        L_0x0091:
            r2.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass956.BNf(X.0Ua, int):void");
    }

    public C05570Ua BQR(ViewGroup viewGroup, int i) {
        LayoutInflater A0D = C18280x3.A0D(viewGroup);
        if (i != 2) {
            return new AnonymousClass95K(A0D.inflate(R.layout.f8nameremoved, viewGroup, false));
        }
        IndiaUpiBankPickerActivityOld indiaUpiBankPickerActivityOld = this.A03;
        boolean z = this.A02;
        int i2 = R.layout.f8nameremoved;
        if (z) {
            i2 = R.layout.f8nameremoved;
        }
        return new AnonymousClass95P(A0D.inflate(i2, viewGroup, false), indiaUpiBankPickerActivityOld);
    }
}
