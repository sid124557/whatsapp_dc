package com.whatsapp.businessdirectory.view.fragment;

import X.AnonymousClass001;
import X.AnonymousClass08A;
import X.AnonymousClass08M;
import X.AnonymousClass0O5;
import X.AnonymousClass0x9;
import X.AnonymousClass4UC;
import X.AnonymousClass5MB;
import X.AnonymousClass5QM;
import X.AnonymousClass5U9;
import X.AnonymousClass5ZO;
import X.AnonymousClass6C6;
import X.AnonymousClass7KT;
import X.AnonymousClass7Vq;
import X.C105355Up;
import X.C105895Wv;
import X.C111095hX;
import X.C111525iE;
import X.C111545iG;
import X.C112225jO;
import X.C112345ja;
import X.C1228666d;
import X.C1231767k;
import X.C15910sA;
import X.C181958nd;
import X.C18270x1;
import X.C185638u0;
import X.C50382i5;
import X.C53602nM;
import X.C86604Kt;
import X.C86654Ky;
import X.C96254w4;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.businessdirectory.util.DirectoryGPSLocationManager;
import com.whatsapp.businessdirectory.util.LocationUpdateListener;
import com.whatsapp.businessdirectory.view.activity.BusinessDirectoryActivity;
import com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryConsumerHomeViewModel;
import java.util.Map;
import java.util.Objects;

public class BusinessDirectoryConsumerHomeFragment extends Hilt_BusinessDirectoryConsumerHomeFragment implements C185638u0, C1228666d {
    public C111095hX A00;
    public AnonymousClass5MB A01;
    public C50382i5 A02;
    public C111545iG A03;
    public AnonymousClass7Vq A04;
    public AnonymousClass5U9 A05;
    public AnonymousClass5QM A06;
    public C181958nd A07;
    public DirectoryGPSLocationManager A08;
    public LocationUpdateListener A09;
    public C96254w4 A0A;
    public C112345ja A0B;
    public BusinessDirectoryConsumerHomeViewModel A0C;
    public C53602nM A0D;
    public C105355Up A0E;
    public C105895Wv A0F;
    public boolean A0G = true;
    public final AnonymousClass0O5 A0H = new C1231767k(this, 4);

    public void A0r(Bundle bundle) {
        this.A0X = true;
        this.A0B.A00();
    }

    public void A0k(int i, int i2, Intent intent) {
        C111525iE r1;
        int i3;
        if (i == 34) {
            C112345ja r12 = this.A0B;
            if (i2 == -1) {
                r12.A07.BVl();
                r1 = r12.A02;
                i3 = 5;
            } else {
                r1 = r12.A02;
                i3 = 6;
            }
            r1.A02(i3, 0);
        }
        super.A0k(i, i2, intent);
    }

    public void B3A() {
        this.A0C.A0C.A00.A0K();
    }

    public void BSP() {
        this.A0C.A0C.A04();
    }

    public void BVl() {
        C112225jO r2 = this.A0C.A0C;
        r2.A08.A02(true);
        r2.A00.A0K();
    }

    public void BVp() {
        this.A0C.A0C.A05();
    }

    public void BVq() {
        this.A0C.BVr();
    }

    public void BVs(AnonymousClass7KT r2) {
        this.A0C.A0C.A08(r2);
    }

    public void BY6(AnonymousClass5ZO r3) {
        this.A0C.BOv(0);
    }

    public void BaZ() {
        this.A0C.A0C.A00.A0K();
    }

    public void Brw() {
        this.A0C.A0C.A06();
    }

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass08M r3;
        View inflate = layoutInflater.inflate(R.layout.f8nameremoved, viewGroup, false);
        RecyclerView A0P = C86654Ky.A0P(inflate, R.id.search_list);
        A1D();
        C18270x1.A0u(A0P);
        A0P.setAdapter(this.A0A);
        A0P.A0q(this.A0H);
        boolean A052 = this.A0E.A05();
        AnonymousClass08A r1 = this.A0L;
        if (A052) {
            r1.A00(this.A08);
            DirectoryGPSLocationManager directoryGPSLocationManager = this.A08;
            directoryGPSLocationManager.A02 = 0;
            r3 = directoryGPSLocationManager.A05;
        } else {
            r1.A00(this.A09);
            r3 = this.A09.A00;
        }
        C15910sA A0V = A0V();
        C112345ja r12 = this.A0B;
        Objects.requireNonNull(r12);
        C86604Kt.A1N(A0V, r3, r12, 90);
        C86604Kt.A1N(A0V(), this.A0C.A05, this, 91);
        AnonymousClass6C6.A02(A0V(), this.A0C.A0G, this, 38);
        AnonymousClass4UC r32 = this.A0C.A0E;
        C15910sA A0V2 = A0V();
        C112345ja r13 = this.A0B;
        Objects.requireNonNull(r13);
        AnonymousClass6C6.A02(A0V2, r32, r13, 39);
        C86604Kt.A1N(A0V(), this.A0C.A0F, this, 92);
        return inflate;
    }

    public void A0a() {
        super.A0a();
        this.A04.A01(this.A0B);
    }

    public void A0f() {
        AnonymousClass5ZO r1;
        super.A0f();
        BusinessDirectoryConsumerHomeViewModel businessDirectoryConsumerHomeViewModel = this.A0C;
        if (this.A0G) {
            businessDirectoryConsumerHomeViewModel.A07.A09(businessDirectoryConsumerHomeViewModel.A09.A03(), (Integer) null, (Map) null, 0, 0, 0);
        }
        C112225jO r2 = businessDirectoryConsumerHomeViewModel.A0C;
        if (r2.A0A() && (r1 = r2.A00.A01) != null && !r1.equals(businessDirectoryConsumerHomeViewModel.A0D())) {
            r2.A06();
        }
    }

    public void A0p(Bundle bundle) {
        super.A0p(bundle);
        this.A08 = this.A07.Azx(this.A03, (String) null);
        this.A0C = (BusinessDirectoryConsumerHomeViewModel) AnonymousClass0x9.A0H(this).A01(BusinessDirectoryConsumerHomeViewModel.class);
        C112345ja A002 = this.A01.A00(this, this.A08, this.A09, this);
        this.A0B = A002;
        this.A04.A00(A002);
    }

    public final BusinessDirectoryActivity A1I() {
        if (A0R() instanceof BusinessDirectoryActivity) {
            return (BusinessDirectoryActivity) A0R();
        }
        throw AnonymousClass001.A0e("BusinessDirectorySearchQueryFragment should be attached to BusinessDirectoryActivity");
    }
}
