package com.whatsapp.calling.avatar.data;

public final class FetchAvatarEffectUseCase {
    public final PersonalizedAvatarRepository A00;

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0045 A[Catch:{ 23V -> 0x0049 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0046 A[Catch:{ 23V -> 0x0049 }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.AnonymousClass305 r7, java.lang.String r8, X.C84814Du r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof X.C118515tf
            if (r0 == 0) goto L_0x001e
            r5 = r9
            X.5tf r5 = (X.C118515tf) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x001e
            int r2 = r2 - r1
            r5.label = r2
        L_0x0012:
            java.lang.Object r2 = r5.result
            X.218 r4 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r1 = r5.label
            r0 = 1
            if (r1 == 0) goto L_0x002d
            if (r1 != r0) goto L_0x0028
            goto L_0x0024
        L_0x001e:
            X.5tf r5 = new X.5tf
            r5.<init>(r6, r9)
            goto L_0x0012
        L_0x0024:
            X.C57682u2.A01(r2)     // Catch:{ 23V -> 0x0049 }
            goto L_0x0043
        L_0x0028:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        L_0x002d:
            X.C57682u2.A01(r2)
            com.whatsapp.calling.avatar.data.PersonalizedAvatarRepository r3 = r6.A00     // Catch:{ 23V -> 0x0049 }
            r5.label = r0     // Catch:{ 23V -> 0x0049 }
            X.3gB r2 = r3.A05     // Catch:{ 23V -> 0x0049 }
            r1 = 0
            com.whatsapp.calling.avatar.data.PersonalizedAvatarRepository$loadEffect$2 r0 = new com.whatsapp.calling.avatar.data.PersonalizedAvatarRepository$loadEffect$2     // Catch:{ 23V -> 0x0049 }
            r0.<init>(r3, r7, r8, r1)     // Catch:{ 23V -> 0x0049 }
            java.lang.Object r2 = X.C616131n.A00(r5, r2, r0)     // Catch:{ 23V -> 0x0049 }
            if (r2 != r4) goto L_0x0043
            return r4
        L_0x0043:
            if (r2 == 0) goto L_0x0046
            return r2
        L_0x0046:
            X.4ik r0 = X.C91004ik.A00     // Catch:{ 23V -> 0x0049 }
            throw r0     // Catch:{ 23V -> 0x0049 }
        L_0x0049:
            r1 = move-exception
            X.4id r0 = new X.4id
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.avatar.data.FetchAvatarEffectUseCase.A00(X.305, java.lang.String, X.4Du):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.C101735Fx r22, java.lang.String r23, X.C84814Du r24) {
        /*
            r21 = this;
            r3 = r24
            r4 = r23
            r11 = r22
            boolean r0 = r3 instanceof X.C118705ty
            r13 = r21
            if (r0 == 0) goto L_0x00bb
            r12 = r3
            X.5ty r12 = (X.C118705ty) r12
            int r2 = r12.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00bb
            int r2 = r2 - r1
            r12.label = r2
        L_0x001a:
            java.lang.Object r14 = r12.result
            X.218 r10 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r1 = r12.label
            r8 = 2
            r0 = 1
            if (r1 == 0) goto L_0x0049
            if (r1 == r0) goto L_0x005b
            if (r1 != r8) goto L_0x0115
            java.lang.Object r9 = r12.L$2
            X.305 r9 = (X.AnonymousClass305) r9
            java.lang.Object r11 = r12.L$1
            X.5Fx r11 = (X.C101735Fx) r11
            java.lang.Object r4 = r12.L$0
            java.lang.String r4 = (java.lang.String) r4
            X.C57682u2.A01(r14)
        L_0x0037:
            X.9Te r14 = (X.C194509Te) r14
            if (r11 == 0) goto L_0x0102
            java.lang.String r8 = r14.A04()
            java.lang.String r7 = r14.A02()
            com.whatsapp.calling.avatar.viewmodel.CallAvatarViewModel r0 = r11.A00
            X.5ZG r6 = r0.A08
            monitor-enter(r6)
            goto L_0x00c2
        L_0x0049:
            X.C57682u2.A01(r14)
            r12.L$0 = r13
            r12.L$1 = r4
            r12.L$2 = r11
            r12.label = r0
            java.lang.Object r14 = r13.A02(r12)
            if (r14 != r10) goto L_0x006a
            return r10
        L_0x005b:
            java.lang.Object r11 = r12.L$2
            X.5Fx r11 = (X.C101735Fx) r11
            java.lang.Object r4 = r12.L$1
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r13 = r12.L$0
            com.whatsapp.calling.avatar.data.FetchAvatarEffectUseCase r13 = (com.whatsapp.calling.avatar.data.FetchAvatarEffectUseCase) r13
            X.C57682u2.A01(r14)
        L_0x006a:
            X.2ij r14 = (X.C50762ij) r14
            X.305 r9 = r14.A00
            if (r9 == 0) goto L_0x0127
            if (r11 == 0) goto L_0x00ac
            java.lang.String r14 = "1001"
            java.lang.String r7 = ""
            com.whatsapp.calling.avatar.viewmodel.CallAvatarViewModel r0 = r11.A00
            X.5ZG r6 = r0.A08
            monitor-enter(r6)
            X.4sm r5 = r6.A01     // Catch:{ all -> 0x0124 }
            if (r5 != 0) goto L_0x0085
            java.lang.String r0 = "CallAvatarLogger/onMetadataFetched No session"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x0124 }
            goto L_0x00ab
        L_0x0085:
            X.594 r0 = X.AnonymousClass594.METADATA_FETCHED_OR_CONSENT_REQUESTED     // Catch:{ all -> 0x0124 }
            boolean r0 = r6.A06(r0, r5)     // Catch:{ all -> 0x0124 }
            if (r0 != 0) goto L_0x0093
            java.lang.String r0 = "CallAvatarLogger/onMetadataFetched Session has unexpected fields"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x0124 }
            goto L_0x00ab
        L_0x0093:
            X.2sH r0 = r6.A02     // Catch:{ all -> 0x0124 }
            long r2 = r0.A0H()     // Catch:{ all -> 0x0124 }
            java.lang.Long r0 = r5.A0F     // Catch:{ all -> 0x0124 }
            if (r0 == 0) goto L_0x011a
            long r0 = r0.longValue()     // Catch:{ all -> 0x0124 }
            java.lang.Long r0 = X.C18310x6.A0f(r2, r0)     // Catch:{ all -> 0x0124 }
            r5.A0B = r0     // Catch:{ all -> 0x0124 }
            r5.A0J = r14     // Catch:{ all -> 0x0124 }
            r5.A0K = r7     // Catch:{ all -> 0x0124 }
        L_0x00ab:
            monitor-exit(r6)
        L_0x00ac:
            r12.L$0 = r4
            r12.L$1 = r11
            r12.L$2 = r9
            r12.label = r8
            java.lang.Object r14 = r13.A00(r9, r4, r12)
            if (r14 != r10) goto L_0x0037
            return r10
        L_0x00bb:
            X.5ty r12 = new X.5ty
            r12.<init>(r13, r3)
            goto L_0x001a
        L_0x00c2:
            X.4sm r5 = r6.A01     // Catch:{ all -> 0x0124 }
            if (r5 != 0) goto L_0x00cc
            java.lang.String r0 = "CallAvatarLogger/onEffectFetched No session"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x0124 }
            goto L_0x0101
        L_0x00cc:
            X.594 r0 = X.AnonymousClass594.EFFECT_FETCHED     // Catch:{ all -> 0x0124 }
            boolean r0 = r6.A06(r0, r5)     // Catch:{ all -> 0x0124 }
            if (r0 != 0) goto L_0x00da
            java.lang.String r0 = "CallAvatarLogger/onEffectFetched Session has unexpected fields"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x0124 }
            goto L_0x0101
        L_0x00da:
            X.2sH r0 = r6.A02     // Catch:{ all -> 0x0124 }
            long r2 = r0.A0H()     // Catch:{ all -> 0x0124 }
            java.lang.Long r0 = r5.A0F     // Catch:{ all -> 0x0124 }
            if (r0 == 0) goto L_0x011f
            long r0 = r0.longValue()     // Catch:{ all -> 0x0124 }
            long r2 = r2 - r0
            java.lang.Long r0 = r5.A0B     // Catch:{ all -> 0x0124 }
            if (r0 == 0) goto L_0x00fc
            long r0 = r0.longValue()     // Catch:{ all -> 0x0124 }
            java.lang.Long r0 = X.C18310x6.A0f(r2, r0)     // Catch:{ all -> 0x0124 }
            r5.A09 = r0     // Catch:{ all -> 0x0124 }
            r5.A0L = r8     // Catch:{ all -> 0x0124 }
            r5.A0I = r7     // Catch:{ all -> 0x0124 }
            goto L_0x0101
        L_0x00fc:
            java.lang.IllegalStateException r0 = X.C18290x4.A0Y()     // Catch:{ all -> 0x0124 }
            goto L_0x0123
        L_0x0101:
            monitor-exit(r6)
        L_0x0102:
            java.lang.String r0 = r9.A03
            java.lang.String r17 = "1001"
            java.lang.String r19 = ""
            r15 = 0
            X.5Xg r13 = new X.5Xg
            r16 = r15
            r18 = r0
            r20 = r4
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)
            return r13
        L_0x0115:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        L_0x011a:
            java.lang.IllegalStateException r0 = X.C18290x4.A0Y()     // Catch:{ all -> 0x0124 }
            goto L_0x0123
        L_0x011f:
            java.lang.IllegalStateException r0 = X.C18290x4.A0Y()     // Catch:{ all -> 0x0124 }
        L_0x0123:
            throw r0     // Catch:{ all -> 0x0124 }
        L_0x0124:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x0127:
            X.4ij r0 = X.C90994ij.A00
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.avatar.data.FetchAvatarEffectUseCase.A01(X.5Fx, java.lang.String, X.4Du):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0045 A[Catch:{ 23V -> 0x0049 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0046 A[Catch:{ 23V -> 0x0049 }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(X.C84814Du r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C118505te
            if (r0 == 0) goto L_0x001e
            r5 = r7
            X.5te r5 = (X.C118505te) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x001e
            int r2 = r2 - r1
            r5.label = r2
        L_0x0012:
            java.lang.Object r2 = r5.result
            X.218 r4 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r1 = r5.label
            r0 = 1
            if (r1 == 0) goto L_0x002d
            if (r1 != r0) goto L_0x0028
            goto L_0x0024
        L_0x001e:
            X.5te r5 = new X.5te
            r5.<init>(r6, r7)
            goto L_0x0012
        L_0x0024:
            X.C57682u2.A01(r2)     // Catch:{ 23V -> 0x0049 }
            goto L_0x0043
        L_0x0028:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        L_0x002d:
            X.C57682u2.A01(r2)
            com.whatsapp.calling.avatar.data.PersonalizedAvatarRepository r3 = r6.A00     // Catch:{ 23V -> 0x0049 }
            r5.label = r0     // Catch:{ 23V -> 0x0049 }
            X.3gB r2 = r3.A05     // Catch:{ 23V -> 0x0049 }
            r1 = 0
            com.whatsapp.calling.avatar.data.PersonalizedAvatarRepository$fetchMetadata$2 r0 = new com.whatsapp.calling.avatar.data.PersonalizedAvatarRepository$fetchMetadata$2     // Catch:{ 23V -> 0x0049 }
            r0.<init>(r3, r1)     // Catch:{ 23V -> 0x0049 }
            java.lang.Object r2 = X.C616131n.A00(r5, r2, r0)     // Catch:{ 23V -> 0x0049 }
            if (r2 != r4) goto L_0x0043
            return r4
        L_0x0043:
            if (r2 == 0) goto L_0x0046
            return r2
        L_0x0046:
            X.4il r0 = X.C91014il.A00     // Catch:{ 23V -> 0x0049 }
            throw r0     // Catch:{ 23V -> 0x0049 }
        L_0x0049:
            r1 = move-exception
            X.4ie r0 = new X.4ie
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.avatar.data.FetchAvatarEffectUseCase.A02(X.4Du):java.lang.Object");
    }

    public FetchAvatarEffectUseCase(PersonalizedAvatarRepository personalizedAvatarRepository) {
        this.A00 = personalizedAvatarRepository;
    }
}
