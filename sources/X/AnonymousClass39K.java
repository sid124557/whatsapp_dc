package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.39K  reason: invalid class name */
public final class AnonymousClass39K implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C629537j();
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public long A0B;
    public long A0C;
    public long A0D;
    public long A0E;
    public long A0F;
    public long A0G;
    public long A0H;
    public long A0I;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass39K) {
                AnonymousClass39K r8 = (AnonymousClass39K) obj;
                if (!(this.A06 == r8.A06 && this.A0I == r8.A0I && this.A03 == r8.A03 && this.A09 == r8.A09 && this.A00 == r8.A00 && this.A04 == r8.A04 && this.A07 == r8.A07 && this.A0A == r8.A0A && this.A01 == r8.A01 && this.A02 == r8.A02 && this.A05 == r8.A05 && this.A08 == r8.A08 && this.A0D == r8.A0D && this.A0B == r8.A0B && this.A0E == r8.A0E && this.A0F == r8.A0F && this.A0H == r8.A0H && this.A0C == r8.A0C && this.A0G == r8.A0G)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeInt(this.A06);
        parcel.writeLong(this.A0I);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A09);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A07);
        parcel.writeInt(this.A0A);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A05);
        parcel.writeInt(this.A08);
        parcel.writeLong(this.A0D);
        parcel.writeLong(this.A0B);
        parcel.writeLong(this.A0E);
        parcel.writeLong(this.A0F);
        parcel.writeLong(this.A0H);
        parcel.writeLong(this.A0C);
        parcel.writeLong(this.A0G);
    }

    public int hashCode() {
        return AnonymousClass0x2.A00(AnonymousClass000.A00(AnonymousClass000.A00(AnonymousClass000.A00(AnonymousClass000.A00(AnonymousClass000.A00(AnonymousClass000.A00((((((((((((((((((((AnonymousClass000.A00(this.A06 * 31, this.A0I) + this.A03) * 31) + this.A09) * 31) + this.A00) * 31) + this.A04) * 31) + this.A07) * 31) + this.A0A) * 31) + this.A01) * 31) + this.A02) * 31) + this.A05) * 31) + this.A08) * 31, this.A0D), this.A0B), this.A0E), this.A0F), this.A0H), this.A0C), this.A0G);
    }

    public AnonymousClass39K(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        this.A06 = i;
        this.A0I = j;
        this.A03 = i2;
        this.A09 = i3;
        this.A00 = i4;
        this.A04 = i5;
        this.A07 = i6;
        this.A0A = i7;
        this.A01 = i8;
        this.A02 = i9;
        this.A05 = i10;
        this.A08 = i11;
        this.A0D = j2;
        this.A0B = j3;
        this.A0E = j4;
        this.A0F = j5;
        this.A0H = j6;
        this.A0C = j7;
        this.A0G = j8;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ChatMemory(numberOfMessages=");
        A0o.append(this.A06);
        A0o.append(", overallSize=");
        A0o.append(this.A0I);
        A0o.append(", numberOfGifs=");
        A0o.append(this.A03);
        A0o.append(", numberOfTexts=");
        A0o.append(this.A09);
        A0o.append(", numberOfAudios=");
        A0o.append(this.A00);
        A0o.append(", numberOfImages=");
        A0o.append(this.A04);
        A0o.append(", numberOfPushToVideos=");
        A0o.append(this.A07);
        A0o.append(", numberOfVideos=");
        A0o.append(this.A0A);
        A0o.append(", numberOfContacts=");
        A0o.append(this.A01);
        A0o.append(", numberOfDocuments=");
        A0o.append(this.A02);
        A0o.append(", numberOfLocations=");
        A0o.append(this.A05);
        A0o.append(", numberOfStickers=");
        A0o.append(this.A08);
        A0o.append(", mediaGifBytes=");
        A0o.append(this.A0D);
        A0o.append(", mediaAudioBytes=");
        A0o.append(this.A0B);
        A0o.append(", mediaImageBytes=");
        A0o.append(this.A0E);
        A0o.append(", mediaPushToVideoBytes=");
        A0o.append(this.A0F);
        A0o.append(", mediaVideoBytes=");
        A0o.append(this.A0H);
        A0o.append(", mediaDocumentBytes=");
        A0o.append(this.A0C);
        A0o.append(", mediaStickerBytes=");
        return C18270x1.A0U(A0o, this.A0G);
    }

    public AnonymousClass39K() {
        this(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
    }
}
