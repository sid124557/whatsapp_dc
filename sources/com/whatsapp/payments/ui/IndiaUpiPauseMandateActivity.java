package com.whatsapp.payments.ui;

import X.AnonymousClass0R8;
import X.AnonymousClass0XL;
import X.AnonymousClass34V;
import X.AnonymousClass38V;
import X.AnonymousClass8EA;
import X.AnonymousClass94W;
import X.AnonymousClass97T;
import X.AnonymousClass9D7;
import X.AnonymousClass9V1;
import X.AnonymousClass9WM;
import X.AnonymousClass9WN;
import X.AnonymousClass9X2;
import X.C005205m;
import X.C107695bk;
import X.C18280x3;
import X.C1899593h;
import X.C1899693i;
import X.C200619ic;
import X.C204019og;
import X.C204249p3;
import X.C205049qL;
import X.C624034w;
import X.C626936e;
import X.C64333Db;
import X.C86614Ku;
import X.C88834as;
import android.app.DatePickerDialog;
import android.content.Context;
import android.os.Bundle;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import com.whatsapp.R;
import com.whatsapp.payments.ui.viewmodel.IndiaUpiPauseMandateViewModel;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class IndiaUpiPauseMandateActivity extends AnonymousClass9D7 {
    public Button A00;
    public DatePicker A01;
    public DatePicker A02;
    public TextInputLayout A03;
    public TextInputLayout A04;
    public AnonymousClass9WM A05;
    public IndiaUpiPauseMandateViewModel A06;
    public String A07;
    public boolean A08;

    public final DatePicker A7q(EditText editText, long j) {
        DateFormat dateInstance = DateFormat.getDateInstance(2, this.A01.A0O());
        editText.setText(dateInstance.format(Long.valueOf(j)));
        Calendar instance = Calendar.getInstance();
        AnonymousClass94W r3 = new AnonymousClass94W((DatePickerDialog.OnDateSetListener) new AnonymousClass9X2(editText, this, dateInstance), (Context) this, instance.get(1), instance.get(2), instance.get(5));
        C204249p3.A02(editText, r3, 62);
        return r3.A01;
    }

    public void onBackPressed() {
        setResult(0);
        finish();
    }

    public void A5r() {
        if (!this.A08) {
            this.A08 = true;
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
            this.A04 = (AnonymousClass8EA) r2.ASG.get();
            this.A00 = C86614Ku.A0Q(r2);
            this.A0B = (AnonymousClass9WN) r1.A6I.get();
            this.A0C = (AnonymousClass9V1) r2.AHb.get();
            this.A01 = C86614Ku.A0V(r2);
            this.A07 = C1899693i.A0N(r1);
            this.A02 = C1899593h.A09(r2);
            this.A0A = C1899593h.A0O(r2);
            this.A06 = C1899693i.A0L(r2);
            this.A08 = C1899693i.A0O(r2);
            this.A0D = r2.ApM();
            this.A05 = r1.AN7();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0066, code lost:
        if (android.text.TextUtils.isEmpty(r10.A03.getError()) == false) goto L_0x0068;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A7r() {
        /*
            r10 = this;
            android.widget.DatePicker r0 = r10.A02
            long r2 = A0C(r0)
            com.google.android.material.textfield.TextInputLayout r5 = r10.A04
            com.whatsapp.payments.ui.viewmodel.IndiaUpiPauseMandateViewModel r4 = r10.A06
            long r0 = java.lang.System.currentTimeMillis()
            int r0 = X.C107175ap.A00(r2, r0)
            if (r0 >= 0) goto L_0x00ac
            X.2oU r0 = r4.A05
            r1 = 2131894857(0x7f122249, float:1.942453E38)
            android.content.res.Resources r0 = X.C54292oU.A00(r0)
            java.lang.String r0 = r0.getString(r1)
        L_0x0021:
            r5.setError(r0)
            android.widget.DatePicker r0 = r10.A01
            long r0 = A0C(r0)
            com.google.android.material.textfield.TextInputLayout r8 = r10.A03
            com.whatsapp.payments.ui.viewmodel.IndiaUpiPauseMandateViewModel r9 = r10.A06
            X.33j r4 = r9.A06
            java.util.Locale r5 = r4.A0O()
            r4 = 2
            java.text.DateFormat r7 = java.text.DateFormat.getDateInstance(r4, r5)
            int r2 = X.C107175ap.A00(r0, r2)
            if (r2 > 0) goto L_0x006d
            X.2oU r0 = r9.A05
            android.content.Context r1 = r0.A00
            r0 = 2131894855(0x7f122247, float:1.9424527E38)
            java.lang.String r0 = r1.getString(r0)
        L_0x004a:
            r8.setError(r0)
            android.widget.Button r2 = r10.A00
            com.google.android.material.textfield.TextInputLayout r0 = r10.A04
            java.lang.CharSequence r0 = r0.getError()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0068
            com.google.android.material.textfield.TextInputLayout r0 = r10.A03
            java.lang.CharSequence r0 = r0.getError()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r0 = 1
            if (r1 != 0) goto L_0x0069
        L_0x0068:
            r0 = 0
        L_0x0069:
            r2.setEnabled(r0)
            return
        L_0x006d:
            X.34w r2 = r9.A01
            X.99L r2 = X.C1899693i.A0K(r2)
            X.9W2 r2 = r2.A0G
            X.C626936e.A06(r2)
            long r4 = r2.A01
            java.lang.String r2 = "Asia/Kolkata"
            java.util.TimeZone r2 = java.util.TimeZone.getTimeZone(r2)
            int r2 = r2.getRawOffset()
            long r2 = (long) r2
            long r4 = r4 - r2
            int r0 = X.C107175ap.A00(r0, r4)
            if (r0 <= 0) goto L_0x00aa
            X.2oU r0 = r9.A05
            android.content.Context r6 = r0.A00
            r3 = 2131894854(0x7f122246, float:1.9424525E38)
            java.lang.Object[] r2 = X.AnonymousClass002.A0L()
            X.2sH r0 = r9.A04
            long r0 = r0.A0I(r4)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = r7.format(r0)
            java.lang.String r0 = X.C86614Ku.A0s(r6, r0, r2, r3)
            goto L_0x004a
        L_0x00aa:
            r0 = 0
            goto L_0x004a
        L_0x00ac:
            r0 = 0
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.IndiaUpiPauseMandateActivity.A7r():void");
    }

    public IndiaUpiPauseMandateActivity(int i) {
        this.A08 = false;
        C204019og.A00(this, 70);
    }

    public static final long A0C(DatePicker datePicker) {
        return new GregorianCalendar(datePicker.getYear(), datePicker.getMonth(), datePicker.getDayOfMonth()).getTime().getTime();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        AnonymousClass0R8 A0Y = AnonymousClass97T.A0Y(this);
        if (A0Y != null) {
            A0Y.A0N(true);
        }
        TextInputLayout textInputLayout = (TextInputLayout) C005205m.A00(this, R.id.start_date);
        this.A04 = textInputLayout;
        long currentTimeMillis = System.currentTimeMillis();
        EditText editText = textInputLayout.A0b;
        C626936e.A04(editText);
        this.A02 = A7q(editText, currentTimeMillis);
        TextInputLayout textInputLayout2 = (TextInputLayout) C005205m.A00(this, R.id.end_date);
        this.A03 = textInputLayout2;
        EditText editText2 = textInputLayout2.A0b;
        C626936e.A04(editText2);
        this.A01 = A7q(editText2, currentTimeMillis);
        Button button = (Button) C005205m.A00(this, R.id.continue_button);
        this.A00 = button;
        C204249p3.A02(button, this, 61);
        this.A07 = AnonymousClass97T.A0c(this);
        IndiaUpiPauseMandateViewModel indiaUpiPauseMandateViewModel = (IndiaUpiPauseMandateViewModel) new AnonymousClass0XL(this).A01(IndiaUpiPauseMandateViewModel.class);
        this.A06 = indiaUpiPauseMandateViewModel;
        indiaUpiPauseMandateViewModel.A02.A0B(this, C205049qL.A00(this, 33));
        IndiaUpiPauseMandateViewModel indiaUpiPauseMandateViewModel2 = this.A06;
        C624034w r2 = ((AnonymousClass38V) getIntent().getParcelableExtra("extra_transaction_detail_data")).A00;
        indiaUpiPauseMandateViewModel2.A01 = r2;
        indiaUpiPauseMandateViewModel2.A0B.BkM(new C200619ic(r2, indiaUpiPauseMandateViewModel2));
    }

    public void BbO(AnonymousClass34V r1) {
    }

    public IndiaUpiPauseMandateActivity() {
        this(0);
    }
}
