package com.whatsapp.payments.ui;

import X.AnonymousClass0x9;
import X.AnonymousClass303;
import X.AnonymousClass5V0;
import X.AnonymousClass5VI;
import X.AnonymousClass5ZR;
import X.AnonymousClass97T;
import X.AnonymousClass9DA;
import X.AnonymousClass9ER;
import X.AnonymousClass9VY;
import X.C107695bk;
import X.C18280x3;
import X.C1899593h;
import X.C1899693i;
import X.C192799Lp;
import X.C19340zH;
import X.C202769mY;
import X.C204019og;
import X.C64333Db;
import X.C86614Ku;
import X.C88834as;
import android.content.Intent;
import android.os.Build;
import android.telephony.SubscriptionInfo;
import android.view.Menu;
import android.view.MenuItem;
import com.whatsapp.R;

public class IndiaUpiSimVerificationActivity extends AnonymousClass9DA implements C202769mY {
    public AnonymousClass5ZR A00;
    public AnonymousClass9ER A01;
    public AnonymousClass9VY A02;
    public boolean A03;

    public final void A7X(String str) {
        AnonymousClass303 r3 = new AnonymousClass303((String) null, new AnonymousClass303[0]);
        r3.A03("device_binding_failure_reason", str);
        this.A0S.BKE(r3, 0, (Integer) null, "payments_device_binding_precheck", "verify_number");
    }

    public void A5r() {
        if (!this.A03) {
            this.A03 = true;
            C88834as A0I = C18280x3.A0I(this);
            C64333Db r2 = A0I.A4Z;
            C1899593h.A15(r2, this);
            C107695bk r1 = r2.A00;
            C1899593h.A0z(r2, r1, this, C1899593h.A0W(r2, r1, this));
            AnonymousClass97T.A0h(A0I, r2, r1, this);
            AnonymousClass97T.A0i(A0I, r2, r1, this, C1899693i.A0Y(r2));
            AnonymousClass97T.A0m(r2, r1, this);
            AnonymousClass97T.A0o(r2, r1, this);
            AnonymousClass97T.A0n(r2, r1, this);
            this.A00 = C86614Ku.A0V(r2);
            this.A02 = r2.ApM();
            this.A01 = AnonymousClass97T.A0Z(r1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r0 == false) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A7V() {
        /*
            r15 = this;
            X.5ZR r1 = r15.A00
            java.lang.String r3 = "android.permission.SEND_SMS"
            int r0 = r1.A02(r3)
            if (r0 != 0) goto L_0x0011
            boolean r0 = r1.A0F()
            r1 = 1
            if (r0 != 0) goto L_0x0012
        L_0x0011:
            r1 = 0
        L_0x0012:
            r12 = 0
            r2 = 0
            java.lang.Integer r11 = java.lang.Integer.valueOf(r2)
            X.5ZR r0 = r15.A00
            if (r1 == 0) goto L_0x0200
            java.lang.String r1 = "android.permission.RECEIVE_SMS"
            int r0 = r0.A02(r1)
            if (r0 == 0) goto L_0x0035
            X.5ZR r0 = r15.A00
            int r0 = r0.A02(r3)
            if (r0 != 0) goto L_0x0035
            java.lang.String[] r1 = new java.lang.String[]{r1}
            r0 = 100
            X.C005205m.A02(r15, r1, r0)
        L_0x0035:
            boolean r0 = X.C29441ip.A02(r15)
            if (r0 == 0) goto L_0x0047
            java.lang.String r0 = "airplane_mode_on"
            r15.A7X(r0)
            r0 = 2131891938(0x7f1216e2, float:1.941861E38)
        L_0x0043:
            r15.Bot(r0)
            return
        L_0x0047:
            X.33i r0 = r15.A08
            android.telephony.TelephonyManager r0 = r0.A0N()
            if (r0 == 0) goto L_0x0071
            int r1 = r0.getSimState()
            r0 = 5
            if (r1 != r0) goto L_0x0071
            int r3 = android.os.Build.VERSION.SDK_INT
            r0 = 22
            if (r3 < r0) goto L_0x0173
            java.lang.String r0 = "android.permission.READ_PHONE_STATE"
            int r0 = X.AnonymousClass0Y8.A05(r15, r0)
            if (r0 == 0) goto L_0x007a
            X.7oG r1 = r15.A0p
            java.lang.String r0 = "WaPermissionsHelper#hasSendSMSAndTelephonePermissions() is missing android.permission.READ_PHONE_STATE permission"
            r1.A05(r0)
            java.lang.String r0 = "read_phone_permission_issues"
            r15.A7X(r0)
            return
        L_0x0071:
            java.lang.String r0 = "sim_state_issues"
            r15.A7X(r0)
            r0 = 2131891940(0x7f1216e4, float:1.9418614E38)
            goto L_0x0043
        L_0x007a:
            android.telephony.SubscriptionManager r0 = android.telephony.SubscriptionManager.from(r15)
            java.util.List r4 = r0.getActiveSubscriptionInfoList()
            X.303[] r0 = new X.AnonymousClass303[r2]
            X.303 r10 = new X.303
            r10.<init>(r12, r0)
            int r0 = r4.size()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "number_of_sims"
            r10.A03(r0, r1)
            X.9ca r9 = r15.A0S
            java.lang.String r13 = "payments_device_binding_precheck"
            java.lang.String r14 = "verify_number"
            r9.BKE(r10, r11, r12, r13, r14)
            int r1 = r4.size()
            if (r1 == 0) goto L_0x016e
            r8 = 1774(0x6ee, float:2.486E-42)
            java.lang.String r7 = "allow_undetermined_number_device_binding"
            r5 = 1
            if (r1 == r5) goto L_0x0187
            r0 = 2
            if (r1 == r0) goto L_0x00bf
            X.7oG r1 = r15.A0p
            java.lang.String r0 = "Phone has more than 2 sims, which we do not support"
            r1.A05(r0)
            java.lang.String r0 = "more_than_two_sims"
            r15.A7X(r0)
            r15.finish()
            return
        L_0x00bf:
            com.whatsapp.jid.PhoneUserJid r6 = X.AnonymousClass4SG.A2m(r15)
            java.lang.Object r0 = r4.get(r2)
            android.telephony.SubscriptionInfo r0 = (android.telephony.SubscriptionInfo) r0
            java.lang.String r3 = r0.getNumber()
            java.lang.Object r0 = r4.get(r5)
            android.telephony.SubscriptionInfo r0 = (android.telephony.SubscriptionInfo) r0
            java.lang.String r1 = r0.getNumber()
            if (r6 == 0) goto L_0x0123
            java.lang.String r0 = r6.user
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0123
            X.9VY r0 = r15.A02
            java.lang.String r10 = r6.user
            X.5Xx r9 = r0.A01
            X.9ca r0 = r0.A0C
            boolean r0 = X.AnonymousClass9VY.A00(r9, r0, r3, r10)
            if (r0 == 0) goto L_0x0107
            X.7oG r1 = r15.A0p
            java.lang.String r0 = "sim 1 is not empty, matches with wa number, proceed"
            r1.A06(r0)
            X.9bS r1 = r15.A0M
            java.lang.Object r0 = r4.get(r2)
        L_0x00fc:
            android.telephony.SubscriptionInfo r0 = (android.telephony.SubscriptionInfo) r0
            int r0 = r0.getSubscriptionId()
            r1.A0F(r0)
            goto L_0x01ac
        L_0x0107:
            X.9VY r0 = r15.A02
            java.lang.String r9 = r6.user
            X.5Xx r6 = r0.A01
            X.9ca r0 = r0.A0C
            boolean r0 = X.AnonymousClass9VY.A00(r6, r0, r1, r9)
            if (r0 == 0) goto L_0x0135
            X.7oG r1 = r15.A0p
            java.lang.String r0 = "sim 2 is not empty, matches with wa number, proceed"
            r1.A06(r0)
            X.9bS r1 = r15.A0M
            java.lang.Object r0 = r4.get(r5)
            goto L_0x00fc
        L_0x0123:
            X.7oG r1 = r15.A0p
            java.lang.String r0 = "Jid Info null, show sim picker"
            goto L_0x0131
        L_0x0128:
            X.9ca r0 = r15.A0S
            r0.BKB(r11, r12, r7, r12)
            X.7oG r1 = r15.A0p
            java.lang.String r0 = "Did not find WA number, show sim picker"
        L_0x0131:
            r1.A06(r0)
            goto L_0x0155
        L_0x0135:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x0128
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0128
            X.1VX r0 = r15.A0D
            boolean r0 = r0.A0X(r8)
            X.7oG r1 = r15.A0p
            if (r0 == 0) goto L_0x01e3
            java.lang.String r0 = "Cannot read sim number(s) to compare with WA, show sim picker"
            r1.A06(r0)
            X.9ca r0 = r15.A0S
            r0.BKB(r11, r12, r7, r12)
        L_0x0155:
            android.os.Bundle r2 = X.AnonymousClass002.A08()
            java.util.ArrayList r1 = X.AnonymousClass002.A0J(r4)
            java.lang.String r0 = "extra_subscriptions"
            r2.putParcelableArrayList(r0, r1)
            com.whatsapp.payments.ui.IndiaUpiSimPickerDialogFragment r0 = new com.whatsapp.payments.ui.IndiaUpiSimPickerDialogFragment
            r0.<init>()
            r0.A0u(r2)
            r15.Boo(r0)
            return
        L_0x016e:
            X.7oG r1 = r15.A0p
            java.lang.String r0 = "found no sim information, proceeding"
            goto L_0x01a9
        L_0x0173:
            X.7oG r2 = r15.A0p
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Trying payments on android sdk level"
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = ", we do not have sim apis"
            X.C1899593h.A1J(r2, r0, r1)
            goto L_0x01ac
        L_0x0187:
            java.lang.Object r0 = r4.get(r2)
            android.telephony.SubscriptionInfo r0 = (android.telephony.SubscriptionInfo) r0
            java.lang.String r4 = r0.getNumber()
            com.whatsapp.jid.PhoneUserJid r1 = X.AnonymousClass4SG.A2m(r15)
            if (r1 == 0) goto L_0x01de
            java.lang.String r0 = r1.user
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x01de
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L_0x01b0
            X.7oG r1 = r15.A0p
            java.lang.String r0 = "found one sim, but not able to read phone number, proceeding"
        L_0x01a9:
            r1.A05(r0)
        L_0x01ac:
            r15.A7W()
            return
        L_0x01b0:
            X.9VY r0 = r15.A02
            java.lang.String r3 = r1.user
            X.5Xx r1 = r0.A01
            X.9ca r0 = r0.A0C
            boolean r0 = X.AnonymousClass9VY.A00(r1, r0, r4, r3)
            X.7oG r1 = r15.A0p
            if (r0 == 0) goto L_0x01c6
            java.lang.String r0 = "wa number matches with sim number, proceeding"
            r1.A06(r0)
            goto L_0x01ac
        L_0x01c6:
            java.lang.String r0 = "wa number didn't match with sim number, showing error"
            r1.A05(r0)
            X.1VX r0 = r15.A0D
            boolean r0 = r0.A0X(r8)
            if (r0 == 0) goto L_0x01e8
            java.lang.String r0 = "Cannot read sim number, allow device binding"
            r1.A06(r0)
            X.9ca r0 = r15.A0S
            r0.BKB(r11, r12, r7, r12)
            goto L_0x01ac
        L_0x01de:
            X.7oG r1 = r15.A0p
            java.lang.String r0 = "Jid Info null, proceeding"
            goto L_0x01a9
        L_0x01e3:
            java.lang.String r0 = "Found sims numbers and they do not match, show error"
            r1.A06(r0)
        L_0x01e8:
            r4 = 2131892143(0x7f1217af, float:1.9419026E38)
            r3 = 2131892142(0x7f1217ae, float:1.9419024E38)
            java.lang.Object[] r1 = new java.lang.Object[r5]
            X.2sr r0 = r15.A01
            X.1RR r0 = X.C86634Kw.A0V(r0)
            java.lang.String r0 = X.AnonymousClass36P.A02(r0)
            r1[r2] = r0
            r15.Box(r1, r4, r3)
            return
        L_0x0200:
            com.whatsapp.RequestPermissionActivity.A0g(r15, r0)
            X.9ca r2 = r15.A0S
            java.lang.String r1 = "allow_sms_dialog"
            java.lang.String r0 = "verify_number"
            r2.BKB(r11, r12, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.IndiaUpiSimVerificationActivity.A7V():void");
    }

    public final void A7W() {
        this.A01.A00.A0B("verifyNumberClicked");
        Intent A08 = AnonymousClass0x9.A08(this, IndiaUpiDeviceBindStepActivity.class);
        A08.putExtras(C86614Ku.A0D(this));
        AnonymousClass5VI.A00(A08, "verifyNumber");
        A7O(A08);
        C1899593h.A0k(A08, this, "extra_previous_screen", "verify_number");
    }

    public void Bbf(SubscriptionInfo subscriptionInfo) {
        if (Build.VERSION.SDK_INT >= 22) {
            this.A0M.A0F(subscriptionInfo.getSubscriptionId());
            A7W();
            return;
        }
        this.A0p.A05("Why sim picker is showing for < 22 api level?");
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 153) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            this.A0S.BKB(1, 66, "allow_sms_dialog", (String) null);
            A7V();
        } else {
            Bot(R.string.f11nameremoved);
            this.A0S.BKB(1, 67, "allow_sms_dialog", (String) null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0134, code lost:
        if (android.text.TextUtils.isEmpty(r7) == false) goto L_0x00e2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r19) {
        /*
            r18 = this;
            r9 = r18
            r0 = r19
            super.onCreate(r0)
            r0 = 2131625196(0x7f0e04ec, float:1.8877593E38)
            r9.setContentView((int) r0)
            r1 = 2131233348(0x7f080a44, float:1.808283E38)
            r0 = 2131433256(0x7f0b1728, float:1.8488293E38)
            r9.A7K(r1, r0)
            X.0R8 r1 = r9.getSupportActionBar()
            r4 = 1
            if (r1 == 0) goto L_0x002a
            r0 = 2131891871(0x7f12169f, float:1.9418474E38)
            java.lang.String r0 = r9.getString(r0)
            r1.A0J(r0)
            r1.A0N(r4)
        L_0x002a:
            r0 = 2131429396(0x7f0b0814, float:1.8480464E38)
            android.widget.TextView r6 = X.C18310x6.A0L(r9, r0)
            r5 = 2131892135(0x7f1217a7, float:1.941901E38)
            java.lang.Object[] r3 = new java.lang.Object[r4]
            X.2sr r0 = r9.A01
            X.1RR r0 = X.C86634Kw.A0V(r0)
            java.lang.String r2 = X.AnonymousClass36P.A02(r0)
            r0 = 0
            if (r2 == 0) goto L_0x004b
            r1 = 32
            r0 = 160(0xa0, float:2.24E-43)
            java.lang.String r0 = r2.replace(r1, r0)
        L_0x004b:
            r2 = 0
            r3[r2] = r0
            X.AnonymousClass001.A0y(r9, r6, r3, r5)
            X.33i r0 = r9.A08
            android.telephony.TelephonyManager r3 = r0.A0N()
            X.5ZR r1 = r9.A00
            java.lang.String r0 = "android.permission.SEND_SMS"
            int r0 = r1.A02(r0)
            if (r0 != 0) goto L_0x00e2
            boolean r0 = r1.A0F()
            if (r0 == 0) goto L_0x00e2
            boolean r0 = X.C29441ip.A02(r9)
            if (r0 != 0) goto L_0x00e2
            if (r3 == 0) goto L_0x00e2
            int r1 = r3.getSimState()
            r0 = 5
            if (r1 != r0) goto L_0x00e2
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 22
            if (r1 < r0) goto L_0x00e2
            java.lang.String r0 = "android.permission.READ_PHONE_STATE"
            int r0 = X.AnonymousClass0Y8.A05(r9, r0)
            if (r0 != 0) goto L_0x00e2
            X.9VY r0 = r9.A02
            java.util.List r3 = r0.A05(r9)
            int r1 = r3.size()
            r0 = 2
            if (r1 != r0) goto L_0x00e2
            r0 = 2131432506(0x7f0b143a, float:1.8486771E38)
            android.widget.TextView r5 = X.C18310x6.A0L(r9, r0)
            com.whatsapp.jid.PhoneUserJid r1 = X.AnonymousClass4SG.A2m(r9)
            java.lang.String r8 = X.AnonymousClass001.A0n(r3, r2)
            java.lang.String r7 = X.AnonymousClass001.A0n(r3, r4)
            if (r1 == 0) goto L_0x00dc
            java.lang.String r0 = r1.user
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00dc
            java.lang.String r3 = r1.user
            X.9VY r0 = r9.A02
            X.5Xx r1 = r0.A01
            X.9ca r0 = r0.A0C
            boolean r0 = X.AnonymousClass9VY.A00(r1, r0, r8, r3)
            if (r0 != 0) goto L_0x00dc
            X.9VY r0 = r9.A02
            X.5Xx r1 = r0.A01
            X.9ca r0 = r0.A0C
            boolean r0 = X.AnonymousClass9VY.A00(r1, r0, r7, r3)
            if (r0 == 0) goto L_0x012a
            r3 = 2131892136(0x7f1217a8, float:1.9419012E38)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            X.2sr r0 = r9.A01
            X.1RR r0 = X.C86634Kw.A0V(r0)
            java.lang.String r0 = X.AnonymousClass36P.A02(r0)
            r1[r2] = r0
            X.AnonymousClass001.A0y(r9, r6, r1, r3)
        L_0x00dc:
            r0 = 2131892138(0x7f1217aa, float:1.9419016E38)
            r5.setText(r0)
        L_0x00e2:
            r0 = 2131431883(0x7f0b11cb, float:1.8485508E38)
            android.view.View r13 = r9.findViewById(r0)
            com.whatsapp.TextEmojiLabel r13 = (com.whatsapp.TextEmojiLabel) r13
            X.1VX r15 = r9.A0D
            X.3Wi r12 = r9.A05
            X.5hX r11 = r9.A00
            X.33i r14 = r9.A08
            r3 = 2131892003(0x7f121723, float:1.9418742E38)
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r1 = "learn-more"
            java.lang.String r16 = X.AnonymousClass002.A0F(r9, r1, r0, r2, r3)
            java.lang.String r0 = "https://faq.whatsapp.com/general/payments/learn-more-about-sharing-the-legal-name-on-your-bank-account"
            android.net.Uri r10 = android.net.Uri.parse(r0)
            r17 = r1
            X.C107635bd.A0E(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r13.setVisibility(r2)
            r0 = 2131434630(0x7f0b1c86, float:1.849108E38)
            android.view.View r1 = r9.findViewById(r0)
            r0 = 101(0x65, float:1.42E-43)
            X.C204249p3.A02(r1, r9, r0)
            X.9ca r0 = r9.A0S
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1 = 0
            java.lang.String r4 = r9.A0b
            java.lang.String r5 = "verify_number"
            java.lang.String r6 = r9.A0e
            r3 = r1
            r0.A09(r1, r2, r3, r4, r5, r6)
            return
        L_0x012a:
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L_0x00dc
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto L_0x00e2
            goto L_0x00dc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.IndiaUpiSimVerificationActivity.onCreate(android.os.Bundle):void");
    }

    public IndiaUpiSimVerificationActivity(int i) {
        this.A03 = false;
        C204019og.A00(this, 92);
    }

    public void A6O(int i) {
        if (!(i == R.string.f11nameremoved || i == R.string.f11nameremoved || i == R.string.f11nameremoved || i == R.string.f11nameremoved || i == R.string.f11nameremoved)) {
            A7H();
        }
        finish();
    }

    public void onBackPressed() {
        super.onBackPressed();
        this.A0S.A09((AnonymousClass303) null, 1, 1, this.A0b, "verify_number", this.A0e);
        if (!this.A0M.A0P()) {
            Intent A08 = AnonymousClass0x9.A08(this, C192799Lp.A00(this.A0D));
            A7O(A08);
            A6T(A08, true);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        A7P(menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.menuitem_help) {
            C19340zH A002 = AnonymousClass5V0.A00(this);
            A002.A00.A0C(R.layout.f8nameremoved);
            A7Q(A002, "verify_number", "payments:verify-number");
            return true;
        }
        if (menuItem.getItemId() == 16908332) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public void onResume() {
        super.onResume();
        this.A01.A00.A0B("verifyNumberShown");
    }

    public IndiaUpiSimVerificationActivity() {
        this(0);
    }
}
