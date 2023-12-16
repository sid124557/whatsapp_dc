package X;

import com.whatsapp.util.Log;

/* renamed from: X.8ZF  reason: invalid class name */
public final class AnonymousClass8ZF extends C829045j implements AnonymousClass4GQ {
    public static final AnonymousClass8ZF A00 = new AnonymousClass8ZF();

    public AnonymousClass8ZF() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        Object r2;
        Boolean bool;
        AnonymousClass36K r4 = (AnonymousClass36K) obj;
        C162457s7.A0J(r4, 0);
        AnonymousClass36K A0l = r4.A0l("result");
        if (A0l == null) {
            Log.e("PasskeyServer/parsePasskeyExistsResponse/result node missing");
            return new C97704z6(new C143526z2("result node missing"));
        }
        byte[] bArr = A0l.A01;
        if (bArr != null) {
            str = new String(bArr, AnonymousClass79X.A05);
        } else {
            str = null;
        }
        if (C162457s7.A0P(str, "true")) {
            bool = Boolean.TRUE;
        } else if (C162457s7.A0P(str, "false")) {
            bool = Boolean.FALSE;
        } else {
            C18260x0.A0r("PasskeyServer/parsePasskeyExistsResponse/bad data: ", str, AnonymousClass001.A0o());
            r2 = new C97704z6(new C143526z2(AnonymousClass000.A0V("bad data: ", str, AnonymousClass001.A0o())));
            C18260x0.A1R(AnonymousClass001.A0o(), "PasskeyServer/parsePasskeyExistsResponse/success: ", r2);
            return r2;
        }
        r2 = new C97714z7(bool);
        C18260x0.A1R(AnonymousClass001.A0o(), "PasskeyServer/parsePasskeyExistsResponse/success: ", r2);
        return r2;
    }
}
