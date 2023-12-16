package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7yW  reason: invalid class name and case insensitive filesystem */
public final class C166337yW implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass91V.A00(31);
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public C187458xF A0A;
    public C141266vI A0B;
    public C166237yM A0C;
    public C141686vy A0D;
    public C166577yv A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public final float A0N;
    public final String A0O;
    public final String A0P;
    public final boolean A0Q;
    public final boolean A0R;
    public final boolean A0S;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        this.A0E.writeToParcel(parcel, i);
        parcel.writeString(this.A0F);
        parcel.writeLong(this.A07);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeString(this.A0H);
        parcel.writeInt(this.A05);
        parcel.writeString(this.A0G);
        C18290x4.A1D(parcel, this.A0B);
        C18290x4.A1D(parcel, this.A0D);
        this.A0C.writeToParcel(parcel, i);
        parcel.writeLong(this.A09);
        parcel.writeByte(this.A0I ? (byte) 1 : 0);
        parcel.writeByte(this.A0K ? (byte) 1 : 0);
        parcel.writeByte(this.A0M ? (byte) 1 : 0);
        parcel.writeLong(this.A08);
        parcel.writeLong(this.A06);
        parcel.writeByte(this.A0L ? (byte) 1 : 0);
        parcel.writeString(this.A0P);
        parcel.writeString(this.A0O);
        parcel.writeFloat(this.A0N);
        parcel.writeByte(this.A0S ? (byte) 1 : 0);
        parcel.writeByte(this.A0R ? (byte) 1 : 0);
        parcel.writeByte(this.A0J ? (byte) 1 : 0);
        parcel.writeByte(this.A0Q ? (byte) 1 : 0);
    }

    public C166337yW(Parcel parcel) {
        this.A0E = (C166577yv) C166577yv.CREATOR.createFromParcel(parcel);
        this.A0F = parcel.readString();
        this.A07 = parcel.readLong();
        this.A02 = parcel.readInt();
        this.A03 = parcel.readInt();
        this.A04 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A0H = parcel.readString();
        this.A05 = parcel.readInt();
        this.A0G = parcel.readString();
        this.A0B = C141266vI.valueOf(parcel.readString());
        this.A0D = C141686vy.valueOf(parcel.readString());
        this.A0C = (C166237yM) C166237yM.CREATOR.createFromParcel(parcel);
        this.A09 = parcel.readLong();
        boolean z = true;
        this.A0I = AnonymousClass000.A1S(parcel.readByte());
        this.A0K = AnonymousClass000.A1S(parcel.readByte());
        this.A0M = AnonymousClass000.A1S(parcel.readByte());
        this.A08 = parcel.readLong();
        this.A06 = parcel.readLong();
        this.A0L = AnonymousClass000.A1S(parcel.readByte());
        this.A0P = parcel.readString();
        String readString = parcel.readString();
        this.A0O = readString == null ? "" : readString;
        this.A0N = parcel.readFloat();
        this.A0S = AnonymousClass000.A1S(parcel.readByte());
        this.A0R = AnonymousClass000.A1S(parcel.readByte());
        this.A0J = AnonymousClass000.A1S(parcel.readByte());
        this.A0Q = parcel.readByte() == 0 ? false : z;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("VideoPrefetchRequest");
        A0o.append("\nmCacheKey: ");
        A0o.append(this.A0F);
        A0o.append("\nmPrefetchOffset: ");
        A0o.append(this.A07);
        A0o.append("\nmPrefetchBytes: ");
        A0o.append(this.A02);
        A0o.append("\nmPrefetchSegment: ");
        A0o.append(this.A03);
        A0o.append("\nmStreamType: ");
        A0o.append(this.A04);
        A0o.append("\nmQueueBehavior: ");
        A0o.append(this.A0D);
        A0o.append("\nmAtomSize: ");
        A0o.append(this.A00);
        A0o.append("\nmBitRate: ");
        A0o.append(this.A01);
        A0o.append("\nmQualityLabel: ");
        A0o.append(this.A0H);
        A0o.append("\nmVideoTotalDurationMs: ");
        A0o.append(this.A05);
        A0o.append("\nmPrefetchSource: ");
        A0o.append(this.A0G);
        A0o.append("\nmVideoStatus: ");
        A0o.append(this.A0B.name());
        A0o.append("\nVideoPrefetchRequest.VideoSource");
        A0o.append("\n");
        AnonymousClass000.A1B(this.A0E, A0o);
        A0o.append("\nmTargetContentReadyTimeMs: ");
        A0o.append(this.A09);
        A0o.append("\nmIsAudioOn: ");
        A0o.append(this.A0I);
        A0o.append("\nmShouldForceHighPriority: ");
        A0o.append(this.A0K);
        A0o.append("\nmUserOptedInLowLatency: ");
        A0o.append(this.A0M);
        A0o.append("\nmStartTimeMs: ");
        A0o.append(this.A08);
        A0o.append("\nmPrefetchDurationMs: ");
        A0o.append(this.A06);
        A0o.append("\nmUseHeroBgThread: ");
        A0o.append(this.A0L);
        A0o.append("\nmTag: ");
        A0o.append(this.A0P);
        A0o.append("\nmPrefetchingModule: ");
        A0o.append(this.A0O);
        A0o.append("\nmWatchTimePredictionSeconds: ");
        A0o.append(this.A0N);
        A0o.append("\nmIsThumbnail: ");
        A0o.append(this.A0S);
        A0o.append("\nmIsBackgroundPrefetch: ");
        A0o.append(this.A0R);
        A0o.append("\nmIsFollowUpPrefetch: ");
        A0o.append(this.A0J);
        A0o.append("\nmEnableForegroundPrefetchQualityExperimentation: ");
        A0o.append(this.A0Q);
        return A0o.toString();
    }

    public C166337yW(C187458xF r6, C141266vI r7, C166237yM r8, C141686vy r9, C166577yv r10, String str, String str2, String str3, String str4, String str5, int i, int i2, int i3, int i4, int i5, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A0E = r10;
        this.A0F = str;
        this.A07 = j;
        this.A02 = i;
        this.A03 = -1;
        this.A04 = i2;
        this.A00 = i3;
        this.A01 = i4;
        this.A0H = str2;
        this.A05 = i5;
        this.A0G = str3;
        this.A0B = r7;
        this.A0D = r9;
        this.A0C = r8;
        this.A09 = j2;
        this.A0I = true;
        this.A0K = z;
        this.A0M = false;
        this.A08 = j3;
        this.A06 = j4;
        this.A0L = z2;
        this.A0P = str4;
        this.A0O = str5;
        this.A0N = -1.0f;
        this.A0S = z3;
        this.A0R = z4;
        this.A0J = false;
        this.A0Q = z5;
        this.A0A = r6;
    }
}
