package com.whatsapp.payments.ui;

import X.AnonymousClass002;
import X.AnonymousClass0Y8;
import X.AnonymousClass0x9;
import X.AnonymousClass1S3;
import X.AnonymousClass1VX;
import X.AnonymousClass303;
import X.AnonymousClass4FS;
import X.AnonymousClass5RJ;
import X.AnonymousClass9U4;
import X.AnonymousClass9U5;
import X.C003203q;
import X.C06560Yg;
import X.C103255Me;
import X.C107335b8;
import X.C115095o7;
import X.C162457s7;
import X.C166587yw;
import X.C171658Hx;
import X.C18270x1;
import X.C18290x4;
import X.C18300x5;
import X.C1891190b;
import X.C1891290c;
import X.C1902394t;
import X.C19340zH;
import X.C194259Se;
import X.C194329Sl;
import X.C194519Tf;
import X.C194939Vd;
import X.C197769dq;
import X.C203719oC;
import X.C56612sH;
import X.C620933l;
import X.C66543Lv;
import X.C69263Wi;
import X.C85204Fi;
import X.C86604Kt;
import X.C86614Ku;
import X.C86664Kz;
import X.C89644eZ;
import X.C97234xv;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.R;
import java.util.List;

public final class P2mLitePaymentSettingsFragment extends Hilt_P2mLitePaymentSettingsFragment {
    public View A00;
    public LinearLayout A01;
    public LinearLayout A02;
    public LinearLayout A03;
    public C66543Lv A04;
    public C197769dq A05;
    public C171658Hx A06;
    public C103255Me A07;
    public C97234xv A08;
    public AnonymousClass5RJ A09;
    public C194259Se A0A;

    public static /* synthetic */ void A01(P2mLitePaymentSettingsFragment p2mLitePaymentSettingsFragment) {
        C171658Hx r3 = p2mLitePaymentSettingsFragment.A06;
        if (r3 != null) {
            AnonymousClass303 r4 = new AnonymousClass303(new AnonymousClass303[0]);
            r4.A03("p2m_type", "p2m_lite");
            r3.A00(r4, 157, "payment_home", "chat", 1);
            C19340zH A0M = C18300x5.A0M(p2mLitePaymentSettingsFragment);
            A0M.A0U(R.string.f11nameremoved);
            A0M.A0T(R.string.f11nameremoved);
            A0M.A0i(true);
            A0M.A0W(new C1891190b(p2mLitePaymentSettingsFragment, 48), R.string.f11nameremoved);
            C86614Ku.A1O(A0M, p2mLitePaymentSettingsFragment, 49, R.string.f11nameremoved);
            C171658Hx r7 = p2mLitePaymentSettingsFragment.A06;
            if (r7 != null) {
                AnonymousClass303 r8 = new AnonymousClass303(new AnonymousClass303[0]);
                r8.A03("p2m_type", "p2m_lite");
                r7.A00(r8, (Integer) null, "remove_payments_info_dialogue", "payment_home", 0);
                A0M.A0S();
                return;
            }
            throw C18270x1.A0S("p2mLiteEventLogger");
        }
        throw C18270x1.A0S("p2mLiteEventLogger");
    }

    public void A0c() {
        this.A08 = null;
        this.A02 = null;
        this.A03 = null;
        this.A01 = null;
        this.A00 = null;
        super.A0c();
    }

    public void A0w(Bundle bundle, View view) {
        C162457s7.A0J(view, 0);
        super.A0w(bundle, view);
        C06560Yg.A02(view, R.id.payment_methods_container).setVisibility(8);
        C86604Kt.A1E(view, R.id.payment_history_separator, 8);
        this.A00 = view.findViewById(R.id.payment_settings_row_separator);
        LinearLayout A0v = C86664Kz.A0v(view, R.id.payment_settings_row_remove_method);
        this.A02 = A0v;
        if (A0v != null) {
            A0v.setOnClickListener(new C1891290c(this, 19));
        }
        Context A1D = A1D();
        if (A1D != null) {
            int A042 = AnonymousClass0Y8.A04(A1D, R.color.f5nameremoved);
            if (Integer.valueOf(A042) != null) {
                C107335b8.A0E(AnonymousClass0x9.A0F(view, R.id.delete_payments_account_icon), A042);
            }
        }
        AnonymousClass002.A09(view, R.id.delete_payments_account_label).setText(R.string.f11nameremoved);
        Context A1D2 = A1D();
        if (A1D2 != null) {
            int A043 = AnonymousClass0Y8.A04(A1D2, R.color.f5nameremoved);
            if (Integer.valueOf(A043) != null) {
                C107335b8.A0E(AnonymousClass0x9.A0F(view, R.id.request_dyi_report_icon), A043);
            }
        }
        LinearLayout A0v2 = C86664Kz.A0v(view, R.id.request_dyi_report_button);
        this.A03 = A0v2;
        if (A0v2 != null) {
            A0v2.setOnClickListener(new C1891290c(this, 17));
        }
        LinearLayout A0v3 = C86664Kz.A0v(view, R.id.payment_support_container);
        this.A01 = A0v3;
        if (A0v3 != null) {
            A0v3.setOnClickListener(new C1891290c(this, 18));
        }
        C18290x4.A0X(view, R.id.payment_support_section_separator).A06(8);
        C18290x4.A1A(A0G(), AnonymousClass0x9.A0F(view, R.id.payment_support_icon), R.drawable.ic_help);
        C107335b8.A0E(AnonymousClass0x9.A0F(view, R.id.payment_support_icon), AnonymousClass0Y8.A04(A0G(), R.color.f5nameremoved));
        AnonymousClass002.A09(view, R.id.payment_support_title).setText(R.string.f11nameremoved);
        this.A11.setSizeLimit(3);
        C003203q A0Q = A0Q();
        C162457s7.A0K(A0Q, "null cannot be cast to non-null type com.whatsapp.WaBaseActivity");
        this.A07 = new C103255Me((C89644eZ) A0Q);
    }

    public static /* synthetic */ void A00(DialogInterface dialogInterface, P2mLitePaymentSettingsFragment p2mLitePaymentSettingsFragment) {
        C171658Hx r2 = p2mLitePaymentSettingsFragment.A06;
        if (r2 != null) {
            Integer A0a = C18290x4.A0a();
            AnonymousClass303 r3 = new AnonymousClass303(new AnonymousClass303[0]);
            r3.A03("p2m_type", "p2m_lite");
            r2.A00(r3, A0a, "remove_payments_info_dialogue", "payment_home", 1);
            dialogInterface.cancel();
            return;
        }
        throw C18270x1.A0S("p2mLiteEventLogger");
    }

    public static /* synthetic */ void A03(P2mLitePaymentSettingsFragment p2mLitePaymentSettingsFragment) {
        C171658Hx r2 = p2mLitePaymentSettingsFragment.A06;
        if (r2 != null) {
            Integer A0b = C18290x4.A0b();
            AnonymousClass303 r3 = new AnonymousClass303(new AnonymousClass303[0]);
            r3.A03("p2m_type", "p2m_lite");
            r2.A00(r3, A0b, "remove_payments_info_dialogue", "payment_home", 1);
            p2mLitePaymentSettingsFragment.A0L.A0G(0, R.string.f11nameremoved);
            Context A1D = p2mLitePaymentSettingsFragment.A1D();
            C69263Wi r32 = p2mLitePaymentSettingsFragment.A0L;
            AnonymousClass4FS r11 = p2mLitePaymentSettingsFragment.A15;
            C194259Se r10 = p2mLitePaymentSettingsFragment.A0A;
            if (r10 != null) {
                AnonymousClass9U4 r9 = p2mLitePaymentSettingsFragment.A0n;
                C66543Lv r4 = p2mLitePaymentSettingsFragment.A04;
                if (r4 != null) {
                    C620933l r6 = p2mLitePaymentSettingsFragment.A0i;
                    AnonymousClass9U5 r7 = p2mLitePaymentSettingsFragment.A0k;
                    C197769dq r8 = p2mLitePaymentSettingsFragment.A05;
                    if (r8 != null) {
                        new C194329Sl(A1D, r32, r4, p2mLitePaymentSettingsFragment.A0f, r6, r7, r8, r9, r10, r11).A00(new C115095o7(p2mLitePaymentSettingsFragment));
                        return;
                    }
                    throw C18270x1.A0S("paymentsLifecycleManager");
                }
                throw C18270x1.A0S("coreMessageStore");
            }
            throw C18270x1.A0S("paymentDeviceId");
        }
        throw C18270x1.A0S("p2mLiteEventLogger");
    }

    public static /* synthetic */ void A04(P2mLitePaymentSettingsFragment p2mLitePaymentSettingsFragment) {
        C194519Tf r1 = new C194519Tf();
        r1.A03(p2mLitePaymentSettingsFragment.A01);
        r1.A04(p2mLitePaymentSettingsFragment.A13);
        r1.A02(p2mLitePaymentSettingsFragment.A0S);
        r1.A00();
        r1.A01(p2mLitePaymentSettingsFragment.A1D());
    }

    public C194939Vd A1U() {
        return null;
    }

    public C1902394t A1V() {
        C97234xv r0 = this.A08;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass5RJ r02 = this.A09;
        if (r02 != null) {
            C56612sH r1 = r02.A06;
            AnonymousClass1VX r4 = r02.A0F;
            C97234xv r03 = new C97234xv(r1, r02.A08, r02.A0E, r4, r02.A0I, r02.A0L, r02.A0O);
            this.A08 = r03;
            return r03;
        }
        throw C18270x1.A0S("viewModelCreationDelegate");
    }

    public CharSequence A1W() {
        C85204Fi A012 = this.A0l.A01();
        if (A012 == null) {
            return "";
        }
        return ((AnonymousClass1S3) A012).B6J(A0G(), 0);
    }

    public String A1Y() {
        return "P2M_LITE";
    }

    public boolean A1j() {
        return this.A0m.A0D();
    }

    public boolean A1k() {
        return true;
    }

    public boolean A1l() {
        return true;
    }

    public final void A1o() {
        boolean z = this.A0i.A03().getBoolean("has_p2mlite_account", false);
        int i = 8;
        LinearLayout linearLayout = this.A02;
        if (z) {
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            View view = this.A00;
            if (view != null) {
                view.setVisibility(0);
            }
            if (this.A02.A0X(2727)) {
                i = 0;
            }
        } else {
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            View view2 = this.A00;
            if (view2 != null) {
                view2.setVisibility(8);
            }
        }
        LinearLayout linearLayout2 = this.A03;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(i);
        }
    }

    public boolean BoN() {
        return false;
    }

    public static /* synthetic */ void A02(P2mLitePaymentSettingsFragment p2mLitePaymentSettingsFragment) {
        Context A1D = p2mLitePaymentSettingsFragment.A1D();
        if (A1D != null) {
            C203719oC A0H = p2mLitePaymentSettingsFragment.A0n.A0H("P2M_LITE");
            Intent intent = null;
            if (A0H != null) {
                intent = A0H.B7D(A1D, "personal", (String) null);
            }
            p2mLitePaymentSettingsFragment.A0m(intent);
        }
    }

    public void BMA(boolean z) {
    }

    public void BXr(C166587yw r1) {
    }

    public void Bs5(List list) {
        super.Bs5(list);
        C97234xv r0 = this.A08;
        if (r0 != null) {
            r0.A04 = list;
        }
        A1b();
        A1o();
    }
}
