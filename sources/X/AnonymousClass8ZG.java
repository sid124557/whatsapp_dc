package X;

import com.whatsapp.util.Log;

/* renamed from: X.8ZG  reason: invalid class name */
public final class AnonymousClass8ZG extends C829045j implements AnonymousClass4GQ {
    public static final AnonymousClass8ZG A00 = new AnonymousClass8ZG();

    public AnonymousClass8ZG() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass36K r4 = (AnonymousClass36K) obj;
        C162457s7.A0J(r4, 0);
        AnonymousClass36K A0l = r4.A0l("credential_create");
        if (A0l == null) {
            Log.e("PasskeyServer/parseStartRegisterResponse/credential_create node missing");
            return new C97704z6(new C143526z2("credential_create node missing"));
        }
        byte[] bArr = A0l.A01;
        if (bArr != null) {
            return new C97714z7(new String(bArr, AnonymousClass79X.A05));
        }
        Log.e("PasskeyServer/parseStartRegisterResponse/credential_create node has no data");
        return new C97704z6(new C143526z2("credential_create node not set"));
    }
}
