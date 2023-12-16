package com.whatsapp.newsletter.ui.reactions.viewmodel;

import X.AnonymousClass2SQ;
import X.AnonymousClass4GQ;
import X.AnonymousClass4GR;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.newsletter.ui.reactions.viewmodel.GetReactionSendersUseCase$invoke$1", f = "GetReactionSendersUseCase.kt", i = {0, 0}, l = {76}, m = "invokeSuspend", n = {"$this$launch", "sortIdToReactionsMap"}, s = {"L$0", "L$1"})
public final class GetReactionSendersUseCase$invoke$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ List $messageList;
    public final /* synthetic */ AnonymousClass4GQ $onComplete;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public int label;
    public final /* synthetic */ AnonymousClass2SQ this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetReactionSendersUseCase$invoke$1(AnonymousClass2SQ r2, List list, C84814Du r4, AnonymousClass4GQ r5) {
        super(r4, 2);
        this.$messageList = list;
        this.this$0 = r2;
        this.$onComplete = r5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0044, code lost:
        r16 = r1.A1M;
        r1 = X.C56982ss.A00(r5.A01, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0050, code lost:
        if ((r1 instanceof X.AnonymousClass1RL) == false) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0052, code lost:
        r1 = (X.AnonymousClass1RL) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0054, code lost:
        if (r1 == null) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005a, code lost:
        if (r1.A0K() != false) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005c, code lost:
        com.whatsapp.util.Log.d("Cannot get reaction senders list for non admins");
        r6.invoke(X.C72043d5.A00());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006b, code lost:
        r12 = X.C18290x4.A0o(r2);
        r8.L$0 = r3;
        r8.L$1 = r4;
        r8.L$2 = r5;
        r8.L$3 = r6;
        r8.L$4 = r10;
        r8.L$5 = r4;
        r8.L$6 = r12;
        r8.label = 1;
        r11 = X.C57702u4.A02(r8);
        r15 = new X.C69873Yv();
        r14 = new X.AnonymousClass3RO(r5, r11, r15);
        r2 = new X.C69903Yy();
        r21 = r16;
        r15 = r13;
        r16 = r14;
        r5.A03.BkP(new X.C70873bC(r15, r16, r5, r11, r15, r2, r21));
        X.AnonymousClass34A.A01(r5.A05.B61()).BGv(new X.C821442l(r2));
        r1 = r11.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00c0, code lost:
        if (r1 != r9) goto L_0x00c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00c2, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00c3, code lost:
        r0 = r4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0068 A[EDGE_INSN: B:28:0x0068->B:18:0x0068 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0034  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A09(java.lang.Object r24) {
        /*
            r23 = this;
            r1 = r24
            X.218 r9 = X.AnonymousClass218.COROUTINE_SUSPENDED
            r8 = r23
            int r0 = r8.label
            r7 = 1
            if (r0 == 0) goto L_0x00c6
            if (r0 != r7) goto L_0x00db
            java.lang.Object r12 = r8.L$6
            java.lang.Object r0 = r8.L$5
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r10 = r8.L$4
            java.util.Iterator r10 = (java.util.Iterator) r10
            java.lang.Object r6 = r8.L$3
            X.4GQ r6 = (X.AnonymousClass4GQ) r6
            java.lang.Object r5 = r8.L$2
            X.2SQ r5 = (X.AnonymousClass2SQ) r5
            java.lang.Object r4 = r8.L$1
            java.util.Map r4 = (java.util.Map) r4
            java.lang.Object r3 = r8.L$0
            X.C57682u2.A01(r1)
        L_0x0028:
            r0.put(r12, r1)
            r6.invoke(r4)
        L_0x002e:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0068
            X.34x r1 = X.C18300x5.A0T(r10)
            X.2z0 r2 = r1.A1J
            X.4uZ r13 = r2.A00
            boolean r0 = r13 instanceof X.C95804uY
            if (r0 == 0) goto L_0x002e
            X.4uY r13 = (X.C95804uY) r13
            if (r13 == 0) goto L_0x002e
            long r0 = r1.A1M
            r16 = r0
            X.2ss r0 = r5.A01
            X.31A r1 = X.C56982ss.A00(r0, r13)
            boolean r0 = r1 instanceof X.AnonymousClass1RL
            if (r0 == 0) goto L_0x006b
            X.1RL r1 = (X.AnonymousClass1RL) r1
            if (r1 == 0) goto L_0x006b
            boolean r0 = r1.A0K()
            if (r0 != 0) goto L_0x006b
            java.lang.String r0 = "Cannot get reaction senders list for non admins"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.3d5 r0 = X.C72043d5.A00()
            r6.invoke(r0)
        L_0x0068:
            X.2wD r0 = X.C59022wD.A00
            return r0
        L_0x006b:
            java.lang.String r12 = X.C18290x4.A0o(r2)
            r8.L$0 = r3
            r8.L$1 = r4
            r8.L$2 = r5
            r8.L$3 = r6
            r8.L$4 = r10
            r8.L$5 = r4
            r8.L$6 = r12
            r8.label = r7
            X.3dl r11 = X.C57702u4.A02(r8)
            X.3Yv r15 = new X.3Yv
            r15.<init>()
            X.3RO r14 = new X.3RO
            r14.<init>(r5, r11, r15)
            X.3Yy r2 = new X.3Yy
            r2.<init>()
            X.4FS r1 = r5.A03
            X.3bC r0 = new X.3bC
            r21 = r16
            r19 = r15
            r20 = r2
            r17 = r5
            r18 = r11
            r15 = r13
            r16 = r14
            r14 = r0
            r14.<init>(r15, r16, r17, r18, r19, r20, r21)
            r1.BkP(r0)
            X.4C6 r0 = r5.A05
            X.4Gl r0 = r0.B61()
            X.4Gj r1 = X.AnonymousClass34A.A01(r0)
            X.42l r0 = new X.42l
            r0.<init>(r2)
            r1.BGv(r0)
            java.lang.Object r1 = r11.A00()
            if (r1 != r9) goto L_0x00c3
            return r9
        L_0x00c3:
            r0 = r4
            goto L_0x0028
        L_0x00c6:
            X.C57682u2.A01(r1)
            java.lang.Object r3 = r8.L$0
            java.util.LinkedHashMap r4 = X.C18320x8.A0r()
            java.util.List r0 = r8.$messageList
            X.2SQ r5 = r8.this$0
            X.4GQ r6 = r8.$onComplete
            java.util.Iterator r10 = r0.iterator()
            goto L_0x002e
        L_0x00db:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.newsletter.ui.reactions.viewmodel.GetReactionSendersUseCase$invoke$1.A09(java.lang.Object):java.lang.Object");
    }

    public final C84814Du A0A(Object obj, C84814Du r6) {
        GetReactionSendersUseCase$invoke$1 getReactionSendersUseCase$invoke$1 = new GetReactionSendersUseCase$invoke$1(this.this$0, this.$messageList, r6, this.$onComplete);
        getReactionSendersUseCase$invoke$1.L$0 = obj;
        return getReactionSendersUseCase$invoke$1;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
