package com.whatsapp.contact.picker;

import X.AnonymousClass4GR;
import X.C27991fJ;
import X.C59022wD;
import X.C73853gB;
import X.C75003pT;
import X.C84434Ci;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.contact.picker.CompoundContactsLoader$loadContacts$2$1$1", f = "CompoundContactsLoader.kt", i = {}, l = {41, 41}, m = "invokeSuspend", n = {}, s = {})
public final class CompoundContactsLoader$loadContacts$2$1$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ C73853gB $dispatcher;
    public final /* synthetic */ C27991fJ $groupJid;
    public final /* synthetic */ C84434Ci $loader;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CompoundContactsLoader$loadContacts$2$1$1(C84434Ci r2, C27991fJ r3, C84814Du r4, C73853gB r5) {
        super(r4, 2);
        this.$loader = r2;
        this.$groupJid = r3;
        this.$dispatcher = r5;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x004a A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A09(java.lang.Object r9) {
        /*
            r8 = this;
            X.218 r7 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r8.label
            r6 = 2
            r5 = 1
            if (r0 == 0) goto L_0x0012
            if (r0 == r5) goto L_0x0030
            if (r0 != r6) goto L_0x004b
            X.C57682u2.A01(r9)
        L_0x000f:
            X.2wD r0 = X.C59022wD.A00
            return r0
        L_0x0012:
            X.C57682u2.A01(r9)
            java.lang.Object r4 = r8.L$0
            X.4C9 r4 = (X.AnonymousClass4C9) r4
            X.4Ci r3 = r8.$loader
            java.lang.String r2 = r3.B8w()
            X.1fJ r1 = r8.$groupJid
            X.3gB r0 = r8.$dispatcher
            r8.L$0 = r4
            r8.L$1 = r2
            r8.label = r5
            java.lang.Object r9 = r3.BJp(r1, r8, r0)
            if (r9 != r7) goto L_0x0039
            return r7
        L_0x0030:
            java.lang.Object r2 = r8.L$1
            java.lang.Object r4 = r8.L$0
            X.4C9 r4 = (X.AnonymousClass4C9) r4
            X.C57682u2.A01(r9)
        L_0x0039:
            X.3Z6 r1 = X.AnonymousClass3Z6.A02(r2, r9)
            r0 = 0
            r8.L$0 = r0
            r8.L$1 = r0
            r8.label = r6
            java.lang.Object r0 = r4.B2K(r1, r8)
            if (r0 != r7) goto L_0x000f
            return r7
        L_0x004b:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.contact.picker.CompoundContactsLoader$loadContacts$2$1$1.A09(java.lang.Object):java.lang.Object");
    }

    public final C84814Du A0A(Object obj, C84814Du r6) {
        CompoundContactsLoader$loadContacts$2$1$1 compoundContactsLoader$loadContacts$2$1$1 = new CompoundContactsLoader$loadContacts$2$1$1(this.$loader, this.$groupJid, r6, this.$dispatcher);
        compoundContactsLoader$loadContacts$2$1$1.L$0 = obj;
        return compoundContactsLoader$loadContacts$2$1$1;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
