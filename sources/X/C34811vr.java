package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.1vr  reason: invalid class name and case insensitive filesystem */
public class C34811vr extends C41022Iq {
    public String A00;

    public C34811vr(AnonymousClass36K r10, int i) {
        String str;
        String[] strArr;
        Class<String> cls;
        boolean z;
        Object obj;
        Long A0R;
        long j;
        AnonymousClass36K r2 = r10;
        switch (i) {
            case 0:
                AnonymousClass36K.A0N(r10, "trigger");
                str = PublicKeyCredentialControllerUtility.JSON_KEY_NAME;
                break;
            case 1:
                AnonymousClass36K.A0N(r10, "l2checkout");
                str = "merchant_public_key";
                break;
            default:
                strArr = new String[]{"display_name"};
                cls = String.class;
                z = false;
                obj = null;
                A0R = AnonymousClass0x2.A0U();
                j = 128;
                break;
        }
        strArr = new String[]{str};
        cls = String.class;
        z = false;
        obj = null;
        A0R = AnonymousClass0x2.A0R();
        j = 9007199254740991L;
        this.A00 = (String) C626836d.A06(r2, cls, A0R, Long.valueOf(j), obj, strArr, z);
        this.A00 = r10;
    }
}
