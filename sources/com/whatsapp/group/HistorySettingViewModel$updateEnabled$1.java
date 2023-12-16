package com.whatsapp.group;

import X.AnonymousClass001;
import X.AnonymousClass4GR;
import X.C27991fJ;
import X.C51712kG;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import X.C85524Gp;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.group.HistorySettingViewModel$updateEnabled$1", f = "HistorySettingViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class HistorySettingViewModel$updateEnabled$1 extends C75003pT implements AnonymousClass4GR {
    public int label;
    public final /* synthetic */ HistorySettingViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HistorySettingViewModel$updateEnabled$1(HistorySettingViewModel historySettingViewModel, C84814Du r3) {
        super(r3, 2);
        this.this$0 = historySettingViewModel;
    }

    public final Object A09(Object obj) {
        Object value;
        if (this.label == 0) {
            C57682u2.A01(obj);
            HistorySettingViewModel historySettingViewModel = this.this$0;
            C27991fJ r5 = historySettingViewModel.A01;
            if (r5 != null) {
                C85524Gp r4 = historySettingViewModel.A0C;
                do {
                    value = r4.getValue();
                } while (!r4.AzD(value, new C51712kG(((C51712kG) value).A00, historySettingViewModel.A04.A0D(r5))));
            }
            return C59022wD.A00;
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        return new HistorySettingViewModel$updateEnabled$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01(new HistorySettingViewModel$updateEnabled$1(this.this$0, (C84814Du) obj2));
    }
}
