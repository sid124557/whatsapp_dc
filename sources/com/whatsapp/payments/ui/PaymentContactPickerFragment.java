package com.whatsapp.payments.ui;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0R8;
import X.AnonymousClass1VX;
import X.AnonymousClass36F;
import X.AnonymousClass39Q;
import X.AnonymousClass3ZH;
import X.AnonymousClass4FU;
import X.AnonymousClass54P;
import X.AnonymousClass5ZU;
import X.AnonymousClass98x;
import X.AnonymousClass9TC;
import X.AnonymousClass9TK;
import X.AnonymousClass9U4;
import X.AnonymousClass9VG;
import X.AnonymousClass9WE;
import X.AnonymousClass9Wg;
import X.C003203q;
import X.C08310eF;
import X.C133676hl;
import X.C162457s7;
import X.C18290x4;
import X.C18300x5;
import X.C18310x6;
import X.C1899593h;
import X.C1899693i;
import X.C1901794j;
import X.C1905798z;
import X.C1907099n;
import X.C194659Tz;
import X.C194869Uu;
import X.C195909Zz;
import X.C200479iO;
import X.C200489iP;
import X.C203499no;
import X.C204829pz;
import X.C205049qL;
import X.C56612sH;
import X.C56972sr;
import X.C620733j;
import X.C64773Ex;
import X.C69263Wi;
import X.C95814uZ;
import X.C994255r;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PaymentContactPickerFragment extends Hilt_PaymentContactPickerFragment {
    public AnonymousClass36F A00;
    public C195909Zz A01;
    public C1907099n A02;
    public C203499no A03;
    public AnonymousClass9VG A04;
    public C1901794j A05;
    public PaymentIncentiveViewModel A06;
    public String A07;
    public Map A08 = AnonymousClass001.A0t();

    public C994255r A1N() {
        if (!this.A02.A02.A0X(2026)) {
            return super.A1N();
        }
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
        return new AnonymousClass98x(r1, r2, this.A11, r4, this, r6, (String) this.A3h.A07(), hashSet, arrayList, list, list2, list3, set);
    }

    public AnonymousClass54P A1O() {
        if (!this.A02.A02.A0X(2026)) {
            return super.A1O();
        }
        C64773Ex r1 = this.A0w;
        AnonymousClass9U4 r5 = this.A2H;
        return new C1905798z(r1, this, this.A00, this.A02, r5);
    }

    public String A1Q(AnonymousClass3ZH r4) {
        if (this.A02.A05(AnonymousClass3ZH.A07(r4)) != 2) {
            return C08310eF.A09(this).getString(R.string.f11nameremoved);
        }
        return null;
    }

    public String A1R(AnonymousClass3ZH r4) {
        if (this instanceof IndiaUpiContactPickerFragment) {
            if (this.A1x.A0X(3619) || A2J(r4) != 2) {
                return null;
            }
            return C08310eF.A09(this).getString(R.string.f11nameremoved);
        } else if (A2J(r4) == 2) {
            return C08310eF.A09(this).getString(R.string.f11nameremoved);
        } else {
            return null;
        }
    }

    public boolean A27() {
        AnonymousClass9VG r2 = this.A04;
        if (r2 == null || r2.A00(C56612sH.A00(this.A1S)) != 1) {
            return false;
        }
        return true;
    }

    public boolean A29() {
        if (this instanceof IndiaUpiContactPickerFragment) {
            return AnonymousClass000.A1W(AnonymousClass9U4.A07(this.A2H).BAy());
        }
        if (!this.A1x.A0X(544) || AnonymousClass9U4.A04(this.A2H) == null) {
            return false;
        }
        return true;
    }

    public int A2J(AnonymousClass3ZH r5) {
        Jid A0I = r5.A0I(UserJid.class);
        if (A0I != null) {
            C133676hl r1 = (C133676hl) this.A08.get(A0I);
            AnonymousClass9TC A042 = AnonymousClass9U4.A04(this.A2H);
            if (!(r1 == null || A042 == null)) {
                return (int) ((r1.A08().A00 >> 12) & 15);
            }
        }
        return 0;
    }

    public final void A2K() {
        if (this.A03 != null) {
            AnonymousClass9Wg.A03(AnonymousClass9Wg.A00(this.A1S, (AnonymousClass39Q) null, this.A04, (String) null, false), this.A03, "payment_contact_picker", this.A07);
        }
    }

    public void A2L(UserJid userJid) {
        int i;
        Iterator it = this.A38.iterator();
        while (true) {
            if (!it.hasNext()) {
                i = 133;
                break;
            }
            C95814uZ r0 = C18310x6.A0R(it).A0H;
            if (r0 != null && r0.getRawString().equals(userJid.getRawString())) {
                i = 149;
                break;
            }
        }
        Integer valueOf = Integer.valueOf(i);
        C203499no r2 = this.A03;
        if (r2 != null) {
            C1899593h.A1E(r2, valueOf, "payment_contact_picker", this.A07);
        }
    }

    public void A2M(UserJid userJid) {
        Intent A012 = this.A01.A01(A1D(), false, false);
        A012.putExtra("referral_screen", this.A07);
        A012.putExtra("extra_jid", userJid.getRawString());
        A2L(userJid);
        A0m(A012);
        C18300x5.A1A(this);
    }

    public void A0o(Bundle bundle) {
        super.A0o(bundle);
        AnonymousClass0R8 supportActionBar = this.A19.A00.getSupportActionBar();
        C162457s7.A0J(this.A1x, 0);
        supportActionBar.A0B(R.string.f11nameremoved);
        this.A07 = A1K().getString("referral_screen");
        this.A05 = (C1901794j) C18290x4.A0O(this).A01(C1901794j.class);
        this.A03 = AnonymousClass9U4.A06(this.A2H);
        if (C1899693i.A0w(this.A1x)) {
            PaymentIncentiveViewModel paymentIncentiveViewModel = (PaymentIncentiveViewModel) C18290x4.A0O(this).A01(PaymentIncentiveViewModel.class);
            this.A06 = paymentIncentiveViewModel;
            paymentIncentiveViewModel.A01.A0G(AnonymousClass9WE.A01(paymentIncentiveViewModel.A06.A00()));
            C205049qL.A03(A0R(), this.A06.A01, this, 59);
            return;
        }
        A2K();
    }

    public void A1z(List list) {
        HashMap A0t = AnonymousClass001.A0t();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C133676hl r1 = (C133676hl) it.next();
            A0t.put(r1.A05, r1);
        }
        this.A08 = A0t;
    }

    public boolean A2F(Intent intent, AnonymousClass3ZH r15, Integer num) {
        C003203q A0Q;
        UserJid A072 = AnonymousClass3ZH.A07(r15);
        if (this.A02.A05(A072) != 2) {
            return true;
        }
        if (intent == null && (A0Q = A0Q()) != null) {
            A0Q.getIntent();
        }
        C69263Wi r7 = this.A0a;
        AnonymousClass9U4 r8 = this.A2H;
        AnonymousClass9TK r4 = new AnonymousClass9TK(A0Q(), (AnonymousClass4FU) A0R(), r7, r8, this.A05, new C200479iO(A072, this), new C200489iP(A072, this), true);
        if (r4.A02()) {
            this.A19.BpA(0, R.string.f11nameremoved);
            r4.A00(A072, new C204829pz(this, 1), "payment_contact_picker");
            return true;
        }
        A2M(A072);
        return true;
    }

    public boolean A2G(AnonymousClass3ZH r9) {
        C194869Uu r0;
        UserJid A072 = AnonymousClass3ZH.A07(r9);
        PaymentIncentiveViewModel paymentIncentiveViewModel = this.A06;
        if (paymentIncentiveViewModel == null) {
            return false;
        }
        Map map = this.A08;
        AnonymousClass9VG A002 = paymentIncentiveViewModel.A06.A00();
        C194659Tz A052 = AnonymousClass9U4.A05(paymentIncentiveViewModel.A05);
        if (A052 == null) {
            return false;
        }
        AnonymousClass1VX r2 = A052.A07;
        if (r2.A0X(979) || !paymentIncentiveViewModel.A0E(A052, A002)) {
            return false;
        }
        C133676hl r1 = (C133676hl) map.get(A072);
        if (!C1899693i.A0w(r2) || (r0 = A002.A01) == null || A052.A00(r1, A072, r0) != 1) {
            return false;
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

    public boolean A2B() {
        return true;
    }
}
