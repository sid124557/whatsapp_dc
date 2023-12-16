package com.whatsapp.reactions;

import X.AnonymousClass107;
import X.AnonymousClass2W8;
import X.AnonymousClass34R;
import X.AnonymousClass35S;
import X.AnonymousClass4FP;
import X.AnonymousClass4FS;
import X.AnonymousClass4L0;
import X.AnonymousClass4Qc;
import X.AnonymousClass4UX;
import X.AnonymousClass5OD;
import X.AnonymousClass5T2;
import X.AnonymousClass5UX;
import X.AnonymousClass5ZU;
import X.AnonymousClass64B;
import X.AnonymousClass6C6;
import X.AnonymousClass931;
import X.C06560Yg;
import X.C08310eF;
import X.C100385As;
import X.C100485Bc;
import X.C110695gs;
import X.C110765h0;
import X.C111095hX;
import X.C147197De;
import X.C187908y0;
import X.C1896992h;
import X.C27991fJ;
import X.C33141sV;
import X.C50632iV;
import X.C55832qz;
import X.C56892sj;
import X.C56942so;
import X.C56972sr;
import X.C56982ss;
import X.C613330g;
import X.C620733j;
import X.C621033m;
import X.C627336j;
import X.C64773Ex;
import X.C69263Wi;
import X.C70033Zp;
import X.C70133a0;
import X.C72173dI;
import X.C86604Kt;
import X.C86614Ku;
import X.C86644Kx;
import X.C86664Kz;
import X.C89064bQ;
import X.C95814uZ;
import android.app.Dialog;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.R;
import com.whatsapp.WaTabLayout;
import com.whatsapp.WaViewPager;

public class ReactionsBottomSheetDialogFragment extends Hilt_ReactionsBottomSheetDialogFragment implements AnonymousClass64B {
    public C187908y0 A00 = new C1896992h(this, 1);
    public C111095hX A01;
    public C69263Wi A02;
    public C56972sr A03;
    public C621033m A04;
    public WaTabLayout A05;
    public WaViewPager A06;
    public AnonymousClass4FP A07;
    public C56942so A08;
    public AnonymousClass5UX A09;
    public C64773Ex A0A;
    public AnonymousClass5ZU A0B;
    public C613330g A0C;
    public C147197De A0D;
    public C620733j A0E;
    public C50632iV A0F;
    public C56982ss A0G;
    public C56892sj A0H;
    public AnonymousClass2W8 A0I;
    public C95814uZ A0J;
    public C89064bQ A0K;
    public C55832qz A0L;
    public C33141sV A0M;
    public C72173dI A0N;
    public AnonymousClass4FS A0O;
    public boolean A0P;

    public static /* synthetic */ void A00(AnonymousClass5T2 r2, ReactionsBottomSheetDialogFragment reactionsBottomSheetDialogFragment) {
        int A0O2;
        if (r2.A00 >= reactionsBottomSheetDialogFragment.A0K.A0C()) {
            A0O2 = 0;
        } else {
            A0O2 = reactionsBottomSheetDialogFragment.A06.A0O(r2.A00);
        }
        reactionsBottomSheetDialogFragment.A06.A0P(A0O2);
    }

    public void A0w(Bundle bundle, View view) {
        C27991fJ A012;
        View view2 = view;
        super.A0w(bundle, view2);
        C06560Yg.A02(view2, R.id.reactions_bottom_sheet_handle).setVisibility(C86614Ku.A01(A1Y() ? 1 : 0));
        if (A1Y()) {
            view2.setBackground((Drawable) null);
        } else {
            Window window = A1I().getWindow();
            if (window != null) {
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.dimAmount = 0.3f;
                window.setAttributes(attributes);
            }
        }
        C56982ss r8 = this.A0G;
        C621033m r6 = this.A04;
        C55832qz r10 = this.A0L;
        C33141sV r11 = this.A0M;
        AnonymousClass4UX r12 = (AnonymousClass4UX) AnonymousClass4L0.A0F(new C110695gs(r6, this.A07, r8, this.A0J, r10, r11, this.A0P), this).A01(AnonymousClass4UX.class);
        this.A05 = (WaTabLayout) C06560Yg.A02(view2, R.id.reactions_bottom_sheet_tab_layout);
        this.A06 = (WaViewPager) C06560Yg.A02(view2, R.id.reactions_bottom_sheet_view_pager);
        C72173dI r13 = new C72173dI(this.A0O, false);
        this.A0N = r13;
        C69263Wi r5 = this.A02;
        C56972sr r62 = this.A03;
        AnonymousClass5UX r7 = this.A09;
        C64773Ex r82 = this.A0A;
        AnonymousClass5ZU r9 = this.A0B;
        C620733j r112 = this.A0E;
        C89064bQ r2 = new C89064bQ(A0G(), A0V(), r5, r62, r7, r82, r9, this.A0C, r112, r12, r13);
        this.A0K = r2;
        this.A06.setAdapter(r2);
        this.A06.A0H(new AnonymousClass931(1), false);
        this.A06.A0G(new C110765h0(this.A05));
        this.A05.post(new C70033Zp(this, 18));
        AnonymousClass107 r63 = r12.A06;
        C100385As.A01(A0V(), r63, r12, this, 22);
        LayoutInflater from = LayoutInflater.from(A1D());
        C100385As.A01(A0V(), r12.A03.A02, from, this, 23);
        for (AnonymousClass5OD r4 : C86644Kx.A0h(r63)) {
            r4.A02.A0B(A0V(), new C100485Bc(r4, from, this, 4));
        }
        C86604Kt.A1N(A0V(), r63, this, 323);
        AnonymousClass6C6.A02(A0V(), r12.A07, this, 278);
        AnonymousClass6C6.A02(A0V(), r12.A08, this, 279);
        C95814uZ r1 = this.A0J;
        if (C627336j.A0K(r1) && (A012 = AnonymousClass34R.A01(r1)) != null && this.A0G.A06(A012) == 3) {
            C70133a0.A01(this.A0O, this, A012, 47);
        }
    }

    public final void A1a(View view, int i) {
        AnonymousClass5T2 A0J2 = this.A05.A0J(i);
        if (A0J2 == null) {
            AnonymousClass5T2 A042 = this.A05.A04();
            A042.A01 = view;
            AnonymousClass4Qc r0 = A042.A02;
            if (r0 != null) {
                r0.A02();
            }
            WaTabLayout waTabLayout = this.A05;
            waTabLayout.A0F(A042, waTabLayout.A0I(i, true), waTabLayout.A0k.isEmpty());
            return;
        }
        A0J2.A01 = null;
        AnonymousClass4Qc r02 = A0J2.A02;
        if (r02 != null) {
            r02.A02();
        }
        A0J2.A01 = view;
        AnonymousClass4Qc r03 = A0J2.A02;
        if (r03 != null) {
            r03.A02();
        }
    }

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C86664Kz.A0h(layoutInflater, viewGroup, R.layout.f8nameremoved);
    }

    public Dialog A1J(Bundle bundle) {
        Dialog A1J = super.A1J(bundle);
        Window window = A1J.getWindow();
        if (window != null) {
            window.setFlags(AnonymousClass35S.A0F, AnonymousClass35S.A0F);
        }
        return A1J;
    }

    public void A1X(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = C08310eF.A09(this).getDimensionPixelSize(R.dimen.f6nameremoved);
        view.setLayoutParams(layoutParams);
        BottomSheetBehavior A012 = BottomSheetBehavior.A01(view);
        A012.A0U(layoutParams.height, false);
        A012.A0S(3);
    }
}
