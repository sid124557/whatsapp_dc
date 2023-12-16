package X;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Arrays;

/* renamed from: X.6UW  reason: invalid class name */
public class AnonymousClass6UW extends C127206Rb {
    public static final Parcelable.Creator CREATOR = new C163957ue();
    public final byte[] A00;
    public final byte[] A01;
    public final byte[] A02;
    public final byte[] A03;
    public final byte[] A04;

    public int hashCode() {
        Object[] objArr = new Object[5];
        AnonymousClass000.A1L(objArr, Arrays.hashCode(this.A00));
        AnonymousClass000.A1M(objArr, Arrays.hashCode(this.A01));
        AnonymousClass000.A1N(objArr, Arrays.hashCode(this.A02));
        AnonymousClass000.A1O(objArr, Arrays.hashCode(this.A03));
        C18280x3.A1P(objArr, Arrays.hashCode(this.A04));
        return Arrays.hashCode(objArr);
    }

    public byte[] A00() {
        return this.A02;
    }

    public byte[] A01() {
        return this.A01;
    }

    public byte[] A02() {
        return this.A03;
    }

    public byte[] A03() {
        return this.A04;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AnonymousClass6UW) {
            AnonymousClass6UW r4 = (AnonymousClass6UW) obj;
            if (!Arrays.equals(this.A00, r4.A00) || !Arrays.equals(this.A01, r4.A01) || !Arrays.equals(this.A02, r4.A02) || !Arrays.equals(this.A03, r4.A03) || !Arrays.equals(this.A04, r4.A04)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public AnonymousClass6UW(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        C162177rO.A02(bArr);
        this.A00 = bArr;
        C162177rO.A02(bArr2);
        this.A01 = bArr2;
        C162177rO.A02(bArr3);
        this.A02 = bArr3;
        C162177rO.A02(bArr4);
        this.A03 = bArr4;
        this.A04 = bArr5;
    }

    public String toString() {
        AnonymousClass7WD r2 = new AnonymousClass7WD(C18310x6.A0n(this));
        C157117hl r3 = C157117hl.A04;
        byte[] bArr = this.A00;
        r2.A00(r3.A00(bArr, bArr.length), "keyHandle");
        byte[] bArr2 = this.A01;
        r2.A00(r3.A00(bArr2, bArr2.length), PublicKeyCredentialControllerUtility.JSON_KEY_CLIENT_DATA);
        byte[] bArr3 = this.A02;
        r2.A00(r3.A00(bArr3, bArr3.length), PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_DATA);
        byte[] bArr4 = this.A03;
        r2.A00(r3.A00(bArr4, bArr4.length), PublicKeyCredentialControllerUtility.JSON_KEY_SIGNATURE);
        byte[] bArr5 = this.A04;
        if (bArr5 != null) {
            r2.A00(r3.A00(bArr5, bArr5.length), PublicKeyCredentialControllerUtility.JSON_KEY_USER_HANDLE);
        }
        return r2.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A0E(parcel, this.A00, 2, false);
        C162417s1.A0E(parcel, this.A01, 3, false);
        C162417s1.A0E(parcel, this.A02, 4, false);
        C162417s1.A0E(parcel, this.A03, 5, false);
        C162417s1.A0E(parcel, this.A04, 6, false);
        C162417s1.A06(parcel, A002);
    }
}
