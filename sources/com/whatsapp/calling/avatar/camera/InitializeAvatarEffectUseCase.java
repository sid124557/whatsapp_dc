package com.whatsapp.calling.avatar.camera;

import X.C18260x0;
import X.C69263Wi;
import com.whatsapp.voipcalling.camera.VoipCameraManager;

public final class InitializeAvatarEffectUseCase {
    public final C69263Wi A00;
    public final VoipCameraManager A01;

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0080 A[Catch:{ CancellationException -> 0x00c1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008d A[Catch:{ CancellationException -> 0x00c1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x009b A[Catch:{ CancellationException -> 0x00c1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b6 A[Catch:{ CancellationException -> 0x00c1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.AnonymousClass5HR r11, X.C106005Xg r12, X.C84814Du r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof X.C118775u5
            if (r0 == 0) goto L_0x0031
            r6 = r13
            X.5u5 r6 = (X.C118775u5) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0031
            int r2 = r2 - r1
            r6.label = r2
        L_0x0012:
            java.lang.Object r1 = r6.result
            X.218 r7 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r6.label
            r5 = 2
            r4 = 1
            if (r0 == 0) goto L_0x0053
            if (r0 == r4) goto L_0x0040
            if (r0 != r5) goto L_0x003b
            int r8 = r6.I$1
            int r3 = r6.I$0
            java.lang.Object r11 = r6.L$2
            X.5HR r11 = (X.AnonymousClass5HR) r11
            java.lang.Object r12 = r6.L$1
            X.5Xg r12 = (X.C106005Xg) r12
            java.lang.Object r2 = r6.L$0
            com.whatsapp.calling.avatar.camera.InitializeAvatarEffectUseCase r2 = (com.whatsapp.calling.avatar.camera.InitializeAvatarEffectUseCase) r2
            goto L_0x0037
        L_0x0031:
            X.5u5 r6 = new X.5u5
            r6.<init>(r10, r13)
            goto L_0x0012
        L_0x0037:
            X.C57682u2.A01(r1)     // Catch:{ CancellationException -> 0x00c1 }
            goto L_0x00b2
        L_0x003b:
            java.lang.IllegalStateException r1 = X.AnonymousClass001.A0d()
            throw r1
        L_0x0040:
            int r9 = r6.I$2
            int r8 = r6.I$1
            int r3 = r6.I$0
            java.lang.Object r11 = r6.L$2
            X.5HR r11 = (X.AnonymousClass5HR) r11
            java.lang.Object r12 = r6.L$1
            X.5Xg r12 = (X.C106005Xg) r12
            java.lang.Object r2 = r6.L$0
            com.whatsapp.calling.avatar.camera.InitializeAvatarEffectUseCase r2 = (com.whatsapp.calling.avatar.camera.InitializeAvatarEffectUseCase) r2
            goto L_0x008f
        L_0x0053:
            X.C57682u2.A01(r1)
            r2 = r10
            r9 = 0
            r3 = 3
        L_0x0059:
            r6.L$0 = r2     // Catch:{ CancellationException -> 0x00c1 }
            r6.L$1 = r12     // Catch:{ CancellationException -> 0x00c1 }
            r6.L$2 = r11     // Catch:{ CancellationException -> 0x00c1 }
            r6.I$0 = r3     // Catch:{ CancellationException -> 0x00c1 }
            r6.I$1 = r9     // Catch:{ CancellationException -> 0x00c1 }
            r6.I$2 = r9     // Catch:{ CancellationException -> 0x00c1 }
            r6.label = r4     // Catch:{ CancellationException -> 0x00c1 }
            X.4Du r0 = X.C57702u4.A01(r6)     // Catch:{ CancellationException -> 0x00c1 }
            X.46G r8 = new X.46G     // Catch:{ CancellationException -> 0x00c1 }
            r8.<init>(r0, r4)     // Catch:{ CancellationException -> 0x00c1 }
            r8.A0A()     // Catch:{ CancellationException -> 0x00c1 }
            X.5pE r1 = new X.5pE     // Catch:{ CancellationException -> 0x00c1 }
            r1.<init>(r2, r11, r8)     // Catch:{ CancellationException -> 0x00c1 }
            com.whatsapp.voipcalling.camera.VoipCameraManager r0 = r2.A01     // Catch:{ CancellationException -> 0x00c1 }
            boolean r0 = r0.enableAREffect(r12, r1)     // Catch:{ CancellationException -> 0x00c1 }
            if (r0 != 0) goto L_0x0087
            java.lang.Boolean r0 = X.C18320x8.A0U()     // Catch:{ CancellationException -> 0x00c1 }
            r8.BkD(r0)     // Catch:{ CancellationException -> 0x00c1 }
        L_0x0087:
            java.lang.Object r1 = r8.A06()     // Catch:{ CancellationException -> 0x00c1 }
            if (r1 == r7) goto L_0x00c0
            r8 = r9
            goto L_0x0092
        L_0x008f:
            X.C57682u2.A01(r1)     // Catch:{ CancellationException -> 0x00c1 }
        L_0x0092:
            boolean r0 = X.AnonymousClass001.A1Z(r1)     // Catch:{ CancellationException -> 0x00c1 }
            if (r0 == 0) goto L_0x009b
            X.2wD r0 = X.C59022wD.A00     // Catch:{ CancellationException -> 0x00c1 }
            return r0
        L_0x009b:
            if (r9 >= r5) goto L_0x00b2
            r6.L$0 = r2     // Catch:{ CancellationException -> 0x00c1 }
            r6.L$1 = r12     // Catch:{ CancellationException -> 0x00c1 }
            r6.L$2 = r11     // Catch:{ CancellationException -> 0x00c1 }
            r6.I$0 = r3     // Catch:{ CancellationException -> 0x00c1 }
            r6.I$1 = r8     // Catch:{ CancellationException -> 0x00c1 }
            r6.label = r5     // Catch:{ CancellationException -> 0x00c1 }
            r0 = 200(0xc8, double:9.9E-322)
            java.lang.Object r0 = X.C616231o.A00(r6, r0)     // Catch:{ CancellationException -> 0x00c1 }
            if (r0 != r7) goto L_0x00b2
            goto L_0x00b7
        L_0x00b2:
            int r9 = r8 + 1
            if (r9 < r3) goto L_0x0059
            goto L_0x00b8
        L_0x00b7:
            return r7
        L_0x00b8:
            java.lang.String r0 = "voip/InitializeAvatarEffectUseCase/invoke All attempts to enable AR effect failed"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ CancellationException -> 0x00c1 }
            X.4ii r0 = X.C90984ii.A00     // Catch:{ CancellationException -> 0x00c1 }
            throw r0     // Catch:{ CancellationException -> 0x00c1 }
        L_0x00c0:
            return r7
        L_0x00c1:
            r1 = move-exception
            com.whatsapp.voipcalling.camera.VoipCameraManager r0 = r2.A01
            boolean r0 = r0.disableAREffect()
            if (r0 != 0) goto L_0x00d5
            java.lang.String r0 = "voip/InitializeAvatarEffectUseCase/invoke Disabling during cancellation failed"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.5tc r0 = new X.5tc
            r0.<init>(r1)
            throw r0
        L_0x00d5:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.avatar.camera.InitializeAvatarEffectUseCase.A00(X.5HR, X.5Xg, X.4Du):java.lang.Object");
    }

    public InitializeAvatarEffectUseCase(C69263Wi r1, VoipCameraManager voipCameraManager) {
        C18260x0.A0Q(r1, voipCameraManager);
        this.A00 = r1;
        this.A01 = voipCameraManager;
    }
}
