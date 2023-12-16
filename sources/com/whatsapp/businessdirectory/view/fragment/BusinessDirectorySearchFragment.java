package com.whatsapp.businessdirectory.view.fragment;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass08A;
import X.AnonymousClass08M;
import X.AnonymousClass0N7;
import X.AnonymousClass0O1;
import X.AnonymousClass0R6;
import X.AnonymousClass0XV;
import X.AnonymousClass4CX;
import X.AnonymousClass4L0;
import X.AnonymousClass4U5;
import X.AnonymousClass4UC;
import X.AnonymousClass4w0;
import X.AnonymousClass5F0;
import X.AnonymousClass5MB;
import X.AnonymousClass5ZO;
import X.AnonymousClass5ZR;
import X.AnonymousClass6C6;
import X.AnonymousClass7KT;
import X.AnonymousClass7Vq;
import X.C003203q;
import X.C003403v;
import X.C06270Wx;
import X.C06560Yg;
import X.C08310eF;
import X.C105355Up;
import X.C105375Ur;
import X.C107595bZ;
import X.C111545iG;
import X.C112225jO;
import X.C112345ja;
import X.C1228666d;
import X.C15510rU;
import X.C15910sA;
import X.C166447yh;
import X.C181958nd;
import X.C18290x4;
import X.C185638u0;
import X.C188758zR;
import X.C50382i5;
import X.C53602nM;
import X.C620733j;
import X.C86604Kt;
import X.C86654Ky;
import X.C87554Tj;
import X.C88074Xf;
import X.C96254w4;
import X.C96274w6;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.chip.Chip;
import com.whatsapp.R;
import com.whatsapp.businessdirectory.util.DirectoryGPSLocationManager;
import com.whatsapp.businessdirectory.util.LocationUpdateListener;
import com.whatsapp.businessdirectory.view.activity.BusinessDirectoryActivity;
import com.whatsapp.businessdirectory.view.custom.FilterBottomSheetDialogFragment;
import com.whatsapp.jid.Jid;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class BusinessDirectorySearchFragment extends Hilt_BusinessDirectorySearchFragment implements C185638u0, C1228666d, AnonymousClass4CX {
    public RecyclerView A00;
    public Chip A01;
    public AnonymousClass5MB A02;
    public AnonymousClass5F0 A03;
    public C50382i5 A04;
    public C111545iG A05;
    public AnonymousClass4w0 A06;
    public AnonymousClass7Vq A07;
    public C181958nd A08;
    public DirectoryGPSLocationManager A09;
    public LocationUpdateListener A0A;
    public C96254w4 A0B;
    public C112345ja A0C;
    public AnonymousClass4U5 A0D;
    public C53602nM A0E;
    public AnonymousClass5ZR A0F;
    public C620733j A0G;
    public C105355Up A0H;
    public C88074Xf A0I;
    public final AnonymousClass0N7 A0J = new C188758zR(this, 1);
    public final AnonymousClass0O1 A0K = Bid(new C107595bZ(this, 1), new C003403v());

    public static BusinessDirectorySearchFragment A00() {
        BusinessDirectorySearchFragment businessDirectorySearchFragment = new BusinessDirectorySearchFragment();
        Bundle A082 = AnonymousClass002.A08();
        A082.putBoolean("FORCE_ROOT_CATEGORIES", true);
        businessDirectorySearchFragment.A0u(A082);
        return businessDirectorySearchFragment;
    }

    public void A0p(Bundle bundle) {
        super.A0p(bundle);
        this.A09 = this.A08.Azx(this.A05, (String) null);
        boolean z = A1I().A0D;
        boolean z2 = A0H().getBoolean("FORCE_ROOT_CATEGORIES");
        String string = A0H().getString("argument_business_list_search_state");
        this.A0D = (AnonymousClass4U5) AnonymousClass4L0.A0F(new C87554Tj(bundle, this, this.A03, (C166447yh) A0H().getParcelable("INITIAL_CATEGORY"), (Jid) A0H().getParcelable("directory_biz_chaining_jid"), string, z2, z), this).A01(AnonymousClass4U5.class);
        C112345ja A002 = this.A02.A00(this, this.A09, this.A0A, this);
        this.A0C = A002;
        this.A07.A00(A002);
    }

    public void A0r(Bundle bundle) {
        this.A0X = true;
        C08310eF A0D2 = A0T().A0D("filter-bottom-sheet");
        if (A0D2 != null) {
            ((FilterBottomSheetDialogFragment) A0D2).A02 = this;
        }
        this.A0C.A00();
    }

    public void A0q(Bundle bundle) {
        AnonymousClass4U5 r3 = this.A0D;
        AnonymousClass0XV r2 = r3.A0D;
        r2.A06("saved_search_state_stack", AnonymousClass002.A0J(r3.A05));
        r2.A06("saved_second_level_category", r3.A0W.A07());
        r2.A06("saved_parent_category", r3.A0V.A07());
        r2.A06("saved_search_state", Integer.valueOf(r3.A02));
        r2.A06("saved_force_root_category", Boolean.valueOf(r3.A06));
        r2.A06("saved_consumer_home_type", Integer.valueOf(r3.A01));
        r3.A0N.A0A(r2);
    }

    public void B3A() {
        this.A0D.A0Q.A00.A0K();
    }

    public void BNl() {
        this.A0D.A0P(62);
    }

    public void BSP() {
        this.A0D.A0Q.A04();
    }

    public void BVl() {
        C112225jO r2 = this.A0D.A0Q;
        r2.A08.A02(true);
        r2.A00.A0K();
    }

    public void BVp() {
        this.A0D.A0Q.A05();
    }

    public void BVq() {
        this.A0D.BVr();
    }

    public void BVs(AnonymousClass7KT r2) {
        this.A0D.A0Q.A08(r2);
    }

    public void BWo(Set set) {
        AnonymousClass4U5 r5 = this.A0D;
        C105375Ur r0 = r5.A0N;
        r0.A01 = set;
        r5.A0G.A03((Boolean) null, AnonymousClass4U5.A00(r5), r0.A06(), 46);
        r5.A0M();
        this.A0D.A0P(64);
    }

    public void BY6(AnonymousClass5ZO r3) {
        this.A0D.BOv(0);
    }

    public void BaZ() {
        this.A0D.A0Q.A00.A0K();
    }

    public void Brw() {
        this.A0D.A0Q.A06();
    }

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass08M r4;
        View A0R = AnonymousClass001.A0R(layoutInflater, viewGroup, R.layout.f8nameremoved);
        this.A00 = C86654Ky.A0P(A0R, R.id.search_list);
        this.A01 = (Chip) C06560Yg.A02(A0R, R.id.update_results_chip);
        A1D();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
        this.A0I = new C96274w6(this);
        this.A00.setLayoutManager(linearLayoutManager);
        this.A00.A0q(this.A0I);
        this.A00.setAdapter(this.A0B);
        boolean A052 = this.A0H.A05();
        AnonymousClass08A r1 = this.A0L;
        if (A052) {
            r1.A00(this.A09);
            DirectoryGPSLocationManager directoryGPSLocationManager = this.A09;
            directoryGPSLocationManager.A02 = C18290x4.A0a();
            r4 = directoryGPSLocationManager.A05;
        } else {
            r1.A00(this.A0A);
            r4 = this.A0A.A00;
        }
        C15910sA A0V = A0V();
        C112345ja r12 = this.A0C;
        Objects.requireNonNull(r12);
        C86604Kt.A1N(A0V, r4, r12, 90);
        AnonymousClass6C6.A02(A0V(), this.A0D.A0Y, this, 42);
        AnonymousClass4UC r42 = this.A0D.A0T;
        C15910sA A0V2 = A0V();
        C112345ja r13 = this.A0C;
        Objects.requireNonNull(r13);
        AnonymousClass6C6.A02(A0V2, r42, r13, 39);
        C86604Kt.A1N(A0V(), this.A0D.A0C, this, 98);
        AnonymousClass6C6.A02(A0V(), this.A0D.A0U, this, 43);
        C86604Kt.A1N(A0V(), this.A0D.A08, this, 99);
        C86604Kt.A1N(A0V(), this.A0D.A0X, this, 100);
        C86604Kt.A1N(A0V(), this.A0D.A0B, this, 101);
        A0R().A05.A01(this.A0J, A0V());
        C18290x4.A1H(this.A01, this, 43);
        AnonymousClass4U5 r2 = this.A0D;
        if (r2.A0Q.A00.A00 != 4) {
            C06270Wx.A04(r2.A0Y, 0);
        }
        return A0R;
    }

    public void A0a() {
        super.A0a();
        this.A07.A01(this.A0C);
        Iterator it = this.A0J.A00.iterator();
        while (it.hasNext()) {
            ((C15510rU) it.next()).cancel();
        }
        C003203q A0Q = A0Q();
        if (A0Q == null || A0Q.isFinishing()) {
            this.A0D.A0K.A00();
        }
    }

    public void A0c() {
        super.A0c();
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null) {
            recyclerView.A0r(this.A0I);
            this.A00.setAdapter((AnonymousClass0R6) null);
            this.A00 = null;
        }
    }

    public void A0f() {
        AnonymousClass5ZO r0;
        super.A0f();
        AnonymousClass4U5 r2 = this.A0D;
        r2.A0L();
        Iterator it = r2.A0Z.iterator();
        if (it.hasNext()) {
            it.next();
            throw AnonymousClass001.A0g("isVisibilityChanged");
        }
        C112225jO r1 = r2.A0Q;
        if (r1.A0A() && (r0 = r1.A00.A01) != null && !r0.equals(r0)) {
            r1.A06();
        }
    }

    public final BusinessDirectoryActivity A1I() {
        if (A0R() instanceof BusinessDirectoryActivity) {
            return (BusinessDirectoryActivity) A0R();
        }
        throw AnonymousClass001.A0e("BusinessDirectorySearchFragment should be attached to BusinessDirectoryActivity");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0060, code lost:
        r2.setTitle(X.C08310eF.A09(r3).getString(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        A0R().setTitle(r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1J(java.lang.String r4) {
        /*
            r3 = this;
            int r0 = r4.hashCode()
            switch(r0) {
                case -1126816384: goto L_0x0051;
                case 23561082: goto L_0x0041;
                case 1014375387: goto L_0x002e;
                case 2044323616: goto L_0x000f;
                default: goto L_0x0007;
            }
        L_0x0007:
            X.03q r0 = r3.A0R()
            r0.setTitle(r4)
        L_0x000e:
            return
        L_0x000f:
            java.lang.String r0 = "business_chaining"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0007
            android.os.Bundle r1 = r3.A0H()
            java.lang.String r0 = "directory_biz_chaining_name"
            java.lang.String r1 = r1.getString(r0)
            if (r1 == 0) goto L_0x000e
            r0 = 2131886721(0x7f120281, float:1.9408029E38)
            java.lang.String r0 = X.C18310x6.A0m(r3, r1, r0)
            r3.A1J(r0)
            return
        L_0x002e:
            java.lang.String r0 = "product_name"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0007
            com.whatsapp.businessdirectory.view.activity.BusinessDirectoryActivity r1 = r3.A1I()
            r0 = 2131886738(0x7f120292, float:1.9408063E38)
            r1.setTitle(r0)
            return
        L_0x0041:
            java.lang.String r0 = "all_categories"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0007
            X.03q r2 = r3.A0R()
            r1 = 2131886665(0x7f120249, float:1.9407915E38)
            goto L_0x0060
        L_0x0051:
            java.lang.String r0 = "nearby_business"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0007
            X.03q r2 = r3.A0R()
            r1 = 2131886695(0x7f120267, float:1.9407976E38)
        L_0x0060:
            android.content.res.Resources r0 = X.C08310eF.A09(r3)
            java.lang.String r0 = r0.getString(r1)
            r2.setTitle(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.businessdirectory.view.fragment.BusinessDirectorySearchFragment.A1J(java.lang.String):void");
    }
}
