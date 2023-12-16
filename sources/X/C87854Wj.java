package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity;
import java.util.List;

/* renamed from: X.4Wj  reason: invalid class name and case insensitive filesystem */
public class C87854Wj extends AnonymousClass0R6 {
    public final List A00;
    public final /* synthetic */ ViewSharedContactArrayActivity A01;

    public C87854Wj(ViewSharedContactArrayActivity viewSharedContactArrayActivity, List list) {
        this.A01 = viewSharedContactArrayActivity;
        this.A00 = list;
    }

    public int A0G() {
        return this.A00.size();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0280, code lost:
        if (r7.A01.A0L == false) goto L_0x0282;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BNf(X.C05570Ua r22, int r23) {
        /*
            r21 = this;
            r14 = r22
            r7 = r21
            java.util.List r0 = r7.A00
            r1 = r23
            java.lang.Object r2 = r0.get(r1)
            int r1 = r14.A02
            r5 = 2
            r8 = 8
            r3 = 0
            if (r1 == 0) goto L_0x0337
            r4 = 1
            if (r1 == r4) goto L_0x0057
            if (r1 == r5) goto L_0x0271
            r0 = 3
            if (r1 != r0) goto L_0x0047
            X.6Ic r14 = (X.C125456Ic) r14
            X.7NF r2 = (X.AnonymousClass7NF) r2
            android.widget.TextView r9 = r14.A01
            r9.setTextDirection(r0)
            com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity r8 = r7.A01
            X.2sr r0 = r8.A01
            X.3ZH r6 = r2.A02
            boolean r0 = X.C56972sr.A08(r0, r6)
            if (r0 == 0) goto L_0x0048
            r0 = 2131894932(0x7f122294, float:1.9424683E38)
            java.lang.String r0 = r8.getString(r0)
        L_0x0038:
            r9.setText(r0)
            android.view.View r9 = r14.A00
            r0 = 35
            X.54E r1 = new X.54E
            r1.<init>(r2, r0, r7)
        L_0x0044:
            r9.setOnClickListener(r1)
        L_0x0047:
            return
        L_0x0048:
            r5 = 2131894931(0x7f122293, float:1.942468E38)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            X.5ZU r0 = r8.A05
            X.C18300x5.A1E(r0, r6, r1, r3)
            java.lang.String r0 = r8.getString(r5, r1)
            goto L_0x0038
        L_0x0057:
            X.4Yh r14 = (X.C88324Yh) r14
            com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity r15 = r7.A01
            android.view.View r1 = r14.A01
            r1.setClickable(r4)
            android.widget.ImageView r10 = r14.A04
            r10.setVisibility(r3)
            r10.setClickable(r4)
            android.widget.ImageView r9 = r14.A05
            r9.setVisibility(r3)
            r9.setClickable(r4)
            android.widget.ImageView r6 = r14.A03
            r6.setVisibility(r3)
            r8 = r2
            X.7NE r8 = (X.AnonymousClass7NE) r8
            java.util.ArrayList r5 = r15.A0N
            int r0 = r8.A00
            java.lang.Object r5 = r5.get(r0)
            android.util.SparseArray r5 = (android.util.SparseArray) r5
            int r0 = r8.A01
            X.5I7 r5 = com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity.A0C(r5, r0)
            android.view.View r13 = r14.A00
            r13.setTag(r5)
            java.lang.Object r0 = r8.A02
            boolean r8 = r0 instanceof X.AnonymousClass7OD
            r12 = 4
            if (r8 == 0) goto L_0x010e
            X.7OD r0 = (X.AnonymousClass7OD) r0
            r5.A00 = r0
            r18 = 2131233957(0x7f080ca5, float:1.8084066E38)
            boolean r8 = r15.A0L
            if (r8 == 0) goto L_0x00a2
            r18 = 2131231718(0x7f0803e6, float:1.8079525E38)
        L_0x00a2:
            java.lang.String r8 = r0.A02
            r11 = 1000(0x3e8, float:1.401E-42)
            java.lang.String r16 = X.C107575bX.A0C(r8, r11)
            int r8 = r0.A00
            if (r8 != 0) goto L_0x0107
            java.lang.String r8 = r0.A03
            java.lang.String r17 = X.C107575bX.A0C(r8, r11)
        L_0x00b4:
            boolean r5 = r5.A01
            r19 = r4
            r20 = r5
            com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity.A0X(r14, r15, r16, r17, r18, r19, r20)
            boolean r5 = r15.A0L
            if (r5 != 0) goto L_0x026c
            com.whatsapp.jid.UserJid r5 = r0.A01
            if (r5 == 0) goto L_0x0299
            boolean r0 = X.AnonymousClass4SG.A46(r15, r5)
            if (r0 != 0) goto L_0x0299
            X.3Ex r0 = r15.A03
            X.3ZH r4 = r0.A0A(r5)
            r6.setVisibility(r3)
            r6 = 14
            X.5el r0 = new X.5el
            r0.<init>(r7, r5, r2, r6)
            r1.setOnClickListener(r0)
            r2 = 1041865114(0x3e19999a, float:0.15)
            X.5fL r0 = new X.5fL
            r0.<init>(r2, r2, r2, r2)
            r10.setOnTouchListener(r0)
            r1 = 15
            X.5el r0 = new X.5el
            r0.<init>(r7, r5, r4, r1)
            r10.setOnClickListener(r0)
            X.5fL r0 = new X.5fL
            r0.<init>(r2, r2, r2, r2)
            r9.setOnTouchListener(r0)
            r9.setVisibility(r3)
            r0 = 27
            X.5ei r1 = new X.5ei
            r1.<init>(r7, r0, r4)
            goto L_0x0044
        L_0x0107:
            java.lang.Class<android.provider.ContactsContract$CommonDataKinds$Phone> r11 = android.provider.ContactsContract.CommonDataKinds.Phone.class
            java.lang.String r17 = r15.A74(r11, r8)
            goto L_0x00b4
        L_0x010e:
            boolean r8 = r0 instanceof X.AnonymousClass5KP
            if (r8 == 0) goto L_0x01da
            X.5KP r0 = (X.AnonymousClass5KP) r0
            r5.A00 = r0
            java.lang.Class r1 = r0.A01
            java.lang.Class<android.provider.ContactsContract$CommonDataKinds$Email> r7 = android.provider.ContactsContract.CommonDataKinds.Email.class
            if (r1 != r7) goto L_0x0149
            java.lang.String r1 = r0.A02
            r2 = 1000(0x3e8, float:1.401E-42)
            java.lang.String r16 = X.C107575bX.A0C(r1, r2)
            int r1 = r0.A00
            if (r1 != 0) goto L_0x0144
            java.lang.String r0 = r0.A03
            java.lang.String r17 = X.C107575bX.A0C(r0, r2)
        L_0x012e:
            r18 = 2131231318(0x7f080256, float:1.8078714E38)
            r19 = 2
        L_0x0133:
            boolean r0 = r5.A01
            r20 = r0
            com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity.A0X(r14, r15, r16, r17, r18, r19, r20)
            com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity.A0L(r14)
            r6.setVisibility(r3)
        L_0x0140:
            r13.setClickable(r4)
            return
        L_0x0144:
            java.lang.String r17 = r15.A74(r7, r1)
            goto L_0x012e
        L_0x0149:
            java.lang.Class<android.provider.ContactsContract$CommonDataKinds$StructuredPostal> r7 = android.provider.ContactsContract.CommonDataKinds.StructuredPostal.class
            if (r1 != r7) goto L_0x0047
            X.5X7 r10 = r0.A04
            if (r10 == 0) goto L_0x01d7
            java.lang.StringBuilder r9 = X.AnonymousClass001.A0o()
            java.lang.String r2 = r10.A03
            if (r2 == 0) goto L_0x016b
            int r1 = r2.length()
            if (r1 <= 0) goto L_0x016b
            java.lang.String r1 = X.AnonymousClass5X7.A00(r2)
            r9.append(r1)
            r1 = 10
            r9.append(r1)
        L_0x016b:
            java.lang.String r2 = r10.A00
            r12 = 1
            if (r2 == 0) goto L_0x01d5
            int r1 = r2.length()
            if (r1 <= 0) goto L_0x01d5
            r9.append(r2)
            r11 = 1
        L_0x017a:
            java.lang.String r2 = r10.A02
            java.lang.String r8 = " "
            if (r2 == 0) goto L_0x018f
            int r1 = r2.length()
            if (r1 <= 0) goto L_0x018f
            if (r11 == 0) goto L_0x018b
            r9.append(r8)
        L_0x018b:
            r9.append(r2)
            r11 = 1
        L_0x018f:
            java.lang.String r2 = r10.A04
            if (r2 == 0) goto L_0x01d3
            int r1 = r2.length()
            if (r1 <= 0) goto L_0x01d3
            if (r11 == 0) goto L_0x019e
            r9.append(r8)
        L_0x019e:
            r9.append(r2)
        L_0x01a1:
            java.lang.String r2 = r10.A01
            if (r2 == 0) goto L_0x01b3
            int r1 = r2.length()
            if (r1 <= 0) goto L_0x01b3
            if (r12 == 0) goto L_0x01b0
            r9.append(r8)
        L_0x01b0:
            r9.append(r2)
        L_0x01b3:
            java.lang.String r1 = r9.toString()
        L_0x01b7:
            r2 = 1000(0x3e8, float:1.401E-42)
            java.lang.String r16 = X.C107575bX.A0C(r1, r2)
            int r1 = r0.A00
            if (r1 != 0) goto L_0x01ce
            java.lang.String r0 = r0.A03
            java.lang.String r17 = X.C107575bX.A0C(r0, r2)
        L_0x01c7:
            r18 = 2131231315(0x7f080253, float:1.8078708E38)
            r19 = 3
            goto L_0x0133
        L_0x01ce:
            java.lang.String r17 = r15.A74(r7, r1)
            goto L_0x01c7
        L_0x01d3:
            r12 = r11
            goto L_0x01a1
        L_0x01d5:
            r11 = 0
            goto L_0x017a
        L_0x01d7:
            java.lang.String r1 = "null"
            goto L_0x01b7
        L_0x01da:
            boolean r8 = r0 instanceof X.AnonymousClass5T6
            if (r8 == 0) goto L_0x01f1
            X.5T6 r0 = (X.AnonymousClass5T6) r0
            X.AnonymousClass0x2.A18(r0)
            java.lang.String r7 = r0.A02
            java.lang.String r2 = r0.A01
            java.lang.String r1 = "BDAY"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x02df
            goto L_0x02a0
        L_0x01f1:
            boolean r8 = r0 instanceof X.C148467Im
            if (r8 == 0) goto L_0x023b
            X.7Im r0 = (X.C148467Im) r0
            java.lang.String r3 = r0.A01
            int r1 = r0.A00
            switch(r1) {
                case 1: goto L_0x0237;
                case 2: goto L_0x0233;
                case 3: goto L_0x022f;
                case 4: goto L_0x022b;
                case 5: goto L_0x0227;
                case 6: goto L_0x0223;
                case 7: goto L_0x021f;
                default: goto L_0x01fe;
            }
        L_0x01fe:
            r1 = 2131895133(0x7f12235d, float:1.942509E38)
        L_0x0201:
            java.lang.String r2 = r15.getString(r1)
            r1 = 1000(0x3e8, float:1.401E-42)
            java.lang.String r16 = X.C107575bX.A0C(r3, r1)
            java.lang.String r17 = X.C107575bX.A0C(r2, r1)
            r18 = 2131232816(0x7f080830, float:1.8081752E38)
            r19 = 3
            boolean r1 = r5.A01
            r20 = r1
            com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity.A0X(r14, r15, r16, r17, r18, r19, r20)
            r5.A00 = r0
            goto L_0x030e
        L_0x021f:
            r1 = 2131895547(0x7f1224fb, float:1.942593E38)
            goto L_0x0201
        L_0x0223:
            r1 = 2131895544(0x7f1224f8, float:1.9425924E38)
            goto L_0x0201
        L_0x0227:
            r1 = 2131895549(0x7f1224fd, float:1.9425934E38)
            goto L_0x0201
        L_0x022b:
            r1 = 2131895545(0x7f1224f9, float:1.9425926E38)
            goto L_0x0201
        L_0x022f:
            r1 = 2131895548(0x7f1224fc, float:1.9425932E38)
            goto L_0x0201
        L_0x0233:
            r1 = 2131895543(0x7f1224f7, float:1.9425922E38)
            goto L_0x0201
        L_0x0237:
            r1 = 2131895546(0x7f1224fa, float:1.9425928E38)
            goto L_0x0201
        L_0x023b:
            boolean r8 = r0 instanceof X.C148447Ik
            if (r8 == 0) goto L_0x0047
            X.7Ik r0 = (X.C148447Ik) r0
            java.lang.String r9 = r0.A01
            r8 = 1000(0x3e8, float:1.401E-42)
            java.lang.String r16 = X.C107575bX.A0C(r9, r8)
            java.lang.String r17 = ""
            r18 = 2131233957(0x7f080ca5, float:1.8084066E38)
            boolean r5 = r5.A01
            r19 = r4
            r20 = r5
            com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity.A0X(r14, r15, r16, r17, r18, r19, r20)
            boolean r5 = r15.A0L
            if (r5 != 0) goto L_0x0269
            r6.setVisibility(r3)
            r4 = 16
            X.5el r3 = new X.5el
            r3.<init>(r7, r0, r2, r4)
            r1.setOnClickListener(r3)
            return
        L_0x0269:
            r6.setVisibility(r12)
        L_0x026c:
            com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity.A0L(r14)
            goto L_0x0140
        L_0x0271:
            X.6Ib r14 = (X.C125446Ib) r14
            X.7Ek r2 = (X.C147467Ek) r2
            android.view.View r3 = r14.A00
            boolean r0 = r2.A00
            if (r0 == 0) goto L_0x0282
            com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity r0 = r7.A01
            boolean r1 = r0.A0L
            r0 = 0
            if (r1 != 0) goto L_0x0284
        L_0x0282:
            r0 = 8
        L_0x0284:
            r3.setVisibility(r0)
            android.view.View r1 = r14.A01
            boolean r0 = r2.A00
            if (r0 == 0) goto L_0x0297
            com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity r0 = r7.A01
            boolean r0 = r0.A0L
            if (r0 == 0) goto L_0x0297
        L_0x0293:
            r1.setVisibility(r8)
            return
        L_0x0297:
            r8 = 0
            goto L_0x0293
        L_0x0299:
            com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity.A0L(r14)
            r6.setVisibility(r12)
            return
        L_0x02a0:
            java.lang.String r1 = "--"
            boolean r1 = r7.startsWith(r1)     // Catch:{ ParseException -> 0x02db }
            if (r1 == 0) goto L_0x02d0
            java.lang.String r8 = "--MM-dd"
        L_0x02aa:
            java.util.Locale r2 = java.util.Locale.getDefault()     // Catch:{ ParseException -> 0x02db }
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat     // Catch:{ ParseException -> 0x02db }
            r1.<init>(r8, r2)     // Catch:{ ParseException -> 0x02db }
            java.util.Date r1 = r1.parse(r7)     // Catch:{ ParseException -> 0x02db }
            X.C626936e.A06(r1)     // Catch:{ ParseException -> 0x02db }
            long r1 = r1.getTime()     // Catch:{ ParseException -> 0x02db }
            if (r4 == 0) goto L_0x02d4
            X.33j r4 = r15.A0A     // Catch:{ ParseException -> 0x02db }
            java.text.DateFormat r8 = X.C107505bQ.A08(r4)     // Catch:{ ParseException -> 0x02db }
            java.util.Date r4 = new java.util.Date     // Catch:{ ParseException -> 0x02db }
            r4.<init>(r1)     // Catch:{ ParseException -> 0x02db }
            java.lang.String r7 = r8.format(r4)     // Catch:{ ParseException -> 0x02db }
            goto L_0x02df
        L_0x02d0:
            java.lang.String r8 = "yyyy-MM-dd"
            r4 = 0
            goto L_0x02aa
        L_0x02d4:
            X.33j r4 = r15.A0A     // Catch:{ ParseException -> 0x02db }
            java.lang.String r7 = X.C107505bQ.A06(r4, r1)     // Catch:{ ParseException -> 0x02db }
            goto L_0x02df
        L_0x02db:
            r1 = move-exception
            r1.printStackTrace()
        L_0x02df:
            java.util.HashMap r2 = X.C106705a1.A0E
            java.lang.String r1 = r0.A01
            boolean r1 = r2.containsKey(r1)
            if (r1 == 0) goto L_0x0312
            java.util.HashMap r2 = X.C106705a1.A0D
            java.lang.String r1 = r0.A01
            java.lang.Object r2 = r2.get(r1)
        L_0x02f1:
            java.lang.String r2 = (java.lang.String) r2
        L_0x02f3:
            r1 = 1000(0x3e8, float:1.401E-42)
            java.lang.String r16 = X.C107575bX.A0C(r7, r1)
            java.lang.String r17 = X.C107575bX.A0C(r2, r1)
            r18 = 2131231315(0x7f080253, float:1.8078708E38)
            r19 = 3
            boolean r1 = r5.A01
            r20 = r1
            com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity.A0X(r14, r15, r16, r17, r18, r19, r20)
            r5.A00 = r0
            r6.setVisibility(r12)
        L_0x030e:
            com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity.A0L(r14)
            return
        L_0x0312:
            java.lang.String r2 = r0.A01
            java.lang.String r1 = "URL"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0330
            java.util.Set r1 = r0.A04
            java.lang.Object[] r2 = r1.toArray()
            int r1 = r2.length
            if (r1 <= 0) goto L_0x0328
            r2 = r2[r3]
            goto L_0x02f1
        L_0x0328:
            r1 = 2131895133(0x7f12235d, float:1.942509E38)
            java.lang.String r2 = r15.getString(r1)
            goto L_0x02f3
        L_0x0330:
            java.util.HashMap r1 = X.C106705a1.A0D
            java.lang.Object r2 = r1.get(r2)
            goto L_0x02f1
        L_0x0337:
            X.4YW r14 = (X.AnonymousClass4YW) r14
            X.7El r2 = (X.C147477El) r2
            X.5a1 r4 = r2.A00
            com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity r6 = r7.A01
            boolean r0 = r6.A0L
            if (r0 != 0) goto L_0x03ae
            boolean r0 = X.AnonymousClass4SG.A45(r6)
            if (r0 != 0) goto L_0x03ae
            android.widget.Button r1 = r14.A00
            r1.setVisibility(r3)
            r0 = 26
            X.C109495ei.A00(r1, r7, r4, r0)
        L_0x0353:
            com.whatsapp.TextEmojiLabel r10 = r14.A03
            java.lang.String r0 = r4.A03()
            r7 = 1000(0x3e8, float:1.401E-42)
            java.lang.String r9 = X.C107575bX.A0C(r0, r7)
            android.text.TextPaint r2 = r10.getPaint()
            X.5Y0 r1 = r6.A0C
            if (r9 != 0) goto L_0x03a4
            r0 = 0
        L_0x0368:
            r10.setText(r0)
            java.util.List r0 = r4.A05
            if (r0 == 0) goto L_0x03a2
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x03a2
            java.util.List r0 = r4.A05
            java.lang.Object r0 = r0.get(r3)
            X.7Il r0 = (X.C148457Il) r0
            java.lang.String r2 = r0.A00
        L_0x037f:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L_0x0395
            android.widget.TextView r0 = r14.A02
            r0.setVisibility(r8)
        L_0x038a:
            X.5Uq r1 = r6.A06
            android.widget.ImageView r0 = r14.A01
            r1.A0B(r0, r4)
            X.AnonymousClass0YY.A06(r0, r5)
            return
        L_0x0395:
            android.widget.TextView r1 = r14.A02
            java.lang.String r0 = X.C107575bX.A0C(r2, r7)
            r1.setText(r0)
            r1.setVisibility(r3)
            goto L_0x038a
        L_0x03a2:
            r2 = 0
            goto L_0x037f
        L_0x03a4:
            X.8GT r0 = new X.8GT
            r0.<init>()
            java.lang.CharSequence r0 = X.C107345b9.A02(r6, r2, r0, r1, r9)
            goto L_0x0368
        L_0x03ae:
            android.widget.Button r0 = r14.A00
            r0.setVisibility(r8)
            goto L_0x0353
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C87854Wj.BNf(X.0Ua, int):void");
    }

    public int getItemViewType(int i) {
        Object obj = this.A00.get(i);
        if (obj instanceof C147477El) {
            return 0;
        }
        if (obj instanceof AnonymousClass7NE) {
            return 1;
        }
        if (obj instanceof C147467Ek) {
            return 2;
        }
        if (obj instanceof AnonymousClass7NF) {
            return 3;
        }
        return -1;
    }

    public C05570Ua BQR(ViewGroup viewGroup, int i) {
        LayoutInflater A0D = C18280x3.A0D(viewGroup);
        if (i == 0) {
            return new AnonymousClass4YW(A0D.inflate(R.layout.f8nameremoved, (ViewGroup) null, true));
        }
        if (i == 1) {
            return new C88324Yh(A0D.inflate(R.layout.f8nameremoved, (ViewGroup) null, true));
        }
        if (i == 2) {
            return new C125446Ib(A0D.inflate(R.layout.f8nameremoved, (ViewGroup) null, true));
        }
        if (i == 3) {
            return new C125456Ic(A0D.inflate(R.layout.f8nameremoved, (ViewGroup) null, true));
        }
        throw new IllegalStateException();
    }
}
