package com.whatsapp.usernames;

import X.AnonymousClass001;
import X.AnonymousClass0x2;
import X.AnonymousClass4GR;
import X.C27981fH;
import X.C46182bD;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.usernames.ContactUsernameProvider$getUsernameForLid$2", f = "ContactUsernameProvider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ContactUsernameProvider$getUsernameForLid$2 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ C27981fH $lidUserJid;
    public int label;
    public final /* synthetic */ C46182bD this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContactUsernameProvider$getUsernameForLid$2(C27981fH r2, C46182bD r3, C84814Du r4) {
        super(r4, 2);
        this.this$0 = r3;
        this.$lidUserJid = r2;
    }

    public final Object A09(Object obj) {
        if (this.label == 0) {
            C57682u2.A01(obj);
            String A01 = this.this$0.A00.A01(this.$lidUserJid);
            if (A01 == null) {
                return null;
            }
            if (A01.length() <= 0 || A01.charAt(0) != '@') {
                return AnonymousClass0x2.A0e(A01, AnonymousClass001.A0o(), '@');
            }
            return A01;
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new ContactUsernameProvider$getUsernameForLid$2(this.$lidUserJid, this.this$0, r5);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
