package com.whatsapp.bonsai.waitlist;

import X.AnonymousClass1ZN;
import X.AnonymousClass4FV;
import X.AnonymousClass4GP;
import X.C162457s7;
import X.C18270x1;
import X.C59702xL;
import X.C64963Fr;
import X.C69263Wi;
import android.os.Bundle;
import android.view.View;

public class BonsaiWaitlistJoinBottomSheet extends Hilt_BonsaiWaitlistJoinBottomSheet {
    public C69263Wi A00;
    public C64963Fr A01;
    public C59702xL A02;
    public Integer A03;
    public AnonymousClass4GP A04;

    public void A0w(Bundle bundle, View view) {
        Integer num;
        C162457s7.A0J(view, 0);
        super.A0w(bundle, view);
        Bundle bundle2 = this.A06;
        if (bundle2 != null) {
            num = Integer.valueOf(bundle2.getInt("bonsaiWaitlistDialogEntryPoint", -1));
        } else {
            num = null;
        }
        this.A03 = num;
        if (num != null && num.intValue() == -1) {
            this.A03 = null;
            num = null;
        }
        C64963Fr r0 = this.A01;
        if (r0 != null) {
            AnonymousClass4FV r2 = r0.A03;
            AnonymousClass1ZN r1 = new AnonymousClass1ZN();
            r1.A00 = 43;
            r1.A01 = num;
            r2.BhD(r1);
            return;
        }
        throw C18270x1.A0S("bonsaiWaitlistLogger");
    }

    public BonsaiWaitlistJoinBottomSheet(int i, int i2, int i3, int i4) {
        super(i, i2, i3, i4);
    }
}
