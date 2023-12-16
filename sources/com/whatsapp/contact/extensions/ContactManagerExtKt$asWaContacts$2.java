package com.whatsapp.contact.extensions;

import X.AnonymousClass001;
import X.AnonymousClass20D;
import X.AnonymousClass218;
import X.AnonymousClass2AD;
import X.AnonymousClass4C6;
import X.AnonymousClass4GR;
import X.C18300x5;
import X.C57682u2;
import X.C59022wD;
import X.C616131n;
import X.C64773Ex;
import X.C72553du;
import X.C73783g4;
import X.C75003pT;
import X.C84814Du;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.contact.extensions.ContactManagerExtKt$asWaContacts$2", f = "ContactManagerExt.kt", i = {}, l = {12}, m = "invokeSuspend", n = {}, s = {})
public final class ContactManagerExtKt$asWaContacts$2 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ C64773Ex $contactManager;
    public final /* synthetic */ List $this_asWaContacts;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContactManagerExtKt$asWaContacts$2(C64773Ex r2, List list, C84814Du r4) {
        super(r4, 2);
        this.$this_asWaContacts = list;
        this.$contactManager = r2;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r8 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            AnonymousClass4C6 r6 = (AnonymousClass4C6) this.L$0;
            List list = this.$this_asWaContacts;
            C64773Ex r5 = this.$contactManager;
            ArrayList A0c = C73783g4.A0c(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A0c.add(C616131n.A01(C72553du.A00, new ContactManagerExtKt$asWaContacts$2$1$1(r5, C18300x5.A0P(it), (C84814Du) null), r6, AnonymousClass20D.DEFAULT));
            }
            this.label = 1;
            obj = AnonymousClass2AD.A00(A0c, this);
            if (obj == r8) {
                return r8;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return obj;
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        ContactManagerExtKt$asWaContacts$2 contactManagerExtKt$asWaContacts$2 = new ContactManagerExtKt$asWaContacts$2(this.$contactManager, this.$this_asWaContacts, r5);
        contactManagerExtKt$asWaContacts$2.L$0 = obj;
        return contactManagerExtKt$asWaContacts$2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
