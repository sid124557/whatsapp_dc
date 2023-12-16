package com.whatsapp.payments.phoenix.flowconfigurationservice.activities;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass01G;
import X.AnonymousClass0XL;
import X.AnonymousClass0x2;
import X.AnonymousClass10q;
import X.AnonymousClass1Ha;
import X.AnonymousClass2CT;
import X.AnonymousClass2CV;
import X.AnonymousClass3Z6;
import X.AnonymousClass4G9;
import X.AnonymousClass4K2;
import X.AnonymousClass9CR;
import X.C159127lA;
import X.C15940sD;
import X.C161447pg;
import X.C17190ui;
import X.C18260x0;
import X.C18270x1;
import X.C18290x4;
import X.C383026z;
import X.C44512Wi;
import X.C44522Wj;
import X.C624034w;
import X.C627836s;
import X.C63653Ac;
import X.C73813g7;
import X.C85814Hs;
import android.os.Bundle;
import com.airbnb.lottie.LottieAnimationView;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.Map;

public final class IndiaUpiFcsTransactionConfirmationActivity extends AnonymousClass9CR {
    public int A00;
    public LottieAnimationView A01;
    public AnonymousClass2CT A02;
    public AnonymousClass2CV A03;
    public WaImageView A04;
    public WaTextView A05;
    public WaTextView A06;
    public WaTextView A07;
    public WaTextView A08;
    public C44512Wi A09;
    public AnonymousClass10q A0A;
    public C44522Wj A0B;
    public WDSButton A0C;
    public String A0D;
    public String A0E;
    public boolean A0F;
    public final C627836s A0G = new C627836s(this);

    public void onDestroy() {
        C159127lA r1;
        AnonymousClass4G9 r0;
        AnonymousClass10q r02 = this.A0A;
        if (r02 == null) {
            throw C18270x1.A0S("activityViewModel");
        }
        C624034w r5 = (C624034w) r02.A01.A00().A07();
        AnonymousClass3Z6[] r3 = new AnonymousClass3Z6[1];
        int i = this.A00;
        String str = "PENDING";
        if (!(i == 0 || i == 1)) {
            str = i != 2 ? "FAILURE" : "SUCCESS";
        }
        AnonymousClass3Z6.A04("transaction_status", str, r3);
        Map A0G2 = C73813g7.A0G(r3);
        if (r5 != null) {
            String str2 = r5.A0F;
            if (str2 != null) {
                A0G2.put("transaction_id", str2);
            }
            String str3 = r5.A0J;
            if (str3 != null) {
                A0G2.put("error", str3);
            }
        }
        Map A0D2 = C73813g7.A0D(A0G2);
        C44522Wj r12 = this.A0B;
        if (r12 != null) {
            String str4 = this.A0D;
            if (str4 == null) {
                throw C18270x1.A0S("fdsManagerId");
            }
            C161447pg A002 = r12.A00(str4);
            if (!(A002 == null || (r1 = A002.A00) == null || (r0 = (AnonymousClass4G9) r1.A00("native_upi_transaction_confirmation")) == null)) {
                r0.B3J(A0D2);
            }
            super.onDestroy();
            return;
        }
        throw C18270x1.A0S("phoenixManagerRegistry");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        if (this.A02 != null) {
            C44512Wi r0 = new C44512Wi(this);
            this.A09 = r0;
            Class<IndiaUpiFcsTransactionConfirmationActivity> cls = IndiaUpiFcsTransactionConfirmationActivity.class;
            if (!r0.A00(bundle)) {
                StringBuilder A0o = AnonymousClass001.A0o();
                C18260x0.A0N(cls, A0o);
                C18260x0.A1K(A0o, ": Activity cannot be launch because it is no longer safe to create this activity");
                return;
            }
            String A1r = AnonymousClass1Ha.A1r(this);
            if (A1r != null) {
                this.A0D = A1r;
                String stringExtra = getIntent().getStringExtra("extra_merchant_name");
                if (stringExtra != null) {
                    this.A0E = stringExtra;
                    String stringExtra2 = getIntent().getStringExtra("extra_formatted_amount");
                    if (stringExtra2 != null) {
                        AnonymousClass2CV r2 = this.A03;
                        if (r2 != null) {
                            String str = this.A0D;
                            if (str == null) {
                                throw C18270x1.A0S("fdsManagerId");
                            }
                            AnonymousClass10q r02 = (AnonymousClass10q) new AnonymousClass0XL((C17190ui) new C63653Ac(r2, str), (C15940sD) this).A01(AnonymousClass10q.class);
                            this.A0A = r02;
                            if (r02 == null) {
                                throw C18270x1.A0S("activityViewModel");
                            }
                            AnonymousClass4K2.A00(this, r02.A01.A01(), new C383026z(this, 35), 160);
                            this.A04 = (WaImageView) C18290x4.A0N(this, R.id.close);
                            this.A0C = (WDSButton) C18290x4.A0N(this, R.id.done_button);
                            this.A05 = (WaTextView) C18290x4.A0N(this, R.id.amount);
                            this.A07 = (WaTextView) C18290x4.A0N(this, R.id.primary_status);
                            this.A08 = (WaTextView) C18290x4.A0N(this, R.id.secondary_status);
                            this.A06 = (WaTextView) C18290x4.A0N(this, R.id.date);
                            LottieAnimationView lottieAnimationView = (LottieAnimationView) C18290x4.A0N(this, R.id.lottie_animation);
                            this.A01 = lottieAnimationView;
                            if (lottieAnimationView == null) {
                                throw C18270x1.A0S("lottieAnimationView");
                            }
                            lottieAnimationView.setAnimation("transaction_confirmation_lottie_animation.json");
                            C627836s r22 = this.A0G;
                            AnonymousClass01G r1 = lottieAnimationView.A0F;
                            r1.A0K.addListener(r22);
                            r1.A0A(0, 89);
                            lottieAnimationView.A01();
                            WaTextView waTextView = this.A05;
                            if (waTextView == null) {
                                throw C18270x1.A0S("amountTextView");
                            }
                            waTextView.setText(stringExtra2);
                            WaTextView waTextView2 = this.A07;
                            if (waTextView2 == null) {
                                throw C18270x1.A0S("primaryStatus");
                            }
                            Object[] A0L = AnonymousClass002.A0L();
                            String str2 = this.A0E;
                            if (str2 == null) {
                                throw C18270x1.A0S("merchantName");
                            }
                            A0L[0] = str2;
                            AnonymousClass001.A0y(this, waTextView2, A0L, R.string.f11nameremoved);
                            WaImageView waImageView = this.A04;
                            if (waImageView == null) {
                                throw C18270x1.A0S("closeButton");
                            }
                            C85814Hs.A00(waImageView, this, 2);
                            WDSButton wDSButton = this.A0C;
                            if (wDSButton == null) {
                                throw C18270x1.A0S("doneButton");
                            }
                            C85814Hs.A00(wDSButton, this, 3);
                            return;
                        }
                        throw C18270x1.A0S("phoenixUpiTransactionConfirmationViewModelFactory");
                    }
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    C18260x0.A0N(cls, A0o2);
                    throw AnonymousClass0x2.A0V(": Formatted amount is null", A0o2);
                }
                StringBuilder A0o3 = AnonymousClass001.A0o();
                C18260x0.A0N(cls, A0o3);
                throw AnonymousClass0x2.A0V(": Merchant Name is null", A0o3);
            }
            StringBuilder A0o4 = AnonymousClass001.A0o();
            C18260x0.A0N(cls, A0o4);
            throw AnonymousClass0x2.A0V(": FDS Manager ID is null", A0o4);
        }
        throw C18270x1.A0S("fcsActivityLifecycleManagerFactory");
    }
}
