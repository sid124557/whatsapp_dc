package com.whatsapp.spamreport;

import X.AnonymousClass001;
import X.AnonymousClass0x9;
import X.AnonymousClass218;
import X.AnonymousClass2C4;
import X.AnonymousClass32Y;
import X.AnonymousClass3ZH;
import X.AnonymousClass4GR;
import X.AnonymousClass65Z;
import X.C18270x1;
import X.C18300x5;
import X.C57682u2;
import X.C59022wD;
import X.C616131n;
import X.C624134x;
import X.C627736r;
import X.C75003pT;
import X.C84814Du;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.jid.UserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.spamreport.ReportSpamDialogFragment$reportAsSpam$1", f = "ReportSpamDialogFragment.kt", i = {}, l = {523}, m = "invokeSuspend", n = {}, s = {})
public final class ReportSpamDialogFragment$reportAsSpam$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ AnonymousClass3ZH $contact;
    public final /* synthetic */ boolean $extraActionChecked;
    public final /* synthetic */ C624134x $selectedMessage;
    public final /* synthetic */ AnonymousClass3ZH $senderContact;
    public int label;
    public final /* synthetic */ ReportSpamDialogFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReportSpamDialogFragment$reportAsSpam$1(AnonymousClass3ZH r2, AnonymousClass3ZH r3, C624134x r4, ReportSpamDialogFragment reportSpamDialogFragment, C84814Du r6, boolean z) {
        super(r6, 2);
        this.this$0 = reportSpamDialogFragment;
        this.$extraActionChecked = z;
        this.$contact = r2;
        this.$senderContact = r3;
        this.$selectedMessage = r4;
    }

    public final Object A09(Object obj) {
        Intent A02;
        AnonymousClass218 r2 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            ReportSpamDialogFragment reportSpamDialogFragment = this.this$0;
            boolean z = this.$extraActionChecked;
            AnonymousClass3ZH r4 = this.$contact;
            AnonymousClass3ZH r5 = this.$senderContact;
            C624134x r6 = this.$selectedMessage;
            this.label = 1;
            if (C616131n.A00(this, AnonymousClass2C4.A01, new ReportSpamDialogFragment$triggerReport$2(r4, r5, r6, reportSpamDialogFragment, (C84814Du) null, z)) == r2) {
                return r2;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        AnonymousClass65Z r0 = this.this$0.A0F;
        if (r0 != null) {
            r0.BZy();
        }
        ReportSpamDialogFragment reportSpamDialogFragment2 = this.this$0;
        AnonymousClass3ZH r42 = this.$contact;
        boolean z2 = this.$extraActionChecked;
        if (!z2 || !r42.A0R() || !reportSpamDialogFragment2.A02.A0X(3369)) {
            if (C18270x1.A1V(reportSpamDialogFragment2.A0P)) {
                if (reportSpamDialogFragment2.A1c(r42)) {
                    A02 = C18300x5.A07(reportSpamDialogFragment2.A0G()).setAction("com.whatsapp.intent.action.REPORT_PRIVACY_TIP_DIALOG").putExtra("report_and_exit_group", z2);
                } else {
                    A02 = C627736r.A02(reportSpamDialogFragment2.A1D());
                }
                A02.addFlags(603979776);
            }
            this.this$0.A1K();
            return C59022wD.A00;
        }
        Context A0G = reportSpamDialogFragment2.A0G();
        UserJid A05 = AnonymousClass32Y.A05(r42.A0H);
        if (A05 != null) {
            A02 = C627736r.A0m(A0G, A05, AnonymousClass0x9.A13(reportSpamDialogFragment2.A0M), true, false, false, C18270x1.A1V(reportSpamDialogFragment2.A0O), false);
        } else {
            throw C18300x5.A0X();
        }
        reportSpamDialogFragment2.A0m(A02);
        this.this$0.A1K();
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r9) {
        return new ReportSpamDialogFragment$reportAsSpam$1(this.$contact, this.$senderContact, this.$selectedMessage, this.this$0, r9, this.$extraActionChecked);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
