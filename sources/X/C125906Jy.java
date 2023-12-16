package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.android.exoplayer2.util.Util;
import java.util.Arrays;

/* renamed from: X.6Jy  reason: invalid class name and case insensitive filesystem */
public final class C125906Jy extends AnonymousClass81M {
    public static final Parcelable.Creator CREATOR = AnonymousClass91V.A00(6);
    public final int A00;
    public final String A01;
    public final String A02;
    public final byte[] A03;

    public C125906Jy(String str, byte[] bArr) {
        super("APIC");
        this.A02 = str;
        this.A01 = null;
        this.A00 = 3;
        this.A03 = bArr;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || C125906Jy.class != obj.getClass()) {
                return false;
            }
            C125906Jy r5 = (C125906Jy) obj;
            if (this.A00 != r5.A00 || !Util.A0D(this.A02, r5.A02) || !Util.A0D(this.A01, r5.A01) || !Arrays.equals(this.A03, r5.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass6CA.A09(this.A03, (((((527 + this.A00) * 31) + C86624Kv.A04(this.A02)) * 31) + AnonymousClass6CA.A06(this.A01)) * 31);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeByteArray(this.A03);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(this.A00);
        A0o.append(": mimeType=");
        AnonymousClass6C8.A1E(A0o, this.A02);
        return AnonymousClass000.A0X(this.A01, A0o);
    }

    public C125906Jy(Parcel parcel) {
        super("APIC");
        this.A02 = parcel.readString();
        this.A01 = parcel.readString();
        this.A00 = parcel.readInt();
        this.A03 = parcel.createByteArray();
    }
}
