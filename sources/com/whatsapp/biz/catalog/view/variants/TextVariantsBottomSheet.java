package com.whatsapp.biz.catalog.view.variants;

import X.AnonymousClass000;
import X.AnonymousClass0XL;
import X.AnonymousClass0x9;
import X.AnonymousClass5Vo;
import X.AnonymousClass746;
import X.AnonymousClass7CR;
import X.AnonymousClass7PH;
import X.AnonymousClass7RX;
import X.C002002f;
import X.C05630Ug;
import X.C06560Yg;
import X.C08310eF;
import X.C107385bE;
import X.C109685f1;
import X.C125206Gt;
import X.C125266Hd;
import X.C139816sf;
import X.C1448373d;
import X.C162457s7;
import X.C165977xw;
import X.C166107y9;
import X.C175388Ye;
import X.C18270x1;
import X.C18300x5;
import X.C1897192j;
import X.C620733j;
import X.C817640z;
import X.C86604Kt;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.R;

public final class TextVariantsBottomSheet extends Hilt_TextVariantsBottomSheet {
    public RecyclerView A00;
    public AnonymousClass7CR A01;
    public AnonymousClass7RX A02;
    public C125206Gt A03;
    public C620733j A04;

    public void A0w(Bundle bundle, View view) {
        Parcelable parcelable;
        String str;
        Parcelable parcelable2;
        Bundle bundle2;
        C162457s7.A0J(view, 0);
        super.A0w(bundle, view);
        ImageView A0E = AnonymousClass0x9.A0E(view, R.id.text_variants_selection_dismiss);
        Bundle bundle3 = this.A06;
        if (bundle3 == null || !bundle3.getBoolean("USE_BACK_ARROW_FOR_CLOSE_ARG")) {
            A0E.setImageResource(R.drawable.ic_close);
            A0E.setContentDescription(C08310eF.A09(this).getString(R.string.f11nameremoved));
        } else {
            A0E.setImageResource(R.drawable.ic_back);
            A0E.setContentDescription(C08310eF.A09(this).getString(R.string.f11nameremoved));
            C620733j r0 = this.A04;
            if (r0 != null && r0.A0U()) {
                A0E.setScaleX(-1.0f);
            }
        }
        A0E.setOnClickListener(new C109685f1((Object) this, 39));
        boolean A0A = C107385bE.A0A();
        C125266Hd r6 = null;
        Bundle bundle4 = this.A06;
        if (A0A) {
            if (bundle4 != null) {
                parcelable = (Parcelable) bundle4.getParcelable("TEXT_OPTIONS_DATA", C166107y9.class);
            }
            parcelable = null;
        } else {
            if (bundle4 != null) {
                parcelable = bundle4.getParcelable("TEXT_OPTIONS_DATA");
            }
            parcelable = null;
        }
        C166107y9 r10 = (C166107y9) parcelable;
        TextView A0G = C18300x5.A0G(view, R.id.variants_screen_title);
        Object[] objArr = new Object[1];
        if (r10 != null) {
            str = r10.A00;
        } else {
            str = "";
        }
        objArr[0] = str;
        A0G.setText(C08310eF.A09(this).getString(R.string.f11nameremoved, objArr));
        C125206Gt r02 = this.A03;
        if (r02 == null) {
            throw C18270x1.A0S("viewModel");
        }
        Number number = (Number) r02.A00.A07();
        if (number == null && ((bundle2 = this.A06) == null || (number = Integer.valueOf(bundle2.getInt("START_WITH_SELECTION_ARG"))) == null)) {
            number = 0;
        }
        int intValue = number.intValue();
        boolean A0A2 = C107385bE.A0A();
        Bundle bundle5 = this.A06;
        if (A0A2) {
            if (bundle5 != null) {
                parcelable2 = (Parcelable) bundle5.getParcelable("OTHER_OPTION_SELECTED_ARG", C165977xw.class);
            }
            parcelable2 = null;
        } else {
            if (bundle5 != null) {
                parcelable2 = bundle5.getParcelable("OTHER_OPTION_SELECTED_ARG");
            }
            parcelable2 = null;
        }
        C165977xw r7 = (C165977xw) parcelable2;
        RecyclerView recyclerView = (RecyclerView) C06560Yg.A02(view, R.id.text_variants_list);
        if (!(r10 == null || this.A01 == null)) {
            C125206Gt r1 = this.A03;
            if (r1 == null) {
                throw C18270x1.A0S("viewModel");
            }
            r6 = new C125266Hd(r7, new C1448373d(), new C1897192j(r1, 0), r10, intValue);
        }
        recyclerView.setAdapter(r6);
        this.A00 = recyclerView;
        View view2 = view;
        while (true) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (layoutParams instanceof C002002f) {
                C05630Ug r3 = ((C002002f) layoutParams).A0A;
                if (r3 instanceof BottomSheetBehavior) {
                    ((BottomSheetBehavior) r3).A0F = AnonymousClass000.A0B(A0G()).heightPixels - C08310eF.A09(this).getDimensionPixelSize(R.dimen.f6nameremoved);
                    break;
                }
            }
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                view2 = (View) parent;
                if (view2 == null) {
                    break;
                }
            } else {
                break;
            }
        }
        C125206Gt r03 = this.A03;
        if (r03 == null) {
            throw C18270x1.A0S("viewModel");
        }
        C86604Kt.A1N(A0V(), r03.A00, new AnonymousClass746(this, 1), 28);
        C125206Gt r04 = this.A03;
        if (r04 == null) {
            throw C18270x1.A0S("viewModel");
        }
        C86604Kt.A1N(A0V(), r04.A02, new C175388Ye(view, this), 29);
    }

    public void A1W(AnonymousClass5Vo r4) {
        C162457s7.A0J(r4, 0);
        AnonymousClass7PH r2 = r4.A00;
        r2.A06 = false;
        r2.A04 = new C139816sf(C817640z.A00);
    }

    public void A0p(Bundle bundle) {
        super.A0p(bundle);
        this.A03 = (C125206Gt) new AnonymousClass0XL(this).A01(C125206Gt.class);
    }

    public int A1S() {
        return R.layout.f8nameremoved;
    }
}
