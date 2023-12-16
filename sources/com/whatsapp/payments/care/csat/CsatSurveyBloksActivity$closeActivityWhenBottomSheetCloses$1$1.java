package com.whatsapp.payments.care.csat;

import X.AnonymousClass0GH;
import X.C08310eF;
import X.C15110qn;
import androidx.lifecycle.OnLifecycleEvent;

public final class CsatSurveyBloksActivity$closeActivityWhenBottomSheetCloses$1$1 implements C15110qn {
    public final /* synthetic */ C08310eF A00;
    public final /* synthetic */ CsatSurveyBloksActivity A01;

    public CsatSurveyBloksActivity$closeActivityWhenBottomSheetCloses$1$1(C08310eF r1, CsatSurveyBloksActivity csatSurveyBloksActivity) {
        this.A00 = r1;
        this.A01 = csatSurveyBloksActivity;
    }

    @OnLifecycleEvent(AnonymousClass0GH.ON_DESTROY)
    public final void onFragmentDestroyed() {
        this.A00.A0L.A01(this);
        this.A01.finish();
    }
}
