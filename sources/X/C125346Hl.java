package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6Hl  reason: invalid class name and case insensitive filesystem */
public final class C125346Hl extends AnonymousClass0R6 {
    public int A00 = -1;
    public ArrayList A01 = AnonymousClass001.A0s();
    public final C620733j A02;
    public final AnonymousClass9U4 A03;
    public final C182848p5 A04;
    public final C158777kX A05;

    public static final C137106nx A00(ViewGroup viewGroup) {
        View inflate = C18280x3.A0D(viewGroup).inflate(R.layout.f8nameremoved, viewGroup, false);
        C162457s7.A0H(inflate);
        return new C137106nx(inflate);
    }

    public static final C137126nz A01(ViewGroup viewGroup, C620733j r4, AnonymousClass9U4 r5, C182848p5 r6, C158777kX r7) {
        View inflate = C18280x3.A0D(viewGroup).inflate(R.layout.f8nameremoved, viewGroup, false);
        C162457s7.A0H(inflate);
        return new C137126nz(inflate, r4, r5, r6, r7);
    }

    /* renamed from: A0K */
    public C125686Iz BQR(ViewGroup viewGroup, int i) {
        C162457s7.A0J(viewGroup, 0);
        AnonymousClass92S r3 = new AnonymousClass92S(this, 0);
        switch (i) {
            case 0:
                View inflate = C86604Kt.A0D(viewGroup).inflate(R.layout.f8nameremoved, viewGroup, false);
                C162457s7.A0H(inflate);
                return new C137116ny(inflate);
            case 1:
                return A01(viewGroup, this.A02, this.A03, r3, this.A05);
            case 2:
                View inflate2 = C86604Kt.A0D(viewGroup).inflate(R.layout.f8nameremoved, viewGroup, false);
                C162457s7.A0H(inflate2);
                return new C137096nw(inflate2);
            case 3:
                return A00(viewGroup);
            case 4:
                View view = A00(viewGroup).A0H;
                C162457s7.A0C(view);
                return new C137146o1(view, r3);
            case 5:
                View view2 = A00(viewGroup).A0H;
                C162457s7.A0C(view2);
                return new C137136o0(view2, r3);
            case 6:
                View view3 = A00(viewGroup).A0H;
                C162457s7.A0C(view3);
                return new C137156o2(view3, r3);
            default:
                throw AnonymousClass000.A0G("Unexpected view type: ", AnonymousClass001.A0o(), i);
        }
    }

    public int A0G() {
        return this.A01.size();
    }

    public /* bridge */ /* synthetic */ void BNf(C05570Ua r7, int i) {
        C125686Iz r72 = (C125686Iz) r7;
        C162457s7.A0J(r72, 0);
        Object obj = this.A01.get(i);
        C162457s7.A0D(obj);
        AnonymousClass7EL r2 = (AnonymousClass7EL) obj;
        if (r2 instanceof AnonymousClass8s4) {
            ((AnonymousClass8s4) r2).setChecked(AnonymousClass000.A1U(i, this.A00));
        }
        if (r72 instanceof C137126nz) {
            C137126nz r73 = (C137126nz) r72;
            C162457s7.A0J(r2, 0);
            C137286oR r22 = (C137286oR) r2;
            C166587yw r4 = r22.A01;
            C158777kX r3 = r73.A04;
            PaymentMethodRow paymentMethodRow = r73.A05;
            r3.A03(r4, r22.A02, paymentMethodRow);
            paymentMethodRow.A00();
            C633939b.A00(paymentMethodRow, r73, 5);
            paymentMethodRow.setRadioButtonChecked(r22.A00);
        } else if (r72 instanceof C137116ny) {
            C137116ny r74 = (C137116ny) r72;
            C162457s7.A0J(r2, 0);
            String str = ((C137246oN) r2).A00;
            if (str.length() == 0) {
                r74.A0H.setVisibility(8);
                return;
            }
            r74.A0H.setVisibility(0);
            r74.A00.A0I(str);
        } else if (r72 instanceof C137106nx) {
            C137106nx r75 = (C137106nx) r72;
            if (r75 instanceof C137156o2) {
                C137156o2 r76 = (C137156o2) r75;
                C162457s7.A0J(r2, 0);
                View view = r76.A0H;
                Context context = view.getContext();
                PaymentMethodRow paymentMethodRow2 = r76.A01;
                paymentMethodRow2.A06(context.getString(R.string.f11nameremoved));
                paymentMethodRow2.A04(R.drawable.ic_card);
                paymentMethodRow2.A08(false);
                paymentMethodRow2.A00();
                paymentMethodRow2.setRadioButtonChecked(((C137276oQ) r2).A00);
                ImageView methodIconView = paymentMethodRow2.getMethodIconView();
                C162457s7.A0D(methodIconView);
                int dimension = (int) view.getResources().getDimension(R.dimen.f6nameremoved);
                methodIconView.setPadding(dimension, dimension, dimension, dimension);
                AnonymousClass0x2.A0p(context, methodIconView, R.color.f5nameremoved);
                methodIconView.setBackground(AnonymousClass0RP.A00(context, R.drawable.ic_payment_option_background));
                C633939b.A00(paymentMethodRow2, r76, 4);
            } else if (r75 instanceof C137146o1) {
                C137146o1 r77 = (C137146o1) r75;
                C162457s7.A0J(r2, 0);
                PaymentMethodRow paymentMethodRow3 = r77.A01;
                paymentMethodRow3.A06(r77.A0H.getContext().getString(R.string.f11nameremoved));
                paymentMethodRow3.A04(R.drawable.ic_wa_app_logo);
                paymentMethodRow3.A08(false);
                paymentMethodRow3.A00();
                paymentMethodRow3.setRadioButtonChecked(((C137266oP) r2).A00);
                C633939b.A00(paymentMethodRow3, r77, 3);
            } else if (r75 instanceof C137136o0) {
                C137136o0 r78 = (C137136o0) r75;
                C162457s7.A0J(r2, 0);
                View view2 = r78.A0H;
                Context context2 = view2.getContext();
                PaymentMethodRow paymentMethodRow4 = r78.A01;
                paymentMethodRow4.A06(context2.getString(R.string.f11nameremoved));
                paymentMethodRow4.A05(context2.getString(R.string.f11nameremoved));
                paymentMethodRow4.A04(R.drawable.ic_card);
                paymentMethodRow4.A08(false);
                paymentMethodRow4.A00();
                paymentMethodRow4.setRadioButtonChecked(((C137256oO) r2).A00);
                ImageView methodIconView2 = paymentMethodRow4.getMethodIconView();
                C162457s7.A0D(methodIconView2);
                int dimension2 = (int) view2.getResources().getDimension(R.dimen.f6nameremoved);
                methodIconView2.setPadding(dimension2, dimension2, dimension2, dimension2);
                AnonymousClass0x2.A0p(context2, methodIconView2, R.color.f5nameremoved);
                methodIconView2.setBackground(AnonymousClass0RP.A00(context2, R.drawable.ic_payment_option_background));
                C633939b.A00(paymentMethodRow4, r78, 2);
            } else {
                C162457s7.A0J(r2, 0);
                r75.A00.addView(((C137236oM) r2).A00);
            }
        } else {
            C162457s7.A0J(r2, 0);
            r72.A0H.setOnClickListener(((C137226oL) r2).A00);
        }
    }

    public int getItemViewType(int i) {
        return ((AnonymousClass7EL) this.A01.get(i)).A00;
    }

    public C125346Hl(C620733j r2, AnonymousClass9U4 r3, C182848p5 r4, C158777kX r5) {
        this.A02 = r2;
        this.A03 = r3;
        this.A05 = r5;
        this.A04 = r4;
    }

    public final void A0L(List list) {
        int i = 0;
        for (Object next : list) {
            int i2 = i + 1;
            if (i < 0) {
                throw C18280x3.A0X();
            }
            AnonymousClass7EL r2 = (AnonymousClass7EL) next;
            if ((r2 instanceof AnonymousClass8s4) && ((AnonymousClass8s4) r2).isChecked()) {
                this.A00 = i;
            }
            i = i2;
        }
        ArrayList arrayList = this.A01;
        arrayList.clear();
        arrayList.addAll(list);
    }
}
