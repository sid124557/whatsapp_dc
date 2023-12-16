package com.whatsapp.contact.picker;

import X.AnonymousClass001;
import X.AnonymousClass4GR;
import X.C117865sc;
import X.C57682u2;
import X.C59022wD;
import X.C73723fy;
import X.C73753g1;
import X.C75003pT;
import X.C84814Du;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.contact.picker.NonWaContactsLoader$loadContacts$2", f = "NonWaContactsLoader.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class NonWaContactsLoader$loadContacts$2 extends C75003pT implements AnonymousClass4GR {
    public int label;
    public final /* synthetic */ NonWaContactsLoader this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NonWaContactsLoader$loadContacts$2(NonWaContactsLoader nonWaContactsLoader, C84814Du r3) {
        super(r3, 2);
        this.this$0 = nonWaContactsLoader;
    }

    public final Object A09(Object obj) {
        if (this.label == 0) {
            C57682u2.A01(obj);
            ArrayList A0s = AnonymousClass001.A0s();
            this.this$0.A00.A0i(A0s);
            NonWaContactsLoader nonWaContactsLoader = this.this$0;
            C73753g1.A0a(A0s, new C117865sc(nonWaContactsLoader.A01, nonWaContactsLoader.A02));
            return C73723fy.A0P(A0s);
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        return new NonWaContactsLoader$loadContacts$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01(new NonWaContactsLoader$loadContacts$2(this.this$0, (C84814Du) obj2));
    }
}
