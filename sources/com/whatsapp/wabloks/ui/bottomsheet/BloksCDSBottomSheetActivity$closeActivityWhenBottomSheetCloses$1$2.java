package com.whatsapp.wabloks.ui.bottomsheet;

import X.C08310eF;
import X.C15910sA;
import X.C17290vH;

public final class BloksCDSBottomSheetActivity$closeActivityWhenBottomSheetCloses$1$2 implements C17290vH {
    public final /* synthetic */ C08310eF A00;
    public final /* synthetic */ BloksCDSBottomSheetActivity A01;

    public BloksCDSBottomSheetActivity$closeActivityWhenBottomSheetCloses$1$2(C08310eF r1, BloksCDSBottomSheetActivity bloksCDSBottomSheetActivity) {
        this.A00 = r1;
        this.A01 = bloksCDSBottomSheetActivity;
    }

    public void BQu(C15910sA r3) {
        this.A00.A0L.A01(this);
        BloksCDSBottomSheetActivity bloksCDSBottomSheetActivity = this.A01;
        if (bloksCDSBottomSheetActivity.getSupportFragmentManager().A07() == 0) {
            bloksCDSBottomSheetActivity.finish();
        }
    }

    public /* synthetic */ void BXj(C15910sA r1) {
    }

    public /* synthetic */ void BaY(C15910sA r1) {
    }

    public /* synthetic */ void Bcn(C15910sA r1) {
    }
}
