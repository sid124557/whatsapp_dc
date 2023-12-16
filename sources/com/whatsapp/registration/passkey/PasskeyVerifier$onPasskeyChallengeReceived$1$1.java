package com.whatsapp.registration.passkey;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass4GR;
import X.AnonymousClass58Z;
import X.AnonymousClass79X;
import X.C009707r;
import X.C100555Bj;
import X.C100565Bk;
import X.C104655Rv;
import X.C104665Rw;
import X.C115505om;
import X.C162457s7;
import X.C56502s5;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import X.C97704z6;
import X.C97714z7;
import X.C997558b;
import android.util.Base64;
import com.whatsapp.registration.passkeys.PasskeyAndroidApiImpl;
import com.whatsapp.util.Log;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.registration.passkey.PasskeyVerifier$onPasskeyChallengeReceived$1$1", f = "PasskeyVerifier.kt", i = {}, l = {191}, m = "invokeSuspend", n = {}, s = {})
public final class PasskeyVerifier$onPasskeyChallengeReceived$1$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ String $passkeyChallenge;
    public int label;
    public final /* synthetic */ C115505om this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PasskeyVerifier$onPasskeyChallengeReceived$1$1(C115505om r2, String str, C84814Du r4) {
        super(r4, 2);
        this.this$0 = r2;
        this.$passkeyChallenge = str;
    }

    public final Object A09(Object obj) {
        AnonymousClass4GR r1;
        C997558b r0;
        AnonymousClass218 r4 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            C115505om r02 = this.this$0;
            PasskeyAndroidApiImpl passkeyAndroidApiImpl = r02.A06;
            Object obj2 = r02.A08.get();
            C162457s7.A0K(obj2, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            String str = this.$passkeyChallenge;
            this.label = 1;
            obj = passkeyAndroidApiImpl.A01((C009707r) obj2, str, this);
            if (obj == r4) {
                return r4;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        C100555Bj r9 = (C100555Bj) obj;
        if (r9 instanceof C97714z7) {
            Log.i("PasskeyVerification/onPasskeyChallengeReceived/PasskeyLoginEvent/passkey_client_login_success");
            this.this$0.A05.A05("verify_passkey", "passkey_client_login_success", (String) null, (String) null);
            byte[] bytes = ((String) ((C97714z7) r9).A00).getBytes(AnonymousClass79X.A05);
            C162457s7.A0D(bytes);
            this.this$0.A09.invoke(C997558b.SUCCESS, Base64.encodeToString(bytes, 2));
        } else if (r9 instanceof C97704z6) {
            C104655Rv r12 = (C104655Rv) ((C97704z6) r9).A00;
            AnonymousClass58Z r03 = r12.A00;
            Throwable th = r12.A01;
            int ordinal = r03.ordinal();
            if (ordinal == 1) {
                Log.e("PasskeyVerification/passkeyEvent/passkey_client_login_cancelled", th);
                C56502s5 r3 = this.this$0.A05;
                C104665Rw A00 = C100565Bk.A00(th);
                r3.A05("verify_passkey", "passkey_client_login_cancelled", A00.A01, A00.A00);
                r1 = this.this$0.A09;
                r0 = C997558b.ANDROID_API_VERIFICATION_CANCELLED;
            } else if (ordinal == 0) {
                Log.e("PasskeyVerification/passkeyEvent/passkey_client_login_ineligible", th);
                this.this$0.A05.A05("verify_passkey", "passkey_client_login_ineligible", C100565Bk.A00(th).A01, (String) null);
                r1 = this.this$0.A09;
                r0 = C997558b.ANDROID_API_VERIFICATION_INELIGIBLE;
            } else if (ordinal == 2) {
                Log.e("PasskeyVerification/passkeyEvent/passkey_client_login_nopasskey", th);
                C56502s5 r32 = this.this$0.A05;
                C104665Rw A002 = C100565Bk.A00(th);
                r32.A05("verify_passkey", "passkey_client_login_nopasskey", A002.A01, A002.A00);
                r1 = this.this$0.A09;
                r0 = C997558b.ANDROID_API_VERIFICATION_NOPASSKEY;
            } else if (ordinal == 3 || ordinal == 4) {
                Log.e("PasskeyVerification/passkeyEvent/passkey_client_login_error", th);
                C56502s5 r33 = this.this$0.A05;
                C104665Rw A003 = C100565Bk.A00(th);
                r33.A05("verify_passkey", "passkey_client_login_error", A003.A01, A003.A00);
                r1 = this.this$0.A09;
                r0 = C997558b.ANDROID_API_VERIFICATION_FAILED;
            }
            r1.invoke(r0, (Object) null);
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new PasskeyVerifier$onPasskeyChallengeReceived$1$1(this.this$0, this.$passkeyChallenge, r5);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
