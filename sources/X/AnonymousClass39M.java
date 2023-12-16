package X;

import android.content.ContentValues;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.File;

/* renamed from: X.39M  reason: invalid class name */
public final class AnonymousClass39M implements Parcelable {
    public static final Parcelable.Creator CREATOR = new AnonymousClass38Q();
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public AnonymousClass330 A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;

    public final AnonymousClass39M A03() {
        AnonymousClass39M r3 = new AnonymousClass39M((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, 0, false, false, false, false, false);
        r3.A0D = this.A0D;
        r3.A0G = this.A0G;
        r3.A06 = this.A06;
        r3.A00 = this.A00;
        r3.A03 = this.A03;
        r3.A02 = this.A02;
        r3.A04 = this.A04;
        r3.A07 = this.A07;
        r3.A0K = this.A0K;
        r3.A0A = this.A0A;
        r3.A0J = this.A0J;
        r3.A0H = this.A0H;
        r3.A0L = this.A0L;
        r3.A05 = this.A05;
        r3.A08 = this.A08;
        r3.A0B = this.A0B;
        r3.A0C = this.A0C;
        r3.A0I = this.A0I;
        String str = this.A09;
        if (str != null) {
            int i = this.A01;
            r3.A09 = str;
            r3.A01 = i;
        }
        return r3;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A08);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0C);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A03);
        parcel.writeString(this.A0F);
        parcel.writeString(this.A07);
        parcel.writeInt(this.A0K ? 1 : 0);
        parcel.writeInt(this.A0J ? 1 : 0);
        parcel.writeInt(this.A0I ? 1 : 0);
        parcel.writeInt(this.A0H ? 1 : 0);
        parcel.writeInt(this.A0L ? 1 : 0);
        parcel.writeString(this.A05);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A0G);
        parcel.writeString(this.A06);
        parcel.writeString(this.A09);
    }

    public final C369420i A04() {
        if (this.A0L) {
            return C369420i.LOTTIE;
        }
        return C369420i.WEBP;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("Sticker{");
        stringBuffer.append(", mimeType='");
        stringBuffer.append(this.A0C);
        stringBuffer.append('\'');
        stringBuffer.append(", height=");
        stringBuffer.append(this.A02);
        stringBuffer.append(", width=");
        stringBuffer.append(this.A03);
        stringBuffer.append(", metadata=");
        stringBuffer.append(this.A04);
        stringBuffer.append(", saltedFileHash='");
        stringBuffer.append(this.A0E);
        stringBuffer.append('\'');
        stringBuffer.append(", fileSize=");
        stringBuffer.append(this.A00);
        stringBuffer.append(", isLottie=");
        stringBuffer.append(this.A0L);
        stringBuffer.append('}');
        return C18290x4.A0o(stringBuffer);
    }

    public AnonymousClass39M(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A0D = str;
        this.A08 = str2;
        this.A0A = str3;
        this.A0B = str4;
        this.A0C = str5;
        this.A02 = i;
        this.A03 = i2;
        this.A0F = str6;
        this.A07 = str7;
        this.A0K = z;
        this.A0J = z2;
        this.A0I = z3;
        this.A0H = z4;
        this.A0L = z5;
        this.A05 = str8;
        this.A00 = i3;
        this.A0G = str9;
        this.A06 = str10;
        this.A09 = str11;
    }

    public static void A00(ContentValues contentValues, AnonymousClass39M r3) {
        contentValues.put("url", r3.A0G);
        contentValues.put("enc_hash", r3.A08);
        contentValues.put("direct_path", r3.A06);
        contentValues.put("mimetype", r3.A0C);
        contentValues.put("media_key", r3.A0B);
    }

    public static void A01(AnonymousClass39M r1, File file) {
        r1.A09 = file.getAbsolutePath();
    }

    public static void A02(AnonymousClass39M r2, File file) {
        r2.A09 = file.getAbsolutePath();
        r2.A01 = 1;
    }

    public int describeContents() {
        return 0;
    }

    public AnonymousClass39M() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, 0, false, false, false, false, false);
    }
}
