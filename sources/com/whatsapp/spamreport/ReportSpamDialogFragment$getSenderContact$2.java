package com.whatsapp.spamreport;

import X.AnonymousClass001;
import X.AnonymousClass4GR;
import X.C18270x1;
import X.C57682u2;
import X.C59022wD;
import X.C64773Ex;
import X.C75003pT;
import X.C84814Du;
import com.whatsapp.jid.UserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.spamreport.ReportSpamDialogFragment$getSenderContact$2", f = "ReportSpamDialogFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ReportSpamDialogFragment$getSenderContact$2 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ UserJid $senderJid;
    public int label;
    public final /* synthetic */ ReportSpamDialogFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReportSpamDialogFragment$getSenderContact$2(UserJid userJid, ReportSpamDialogFragment reportSpamDialogFragment, C84814Du r4) {
        super(r4, 2);
        this.this$0 = reportSpamDialogFragment;
        this.$senderJid = userJid;
    }

    public final Object A09(Object obj) {
        if (this.label == 0) {
            C57682u2.A01(obj);
            C64773Ex r1 = this.this$0.A04;
            if (r1 != null) {
                return r1.A0A(this.$senderJid);
            }
            throw C18270x1.A0S("contactManager");
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new ReportSpamDialogFragment$getSenderContact$2(this.$senderJid, this.this$0, r5);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
