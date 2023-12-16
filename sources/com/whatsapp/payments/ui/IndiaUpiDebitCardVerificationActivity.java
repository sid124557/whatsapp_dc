package com.whatsapp.payments.ui;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0R8;
import X.AnonymousClass303;
import X.AnonymousClass6C7;
import X.AnonymousClass97T;
import X.C106905aM;
import X.C107695bk;
import X.C133686hm;
import X.C134246ig;
import X.C160757oG;
import X.C166857zN;
import X.C18280x3;
import X.C18290x4;
import X.C18310x6;
import X.C1899593h;
import X.C1899693i;
import X.C191129Co;
import X.C195389Xp;
import X.C204019og;
import X.C204029oh;
import X.C204249p3;
import X.C64333Db;
import X.C86604Kt;
import X.C86654Ky;
import X.C88834as;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.AlphaAnimation;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.Calendar;

public class IndiaUpiDebitCardVerificationActivity extends C191129Co {
    public int A00;
    public int A01;
    public TextView A02;
    public WaEditText A03;
    public WaEditText A04;
    public WaEditText A05;
    public WaEditText A06;
    public C133686hm A07;
    public WDSButton A08;
    public Integer A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public boolean A0D;
    public final C160757oG A0E;

    public final void A7p() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(250);
        this.A02.startAnimation(alphaAnimation);
        this.A02.setVisibility(0);
    }

    public void A5r() {
        if (!this.A0D) {
            this.A0D = true;
            C88834as A0I = C18280x3.A0I(this);
            C64333Db r2 = A0I.A4Z;
            C1899593h.A15(r2, this);
            C107695bk r1 = r2.A00;
            C1899593h.A0z(r2, r1, this, C1899593h.A0W(r2, r1, this));
            AnonymousClass97T.A0h(A0I, r2, r1, this);
            AnonymousClass97T.A0i(A0I, r2, r1, this, C1899693i.A0Y(r2));
            AnonymousClass97T.A0m(r2, r1, this);
            AnonymousClass97T.A0o(r2, r1, this);
            AnonymousClass97T.A0k(A0I, r2, r1, this);
        }
    }

    public final int A7o() {
        if (TextUtils.isEmpty(C86604Kt.A0o(this.A03)) || C86604Kt.A0o(this.A03).length() != 2 || TextUtils.isEmpty(C86604Kt.A0o(this.A04)) || C86604Kt.A0o(this.A04).length() != 4) {
            return 1;
        }
        return 0;
    }

    public final void A7q() {
        if (A7r(this.A00, this.A01, true)) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append(C86604Kt.A0o(this.A03));
            this.A0C = AnonymousClass000.A0X(C86604Kt.A0o(this.A04), A0o);
            this.A0A = C86604Kt.A0o(this.A05);
            this.A0B = C86604Kt.A0o(this.A06);
            A7k(this.A07);
        }
        C134246ig A052 = this.A0S.A05(1, C18290x4.A0c(), "enter_debit_card", this.A0e);
        A052.A0Y = this.A0b;
        A052.A0E = this.A09;
        this.A0C.BhD(A052);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0112, code lost:
        if (r5 >= r10) goto L_0x011f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0118, code lost:
        if (r7 > 12) goto L_0x011a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004a A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0128  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A7r(int r9, int r10, boolean r11) {
        /*
            r8 = this;
            com.whatsapp.WaEditText r2 = r8.A05
            com.whatsapp.WaEditText r1 = r8.A06
            r6 = -1
            java.lang.String r0 = X.C86604Kt.A0o(r1)     // Catch:{ NumberFormatException -> 0x002c }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ NumberFormatException -> 0x002c }
            if (r0 != 0) goto L_0x0018
            java.lang.String r0 = X.C86604Kt.A0o(r1)     // Catch:{ NumberFormatException -> 0x002c }
            int r5 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x002c }
            goto L_0x0019
        L_0x0018:
            r5 = -1
        L_0x0019:
            java.lang.String r0 = X.C86604Kt.A0o(r2)     // Catch:{ NumberFormatException -> 0x002f }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ NumberFormatException -> 0x002f }
            if (r0 != 0) goto L_0x0037
            java.lang.String r0 = X.C86604Kt.A0o(r2)     // Catch:{ NumberFormatException -> 0x002f }
            int r7 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x002f }
            goto L_0x0038
        L_0x002c:
            r2 = move-exception
            r5 = -1
            goto L_0x0030
        L_0x002f:
            r2 = move-exception
        L_0x0030:
            X.7oG r1 = r8.A0E
            java.lang.String r0 = "IndiaUpiDebitCardVerifActivity checkMonthYear threw: "
            r1.A0A(r0, r2)
        L_0x0037:
            r7 = -1
        L_0x0038:
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            r4 = 1
            int r0 = r0.get(r4)
            int r0 = r0 + 50
            int r3 = r0 % 100
            r1 = 12
            r2 = 0
            if (r5 == r6) goto L_0x010b
            if (r7 == r6) goto L_0x010b
            r0 = 3
            if (r5 < r10) goto L_0x0135
            if (r5 != r10) goto L_0x0115
            if (r7 < r9) goto L_0x0056
            if (r7 > r1) goto L_0x0056
            r0 = 0
        L_0x0056:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
        L_0x005e:
            android.util.Pair r3 = X.AnonymousClass0x9.A0C(r1, r0)
        L_0x0062:
            int r0 = r8.A7o()
            r2 = 3
            r4 = 0
            if (r0 == 0) goto L_0x007c
            android.widget.TextView r1 = r8.A02
            r0 = 2131888455(0x7f120947, float:1.9411546E38)
            r1.setText(r0)
            r8.A7p()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
        L_0x0079:
            r8.A09 = r0
            return r4
        L_0x007c:
            int r1 = X.C18280x3.A03(r3)
            if (r1 == r2) goto L_0x00fe
            java.lang.Object r0 = r3.second
            int r3 = X.AnonymousClass001.A0K(r0)
            if (r3 == r2) goto L_0x00fe
            r0 = 2
            if (r1 != r0) goto L_0x00a0
            if (r3 != r0) goto L_0x00a0
            android.widget.TextView r1 = r8.A02
            r0 = 2131888450(0x7f120942, float:1.9411536E38)
            r1.setText(r0)
            r8.A7p()
            r0 = 5
        L_0x009b:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0079
        L_0x00a0:
            r2 = 0
            if (r1 == 0) goto L_0x00da
            android.widget.TextView r1 = r8.A02
            if (r3 == 0) goto L_0x00c3
            r0 = 2131888452(0x7f120944, float:1.941154E38)
            r1.setText(r0)
            r8.A7p()
            if (r11 == 0) goto L_0x00c1
            com.whatsapp.WaEditText r0 = r8.A05
            r0.setText(r2)
            com.whatsapp.WaEditText r0 = r8.A06
            r0.setText(r2)
            com.whatsapp.WaEditText r0 = r8.A05
            r0.requestFocus()
        L_0x00c1:
            r0 = 6
            goto L_0x009b
        L_0x00c3:
            r0 = 2131888453(0x7f120945, float:1.9411542E38)
            r1.setText(r0)
            r8.A7p()
            if (r11 == 0) goto L_0x00d8
            com.whatsapp.WaEditText r0 = r8.A05
            r0.setText(r2)
            com.whatsapp.WaEditText r0 = r8.A05
            r0.requestFocus()
        L_0x00d8:
            r0 = 7
            goto L_0x009b
        L_0x00da:
            if (r3 != 0) goto L_0x00e4
            r1 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r8.A09 = r0
            return r1
        L_0x00e4:
            android.widget.TextView r1 = r8.A02
            r0 = 2131888454(0x7f120946, float:1.9411544E38)
            r1.setText(r0)
            r8.A7p()
            if (r11 == 0) goto L_0x00fb
            com.whatsapp.WaEditText r0 = r8.A06
            r0.setText(r2)
            com.whatsapp.WaEditText r0 = r8.A06
            r0.requestFocus()
        L_0x00fb:
            r0 = 8
            goto L_0x009b
        L_0x00fe:
            android.widget.TextView r1 = r8.A02
            r0 = 2131888451(0x7f120943, float:1.9411538E38)
            r1.setText(r0)
            r8.A7p()
            r0 = 4
            goto L_0x009b
        L_0x010b:
            r0 = 2
            if (r5 == r6) goto L_0x0128
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            if (r5 < r10) goto L_0x0122
            goto L_0x011f
        L_0x0115:
            if (r7 < r4) goto L_0x011a
            r0 = 0
            if (r7 <= r1) goto L_0x011b
        L_0x011a:
            r0 = 1
        L_0x011b:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L_0x011f:
            if (r5 > r3) goto L_0x0122
            r4 = 0
        L_0x0122:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            goto L_0x005e
        L_0x0128:
            if (r7 != r6) goto L_0x0135
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            android.util.Pair r3 = new android.util.Pair
            r3.<init>(r0, r0)
            goto L_0x0062
        L_0x0135:
            if (r7 < r4) goto L_0x013a
            if (r7 > r1) goto L_0x013a
            r4 = 0
        L_0x013a:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x005e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.IndiaUpiDebitCardVerificationActivity.A7r(int, int, boolean):boolean");
    }

    public IndiaUpiDebitCardVerificationActivity(int i) {
        this.A0D = false;
        C204019og.A00(this, 60);
    }

    public void onBackPressed() {
        super.onBackPressed();
        this.A0S.A09((AnonymousClass303) null, AnonymousClass001.A0f(), C18290x4.A0a(), this.A0b, "enter_debit_card", this.A0e);
    }

    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        AnonymousClass6C7.A0y(this);
        setContentView((int) R.layout.f8nameremoved);
        AnonymousClass0R8 A0Y = AnonymousClass97T.A0Y(this);
        if (A0Y != null) {
            A0Y.A0B(R.string.f11nameremoved);
            A0Y.A0N(true);
        }
        C133686hm r0 = (C133686hm) getIntent().getParcelableExtra("extra_bank_account");
        if (r0 == null) {
            this.A0E.A05("Bank account info is null, finishing");
            finish();
            return;
        }
        this.A07 = r0;
        TextView A0L = C18310x6.A0L(this, R.id.add_card_number_label);
        TextView A0L2 = C18310x6.A0L(this, R.id.verify_debit_card_title);
        TextView A0L3 = C18310x6.A0L(this, R.id.card_type_label);
        TextView A0L4 = C18310x6.A0L(this, R.id.add_card_security_text);
        String A042 = this.A0N.A04(this.A07);
        if ("CREDIT".equals(this.A0a)) {
            A0L2.setText(R.string.f11nameremoved);
            AnonymousClass001.A0y(this, A0L, new Object[]{A042}, R.string.f11nameremoved);
            A0L3.setText(R.string.f11nameremoved);
            i = R.string.f11nameremoved;
        } else {
            A0L2.setText(R.string.f11nameremoved);
            AnonymousClass001.A0y(this, A0L, new Object[]{A042}, R.string.f11nameremoved);
            A0L3.setText(R.string.f11nameremoved);
            i = R.string.f11nameremoved;
        }
        A0L4.setText(i);
        ImageView A0M = C86654Ky.A0M(this, R.id.issuer_bank_logo);
        Bitmap A092 = this.A07.A09();
        if (A092 != null) {
            A0M.setImageBitmap(A092);
        } else {
            A0M.setImageResource(R.drawable.bank_logo_placeholder);
        }
        WDSButton wDSButton = (WDSButton) findViewById(R.id.confirm_button);
        this.A08 = wDSButton;
        wDSButton.setEnabled(false);
        C204249p3.A02(this.A08, this, 44);
        this.A03 = (WaEditText) findViewById(R.id.add_card_number1);
        this.A04 = (WaEditText) findViewById(R.id.add_card_number2);
        this.A05 = (WaEditText) findViewById(R.id.add_card_month);
        this.A06 = (WaEditText) findViewById(R.id.add_card_year);
        C106905aM.A04(this.A03);
        C106905aM.A04(this.A04);
        C106905aM.A04(this.A05);
        C106905aM.A04(this.A06);
        this.A02 = C18310x6.A0L(this, R.id.payments_send_payment_error_text);
        Calendar instance = Calendar.getInstance();
        this.A00 = instance.get(2) + 1;
        this.A01 = instance.get(1) % 100;
        this.A03.addTextChangedListener(new C195389Xp(this.A04, this, 2));
        this.A03.setOnKeyListener(new C166857zN((EditText) null, this.A04));
        this.A04.addTextChangedListener(new C195389Xp(this.A05, this, 4));
        this.A04.setOnKeyListener(new C166857zN(this.A03, this.A05));
        this.A05.addTextChangedListener(new C195389Xp(this.A06, this, 2));
        this.A05.setOnKeyListener(new C166857zN(this.A04, this.A06));
        this.A06.addTextChangedListener(new C195389Xp((EditText) null, this, 2));
        this.A06.setOnKeyListener(new C166857zN(this.A05, (EditText) null));
        this.A06.setOnEditorActionListener(new C204029oh(this, 0));
        this.A03.requestFocus();
        this.A0S.A09((AnonymousClass303) null, 0, (Integer) null, this.A0b, "enter_debit_card", this.A0e);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        A7P(menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.menuitem_help) {
            A7N(R.string.f11nameremoved, "enter_debit_card", "payments:enter-card");
            return true;
        }
        if (menuItem.getItemId() == 16908332) {
            this.A0S.A09((AnonymousClass303) null, 1, C18290x4.A0a(), this.A0b, "enter_debit_card", this.A0e);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public void onPause() {
        super.onPause();
        this.A0B.A02(findViewById(R.id.add_card_year));
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        if (bundle.containsKey("debitLast6SavedInst")) {
            this.A0C = bundle.getString("debitLast6SavedInst");
        }
        if (bundle.containsKey("debitExpiryMonthSavedInst")) {
            this.A0A = bundle.getString("debitExpiryMonthSavedInst");
        }
        if (bundle.containsKey("debitExpiryYearSavedInst")) {
            this.A0B = bundle.getString("debitExpiryYearSavedInst");
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        String str = this.A0C;
        if (str != null) {
            bundle.putString("debitLast6SavedInst", str);
        }
        String str2 = this.A0A;
        if (str2 != null) {
            bundle.putString("debitExpiryMonthSavedInst", str2);
        }
        String str3 = this.A0B;
        if (str3 != null) {
            bundle.putString("debitExpiryYearSavedInst", str3);
        }
    }

    public IndiaUpiDebitCardVerificationActivity() {
        this(0);
        this.A0E = C160757oG.A00("IndiaUpiDebitCardVerificationActivity", "onboarding", "IN");
    }
}
