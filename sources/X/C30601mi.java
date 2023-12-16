package X;

import android.database.Cursor;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.1mi  reason: invalid class name and case insensitive filesystem */
public final class C30601mi extends C30331mH implements AnonymousClass4BB {
    public long A00;
    public C372421m A01;
    public byte[] A02;
    public byte[] A03;
    public byte[] A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C30601mi(C372421m r2, AnonymousClass2z0 r3, C52042kn r4, long j, long j2) {
        super(r3, (byte) 93, j);
        C162457s7.A0J(r2, 4);
        this.A00 = j2;
        this.A01 = r2;
        this.A05 = r4;
    }

    public void A1y(Cursor cursor, C623334p r10, HashMap hashMap) {
        C162457s7.A0J(r10, 0);
        C18260x0.A0Q(cursor, hashMap);
        super.A1y(cursor, r10, hashMap);
        int A0K = AnonymousClass001.A0K(C18290x4.A0i(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE, hashMap));
        int A0K2 = AnonymousClass001.A0K(C18290x4.A0i("sender_timestamp", hashMap));
        int i = cursor.getInt(A0K);
        long j = cursor.getLong(A0K2);
        int i2 = C372421m.UNKNOWN.value;
        int i3 = C372421m.NOT_GOING.value;
        if (i < i2) {
            i = i2;
        } else if (i > i3) {
            i = i3;
        }
        for (C372421m r1 : C372421m.values()) {
            if (r1.value == i) {
                this.A01 = r1;
                this.A00 = j;
                return;
            }
        }
        throw C18320x8.A0t();
    }

    public List BDE() {
        AnonymousClass36K[] r3 = new AnonymousClass36K[1];
        AnonymousClass39V[] r2 = new AnonymousClass39V[1];
        AnonymousClass36K.A0U("meta", r2, r3, AnonymousClass39V.A0F("event_type", PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE, r2) ? 1 : 0);
        return AnonymousClass8UF.A0p(r3);
    }

    public C30601mi(AnonymousClass2z0 r2, C52042kn r3, byte[] bArr, byte[] bArr2, long j) {
        super(r2, (byte) 93, j);
        this.A03 = bArr2;
        this.A02 = bArr;
        this.A05 = r3;
    }

    public C30601mi(AnonymousClass2z0 r2, long j) {
        super(r2, (byte) 93, j);
    }

    public C30601mi(C372421m r2, AnonymousClass2z0 r3, byte[] bArr, long j) {
        super(r3, (byte) 93, j);
        this.A00 = j;
        this.A04 = bArr;
        this.A01 = r2;
    }
}
