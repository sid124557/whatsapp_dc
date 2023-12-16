package X;

import android.app.Activity;
import com.whatsapp.registration.passkey.PasskeyVerifier$onPasskeyChallengeReceived$1$1;
import com.whatsapp.registration.passkeys.PasskeyAndroidApiImpl;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.5om  reason: invalid class name and case insensitive filesystem */
public final class C115505om implements C185138t9 {
    public final C620633i A00;
    public final C54292oU A01;
    public final AnonymousClass33p A02;
    public final C56912sl A03;
    public final C153017aX A04;
    public final C56502s5 A05;
    public final PasskeyAndroidApiImpl A06;
    public final AnonymousClass4FS A07;
    public final WeakReference A08;
    public final AnonymousClass4GR A09;

    public void BPK(C998958p r7, C108935do r8, String str) {
        C18260x0.A1R(C18280x3.A0g(r7, 1), "PasskeyVerification/onCodeEntrypointResponse/status=", r7);
        if (r8 == null || r7 != C998958p.YES) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("PasskeyVerification/PasskeyLoginEvent/passkey_start_login_error/error=");
            String name = r7.name();
            C18260x0.A1K(A0o, name);
            this.A05.A05("enter_number", "passkey_start_login_error", name, (String) null);
            AnonymousClass36l.A0O(this.A02, name);
            this.A09.invoke(C997558b.CODE_REQUEST_FAILURE, (Object) null);
            return;
        }
        Log.i("PasskeyVerification/passkeyLoginEvent/passkey_start_login_success");
        C56502s5 r5 = this.A05;
        r5.A05("enter_number", "passkey_start_login_success", (String) null, (String) null);
        Log.i("PasskeyVerification/onPasskeyChallengeReceived/attempt to verify authResponse");
        AnonymousClass00M r1 = (AnonymousClass00M) this.A08.get();
        if (r1 != null) {
            String str2 = r8.A0D;
            if (str2 != null) {
                C616131n.A02((C85494Gl) null, new PasskeyVerifier$onPasskeyChallengeReceived$1$1(this, str2, (C84814Du) null), AnonymousClass0IT.A00(r1), (AnonymousClass20D) null, 3);
                return;
            }
            Log.e("PasskeyVerification/passkeyEvent/passkey_start_login_error/invalidCode");
            r5.A05("enter_number", "passkey_start_login_error", "invalid_or_empty_code", (String) null);
            this.A09.invoke(C997558b.CODE_REQUEST_FAILURE, (Object) null);
            return;
        }
        Log.e("PasskeyVerification/PasskeyLoginEvent/passkey_client_login_error/error=parent_activity_null");
        r5.A05("enter_number", "passkey_client_login_error", "parent_activity_null", (String) null);
    }

    public void BFe(boolean z, String str) {
        WeakReference weakReference = this.A08;
        if (weakReference.get() != null && z) {
            Object obj = weakReference.get();
            C162457s7.A0K(obj, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            C621433s.A00((Activity) obj, 9);
        }
    }

    public void BpC(boolean z, String str) {
        WeakReference weakReference = this.A08;
        if (weakReference.get() != null && z) {
            Object obj = weakReference.get();
            C162457s7.A0K(obj, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            C621433s.A01((Activity) obj, 9);
        }
    }

    public C115505om(C620633i r1, C54292oU r2, AnonymousClass33p r3, C56912sl r4, C153017aX r5, C56502s5 r6, PasskeyAndroidApiImpl passkeyAndroidApiImpl, AnonymousClass4FS r8, WeakReference weakReference, AnonymousClass4GR r10) {
        C18260x0.A0f(r2, r1, r3, r4, r8);
        C18260x0.A0W(r5, passkeyAndroidApiImpl, r6);
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
        this.A03 = r4;
        this.A07 = r8;
        this.A04 = r5;
        this.A06 = passkeyAndroidApiImpl;
        this.A05 = r6;
        this.A08 = weakReference;
        this.A09 = r10;
    }
}
