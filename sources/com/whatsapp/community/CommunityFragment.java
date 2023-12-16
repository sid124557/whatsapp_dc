package com.whatsapp.community;

import X.AnonymousClass001;
import X.AnonymousClass0UY;
import X.AnonymousClass0x2;
import X.AnonymousClass11B;
import X.AnonymousClass1VX;
import X.AnonymousClass30V;
import X.AnonymousClass33p;
import X.AnonymousClass4FS;
import X.AnonymousClass4L0;
import X.AnonymousClass4XG;
import X.AnonymousClass5K8;
import X.AnonymousClass5U2;
import X.AnonymousClass5YU;
import X.AnonymousClass6C6;
import X.AnonymousClass7XG;
import X.AnonymousClass8s5;
import X.C009707r;
import X.C02680He;
import X.C04640Qa;
import X.C08310eF;
import X.C103145Ls;
import X.C111095hX;
import X.C114015mM;
import X.C1229666n;
import X.C1229966q;
import X.C1231267f;
import X.C15930sC;
import X.C18260x0;
import X.C18270x1;
import X.C18320x8;
import X.C189068zw;
import X.C28891hw;
import X.C29241iV;
import X.C29291ia;
import X.C29301ib;
import X.C29421in;
import X.C39592Co;
import X.C44092Uq;
import X.C56542sA;
import X.C56612sH;
import X.C56942so;
import X.C58422vE;
import X.C620733j;
import X.C626936e;
import X.C64653Ej;
import X.C69263Wi;
import X.C86144Iz;
import X.C86604Kt;
import X.C86654Ky;
import X.C95814uZ;
import X.C97154xi;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.util.Log;

public class CommunityFragment extends Hilt_CommunityFragment implements C1229966q, C1229666n {
    public C04640Qa A00;
    public C111095hX A01;
    public C44092Uq A02;
    public C103145Ls A03;
    public C39592Co A04;
    public C69263Wi A05;
    public C29291ia A06;
    public C29301ib A07;
    public C56942so A08;
    public C64653Ej A09;
    public AnonymousClass11B A0A;
    public AnonymousClass4XG A0B;
    public C29421in A0C;
    public C114015mM A0D;
    public AnonymousClass7XG A0E;
    public C56612sH A0F;
    public AnonymousClass33p A0G;
    public C620733j A0H;
    public C56542sA A0I;
    public C28891hw A0J;
    public AnonymousClass1VX A0K;
    public C29241iV A0L;
    public C97154xi A0M;
    public AnonymousClass30V A0N;
    public AnonymousClass4FS A0O;
    public boolean A0P = false;
    public boolean A0Q = false;
    public final C15930sC A0R = AnonymousClass6C6.A00(this, 93);

    public void A0e() {
        A1J(false);
        super.A0e();
    }

    public void A0c() {
        this.A0E.A01();
        C04640Qa r1 = this.A00;
        if (r1 != null) {
            this.A0B.A01.unregisterObserver(r1);
        }
        super.A0c();
    }

    public final void A1I() {
        if (this.A0A == null) {
            Log.d("CommunityFragment/constructViewModel: build VM");
            AnonymousClass11B r0 = (AnonymousClass11B) AnonymousClass4L0.A0F(new C86144Iz(this.A04, 1), this).A01(AnonymousClass11B.class);
            this.A0A = r0;
            r0.A00.A0B(A0V(), this.A0R);
            AnonymousClass6C6.A02(A0V(), this.A0A.A0O, this, 91);
            AnonymousClass6C6.A02(A0V(), this.A0A.A0P, this, 92);
            new AnonymousClass5K8((C009707r) C111095hX.A00(A1D()), this.A01, this.A0H, this.A0A.A04.A04);
        }
    }

    public final void A1J(boolean z) {
        boolean z2 = this.A0Q;
        this.A0Q = z;
        if (z2 != z) {
            if (z) {
                AnonymousClass33p r4 = this.A0G;
                C18270x1.A0i(C18270x1.A03(r4), "previous_last_seen_community_activity", AnonymousClass0x2.A0B(AnonymousClass0x2.A0F(r4), "last_seen_community_activity"));
                AnonymousClass11B r0 = this.A0A;
                if (r0 == null) {
                    A1I();
                    r0 = this.A0A;
                }
                r0.A0M.A0F(this.A0R);
            } else {
                AnonymousClass11B r02 = this.A0A;
                if (r02 == null) {
                    A1I();
                    r02 = this.A0A;
                }
                r02.A0M.A0B(this, this.A0R);
            }
            if (z2 || z) {
                AnonymousClass33p r1 = this.A0G;
                C18270x1.A0i(C18270x1.A03(r1), "last_seen_community_activity", C56612sH.A00(this.A0F));
            }
            this.A0B.A0K();
        }
    }

    public /* synthetic */ boolean Awt() {
        return false;
    }

    public boolean B3Y() {
        boolean A0Y = this.A0K.A0Y(C58422vE.A01, 4811);
        C18260x0.A1D("CommunityFragment/fragmentAsyncInitEnabled ", AnonymousClass001.A0o(), A0Y);
        return A0Y;
    }

    public String B9I() {
        return null;
    }

    public Drawable B9J() {
        return null;
    }

    public String B9K() {
        return null;
    }

    public String BCY() {
        return null;
    }

    public Drawable BCZ() {
        return null;
    }

    public int BDV() {
        return 600;
    }

    public String BDl() {
        return null;
    }

    public void BTn() {
        Log.d("CommunityFragment/onFragmentAsyncInit");
        A1I();
        this.A0P = true;
        if (this.A0M.A0I()) {
            C1231267f r1 = new C1231267f(this, 2);
            this.A00 = r1;
            this.A0B.BiZ(r1);
        }
        if (!isEmpty()) {
            this.A0M.A09(600, false);
        }
    }

    public boolean BTo() {
        return this.A0P;
    }

    public void BVy() {
    }

    public void Bb1() {
    }

    public /* synthetic */ boolean BqR() {
        return false;
    }

    public boolean isEmpty() {
        C626936e.A0D(this.A0P, "isEmpty should be called after onFragmentAsyncInit for accuracy");
        if (this.A0B.A00.size() <= 0 || this.A0B.getItemViewType(0) == 10) {
            return true;
        }
        return false;
    }

    public void onConfigurationChanged(Configuration configuration) {
        if (this.A0B.A00.size() == 1) {
            this.A0B.A06(0);
        }
        super.onConfigurationChanged(configuration);
    }

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View A0R2 = AnonymousClass001.A0R(layoutInflater, viewGroup, R.layout.f8nameremoved);
        RecyclerView A0P2 = C86654Ky.A0P(A0R2, R.id.community_recycler_view);
        A0P2.A0h = true;
        A0R2.getContext();
        C18320x8.A19(A0P2, 1);
        A0P2.setItemAnimator((AnonymousClass0UY) null);
        boolean z = !this.A0K.A0Y(C58422vE.A01, 3289);
        int dimensionPixelSize = C08310eF.A09(this).getDimensionPixelSize(R.dimen.f6nameremoved);
        if (z) {
            dimensionPixelSize = C86654Ky.A02(C08310eF.A09(this), R.dimen.f6nameremoved, dimensionPixelSize);
        }
        Bundle bundle2 = this.A06;
        if (bundle2 != null) {
            dimensionPixelSize = bundle2.getInt("top_padding", dimensionPixelSize);
        }
        C86604Kt.A1D(A0P2, A0P2.getPaddingLeft(), dimensionPixelSize);
        AnonymousClass4XG A002 = this.A02.A00(this.A0D.A04(A0Q(), this, "community-tab"), this.A03.A00(A0Q(), (Runnable) null, (Runnable) null), this.A0I, 4);
        this.A0B = A002;
        A0P2.setAdapter(A002);
        A0P2.A0o(new C189068zw(C02680He.A00(A1D().getTheme(), C08310eF.A09(this), R.drawable.community_divider_shadow), this, 0));
        A0P2.A0o(new C189068zw(C02680He.A00(A1D().getTheme(), C08310eF.A09(this), R.drawable.subgroup_divider), this, 1));
        AnonymousClass7XG r5 = new AnonymousClass7XG(this.A06, this.A07, this.A0B, this.A0C, this.A0J, this.A0L);
        this.A0E = r5;
        r5.A00();
        if (!B3Y()) {
            A1I();
        }
        AnonymousClass5YU.A02(this, A0P2);
        return A0R2;
    }

    public /* synthetic */ void Awb(AnonymousClass8s5 r1) {
        r1.BMG();
    }

    public /* synthetic */ void AxH(AnonymousClass5U2 r1) {
    }

    public /* synthetic */ void BnI(boolean z) {
    }

    public void BnJ(boolean z) {
        A1J(z);
        if (z) {
            this.A0N.A02((C95814uZ) null, 3);
        }
    }
}
