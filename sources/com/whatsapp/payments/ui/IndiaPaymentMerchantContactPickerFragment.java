package com.whatsapp.payments.ui;

import X.AnonymousClass303;
import X.AnonymousClass31C;
import X.AnonymousClass36F;
import X.AnonymousClass3ZH;
import X.AnonymousClass54P;
import X.AnonymousClass5ZU;
import X.AnonymousClass98w;
import X.AnonymousClass990;
import X.AnonymousClass9U4;
import X.C003203q;
import X.C1899593h;
import X.C1905698y;
import X.C1907099n;
import X.C194229Sb;
import X.C194819Up;
import X.C194909Va;
import X.C195909Zz;
import X.C203499no;
import X.C56972sr;
import X.C57352tV;
import X.C620733j;
import X.C627736r;
import X.C64773Ex;
import X.C994255r;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IndiaPaymentMerchantContactPickerFragment extends Hilt_IndiaPaymentMerchantContactPickerFragment {
    public C194909Va A00;
    public AnonymousClass36F A01;
    public C195909Zz A02;
    public C1907099n A03;
    public C203499no A04;
    public C194819Up A05;
    public C194229Sb A06;
    public String A07;

    public C994255r A1N() {
        ArrayList arrayList = this.A2y;
        List list = this.A31;
        List list2 = this.A38;
        List list3 = this.A3m;
        Set set = this.A3o;
        HashSet hashSet = this.A3k;
        C56972sr r1 = this.A0b;
        C620733j r6 = this.A1V;
        C64773Ex r2 = this.A0w;
        AnonymousClass5ZU r4 = this.A12;
        return new AnonymousClass98w(r1, r2, this.A11, r4, this, r6, (String) this.A3h.A07(), hashSet, arrayList, list, list2, list3, set);
    }

    public AnonymousClass54P A1O() {
        C194819Up r1 = new C194819Up(this.A1x);
        this.A05 = r1;
        if (!r1.A03) {
            return new C1905698y(this.A0w, this, this.A00);
        }
        C64773Ex r4 = this.A0w;
        List list = r1.A00;
        AnonymousClass31C r7 = this.A29;
        return new AnonymousClass990(this.A0u, r4, this, this.A1J, r7, list);
    }

    public void A0o(Bundle bundle) {
        super.A0o(bundle);
        this.A19.A00.getSupportActionBar().A0B(R.string.f11nameremoved);
        this.A07 = A1K().getString("referral_screen");
        this.A04 = AnonymousClass9U4.A07(this.A2H).B7b();
    }

    public boolean A2F(Intent intent, AnonymousClass3ZH r13, Integer num) {
        if (A0Q() != null) {
            if (this.A04 != null) {
                AnonymousClass303 A0K = C1899593h.A0K();
                A0K.A03("merchant_name", r13.A0L());
                this.A04.BKE(A0K, 1, 187, "merchants_screen", this.A07);
            }
            Intent A1N = new C627736r().A1N(A0Q(), r13.A0H);
            C003203q A0Q = A0Q();
            A1N.putExtra("share_msg", "Hi");
            A1N.putExtra("confirm", true);
            A1N.putExtra("has_share", true);
            C57352tV.A00(A0Q, A1N);
            A0m(A1N);
        }
        return true;
    }

    public boolean A21() {
        return false;
    }

    public boolean A22() {
        return false;
    }

    public boolean A23() {
        return false;
    }

    public boolean A24() {
        return false;
    }

    public boolean A25() {
        return false;
    }

    public boolean A26() {
        return false;
    }

    public boolean A2A() {
        return true;
    }

    public boolean A2B() {
        return true;
    }
}
