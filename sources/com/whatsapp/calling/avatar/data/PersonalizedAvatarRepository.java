package com.whatsapp.calling.avatar.data;

import X.AnonymousClass5HO;
import X.C162457s7;
import X.C183538qC;
import X.C27161dN;
import X.C41292Jr;
import X.C73853gB;

public final class PersonalizedAvatarRepository {
    public final C27161dN A00;
    public final AnonymousClass5HO A01;
    public final C41292Jr A02;
    public final C183538qC A03;
    public final C73853gB A04;
    public final C73853gB A05;

    public PersonalizedAvatarRepository(C27161dN r2, AnonymousClass5HO r3, C41292Jr r4, C183538qC r5, C73853gB r6, C73853gB r7) {
        C162457s7.A0J(r5, 1);
        this.A03 = r5;
        this.A00 = r2;
        this.A02 = r4;
        this.A01 = r3;
        this.A04 = r6;
        this.A05 = r7;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.C84594Cy r6, java.lang.String r7, X.C84814Du r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof X.C74093gZ
            if (r0 == 0) goto L_0x0022
            r4 = r8
            X.3gZ r4 = (X.C74093gZ) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0022
            int r2 = r2 - r1
            r4.label = r2
        L_0x0012:
            java.lang.Object r2 = r4.result
            X.218 r3 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r1 = r4.label
            r0 = 1
            if (r1 == 0) goto L_0x0031
            if (r1 != r0) goto L_0x002c
            java.lang.Object r7 = r4.L$0
            java.lang.String r7 = (java.lang.String) r7
            goto L_0x0028
        L_0x0022:
            X.3gZ r4 = new X.3gZ
            r4.<init>(r5, r8)
            goto L_0x0012
        L_0x0028:
            X.C57682u2.A01(r2)     // Catch:{ CancellationException -> 0x005a, Exception -> 0x004a }
            return r2
        L_0x002c:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        L_0x0031:
            X.C57682u2.A01(r2)
            X.4Gl r2 = r4.B5w()     // Catch:{ CancellationException -> 0x005a, Exception -> 0x004a }
            r4.L$0 = r7     // Catch:{ CancellationException -> 0x005a, Exception -> 0x004a }
            r4.label = r0     // Catch:{ CancellationException -> 0x005a, Exception -> 0x004a }
            r1 = 0
            com.whatsapp.graphql.GraphqlRequest$postAwait$2 r0 = new com.whatsapp.graphql.GraphqlRequest$postAwait$2     // Catch:{ CancellationException -> 0x005a, Exception -> 0x004a }
            r0.<init>(r6, r1)     // Catch:{ CancellationException -> 0x005a, Exception -> 0x004a }
            java.lang.Object r2 = X.C616131n.A00(r4, r2, r0)     // Catch:{ CancellationException -> 0x005a, Exception -> 0x004a }
            if (r2 != r3) goto L_0x0049
            return r3
        L_0x0049:
            return r2
        L_0x004a:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r7)
            java.lang.String r0 = " Exception in postRequest: "
            X.C18260x0.A1Q(r1, r0, r2)
            X.1Mu r0 = new X.1Mu
            r0.<init>(r2)
            throw r0
        L_0x005a:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r7)
            java.lang.String r0 = " Request canceled"
            X.C18260x0.A1L(r1, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.avatar.data.PersonalizedAvatarRepository.A00(X.4Cy, java.lang.String, X.4Du):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: X.28J} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.AnonymousClass2SI r4, java.lang.String r5) {
        /*
            r3 = this;
            X.2WN r2 = r4.A03
            X.C162457s7.A0D(r2)
            X.2fE r1 = r4.A04
            X.C162457s7.A0D(r1)
            int r0 = r4.A00
            if (r0 == 0) goto L_0x0066
            r2 = 0
            java.lang.Object r1 = r1.A00(r2)
            boolean r0 = r1 instanceof X.AnonymousClass28J
            if (r0 == 0) goto L_0x001a
            r2 = r1
            X.28J r2 = (X.AnonymousClass28J) r2
        L_0x001a:
            boolean r0 = r2 instanceof X.AnonymousClass1kq
            if (r0 == 0) goto L_0x002e
            X.1kq r2 = (X.AnonymousClass1kq) r2
            java.lang.Object r2 = r2.A00
            java.lang.Throwable r2 = (java.lang.Throwable) r2
        L_0x0024:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r5)
            java.lang.String r0 = " Error response: "
            X.C18260x0.A1Q(r1, r0, r2)
            throw r2
        L_0x002e:
            boolean r0 = r2 instanceof X.AnonymousClass1kr
            if (r0 == 0) goto L_0x003c
            X.1kr r2 = (X.AnonymousClass1kr) r2
            java.util.List r0 = r2.A00
            X.1Mv r2 = new X.1Mv
            r2.<init>(r0)
            goto L_0x0024
        L_0x003c:
            boolean r0 = r2 instanceof X.C29641ko
            if (r0 == 0) goto L_0x0047
            r0 = 0
            X.1Mw r2 = new X.1Mw
            r2.<init>(r0)
            goto L_0x0024
        L_0x0047:
            boolean r0 = r2 instanceof X.AnonymousClass1kp
            if (r0 == 0) goto L_0x0055
            X.1kp r2 = (X.AnonymousClass1kp) r2
            java.lang.Throwable r0 = r2.A00
            X.1Mu r2 = new X.1Mu
            r2.<init>(r0)
            goto L_0x0024
        L_0x0055:
            boolean r0 = r2 instanceof X.C29651ks
            if (r0 == 0) goto L_0x0063
            X.1ks r2 = (X.C29651ks) r2
            java.lang.Throwable r0 = r2.A00
            X.1Mu r2 = new X.1Mu
            r2.<init>(r0)
            goto L_0x0024
        L_0x0063:
            X.1My r2 = X.C22401My.A00
            goto L_0x0024
        L_0x0066:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r5)
            java.lang.String r0 = " Success"
            X.C18260x0.A1L(r1, r0)
            java.lang.Object r0 = r2.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.avatar.data.PersonalizedAvatarRepository.A01(X.2SI, java.lang.String):java.lang.Object");
    }
}
