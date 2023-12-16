package com.whatsapp.calling.avatar;

import X.AnonymousClass0x7;
import X.AnonymousClass20D;
import X.AnonymousClass4C6;
import X.AnonymousClass66U;
import X.C103425Mx;
import X.C18260x0;
import X.C56612sH;
import X.C616131n;
import X.C84814Du;
import X.C85494Gl;
import com.whatsapp.calling.avatar.data.PersonalizedAvatarRepository;
import com.whatsapp.util.Log;

public final class CallAvatarARClassManager implements AnonymousClass66U {
    public static final long A05 = AnonymousClass0x7.A0C();
    public int A00;
    public final C103425Mx A01;
    public final PersonalizedAvatarRepository A02;
    public final C56612sH A03;
    public final AnonymousClass4C6 A04;

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.C84814Du r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof X.C74373h1
            if (r0 == 0) goto L_0x0026
            r5 = r10
            X.3h1 r5 = (X.C74373h1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0026
            int r2 = r2 - r1
            r5.label = r2
        L_0x0012:
            java.lang.Object r2 = r5.result
            X.218 r6 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r5.label
            r8 = 1
            if (r0 == 0) goto L_0x0031
            if (r0 != r8) goto L_0x002c
            java.lang.Object r1 = r5.L$1
            com.whatsapp.calling.avatar.CallAvatarARClassManager r1 = (com.whatsapp.calling.avatar.CallAvatarARClassManager) r1
            java.lang.Object r5 = r5.L$0
            com.whatsapp.calling.avatar.CallAvatarARClassManager r5 = (com.whatsapp.calling.avatar.CallAvatarARClassManager) r5
            goto L_0x0082
        L_0x0026:
            X.3h1 r5 = new X.3h1
            r5.<init>(r9, r10)
            goto L_0x0012
        L_0x002c:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        L_0x0031:
            X.C57682u2.A01(r2)
            X.5Mx r0 = r9.A01
            X.66R r7 = r0.A01
            android.content.SharedPreferences r1 = X.C18310x6.A0F(r7)
            java.lang.String r0 = "pref_last_ar_class_refresh_time"
            long r1 = X.AnonymousClass0x2.A0B(r1, r0)
            X.2sH r0 = r9.A03
            long r3 = X.C56612sH.A03(r0, r1)
            long r1 = A05
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0068
            android.content.SharedPreferences r1 = X.C18310x6.A0F(r7)
            java.lang.String r0 = "pref_ar_class"
            int r2 = X.C18280x3.A02(r1, r0)
            r9.A00 = r2
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "CallAvatarARClassManager/refreshARClass AR class retrieved from cache: "
            X.C18260x0.A0y(r0, r1, r2)
        L_0x0065:
            X.2wD r0 = X.C59022wD.A00
            return r0
        L_0x0068:
            com.whatsapp.calling.avatar.data.PersonalizedAvatarRepository r3 = r9.A02     // Catch:{ 23V -> 0x00ba }
            r5.L$0 = r9     // Catch:{ 23V -> 0x00ba }
            r5.L$1 = r9     // Catch:{ 23V -> 0x00ba }
            r5.label = r8     // Catch:{ 23V -> 0x00ba }
            X.3gB r2 = r3.A04     // Catch:{ 23V -> 0x00ba }
            r1 = 0
            com.whatsapp.calling.avatar.data.PersonalizedAvatarRepository$fetchARClass$2 r0 = new com.whatsapp.calling.avatar.data.PersonalizedAvatarRepository$fetchARClass$2     // Catch:{ 23V -> 0x00ba }
            r0.<init>(r3, r1)     // Catch:{ 23V -> 0x00ba }
            java.lang.Object r2 = X.C616131n.A00(r5, r2, r0)     // Catch:{ 23V -> 0x00ba }
            if (r2 != r6) goto L_0x007f
            goto L_0x00c1
        L_0x007f:
            r5 = r9
            r1 = r9
            goto L_0x0085
        L_0x0082:
            X.C57682u2.A01(r2)     // Catch:{ 23V -> 0x00ba }
        L_0x0085:
            int r0 = X.AnonymousClass001.A0K(r2)     // Catch:{ 23V -> 0x00ba }
            r1.A00 = r0     // Catch:{ 23V -> 0x00ba }
            X.5Mx r0 = r5.A01     // Catch:{ 23V -> 0x00ba }
            int r2 = r5.A00     // Catch:{ 23V -> 0x00ba }
            X.66R r4 = r0.A01     // Catch:{ 23V -> 0x00ba }
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A04(r4)     // Catch:{ 23V -> 0x00ba }
            java.lang.String r0 = "pref_ar_class"
            X.C18270x1.A0h(r1, r0, r2)     // Catch:{ 23V -> 0x00ba }
            X.2sH r0 = r5.A03     // Catch:{ 23V -> 0x00ba }
            long r2 = r0.A0H()     // Catch:{ 23V -> 0x00ba }
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A04(r4)     // Catch:{ 23V -> 0x00ba }
            java.lang.String r0 = "pref_last_ar_class_refresh_time"
            X.C18270x1.A0i(r1, r0, r2)     // Catch:{ 23V -> 0x00ba }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 23V -> 0x00ba }
            java.lang.String r0 = "CallAvatarARClassManager/refreshARClass AR class re-fetched: "
            r1.append(r0)     // Catch:{ 23V -> 0x00ba }
            int r0 = r5.A00     // Catch:{ 23V -> 0x00ba }
            X.C18260x0.A1G(r1, r0)     // Catch:{ 23V -> 0x00ba }
            goto L_0x0065
        L_0x00ba:
            r1 = move-exception
            java.lang.String r0 = "CallAvatarARClassManager/refreshARClass Failed to fetch AR class"
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x0065
        L_0x00c1:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.avatar.CallAvatarARClassManager.A00(X.4Du):java.lang.Object");
    }

    public void BMe() {
        Log.d("CallAvatarARClassManager/onAsyncInitUserRegisteredAndDbReady");
        C616131n.A02((C85494Gl) null, new CallAvatarARClassManager$onAsyncInitUserRegisteredAndDbReady$1(this, (C84814Du) null), this.A04, (AnonymousClass20D) null, 3);
    }

    public CallAvatarARClassManager(C103425Mx r1, PersonalizedAvatarRepository personalizedAvatarRepository, C56612sH r3, AnonymousClass4C6 r4) {
        C18260x0.A0R(r3, r1);
        this.A03 = r3;
        this.A04 = r4;
        this.A01 = r1;
        this.A02 = personalizedAvatarRepository;
    }

    public String BDW() {
        return "CallAvatarARClassManager";
    }

    public /* synthetic */ void BMd() {
    }
}
