package com.google.android.play.core.integrity;

import com.google.android.gms.common.api.ApiException;

public class IntegrityServiceException extends ApiException {
    public final Throwable a;

    public final synchronized Throwable getCause() {
        return this.a;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public IntegrityServiceException(java.lang.Throwable r5, int r6) {
        /*
            r4 = this;
            java.util.Locale r3 = java.util.Locale.ROOT
            java.lang.Object[] r2 = X.AnonymousClass002.A0M()
            X.C18270x1.A1Q(r2, r6)
            r1 = 1
            java.lang.String r0 = X.C155387en.A00(r6)
            r2[r1] = r0
            java.lang.String r0 = "Integrity API error (%d): %s."
            java.lang.String r1 = java.lang.String.format(r3, r0, r2)
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r0.<init>(r6, r1)
            r4.<init>(r0)
            r4.a = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.integrity.IntegrityServiceException.<init>(java.lang.Throwable, int):void");
    }

    public int getErrorCode() {
        return this.mStatus.A01;
    }
}
