package X;

import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.File;

/* renamed from: X.5di  reason: invalid class name and case insensitive filesystem */
public final class C108885di implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C108405cw();
    public AnonymousClass5YF A00;
    public final int A01;
    public final int A02;
    public final Point A03;
    public final Rect A04;
    public final Uri A05;
    public final File A06;
    public final File A07;
    public final Byte A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final boolean A0D;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C108885di) {
                C108885di r5 = (C108885di) obj;
                if (!C162457s7.A0P(this.A05, r5.A05) || !C162457s7.A0P(this.A08, r5.A08) || !C162457s7.A0P(this.A07, r5.A07) || !C162457s7.A0P(this.A09, r5.A09) || !C162457s7.A0P(this.A0C, r5.A0C) || !C162457s7.A0P(this.A0A, r5.A0A) || !C162457s7.A0P(this.A0B, r5.A0B) || this.A02 != r5.A02 || !C162457s7.A0P(this.A06, r5.A06) || !C162457s7.A0P(this.A04, r5.A04) || this.A0D != r5.A0D || !C162457s7.A0P(this.A03, r5.A03) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        byte byteValue;
        String absolutePath;
        String absolutePath2;
        C162457s7.A0J(parcel, 0);
        parcel.writeParcelable(this.A05, i);
        Byte b = this.A08;
        if (b == null) {
            byteValue = 0;
        } else {
            parcel.writeByte((byte) 1);
            byteValue = b.byteValue();
        }
        parcel.writeByte(byteValue);
        File file = this.A07;
        if (file == null) {
            absolutePath = null;
        } else {
            absolutePath = file.getAbsolutePath();
        }
        parcel.writeString(absolutePath);
        parcel.writeString(this.A09);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A0B);
        parcel.writeInt(this.A02);
        File file2 = this.A06;
        if (file2 == null) {
            absolutePath2 = null;
        } else {
            absolutePath2 = file2.getAbsolutePath();
        }
        parcel.writeString(absolutePath2);
        parcel.writeParcelable(this.A04, i);
        parcel.writeByte(this.A0D ? (byte) 1 : 0);
        parcel.writeParcelable(this.A03, i);
        parcel.writeInt(this.A01);
    }

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        return ((AnonymousClass0x2.A01((((((((((((((((((C18300x5.A04(this.A05) + AnonymousClass000.A07(this.A08)) * 31) + AnonymousClass000.A07(this.A07)) * 31) + C18270x1.A00(this.A09)) * 31) + C18270x1.A00(this.A0C)) * 31) + C18270x1.A00(this.A0A)) * 31) + C18270x1.A00(this.A0B)) * 31) + this.A02) * 31) + AnonymousClass000.A07(this.A06)) * 31) + AnonymousClass000.A07(this.A04)) * 31, this.A0D) + C18310x6.A07(this.A03)) * 31) + this.A01;
    }

    public C108885di(Point point, Rect rect, Uri uri, File file, File file2, Byte b, String str, String str2, String str3, String str4, int i, int i2, boolean z) {
        this.A05 = uri;
        this.A08 = b;
        this.A07 = file;
        this.A09 = str;
        this.A0C = str2;
        this.A0A = str3;
        this.A0B = str4;
        this.A02 = i;
        this.A06 = file2;
        this.A04 = rect;
        this.A0D = z;
        this.A03 = point;
        this.A01 = i2;
        C626936e.A06(uri);
        AnonymousClass5YF r0 = new AnonymousClass5YF(uri);
        this.A00 = r0;
        r0.A0F(b);
        this.A00.A0E(file);
        this.A00.A0G(str);
        this.A00.A0I(str2);
        this.A00.A0H(str3);
        AnonymousClass5YF r1 = this.A00;
        synchronized (r1) {
            r1.A0B = str4;
        }
        AnonymousClass5YF r12 = this.A00;
        synchronized (r12) {
            r12.A01 = i;
        }
        AnonymousClass5YF r13 = this.A00;
        synchronized (r13) {
            r13.A06 = file2;
        }
        AnonymousClass5YF r14 = this.A00;
        synchronized (r14) {
            r14.A04 = rect;
        }
        AnonymousClass5YF r15 = this.A00;
        synchronized (r15) {
            r15.A0F = z;
        }
        AnonymousClass5YF r16 = this.A00;
        synchronized (r16) {
            r16.A03 = point;
        }
        this.A00.A0D(i2);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("MediaPreviewItemParcel(uri=");
        A0o.append(this.A05);
        A0o.append(", type=");
        A0o.append(this.A08);
        A0o.append(", file=");
        A0o.append(this.A07);
        A0o.append(", caption=");
        A0o.append(this.A09);
        A0o.append(", mentionsKey=");
        A0o.append(this.A0C);
        A0o.append(", doodle=");
        A0o.append(this.A0A);
        A0o.append(", editState=");
        A0o.append(this.A0B);
        A0o.append(", rotation=");
        A0o.append(this.A02);
        A0o.append(", cropFile=");
        A0o.append(this.A06);
        A0o.append(", cropRect=");
        A0o.append(this.A04);
        A0o.append(", isSendAsGif=");
        A0o.append(this.A0D);
        A0o.append(", trim=");
        A0o.append(this.A03);
        A0o.append(", filterId=");
        return C18260x0.A09(A0o, this.A01);
    }
}
