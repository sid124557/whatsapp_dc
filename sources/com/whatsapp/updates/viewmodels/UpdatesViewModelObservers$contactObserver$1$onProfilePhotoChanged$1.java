package com.whatsapp.updates.viewmodels;

import X.AnonymousClass4GR;
import X.AnonymousClass5WK;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import X.C95814uZ;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.updates.viewmodels.UpdatesViewModelObservers$contactObserver$1$onProfilePhotoChanged$1", f = "UpdatesViewModelObservers.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class UpdatesViewModelObservers$contactObserver$1$onProfilePhotoChanged$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ C95814uZ $jid;
    public int label;
    public final /* synthetic */ AnonymousClass5WK this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UpdatesViewModelObservers$contactObserver$1$onProfilePhotoChanged$1(C95814uZ r2, AnonymousClass5WK r3, C84814Du r4) {
        super(r4, 2);
        this.this$0 = r3;
        this.$jid = r2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: X.534} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: X.534} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v23, resolved type: X.534} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: X.534} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A09(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.label
            if (r0 != 0) goto L_0x00f3
            X.C57682u2.A01(r9)
            X.5WK r0 = r8.this$0
            com.whatsapp.updates.viewmodels.UpdatesViewModel r7 = r0.A0A
            X.3Ex r1 = r0.A02
            X.4uZ r0 = r8.$jid
            X.3ZH r3 = r1.A0A(r0)
            X.3ZH r0 = r3.A0G()
            if (r0 == 0) goto L_0x001a
            r3 = r0
        L_0x001a:
            X.5UP r0 = r7.A0a
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x00e9
            X.4uZ r6 = r3.A0H
            boolean r0 = r6 instanceof X.C95804uY
            if (r0 == 0) goto L_0x00cc
            X.08M r4 = r7.A0T
            java.lang.Object r0 = r4.A07()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r5 = 0
            if (r0 == 0) goto L_0x0057
            java.util.Iterator r2 = r0.iterator()
        L_0x0037:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00ca
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.536 r0 = (X.AnonymousClass536) r0
            X.3ZH r0 = r0.A00
            X.4uZ r0 = r0.A0H
            boolean r0 = X.C162457s7.A0P(r0, r6)
            if (r0 == 0) goto L_0x0037
        L_0x004e:
            X.536 r1 = (X.AnonymousClass536) r1
            if (r1 == 0) goto L_0x0057
            r1.A00 = r3
            X.C86634Kw.A1L(r4)
        L_0x0057:
            X.08M r4 = r7.A0U
            java.lang.Object r0 = r4.A07()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            if (r0 == 0) goto L_0x0085
            java.util.Iterator r2 = r0.iterator()
        L_0x0065:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00c8
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.5SK r0 = (X.AnonymousClass5SK) r0
            X.3ZH r0 = r0.A00
            X.4uZ r0 = r0.A0H
            boolean r0 = X.C162457s7.A0P(r0, r6)
            if (r0 == 0) goto L_0x0065
        L_0x007c:
            X.5SK r1 = (X.AnonymousClass5SK) r1
            if (r1 == 0) goto L_0x0085
            r1.A00 = r3
            X.C86634Kw.A1L(r4)
        L_0x0085:
            X.08J r4 = r7.A0O
            java.lang.Object r0 = r4.A07()
            X.5TL r0 = (X.AnonymousClass5TL) r0
            if (r0 == 0) goto L_0x00c5
            boolean r1 = r0.A09
            r0 = 1
            if (r1 != r0) goto L_0x00c5
            java.lang.Object r0 = r4.A07()
            X.5TL r0 = (X.AnonymousClass5TL) r0
            if (r0 == 0) goto L_0x00c5
            java.util.List r0 = r0.A08
            if (r0 == 0) goto L_0x00c5
            java.util.Iterator r2 = r0.iterator()
        L_0x00a4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00bc
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.534 r0 = (X.AnonymousClass534) r0
            X.3ZH r0 = r0.A00
            X.4uZ r0 = r0.A0H
            boolean r0 = X.C162457s7.A0P(r0, r6)
            if (r0 == 0) goto L_0x00a4
            r5 = r1
        L_0x00bc:
            X.534 r5 = (X.AnonymousClass534) r5
            if (r5 == 0) goto L_0x00c5
            r5.A00 = r3
            X.C86634Kw.A1L(r4)
        L_0x00c5:
            X.2wD r0 = X.C59022wD.A00
            return r0
        L_0x00c8:
            r1 = r5
            goto L_0x007c
        L_0x00ca:
            r1 = r5
            goto L_0x004e
        L_0x00cc:
            X.08J r2 = r7.A0Q
            java.lang.Object r1 = r2.A07()
            X.5ZA r1 = (X.AnonymousClass5ZA) r1
            if (r1 == 0) goto L_0x00e5
            java.util.List r0 = r1.A05
            X.AnonymousClass5ZA.A01(r3, r0)
            java.util.List r0 = r1.A06
            X.AnonymousClass5ZA.A01(r3, r0)
            java.util.List r0 = r1.A04
            X.AnonymousClass5ZA.A01(r3, r0)
        L_0x00e5:
            X.C86634Kw.A1L(r2)
            goto L_0x00c5
        L_0x00e9:
            r7.A0G()
            r7.A0I()
            r7.A0H()
            goto L_0x00c5
        L_0x00f3:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.updates.viewmodels.UpdatesViewModelObservers$contactObserver$1$onProfilePhotoChanged$1.A09(java.lang.Object):java.lang.Object");
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new UpdatesViewModelObservers$contactObserver$1$onProfilePhotoChanged$1(this.$jid, this.this$0, r5);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
