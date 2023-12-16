package X;

import android.widget.CompoundButton;

/* renamed from: X.9oy  reason: invalid class name and case insensitive filesystem */
public class C204199oy implements CompoundButton.OnCheckedChangeListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public C204199oy(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCheckedChanged(android.widget.CompoundButton r9, boolean r10) {
        /*
            r8 = this;
            int r0 = r8.A02
            if (r0 == 0) goto L_0x0069
            java.lang.Object r5 = r8.A00
            com.whatsapp.payments.ui.widget.MultiExclusionChipGroup r5 = (com.whatsapp.payments.ui.widget.MultiExclusionChipGroup) r5
            java.lang.Object r4 = r8.A01
            com.google.android.material.chip.Chip r4 = (com.google.android.material.chip.Chip) r4
            java.util.Map r2 = r5.A02
            boolean r0 = r2.containsKey(r4)
            if (r0 == 0) goto L_0x008f
            boolean r1 = r4.isChecked()
            r0 = 2131167777(0x7f070a21, float:1.7949837E38)
            if (r1 == 0) goto L_0x0020
            r0 = 2131167774(0x7f070a1e, float:1.7949831E38)
        L_0x0020:
            r4.setChipStrokeWidthResource(r0)
            boolean r1 = r4.isChecked()
            r0 = 2131167778(0x7f070a22, float:1.794984E38)
            if (r1 == 0) goto L_0x002f
            r0 = 2131167775(0x7f070a1f, float:1.7949833E38)
        L_0x002f:
            r4.setTextStartPaddingResource(r0)
            java.lang.Object r3 = r2.get(r4)
            java.util.List r3 = (java.util.List) r3
            if (r3 == 0) goto L_0x008f
            r2 = 0
        L_0x003b:
            int r0 = r3.size()
            if (r2 >= r0) goto L_0x008f
            java.lang.Object r1 = r3.get(r2)
            com.google.android.material.chip.Chip r1 = (com.google.android.material.chip.Chip) r1
            if (r1 == r4) goto L_0x0066
            boolean r0 = r4.isChecked()
            r0 = r0 ^ 1
            r1.setClickable(r0)
            boolean r0 = r4.isChecked()
            r0 = r0 ^ 1
            r1.setCheckable(r0)
            boolean r0 = r4.isChecked()
            int r0 = X.C86614Ku.A01(r0)
            r1.setVisibility(r0)
        L_0x0066:
            int r2 = r2 + 1
            goto L_0x003b
        L_0x0069:
            java.lang.Object r2 = r8.A01
            android.widget.CompoundButton r2 = (android.widget.CompoundButton) r2
            if (r2 == 0) goto L_0x0087
            java.lang.Object r1 = r8.A00
            X.9cs r1 = (X.C197289cs) r1
            X.9Bs r0 = r1.A05
            X.7yJ r0 = r0.A0U
            if (r0 == 0) goto L_0x0087
            com.whatsapp.payments.ui.ConfirmPaymentFragment r0 = r1.A04
            boolean r1 = r2.isChecked()
        L_0x007f:
            com.whatsapp.wds.components.button.WDSButton r0 = r0.A0S
            if (r0 == 0) goto L_0x00d4
            r0.setEnabled(r1)
            return
        L_0x0087:
            java.lang.Object r0 = r8.A00
            X.9cs r0 = (X.C197289cs) r0
            com.whatsapp.payments.ui.ConfirmPaymentFragment r0 = r0.A04
            r1 = 1
            goto L_0x007f
        L_0x008f:
            java.util.Set r7 = r5.A03
            if (r10 == 0) goto L_0x00d5
            r7.add(r4)
        L_0x0096:
            X.9lW r0 = r5.A00
            if (r0 == 0) goto L_0x00d4
            X.9dO r0 = (X.AnonymousClass9dO) r0
            com.whatsapp.payments.ui.PaymentTransactionHistoryActivity r6 = r0.A00
            com.whatsapp.payments.ui.widget.MultiExclusionChip r5 = r0.A01
            com.whatsapp.payments.ui.widget.MultiExclusionChip r4 = r0.A02
            com.whatsapp.payments.ui.widget.MultiExclusionChip r3 = r0.A03
            com.whatsapp.payments.ui.widget.MultiExclusionChip r2 = r0.A04
            boolean r0 = r6.A0T
            if (r0 == 0) goto L_0x00bf
            X.2T7 r1 = r6.A0W
            boolean r0 = r7.contains(r5)
            r1.A06 = r0
            boolean r0 = r7.contains(r4)
            if (r0 == 0) goto L_0x00bf
            X.284 r0 = new X.284
            r0.<init>()
            r1.A00 = r0
        L_0x00bf:
            boolean r0 = r6.A0O
            if (r0 == 0) goto L_0x00d1
            X.2T7 r1 = r6.A0W
            boolean r0 = r7.contains(r3)
            r1.A02 = r0
            boolean r0 = r7.contains(r2)
            r1.A03 = r0
        L_0x00d1:
            r6.A75()
        L_0x00d4:
            return
        L_0x00d5:
            r7.remove(r4)
            goto L_0x0096
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C204199oy.onCheckedChanged(android.widget.CompoundButton, boolean):void");
    }
}
