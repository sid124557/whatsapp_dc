package X;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import org.json.JSONObject;

/* renamed from: X.38z  reason: invalid class name and case insensitive filesystem */
public final class C633738z implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C629737l();
    public final long A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C633738z) {
                C633738z r8 = (C633738z) obj;
                if (this.A06 != r8.A06 || this.A00 != r8.A00 || !C162457s7.A0P(this.A01, r8.A01) || !C162457s7.A0P(this.A02, r8.A02) || !C162457s7.A0P(this.A03, r8.A03) || !C162457s7.A0P(this.A05, r8.A05) || !C162457s7.A0P(this.A04, r8.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeByte(this.A06 ? (byte) 1 : 0);
        parcel.writeLong(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A05);
        parcel.writeString(this.A04);
    }

    public int hashCode() {
        return AnonymousClass0x7.A08(this.A04, AnonymousClass0x2.A07(this.A05, AnonymousClass0x2.A07(this.A03, AnonymousClass0x2.A07(this.A02, AnonymousClass0x2.A07(this.A01, AnonymousClass000.A00(AnonymousClass0x9.A04(this.A06), this.A00))))));
    }

    public C633738z(String str, String str2, String str3, String str4, String str5, long j, boolean z) {
        this.A06 = z;
        this.A00 = j;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A05 = str4;
        this.A04 = str5;
    }

    public final JSONObject A00() {
        JSONObject A1G = AnonymousClass0x9.A1G();
        A1G.put("secure", this.A06);
        A1G.put("expiry", this.A00);
        A1G.put("domain", this.A01);
        A1G.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, this.A02);
        A1G.put("path", this.A03);
        A1G.put("value", this.A05);
        return A1G;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("FBAccountCookie(secure=");
        A0o.append(this.A06);
        A0o.append(", expiry=");
        A0o.append(this.A00);
        A0o.append(", domain=");
        A0o.append(this.A01);
        A0o.append(", name=");
        A0o.append(this.A02);
        A0o.append(", path=");
        A0o.append(this.A03);
        A0o.append(", value=");
        A0o.append(this.A05);
        A0o.append(", url=");
        return C18260x0.A07(this.A04, A0o);
    }
}
