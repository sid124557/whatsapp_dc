package com.whatsapp.product.reporttoadmin;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass4GR;
import X.C162457s7;
import X.C18270x1;
import X.C27991fJ;
import X.C32321qD;
import X.C57682u2;
import X.C59022wD;
import X.C624134x;
import X.C69263Wi;
import X.C75003pT;
import X.C84814Du;
import X.C95814uZ;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.reporttoadmin.xmpp.RtaXmppClient;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.product.reporttoadmin.ReportToAdminDialogFragment$setButtons$1$1", f = "ReportToAdminDialogFragment.kt", i = {}, l = {70}, m = "invokeSuspend", n = {}, s = {})
public final class ReportToAdminDialogFragment$setButtons$1$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ String $key;
    public final /* synthetic */ UserJid $senderUserJid;
    public int label;
    public final /* synthetic */ ReportToAdminDialogFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReportToAdminDialogFragment$setButtons$1$1(UserJid userJid, ReportToAdminDialogFragment reportToAdminDialogFragment, String str, C84814Du r5) {
        super(r5, 2);
        this.this$0 = reportToAdminDialogFragment;
        this.$senderUserJid = userJid;
        this.$key = str;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r5 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            ReportToAdminDialogFragment reportToAdminDialogFragment = this.this$0;
            RtaXmppClient rtaXmppClient = reportToAdminDialogFragment.A04;
            if (rtaXmppClient != null) {
                C624134x r0 = reportToAdminDialogFragment.A02;
                if (r0 == null) {
                    throw C18270x1.A0S("selectedMessage");
                }
                C95814uZ r2 = r0.A1J.A00;
                C162457s7.A0K(r2, "null cannot be cast to non-null type com.whatsapp.jid.PermanentGroupJid");
                UserJid userJid = this.$senderUserJid;
                String str = this.$key;
                this.label = 1;
                obj = rtaXmppClient.A01((C27991fJ) r2, userJid, str, this);
                if (obj == r5) {
                    return r5;
                }
            } else {
                throw C18270x1.A0S("rtaXmppClient");
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        boolean z = obj instanceof C32321qD;
        C69263Wi r1 = this.this$0.A00;
        if (r1 != null) {
            int i2 = R.string.f11nameremoved;
            if (z) {
                i2 = R.string.f11nameremoved;
            }
            r1.A0H(i2, 1);
            return C59022wD.A00;
        }
        throw C18270x1.A0S("globalUI");
    }

    public final C84814Du A0A(Object obj, C84814Du r6) {
        return new ReportToAdminDialogFragment$setButtons$1$1(this.$senderUserJid, this.this$0, this.$key, r6);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
