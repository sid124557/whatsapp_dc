package com.whatsapp.calling.psa.viewmodel;

import X.AnonymousClass4GR;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.psa.viewmodel.GroupCallPsaViewModel$fetchSuggestions$1", f = "GroupCallPsaViewModel.kt", i = {1}, l = {37, 39}, m = "invokeSuspend", n = {"suggestions"}, s = {"L$0"})
public final class GroupCallPsaViewModel$fetchSuggestions$1 extends C75003pT implements AnonymousClass4GR {
    public Object L$0;
    public int label;
    public final /* synthetic */ GroupCallPsaViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GroupCallPsaViewModel$fetchSuggestions$1(GroupCallPsaViewModel groupCallPsaViewModel, C84814Du r3) {
        super(r3, 2);
        this.this$0 = groupCallPsaViewModel;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004b, code lost:
        if (r7 == r4) goto L_0x004d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A09(java.lang.Object r7) {
        /*
            r6 = this;
            X.218 r4 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r6.label
            r3 = 2
            r1 = 1
            if (r0 == 0) goto L_0x0038
            if (r0 == r1) goto L_0x004e
            if (r0 != r3) goto L_0x0087
            java.lang.Object r0 = r6.L$0
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            X.C57682u2.A01(r7)
        L_0x0013:
            com.whatsapp.calling.psa.viewmodel.GroupCallPsaViewModel r5 = r6.this$0
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
            java.util.Iterator r3 = r0.iterator()
        L_0x001d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0074
            X.3ZH r2 = X.C18310x6.A0R(r3)
            X.5ZU r0 = r5.A01
            java.lang.String r1 = r0.A0H(r2)
            if (r1 == 0) goto L_0x001d
            X.2jb r0 = new X.2jb
            r0.<init>(r2, r1)
            r4.add(r0)
            goto L_0x001d
        L_0x0038:
            X.C57682u2.A01(r7)
            com.whatsapp.calling.psa.viewmodel.GroupCallPsaViewModel r0 = r6.this$0
            X.2S2 r2 = r0.A00
            r6.label = r1
            r1 = 0
            com.whatsapp.calling.psa.data.GroupCallPsaDatasourceImpl$loadSuggestions$2 r0 = new com.whatsapp.calling.psa.data.GroupCallPsaDatasourceImpl$loadSuggestions$2
            r0.<init>(r2, r1)
            java.lang.Object r7 = X.AnonymousClass349.A00(r6, r0)
            if (r7 != r4) goto L_0x0051
        L_0x004d:
            return r4
        L_0x004e:
            X.C57682u2.A01(r7)
        L_0x0051:
            java.util.List r7 = (java.util.List) r7
            com.whatsapp.calling.psa.viewmodel.GroupCallPsaViewModel r0 = r6.this$0
            X.4Gn r1 = r0.A02
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x006e
            X.1ND r0 = new X.1ND
            r0.<init>()
        L_0x0062:
            r6.L$0 = r7
            r6.label = r3
            java.lang.Object r0 = r1.BlD(r0, r6)
            if (r0 == r4) goto L_0x004d
            r0 = r7
            goto L_0x0013
        L_0x006e:
            X.1NC r0 = new X.1NC
            r0.<init>()
            goto L_0x0062
        L_0x0074:
            X.4Gp r2 = r5.A04
            r0 = 2131889793(0x7f120e81, float:1.941426E38)
            X.2yf r1 = new X.2yf
            r1.<init>(r4, r0)
            X.46p r2 = (X.C832246p) r2
            r0 = 0
            r2.A04(r0, r1)
            X.2wD r0 = X.C59022wD.A00
            return r0
        L_0x0087:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.psa.viewmodel.GroupCallPsaViewModel$fetchSuggestions$1.A09(java.lang.Object):java.lang.Object");
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        return new GroupCallPsaViewModel$fetchSuggestions$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01(new GroupCallPsaViewModel$fetchSuggestions$1(this.this$0, (C84814Du) obj2));
    }
}
