package X;

import android.content.Context;
import android.credentials.CreateCredentialException;
import android.credentials.CreateCredentialRequest;
import android.credentials.Credential;
import android.credentials.CredentialManager;
import android.credentials.CredentialOption;
import android.credentials.GetCredentialException;
import android.credentials.GetCredentialRequest;
import android.credentials.GetCredentialResponse;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Parcelable;
import android.text.TextUtils;
import com.whatsapp.R;
import java.util.concurrent.Executor;

/* renamed from: X.0dZ  reason: invalid class name and case insensitive filesystem */
public final class C08210dZ implements AnonymousClass0u5 {
    public final CredentialManager A00;

    public static final C006406d A01(Bundle bundle) {
        try {
            String string = bundle.getString("androidx.credentials.BUNDLE_KEY_ID");
            String string2 = bundle.getString("androidx.credentials.BUNDLE_KEY_PASSWORD");
            C162457s7.A0H(string);
            C162457s7.A0H(string2);
            return new C006406d(string2, bundle);
        } catch (Exception unused) {
            throw new AnonymousClass0GL();
        }
    }

    public static final C006306c A02(Bundle bundle) {
        try {
            String string = bundle.getString("androidx.credentials.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON");
            C162457s7.A0H(string);
            return new C006306c(string, bundle);
        } catch (Exception unused) {
            throw new AnonymousClass0GL();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:97|98|99) */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x02b7, code lost:
        return new X.C006906i(r4, r5);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:97:0x02b2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass0GP A04(java.lang.String r4, java.lang.String r5) {
        /*
            java.lang.String r0 = "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION"
            boolean r0 = X.C175728Zm.A0S(r4, r0, false)     // Catch:{ 0GL -> 0x02be }
            if (r0 == 0) goto L_0x02b8
            java.lang.String r3 = "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/"
            X.07O r1 = new X.07O     // Catch:{ 0GL -> 0x02b2 }
            r1.<init>()     // Catch:{ 0GL -> 0x02b2 }
            r0 = 0
            X.07R r2 = new X.07R     // Catch:{ 0GL -> 0x02b2 }
            r2.<init>(r1, r0)     // Catch:{ 0GL -> 0x02b2 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r3)     // Catch:{ 0GL -> 0x02b2 }
            java.lang.String r0 = "androidx.credentials.TYPE_ABORT_ERROR"
            boolean r0 = A08(r0, r4, r1)     // Catch:{ 0GL -> 0x02b2 }
            if (r0 == 0) goto L_0x002d
            X.06y r0 = new X.06y     // Catch:{ 0GL -> 0x02b2 }
            r0.<init>()     // Catch:{ 0GL -> 0x02b2 }
            java.lang.Object r0 = A07(r0, r2, r5)     // Catch:{ 0GL -> 0x02b2 }
        L_0x002a:
            X.0GP r0 = (X.AnonymousClass0GP) r0     // Catch:{ 0GL -> 0x02b2 }
            return r0
        L_0x002d:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r3)     // Catch:{ 0GL -> 0x02b2 }
            java.lang.String r0 = "androidx.credentials.TYPE_CONSTRAINT_ERROR"
            boolean r0 = A08(r0, r4, r1)     // Catch:{ 0GL -> 0x02b2 }
            if (r0 == 0) goto L_0x0043
            X.06z r0 = new X.06z     // Catch:{ 0GL -> 0x02b2 }
            r0.<init>()     // Catch:{ 0GL -> 0x02b2 }
            java.lang.Object r0 = A07(r0, r2, r5)     // Catch:{ 0GL -> 0x02b2 }
            goto L_0x002a
        L_0x0043:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r3)     // Catch:{ 0GL -> 0x02b2 }
            java.lang.String r0 = "androidx.credentials.TYPE_DATA_CLONE_ERROR"
            boolean r0 = A08(r0, r4, r1)     // Catch:{ 0GL -> 0x02b2 }
            if (r0 == 0) goto L_0x0059
            X.070 r0 = new X.070     // Catch:{ 0GL -> 0x02b2 }
            r0.<init>()     // Catch:{ 0GL -> 0x02b2 }
            java.lang.Object r0 = A07(r0, r2, r5)     // Catch:{ 0GL -> 0x02b2 }
            goto L_0x002a
        L_0x0059:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r3)     // Catch:{ 0GL -> 0x02b2 }
            java.lang.String r0 = "androidx.credentials.TYPE_DATA_ERROR"
            boolean r0 = A08(r0, r4, r1)     // Catch:{ 0GL -> 0x02b2 }
            if (r0 == 0) goto L_0x006f
            X.071 r0 = new X.071     // Catch:{ 0GL -> 0x02b2 }
            r0.<init>()     // Catch:{ 0GL -> 0x02b2 }
            java.lang.Object r0 = A07(r0, r2, r5)     // Catch:{ 0GL -> 0x02b2 }
            goto L_0x002a
        L_0x006f:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r3)     // Catch:{ 0GL -> 0x02b2 }
            java.lang.String r0 = "androidx.credentials.TYPE_ENCODING_ERROR"
            boolean r0 = A08(r0, r4, r1)     // Catch:{ 0GL -> 0x02b2 }
            if (r0 == 0) goto L_0x0085
            X.072 r0 = new X.072     // Catch:{ 0GL -> 0x02b2 }
            r0.<init>()     // Catch:{ 0GL -> 0x02b2 }
            java.lang.Object r0 = A07(r0, r2, r5)     // Catch:{ 0GL -> 0x02b2 }
            goto L_0x002a
        L_0x0085:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r3)     // Catch:{ 0GL -> 0x02b2 }
            java.lang.String r0 = "androidx.credentials.TYPE_HIERARCHY_REQUEST_ERROR"
            boolean r0 = A08(r0, r4, r1)     // Catch:{ 0GL -> 0x02b2 }
            if (r0 == 0) goto L_0x009b
            X.073 r0 = new X.073     // Catch:{ 0GL -> 0x02b2 }
            r0.<init>()     // Catch:{ 0GL -> 0x02b2 }
            java.lang.Object r0 = A07(r0, r2, r5)     // Catch:{ 0GL -> 0x02b2 }
            goto L_0x002a
        L_0x009b:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r3)     // Catch:{ 0GL -> 0x02b2 }
            java.lang.String r0 = "androidx.credentials.TYPE_IN_USE_ATTRIBUTE_ERROR"
            boolean r0 = A08(r0, r4, r1)     // Catch:{ 0GL -> 0x02b2 }
            if (r0 == 0) goto L_0x00b2
            X.074 r0 = new X.074     // Catch:{ 0GL -> 0x02b2 }
            r0.<init>()     // Catch:{ 0GL -> 0x02b2 }
            java.lang.Object r0 = A07(r0, r2, r5)     // Catch:{ 0GL -> 0x02b2 }
            goto L_0x002a
        L_0x00b2:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r3)     // Catch:{ 0GL -> 0x02b2 }
            java.lang.String r0 = "androidx.credentials.TYPE_INVALID_CHARACTER_ERROR"
            boolean r0 = A08(r0, r4, r1)     // Catch:{ 0GL -> 0x02b2 }
            if (r0 == 0) goto L_0x00c9
            X.075 r0 = new X.075     // Catch:{ 0GL -> 0x02b2 }
            r0.<init>()     // Catch:{ 0GL -> 0x02b2 }
            java.lang.Object r0 = A07(r0, r2, r5)     // Catch:{ 0GL -> 0x02b2 }
            goto L_0x002a
        L_0x00c9:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r3)     // Catch:{ 0GL -> 0x02b2 }
            java.lang.String r0 = "androidx.credentials.TYPE_INVALID_MODIFICATION_ERROR"
            boolean r0 = A08(r0, r4, r1)     // Catch:{ 0GL -> 0x02b2 }
            if (r0 == 0) goto L_0x00e0
            X.076 r0 = new X.076     // Catch:{ 0GL -> 0x02b2 }
            r0.<init>()     // Catch:{ 0GL -> 0x02b2 }
            java.lang.Object r0 = A07(r0, r2, r5)     // Catch:{ 0GL -> 0x02b2 }
            goto L_0x002a
        L_0x00e0:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r3)     // Catch:{ 0GL -> 0x02b2 }
            java.lang.String r0 = "androidx.credentials.TYPE_INVALID_NODE_TYPE_ERROR"
            boolean r0 = A08(r0, r4, r1)     // Catch:{ 0GL -> 0x02b2 }
            if (r0 == 0) goto L_0x00f7
            X.077 r0 = new X.077     // Catch:{ 0GL -> 0x02b2 }
            r0.<init>()     // Catch:{ 0GL -> 0x02b2 }
            java.lang.Object r0 = A07(r0, r2, r5)     // Catch:{ 0GL -> 0x02b2 }
            goto L_0x002a
        L_0x00f7:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r3)     // Catch:{ 0GL -> 0x02b2 }
            java.lang.String r0 = "androidx.credentials.TYPE_INVALID_STATE_ERROR"
            boolean r0 = A08(r0, r4, r1)     // Catch:{ 0GL -> 0x02b2 }
            if (r0 == 0) goto L_0x010e
            X.078 r0 = new X.078     // Catch:{ 0GL -> 0x02b2 }
            r0.<init>()     // Catch:{ 0GL -> 0x02b2 }
            java.lang.Object r0 = A07(r0, r2, r5)     // Catch:{ 0GL -> 0x02b2 }
            goto L_0x002a
        L_0x010e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r3)     // Catch:{ 0GL -> 0x02b2 }
            java.lang.String r0 = "androidx.credentials.TYPE_NAMESPACE_ERROR"
            boolean r0 = A08(r0, r4, r1)     // Catch:{ 0GL -> 0x02b2 }
            if (r0 == 0) goto L_0x0125
            X.079 r0 = new X.079     // Catch:{ 0GL -> 0x02b2 }
            r0.<init>()     // Catch:{ 0GL -> 0x02b2 }
            java.lang.Object r0 = A07(r0, r2, r5)     // Catch:{ 0GL -> 0x02b2 }
            goto L_0x002a
        L_0x0125:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r3)     // Catch:{ 0GL -> 0x02b2 }
            java.lang.String r0 = "androidx.credentials.TYPE_NETWORK_ERROR"
            boolean r0 = A08(r0, r4, r1)     // Catch:{ 0GL -> 0x02b2 }
            if (r0 == 0) goto L_0x013c
            X.07A r0 = new X.07A     // Catch:{ 0GL -> 0x02b2 }
            r0.<init>()     // Catch:{ 0GL -> 0x02b2 }
            java.lang.Object r0 = A07(r0, r2, r5)     // Catch:{ 0GL -> 0x02b2 }
            goto L_0x002a
        L_0x013c:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r3)     // Catch:{ 0GL -> 0x02b2 }
            java.lang.String r0 = "androidx.credentials.TYPE_NO_MODIFICATION_ALLOWED_ERROR"
            boolean r0 = A08(r0, r4, r1)     // Catch:{ 0GL -> 0x02b2 }
            if (r0 == 0) goto L_0x0153
            X.07B r0 = new X.07B     // Catch:{ 0GL -> 0x02b2 }
            r0.<init>()     // Catch:{ 0GL -> 0x02b2 }
            java.lang.Object r0 = A07(r0, r2, r5)     // Catch:{ 0GL -> 0x02b2 }
            goto L_0x002a
        L_0x0153:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r3)     // Catch:{ 0GL -> 0x02b2 }
            java.lang.String r0 = "androidx.credentials.TYPE_NOT_ALLOWED_ERROR"
            boolean r0 = A08(r0, r4, r1)     // Catch:{ 0GL -> 0x02b2 }
            if (r0 == 0) goto L_0x016a
            X.07C r0 = new X.07C     // Catch:{ 0GL -> 0x02b2 }
            r0.<init>()     // Catch:{ 0GL -> 0x02b2 }
            java.lang.Object r0 = A07(r0, r2, r5)     // Catch:{ 0GL -> 0x02b2 }
            goto L_0x002a
        L_0x016a:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r3)     // Catch:{ 0GL -> 0x02b2 }
            java.lang.String r0 = "androidx.credentials.TYPE_NOT_FOUND_ERROR"
            boolean r0 = A08(r0, r4, r1)     // Catch:{ 0GL -> 0x02b2 }
            if (r0 == 0) goto L_0x0181
            X.07D r0 = new X.07D     // Catch:{ 0GL -> 0x02b2 }
            r0.<init>()     // Catch:{ 0GL -> 0x02b2 }
            java.lang.Object r0 = A07(r0, r2, r5)     // Catch:{ 0GL -> 0x02b2 }
            goto L_0x002a
        L_0x0181:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r3)     // Catch:{ 0GL -> 0x02b2 }
            java.lang.String r0 = "androidx.credentials.TYPE_NOT_READABLE_ERROR"
            boolean r0 = A08(r0, r4, r1)     // Catch:{ 0GL -> 0x02b2 }
            if (r0 == 0) goto L_0x0198
            X.07E r0 = new X.07E     // Catch:{ 0GL -> 0x02b2 }
            r0.<init>()     // Catch:{ 0GL -> 0x02b2 }
            java.lang.Object r0 = A07(r0, r2, r5)     // Catch:{ 0GL -> 0x02b2 }
            goto L_0x002a
        L_0x0198:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r3)     // Catch:{ 0GL -> 0x02b2 }
            java.lang.String r0 = "androidx.credentials.TYPE_NOT_SUPPORTED_ERROR"
            boolean r0 = A08(r0, r4, r1)     // Catch:{ 0GL -> 0x02b2 }
            if (r0 == 0) goto L_0x01af
            X.07F r0 = new X.07F     // Catch:{ 0GL -> 0x02b2 }
            r0.<init>()     // Catch:{ 0GL -> 0x02b2 }
            java.lang.Object r0 = A07(r0, r2, r5)     // Catch:{ 0GL -> 0x02b2 }
            goto L_0x002a
        L_0x01af:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r3)     // Catch:{ 0GL -> 0x02b2 }
            java.lang.String r0 = "androidx.credentials.TYPE_OPERATION_ERROR"
            boolean r0 = A08(r0, r4, r1)     // Catch:{ 0GL -> 0x02b2 }
            if (r0 == 0) goto L_0x01c6
            X.07G r0 = new X.07G     // Catch:{ 0GL -> 0x02b2 }
            r0.<init>()     // Catch:{ 0GL -> 0x02b2 }
            java.lang.Object r0 = A07(r0, r2, r5)     // Catch:{ 0GL -> 0x02b2 }
            goto L_0x002a
        L_0x01c6:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r3)     // Catch:{ 0GL -> 0x02b2 }
            java.lang.String r0 = "androidx.credentials.TYPE_OPT_OUT_ERROR"
            boolean r0 = A08(r0, r4, r1)     // Catch:{ 0GL -> 0x02b2 }
            if (r0 == 0) goto L_0x01dd
            X.07H r0 = new X.07H     // Catch:{ 0GL -> 0x02b2 }
            r0.<init>()     // Catch:{ 0GL -> 0x02b2 }
            java.lang.Object r0 = A07(r0, r2, r5)     // Catch:{ 0GL -> 0x02b2 }
            goto L_0x002a
        L_0x01dd:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r3)     // Catch:{ 0GL -> 0x02b2 }
            java.lang.String r0 = "androidx.credentials.TYPE_QUOTA_EXCEEDED_ERROR"
            boolean r0 = A08(r0, r4, r1)     // Catch:{ 0GL -> 0x02b2 }
            if (r0 == 0) goto L_0x01f4
            X.07I r0 = new X.07I     // Catch:{ 0GL -> 0x02b2 }
            r0.<init>()     // Catch:{ 0GL -> 0x02b2 }
            java.lang.Object r0 = A07(r0, r2, r5)     // Catch:{ 0GL -> 0x02b2 }
            goto L_0x002a
        L_0x01f4:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r3)     // Catch:{ 0GL -> 0x02b2 }
            java.lang.String r0 = "androidx.credentials.TYPE_READ_ONLY_ERROR"
            boolean r0 = A08(r0, r4, r1)     // Catch:{ 0GL -> 0x02b2 }
            if (r0 == 0) goto L_0x020b
            X.07J r0 = new X.07J     // Catch:{ 0GL -> 0x02b2 }
            r0.<init>()     // Catch:{ 0GL -> 0x02b2 }
            java.lang.Object r0 = A07(r0, r2, r5)     // Catch:{ 0GL -> 0x02b2 }
            goto L_0x002a
        L_0x020b:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r3)     // Catch:{ 0GL -> 0x02b2 }
            java.lang.String r0 = "androidx.credentials.TYPE_SECURITY_ERROR"
            boolean r0 = A08(r0, r4, r1)     // Catch:{ 0GL -> 0x02b2 }
            if (r0 == 0) goto L_0x0222
            X.07K r0 = new X.07K     // Catch:{ 0GL -> 0x02b2 }
            r0.<init>()     // Catch:{ 0GL -> 0x02b2 }
            java.lang.Object r0 = A07(r0, r2, r5)     // Catch:{ 0GL -> 0x02b2 }
            goto L_0x002a
        L_0x0222:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r3)     // Catch:{ 0GL -> 0x02b2 }
            java.lang.String r0 = "androidx.credentials.TYPE_SYNTAX_ERROR"
            boolean r0 = A08(r0, r4, r1)     // Catch:{ 0GL -> 0x02b2 }
            if (r0 == 0) goto L_0x0239
            X.07L r0 = new X.07L     // Catch:{ 0GL -> 0x02b2 }
            r0.<init>()     // Catch:{ 0GL -> 0x02b2 }
            java.lang.Object r0 = A07(r0, r2, r5)     // Catch:{ 0GL -> 0x02b2 }
            goto L_0x002a
        L_0x0239:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r3)     // Catch:{ 0GL -> 0x02b2 }
            java.lang.String r0 = "androidx.credentials.TYPE_TIMEOUT_ERROR"
            boolean r0 = A08(r0, r4, r1)     // Catch:{ 0GL -> 0x02b2 }
            if (r0 == 0) goto L_0x0250
            X.07M r0 = new X.07M     // Catch:{ 0GL -> 0x02b2 }
            r0.<init>()     // Catch:{ 0GL -> 0x02b2 }
            java.lang.Object r0 = A07(r0, r2, r5)     // Catch:{ 0GL -> 0x02b2 }
            goto L_0x002a
        L_0x0250:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r3)     // Catch:{ 0GL -> 0x02b2 }
            java.lang.String r0 = "androidx.credentials.TYPE_TRANSACTION_INACTIVE_ERROR"
            boolean r0 = A08(r0, r4, r1)     // Catch:{ 0GL -> 0x02b2 }
            if (r0 == 0) goto L_0x0267
            X.07N r0 = new X.07N     // Catch:{ 0GL -> 0x02b2 }
            r0.<init>()     // Catch:{ 0GL -> 0x02b2 }
            java.lang.Object r0 = A07(r0, r2, r5)     // Catch:{ 0GL -> 0x02b2 }
            goto L_0x002a
        L_0x0267:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r3)     // Catch:{ 0GL -> 0x02b2 }
            java.lang.String r0 = "androidx.credentials.TYPE_UNKNOWN_ERROR"
            boolean r0 = A08(r0, r4, r1)     // Catch:{ 0GL -> 0x02b2 }
            if (r0 == 0) goto L_0x027e
            X.07O r0 = new X.07O     // Catch:{ 0GL -> 0x02b2 }
            r0.<init>()     // Catch:{ 0GL -> 0x02b2 }
            java.lang.Object r0 = A07(r0, r2, r5)     // Catch:{ 0GL -> 0x02b2 }
            goto L_0x002a
        L_0x027e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r3)     // Catch:{ 0GL -> 0x02b2 }
            java.lang.String r0 = "androidx.credentials.TYPE_VERSION_ERROR"
            boolean r0 = A08(r0, r4, r1)     // Catch:{ 0GL -> 0x02b2 }
            if (r0 == 0) goto L_0x0295
            X.07P r0 = new X.07P     // Catch:{ 0GL -> 0x02b2 }
            r0.<init>()     // Catch:{ 0GL -> 0x02b2 }
            java.lang.Object r0 = A07(r0, r2, r5)     // Catch:{ 0GL -> 0x02b2 }
            goto L_0x002a
        L_0x0295:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r3)     // Catch:{ 0GL -> 0x02b2 }
            java.lang.String r0 = "androidx.credentials.TYPE_WRONG_DOCUMENT_ERROR"
            boolean r0 = A08(r0, r4, r1)     // Catch:{ 0GL -> 0x02b2 }
            if (r0 == 0) goto L_0x02ac
            X.07Q r0 = new X.07Q     // Catch:{ 0GL -> 0x02b2 }
            r0.<init>()     // Catch:{ 0GL -> 0x02b2 }
            java.lang.Object r0 = A07(r0, r2, r5)     // Catch:{ 0GL -> 0x02b2 }
            goto L_0x002a
        L_0x02ac:
            X.0GL r0 = new X.0GL     // Catch:{ 0GL -> 0x02b2 }
            r0.<init>()     // Catch:{ 0GL -> 0x02b2 }
            throw r0     // Catch:{ 0GL -> 0x02b2 }
        L_0x02b2:
            X.06i r0 = new X.06i     // Catch:{ 0GL -> 0x02be }
            r0.<init>(r4, r5)     // Catch:{ 0GL -> 0x02be }
            return r0
        L_0x02b8:
            X.0GL r0 = new X.0GL     // Catch:{ 0GL -> 0x02be }
            r0.<init>()     // Catch:{ 0GL -> 0x02be }
            throw r0     // Catch:{ 0GL -> 0x02be }
        L_0x02be:
            X.06i r0 = new X.06i
            r0.<init>(r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08210dZ.A04(java.lang.String, java.lang.String):X.0GP");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:97|98|99) */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x02b7, code lost:
        return new X.C007706q(r4, r5);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:97:0x02b2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass0GQ A06(java.lang.String r4, java.lang.String r5) {
        /*
            java.lang.String r0 = "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION"
            boolean r0 = X.C175738Zn.A0Y(r4, r0, false)     // Catch:{ 0GL -> 0x02be }
            if (r0 == 0) goto L_0x02b8
            java.lang.String r3 = "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/"
            X.07O r1 = new X.07O     // Catch:{ 0GL -> 0x02b2 }
            r1.<init>()     // Catch:{ 0GL -> 0x02b2 }
            r0 = 0
            X.07S r2 = new X.07S     // Catch:{ 0GL -> 0x02b2 }
            r2.<init>(r1, r0)     // Catch:{ 0GL -> 0x02b2 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r3)     // Catch:{ 0GL -> 0x02b2 }
            java.lang.String r0 = "androidx.credentials.TYPE_ABORT_ERROR"
            boolean r0 = A08(r0, r4, r1)     // Catch:{ 0GL -> 0x02b2 }
            if (r0 == 0) goto L_0x002d
            X.06y r0 = new X.06y     // Catch:{ 0GL -> 0x02b2 }
            r0.<init>()     // Catch:{ 0GL -> 0x02b2 }
            java.lang.Object r0 = A07(r0, r2, r5)     // Catch:{ 0GL -> 0x02b2 }
        L_0x002a:
            X.0GQ r0 = (X.AnonymousClass0GQ) r0     // Catch:{ 0GL -> 0x02b2 }
            return r0
        L_0x002d:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r3)     // Catch:{ 0GL -> 0x02b2 }
            java.lang.String r0 = "androidx.credentials.TYPE_CONSTRAINT_ERROR"
            boolean r0 = A08(r0, r4, r1)     // Catch:{ 0GL -> 0x02b2 }
            if (r0 == 0) goto L_0x0043
            X.06z r0 = new X.06z     // Catch:{ 0GL -> 0x02b2 }
            r0.<init>()     // Catch:{ 0GL -> 0x02b2 }
            java.lang.Object r0 = A07(r0, r2, r5)     // Catch:{ 0GL -> 0x02b2 }
            goto L_0x002a
        L_0x0043:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r3)     // Catch:{ 0GL -> 0x02b2 }
            java.lang.String r0 = "androidx.credentials.TYPE_DATA_CLONE_ERROR"
            boolean r0 = A08(r0, r4, r1)     // Catch:{ 0GL -> 0x02b2 }
            if (r0 == 0) goto L_0x0059
            X.070 r0 = new X.070     // Catch:{ 0GL -> 0x02b2 }
            r0.<init>()     // Catch:{ 0GL -> 0x02b2 }
            java.lang.Object r0 = A07(r0, r2, r5)     // Catch:{ 0GL -> 0x02b2 }
            goto L_0x002a
        L_0x0059:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r3)     // Catch:{ 0GL -> 0x02b2 }
            java.lang.String r0 = "androidx.credentials.TYPE_DATA_ERROR"
            boolean r0 = A08(r0, r4, r1)     // Catch:{ 0GL -> 0x02b2 }
            if (r0 == 0) goto L_0x006f
            X.071 r0 = new X.071     // Catch:{ 0GL -> 0x02b2 }
            r0.<init>()     // Catch:{ 0GL -> 0x02b2 }
            java.lang.Object r0 = A07(r0, r2, r5)     // Catch:{ 0GL -> 0x02b2 }
            goto L_0x002a
        L_0x006f:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r3)     // Catch:{ 0GL -> 0x02b2 }
            java.lang.String r0 = "androidx.credentials.TYPE_ENCODING_ERROR"
            boolean r0 = A08(r0, r4, r1)     // Catch:{ 0GL -> 0x02b2 }
            if (r0 == 0) goto L_0x0085
            X.072 r0 = new X.072     // Catch:{ 0GL -> 0x02b2 }
            r0.<init>()     // Catch:{ 0GL -> 0x02b2 }
            java.lang.Object r0 = A07(r0, r2, r5)     // Catch:{ 0GL -> 0x02b2 }
            goto L_0x002a
        L_0x0085:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r3)     // Catch:{ 0GL -> 0x02b2 }
            java.lang.String r0 = "androidx.credentials.TYPE_HIERARCHY_REQUEST_ERROR"
            boolean r0 = A08(r0, r4, r1)     // Catch:{ 0GL -> 0x02b2 }
            if (r0 == 0) goto L_0x009b
            X.073 r0 = new X.073     // Catch:{ 0GL -> 0x02b2 }
            r0.<init>()     // Catch:{ 0GL -> 0x02b2 }
            java.lang.Object r0 = A07(r0, r2, r5)     // Catch:{ 0GL -> 0x02b2 }
            goto L_0x002a
        L_0x009b:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r3)     // Catch:{ 0GL -> 0x02b2 }
            java.lang.String r0 = "androidx.credentials.TYPE_IN_USE_ATTRIBUTE_ERROR"
            boolean r0 = A08(r0, r4, r1)     // Catch:{ 0GL -> 0x02b2 }
            if (r0 == 0) goto L_0x00b2
            X.074 r0 = new X.074     // Catch:{ 0GL -> 0x02b2 }
            r0.<init>()     // Catch:{ 0GL -> 0x02b2 }
            java.lang.Object r0 = A07(r0, r2, r5)     // Catch:{ 0GL -> 0x02b2 }
            goto L_0x002a
        L_0x00b2:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r3)     // Catch:{ 0GL -> 0x02b2 }
            java.lang.String r0 = "androidx.credentials.TYPE_INVALID_CHARACTER_ERROR"
            boolean r0 = A08(r0, r4, r1)     // Catch:{ 0GL -> 0x02b2 }
            if (r0 == 0) goto L_0x00c9
            X.075 r0 = new X.075     // Catch:{ 0GL -> 0x02b2 }
            r0.<init>()     // Catch:{ 0GL -> 0x02b2 }
            java.lang.Object r0 = A07(r0, r2, r5)     // Catch:{ 0GL -> 0x02b2 }
            goto L_0x002a
        L_0x00c9:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r3)     // Catch:{ 0GL -> 0x02b2 }
            java.lang.String r0 = "androidx.credentials.TYPE_INVALID_MODIFICATION_ERROR"
            boolean r0 = A08(r0, r4, r1)     // Catch:{ 0GL -> 0x02b2 }
            if (r0 == 0) goto L_0x00e0
            X.076 r0 = new X.076     // Catch:{ 0GL -> 0x02b2 }
            r0.<init>()     // Catch:{ 0GL -> 0x02b2 }
            java.lang.Object r0 = A07(r0, r2, r5)     // Catch:{ 0GL -> 0x02b2 }
            goto L_0x002a
        L_0x00e0:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r3)     // Catch:{ 0GL -> 0x02b2 }
            java.lang.String r0 = "androidx.credentials.TYPE_INVALID_NODE_TYPE_ERROR"
            boolean r0 = A08(r0, r4, r1)     // Catch:{ 0GL -> 0x02b2 }
            if (r0 == 0) goto L_0x00f7
            X.077 r0 = new X.077     // Catch:{ 0GL -> 0x02b2 }
            r0.<init>()     // Catch:{ 0GL -> 0x02b2 }
            java.lang.Object r0 = A07(r0, r2, r5)     // Catch:{ 0GL -> 0x02b2 }
            goto L_0x002a
        L_0x00f7:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r3)     // Catch:{ 0GL -> 0x02b2 }
            java.lang.String r0 = "androidx.credentials.TYPE_INVALID_STATE_ERROR"
            boolean r0 = A08(r0, r4, r1)     // Catch:{ 0GL -> 0x02b2 }
            if (r0 == 0) goto L_0x010e
            X.078 r0 = new X.078     // Catch:{ 0GL -> 0x02b2 }
            r0.<init>()     // Catch:{ 0GL -> 0x02b2 }
            java.lang.Object r0 = A07(r0, r2, r5)     // Catch:{ 0GL -> 0x02b2 }
            goto L_0x002a
        L_0x010e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r3)     // Catch:{ 0GL -> 0x02b2 }
            java.lang.String r0 = "androidx.credentials.TYPE_NAMESPACE_ERROR"
            boolean r0 = A08(r0, r4, r1)     // Catch:{ 0GL -> 0x02b2 }
            if (r0 == 0) goto L_0x0125
            X.079 r0 = new X.079     // Catch:{ 0GL -> 0x02b2 }
            r0.<init>()     // Catch:{ 0GL -> 0x02b2 }
            java.lang.Object r0 = A07(r0, r2, r5)     // Catch:{ 0GL -> 0x02b2 }
            goto L_0x002a
        L_0x0125:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r3)     // Catch:{ 0GL -> 0x02b2 }
            java.lang.String r0 = "androidx.credentials.TYPE_NETWORK_ERROR"
            boolean r0 = A08(r0, r4, r1)     // Catch:{ 0GL -> 0x02b2 }
            if (r0 == 0) goto L_0x013c
            X.07A r0 = new X.07A     // Catch:{ 0GL -> 0x02b2 }
            r0.<init>()     // Catch:{ 0GL -> 0x02b2 }
            java.lang.Object r0 = A07(r0, r2, r5)     // Catch:{ 0GL -> 0x02b2 }
            goto L_0x002a
        L_0x013c:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r3)     // Catch:{ 0GL -> 0x02b2 }
            java.lang.String r0 = "androidx.credentials.TYPE_NO_MODIFICATION_ALLOWED_ERROR"
            boolean r0 = A08(r0, r4, r1)     // Catch:{ 0GL -> 0x02b2 }
            if (r0 == 0) goto L_0x0153
            X.07B r0 = new X.07B     // Catch:{ 0GL -> 0x02b2 }
            r0.<init>()     // Catch:{ 0GL -> 0x02b2 }
            java.lang.Object r0 = A07(r0, r2, r5)     // Catch:{ 0GL -> 0x02b2 }
            goto L_0x002a
        L_0x0153:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r3)     // Catch:{ 0GL -> 0x02b2 }
            java.lang.String r0 = "androidx.credentials.TYPE_NOT_ALLOWED_ERROR"
            boolean r0 = A08(r0, r4, r1)     // Catch:{ 0GL -> 0x02b2 }
            if (r0 == 0) goto L_0x016a
            X.07C r0 = new X.07C     // Catch:{ 0GL -> 0x02b2 }
            r0.<init>()     // Catch:{ 0GL -> 0x02b2 }
            java.lang.Object r0 = A07(r0, r2, r5)     // Catch:{ 0GL -> 0x02b2 }
            goto L_0x002a
        L_0x016a:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r3)     // Catch:{ 0GL -> 0x02b2 }
            java.lang.String r0 = "androidx.credentials.TYPE_NOT_FOUND_ERROR"
            boolean r0 = A08(r0, r4, r1)     // Catch:{ 0GL -> 0x02b2 }
            if (r0 == 0) goto L_0x0181
            X.07D r0 = new X.07D     // Catch:{ 0GL -> 0x02b2 }
            r0.<init>()     // Catch:{ 0GL -> 0x02b2 }
            java.lang.Object r0 = A07(r0, r2, r5)     // Catch:{ 0GL -> 0x02b2 }
            goto L_0x002a
        L_0x0181:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r3)     // Catch:{ 0GL -> 0x02b2 }
            java.lang.String r0 = "androidx.credentials.TYPE_NOT_READABLE_ERROR"
            boolean r0 = A08(r0, r4, r1)     // Catch:{ 0GL -> 0x02b2 }
            if (r0 == 0) goto L_0x0198
            X.07E r0 = new X.07E     // Catch:{ 0GL -> 0x02b2 }
            r0.<init>()     // Catch:{ 0GL -> 0x02b2 }
            java.lang.Object r0 = A07(r0, r2, r5)     // Catch:{ 0GL -> 0x02b2 }
            goto L_0x002a
        L_0x0198:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r3)     // Catch:{ 0GL -> 0x02b2 }
            java.lang.String r0 = "androidx.credentials.TYPE_NOT_SUPPORTED_ERROR"
            boolean r0 = A08(r0, r4, r1)     // Catch:{ 0GL -> 0x02b2 }
            if (r0 == 0) goto L_0x01af
            X.07F r0 = new X.07F     // Catch:{ 0GL -> 0x02b2 }
            r0.<init>()     // Catch:{ 0GL -> 0x02b2 }
            java.lang.Object r0 = A07(r0, r2, r5)     // Catch:{ 0GL -> 0x02b2 }
            goto L_0x002a
        L_0x01af:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r3)     // Catch:{ 0GL -> 0x02b2 }
            java.lang.String r0 = "androidx.credentials.TYPE_OPERATION_ERROR"
            boolean r0 = A08(r0, r4, r1)     // Catch:{ 0GL -> 0x02b2 }
            if (r0 == 0) goto L_0x01c6
            X.07G r0 = new X.07G     // Catch:{ 0GL -> 0x02b2 }
            r0.<init>()     // Catch:{ 0GL -> 0x02b2 }
            java.lang.Object r0 = A07(r0, r2, r5)     // Catch:{ 0GL -> 0x02b2 }
            goto L_0x002a
        L_0x01c6:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r3)     // Catch:{ 0GL -> 0x02b2 }
            java.lang.String r0 = "androidx.credentials.TYPE_OPT_OUT_ERROR"
            boolean r0 = A08(r0, r4, r1)     // Catch:{ 0GL -> 0x02b2 }
            if (r0 == 0) goto L_0x01dd
            X.07H r0 = new X.07H     // Catch:{ 0GL -> 0x02b2 }
            r0.<init>()     // Catch:{ 0GL -> 0x02b2 }
            java.lang.Object r0 = A07(r0, r2, r5)     // Catch:{ 0GL -> 0x02b2 }
            goto L_0x002a
        L_0x01dd:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r3)     // Catch:{ 0GL -> 0x02b2 }
            java.lang.String r0 = "androidx.credentials.TYPE_QUOTA_EXCEEDED_ERROR"
            boolean r0 = A08(r0, r4, r1)     // Catch:{ 0GL -> 0x02b2 }
            if (r0 == 0) goto L_0x01f4
            X.07I r0 = new X.07I     // Catch:{ 0GL -> 0x02b2 }
            r0.<init>()     // Catch:{ 0GL -> 0x02b2 }
            java.lang.Object r0 = A07(r0, r2, r5)     // Catch:{ 0GL -> 0x02b2 }
            goto L_0x002a
        L_0x01f4:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r3)     // Catch:{ 0GL -> 0x02b2 }
            java.lang.String r0 = "androidx.credentials.TYPE_READ_ONLY_ERROR"
            boolean r0 = A08(r0, r4, r1)     // Catch:{ 0GL -> 0x02b2 }
            if (r0 == 0) goto L_0x020b
            X.07J r0 = new X.07J     // Catch:{ 0GL -> 0x02b2 }
            r0.<init>()     // Catch:{ 0GL -> 0x02b2 }
            java.lang.Object r0 = A07(r0, r2, r5)     // Catch:{ 0GL -> 0x02b2 }
            goto L_0x002a
        L_0x020b:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r3)     // Catch:{ 0GL -> 0x02b2 }
            java.lang.String r0 = "androidx.credentials.TYPE_SECURITY_ERROR"
            boolean r0 = A08(r0, r4, r1)     // Catch:{ 0GL -> 0x02b2 }
            if (r0 == 0) goto L_0x0222
            X.07K r0 = new X.07K     // Catch:{ 0GL -> 0x02b2 }
            r0.<init>()     // Catch:{ 0GL -> 0x02b2 }
            java.lang.Object r0 = A07(r0, r2, r5)     // Catch:{ 0GL -> 0x02b2 }
            goto L_0x002a
        L_0x0222:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r3)     // Catch:{ 0GL -> 0x02b2 }
            java.lang.String r0 = "androidx.credentials.TYPE_SYNTAX_ERROR"
            boolean r0 = A08(r0, r4, r1)     // Catch:{ 0GL -> 0x02b2 }
            if (r0 == 0) goto L_0x0239
            X.07L r0 = new X.07L     // Catch:{ 0GL -> 0x02b2 }
            r0.<init>()     // Catch:{ 0GL -> 0x02b2 }
            java.lang.Object r0 = A07(r0, r2, r5)     // Catch:{ 0GL -> 0x02b2 }
            goto L_0x002a
        L_0x0239:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r3)     // Catch:{ 0GL -> 0x02b2 }
            java.lang.String r0 = "androidx.credentials.TYPE_TIMEOUT_ERROR"
            boolean r0 = A08(r0, r4, r1)     // Catch:{ 0GL -> 0x02b2 }
            if (r0 == 0) goto L_0x0250
            X.07M r0 = new X.07M     // Catch:{ 0GL -> 0x02b2 }
            r0.<init>()     // Catch:{ 0GL -> 0x02b2 }
            java.lang.Object r0 = A07(r0, r2, r5)     // Catch:{ 0GL -> 0x02b2 }
            goto L_0x002a
        L_0x0250:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r3)     // Catch:{ 0GL -> 0x02b2 }
            java.lang.String r0 = "androidx.credentials.TYPE_TRANSACTION_INACTIVE_ERROR"
            boolean r0 = A08(r0, r4, r1)     // Catch:{ 0GL -> 0x02b2 }
            if (r0 == 0) goto L_0x0267
            X.07N r0 = new X.07N     // Catch:{ 0GL -> 0x02b2 }
            r0.<init>()     // Catch:{ 0GL -> 0x02b2 }
            java.lang.Object r0 = A07(r0, r2, r5)     // Catch:{ 0GL -> 0x02b2 }
            goto L_0x002a
        L_0x0267:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r3)     // Catch:{ 0GL -> 0x02b2 }
            java.lang.String r0 = "androidx.credentials.TYPE_UNKNOWN_ERROR"
            boolean r0 = A08(r0, r4, r1)     // Catch:{ 0GL -> 0x02b2 }
            if (r0 == 0) goto L_0x027e
            X.07O r0 = new X.07O     // Catch:{ 0GL -> 0x02b2 }
            r0.<init>()     // Catch:{ 0GL -> 0x02b2 }
            java.lang.Object r0 = A07(r0, r2, r5)     // Catch:{ 0GL -> 0x02b2 }
            goto L_0x002a
        L_0x027e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r3)     // Catch:{ 0GL -> 0x02b2 }
            java.lang.String r0 = "androidx.credentials.TYPE_VERSION_ERROR"
            boolean r0 = A08(r0, r4, r1)     // Catch:{ 0GL -> 0x02b2 }
            if (r0 == 0) goto L_0x0295
            X.07P r0 = new X.07P     // Catch:{ 0GL -> 0x02b2 }
            r0.<init>()     // Catch:{ 0GL -> 0x02b2 }
            java.lang.Object r0 = A07(r0, r2, r5)     // Catch:{ 0GL -> 0x02b2 }
            goto L_0x002a
        L_0x0295:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r3)     // Catch:{ 0GL -> 0x02b2 }
            java.lang.String r0 = "androidx.credentials.TYPE_WRONG_DOCUMENT_ERROR"
            boolean r0 = A08(r0, r4, r1)     // Catch:{ 0GL -> 0x02b2 }
            if (r0 == 0) goto L_0x02ac
            X.07Q r0 = new X.07Q     // Catch:{ 0GL -> 0x02b2 }
            r0.<init>()     // Catch:{ 0GL -> 0x02b2 }
            java.lang.Object r0 = A07(r0, r2, r5)     // Catch:{ 0GL -> 0x02b2 }
            goto L_0x002a
        L_0x02ac:
            X.0GL r0 = new X.0GL     // Catch:{ 0GL -> 0x02b2 }
            r0.<init>()     // Catch:{ 0GL -> 0x02b2 }
            throw r0     // Catch:{ 0GL -> 0x02b2 }
        L_0x02b2:
            X.06q r0 = new X.06q     // Catch:{ 0GL -> 0x02be }
            r0.<init>(r4, r5)     // Catch:{ 0GL -> 0x02be }
            return r0
        L_0x02b8:
            X.0GL r0 = new X.0GL     // Catch:{ 0GL -> 0x02be }
            r0.<init>()     // Catch:{ 0GL -> 0x02be }
            throw r0     // Catch:{ 0GL -> 0x02be }
        L_0x02be:
            X.06q r0 = new X.06q
            r0.<init>(r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08210dZ.A06(java.lang.String, java.lang.String):X.0GQ");
    }

    public static final Object A07(AnonymousClass0KV r1, Object obj, String str) {
        if (obj instanceof AnonymousClass07R) {
            return new AnonymousClass07R(r1, str);
        }
        if (obj instanceof AnonymousClass07S) {
            return new AnonymousClass07S(r1, str);
        }
        throw new AnonymousClass0GL();
    }

    public final CreateCredentialRequest A09(Context context, C03710Lg r8) {
        Bundle bundle = r8.A01;
        AnonymousClass0L8 r5 = r8.A02;
        Bundle A08 = AnonymousClass002.A08();
        A08.putCharSequence("androidx.credentials.BUNDLE_KEY_USER_ID", r5.A01);
        CharSequence charSequence = r5.A00;
        if (!TextUtils.isEmpty(charSequence)) {
            A08.putCharSequence("androidx.credentials.BUNDLE_KEY_USER_DISPLAY_NAME", charSequence);
        }
        if (!TextUtils.isEmpty((CharSequence) null)) {
            A08.putString("androidx.credentials.BUNDLE_KEY_DEFAULT_PROVIDER", (String) null);
        }
        boolean z = r8 instanceof AnonymousClass06X;
        int i = R.drawable.ic_other_sign_in;
        if (z) {
            i = R.drawable.ic_passkey;
        }
        A08.putParcelable("androidx.credentials.BUNDLE_KEY_CREDENTIAL_TYPE_ICON", Icon.createWithResource(context, i));
        bundle.putBundle("androidx.credentials.BUNDLE_KEY_REQUEST_DISPLAY_INFO", A08);
        CreateCredentialRequest.Builder alwaysSendAppInfoToProvider = new CreateCredentialRequest.Builder("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", bundle, r8.A00).setIsSystemProviderRequired(false).setAlwaysSendAppInfoToProvider(true);
        C162457s7.A0D(alwaysSendAppInfoToProvider);
        CreateCredentialRequest build = alwaysSendAppInfoToProvider.build();
        C162457s7.A0D(build);
        return build;
    }

    public final boolean A0B(AnonymousClass4GP r2) {
        if (this.A00 != null) {
            return false;
        }
        r2.invoke();
        return true;
    }

    public boolean isAvailableOnDevice() {
        if (Build.VERSION.SDK_INT >= 34) {
            return true;
        }
        return false;
    }

    public void onCreateCredential(Context context, C03710Lg r8, CancellationSignal cancellationSignal, Executor executor, C16630ti r11) {
        if (!A0B(new C14020oV(r11))) {
            AnonymousClass0ZJ r5 = new AnonymousClass0ZJ(r8, r11, this);
            CredentialManager credentialManager = this.A00;
            C162457s7.A0H(credentialManager);
            credentialManager.createCredential(context, A09(context, r8), cancellationSignal, executor, r5);
        }
    }

    public void onGetCredential(Context context, AnonymousClass0KT r8, CancellationSignal cancellationSignal, Executor executor, C16630ti r11) {
        if (!A0B(new C14030oW(r11))) {
            AnonymousClass0ZI r5 = new AnonymousClass0ZI(r11, this);
            CredentialManager credentialManager = this.A00;
            C162457s7.A0H(credentialManager);
            credentialManager.getCredential(context, A0A(r8), cancellationSignal, executor, r5);
        }
    }

    public C08210dZ(Context context) {
        this.A00 = (CredentialManager) context.getSystemService("credential");
    }

    public static final AnonymousClass0KU A00(GetCredentialResponse getCredentialResponse) {
        AnonymousClass0KS r1;
        Credential credential = getCredentialResponse.getCredential();
        C162457s7.A0D(credential);
        String type = credential.getType();
        C162457s7.A0D(type);
        Bundle data = credential.getData();
        C162457s7.A0D(data);
        try {
            if (type.equals("android.credentials.TYPE_PASSWORD_CREDENTIAL")) {
                r1 = A01(data);
            } else if (type.equals("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL")) {
                r1 = A02(data);
            } else {
                throw new AnonymousClass0GL();
            }
        } catch (AnonymousClass0GL unused) {
            r1 = new C006206b(type, data);
        }
        return new AnonymousClass0KU(r1);
    }

    public static final AnonymousClass0GP A03(CreateCredentialException createCredentialException) {
        String type = createCredentialException.getType();
        switch (type.hashCode()) {
            case -2055374133:
                if (type.equals("android.credentials.CreateCredentialException.TYPE_USER_CANCELED")) {
                    return new C007106k(createCredentialException.getMessage());
                }
                break;
            case 1316905704:
                if (type.equals("android.credentials.CreateCredentialException.TYPE_UNKNOWN")) {
                    return new C007506o(createCredentialException.getMessage());
                }
                break;
            case 2092588512:
                if (type.equals("android.credentials.CreateCredentialException.TYPE_INTERRUPTED")) {
                    return new C007206l(createCredentialException.getMessage());
                }
                break;
            case 2131915191:
                if (type.equals("android.credentials.CreateCredentialException.TYPE_NO_CREATE_OPTIONS")) {
                    return new C007306m(createCredentialException.getMessage());
                }
                break;
        }
        String type2 = createCredentialException.getType();
        C162457s7.A0D(type2);
        boolean A0X = C175738Zn.A0Y(type2, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false);
        String type3 = createCredentialException.getType();
        C162457s7.A0D(type3);
        String message = createCredentialException.getMessage();
        if (A0X) {
            return A04(type3, message);
        }
        return new C006906i(type3, message);
    }

    public static final AnonymousClass0GQ A05(GetCredentialException getCredentialException) {
        String type = getCredentialException.getType();
        switch (type.hashCode()) {
            case -781118336:
                if (type.equals("android.credentials.GetCredentialException.TYPE_UNKNOWN")) {
                    return new C008206v(getCredentialException.getMessage());
                }
                break;
            case -45448328:
                if (type.equals("android.credentials.GetCredentialException.TYPE_INTERRUPTED")) {
                    return new C008006t(getCredentialException.getMessage());
                }
                break;
            case 580557411:
                if (type.equals("android.credentials.GetCredentialException.TYPE_USER_CANCELED")) {
                    return new C007906s(getCredentialException.getMessage());
                }
                break;
            case 627896683:
                if (type.equals("android.credentials.GetCredentialException.TYPE_NO_CREDENTIAL")) {
                    return new C008406x(getCredentialException.getMessage());
                }
                break;
        }
        String type2 = getCredentialException.getType();
        C162457s7.A0D(type2);
        boolean A0X = C175738Zn.A0Y(type2, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false);
        String type3 = getCredentialException.getType();
        C162457s7.A0D(type3);
        String message = getCredentialException.getMessage();
        if (A0X) {
            return A06(type3, message);
        }
        return new C007706q(type3, message);
    }

    public static boolean A08(String str, String str2, StringBuilder sb) {
        sb.append(str);
        return str2.equals(sb.toString());
    }

    public final GetCredentialRequest A0A(AnonymousClass0KT r8) {
        Bundle A08 = AnonymousClass002.A08();
        A08.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI", false);
        A08.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", true);
        A08.putParcelable("androidx.credentials.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME", (Parcelable) null);
        GetCredentialRequest.Builder builder = new GetCredentialRequest.Builder(A08);
        for (AnonymousClass0ML r4 : r8.A00) {
            builder.addCredentialOption(new CredentialOption.Builder(r4.A02, r4.A01, r4.A00).setIsSystemProviderRequired(false).setAllowedProviders(r4.A03).build());
        }
        GetCredentialRequest build = builder.build();
        C162457s7.A0D(build);
        return build;
    }
}
