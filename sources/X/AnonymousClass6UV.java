package X;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Arrays;

/* renamed from: X.6UV  reason: invalid class name */
public class AnonymousClass6UV extends C127206Rb {
    public static final Parcelable.Creator CREATOR = new C163967uf();
    public final byte[] A00;
    public final byte[] A01;
    public final byte[] A02;
    public final String[] A03;

    public byte[] A00() {
        return this.A02;
    }

    public byte[] A01() {
        return this.A01;
    }

    public String[] A02() {
        return this.A03;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AnonymousClass6UV) {
            AnonymousClass6UV r4 = (AnonymousClass6UV) obj;
            if (!Arrays.equals(this.A00, r4.A00) || !Arrays.equals(this.A01, r4.A01) || !Arrays.equals(this.A02, r4.A02)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public AnonymousClass6UV(byte[] bArr, byte[] bArr2, byte[] bArr3, String[] strArr) {
        C162177rO.A02(bArr);
        this.A00 = bArr;
        C162177rO.A02(bArr2);
        this.A01 = bArr2;
        C162177rO.A02(bArr3);
        this.A02 = bArr3;
        C162177rO.A02(strArr);
        this.A03 = strArr;
    }

    public int hashCode() {
        Object[] A1X = AnonymousClass0x9.A1X();
        AnonymousClass000.A1L(A1X, Arrays.hashCode(this.A00));
        AnonymousClass000.A1M(A1X, Arrays.hashCode(this.A01));
        AnonymousClass000.A1N(A1X, Arrays.hashCode(this.A02));
        return Arrays.hashCode(A1X);
    }

    public String toString() {
        AnonymousClass7WD r2 = new AnonymousClass7WD(C18310x6.A0n(this));
        C157117hl r3 = C157117hl.A04;
        byte[] bArr = this.A00;
        r2.A00(r3.A00(bArr, bArr.length), "keyHandle");
        byte[] bArr2 = this.A01;
        r2.A00(r3.A00(bArr2, bArr2.length), PublicKeyCredentialControllerUtility.JSON_KEY_CLIENT_DATA);
        byte[] bArr3 = this.A02;
        r2.A00(r3.A00(bArr3, bArr3.length), PublicKeyCredentialControllerUtility.JSON_KEY_ATTESTATION_OBJ);
        r2.A00(Arrays.toString(this.A03), PublicKeyCredentialControllerUtility.JSON_KEY_TRANSPORTS);
        return r2.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A0E(parcel, this.A00, 2, false);
        C162417s1.A0E(parcel, this.A01, 3, false);
        C162417s1.A0E(parcel, this.A02, 4, false);
        C162417s1.A0G(parcel, this.A03, 5);
        C162417s1.A06(parcel, A002);
    }
}
