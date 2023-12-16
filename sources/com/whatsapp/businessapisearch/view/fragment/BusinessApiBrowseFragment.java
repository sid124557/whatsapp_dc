package com.whatsapp.businessapisearch.view.fragment;

import X.AnonymousClass001;
import X.AnonymousClass0R6;
import X.AnonymousClass4U0;
import X.AnonymousClass5MC;
import X.AnonymousClass5ML;
import X.AnonymousClass5N9;
import X.AnonymousClass7KR;
import X.C003203q;
import X.C08310eF;
import X.C1001359q;
import X.C104795Sj;
import X.C107695bk;
import X.C118055sv;
import X.C121275zx;
import X.C146867Bx;
import X.C162457s7;
import X.C166447yh;
import X.C18270x1;
import X.C18310x6;
import X.C188758zR;
import X.C69773Yi;
import X.C86604Kt;
import X.C86654Ky;
import X.C88074Xf;
import X.C96244w3;
import X.C96264w5;
import android.app.Application;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.businessapisearch.view.activity.BusinessApiSearchActivity;

public final class BusinessApiBrowseFragment extends Hilt_BusinessApiBrowseFragment {
    public static String A07 = "search_by_category";
    public static AnonymousClass4U0 A08;
    public static C166447yh A09;
    public static C88074Xf A0A;
    public RecyclerView A00;
    public C146867Bx A01;
    public AnonymousClass5ML A02;
    public C96244w3 A03;
    public C104795Sj A04;
    public AnonymousClass5N9 A05;
    public String A06;

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C162457s7.A0J(layoutInflater, 0);
        View A0I = C18310x6.A0I(layoutInflater, viewGroup, R.layout.f8nameremoved, false);
        RecyclerView A0P = C86654Ky.A0P(A0I, R.id.home_list);
        this.A00 = A0P;
        String str = null;
        if (A0P != null) {
            A0P.getContext();
            C18270x1.A0u(A0P);
            C96244w3 r0 = this.A03;
            if (r0 != null) {
                A0P.setAdapter(r0);
                if (A09 != null) {
                    if ("search_by_category".equals(A07)) {
                        C96264w5 r02 = new C96264w5();
                        A0A = r02;
                        A0P.A0q(r02);
                    }
                    BusinessApiSearchActivity A1I = A1I();
                    C166447yh r03 = A09;
                    if (r03 != null) {
                        str = r03.A01;
                    }
                    A1I.setTitle(str);
                } else {
                    A1I().setTitle(C08310eF.A09(this).getString(R.string.f11nameremoved));
                }
            } else {
                throw C18270x1.A0S("listAdapter");
            }
        }
        AnonymousClass4U0 r04 = A08;
        if (r04 == null) {
            throw C18270x1.A0S("viewModel");
        }
        C86604Kt.A1N(A0V(), r04.A02, new C121275zx(this), 65);
        AnonymousClass4U0 r05 = A08;
        if (r05 == null) {
            throw C18270x1.A0S("viewModel");
        }
        C86604Kt.A1N(A0V(), r05.A0A, C1001359q.A00(this, 10), 66);
        AnonymousClass4U0 r06 = A08;
        if (r06 == null) {
            throw C18270x1.A0S("viewModel");
        }
        C86604Kt.A1N(A0V(), r06.A06.A02, C1001359q.A00(this, 11), 67);
        A1I().A05.A01(new C188758zR(this, 0), A0V());
        A1I().A75();
        return A0I;
    }

    public void A0p(Bundle bundle) {
        C166447yh r0;
        String string;
        Bundle bundle2 = this.A06;
        String str = null;
        if (bundle2 != null) {
            r0 = (C166447yh) bundle2.getParcelable("INITIAL_API_CATEGORY");
        } else {
            r0 = null;
        }
        A09 = r0;
        Bundle bundle3 = this.A06;
        if (bundle3 != null) {
            str = bundle3.getString("ENTRYPOINT_TYPE");
        }
        this.A06 = str;
        Bundle bundle4 = this.A06;
        if (!(bundle4 == null || (string = bundle4.getString("API_BIZ_SEARCH_USE_CASE")) == null)) {
            A07 = string;
        }
        C146867Bx r1 = this.A01;
        if (r1 != null) {
            String str2 = this.A06;
            C166447yh r8 = A09;
            String str3 = A07;
            Application A002 = C69773Yi.A00(r1.A00.A04.AdE);
            C118055sv r2 = r1.A00;
            C107695bk r12 = r2.A04.A00;
            AnonymousClass4U0 r22 = new AnonymousClass4U0(A002, (AnonymousClass5MC) r12.A4Y.get(), (AnonymousClass5ML) r12.A1U.get(), r12.AJc(), new AnonymousClass7KR(r2.A03.A18.ABY()), r8, (C104795Sj) r12.A1T.get(), str2, str3);
            A08 = r22;
            r22.A0E(A09);
            super.A0p(bundle);
            return;
        }
        throw C18270x1.A0S("viewModelFactory");
    }

    public void A0a() {
        super.A0a();
        this.A00 = null;
    }

    public void A0c() {
        super.A0c();
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null) {
            C88074Xf r0 = A0A;
            if (r0 != null) {
                recyclerView.A0r(r0);
            }
            C88074Xf r1 = A0A;
            if (r1 != null) {
                RecyclerView recyclerView2 = this.A00;
                C162457s7.A0H(recyclerView2);
                recyclerView2.A0r(r1);
            }
            RecyclerView recyclerView3 = this.A00;
            C162457s7.A0H(recyclerView3);
            recyclerView3.setAdapter((AnonymousClass0R6) null);
            this.A00 = null;
        }
    }

    public final BusinessApiSearchActivity A1I() {
        if (A0R() instanceof BusinessApiSearchActivity) {
            C003203q A0R = A0R();
            C162457s7.A0K(A0R, "null cannot be cast to non-null type com.whatsapp.businessapisearch.view.activity.BusinessApiSearchActivity");
            return (BusinessApiSearchActivity) A0R;
        }
        throw AnonymousClass001.A0e("BusinessApiBrowseFragment should be attached to BusinessApiSearchActivity");
    }
}
