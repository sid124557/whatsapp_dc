package com.whatsapp.newsletter.multiadmin;

import X.AnonymousClass001;
import X.AnonymousClass20D;
import X.AnonymousClass4C6;
import X.AnonymousClass4GR;
import X.AnonymousClass5QK;
import X.AnonymousClass68R;
import X.C162457s7;
import X.C18270x1;
import X.C57682u2;
import X.C59022wD;
import X.C616131n;
import X.C75003pT;
import X.C84814Du;
import X.C85494Gl;
import X.C95804uY;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.newsletter.multiadmin.InviteNewsletterAdminSelector$onSend$1", f = "InviteNewsletterAdminSelector.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class InviteNewsletterAdminSelector$onSend$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ String $caption;
    public final /* synthetic */ List $inviteeJids;
    public final /* synthetic */ C95804uY $newsletterJid;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ InviteNewsletterAdminSelector this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InviteNewsletterAdminSelector$onSend$1(C95804uY r2, InviteNewsletterAdminSelector inviteNewsletterAdminSelector, String str, List list, C84814Du r6) {
        super(r6, 2);
        this.this$0 = inviteNewsletterAdminSelector;
        this.$newsletterJid = r2;
        this.$inviteeJids = list;
        this.$caption = str;
    }

    public final Object A09(Object obj) {
        if (this.label == 0) {
            C57682u2.A01(obj);
            AnonymousClass4C6 r3 = (AnonymousClass4C6) this.L$0;
            InviteNewsletterAdminSelector inviteNewsletterAdminSelector = this.this$0;
            AnonymousClass5QK r7 = inviteNewsletterAdminSelector.A02;
            if (r7 != null) {
                C95804uY r5 = this.$newsletterJid;
                List list = this.$inviteeJids;
                AnonymousClass68R r6 = new AnonymousClass68R(r5, inviteNewsletterAdminSelector, this.$caption, 1);
                C162457s7.A0J(r3, 0);
                C18270x1.A10(r5, 1, list);
                C616131n.A02((C85494Gl) null, new NewsletterAdminInvitationHandler$inviteAdminsForChannel$1(r5, r6, r7, list, (C84814Du) null), r3, (AnonymousClass20D) null, 3);
                return C59022wD.A00;
            }
            throw C18270x1.A0S("newsletterAdminInvitationHandler");
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r8) {
        InviteNewsletterAdminSelector inviteNewsletterAdminSelector = this.this$0;
        InviteNewsletterAdminSelector$onSend$1 inviteNewsletterAdminSelector$onSend$1 = new InviteNewsletterAdminSelector$onSend$1(this.$newsletterJid, inviteNewsletterAdminSelector, this.$caption, this.$inviteeJids, r8);
        inviteNewsletterAdminSelector$onSend$1.L$0 = obj;
        return inviteNewsletterAdminSelector$onSend$1;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
