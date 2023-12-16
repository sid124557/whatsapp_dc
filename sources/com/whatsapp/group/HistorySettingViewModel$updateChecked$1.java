package com.whatsapp.group;

import X.AnonymousClass001;
import X.AnonymousClass3ZH;
import X.AnonymousClass4GR;
import X.C27991fJ;
import X.C51712kG;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import X.C85524Gp;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.group.HistorySettingViewModel$updateChecked$1", f = "HistorySettingViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class HistorySettingViewModel$updateChecked$1 extends C75003pT implements AnonymousClass4GR {
    public int label;
    public final /* synthetic */ HistorySettingViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HistorySettingViewModel$updateChecked$1(HistorySettingViewModel historySettingViewModel, C84814Du r3) {
        super(r3, 2);
        this.this$0 = historySettingViewModel;
    }

    public final Object A09(Object obj) {
        if (this.label == 0) {
            C57682u2.A01(obj);
            HistorySettingViewModel historySettingViewModel = this.this$0;
            C27991fJ r6 = historySettingViewModel.A01;
            if (r6 != null) {
                AnonymousClass3ZH A07 = historySettingViewModel.A03.A07(r6);
                historySettingViewModel.A00 = A07;
                if (A07 != null) {
                    C85524Gp r4 = historySettingViewModel.A0C;
                    do {
                    } while (!r4.AzD(r4.getValue(), new C51712kG(A07.A0i, historySettingViewModel.A04.A0D(r6))));
                }
            }
            return C59022wD.A00;
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        return new HistorySettingViewModel$updateChecked$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01(new HistorySettingViewModel$updateChecked$1(this.this$0, (C84814Du) obj2));
    }
}
