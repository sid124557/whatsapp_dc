package com.whatsapp.extensions.network.metadata;

import X.AnonymousClass4GR;
import X.C56162rW;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import com.whatsapp.jid.UserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.extensions.network.metadata.ExtensionsMetadataManager$fetchExtensionsMetaData$2", f = "ExtensionsMetadataManager.kt", i = {}, l = {125}, m = "invokeSuspend", n = {}, s = {})
public final class ExtensionsMetadataManager$fetchExtensionsMetaData$2 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ UserJid $bizJid;
    public final /* synthetic */ Integer $instanceKey;
    public final /* synthetic */ String $messageId;
    public final /* synthetic */ String $sessionId;
    public final /* synthetic */ boolean $shouldDownloadPSL;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public boolean Z$0;
    public int label;
    public final /* synthetic */ C56162rW this$0;

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A09(java.lang.Object r15) {
        /*
            r14 = this;
            r8 = r15
            X.218 r4 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r14.label
            r7 = 0
            r5 = 1
            if (r0 == 0) goto L_0x0027
            if (r0 != r5) goto L_0x0022
            boolean r3 = r14.Z$0
            java.lang.Object r12 = r14.L$4
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r11 = r14.L$3
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r9 = r14.L$2
            com.whatsapp.jid.UserJid r9 = (com.whatsapp.jid.UserJid) r9
            java.lang.Object r10 = r14.L$1
            java.lang.Integer r10 = (java.lang.Integer) r10
            java.lang.Object r6 = r14.L$0
            X.2rW r6 = (X.C56162rW) r6
            goto L_0x0078
        L_0x0022:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        L_0x0027:
            X.C57682u2.A01(r15)
            X.2rW r6 = r14.this$0
            java.lang.Integer r10 = r14.$instanceKey
            com.whatsapp.jid.UserJid r9 = r14.$bizJid
            boolean r3 = r14.$shouldDownloadPSL
            java.lang.String r11 = r14.$messageId
            java.lang.String r12 = r14.$sessionId
            boolean r0 = r6.A05(r10)     // Catch:{ all -> 0x0086 }
            if (r0 == 0) goto L_0x004a
            java.lang.String r2 = "extensions-metadata-response-error"
            r1 = 3
            java.lang.Short r0 = new java.lang.Short     // Catch:{ all -> 0x0086 }
            r0.<init>(r1)     // Catch:{ all -> 0x0086 }
            X.2mF r3 = new X.2mF     // Catch:{ all -> 0x0086 }
            r3.<init>(r7, r0, r2, r5)     // Catch:{ all -> 0x0086 }
            goto L_0x008b
        L_0x004a:
            X.1Ud r1 = r6.A06     // Catch:{ all -> 0x0086 }
            java.lang.String r0 = "metadata_network_start"
            r1.A09(r10, r0)     // Catch:{ all -> 0x0086 }
            X.2VI r1 = r6.A01     // Catch:{ all -> 0x0086 }
            java.lang.String r0 = r9.getRawString()     // Catch:{ all -> 0x0086 }
            X.1da r2 = r1.A00(r0)     // Catch:{ all -> 0x0086 }
            r14.L$0 = r6     // Catch:{ all -> 0x0086 }
            r14.L$1 = r10     // Catch:{ all -> 0x0086 }
            r14.L$2 = r9     // Catch:{ all -> 0x0086 }
            r14.L$3 = r11     // Catch:{ all -> 0x0086 }
            r14.L$4 = r12     // Catch:{ all -> 0x0086 }
            r14.Z$0 = r3     // Catch:{ all -> 0x0086 }
            r14.label = r5     // Catch:{ all -> 0x0086 }
            X.46Q r1 = X.AnonymousClass2C4.A01     // Catch:{ all -> 0x0086 }
            com.whatsapp.graphql.GraphqlRequest$postAwait$2 r0 = new com.whatsapp.graphql.GraphqlRequest$postAwait$2     // Catch:{ all -> 0x0086 }
            r0.<init>(r2, r7)     // Catch:{ all -> 0x0086 }
            java.lang.Object r8 = X.C616131n.A00(r14, r1, r0)     // Catch:{ all -> 0x0086 }
            if (r8 != r4) goto L_0x007b
            return r4
        L_0x0078:
            X.C57682u2.A01(r15)     // Catch:{ all -> 0x0086 }
        L_0x007b:
            X.2SI r8 = (X.AnonymousClass2SI) r8     // Catch:{ all -> 0x0086 }
            boolean r13 = X.AnonymousClass000.A1S(r3)
            X.2mF r3 = r6.A01(r7, r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x0086 }
            goto L_0x008b
        L_0x0086:
            r0 = move-exception
            X.3Z0 r3 = X.AnonymousClass3Z0.A01(r0)
        L_0x008b:
            X.2rW r2 = r14.this$0
            java.lang.Integer r1 = r14.$instanceKey
            java.lang.Throwable r0 = X.AnonymousClass3Z9.A00(r3)
            if (r0 == 0) goto L_0x0099
            X.2mF r3 = r2.A02(r7, r1, r0)
        L_0x0099:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.extensions.network.metadata.ExtensionsMetadataManager$fetchExtensionsMetaData$2.A09(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExtensionsMetadataManager$fetchExtensionsMetaData$2(C56162rW r2, UserJid userJid, Integer num, String str, String str2, C84814Du r7, boolean z) {
        super(r7, 2);
        this.this$0 = r2;
        this.$instanceKey = num;
        this.$bizJid = userJid;
        this.$shouldDownloadPSL = z;
        this.$messageId = str;
        this.$sessionId = str2;
    }

    public final C84814Du A0A(Object obj, C84814Du r10) {
        C56162rW r1 = this.this$0;
        Integer num = this.$instanceKey;
        ExtensionsMetadataManager$fetchExtensionsMetaData$2 extensionsMetadataManager$fetchExtensionsMetaData$2 = new ExtensionsMetadataManager$fetchExtensionsMetaData$2(r1, this.$bizJid, num, this.$messageId, this.$sessionId, r10, this.$shouldDownloadPSL);
        extensionsMetadataManager$fetchExtensionsMetaData$2.L$0 = obj;
        return extensionsMetadataManager$fetchExtensionsMetaData$2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
