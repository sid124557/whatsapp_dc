package com.whatsapp.payments.ui;

import X.AnonymousClass0R8;
import X.AnonymousClass6C7;
import X.AnonymousClass99H;
import X.AnonymousClass9AH;
import X.AnonymousClass9AL;
import X.C133686hm;
import X.C133796hx;
import X.C139716sV;
import X.C160757oG;
import X.C162457s7;
import X.C166557yt;
import X.C166697z7;
import X.C166857zN;
import X.C18270x1;
import X.C18290x4;
import X.C1891290c;
import X.C191129Co;
import X.C34831vt;
import X.C35371wl;
import X.C626936e;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import com.whatsapp.R;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.HashMap;

public final class IndiaUpiAadhaarCardVerificationActivity extends C191129Co {
    public EditText A00;
    public EditText A01;
    public C133686hm A02;
    public C166557yt A03;
    public WDSButton A04;
    public String A05;
    public String A06;
    public final C160757oG A07 = C160757oG.A00("IndiaUpiAadhaarCardVerificationActivity", "onboarding", "IN");

    public void A7n(String str, HashMap hashMap) {
        HashMap hashMap2 = hashMap;
        C162457s7.A0J(hashMap2, 1);
        C133686hm r0 = this.A02;
        if (r0 == null) {
            throw C18270x1.A0S("bankAccount");
        }
        C133796hx r2 = r0.A08;
        C162457s7.A0K(r2, "null cannot be cast to non-null type com.whatsapp.payments.IndiaUpiMethodData");
        C626936e.A06(r2);
        AnonymousClass99H r22 = (AnonymousClass99H) r2;
        String str2 = this.A05;
        C626936e.A06(str2);
        String str3 = this.A06;
        C626936e.A06(str3);
        C35371wl r8 = new C35371wl(str2, str3);
        AnonymousClass9AL r4 = this.A09;
        C166557yt r5 = r22.A09;
        String str4 = r22.A0F;
        C166557yt r6 = r22.A06;
        C133686hm r02 = this.A02;
        if (r02 == null) {
            throw C18270x1.A0S("bankAccount");
        }
        r4.A01(r5, r6, (C35371wl) null, r8, str4, r02.A0A, str, "AADHAAR", hashMap2);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        C162457s7.A0J(menu, 0);
        A7P(menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void onRestoreInstanceState(Bundle bundle) {
        C162457s7.A0J(bundle, 0);
        super.onRestoreInstanceState(bundle);
        if (bundle.containsKey("aadhaarNumberInst")) {
            this.A03 = (C166557yt) bundle.getParcelable("aadhaarNumberInst");
        }
        if (bundle.containsKey("otpTransactionIdInst")) {
            this.A05 = bundle.getString("otpTransactionIdInst");
        }
        if (bundle.containsKey("otpTransactionTsInst")) {
            this.A06 = bundle.getString("otpTransactionTsInst");
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        C162457s7.A0J(bundle, 0);
        super.onSaveInstanceState(bundle);
        C166557yt r1 = this.A03;
        if (r1 != null) {
            bundle.putParcelable("aadhaarNumberInst", r1);
        }
        String str = this.A05;
        if (str != null) {
            bundle.putString("otpTransactionIdInst", str);
        }
        String str2 = this.A06;
        if (str2 != null) {
            bundle.putString("otpTransactionTsInst", str2);
        }
    }

    public void A7j() {
        AnonymousClass9AH r3 = this.A01;
        C133686hm r0 = this.A02;
        if (r0 == null) {
            throw C18270x1.A0S("bankAccount");
        }
        C133796hx r2 = r0.A08;
        C626936e.A06(r2);
        r3.A01(this.A03, (AnonymousClass99H) r2, this, "AADHAAR");
    }

    public void A7m(C139716sV r11, String str) {
        Object obj;
        C34831vt r1 = r11.A00;
        if (r1 != null) {
            this.A05 = r1.A00;
            this.A06 = r1.A01;
        }
        String A0B = this.A0M.A0B();
        C133686hm r0 = this.A02;
        if (r0 == null) {
            throw C18270x1.A0S("bankAccount");
        }
        String str2 = r0.A0B;
        C133796hx r3 = r0.A08;
        C162457s7.A0K(r3, "null cannot be cast to non-null type com.whatsapp.payments.IndiaUpiMethodData");
        AnonymousClass99H r32 = (AnonymousClass99H) r3;
        C133686hm r02 = this.A02;
        if (r02 == null) {
            throw C18270x1.A0S("bankAccount");
        }
        C166557yt r03 = r02.A09;
        if (r03 == null) {
            obj = null;
        } else {
            obj = r03.A00;
        }
        A7h(r32, A0B, str2, str, (String) obj, 1, true);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass6C7.A0y(this);
        setContentView((int) R.layout.f8nameremoved);
        A7K(R.drawable.ic_back, R.id.scroll_view);
        AnonymousClass0R8 supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0B(R.string.f11nameremoved);
            supportActionBar.A0N(true);
        }
        C133686hm r0 = (C133686hm) getIntent().getParcelableExtra("extra_bank_account");
        if (r0 != null) {
            this.A02 = r0;
        }
        WDSButton wDSButton = (WDSButton) C18290x4.A0N(this, R.id.verify_button);
        this.A04 = wDSButton;
        if (wDSButton == null) {
            throw C18270x1.A0S("confirmButton");
        }
        C1891290c.A00(wDSButton, this, 11);
        this.A00 = (EditText) C18290x4.A0N(this, R.id.aadhaar_number_part1);
        EditText editText = (EditText) C18290x4.A0N(this, R.id.aadhaar_number_part2);
        this.A01 = editText;
        EditText editText2 = this.A00;
        if (editText2 == null) {
            throw C18270x1.A0S("aadhaarNumber1");
        } else if (editText == null) {
            throw C18270x1.A0S("aadhaarNumber2");
        } else {
            editText2.addTextChangedListener(new C166697z7(editText, this, 4));
            EditText editText3 = this.A00;
            if (editText3 == null) {
                throw C18270x1.A0S("aadhaarNumber1");
            }
            EditText editText4 = this.A01;
            if (editText4 == null) {
                throw C18270x1.A0S("aadhaarNumber2");
            }
            editText3.setOnKeyListener(new C166857zN((EditText) null, editText4));
            EditText editText5 = this.A01;
            if (editText5 == null) {
                throw C18270x1.A0S("aadhaarNumber2");
            }
            editText5.addTextChangedListener(new C166697z7(editText5, this, 2));
            EditText editText6 = this.A01;
            if (editText6 == null) {
                throw C18270x1.A0S("aadhaarNumber2");
            }
            EditText editText7 = this.A00;
            if (editText7 == null) {
                throw C18270x1.A0S("aadhaarNumber1");
            }
            editText6.setOnKeyListener(new C166857zN(editText7, (EditText) null));
            EditText editText8 = this.A00;
            if (editText8 == null) {
                throw C18270x1.A0S("aadhaarNumber1");
            }
            editText8.requestFocus();
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (C18290x4.A04(menuItem) != R.id.menuitem_help) {
            return super.onOptionsItemSelected(menuItem);
        }
        A7N(R.string.f11nameremoved, "enter_aadhaar_number", "payments:enter-card");
        return true;
    }
}
