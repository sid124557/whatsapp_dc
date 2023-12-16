package X;

import android.os.Handler;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.3Si  reason: invalid class name and case insensitive filesystem */
public class C68223Si implements AnonymousClass4EZ {
    public final Handler A00 = AnonymousClass000.A0A();
    public final AnonymousClass31C A01;
    public final WeakReference A02;

    public C68223Si(AnonymousClass4A0 r2, AnonymousClass31C r3) {
        this.A02 = AnonymousClass0x9.A14(r2);
        this.A01 = r3;
    }

    public void BQs(String str) {
        Log.e("sendVerifyLinkRequest/delivery failure ");
        Object obj = this.A02.get();
        if (obj != null) {
            C69983Zk.A01(this.A00, obj, 37);
        }
    }

    public void BSN(AnonymousClass36K r6, String str) {
        int A012 = C57492tj.A01(r6);
        C18260x0.A0z("sendVerifyLinkRequest/response-error ", AnonymousClass001.A0o(), A012);
        Object obj = this.A02.get();
        if (obj != null) {
            this.A00.post(new C117705sM(obj, A012, 30));
        }
    }

    public void BdM(AnonymousClass36K r8, String str) {
        Handler handler;
        int i;
        int i2;
        String str2;
        AnonymousClass36K A0l = r8.A0l(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE);
        Object obj = this.A02.get();
        if (A0l == null) {
            int A012 = C57492tj.A01(r8);
            if (obj != null) {
                this.A00.post(new C117705sM(obj, A012, 28));
            }
            C18260x0.A0z("sendVerifyLinkRequest/response-error ", AnonymousClass001.A0o(), A012);
            return;
        }
        AnonymousClass36K A0l2 = A0l.A0l("status");
        if (A0l2 == null) {
            if (obj != null) {
                handler = this.A00;
                i = 38;
            }
            Log.w("sendVerifyLinkRequest/response-error -1");
        }
        try {
            if (A0l2.A0n() != null) {
                i2 = Integer.parseInt(A0l2.A0n());
                if (i2 == 200) {
                    AnonymousClass36K A0l3 = A0l.A0l("url");
                    if (A0l3 == null) {
                        str2 = null;
                    } else {
                        str2 = A0l3.A0n();
                    }
                    if (obj != null) {
                        this.A00.post(new C71323bv(37, str2, obj));
                        return;
                    }
                    return;
                }
            } else {
                i2 = 0;
            }
            if (obj != null) {
                this.A00.post(new C117705sM(obj, i2, 29));
            }
            C18260x0.A0z("sendVerifyLinkRequest/response-error ", AnonymousClass001.A0o(), i2);
            return;
        } catch (NumberFormatException unused) {
            if (obj != null) {
                handler = this.A00;
                i = 39;
            }
        }
        C69983Zk.A01(handler, obj, i);
        Log.w("sendVerifyLinkRequest/response-error -1");
    }
}
