package com.whatsapp.businessdirectory.view.fragment;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass08A;
import X.AnonymousClass08M;
import X.AnonymousClass0XV;
import X.AnonymousClass0x9;
import X.AnonymousClass4CX;
import X.AnonymousClass4UC;
import X.AnonymousClass5MB;
import X.AnonymousClass5ZO;
import X.AnonymousClass6C6;
import X.AnonymousClass6Hn;
import X.AnonymousClass7KT;
import X.AnonymousClass7Vq;
import X.C003203q;
import X.C08310eF;
import X.C105085Tn;
import X.C105355Up;
import X.C105375Ur;
import X.C105895Wv;
import X.C111545iG;
import X.C112225jO;
import X.C112345ja;
import X.C1228666d;
import X.C135796lG;
import X.C15910sA;
import X.C166447yh;
import X.C181958nd;
import X.C18270x1;
import X.C18280x3;
import X.C185638u0;
import X.C50382i5;
import X.C53602nM;
import X.C86604Kt;
import X.C86654Ky;
import X.C88074Xf;
import X.C96254w4;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.businessdirectory.util.DirectoryGPSLocationManager;
import com.whatsapp.businessdirectory.util.LocationUpdateListener;
import com.whatsapp.businessdirectory.view.activity.BusinessDirectoryActivity;
import com.whatsapp.businessdirectory.view.custom.FilterBottomSheetDialogFragment;
import com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class BusinessDirectoryContextualSearchFragment extends Hilt_BusinessDirectoryContextualSearchFragment implements C185638u0, C1228666d, AnonymousClass4CX {
    public AnonymousClass5MB A00;
    public C50382i5 A01;
    public C111545iG A02;
    public AnonymousClass7Vq A03;
    public C181958nd A04;
    public DirectoryGPSLocationManager A05;
    public LocationUpdateListener A06;
    public C96254w4 A07;
    public C112345ja A08;
    public BusinessDirectoryContextualSearchViewModel A09;
    public C53602nM A0A;
    public C105355Up A0B;
    public C88074Xf A0C;
    public C105895Wv A0D;

    public void A0r(Bundle bundle) {
        this.A0X = true;
        A1I().A06 = this;
        C08310eF A0D2 = A0T().A0D("filter-bottom-sheet");
        if (A0D2 != null) {
            ((FilterBottomSheetDialogFragment) A0D2).A02 = this;
        }
        this.A08.A00();
    }

    public void A0q(Bundle bundle) {
        BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel = this.A09;
        AnonymousClass0XV r2 = businessDirectoryContextualSearchViewModel.A0I;
        r2.A06("saved_search_session_started", Boolean.valueOf(businessDirectoryContextualSearchViewModel.A08));
        r2.A06("saved_search_state", Integer.valueOf(businessDirectoryContextualSearchViewModel.A04));
        r2.A06("saved_search_query", businessDirectoryContextualSearchViewModel.A0F());
        r2.A06("search_context_category", businessDirectoryContextualSearchViewModel.A05);
        businessDirectoryContextualSearchViewModel.A0Y.A0A(r2);
        r2.A06("SEARCH_CONTEXT_CATEGORY_EXISTS", Boolean.valueOf(AnonymousClass000.A1W(businessDirectoryContextualSearchViewModel.A05)));
        r2.A06("saved_state_query_id", businessDirectoryContextualSearchViewModel.A0L.A00);
    }

    public void B3A() {
        this.A09.A0a.A00.A0K();
    }

    public void BNl() {
        this.A09.A0P(62);
    }

    public void BSP() {
        this.A09.A0a.A04();
    }

    public void BVl() {
        C112225jO r2 = this.A09.A0a;
        r2.A08.A02(true);
        r2.A00.A0K();
    }

    public void BVp() {
        this.A09.A0a.A05();
    }

    public void BVq() {
        this.A09.BVr();
    }

    public void BVs(AnonymousClass7KT r2) {
        this.A09.A0a.A08(r2);
    }

    public void BWo(Set set) {
        BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel = this.A09;
        C105375Ur r0 = businessDirectoryContextualSearchViewModel.A0Y;
        r0.A01 = set;
        businessDirectoryContextualSearchViewModel.A0N.A03((Boolean) null, C105085Tn.A00(businessDirectoryContextualSearchViewModel), r0.A06(), 46);
        String A0F = businessDirectoryContextualSearchViewModel.A0F();
        if (A0F == null) {
            A0F = "";
        }
        businessDirectoryContextualSearchViewModel.A0X(A0F, 1);
        this.A09.A0P(64);
    }

    public void BY6(AnonymousClass5ZO r3) {
        this.A09.BOv(0);
    }

    public void BaZ() {
        this.A09.A0a.A00.A0K();
    }

    public void Brw() {
        this.A09.A0a.A06();
    }

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass08M r3;
        View A0R = AnonymousClass001.A0R(layoutInflater, viewGroup, R.layout.f8nameremoved);
        RecyclerView A0P = C86654Ky.A0P(A0R, R.id.contextual_search_list);
        A1D();
        C18270x1.A0u(A0P);
        A0P.setAdapter(this.A07);
        this.A07.BiZ(new AnonymousClass6Hn(A0P, this));
        C135796lG r0 = new C135796lG(this);
        this.A0C = r0;
        A0P.A0q(r0);
        boolean A052 = this.A0B.A05();
        AnonymousClass08A r1 = this.A0L;
        if (A052) {
            r1.A00(this.A05);
            DirectoryGPSLocationManager directoryGPSLocationManager = this.A05;
            directoryGPSLocationManager.A02 = C18280x3.A0S();
            r3 = directoryGPSLocationManager.A05;
        } else {
            r1.A00(this.A06);
            r3 = this.A06.A00;
        }
        C15910sA A0V = A0V();
        C112345ja r12 = this.A08;
        Objects.requireNonNull(r12);
        C86604Kt.A1N(A0V, r3, r12, 90);
        C86604Kt.A1N(A0V(), this.A09.A0G, this, 93);
        C86604Kt.A1N(A0V(), this.A09.A0H, this, 94);
        C86604Kt.A1N(A0V(), this.A09.A0E, this, 95);
        AnonymousClass6C6.A02(A0V(), this.A09.A0g, this, 40);
        C86604Kt.A1N(A0V(), this.A09.A0h, this, 96);
        C86604Kt.A1N(A0V(), this.A09.A0F, this, 95);
        AnonymousClass6C6.A02(A0V(), this.A09.A0j, this, 41);
        C86604Kt.A1N(A0V(), this.A09.A0i, this, 97);
        AnonymousClass4UC r32 = this.A09.A0f;
        C15910sA A0V2 = A0V();
        C112345ja r13 = this.A08;
        Objects.requireNonNull(r13);
        AnonymousClass6C6.A02(A0V2, r32, r13, 39);
        return A0R;
    }

    public void A0a() {
        super.A0a();
        if (equals(A1I().A06)) {
            A1I().A06 = null;
        }
        this.A03.A01(this.A08);
        C003203q A0Q = A0Q();
        if (A0Q == null || A0Q.isFinishing()) {
            this.A09.A0T.A00();
        }
    }

    public void A0f() {
        super.A0f();
        BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel = this.A09;
        int i = businessDirectoryContextualSearchViewModel.A04;
        int i2 = 1;
        C111545iG r2 = businessDirectoryContextualSearchViewModel.A0N;
        if (i == 1) {
            i2 = 2;
        }
        r2.A09(C105085Tn.A00(businessDirectoryContextualSearchViewModel), (Integer) null, (Map) null, i2, i2, 0);
    }

    public void A0p(Bundle bundle) {
        super.A0p(bundle);
        this.A05 = this.A04.Azx(this.A02, (String) null);
        this.A09 = (BusinessDirectoryContextualSearchViewModel) AnonymousClass0x9.A0H(this).A01(BusinessDirectoryContextualSearchViewModel.class);
        C112345ja A002 = this.A00.A00(this, this.A05, this.A06, this);
        this.A08 = A002;
        this.A03.A00(A002);
        Bundle bundle2 = this.A06;
        if (bundle2 != null && (bundle2.getParcelable("SEARCH_CONTEXT_CATEGORY") instanceof C166447yh)) {
            C166447yh r5 = (C166447yh) this.A06.getParcelable("SEARCH_CONTEXT_CATEGORY");
            BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel = this.A09;
            AnonymousClass0XV r3 = businessDirectoryContextualSearchViewModel.A0I;
            if (!(!r3.A03.containsKey("search_context_category"))) {
                r5 = (C166447yh) r3.A04("search_context_category");
            }
            businessDirectoryContextualSearchViewModel.A05 = r5;
            if (r5 != null) {
                businessDirectoryContextualSearchViewModel.A0Y.A01 = C18280x3.A0h(new C166447yh[]{r5});
            }
        }
    }

    public void A1G(Context context) {
        super.A1G(context);
        A1I().A06 = this;
    }

    public final BusinessDirectoryActivity A1I() {
        if (A0R() instanceof BusinessDirectoryActivity) {
            return (BusinessDirectoryActivity) A0R();
        }
        throw AnonymousClass001.A0e("BusinessDirectorySearchFragment should be attached to BusinessDirectoryActivity");
    }
}
