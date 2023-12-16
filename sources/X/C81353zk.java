package X;

/* renamed from: X.3zk  reason: invalid class name and case insensitive filesystem */
public final class C81353zk extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ C54052o6 $extensionsContextParams;
    public final /* synthetic */ C625935s $flowTerminationCallback;
    public final /* synthetic */ AnonymousClass1QO this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C81353zk(C625935s r2, AnonymousClass1QO r3, C54052o6 r4) {
        super(0);
        this.this$0 = r3;
        this.$extensionsContextParams = r4;
        this.$flowTerminationCallback = r2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: X.2nk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v5, resolved type: X.2nk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v35, resolved type: X.2nk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v8, resolved type: X.2nk} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r24 = this;
            r2 = r24
            X.1QO r0 = r2.this$0
            X.1VX r1 = r0.A0D
            r0 = 5764(0x1684, float:8.077E-42)
            X.2vE r3 = X.C58422vE.A02
            boolean r1 = r1.A0Y(r3, r0)
            X.1QO r0 = r2.this$0
            if (r1 == 0) goto L_0x002c
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixExtensionFlowManagerWithCoroutines r4 = r0.A03
            X.2o6 r3 = r2.$extensionsContextParams
            r5 = 0
            X.35s r6 = r2.$flowTerminationCallback
            r0 = 0
            X.C162457s7.A0J(r3, r0)
            X.4C6 r1 = r4.A0W
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixExtensionFlowManagerWithCoroutines$startExtensionFlow$1 r2 = new com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixExtensionFlowManagerWithCoroutines$startExtensionFlow$1
            r7 = r5
            r2.<init>(r3, r4, r5, r6, r7)
            r0 = 3
            X.C616131n.A02(r5, r2, r1, r5, r0)
        L_0x0029:
            X.2wD r0 = X.C59022wD.A00
            return r0
        L_0x002c:
            X.30j r9 = r0.A02
            X.2o6 r10 = r2.$extensionsContextParams
            r23 = 0
            X.35s r8 = r2.$flowTerminationCallback
            r7 = 0
            X.C162457s7.A0J(r10, r7)
            X.1VX r2 = r9.A0Q
            r0 = 5333(0x14d5, float:7.473E-42)
            boolean r0 = r2.A0Y(r3, r0)
            if (r0 == 0) goto L_0x0052
            r0 = 1319(0x527, float:1.848E-42)
            boolean r0 = r2.A0Y(r3, r0)
            if (r0 == 0) goto L_0x0052
            java.lang.String r1 = "extensions-features-disabled"
            java.lang.String r0 = r10.A05
            r9.A06(r8, r1, r0)
            goto L_0x0029
        L_0x0052:
            int r1 = r10.hashCode()
            r9.A00 = r1
            X.1Ua r13 = r9.A0P
            java.lang.String r0 = "phoenixExtensionFlow"
            r13.A02(r1, r0)
            int r1 = r9.A00
            java.lang.String r0 = r10.A08
            r20 = r0
            java.lang.String r0 = r10.A09
            r19 = r0
            com.whatsapp.jid.UserJid r6 = r10.A02
            java.lang.String r11 = r10.A05
            r14 = r6
            r15 = r20
            r16 = r0
            r17 = r11
            r18 = r1
            r13.A07(r14, r15, r16, r17, r18)
            int r1 = r9.A00
            java.lang.String r12 = "is_resumed"
            boolean r0 = r10.A0C
            r17 = r0
            r13.A05(r1, r12, r0)
            X.2sH r0 = r9.A0B
            long r14 = r0.A0H()
            X.2of r1 = r9.A0D
            java.lang.String r0 = r6.user
            long r4 = r1.A00(r0, r11)
            r0 = 0
            int r3 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r3 == 0) goto L_0x00a0
            r0 = 2892(0xb4c, float:4.053E-42)
            long r0 = X.C56952sp.A05(r2, r0)
            long r0 = r0 + r4
        L_0x00a0:
            int r2 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r2 >= 0) goto L_0x00c8
            java.lang.String r4 = "extensions-banned-id-error"
            r9.A06(r8, r4, r11)
            X.2xt r3 = r9.A09
            java.lang.String r18 = "galaxy_message"
            X.3Lv r2 = r9.A0G
            X.2rx r1 = r9.A07
            X.2hy r0 = r9.A0H
            java.lang.Boolean r17 = java.lang.Boolean.valueOf(r17)
            r21 = r19
            r22 = r4
            r12 = r3
            r13 = r1
            r14 = r2
            r15 = r0
            r16 = r6
            r19 = r11
            r12.A02(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            goto L_0x0029
        L_0x00c8:
            X.1Ud r15 = r9.A0N
            java.lang.String r0 = "user_interaction"
            r14 = 0
            int r5 = r15.A0C(r6, r0)
            r0 = r15
            r1 = r6
            r2 = r20
            r3 = r19
            r4 = r11
            r0.A07(r1, r2, r3, r4, r5)
            X.2rW r4 = r9.A0I
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            X.2Kt r2 = r4.A00(r6, r3)
            if (r2 == 0) goto L_0x016a
            java.util.List r0 = r2.A01
            java.util.Iterator r16 = r0.iterator()
        L_0x00ee:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0104
            java.lang.Object r1 = r16.next()
            r0 = r1
            X.2nk r0 = (X.C53832nk) r0
            java.lang.String r0 = r0.A03
            boolean r0 = X.C162457s7.A0P(r0, r11)
            if (r0 == 0) goto L_0x00ee
            r14 = r1
        L_0x0104:
            X.2nk r14 = (X.C53832nk) r14
            if (r14 == 0) goto L_0x016a
            java.lang.String r1 = r14.A00
            int r0 = r9.A00
            r13.A0A(r1, r0)
            X.1Uc r13 = r9.A0M
            java.lang.String r0 = r14.A03
            int r0 = r0.hashCode()
            r13.A0A(r1, r0)
            int r11 = r11.hashCode()
            r0 = r17
            r13.A05(r11, r12, r0)
            java.lang.String r0 = "DRAFT"
            boolean r0 = X.C162457s7.A0P(r1, r0)
            if (r0 != 0) goto L_0x0153
            java.lang.String r1 = r10.A06
            java.lang.String r0 = r10.A04
            boolean r0 = X.C613530j.A00(r1, r0)
            if (r0 != 0) goto L_0x013c
            r1 = 1
            java.lang.String r0 = "metadata_cache_hit"
            r13.A05(r11, r0, r1)
        L_0x013c:
            r0 = 2
            java.lang.Short r0 = java.lang.Short.valueOf(r0)
            r15.A0E(r3, r0)
            java.lang.String r0 = r14.A02
            r10.A00 = r0
            boolean r0 = r9.A07(r10, r14, r2, r8)
            if (r0 != 0) goto L_0x0029
            r9.A03(r10, r14, r8)
            goto L_0x0029
        L_0x0153:
            java.lang.String r0 = "metadata_cache_hit"
            r13.A05(r11, r0, r7)
            java.lang.String r0 = "draft"
            r15.A0D(r5, r0)
            r16 = 1
            X.4JM r11 = new X.4JM
            r12 = r9
            r13 = r10
            r14 = r8
            r15 = r5
            r11.<init>(r12, r13, r14, r15, r16)
            goto L_0x0187
        L_0x016a:
            X.1Uc r2 = r9.A0M
            int r1 = r11.hashCode()
            java.lang.String r0 = "metadata_cache_hit"
            r2.A05(r1, r0, r7)
            java.lang.String r0 = "unknown_extension"
            r15.A0D(r5, r0)
            X.4JM r11 = new X.4JM
            r12 = r9
            r13 = r10
            r14 = r8
            r15 = r5
            r16 = r7
            r11.<init>(r12, r13, r14, r15, r16)
        L_0x0187:
            X.4FS r1 = r4.A09
            X.3b8 r0 = new X.3b8
            r10 = r0
            r12 = r4
            r13 = r6
            r14 = r3
            r15 = r20
            r16 = r19
            r17 = r7
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            r1.BkM(r0)
            goto L_0x0029
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C81353zk.invoke():java.lang.Object");
    }
}
