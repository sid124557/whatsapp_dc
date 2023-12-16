package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.5dg  reason: invalid class name and case insensitive filesystem */
public final class C108865dg implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C165757xa();
    public String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A04);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeString(this.A03);
    }

    public final boolean A00() {
        String str = this.A04;
        if (str != null && str.length() != 0) {
            return false;
        }
        String str2 = this.A02;
        if (str2 != null && str2.length() != 0) {
            return false;
        }
        String str3 = this.A03;
        if (str3 == null || str3.length() == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r3.length() == 0) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] A01() {
        /*
            r4 = this;
            java.lang.String r3 = r4.A03
            r2 = 0
            if (r3 == 0) goto L_0x000c
            int r1 = r3.length()
            r0 = 0
            if (r1 != 0) goto L_0x000d
        L_0x000c:
            r0 = 1
        L_0x000d:
            r1 = 0
            if (r0 == 0) goto L_0x0011
            return r1
        L_0x0011:
            byte[] r0 = android.util.Base64.decode(r3, r2)     // Catch:{ IllegalArgumentException -> 0x0016 }
            return r0
        L_0x0016:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C108865dg.A01():byte[]");
    }

    public int describeContents() {
        return 0;
    }

    public C108865dg(String str, String str2, String str3, String str4, String str5) {
        this.A00 = str;
        this.A04 = str2;
        this.A02 = str3;
        this.A01 = str4;
        this.A03 = str5;
    }

    public String toString() {
        Object obj;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ShopEntityMetaData(id='");
        A0o.append(this.A00);
        A0o.append("', title='");
        A0o.append(this.A04);
        A0o.append("', subTitle='");
        A0o.append(this.A02);
        A0o.append("', imageUrl='");
        A0o.append(this.A01);
        A0o.append("', thumbBase64Encoded='");
        String str = this.A03;
        if (str != null) {
            obj = Integer.valueOf(str.length());
        } else {
            obj = "null";
        }
        A0o.append(obj);
        return AnonymousClass000.A0X("')", A0o);
    }
}
