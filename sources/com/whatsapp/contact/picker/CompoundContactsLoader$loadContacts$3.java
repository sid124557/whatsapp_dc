package com.whatsapp.contact.picker;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass2C4;
import X.AnonymousClass2FZ;
import X.AnonymousClass46Q;
import X.AnonymousClass4GR;
import X.C27991fJ;
import X.C57682u2;
import X.C59022wD;
import X.C616131n;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.contact.picker.CompoundContactsLoader$loadContacts$3", f = "CompoundContactsLoader.kt", i = {}, l = {75}, m = "invokeSuspend", n = {}, s = {})
public final class CompoundContactsLoader$loadContacts$3 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ int $concurrentCapacity;
    public final /* synthetic */ C27991fJ $groupJid;
    public int label;
    public final /* synthetic */ AnonymousClass2FZ this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CompoundContactsLoader$loadContacts$3(AnonymousClass2FZ r2, C27991fJ r3, C84814Du r4, int i) {
        super(r4, 2);
        this.this$0 = r2;
        this.$groupJid = r3;
        this.$concurrentCapacity = i;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r2 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            AnonymousClass2FZ r4 = this.this$0;
            C27991fJ r5 = this.$groupJid;
            int i2 = this.$concurrentCapacity;
            AnonymousClass46Q r7 = AnonymousClass2C4.A01;
            this.label = 1;
            obj = C616131n.A00(this, r7, new CompoundContactsLoader$loadContacts$2(r4, r5, (C84814Du) null, r7, i2));
            if (obj == r2) {
                return r2;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return obj;
    }

    public final C84814Du A0A(Object obj, C84814Du r6) {
        return new CompoundContactsLoader$loadContacts$3(this.this$0, this.$groupJid, r6, this.$concurrentCapacity);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
