package X;

import android.graphics.BitmapFactory;

/* renamed from: X.5nI  reason: invalid class name and case insensitive filesystem */
public class C114595nI implements C84604Cz {
    public final /* synthetic */ C15790rw A00;
    public final /* synthetic */ AnonymousClass4VR A01;

    public C114595nI(C15790rw r1, AnonymousClass4VR r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void BU9(C27991fJ r3, String str, String str2, String str3, byte[] bArr) {
        if (bArr != null) {
            this.A00.AwB(BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
        }
    }

    public void onError(int i) {
        C18260x0.A0z("JoinGroupViewModel/failed-to-get-group-photo/", AnonymousClass001.A0o(), i);
    }
}
