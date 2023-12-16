package com.whatsapp.businessproductlist.view.fragment;

import X.AnonymousClass001;
import X.AnonymousClass1VX;
import X.AnonymousClass5QB;
import X.AnonymousClass5Y9;
import X.AnonymousClass5ZU;
import X.AnonymousClass60E;
import X.AnonymousClass66R;
import X.C104975Tb;
import X.C105255Ue;
import X.C111095hX;
import X.C118985wF;
import X.C154517dI;
import X.C162457s7;
import X.C175328Xy;
import X.C182058nn;
import X.C18270x1;
import X.C56422rx;
import X.C56972sr;
import X.C620433g;
import X.C64773Ex;
import X.C69263Wi;
import X.C86604Kt;
import X.C86644Kx;
import X.C87584Tn;
import android.os.Bundle;
import android.view.View;

public class CollectionProductListFragment extends Hilt_CollectionProductListFragment {
    public int A00 = -1;
    public C111095hX A01;
    public C69263Wi A02;
    public C56972sr A03;
    public C620433g A04;
    public AnonymousClass5QB A05;
    public AnonymousClass5Y9 A06;
    public C104975Tb A07;
    public C64773Ex A08;
    public C56422rx A09;
    public AnonymousClass5ZU A0A;
    public AnonymousClass1VX A0B;
    public C105255Ue A0C;
    public Integer A0D;
    public String A0E;
    public String A0F;
    public final AnonymousClass66R A0G = C154517dI.A01(new C118985wF(this));

    public void A0w(Bundle bundle, View view) {
        C162457s7.A0J(view, 0);
        super.A0w(bundle, view);
        C87584Tn r5 = (C87584Tn) this.A0G.getValue();
        r5.A01.A01(r5.A02.A00, A1L(), A1O(), AnonymousClass001.A1X(this.A00, -1));
    }

    public final String A1O() {
        String str = this.A0E;
        if (str != null) {
            return str;
        }
        throw C18270x1.A0S("collectionId");
    }

    public void A0f() {
        super.A0f();
        if (this.A0D != null) {
            C182058nn r1 = this.A0B;
            C162457s7.A0H(r1);
            r1.BT3(C86644Kx.A07(this.A0D));
            this.A0D = null;
        }
    }

    public void A0p(Bundle bundle) {
        super.A0p(bundle);
        String string = A0H().getString("collection-id", "");
        C162457s7.A0D(string);
        this.A0E = string;
        this.A0F = A0H().getString("collection-index");
        this.A00 = A0H().getInt("category_browsing_entry_point", -1);
        A0H().getInt("category_level", -1);
        AnonymousClass66R r3 = this.A0G;
        C86604Kt.A1N(this, ((C87584Tn) r3.getValue()).A01.A03, new AnonymousClass60E(this), 110);
        C86604Kt.A1N(this, ((C87584Tn) r3.getValue()).A01.A05, new C175328Xy(this), 111);
    }
}
