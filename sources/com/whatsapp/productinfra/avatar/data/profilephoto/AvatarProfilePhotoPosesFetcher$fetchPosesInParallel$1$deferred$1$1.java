package com.whatsapp.productinfra.avatar.data.profilephoto;

import X.AnonymousClass4C6;
import X.AnonymousClass4GR;
import X.C49662gt;
import X.C59022wD;
import X.C632138j;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.data.profilephoto.AvatarProfilePhotoPosesFetcher$fetchPosesInParallel$1$deferred$1$1", f = "AvatarProfilePhotoPosesFetcher.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarProfilePhotoPosesFetcher$fetchPosesInParallel$1$deferred$1$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ boolean $failFast;
    public final /* synthetic */ boolean $invalidate;
    public final /* synthetic */ C632138j $pose;
    public final /* synthetic */ AnonymousClass4C6 $scope;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ C49662gt this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarProfilePhotoPosesFetcher$fetchPosesInParallel$1$deferred$1$1(C632138j r2, C49662gt r3, C84814Du r4, AnonymousClass4C6 r5, boolean z, boolean z2) {
        super(r4, 2);
        this.$failFast = z;
        this.$scope = r5;
        this.$invalidate = z2;
        this.this$0 = r3;
        this.$pose = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0062, code lost:
        if (r2 == null) goto L_0x0051;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0062  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A09(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.label
            if (r0 != 0) goto L_0x0066
            X.C57682u2.A01(r6)
            boolean r0 = r5.$invalidate
            X.2gt r4 = r5.this$0
            X.38j r2 = r5.$pose
            r3 = 0
            if (r0 == 0) goto L_0x0020
            java.lang.String r0 = r2.A01     // Catch:{ all -> 0x003c }
            android.graphics.Bitmap r1 = r4.A00(r0)     // Catch:{ all -> 0x003c }
            if (r1 == 0) goto L_0x003a
            java.lang.String r0 = r2.A00     // Catch:{ all -> 0x003c }
            X.2kd r2 = new X.2kd     // Catch:{ all -> 0x003c }
            r2.<init>(r1, r0)     // Catch:{ all -> 0x003c }
            goto L_0x0041
        L_0x0020:
            X.2Wt r1 = r4.A02     // Catch:{ all -> 0x003c }
            java.lang.String r0 = r2.A01     // Catch:{ all -> 0x003c }
            android.graphics.Bitmap r1 = r1.A00(r0)     // Catch:{ all -> 0x003c }
            if (r1 != 0) goto L_0x0032
            java.lang.String r0 = r2.A01     // Catch:{ all -> 0x003c }
            android.graphics.Bitmap r1 = r4.A00(r0)     // Catch:{ all -> 0x003c }
            if (r1 == 0) goto L_0x003a
        L_0x0032:
            java.lang.String r0 = r2.A00     // Catch:{ all -> 0x003c }
            X.2kd r2 = new X.2kd     // Catch:{ all -> 0x003c }
            r2.<init>(r1, r0)     // Catch:{ all -> 0x003c }
            goto L_0x0041
        L_0x003a:
            r2 = r3
            goto L_0x0041
        L_0x003c:
            r0 = move-exception
            X.3Z0 r2 = X.AnonymousClass3Z0.A01(r0)
        L_0x0041:
            java.lang.Throwable r1 = X.AnonymousClass3Z9.A00(r2)
            if (r1 == 0) goto L_0x004c
            java.lang.String r0 = "AvatarProfilePhotoPosesFetcher/fetchPoses"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x004c:
            boolean r0 = r2 instanceof X.AnonymousClass3Z0
            if (r0 == 0) goto L_0x0062
            r2 = r3
        L_0x0051:
            boolean r0 = r5.$failFast
            if (r0 == 0) goto L_0x0065
            X.4C6 r2 = r5.$scope
            java.lang.String r1 = "Fail fast enabled and bitmap download failed"
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            r0.<init>(r1)
            X.AnonymousClass349.A03(r0, r2)
            return r3
        L_0x0062:
            if (r2 != 0) goto L_0x0065
            goto L_0x0051
        L_0x0065:
            return r2
        L_0x0066:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.productinfra.avatar.data.profilephoto.AvatarProfilePhotoPosesFetcher$fetchPosesInParallel$1$deferred$1$1.A09(java.lang.Object):java.lang.Object");
    }

    public final C84814Du A0A(Object obj, C84814Du r9) {
        boolean z = this.$failFast;
        AnonymousClass4C6 r4 = this.$scope;
        boolean z2 = this.$invalidate;
        AvatarProfilePhotoPosesFetcher$fetchPosesInParallel$1$deferred$1$1 avatarProfilePhotoPosesFetcher$fetchPosesInParallel$1$deferred$1$1 = new AvatarProfilePhotoPosesFetcher$fetchPosesInParallel$1$deferred$1$1(this.$pose, this.this$0, r9, r4, z, z2);
        avatarProfilePhotoPosesFetcher$fetchPosesInParallel$1$deferred$1$1.L$0 = obj;
        return avatarProfilePhotoPosesFetcher$fetchPosesInParallel$1$deferred$1$1;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
