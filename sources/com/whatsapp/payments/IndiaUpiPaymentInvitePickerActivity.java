package com.whatsapp.payments;

import X.AnonymousClass001;
import X.AnonymousClass32Y;
import X.AnonymousClass3ZH;
import X.AnonymousClass995;
import X.AnonymousClass9WM;
import X.C107545bU;
import X.C107695bk;
import X.C18280x3;
import X.C18310x6;
import X.C1899593h;
import X.C1907099n;
import X.C193109Ne;
import X.C194389Sr;
import X.C197109ca;
import X.C198839fZ;
import X.C204019og;
import X.C55502qS;
import X.C56422rx;
import X.C56962sq;
import X.C64333Db;
import X.C86604Kt;
import X.C86614Ku;
import X.C86644Kx;
import X.C86654Ky;
import X.C88834as;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.whatsapp.R;
import com.whatsapp.payments.ui.PaymentInvitePickerActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IndiaUpiPaymentInvitePickerActivity extends PaymentInvitePickerActivity {
    public C56422rx A00;
    public AnonymousClass9WM A01;
    public C1907099n A02;
    public C194389Sr A03;
    public C197109ca A04;
    public C193109Ne A05;
    public boolean A06;
    public boolean A07;

    public void A5r() {
        if (!this.A06) {
            this.A06 = true;
            C88834as A0I = C18280x3.A0I(this);
            C64333Db r3 = A0I.A4Z;
            C1899593h.A15(r3, this);
            C107695bk r2 = r3.A00;
            C1899593h.A0z(r3, r2, this, C1899593h.A0W(r3, r2, this));
            AnonymousClass995.A0X(r2, this);
            C107545bU.A0A(this, C86614Ku.A0k(r3));
            C107545bU.A05(C86604Kt.A0S(r3), this);
            this.A0B = C64333Db.A26(r3);
            this.A0D = C86604Kt.A0R(r3);
            this.A08 = C86654Ky.A0T(r3);
            C107545bU.A04(C86604Kt.A0Q(r3), this);
            C107545bU.A03(C86614Ku.A0P(r3), this);
            AnonymousClass995.A0L(A0I, r3, this, C64333Db.A2t(r3));
            this.A00 = C1899593h.A0I(r3);
            this.A05 = new C193109Ne((C56962sq) r3.A2b.get());
            this.A00 = C86644Kx.A0S(r3);
            this.A02 = C1899593h.A0H(r3);
            this.A03 = A0I.ACl();
            this.A04 = C1899593h.A0L(r3);
            this.A01 = r2.AN7();
        }
    }

    public void A7H() {
        if (this.A02.A02.A0X(783)) {
            this.A07 = true;
            this.A04.BkM(new C198839fZ(this));
        }
    }

    public void A7M(View view, View view2, View view3, View view4) {
        if (this.A02.A02.A0X(783)) {
            startContactShimmerContacts(view4);
            view4.setVisibility(8);
            view.setVisibility(8);
            view2.setVisibility(8);
            view3.setVisibility(0);
            return;
        }
        super.A7M(view, view2, view3, view4);
    }

    public IndiaUpiPaymentInvitePickerActivity(int i) {
        this.A06 = false;
        C204019og.A00(this, 7);
    }

    public void A7L(View view, View view2, View view3, View view4) {
        super.A7L(view, view2, view3, view4);
        if (this.A02.A02.A0X(783)) {
            C86604Kt.A1L(this, R.id.contact_list_shimmer_container);
        }
    }

    public void A7Y(List list) {
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass3ZH A0R = C18310x6.A0R(it);
            C55502qS A002 = this.A00.A00(AnonymousClass32Y.A03(A0R.A0H));
            if (A002 == null || (!A002.A03() && !A002.A02())) {
                A0s.add(A0R);
            }
        }
        super.A7Y(A0s);
    }

    public final void startContactShimmerContacts(View view) {
        View inflate = getLayoutInflater().inflate(R.layout.f8nameremoved, (ViewGroup) null, false);
        ((ViewGroup) view.getParent()).addView(inflate, 0);
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) inflate.findViewById(R.id.contact_list_shimmer_container);
        if (shimmerFrameLayout != null) {
            shimmerFrameLayout.setVisibility(0);
            shimmerFrameLayout.A02();
        }
    }

    public boolean A7a() {
        return this.A07;
    }

    public IndiaUpiPaymentInvitePickerActivity() {
        this(0);
        this.A07 = false;
    }
}
