package com.whatsapp.payments.ui;

import X.AnonymousClass001;
import X.AnonymousClass0VX;
import X.AnonymousClass1VX;
import X.AnonymousClass2z0;
import X.AnonymousClass39S;
import X.AnonymousClass4FS;
import X.AnonymousClass7EL;
import X.AnonymousClass8MC;
import X.AnonymousClass906;
import X.AnonymousClass92S;
import X.AnonymousClass9U4;
import X.AnonymousClass9U5;
import X.C06560Yg;
import X.C08310eF;
import X.C106715a2;
import X.C107395bF;
import X.C125346Hl;
import X.C137256oO;
import X.C137266oP;
import X.C137276oQ;
import X.C137286oR;
import X.C158777kX;
import X.C162457s7;
import X.C166587yw;
import X.C167027ze;
import X.C18270x1;
import X.C18280x3;
import X.C185498tm;
import X.C186078ui;
import X.C1891290c;
import X.C195169Wk;
import X.C195219Wq;
import X.C203739oE;
import X.C29251iW;
import X.C43942Ub;
import X.C620733j;
import X.C620933l;
import X.C626936e;
import X.C66543Lv;
import X.C69263Wi;
import X.C86604Kt;
import X.C86614Ku;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import androidx.fragment.app.DialogFragment;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaButtonWithLoader;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;
import java.util.ArrayList;
import java.util.List;

public final class HybridPaymentMethodPickerFragment extends Hilt_HybridPaymentMethodPickerFragment implements C203739oE {
    public C69263Wi A00;
    public WaButtonWithLoader A01;
    public C620733j A02;
    public C66543Lv A03;
    public C166587yw A04;
    public AnonymousClass1VX A05;
    public C29251iW A06;
    public C620933l A07;
    public AnonymousClass9U5 A08;
    public AnonymousClass9U4 A09;
    public C125346Hl A0A;
    public C185498tm A0B;
    public C186078ui A0C;
    public C158777kX A0D;
    public C195219Wq A0E;
    public AnonymousClass39S A0F;
    public AnonymousClass2z0 A0G;
    public C106715a2 A0H;
    public AnonymousClass4FS A0I;
    public List A0J;
    public List A0K;
    public boolean A0L;
    public boolean A0M;
    public final C43942Ub A0N = new AnonymousClass906(this, 0);
    public final List A0O = AnonymousClass001.A0s();

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C162457s7.A0J(layoutInflater, 0);
        return layoutInflater.inflate(R.layout.f8nameremoved, viewGroup, false);
    }

    public void A0w(Bundle bundle, View view) {
        int i;
        C162457s7.A0J(view, 0);
        ImageView A0J2 = C86604Kt.A0J(view, R.id.nav_icon);
        C08310eF r0 = this.A0E;
        if (r0 == null || r0.A0T().A07() <= 1) {
            A0J2.setImageDrawable(AnonymousClass0VX.A01(view.getContext(), R.drawable.ic_close));
            i = 7;
        } else {
            A0J2.setImageDrawable(AnonymousClass0VX.A01(view.getContext(), R.drawable.ic_back));
            i = 9;
        }
        C1891290c.A00(A0J2, this, i);
        C620733j r5 = this.A02;
        if (r5 != null) {
            AnonymousClass9U4 r4 = this.A09;
            if (r4 != null) {
                C158777kX r2 = this.A0D;
                if (r2 != null) {
                    this.A0A = new C125346Hl(r5, r4, new AnonymousClass92S(this, 1), r2);
                    RecyclerView recyclerView = (RecyclerView) C06560Yg.A02(view, R.id.methods_list);
                    C125346Hl r02 = this.A0A;
                    if (r02 == null) {
                        throw C18270x1.A0S("methodListAdapter");
                    }
                    recyclerView.setAdapter(r02);
                    TextEmojiLabel A0M2 = C86614Ku.A0M(view, R.id.terms_of_services_footer);
                    if (this.A0G != null) {
                        AnonymousClass4FS r1 = this.A0I;
                        if (r1 != null) {
                            r1.BkP(new AnonymousClass8MC(A0M2, this));
                        } else {
                            throw C18270x1.A0S("waWorkers");
                        }
                    }
                    C125346Hl r12 = this.A0A;
                    if (r12 == null) {
                        throw C18270x1.A0S("methodListAdapter");
                    }
                    r12.A0L(A1I());
                    WaButtonWithLoader waButtonWithLoader = (WaButtonWithLoader) C06560Yg.A02(view, R.id.continue_button);
                    this.A01 = waButtonWithLoader;
                    if (waButtonWithLoader != null) {
                        waButtonWithLoader.setButtonText((int) R.string.f11nameremoved);
                    }
                    WaButtonWithLoader waButtonWithLoader2 = this.A01;
                    if (waButtonWithLoader2 != null) {
                        waButtonWithLoader2.A00 = new C1891290c(this, 8);
                    }
                    FrameLayout frameLayout = (FrameLayout) C18280x3.A0E(view, R.id.footer_view);
                    C185498tm r13 = this.A0B;
                    if (r13 != null) {
                        LayoutInflater A0I2 = A0I();
                        C162457s7.A0D(A0I2);
                        View B7m = r13.B7m(A0I2, frameLayout);
                        if (B7m != null) {
                            frameLayout.addView(B7m);
                            frameLayout.setVisibility(0);
                        }
                    }
                    ScrollView scrollView = (ScrollView) C18280x3.A0E(view, R.id.content_scrollview);
                    scrollView.getViewTreeObserver().addOnScrollChangedListener(new C167027ze((LinearLayout) C18280x3.A0E(view, R.id.footer_container), (RelativeLayout) C18280x3.A0E(view, R.id.action_bar), scrollView, C08310eF.A09(this).getDimension(R.dimen.f6nameremoved)));
                    return;
                }
                throw C18270x1.A0S("paymentMethodPresenter");
            }
            throw C18270x1.A0S("paymentsManager");
        }
        throw C18270x1.A0S("whatsAppLocale");
    }

    public String B9i(C166587yw r2) {
        String B9i;
        C162457s7.A0J(r2, 0);
        C185498tm r0 = this.A0B;
        if (r0 == null || (B9i = r0.B9i(r2)) == null) {
            return C195169Wk.A03(A0G(), r2);
        }
        return B9i;
    }

    public String B9j(C166587yw r3) {
        C162457s7.A0J(r3, 0);
        C158777kX r0 = this.A0D;
        if (r0 != null) {
            return r0.A02(r3, false);
        }
        throw C18270x1.A0S("paymentMethodPresenter");
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ae  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List A1I() {
        /*
            r5 = this;
            java.util.List r4 = r5.A0O
            r4.clear()
            java.util.List r0 = r5.A0K
            java.lang.String r2 = "nativePaymentMethods"
            if (r0 != 0) goto L_0x0010
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r2)
            throw r0
        L_0x0010:
            boolean r0 = r0.isEmpty()
            r1 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x005e
            r1 = 2131891585(0x7f121581, float:1.9417894E38)
            android.content.res.Resources r0 = X.C08310eF.A09(r5)
            java.lang.String r1 = r0.getString(r1)
            X.C162457s7.A0D(r1)
            X.6oN r0 = new X.6oN
            r0.<init>(r1)
            r4.add(r0)
            java.util.List r0 = r5.A0K
            if (r0 != 0) goto L_0x0038
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r2)
            throw r0
        L_0x0038:
            java.util.Iterator r3 = r0.iterator()
        L_0x003c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0069
            java.lang.Object r0 = r3.next()
            X.7yw r0 = (X.C166587yw) r0
            X.7yw r2 = r5.A04
            X.6oR r1 = new X.6oR
            r1.<init>(r0, r5)
            X.7yw r0 = r1.A01
            boolean r0 = X.C162457s7.A0P(r0, r2)
            if (r0 == 0) goto L_0x005a
            r0 = 1
            r1.A00 = r0
        L_0x005a:
            r4.add(r1)
            goto L_0x003c
        L_0x005e:
            X.7yw r0 = r5.A04
            if (r0 == 0) goto L_0x0063
            r1 = 0
        L_0x0063:
            X.6oP r0 = new X.6oP
            r0.<init>(r1)
            goto L_0x00a0
        L_0x0069:
            r0 = 10
            X.90c r1 = new X.90c
            r1.<init>(r5, r0)
            X.6oL r0 = new X.6oL
            r0.<init>(r1)
            r4.add(r0)
            X.8tm r1 = r5.A0B
            if (r1 == 0) goto L_0x0091
            android.view.LayoutInflater r0 = r5.A0I()
            X.C162457s7.A0D(r0)
            android.view.View r1 = r1.B4D(r0)
            if (r1 == 0) goto L_0x0091
            X.6oM r0 = new X.6oM
            r0.<init>(r1)
            r4.add(r0)
        L_0x0091:
            X.8tm r0 = r5.A0B
            if (r0 == 0) goto L_0x00a3
            java.lang.String r1 = r0.B7U()
            if (r1 == 0) goto L_0x00a3
            X.6oN r0 = new X.6oN
            r0.<init>(r1)
        L_0x00a0:
            r4.add(r0)
        L_0x00a3:
            java.util.List r0 = r5.A0J
            if (r0 != 0) goto L_0x00ae
            java.lang.String r0 = "externalPaymentOptions"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x00ae:
            java.util.Iterator r3 = r0.iterator()
        L_0x00b2:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00d4
            java.lang.Object r0 = r3.next()
            X.7yw r0 = (X.C166587yw) r0
            X.7yw r2 = r5.A04
            X.6oR r1 = new X.6oR
            r1.<init>(r0, r5)
            X.7yw r0 = r1.A01
            boolean r0 = X.C162457s7.A0P(r0, r2)
            if (r0 == 0) goto L_0x00d0
            r0 = 1
            r1.A00 = r0
        L_0x00d0:
            r4.add(r1)
            goto L_0x00b2
        L_0x00d4:
            boolean r0 = r5.A0M
            if (r0 == 0) goto L_0x00e1
            X.6oO r0 = new X.6oO
            r0.<init>()
        L_0x00dd:
            r4.add(r0)
        L_0x00e0:
            return r4
        L_0x00e1:
            boolean r0 = r5.A0L
            if (r0 == 0) goto L_0x00e0
            X.6oQ r0 = new X.6oQ
            r0.<init>()
            goto L_0x00dd
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.HybridPaymentMethodPickerFragment.A1I():java.util.List");
    }

    public final void A1J(int i) {
        C186078ui r0;
        AnonymousClass7EL r1 = (AnonymousClass7EL) this.A0O.get(i);
        if (r1 instanceof C137286oR) {
            C166587yw r12 = ((C137286oR) r1).A01;
            this.A04 = r12;
            C186078ui r02 = this.A0C;
            if (r02 != null) {
                r02.BQ4(r12);
            }
        } else if (r1 instanceof C137266oP) {
            C08310eF r13 = this.A0E;
            C162457s7.A0K(r13, "null cannot be cast to non-null type com.whatsapp.payments.ui.PaymentBottomSheet");
            ((DialogFragment) r13).A1K();
            C186078ui r03 = this.A0C;
            if (r03 != null) {
                r03.Bpj();
            }
        } else if (r1 instanceof C137256oO) {
            C186078ui r04 = this.A0C;
            if (r04 != null) {
                r04.Bpe();
            }
        } else if ((r1 instanceof C137276oQ) && (r0 = this.A0C) != null) {
            r0.BgJ();
        }
    }

    public /* synthetic */ int B9g(C166587yw r2) {
        return 0;
    }

    public boolean BoB(C166587yw r2) {
        return false;
    }

    public boolean BoN() {
        return false;
    }

    public /* synthetic */ boolean BoR() {
        return false;
    }

    public void A0a() {
        super.A0a();
        C29251iW r1 = this.A06;
        if (r1 != null) {
            r1.A07(this.A0N);
            return;
        }
        throw C18270x1.A0S("accountObservers");
    }

    public void A0p(Bundle bundle) {
        super.A0p(bundle);
        Bundle A0H2 = A0H();
        ArrayList parcelableArrayList = A0H2.getParcelableArrayList("arg_native_methods");
        C626936e.A06(parcelableArrayList);
        C162457s7.A0D(parcelableArrayList);
        this.A0K = parcelableArrayList;
        ArrayList parcelableArrayList2 = A0H2.getParcelableArrayList("arg_external_methods");
        C626936e.A06(parcelableArrayList2);
        C162457s7.A0D(parcelableArrayList2);
        this.A0J = parcelableArrayList2;
        this.A04 = (C166587yw) A0H2.getParcelable("arg_selected_method");
        this.A0M = A0H2.getBoolean("arg_hpp_checkout_enabled");
        this.A0G = C107395bF.A03(A0H2, "");
        this.A0L = A0H2.getBoolean("arg_has_merchant_configuration_payment_link");
        C29251iW r1 = this.A06;
        if (r1 != null) {
            r1.A06(this.A0N);
            return;
        }
        throw C18270x1.A0S("accountObservers");
    }

    public /* synthetic */ void Boj(C166587yw r1, PaymentMethodRow paymentMethodRow) {
    }
}
