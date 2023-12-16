package com.whatsapp.payments.ui.international;

import X.AnonymousClass002;
import X.AnonymousClass08M;
import X.AnonymousClass0x7;
import X.AnonymousClass303;
import X.AnonymousClass31C;
import X.AnonymousClass34V;
import X.AnonymousClass36K;
import X.AnonymousClass3QD;
import X.AnonymousClass4TJ;
import X.AnonymousClass58H;
import X.AnonymousClass5V0;
import X.AnonymousClass66R;
import X.AnonymousClass6C7;
import X.AnonymousClass7SS;
import X.AnonymousClass8M6;
import X.AnonymousClass8WX;
import X.AnonymousClass8YU;
import X.AnonymousClass8YV;
import X.AnonymousClass910;
import X.AnonymousClass93F;
import X.AnonymousClass94W;
import X.AnonymousClass99H;
import X.AnonymousClass9D3;
import X.AnonymousClass9LV;
import X.AnonymousClass9W6;
import X.AnonymousClass9Wg;
import X.C005205m;
import X.C106715a2;
import X.C133686hm;
import X.C133796hx;
import X.C137006nc;
import X.C152367Yp;
import X.C154517dI;
import X.C158457k0;
import X.C160757oG;
import X.C162457s7;
import X.C162647sW;
import X.C166557yt;
import X.C18270x1;
import X.C18280x3;
import X.C18290x4;
import X.C18310x6;
import X.C18320x8;
import X.C1891190b;
import X.C1891290c;
import X.C19340zH;
import X.C196719bd;
import X.C35371wl;
import X.C35711xJ;
import X.C620733j;
import X.C621433s;
import X.C626936e;
import X.C66433Lk;
import X.C86604Kt;
import X.C86964Mo;
import android.app.DatePickerDialog;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ProgressBar;
import com.google.android.material.textfield.TextInputLayout;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.button.WDSButton;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public final class IndiaUpiInternationalActivationActivity extends AnonymousClass9D3 {
    public long A00;
    public DatePicker A01;
    public ProgressBar A02;
    public TextInputLayout A03;
    public TextInputLayout A04;
    public C133686hm A05;
    public C166557yt A06;
    public C66433Lk A07;
    public C106715a2 A08;
    public WDSButton A09;
    public final C160757oG A0A = C160757oG.A00("IndiaUpiInternationalActivationActivity", "payment-settings", "IN");
    public final AnonymousClass66R A0B = C154517dI.A00(AnonymousClass58H.NONE, new AnonymousClass8WX(this));

    public void A7i(HashMap hashMap) {
        C158457k0 r0;
        HashMap hashMap2 = hashMap;
        C162457s7.A0J(hashMap2, 0);
        DatePicker datePicker = this.A01;
        if (datePicker == null) {
            throw C18270x1.A0S("endDatePicker");
        }
        long A0C = A0C(datePicker);
        IndiaUpiInternationalActivationViewModel indiaUpiInternationalActivationViewModel = (IndiaUpiInternationalActivationViewModel) this.A0B.getValue();
        C133686hm r8 = this.A05;
        if (r8 == null) {
            throw C18270x1.A0S("paymentBankAccount");
        }
        C166557yt r3 = this.A06;
        if (r3 == null) {
            throw C18270x1.A0S("seqNumber");
        }
        String str = r8.A0A;
        C162457s7.A0D(str);
        AnonymousClass3QD A002 = AnonymousClass3QD.A00();
        Class cls = Long.TYPE;
        C152367Yp r5 = new C152367Yp(new C166557yt(A002, cls, Long.valueOf(this.A00), "cardExpiryDate"), new C166557yt(AnonymousClass3QD.A00(), cls, Long.valueOf(A0C), "cardExpiryDate"), str);
        String str2 = this.A0e;
        C133796hx r4 = r8.A08;
        C162457s7.A0K(r4, "null cannot be cast to non-null type com.whatsapp.payments.IndiaUpiMethodData");
        AnonymousClass99H r42 = (AnonymousClass99H) r4;
        String A062 = indiaUpiInternationalActivationViewModel.A02.A06("MPIN", hashMap2, 3);
        if (r42.A09 != null) {
            AnonymousClass08M r82 = indiaUpiInternationalActivationViewModel.A00;
            C158457k0 r02 = (C158457k0) r82.A07();
            if (r02 != null) {
                r0 = new C158457k0(r02.A00, r02.A01, true);
            } else {
                r0 = null;
            }
            r82.A0H(r0);
            AnonymousClass303 r7 = new AnonymousClass303(new AnonymousClass303[0]);
            r7.A03("payments_request_name", "activate_international_payments");
            AnonymousClass9Wg.A02(r7, indiaUpiInternationalActivationViewModel.A04, (Integer) null, "international_payment_prompt", str2, 3);
            C137006nc r9 = indiaUpiInternationalActivationViewModel.A03;
            C166557yt r11 = r42.A09;
            C162457s7.A0H(r11);
            String str3 = r42.A0F;
            if (str3 == null) {
                str3 = "";
            }
            C166557yt r83 = new C166557yt(AnonymousClass3QD.A00(), String.class, A062, "pin");
            C166557yt r72 = r42.A06;
            C162457s7.A0C(r72);
            AnonymousClass7SS r43 = new AnonymousClass7SS(r5, indiaUpiInternationalActivationViewModel);
            C18270x1.A14(r11, str3);
            Log.i("PAY: activateInternationalPayments called");
            AnonymousClass31C r10 = r9.A00;
            String A032 = r10.A03();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            C166557yt r03 = r5.A01;
            C626936e.A06(r03);
            Object obj = r03.A00;
            C626936e.A06(obj);
            C162457s7.A0D(obj);
            Long A0Y = C18320x8.A0Y(timeUnit, C18310x6.A0B(obj));
            C166557yt r04 = r5.A00;
            C626936e.A06(r04);
            Object obj2 = r04.A00;
            C626936e.A06(obj2);
            C162457s7.A0D(obj2);
            C35711xJ r52 = new C35711xJ(new C35371wl(C166557yt.A00(r11), str3, r5.A02, r9.A02.A01(), C166557yt.A00(r83), C166557yt.A00(r3), C166557yt.A00(r72)), new C35371wl(A032, 15), A0Y, C18320x8.A0Y(timeUnit, C18310x6.A0B(obj2)));
            AnonymousClass36K r32 = r52.A00;
            C162457s7.A0D(r32);
            r10.A0D(new AnonymousClass93F(r43, 6, r52), r32, A032, 204, 0);
        }
    }

    public void BVC(AnonymousClass34V r11, String str) {
        Object obj;
        String str2 = str;
        C162457s7.A0J(str, 0);
        if (str.length() > 0) {
            C133686hm r2 = this.A05;
            if (r2 == null) {
                throw C18270x1.A0S("paymentBankAccount");
            }
            String str3 = r2.A0B;
            C166557yt r0 = this.A06;
            if (r0 == null) {
                throw C18270x1.A0S("seqNumber");
            }
            String str4 = (String) r0.A00;
            C133796hx r4 = r2.A08;
            C162457s7.A0K(r4, "null cannot be cast to non-null type com.whatsapp.payments.IndiaUpiMethodData");
            AnonymousClass99H r42 = (AnonymousClass99H) r4;
            C133686hm r02 = this.A05;
            if (r02 == null) {
                throw C18270x1.A0S("paymentBankAccount");
            }
            C166557yt r03 = r02.A09;
            if (r03 == null) {
                obj = null;
            } else {
                obj = r03.A00;
            }
            A7g(r42, str2, str3, str4, (String) obj, 3);
        } else if (r11 != null && !C196719bd.A02(this, "upi-list-keys", r11.A00, false)) {
            if (this.A05.A06("upi-list-keys")) {
                this.A0M.A0D();
                BjL();
                Bp9(R.string.f11nameremoved);
                this.A09.A00();
                return;
            }
            A7b();
        }
    }

    public void A7Z() {
        C621433s.A01(this, 19);
    }

    public void A7c() {
        throw AnonymousClass002.A0G(this.A0A.A02("showMainPaneAfterPayAppRegistered unsupported"));
    }

    public void BbO(AnonymousClass34V r3) {
        throw AnonymousClass002.A0G(this.A0A.A02("onSetPin unsupported"));
    }

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        C133686hm r0 = (C133686hm) getIntent().getParcelableExtra("extra_bank_account");
        if (r0 != null) {
            this.A05 = r0;
        }
        this.A06 = new C166557yt(AnonymousClass3QD.A00(), String.class, A7F(this.A0M.A06()), "upiSequenceNumber");
        AnonymousClass6C7.A0y(this);
        setContentView((int) R.layout.f8nameremoved);
        View A002 = C005205m.A00(this, R.id.start_date);
        C162457s7.A0D(A002);
        this.A04 = (TextInputLayout) A002;
        this.A00 = System.currentTimeMillis();
        DateFormat dateInstance = DateFormat.getDateInstance(2, C620733j.A02(this.A01));
        TextInputLayout textInputLayout = this.A04;
        if (textInputLayout == null) {
            throw C18270x1.A0S("startDateInputLayout");
        }
        EditText editText = textInputLayout.A0b;
        if (editText != null) {
            editText.setEnabled(false);
        }
        TextInputLayout textInputLayout2 = this.A04;
        if (textInputLayout2 == null) {
            throw C18270x1.A0S("startDateInputLayout");
        }
        EditText editText2 = textInputLayout2.A0b;
        if (editText2 != null) {
            editText2.setText(dateInstance.format(Long.valueOf(this.A00)));
        }
        View A003 = C005205m.A00(this, R.id.end_date);
        C162457s7.A0D(A003);
        TextInputLayout textInputLayout3 = (TextInputLayout) A003;
        this.A03 = textInputLayout3;
        if (textInputLayout3 == null) {
            throw C18270x1.A0S("endDateInputLayout");
        }
        EditText editText3 = textInputLayout3.A0b;
        C626936e.A04(editText3);
        C162457s7.A0D(editText3);
        Calendar instance = Calendar.getInstance();
        DateFormat dateInstance2 = DateFormat.getDateInstance(2, C620733j.A02(this.A01));
        instance.add(5, 90);
        editText3.setText(dateInstance2.format(Long.valueOf(instance.getTimeInMillis())));
        AnonymousClass94W r8 = new AnonymousClass94W((DatePickerDialog.OnDateSetListener) new C162647sW(editText3, this, dateInstance2), (Context) this, instance.get(1), instance.get(2), instance.get(5));
        editText3.setOnClickListener(new AnonymousClass910(r8, 3, this));
        DatePicker A042 = r8.A04();
        C162457s7.A0D(A042);
        this.A01 = A042;
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) findViewById(R.id.activate_international_payment_description);
        C106715a2 r11 = this.A08;
        if (r11 != null) {
            Context context = textEmojiLabel.getContext();
            if (getIntent().getBooleanExtra("EXTRA_INTERNATIONAL_QR_ACTIVATION_FROM_SCAN", false)) {
                Object[] A0M = AnonymousClass002.A0M();
                AnonymousClass9W6 r2 = this.A0N;
                C133686hm r02 = this.A05;
                if (r02 == null) {
                    throw C18270x1.A0S("paymentBankAccount");
                }
                A0M[0] = r2.A03(r02);
                str = AnonymousClass002.A0F(this, "supported-countries-faq", A0M, 1, R.string.f11nameremoved);
            } else {
                str = AnonymousClass002.A0F(this, "supported-countries-faq", new Object[1], 0, R.string.f11nameremoved);
            }
            C162457s7.A0H(str);
            String[] strArr = {"supported-countries-faq"};
            String[] strArr2 = new String[1];
            C66433Lk r22 = this.A07;
            if (r22 != null) {
                AnonymousClass0x7.A1E(r22.A03("1293279751500598"), strArr2, 0);
                SpannableString A043 = r11.A04(context, str, new Runnable[]{new AnonymousClass8M6(this)}, strArr, strArr2);
                textEmojiLabel.setAccessibilityHelper(new AnonymousClass4TJ(textEmojiLabel, this.A08));
                textEmojiLabel.setLinkHandler(new C86964Mo(this.A0D));
                textEmojiLabel.setText(A043);
                this.A02 = (ProgressBar) C18290x4.A0N(this, R.id.turn_on_button_spinner);
                this.A09 = (WDSButton) C18290x4.A0N(this, R.id.continue_button);
                AnonymousClass9LV.A00(this, R.drawable.onboarding_actionbar_home_close);
                AnonymousClass66R r3 = this.A0B;
                C86604Kt.A1N(this, ((IndiaUpiInternationalActivationViewModel) r3.getValue()).A00, new AnonymousClass8YV(this), 306);
                C86604Kt.A1N(this, ((IndiaUpiInternationalActivationViewModel) r3.getValue()).A06, new AnonymousClass8YU(this), 307);
                WDSButton wDSButton = this.A09;
                if (wDSButton == null) {
                    throw C18270x1.A0S("buttonView");
                }
                C1891290c.A00(wDSButton, this, 23);
                return;
            }
            throw C18270x1.A0S("faqLinkFactory");
        }
        throw C18270x1.A0S("linkifier");
    }

    public static final long A0C(DatePicker datePicker) {
        return new GregorianCalendar(datePicker.getYear(), datePicker.getMonth(), datePicker.getDayOfMonth(), 0, 0, 0).getTimeInMillis();
    }

    public void A7b() {
        C19340zH A002 = AnonymousClass5V0.A00(this);
        A002.A0i(false);
        A002.A0h(getString(R.string.f11nameremoved));
        A002.A0g(getString(R.string.f11nameremoved));
        A002.A0W(new C1891190b(this, 50), R.string.f11nameremoved);
        C18280x3.A0q(A002);
    }

    public void A7d() {
        Bp9(R.string.f11nameremoved);
    }
}
