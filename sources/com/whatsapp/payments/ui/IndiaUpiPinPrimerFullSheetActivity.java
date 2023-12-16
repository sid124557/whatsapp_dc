package com.whatsapp.payments.ui;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0x2;
import X.AnonymousClass0x9;
import X.AnonymousClass1VX;
import X.AnonymousClass303;
import X.AnonymousClass97T;
import X.AnonymousClass99H;
import X.AnonymousClass9DA;
import X.C06560Yg;
import X.C107555bV;
import X.C107635bd;
import X.C107695bk;
import X.C111095hX;
import X.C133686hm;
import X.C158777kX;
import X.C18280x3;
import X.C18290x4;
import X.C18300x5;
import X.C18320x8;
import X.C1899593h;
import X.C1899693i;
import X.C204019og;
import X.C204209oz;
import X.C204249p3;
import X.C620633i;
import X.C64333Db;
import X.C69263Wi;
import X.C86604Kt;
import X.C88834as;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;
import java.util.Objects;

public class IndiaUpiPinPrimerFullSheetActivity extends AnonymousClass9DA {
    public int A00;
    public C133686hm A01;
    public C158777kX A02;
    public String A03;
    public String A04;
    public boolean A05;

    public final void A7V() {
        String str;
        int i;
        if (this.A0N.A05(this.A01)) {
            C06560Yg.A02(this.A00, R.id.account_divider_top).setVisibility(8);
            C86604Kt.A1E(this.A00, R.id.account_divider_bottom, 8);
            C86604Kt.A1E(this.A00, R.id.account_layout, 8);
            View A042 = AnonymousClass0x2.A0M(this.A00, R.id.verification_options).A04();
            PaymentMethodRow paymentMethodRow = (PaymentMethodRow) C06560Yg.A02(A042, R.id.debit_card_option);
            PaymentMethodRow paymentMethodRow2 = (PaymentMethodRow) C06560Yg.A02(A042, R.id.aadhaar_card_option);
            paymentMethodRow.A06("Debit card");
            paymentMethodRow.A04(R.drawable.av_card);
            ImageView imageView = paymentMethodRow.A01;
            C107555bV.A03(imageView, 0, ((LinearLayout.LayoutParams) imageView.getLayoutParams()).rightMargin);
            paymentMethodRow.A00();
            paymentMethodRow.A08(false);
            paymentMethodRow.setOnClickListener(new C204209oz(paymentMethodRow2, this, paymentMethodRow, 5));
            paymentMethodRow2.A06("Aadhaar number");
            paymentMethodRow2.A04(R.drawable.ic_aadhaar_card_icon);
            ImageView imageView2 = paymentMethodRow2.A01;
            C107555bV.A03(imageView2, 0, ((LinearLayout.LayoutParams) imageView2.getLayoutParams()).rightMargin);
            paymentMethodRow2.A00();
            paymentMethodRow2.setRadioButtonChecked(true);
            this.A00 = 1;
            paymentMethodRow2.A08(false);
            paymentMethodRow2.setOnClickListener(new C204209oz(paymentMethodRow, this, paymentMethodRow2, 6));
            A042.setVisibility(0);
        } else {
            AnonymousClass99H r4 = (AnonymousClass99H) this.A01.A08;
            View findViewById = findViewById(R.id.account_layout);
            C06560Yg.A02(findViewById, R.id.progress).setVisibility(8);
            C86604Kt.A1E(findViewById, R.id.divider, 8);
            C86604Kt.A1E(findViewById, R.id.radio_button, 8);
            AnonymousClass97T.A0f(findViewById, this.A01);
            C18300x5.A0G(findViewById, R.id.account_number).setText(this.A02.A02(this.A01, false));
            C18300x5.A0G(findViewById, R.id.account_name).setText((CharSequence) C1899593h.A0X(r4.A03));
            C18300x5.A0G(findViewById, R.id.account_type).setText(r4.A0E());
        }
        if (Objects.equals(this.A04, "CREDIT")) {
            str = "https://faq.whatsapp.com/797709544841009";
        } else {
            str = "https://faq.whatsapp.com/general/payments/about-payments-data";
        }
        Uri parse = Uri.parse(str);
        AnonymousClass1VX r12 = this.A0D;
        C69263Wi r9 = this.A05;
        C111095hX r8 = this.A00;
        C620633i r11 = this.A08;
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) findViewById(R.id.note);
        if (Objects.equals(this.A04, "CREDIT")) {
            i = R.string.f11nameremoved;
        } else {
            boolean A052 = this.A0N.A05(this.A01);
            i = R.string.f11nameremoved;
            if (A052) {
                i = R.string.f11nameremoved;
            }
        }
        C107635bd.A0E(this, parse, r8, r9, textEmojiLabel, r11, r12, AnonymousClass002.A0F(this, "learn-more", AnonymousClass002.A0L(), 0, i), "learn-more");
        C204249p3.A02(findViewById(R.id.continue_button), this, 84);
    }

    public static Intent A0C(Context context, C133686hm r2, String str, boolean z) {
        String str2;
        Intent A06 = C1899593h.A06(context, r2, IndiaUpiPinPrimerFullSheetActivity.class);
        A06.putExtra("extra_payment_method_type", str);
        if (z) {
            str2 = "forgot_pin";
        } else {
            str2 = "setup_pin";
        }
        A06.putExtra("event_screen", str2);
        return A06;
    }

    public void A5r() {
        if (!this.A05) {
            this.A05 = true;
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
            this.A02 = C1899593h.A0O(r2);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Class cls;
        if (i != 1012) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            if (intent != null && intent.hasExtra("extra_bank_account")) {
                C133686hm r0 = (C133686hm) intent.getParcelableExtra("extra_bank_account");
                this.A01 = r0;
                this.A0A = r0;
            }
            switch (this.A02) {
                case 0:
                    Intent A07 = C18320x8.A07();
                    A07.putExtra("extra_bank_account", this.A01);
                    setResult(-1, A07);
                    finish();
                    return;
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 11:
                    if (this.A0l) {
                        A7H();
                        cls = IndiaUpiPaymentsAccountSetupActivity.class;
                    } else {
                        cls = IndiaUpiBankAccountAddedLandingActivity.class;
                    }
                    Intent A08 = AnonymousClass0x9.A08(this, cls);
                    A08.putExtra("referral_screen", this.A03);
                    A7O(A08);
                    C1899593h.A0k(A08, this, "extra_previous_screen", "enter_debit_card");
                    return;
                default:
                    return;
            }
        }
    }

    public IndiaUpiPinPrimerFullSheetActivity(int i) {
        this.A05 = false;
        C204019og.A00(this, 83);
    }

    public void onBackPressed() {
        super.onBackPressed();
        this.A0S.A09((AnonymousClass303) null, AnonymousClass001.A0f(), C18290x4.A0a(), this.A0b, this.A03, this.A0e);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0068  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r8) {
        /*
            r7 = this;
            android.view.Window r1 = r7.getWindow()
            r0 = 8192(0x2000, float:1.14794E-41)
            r1.addFlags(r0)
            super.onCreate(r8)
            r0 = 2131625184(0x7f0e04e0, float:1.8877569E38)
            r7.setContentView((int) r0)
            android.content.Intent r1 = r7.getIntent()
            java.lang.String r0 = "event_screen"
            java.lang.String r2 = r1.getStringExtra(r0)
            android.content.Intent r1 = r7.getIntent()
            java.lang.String r0 = "extra_bank_account"
            android.os.Parcelable r0 = r1.getParcelableExtra(r0)
            X.6hm r0 = (X.C133686hm) r0
            r7.A01 = r0
            android.content.Intent r1 = r7.getIntent()
            java.lang.String r0 = "extra_payment_method_type"
            java.lang.String r0 = r1.getStringExtra(r0)
            r7.A04 = r0
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x003e
            r7.A03 = r2
        L_0x003e:
            r0 = 2131434290(0x7f0b1b32, float:1.849039E38)
            android.widget.TextView r4 = X.C18310x6.A0L(r7, r0)
            r0 = 2131429396(0x7f0b0814, float:1.8480464E38)
            android.widget.TextView r3 = X.C18310x6.A0L(r7, r0)
            java.lang.String r1 = "CREDIT"
            java.lang.String r0 = r7.A04
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x009b
            r0 = 2131894698(0x7f1221aa, float:1.9424208E38)
            r4.setText(r0)
            r1 = 2131894697(0x7f1221a9, float:1.9424206E38)
        L_0x005f:
            r3.setText(r1)
        L_0x0062:
            X.0R8 r1 = X.AnonymousClass97T.A0Y(r7)
            if (r1 == 0) goto L_0x006e
            r0 = 2131891871(0x7f12169f, float:1.9418474E38)
            X.C1899593h.A0n(r1, r0)
        L_0x006e:
            X.6hm r0 = r7.A01
            if (r0 == 0) goto L_0x008b
            X.6hx r0 = r0.A08
            if (r0 == 0) goto L_0x008b
            r7.A7V()
        L_0x0079:
            X.9ca r0 = r7.A0S
            java.lang.Integer r2 = X.C18290x4.A0Z()
            r1 = 0
            java.lang.String r4 = r7.A0b
            java.lang.String r5 = r7.A03
            java.lang.String r6 = r7.A0e
            r3 = r1
            r0.A09(r1, r2, r3, r4, r5, r6)
            return
        L_0x008b:
            java.lang.String r0 = "Screen called without account, fetching account from local db to setup pin"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.4FS r1 = r7.A04
            X.9gY r0 = new X.9gY
            r0.<init>(r7)
            r1.BkM(r0)
            goto L_0x0079
        L_0x009b:
            X.9W6 r1 = r7.A0N
            X.6hm r0 = r7.A01
            boolean r2 = r1.A05(r0)
            java.lang.String r1 = "forgot_pin"
            java.lang.String r0 = r7.A03
            boolean r0 = r0.equals(r1)
            if (r2 == 0) goto L_0x00bc
            r1 = 2131894667(0x7f12218b, float:1.9424145E38)
            if (r0 == 0) goto L_0x005f
            r0 = 2131891944(0x7f1216e8, float:1.9418622E38)
            r4.setText(r0)
            r1 = 2131894666(0x7f12218a, float:1.9424143E38)
            goto L_0x005f
        L_0x00bc:
            if (r0 == 0) goto L_0x0062
            r0 = 2131891944(0x7f1216e8, float:1.9418622E38)
            r4.setText(r0)
            r1 = 2131891943(0x7f1216e7, float:1.941862E38)
            goto L_0x005f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.IndiaUpiPinPrimerFullSheetActivity.onCreate(android.os.Bundle):void");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        A7P(menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.menuitem_help) {
            A7N(R.string.f11nameremoved, this.A03, "payments:setup-pin");
            return true;
        }
        if (menuItem.getItemId() == 16908332) {
            this.A0S.A09((AnonymousClass303) null, 1, C18290x4.A0a(), this.A0b, this.A03, this.A0e);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public IndiaUpiPinPrimerFullSheetActivity() {
        this(0);
        this.A03 = "setup_pin";
        this.A00 = 0;
    }
}
