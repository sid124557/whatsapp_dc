package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.io.File;
import java.util.Arrays;

/* renamed from: X.39R  reason: invalid class name */
public class AnonymousClass39R implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass4IW.A00(7);
    public long A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public boolean A07;
    public byte[] A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final long A0E;
    public final String A0F;
    public final String A0G;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass39R r7 = (AnonymousClass39R) obj;
            if (!this.A0F.equals(r7.A0F) || this.A0E != r7.A0E || this.A0D != r7.A0D || this.A09 != r7.A09 || !this.A0G.equals(r7.A0G) || this.A0A != r7.A0A || this.A0C != r7.A0C || this.A0B != r7.A0B || !AnonymousClass75J.A00(this.A05, r7.A05) || !AnonymousClass75J.A00(this.A01, r7.A01) || !AnonymousClass75J.A00(this.A06, r7.A06) || !Arrays.equals(this.A08, r7.A08) || this.A00 != r7.A00 || !AnonymousClass75J.A00(this.A04, r7.A04) || !AnonymousClass75J.A00(this.A03, r7.A03) || !AnonymousClass75J.A00(this.A02, r7.A02) || this.A07 != r7.A07) {
                return false;
            }
        }
        return true;
    }

    public static AnonymousClass39R A00(C21931Ds r20, boolean z) {
        C21931Ds r5 = r20;
        String str = r5.id_;
        long j = r5.fileLength_;
        int i = r5.width_;
        int i2 = r5.height_;
        AnonymousClass39R r8 = new AnonymousClass39R(str, r5.mimetype_, (String) null, (String) null, (String) null, i, i2, r5.placeholderArgb_, r5.textArgb_, r5.subtextArgb_, j);
        if (z) {
            AnonymousClass1DI r7 = r5.mediaData_;
            if (r7 == null) {
                r7 = AnonymousClass1DI.DEFAULT_INSTANCE;
            }
            if ((r7.bitField0_ & 1) != 0) {
                byte[] A072 = r7.mediaKey_.A07();
                long j2 = r7.mediaKeyTimestamp_;
                String encodeToString = Base64.encodeToString(r7.fileSha256_.A07(), 2);
                String A0d = C18320x8.A0d(r7.fileEncSha256_, 2);
                String str2 = r7.directPath_;
                r8.A08 = A072;
                r8.A00 = j2;
                r8.A04 = encodeToString;
                r8.A03 = A0d;
                r8.A02 = str2;
                r8.A07 = true;
            }
        }
        return r8;
    }

    public C21931Ds A01() {
        AnonymousClass1DI r3;
        if (!this.A07 || this.A08 == null) {
            r3 = null;
        } else {
            C130546c9 A0G2 = AnonymousClass1DI.DEFAULT_INSTANCE.A0G();
            byte[] bArr = this.A08;
            C172548Lq A0J = C18300x5.A0J(A0G2, bArr, bArr.length);
            AnonymousClass1DI r1 = (AnonymousClass1DI) A0G2.A00;
            r1.bitField0_ |= 1;
            r1.mediaKey_ = A0J;
            long j = this.A00;
            AnonymousClass1DI r12 = (AnonymousClass1DI) C18320x8.A0C(A0G2);
            r12.bitField0_ |= 2;
            r12.mediaKeyTimestamp_ = j;
            String str = this.A02;
            AnonymousClass1DI r13 = (AnonymousClass1DI) C18320x8.A0C(A0G2);
            str.getClass();
            r13.bitField0_ |= 16;
            r13.directPath_ = str;
            C172548Lq A0H = C18280x3.A0H(A0G2, Base64.decode(this.A04, 2));
            AnonymousClass1DI r14 = (AnonymousClass1DI) A0G2.A00;
            r14.bitField0_ |= 4;
            r14.fileSha256_ = A0H;
            C172548Lq A0H2 = C18280x3.A0H(A0G2, Base64.decode(this.A03, 2));
            AnonymousClass1DI r15 = (AnonymousClass1DI) A0G2.A00;
            r15.bitField0_ |= 8;
            r15.fileEncSha256_ = A0H2;
            r3 = (AnonymousClass1DI) A0G2.A06();
        }
        C130546c9 A0G3 = C21931Ds.DEFAULT_INSTANCE.A0G();
        String str2 = this.A0F;
        C21931Ds r16 = (C21931Ds) C18320x8.A0C(A0G3);
        str2.getClass();
        r16.bitField0_ |= 1;
        r16.id_ = str2;
        long j2 = this.A0E;
        C21931Ds r17 = (C21931Ds) C18320x8.A0C(A0G3);
        r17.bitField0_ |= 2;
        r17.fileLength_ = j2;
        int i = this.A0D;
        C21931Ds r18 = (C21931Ds) C18320x8.A0C(A0G3);
        r18.bitField0_ |= 4;
        r18.width_ = i;
        int i2 = this.A09;
        C21931Ds r19 = (C21931Ds) C18320x8.A0C(A0G3);
        r19.bitField0_ |= 8;
        r19.height_ = i2;
        String str3 = this.A0G;
        C21931Ds r110 = (C21931Ds) C18320x8.A0C(A0G3);
        str3.getClass();
        r110.bitField0_ |= 16;
        r110.mimetype_ = str3;
        int i3 = this.A0A;
        C21931Ds r111 = (C21931Ds) C18320x8.A0C(A0G3);
        r111.bitField0_ |= 32;
        r111.placeholderArgb_ = i3;
        int i4 = this.A0C;
        C21931Ds r112 = (C21931Ds) C18320x8.A0C(A0G3);
        r112.bitField0_ |= 64;
        r112.textArgb_ = i4;
        int i5 = this.A0B;
        C21931Ds r113 = (C21931Ds) C18320x8.A0C(A0G3);
        r113.bitField0_ |= 128;
        r113.subtextArgb_ = i5;
        if (r3 != null) {
            C21931Ds r114 = (C21931Ds) C18320x8.A0C(A0G3);
            r114.mediaData_ = r3;
            r114.bitField0_ |= 256;
        }
        return (C21931Ds) A0G3.A06();
    }

    public int hashCode() {
        Object[] objArr = new Object[16];
        objArr[0] = this.A0F;
        AnonymousClass001.A1Q(objArr, this.A0E);
        AnonymousClass000.A1N(objArr, this.A0D);
        AnonymousClass000.A1O(objArr, this.A09);
        objArr[4] = this.A0G;
        C18310x6.A1U(objArr, this.A0A);
        C18290x4.A1U(objArr, this.A0C);
        C18310x6.A1V(objArr, this.A0B);
        objArr[8] = this.A05;
        objArr[9] = this.A01;
        objArr[10] = this.A06;
        objArr[11] = this.A08;
        objArr[12] = Long.valueOf(this.A00);
        objArr[13] = this.A04;
        objArr[14] = this.A03;
        return C18310x6.A08(this.A02, objArr, 15);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A0F);
        parcel.writeLong(this.A0E);
        parcel.writeInt(this.A0D);
        parcel.writeInt(this.A09);
        parcel.writeString(this.A0G);
        parcel.writeInt(this.A0A);
        parcel.writeInt(this.A0C);
        parcel.writeInt(this.A0B);
        parcel.writeString(this.A05);
        parcel.writeString(this.A01);
        parcel.writeString(this.A06);
        byte[] bArr = this.A08;
        if (bArr != null) {
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(this.A08);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeLong(this.A00);
        parcel.writeString(this.A04);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A07 ? 1 : 0);
    }

    public AnonymousClass39R(Parcel parcel) {
        this.A0F = C18310x6.A0l(parcel);
        this.A0E = parcel.readLong();
        this.A0D = parcel.readInt();
        this.A09 = parcel.readInt();
        this.A0G = C18310x6.A0l(parcel);
        this.A0A = parcel.readInt();
        this.A0C = parcel.readInt();
        this.A0B = parcel.readInt();
        this.A05 = parcel.readString();
        this.A01 = parcel.readString();
        this.A06 = parcel.readString();
        int readInt = parcel.readInt();
        if (readInt > 0) {
            byte[] bArr = new byte[readInt];
            this.A08 = bArr;
            parcel.readByteArray(bArr);
        }
        this.A00 = parcel.readLong();
        this.A04 = parcel.readString();
        this.A03 = parcel.readString();
        this.A02 = parcel.readString();
        this.A07 = AnonymousClass001.A1T(parcel.readInt());
    }

    public File A02(File file) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(this.A0F);
        return C18270x1.A0A(file, ".webp", A0o);
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "PaymentBackgroundMetadata{}";
    }

    public AnonymousClass39R(String str, String str2, String str3, String str4, String str5, int i, int i2, int i3, int i4, int i5, long j) {
        this.A0F = str;
        this.A0E = j;
        this.A0D = i;
        this.A09 = i2;
        this.A0G = str2;
        this.A0A = i3;
        this.A0C = i4;
        this.A0B = i5;
        this.A05 = str3;
        this.A01 = str4;
        this.A06 = str5;
    }
}
