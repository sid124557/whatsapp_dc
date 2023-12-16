package com.whatsapp.calling.callgrid.viewmodel;

import X.AnonymousClass4GR;
import X.AnonymousClass5QX;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import com.whatsapp.jid.UserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.callgrid.viewmodel.ScreenSharePeerTransitionStateProvider$peerEnteredTransitionState$1", f = "ScreenSharePeerTransitionStateProvider.kt", i = {}, l = {42, 43}, m = "invokeSuspend", n = {}, s = {})
public final class ScreenSharePeerTransitionStateProvider$peerEnteredTransitionState$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ UserJid $userJid;
    public int label;
    public final /* synthetic */ AnonymousClass5QX this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScreenSharePeerTransitionStateProvider$peerEnteredTransitionState$1(AnonymousClass5QX r2, UserJid userJid, C84814Du r4) {
        super(r4, 2);
        this.this$0 = r2;
        this.$userJid = userJid;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0037 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A09(java.lang.Object r8) {
        /*
            r7 = this;
            X.218 r6 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r1 = r7.label
            r5 = 2
            r0 = 1
            if (r1 == 0) goto L_0x0012
            if (r1 == r0) goto L_0x0020
            if (r1 != r5) goto L_0x0038
            X.C57682u2.A01(r8)
        L_0x000f:
            X.2wD r0 = X.C59022wD.A00
            return r0
        L_0x0012:
            X.C57682u2.A01(r8)
            r7.label = r0
            r0 = 5000(0x1388, double:2.4703E-320)
            java.lang.Object r0 = X.C616231o.A00(r7, r0)
            if (r0 != r6) goto L_0x0023
            return r6
        L_0x0020:
            X.C57682u2.A01(r8)
        L_0x0023:
            X.5QX r4 = r7.this$0
            X.3gB r3 = r4.A05
            com.whatsapp.jid.UserJid r2 = r7.$userJid
            r1 = 0
            com.whatsapp.calling.callgrid.viewmodel.ScreenSharePeerTransitionStateProvider$peerEnteredTransitionState$1$1 r0 = new com.whatsapp.calling.callgrid.viewmodel.ScreenSharePeerTransitionStateProvider$peerEnteredTransitionState$1$1
            r0.<init>(r2, r1)
            r7.label = r5
            java.lang.Object r0 = X.C616131n.A00(r7, r3, r0)
            if (r0 != r6) goto L_0x000f
            return r6
        L_0x0038:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.callgrid.viewmodel.ScreenSharePeerTransitionStateProvider$peerEnteredTransitionState$1.A09(java.lang.Object):java.lang.Object");
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new ScreenSharePeerTransitionStateProvider$peerEnteredTransitionState$1(this.this$0, this.$userJid, r5);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
