package com.whatsapp.spamreport;

import X.AnonymousClass001;
import X.AnonymousClass0x9;
import X.AnonymousClass22M;
import X.AnonymousClass2z0;
import X.AnonymousClass4GR;
import X.C18270x1;
import X.C47922e3;
import X.C55832qz;
import X.C57682u2;
import X.C59022wD;
import X.C624134x;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.spamreport.ReportSpamDialogFragment$getSelectedMessage$2", f = "ReportSpamDialogFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ReportSpamDialogFragment$getSelectedMessage$2 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ AnonymousClass2z0 $selectedMessageKey;
    public int label;
    public final /* synthetic */ ReportSpamDialogFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReportSpamDialogFragment$getSelectedMessage$2(AnonymousClass2z0 r2, ReportSpamDialogFragment reportSpamDialogFragment, C84814Du r4) {
        super(r4, 2);
        this.this$0 = reportSpamDialogFragment;
        this.$selectedMessageKey = r2;
    }

    public final Object A09(Object obj) {
        if (this.label == 0) {
            C57682u2.A01(obj);
            C55832qz r1 = this.this$0.A0G;
            if (r1 != null) {
                C624134x A05 = r1.A05(this.$selectedMessageKey);
                if (A05 == null) {
                    ReportSpamDialogFragment reportSpamDialogFragment = this.this$0;
                    C47922e3 r2 = reportSpamDialogFragment.A09;
                    if (r2 != null) {
                        r2.A01(AnonymousClass22M.A0P, AnonymousClass0x9.A13(reportSpamDialogFragment.A0M));
                    } else {
                        throw C18270x1.A0S("crashLogsWrapper");
                    }
                }
                return A05;
            }
            throw C18270x1.A0S("fMessageDatabase");
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new ReportSpamDialogFragment$getSelectedMessage$2(this.$selectedMessageKey, this.this$0, r5);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
