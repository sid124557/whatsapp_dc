package com.whatsapp.usernames;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass4GR;
import X.C27981fH;
import X.C46182bD;
import X.C57682u2;
import X.C59022wD;
import X.C616131n;
import X.C75003pT;
import X.C84814Du;
import com.whatsapp.jid.PhoneUserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.usernames.ContactUsernameProvider$getUsernameForPn$2", f = "ContactUsernameProvider.kt", i = {}, l = {44}, m = "invokeSuspend", n = {}, s = {})
public final class ContactUsernameProvider$getUsernameForPn$2 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ PhoneUserJid $phoneUserJid;
    public int label;
    public final /* synthetic */ C46182bD this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContactUsernameProvider$getUsernameForPn$2(PhoneUserJid phoneUserJid, C46182bD r3, C84814Du r4) {
        super(r4, 2);
        this.this$0 = r3;
        this.$phoneUserJid = phoneUserJid;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r5 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            C27981fH A01 = this.this$0.A01.A01(this.$phoneUserJid);
            if (A01 == null) {
                return null;
            }
            C46182bD r3 = this.this$0;
            this.label = 1;
            obj = C616131n.A00(this, r3.A02, new ContactUsernameProvider$getUsernameForLid$2(A01, r3, (C84814Du) null));
            if (obj == r5) {
                return r5;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return obj;
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new ContactUsernameProvider$getUsernameForPn$2(this.$phoneUserJid, this.this$0, r5);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
