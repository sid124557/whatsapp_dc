package X;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.7yv  reason: invalid class name and case insensitive filesystem */
public final class C166577yv implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass91V.A00(32);
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public Uri A04;
    public Uri A05;
    public C141186vA A06;
    public C141696vz A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public Map A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R = false;
    public byte[] A0S;

    public boolean equals(Object obj) {
        Uri uri;
        Uri uri2;
        String str;
        String str2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C166577yv)) {
            return false;
        }
        C166577yv r4 = (C166577yv) obj;
        if (this.A07 == r4.A07 && (((uri = this.A05) == (uri2 = r4.A05) || (uri != null && uri.equals(uri2))) && ((str = this.A0H) == (str2 = r4.A0H) || (str != null && str.equals(str2))))) {
            C141186vA r1 = this.A06;
            C141186vA r0 = r4.A06;
            if (r1 != r0) {
                return r1 != null && r1.equals(r0);
            }
            return true;
        }
    }

    public static C166577yv A00(Uri uri, String str, String str2, String str3, Map map) {
        return new C166577yv(uri, C141186vA.GENERAL, C141696vz.PROGRESSIVE, str, str2, str3, "UNKNOWN", C141076uz.AUDIO_VIDEO.toString(), map, false, false);
    }

    public boolean A01() {
        String str = this.A0G;
        if (str != null) {
            return str.startsWith("av01");
        }
        String str2 = this.A0A;
        if (str2 == null || !str2.contains("codecs=\"av01")) {
            return false;
        }
        return true;
    }

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        int i = 0;
        int A042 = (C18300x5.A04(this.A07) + C86624Kv.A04(this.A0H)) * 31;
        Uri uri = this.A05;
        if (uri != null) {
            i = uri.hashCode();
        }
        return A042 + i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A05, 0);
        parcel.writeString(this.A0H);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A0G);
        parcel.writeParcelable(this.A04, 0);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A0D);
        C18290x4.A1D(parcel, this.A07);
        parcel.writeLong(this.A02);
        parcel.writeLong(this.A03);
        parcel.writeInt(this.A01);
        parcel.writeByte(this.A0M ? (byte) 1 : 0);
        parcel.writeByte(this.A0Q ? (byte) 1 : 0);
        parcel.writeString(this.A0F);
        Map map = this.A0I;
        parcel.writeInt(map.size());
        Iterator A0q = AnonymousClass000.A0q(map);
        while (A0q.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0q);
            parcel.writeString(C18310x6.A0q(A0w));
            parcel.writeString(AnonymousClass0x9.A12(A0w));
        }
        parcel.writeByte(this.A0O ? (byte) 1 : 0);
        parcel.writeByte(this.A0P ? (byte) 1 : 0);
        parcel.writeByte(this.A0J ? (byte) 1 : 0);
        parcel.writeByte(this.A0N ? (byte) 1 : 0);
        parcel.writeString(this.A0E);
        parcel.writeByte(this.A0L ? (byte) 1 : 0);
        C18290x4.A1D(parcel, this.A06);
        parcel.writeByte(this.A0K ? (byte) 1 : 0);
        parcel.writeString(this.A08);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A09);
        parcel.writeByteArray(this.A0S);
        parcel.writeByte(this.A0R ? (byte) 1 : 0);
    }

    public C166577yv(Parcel parcel) {
        boolean z = false;
        ClassLoader classLoader = C166577yv.class.getClassLoader();
        this.A05 = (Uri) parcel.readParcelable(classLoader);
        this.A0H = parcel.readString();
        this.A0A = parcel.readString();
        this.A0G = parcel.readString();
        this.A04 = (Uri) parcel.readParcelable(classLoader);
        this.A0B = parcel.readString();
        this.A0C = parcel.readString();
        this.A0D = parcel.readString();
        this.A07 = C141696vz.valueOf(parcel.readString());
        this.A02 = parcel.readLong();
        this.A03 = parcel.readLong();
        this.A01 = parcel.readInt();
        this.A0M = AnonymousClass000.A1U(parcel.readByte(), 1);
        this.A0Q = AnonymousClass000.A1U(parcel.readByte(), 1);
        this.A0F = parcel.readString();
        int readInt = parcel.readInt();
        this.A0I = AnonymousClass001.A0t();
        for (int i = 0; i < readInt; i++) {
            this.A0I.put(parcel.readString(), parcel.readString());
        }
        this.A0O = AnonymousClass000.A1U(parcel.readByte(), 1);
        this.A0P = AnonymousClass000.A1U(parcel.readByte(), 1);
        this.A0J = AnonymousClass000.A1U(parcel.readByte(), 1);
        this.A0N = AnonymousClass000.A1U(parcel.readByte(), 1);
        this.A0E = parcel.readString();
        this.A0L = AnonymousClass000.A1U(parcel.readByte(), 1);
        this.A06 = C141186vA.valueOf(parcel.readString());
        this.A0K = AnonymousClass000.A1U(parcel.readByte(), 1);
        this.A08 = parcel.readString();
        this.A00 = parcel.readInt();
        this.A09 = parcel.readString();
        this.A0S = parcel.createByteArray();
        this.A0R = parcel.readByte() == 1 ? true : z;
    }

    public String toString() {
        Object valueOf;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Type: ");
        A0o.append(this.A07);
        String str = this.A0H;
        if (str != null) {
            A0o.append("\n\tId: ");
            A0o.append(str);
        }
        Uri uri = this.A05;
        if (uri != null) {
            A0o.append("\n\tUri: ");
            A0o.append(uri);
        }
        String str2 = this.A0B;
        if (str2 != null) {
            A0o.append("\n\tOrigin: ");
            A0o.append(str2);
        }
        String str3 = this.A0C;
        if (str3 != null) {
            A0o.append("\n\tSubOrigin: ");
            A0o.append(str3);
        }
        String str4 = this.A0D;
        if (str4 != null) {
            A0o.append("\n\tPrefetchOrigin: ");
            A0o.append(str4);
        }
        A0o.append("\n\tDashMPD: ");
        String str5 = this.A0A;
        if (str5 == null) {
            valueOf = "NULL";
        } else {
            valueOf = Integer.valueOf(str5.length());
        }
        A0o.append(valueOf);
        String str6 = this.A0G;
        if (str6 != null) {
            A0o.append("\n\tCodec: ");
            A0o.append(str6);
        }
        Uri uri2 = this.A04;
        if (uri2 != null) {
            A0o.append("\n\tSubtitle: ");
            A0o.append(uri2);
        }
        A0o.append("\n\tliveLatency: ");
        A0o.append(this.A02);
        A0o.append("\n\tliveLatencyTolerance: ");
        A0o.append(this.A03);
        A0o.append("\n\tisSpherical: ");
        A0o.append(this.A0O);
        A0o.append("\n\tisSponsored: ");
        A0o.append(this.A0P);
        A0o.append("\n\tisAdBreak: ");
        A0o.append(this.A0J);
        A0o.append("\n\tisLiveTraceEnabled: ");
        A0o.append(this.A0N);
        A0o.append("\n\trenderMode: ");
        A0o.append(this.A0E);
        A0o.append("\n\tisBroadcast: ");
        A0o.append(this.A0L);
        A0o.append("\n\tcontentType: ");
        A0o.append(this.A06);
        A0o.append("\n\tisAudioDataListenerEnabled: ");
        A0o.append(this.A0K);
        A0o.append("\n\tliveViewerCount: ");
        A0o.append(this.A00);
        A0o.append("\n\tuseConcatenatedMediaSource: ");
        A0o.append(this.A0R);
        return A0o.toString();
    }

    public C166577yv() {
    }

    public C166577yv(Uri uri, C141186vA r7, C141696vz r8, String str, String str2, String str3, String str4, String str5, Map map, boolean z, boolean z2) {
        this.A05 = uri;
        this.A0H = str;
        this.A0A = null;
        this.A0G = null;
        this.A04 = null;
        this.A0B = str2;
        this.A0C = str3;
        this.A0D = str4;
        this.A07 = r8;
        this.A02 = -1;
        this.A03 = -1;
        this.A01 = -1;
        this.A0M = false;
        this.A0Q = false;
        this.A0F = null;
        this.A0I = map;
        this.A0O = z;
        this.A0P = z2;
        this.A0J = false;
        this.A0N = false;
        this.A0K = false;
        this.A0E = str5;
        this.A0L = false;
        this.A06 = r7;
        this.A08 = null;
        this.A00 = -1;
        this.A09 = null;
        this.A0S = null;
    }
}
