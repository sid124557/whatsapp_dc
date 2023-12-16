package com.whatsapp.newsletter.multiadmin;

import X.AnonymousClass001;
import X.AnonymousClass495;
import X.AnonymousClass4GR;
import X.AnonymousClass5QK;
import X.AnonymousClass63Q;
import X.AnonymousClass66A;
import X.C103605Nq;
import X.C115035o0;
import X.C136726nA;
import X.C18260x0;
import X.C18310x6;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import X.C95804uY;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.newsletter.multiadmin.NewsletterAdminInvitationHandler$inviteAdminsForChannel$1", f = "NewsletterAdminInvitationHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class NewsletterAdminInvitationHandler$inviteAdminsForChannel$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ AnonymousClass66A $callback;
    public final /* synthetic */ List $inviteeJids;
    public final /* synthetic */ C95804uY $newsletterJid;
    public int label;
    public final /* synthetic */ AnonymousClass5QK this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewsletterAdminInvitationHandler$inviteAdminsForChannel$1(C95804uY r2, AnonymousClass66A r3, AnonymousClass5QK r4, List list, C84814Du r6) {
        super(r6, 2);
        this.this$0 = r4;
        this.$inviteeJids = list;
        this.$newsletterJid = r2;
        this.$callback = r3;
    }

    public final Object A09(Object obj) {
        if (this.label == 0) {
            C57682u2.A01(obj);
            ArrayList A0s = AnonymousClass001.A0s();
            AnonymousClass495 r0 = this.this$0.A00;
            if (r0 != null) {
                r0.cancel();
            }
            this.this$0.A01.A0G(R.string.f11nameremoved, R.string.f11nameremoved);
            Iterator it = this.$inviteeJids.iterator();
            while (it.hasNext()) {
                UserJid A0T = C18310x6.A0T(it);
                AnonymousClass5QK r3 = this.this$0;
                C95804uY r4 = this.$newsletterJid;
                AnonymousClass63Q r02 = new AnonymousClass63Q(this.$callback, r3, A0s, this.$inviteeJids);
                C103605Nq r32 = r3.A03;
                C115035o0 r2 = new C115035o0(A0T, r02);
                C18260x0.A0O(r4, A0T);
                if (r32.A00()) {
                    r32.A01.A02(new C136726nA(r4, A0T, r2));
                }
            }
            return C59022wD.A00;
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r8) {
        return new NewsletterAdminInvitationHandler$inviteAdminsForChannel$1(this.$newsletterJid, this.$callback, this.this$0, this.$inviteeJids, r8);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
