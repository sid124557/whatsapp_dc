package X;

import android.view.View;

/* renamed from: X.9pH  reason: invalid class name and case insensitive filesystem */
public class C204389pH implements View.OnClickListener {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public C204389pH(Object obj, Object obj2, int i, int i2) {
        this.A03 = i2;
        this.A01 = obj2;
        this.A02 = obj;
        this.A00 = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0080, code lost:
        r2 = r4.A06;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r10) {
        /*
            r9 = this;
            int r0 = r9.A03
            switch(r0) {
                case 0: goto L_0x0016;
                case 1: goto L_0x0097;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r9.A01
            X.0R6 r2 = (X.AnonymousClass0R6) r2
            java.lang.Object r1 = r9.A02
            java.util.List r1 = (java.util.List) r1
            int r0 = r9.A00
            r1.remove(r0)
            r2.A08(r0)
        L_0x0015:
            return
        L_0x0016:
            java.lang.Object r7 = r9.A01
            X.954 r7 = (X.AnonymousClass954) r7
            java.lang.Object r4 = r9.A02
            X.95R r4 = (X.AnonymousClass95R) r4
            int r5 = r9.A00
            r3 = 0
            X.954 r2 = r4.A06     // Catch:{ JSONException -> 0x0033 }
            org.json.JSONArray r1 = r2.A0B     // Catch:{ JSONException -> 0x0033 }
            int r0 = r4.A01()     // Catch:{ JSONException -> 0x0033 }
            org.json.JSONObject r1 = r1.getJSONObject(r0)     // Catch:{ JSONException -> 0x0033 }
            java.lang.String r0 = r2.A05     // Catch:{ JSONException -> 0x0033 }
            boolean r3 = r1.optBoolean(r0, r3)     // Catch:{ JSONException -> 0x0033 }
        L_0x0033:
            if (r3 != 0) goto L_0x0015
            org.json.JSONArray r0 = r7.A0B     // Catch:{ JSONException -> 0x0061 }
            org.json.JSONObject r6 = r0.getJSONObject(r5)     // Catch:{ JSONException -> 0x0061 }
            X.0rw r5 = r7.A02     // Catch:{ JSONException -> 0x0061 }
            if (r5 == 0) goto L_0x006b
            java.util.HashMap r3 = X.AnonymousClass001.A0t()     // Catch:{ JSONException -> 0x0061 }
            java.util.Iterator r2 = r6.keys()     // Catch:{ JSONException -> 0x0061 }
        L_0x0047:
            boolean r0 = r2.hasNext()     // Catch:{ JSONException -> 0x0061 }
            if (r0 == 0) goto L_0x005d
            java.lang.String r1 = X.AnonymousClass001.A0m(r2)     // Catch:{ JSONException -> 0x0061 }
            java.lang.Object r0 = r6.get(r1)     // Catch:{ JSONException -> 0x0061 }
            java.lang.String r0 = r0.toString()     // Catch:{ JSONException -> 0x0061 }
            r3.put(r1, r0)     // Catch:{ JSONException -> 0x0061 }
            goto L_0x0047
        L_0x005d:
            r5.AwB(r3)     // Catch:{ JSONException -> 0x0061 }
            goto L_0x006b
        L_0x0061:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "WaListViewBinder/SingleTextSelectionAdapter/notifyPositionTapped : "
            X.C18260x0.A16(r0, r1, r2)
        L_0x006b:
            r3 = 0
            X.954 r2 = r4.A06     // Catch:{ JSONException -> 0x007e }
            org.json.JSONArray r1 = r2.A0B     // Catch:{ JSONException -> 0x007e }
            int r0 = r4.A01()     // Catch:{ JSONException -> 0x007e }
            org.json.JSONObject r1 = r1.getJSONObject(r0)     // Catch:{ JSONException -> 0x007e }
            java.lang.String r0 = r2.A05     // Catch:{ JSONException -> 0x007e }
            boolean r3 = r1.optBoolean(r0, r3)     // Catch:{ JSONException -> 0x007e }
        L_0x007e:
            if (r3 != 0) goto L_0x0015
            X.954 r2 = r4.A06
            int r1 = r2.A00
            int r0 = r4.A01()
            if (r1 == r0) goto L_0x0015
            r2.A06(r1)
            int r0 = r4.A01()
            r2.A00 = r0
            r2.A06(r0)
            return
        L_0x0097:
            java.lang.Object r8 = r9.A01
            X.956 r8 = (X.AnonymousClass956) r8
            java.lang.Object r0 = r9.A02
            X.0Ua r0 = (X.C05570Ua) r0
            int r5 = r9.A00
            com.whatsapp.payments.ui.IndiaUpiBankPickerActivityOld r4 = r8.A03
            X.5Wv r1 = r4.A0B
            android.view.View r0 = r0.A0H
            r1.A02(r0)
            java.util.List r0 = r8.A00
            java.lang.Object r7 = r0.get(r5)
            X.99H r7 = (X.AnonymousClass99H) r7
            r6 = 0
            r3 = 0
            r2 = 0
        L_0x00b5:
            if (r3 >= r5) goto L_0x00c3
            int r1 = r8.getItemViewType(r3)
            r0 = 1
            if (r1 != r0) goto L_0x00c0
            int r2 = r2 + 1
        L_0x00c0:
            int r3 = r3 + 1
            goto L_0x00b5
        L_0x00c3:
            boolean r0 = r8.A02
            if (r0 != 0) goto L_0x00cd
            java.util.List r0 = r4.A0E
            int r6 = r0.size()
        L_0x00cd:
            int r6 = r6 + r5
            int r6 = r6 - r2
            r4.A0K = r7
            X.9bS r2 = r4.A0M
            X.9U1 r0 = r4.A0L
            java.lang.String r1 = r0.A04(r7)
            X.9ca r0 = r4.A0S
            boolean r0 = r2.A0R(r7, r0, r1)
            if (r0 == 0) goto L_0x00f4
            org.json.JSONObject r1 = X.AnonymousClass0x9.A1G()     // Catch:{ Exception -> 0x00ed }
            java.lang.String r0 = "SelectBankStep"
            X.AnonymousClass97T.A0x(r4, r0, r1)     // Catch:{ Exception -> 0x00ed }
            X.AnonymousClass97T.A0v(r7, r4, r1)     // Catch:{ Exception -> 0x00ed }
        L_0x00ed:
            java.lang.Class<com.whatsapp.payments.ui.IndiaUpiBankAccountPickerActivity> r0 = com.whatsapp.payments.ui.IndiaUpiBankAccountPickerActivity.class
            android.content.Intent r2 = X.AnonymousClass0x9.A08(r4, r0)
            goto L_0x00fa
        L_0x00f4:
            java.lang.Class<com.whatsapp.payments.ui.IndiaUpiSimVerificationActivity> r0 = com.whatsapp.payments.ui.IndiaUpiSimVerificationActivity.class
            android.content.Intent r2 = X.AnonymousClass0x9.A08(r4, r0)
        L_0x00fa:
            X.9ER r0 = r4.A05
            java.lang.String r1 = "bankSelected"
            X.316 r0 = r0.A00
            r0.A0B(r1)
            r4.A7O(r2)
            java.lang.String r0 = "extra_previous_screen"
            java.lang.String r5 = "nav_bank_select"
            r2.putExtra(r0, r5)
            java.lang.String r0 = "bankPicker"
            X.AnonymousClass5VI.A00(r2, r0)
            r3 = 1
            r4.A6T(r2, r3)
            X.6ig r2 = r4.A0I
            boolean r0 = r4.A0H
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A02 = r0
            java.lang.String r0 = r4.A0C
            r2.A0P = r0
            boolean r0 = X.C18320x8.A1U(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A04 = r0
            java.lang.String r0 = r7.A0C()
            r2.A0Q = r0
            long r0 = (long) r6
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A0J = r0
            X.AnonymousClass97T.A0u(r2, r4, r5)
            java.lang.String r0 = r4.A0e
            r2.A0a = r0
            X.C1899593h.A1B(r2, r3)
            java.lang.String r0 = r4.A0C
            r2.A0P = r0
            java.lang.Integer r0 = X.C18290x4.A0c()
            r2.A07 = r0
            X.AnonymousClass97T.A0t(r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C204389pH.onClick(android.view.View):void");
    }
}
