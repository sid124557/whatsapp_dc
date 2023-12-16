package com.whatsapp.xfamily.crossposting.snackbar;

import X.C105945Xa;
import X.C109665ez;
import X.C110065fd;
import X.C1228966g;
import X.C15910sA;
import X.C17290vH;

public final class CrosspostSnackbarManager$displaySnackBar$1$1 implements C17290vH {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C1228966g A02;
    public final /* synthetic */ C109665ez A03;
    public final /* synthetic */ C105945Xa A04;
    public final /* synthetic */ String A05;

    public CrosspostSnackbarManager$displaySnackBar$1$1(C1228966g r1, C109665ez r2, C105945Xa r3, String str, int i, int i2) {
        this.A04 = r3;
        this.A01 = i;
        this.A00 = i2;
        this.A05 = str;
        this.A03 = r2;
        this.A02 = r1;
    }

    public void BaY(C15910sA r6) {
        C105945Xa r4 = this.A04;
        int i = this.A01;
        int i2 = this.A00;
        C110065fd A002 = r4.A00(this.A03, this.A05, i, i2);
        if (A002 != null) {
            A002.A01();
        }
        this.A02.getLifecycle().A01(this);
    }

    public /* synthetic */ void BQu(C15910sA r1) {
    }

    public /* synthetic */ void BXj(C15910sA r1) {
    }

    public /* synthetic */ void Bcn(C15910sA r1) {
    }
}
