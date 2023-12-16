package com.whatsapp.contact.extensions;

import X.AnonymousClass001;
import X.AnonymousClass4GR;
import X.C57682u2;
import X.C59022wD;
import X.C64773Ex;
import X.C75003pT;
import X.C84814Du;
import X.C95814uZ;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.contact.extensions.ContactManagerExtKt$asWaContacts$2$1$1", f = "ContactManagerExt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ContactManagerExtKt$asWaContacts$2$1$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ C64773Ex $contactManager;
    public final /* synthetic */ C95814uZ $it;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContactManagerExtKt$asWaContacts$2$1$1(C64773Ex r2, C95814uZ r3, C84814Du r4) {
        super(r4, 2);
        this.$contactManager = r2;
        this.$it = r3;
    }

    public final Object A09(Object obj) {
        if (this.label == 0) {
            C57682u2.A01(obj);
            return this.$contactManager.A0A(this.$it);
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new ContactManagerExtKt$asWaContacts$2$1$1(this.$contactManager, this.$it, r5);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
