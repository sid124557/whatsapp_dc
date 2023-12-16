package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;

/* renamed from: X.6RO  reason: invalid class name */
public final class AnonymousClass6RO extends C127196Ra {
    public final GoogleSignInOptions A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass6RO(android.content.Context r13, android.os.Looper r14, com.google.android.gms.auth.api.signin.GoogleSignInOptions r15, X.C187778xn r16, X.C187788xo r17, X.AnonymousClass7P4 r18) {
        /*
            r12 = this;
            r11 = 91
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r16
            r9 = r17
            r10 = r18
            r5.<init>(r6, r7, r8, r9, r10, r11)
            X.7ik r4 = new X.7ik
            if (r15 == 0) goto L_0x0041
            r4.<init>(r15)
        L_0x0015:
            java.lang.String r0 = X.C154847dq.A00()
            r4.A03 = r0
            java.util.Set r1 = r10.A06
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0045
            java.util.Iterator r3 = r1.iterator()
        L_0x0027:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0045
            java.lang.Object r2 = r3.next()
            r0 = 0
            com.google.android.gms.common.api.Scope[] r0 = new com.google.android.gms.common.api.Scope[r0]
            java.util.Set r1 = r4.A05
            r1.add(r2)
            java.util.List r0 = java.util.Arrays.asList(r0)
            r1.addAll(r0)
            goto L_0x0027
        L_0x0041:
            r4.<init>()
            goto L_0x0015
        L_0x0045:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r0 = r4.A00()
            r12.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6RO.<init>(android.content.Context, android.os.Looper, com.google.android.gms.auth.api.signin.GoogleSignInOptions, X.8xn, X.8xo, X.7P4):void");
    }

    public final Intent BD3() {
        Context context = this.A0F;
        GoogleSignInOptions googleSignInOptions = this.A00;
        C154827do.A00.A00("getSignInIntent()", AnonymousClass4L0.A0U());
        SignInConfiguration signInConfiguration = new SignInConfiguration(googleSignInOptions, context.getPackageName());
        Intent A09 = AnonymousClass0x9.A09("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        A09.setPackage(context.getPackageName());
        A09.setClass(context, SignInHubActivity.class);
        Bundle A08 = AnonymousClass002.A08();
        A08.putParcelable("config", signInConfiguration);
        A09.putExtra("config", A08);
        return A09;
    }

    public final boolean Bhi() {
        return true;
    }

    public final int B9m() {
        return 12451000;
    }
}
