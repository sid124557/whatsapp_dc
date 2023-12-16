package com.whatsapp.businessdirectory.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass08M;
import X.AnonymousClass08N;
import X.AnonymousClass23S;
import X.AnonymousClass4L0;
import X.AnonymousClass5QM;
import X.AnonymousClass5TI;
import X.AnonymousClass5TO;
import X.AnonymousClass5ZI;
import X.AnonymousClass5ZO;
import X.AnonymousClass6lX;
import X.AnonymousClass7H6;
import X.AnonymousClass7T4;
import X.C105355Up;
import X.C109065e1;
import X.C111545iG;
import X.C112275jT;
import X.C114425n1;
import X.C150967Sx;
import X.C162457s7;
import X.C166447yh;
import X.C18260x0;
import X.C18290x4;
import X.C18300x5;
import X.C18320x8;
import X.C184198rP;
import X.C185878uO;
import X.C186048uf;
import X.C1891390d;
import X.C90694i3;
import X.C96304w9;
import X.C96334wC;
import android.app.Application;
import com.whatsapp.jid.Jid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

public final class BusinessDirectoryPopularApiBusinessesViewModel extends AnonymousClass08N implements C185878uO, C184198rP {
    public final AnonymousClass08M A00 = AnonymousClass08M.A01();
    public final C111545iG A01;
    public final C186048uf A02;
    public final AnonymousClass5QM A03;
    public final AnonymousClass5TO A04;
    public final C105355Up A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BusinessDirectoryPopularApiBusinessesViewModel(Application application, C111545iG r5, C186048uf r6, AnonymousClass5QM r7, AnonymousClass5TO r8, C105355Up r9) {
        super(application);
        C18260x0.A0b(application, r8, r5, 1);
        C162457s7.A0J(r9, 6);
        this.A02 = r6;
        this.A03 = r7;
        this.A04 = r8;
        this.A01 = r5;
        this.A05 = r9;
        ((C112275jT) r6).A0C = this;
        r5.A05((Integer) null, 13, 89);
        A0D();
    }

    public void BNv(AnonymousClass7T4 r4, int i) {
        AnonymousClass08M r2 = this.A00;
        int i2 = 2;
        if (i == -1) {
            i2 = 1;
        }
        r2.A0G(C18290x4.A12(new C96304w9(this, i2)));
    }

    public void A0C() {
        ((C112275jT) this.A02).A0C = null;
    }

    public final void A0D() {
        this.A00.A0G(C18290x4.A12(new AnonymousClass6lX()));
        C186048uf r1 = this.A02;
        AnonymousClass5ZO A012 = this.A04.A01();
        C112275jT r12 = (C112275jT) r1;
        r12.A00();
        C114425n1 r7 = new C114425n1(A012, r12, (Jid) null);
        r12.A04 = r7;
        C90694i3 B0D = r12.A0J.B0D(new AnonymousClass7H6(25, (String) null), (C150967Sx) null, A012, (C166447yh) null, r7, r12.A0T.A00, (AnonymousClass5ZI) null, "all_descendents", "all_descendents", (String) null, "per_category_popular_biz");
        B0D.A08();
        r12.A00 = B0D;
    }

    public void BOv(int i) {
        throw AnonymousClass001.A0e("Popular api businesses do not need location information");
    }

    public void BP0() {
        throw AnonymousClass001.A0e("Popular api businesses do not show filters");
    }

    public void Bab() {
        throw AnonymousClass001.A0e("Popular api businesses do not need location information");
    }

    public void Bb2() {
        throw AnonymousClass001.A0e("Popular api businesses do not show categories");
    }

    public void BNw(AnonymousClass5TI r13) {
        ArrayList A0r = C18300x5.A0r(r13);
        Iterator it = r13.A06.iterator();
        while (it.hasNext()) {
            C109065e1 A0K = AnonymousClass4L0.A0K(it);
            A0r.add(new C96334wC(A0K, new C1891390d(this, 1, A0K), 70));
        }
        C111545iG r5 = this.A01;
        LinkedHashMap A0r2 = C18320x8.A0r();
        LinkedHashMap A0r3 = C18320x8.A0r();
        A0r3.put("endpoint", "businesses");
        Integer A0Z = C18290x4.A0Z();
        A0r3.put("api_biz_count", C18290x4.A0f("local_biz_count", A0Z, A0r3));
        A0r3.put("sub_categories", A0Z);
        A0r2.put("result", A0r3);
        r5.A09((Integer) null, 13, A0r2, 13, 4, 2);
        this.A00.A0G(A0r);
    }

    public void BVr() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("An operation is not implemented: ");
        throw new AnonymousClass23S(AnonymousClass000.A0X("Not yet implemented", A0o));
    }

    public void Bac() {
        A0D();
    }
}
