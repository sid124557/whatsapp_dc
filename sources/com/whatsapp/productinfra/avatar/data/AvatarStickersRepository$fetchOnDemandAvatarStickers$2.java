package com.whatsapp.productinfra.avatar.data;

import X.AnonymousClass4GR;
import X.C59022wD;
import X.C59762xR;
import X.C75003pT;
import X.C84814Du;
import java.util.Set;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.data.AvatarStickersRepository$fetchOnDemandAvatarStickers$2", f = "AvatarStickersRepository.kt", i = {1, 2, 3}, l = {220, 238, 247, 263}, m = "invokeSuspend", n = {"error", "error", "revisionOutdated"}, s = {"L$0", "L$0", "L$0"})
public final class AvatarStickersRepository$fetchOnDemandAvatarStickers$2 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ boolean $defaultPack;
    public final /* synthetic */ Set $stableIds;
    public Object L$0;
    public int label;
    public final /* synthetic */ C59762xR this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarStickersRepository$fetchOnDemandAvatarStickers$2(C59762xR r2, Set set, C84814Du r4, boolean z) {
        super(r4, 2);
        this.this$0 = r2;
        this.$stableIds = set;
        this.$defaultPack = z;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v18, resolved type: X.28J} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v27, resolved type: X.1lH} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A09(java.lang.Object r15) {
        /*
            r14 = this;
            X.218 r4 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r14.label
            r5 = 4
            r7 = 3
            r2 = 2
            r1 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0018
            if (r0 == r1) goto L_0x0059
            if (r0 == r2) goto L_0x00b7
            if (r0 == r7) goto L_0x00db
            if (r0 == r5) goto L_0x0121
            java.lang.IllegalStateException r1 = X.AnonymousClass001.A0d()
            throw r1
        L_0x0018:
            X.C57682u2.A01(r15)
            X.2xR r0 = r14.this$0
            X.4C1 r0 = r0.A06
            java.lang.Object r9 = r0.get()
            X.2Lk r9 = (X.C41742Lk) r9
            java.util.Set r12 = r14.$stableIds
            boolean r13 = r14.$defaultPack
            X.2xR r0 = r14.this$0
            X.8qC r0 = r0.A05
            java.lang.Object r0 = r0.get()
            X.2kc r0 = (X.C51932kc) r0
            java.lang.String r11 = r0.A01()
            X.21f r10 = X.C371721f.INITIAL_DOWNLOAD
            r0 = 0
            X.C162457s7.A0J(r12, r0)
            X.4B1 r0 = r9.A01
            X.3SF r8 = new X.3SF
            r8.<init>(r9, r10, r11, r12, r13)
            X.3Os r8 = r0.B03(r8)
            r14.label = r1
            X.46Q r6 = X.AnonymousClass2C4.A01
            r1 = 0
            com.whatsapp.graphql.GraphqlRequest$postAwait$2 r0 = new com.whatsapp.graphql.GraphqlRequest$postAwait$2
            r0.<init>(r8, r1)
            java.lang.Object r15 = X.C616131n.A00(r14, r6, r0)
            if (r15 != r4) goto L_0x005c
            return r4
        L_0x0059:
            X.C57682u2.A01(r15)
        L_0x005c:
            X.2SI r15 = (X.AnonymousClass2SI) r15
            X.28K r6 = X.AnonymousClass28L.A00(r15)
            boolean r0 = r6 instanceof X.C29721kz
            if (r0 == 0) goto L_0x017d
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "AvatarStickersRepository/fetchOnDemandAvatarStickers/"
            r1.append(r0)
            X.1kz r6 = (X.C29721kz) r6
            java.lang.Object r8 = r6.A00
            X.C18260x0.A0n(r8, r1)
            boolean r0 = r8 instanceof X.AnonymousClass28J
            if (r0 == 0) goto L_0x00b5
            r6 = r8
            X.28J r6 = (X.AnonymousClass28J) r6
        L_0x007d:
            X.2xR r9 = r14.this$0
            if (r6 == 0) goto L_0x00b1
            java.lang.String r1 = X.C59762xR.A00(r6)
            if (r1 == 0) goto L_0x00b1
        L_0x0087:
            java.lang.String r0 = "fetch_on_demand_avatar_stickers_failed"
            r9.A01(r0, r1)
            boolean r0 = r6 instanceof X.AnonymousClass1kp
            if (r0 != 0) goto L_0x0178
            boolean r0 = r6 instanceof X.AnonymousClass1kq
            if (r0 == 0) goto L_0x00e9
            r0 = r6
            X.1kq r0 = (X.AnonymousClass1kq) r0
            java.lang.Object r0 = r0.A00
            boolean r0 = r0 instanceof X.C29801lH
            if (r0 == 0) goto L_0x00be
            X.2xR r5 = r14.this$0
            X.3gB r1 = r5.A09
            com.whatsapp.productinfra.avatar.data.AvatarStickersRepository$fetchOnDemandAvatarStickers$2$unwrapped$1 r0 = new com.whatsapp.productinfra.avatar.data.AvatarStickersRepository$fetchOnDemandAvatarStickers$2$unwrapped$1
            r0.<init>(r5, r6, r3)
            r14.L$0 = r6
            r14.label = r2
            java.lang.Object r0 = X.C616131n.A00(r14, r1, r0)
            if (r0 != r4) goto L_0x00be
            return r4
        L_0x00b1:
            java.lang.String r1 = "unknown error"
            goto L_0x0087
        L_0x00b5:
            r6 = r3
            goto L_0x007d
        L_0x00b7:
            java.lang.Object r6 = r14.L$0
            X.28J r6 = (X.AnonymousClass28J) r6
            X.C57682u2.A01(r15)
        L_0x00be:
            r0 = r6
            X.1kq r0 = (X.AnonymousClass1kq) r0
            java.lang.Object r0 = r0.A00
            boolean r0 = r0 instanceof X.C29821lJ
            if (r0 == 0) goto L_0x00e2
            X.2xR r2 = r14.this$0
            X.3gB r1 = r2.A09
            com.whatsapp.productinfra.avatar.data.AvatarStickersRepository$fetchOnDemandAvatarStickers$2$unwrapped$2 r0 = new com.whatsapp.productinfra.avatar.data.AvatarStickersRepository$fetchOnDemandAvatarStickers$2$unwrapped$2
            r0.<init>(r2, r3)
            r14.L$0 = r6
            r14.label = r7
            java.lang.Object r0 = X.C616131n.A00(r14, r1, r0)
            if (r0 != r4) goto L_0x00e2
            return r4
        L_0x00db:
            java.lang.Object r6 = r14.L$0
            X.28J r6 = (X.AnonymousClass28J) r6
            X.C57682u2.A01(r15)
        L_0x00e2:
            X.1kq r6 = (X.AnonymousClass1kq) r6
            java.lang.Object r1 = r6.A00
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            throw r1
        L_0x00e9:
            boolean r0 = r6 instanceof X.AnonymousClass1kr
            if (r0 == 0) goto L_0x0130
            X.1kr r6 = (X.AnonymousClass1kr) r6
            java.util.List r2 = r6.A00
            java.util.Iterator r1 = r2.iterator()
        L_0x00f5:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x011f
            java.lang.Object r6 = r1.next()
            boolean r0 = r6 instanceof X.C29801lH
            if (r0 == 0) goto L_0x00f5
        L_0x0103:
            boolean r0 = r6 instanceof X.C29801lH
            if (r0 == 0) goto L_0x0129
            X.1lH r6 = (X.C29801lH) r6
            if (r6 == 0) goto L_0x0129
            X.2xR r2 = r14.this$0
            X.3gB r1 = r2.A09
            com.whatsapp.productinfra.avatar.data.AvatarStickersRepository$fetchOnDemandAvatarStickers$2$unwrapped$3 r0 = new com.whatsapp.productinfra.avatar.data.AvatarStickersRepository$fetchOnDemandAvatarStickers$2$unwrapped$3
            r0.<init>(r2, r6, r3)
            r14.L$0 = r6
            r14.label = r5
            java.lang.Object r0 = X.C616131n.A00(r14, r1, r0)
            if (r0 != r4) goto L_0x0128
            return r4
        L_0x011f:
            r6 = r3
            goto L_0x0103
        L_0x0121:
            java.lang.Object r6 = r14.L$0
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            X.C57682u2.A01(r15)
        L_0x0128:
            throw r6
        L_0x0129:
            java.lang.Object r1 = X.C73723fy.A03(r2)
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            throw r1
        L_0x0130:
            boolean r0 = r6 instanceof X.C29651ks
            if (r0 != 0) goto L_0x0162
            boolean r0 = r6 instanceof X.C29641ko
            if (r0 != 0) goto L_0x014f
            if (r6 != 0) goto L_0x014a
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Unknown error received: "
            java.lang.String r0 = X.AnonymousClass000.A0P(r8, r0, r1)
            java.lang.UnknownError r1 = new java.lang.UnknownError
            r1.<init>(r0)
            throw r1
        L_0x014a:
            X.3f1 r1 = X.C73153f1.A00()
            throw r1
        L_0x014f:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Unknown error code: "
            r1.append(r0)
            r0 = 0
            java.lang.String r0 = X.AnonymousClass000.A0h(r1, r0)
            java.lang.IllegalStateException r1 = X.AnonymousClass001.A0e(r0)
            throw r1
        L_0x0162:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Unknown error: "
            r1.append(r0)
            X.1ks r6 = (X.C29651ks) r6
            java.lang.Throwable r0 = r6.A00
            java.lang.String r0 = X.AnonymousClass000.A0R(r0, r1)
            java.lang.IllegalStateException r1 = X.AnonymousClass001.A0e(r0)
            throw r1
        L_0x0178:
            X.1kp r6 = (X.AnonymousClass1kp) r6
            java.lang.Throwable r1 = r6.A00
            throw r1
        L_0x017d:
            boolean r0 = r6 instanceof X.AnonymousClass1l0
            if (r0 == 0) goto L_0x01e8
            X.1l0 r6 = (X.AnonymousClass1l0) r6
            java.lang.Object r1 = r6.A00
            X.38x r1 = (X.C633538x) r1
            if (r1 == 0) goto L_0x01e7
            X.2xR r3 = r14.this$0
            X.4C1 r0 = r3.A07
            java.lang.Object r4 = r0.get()
            X.32Z r4 = (X.AnonymousClass32Z) r4
            java.lang.String r6 = r1.A05
            java.lang.String r7 = r1.A06
            java.lang.String r8 = r1.A03
            java.lang.String r9 = r1.A07
            java.lang.String r10 = r1.A09
            java.lang.String r11 = r1.A08
            java.lang.String r12 = r1.A04
            X.38w r5 = r1.A00
            java.util.List r13 = r1.A0A
            X.2iT r8 = r4.A02(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            java.util.List r0 = r8.A05
            X.C162457s7.A0D(r0)
            java.util.Iterator r9 = r0.iterator()
        L_0x01b2:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x01e4
            X.39M r7 = X.AnonymousClass0x7.A0b(r9)
            java.lang.String r2 = r7.A05
            if (r2 == 0) goto L_0x01b2
            X.2mU r1 = r3.A03     // Catch:{ all -> 0x01df }
            X.2jB r0 = new X.2jB     // Catch:{ all -> 0x01df }
            r0.<init>(r2)     // Catch:{ all -> 0x01df }
            java.io.File r6 = r1.A00(r0)     // Catch:{ all -> 0x01df }
            boolean r0 = r6.exists()     // Catch:{ all -> 0x01df }
            if (r0 == 0) goto L_0x01b2
            long r4 = r6.length()     // Catch:{ all -> 0x01df }
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x01b2
            X.AnonymousClass39M.A01(r7, r6)     // Catch:{ all -> 0x01df }
            goto L_0x01b2
        L_0x01df:
            r0 = move-exception
            X.AnonymousClass3Z0.A01(r0)
            goto L_0x01b2
        L_0x01e4:
            java.util.List r0 = r8.A05
            return r0
        L_0x01e7:
            return r3
        L_0x01e8:
            X.3f1 r1 = X.C73153f1.A00()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.productinfra.avatar.data.AvatarStickersRepository$fetchOnDemandAvatarStickers$2.A09(java.lang.Object):java.lang.Object");
    }

    public final C84814Du A0A(Object obj, C84814Du r6) {
        return new AvatarStickersRepository$fetchOnDemandAvatarStickers$2(this.this$0, this.$stableIds, r6, this.$defaultPack);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
