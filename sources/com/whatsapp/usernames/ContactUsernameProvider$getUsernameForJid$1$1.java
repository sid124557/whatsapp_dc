package com.whatsapp.usernames;

import X.AnonymousClass001;
import X.AnonymousClass08M;
import X.AnonymousClass218;
import X.AnonymousClass4GR;
import X.C06270Wx;
import X.C27981fH;
import X.C46182bD;
import X.C57682u2;
import X.C59022wD;
import X.C616131n;
import X.C73853gB;
import X.C75003pT;
import X.C84814Du;
import X.C95814uZ;
import com.whatsapp.jid.PhoneUserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.usernames.ContactUsernameProvider$getUsernameForJid$1$1", f = "ContactUsernameProvider.kt", i = {}, l = {34, 35}, m = "invokeSuspend", n = {}, s = {})
public final class ContactUsernameProvider$getUsernameForJid$1$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ C95814uZ $chatJid;
    public final /* synthetic */ AnonymousClass08M $it;
    public Object L$0;
    public int label;
    public final /* synthetic */ C46182bD this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContactUsernameProvider$getUsernameForJid$1$1(AnonymousClass08M r2, C95814uZ r3, C46182bD r4, C84814Du r5) {
        super(r5, 2);
        this.$it = r2;
        this.$chatJid = r3;
        this.this$0 = r4;
    }

    public final Object A09(Object obj) {
        C06270Wx r5;
        C73853gB r3;
        AnonymousClass4GR contactUsernameProvider$getUsernameForPn$2;
        AnonymousClass218 r6 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            r5 = this.$it;
            C95814uZ r4 = this.$chatJid;
            if (r4 instanceof C27981fH) {
                C46182bD r1 = this.this$0;
                this.L$0 = r5;
                this.label = 1;
                r3 = r1.A02;
                contactUsernameProvider$getUsernameForPn$2 = new ContactUsernameProvider$getUsernameForLid$2((C27981fH) r4, r1, (C84814Du) null);
            } else if (r4 instanceof PhoneUserJid) {
                C46182bD r12 = this.this$0;
                this.L$0 = r5;
                this.label = 2;
                r3 = r12.A02;
                contactUsernameProvider$getUsernameForPn$2 = new ContactUsernameProvider$getUsernameForPn$2((PhoneUserJid) r4, r12, (C84814Du) null);
            } else {
                obj = null;
            }
            obj = C616131n.A00(this, r3, contactUsernameProvider$getUsernameForPn$2);
            if (obj == r6) {
                return r6;
            }
        } else if (i == 1 || i == 2) {
            r5 = (C06270Wx) this.L$0;
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        r5.A0G(obj);
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r6) {
        return new ContactUsernameProvider$getUsernameForJid$1$1(this.$it, this.$chatJid, this.this$0, r6);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
