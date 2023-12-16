package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.38t  reason: invalid class name and case insensitive filesystem */
public class C633138t implements Parcelable {
    public static final C633138t A04;
    public static final C633138t A05;
    public static final C633138t A06;
    public static final C633138t A07;
    public static final C633138t A08;
    public static final C633138t A09;
    public static final C633138t A0A;
    public static final C633138t A0B;
    public static final C633138t A0C;
    public static final C633138t A0D;
    public static final C633138t A0E;
    public static final C633138t A0F;
    public static final C633138t A0G;
    public static final C633138t A0H;
    public static final C633138t A0I;
    public static final C633138t A0J;
    public static final C633138t A0K;
    public static final C633138t A0L;
    public static final C633138t A0M;
    public static final C633138t A0N;
    public static final C633138t A0O;
    public static final C633138t A0P;
    public static final C633138t A0Q;
    public static final C633138t A0R;
    public static final C633138t A0S;
    public static final C633138t A0T;
    public static final C633138t A0U;
    public static final C633138t A0V;
    public static final C633138t A0W;
    public static final C633138t A0X;
    public static final C633138t A0Y;
    public static final C633138t A0Z;
    public static final C633138t A0a;
    public static final C633138t A0b;
    public static final C633138t A0c;
    public static final C633138t A0d;
    public static final C633138t A0e;
    public static final C633138t A0f;
    public static final C633138t A0g;
    public static final C633138t A0h;
    public static final C633138t A0i;
    public static final C633138t A0j;
    public static final C633138t A0k;
    public static final C633138t A0l;
    public static final C633138t A0m;
    public static final C633138t A0n;
    public static final byte[] A0o;
    public static final byte[] A0p;
    public static final byte[] A0q;
    public static final byte[] A0r;
    public static final byte[] A0s;
    public static final byte[] A0t;
    public static final byte[] A0u;
    public static final byte[] A0v;
    public static final byte[] A0w;
    public static final byte[] A0x;
    public static final byte[] A0y;
    public static final byte[] A0z;
    public static final byte[] A10;
    public static final byte[] A11;
    public static final byte[] A12;
    public static final byte[] A13;
    public static final Parcelable.Creator CREATOR = new AnonymousClass91V(119);
    public final byte A00;
    public final String A01;
    public final String A02;
    public final byte[] A03;

    static {
        byte[] bytes = "WhatsApp Audio Keys".getBytes();
        A0q = bytes;
        byte[] bytes2 = "WhatsApp Image Keys".getBytes();
        A0u = bytes2;
        byte[] bytes3 = "WhatsApp Image Thumbnail Keys".getBytes();
        A0v = bytes3;
        byte[] bytes4 = "WhatsApp Video Keys".getBytes();
        A11 = bytes4;
        byte[] bytes5 = "WhatsApp Video Thumbnail Keys".getBytes();
        A12 = bytes5;
        byte[] bytes6 = "WhatsApp Document Keys".getBytes();
        A0s = bytes6;
        byte[] bytes7 = "WhatsApp Document Thumbnail Keys".getBytes();
        A0t = bytes7;
        byte[] bytes8 = "WhatsApp App State Keys".getBytes();
        A0x = bytes8;
        byte[] bytes9 = "WhatsApp History Keys".getBytes();
        A0y = bytes9;
        byte[] bytes10 = "WhatsApp Link Thumbnail Keys".getBytes();
        A0w = bytes10;
        byte[] bytes11 = "waffle_hkdf_info".getBytes();
        A13 = bytes11;
        byte[] bytes12 = "WhatsApp Payment Background Keys".getBytes();
        A0z = bytes12;
        byte[] bytes13 = "PAYMENT_DOC_UPLOAD".getBytes();
        A10 = bytes13;
        byte[] bytes14 = "ads-image".getBytes();
        A0o = bytes14;
        byte[] bytes15 = "avatar-image".getBytes();
        A0r = bytes15;
        byte[] bytes16 = "ads-video".getBytes();
        A0p = bytes16;
        A05 = A00("audio", "AUD", bytes, (byte) 2);
        A0J = A00("ptt", "PTT", bytes, (byte) 2);
        A0i = A00("audio", "AUD", bytes, (byte) 82);
        A0C = A00("image", "IMG", bytes2, (byte) 1);
        A0D = A00("thumbnail-image", (String) null, bytes3, (byte) 1);
        A0j = A00("image", "IMG", bytes2, (byte) 42);
        A0Z = A00("image", "IMG", bytes2, (byte) 23);
        A0F = A00("image", "IMG", bytes2, (byte) 57);
        A07 = A00("image", "IMG", bytes2, (byte) 37);
        A0W = A00("image", "IMG", bytes2, (byte) 44);
        A0b = A00("sticker", "STK", bytes2, (byte) 20);
        A0e = A00("image", (String) null, bytes2, (byte) 25);
        A0H = A00("kyc-id", (String) null, bytes2, (byte) 1);
        A0g = A00("video", "VID", bytes4, (byte) 3);
        A0a = A00("ptv", "PTV", bytes4, (byte) 81);
        A0G = A00("video", "VID", bytes4, (byte) 3);
        A0h = A00("thumbnail-video", (String) null, bytes5, (byte) 3);
        A0k = A00("video", "VID", bytes4, (byte) 43);
        A04 = A00("gif", "VID", bytes4, (byte) 13);
        A0B = A00("thumbnail-gif", (String) null, bytes5, (byte) 13);
        A0f = A00("video", (String) null, bytes4, (byte) 28);
        A0d = A00("gif", (String) null, bytes4, (byte) 29);
        A09 = A00("document", "DOC", bytes6, (byte) 9);
        A0E = A00("document", "DOC", bytes6, (byte) 9);
        A0c = A00("document", (String) null, bytes6, (byte) 26);
        A0A = A00("thumbnail-document", (String) null, bytes7, (byte) 9);
        A0I = A00("thumbnail-link", (String) null, bytes10, (byte) 0);
        A0K = A00("md-app-state", (String) null, bytes8, (byte) 96);
        A0L = A00("md-msg-hist", "HIST_SYNC", bytes9, (byte) 35);
        A0m = A00("waffle-image", (String) null, bytes11, (byte) 59);
        A0n = A00("waffle-video", (String) null, bytes11, (byte) 60);
        A0l = A00("waffle-gif", (String) null, bytes11, (byte) 61);
        A0X = A00("payment-bg-image", (String) null, bytes12, (byte) 65);
        A0Y = A00("payment-br-document", (String) null, bytes13, (byte) 1);
        A0M = A00("ads-image", (String) null, bytes14, (byte) 1);
        A0N = A00("ads-video", (String) null, bytes16, (byte) 3);
        A08 = A00("biz-cover-photo", "IMG", bytes2, (byte) 1);
        A0R = A00("newsletter-image", "IMG", bytes2, (byte) 1);
        A0V = A00("newsletter-video", "VID", bytes4, (byte) 3);
        A0U = A00("newsletter-thumbnail-link", (String) null, bytes10, (byte) 0);
        A0S = A00("newsletter-ptt", "PTT", bytes, (byte) 2);
        A0O = A00("newsletter-audio", "AUD", bytes, (byte) 2);
        A0P = A00("newsletter-document", "DOC", bytes6, (byte) 9);
        A0Q = A00("newsletter-gif", "VID", bytes4, (byte) 13);
        A0T = A00("newsletter-sticker", "STK", bytes2, (byte) 20);
        A06 = A00("avatar-image", "AVATAR_IMG", bytes15, (byte) 1);
    }

    public static C633138t A00(String str, String str2, byte[] bArr, byte b) {
        return new C633138t(str, str2, bArr, b);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeByte(this.A00);
        if (this == A0J || this == A0S) {
            i2 = 1;
        } else {
            i2 = 0;
            if (this == A0H) {
                i2 = 6;
            }
        }
        parcel.writeInt(i2);
    }

    public C633138t(String str, String str2, byte[] bArr, byte b) {
        this.A00 = b;
        this.A03 = bArr;
        this.A02 = str;
        this.A01 = str2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return AnonymousClass000.A1Y(this, obj);
    }

    public int hashCode() {
        return C18310x6.A08(Byte.valueOf(this.A00), AnonymousClass002.A0L(), 0);
    }

    public String toString() {
        int i;
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("MmsType{type=");
        A0o2.append(this.A00);
        A0o2.append(", origin=");
        if (this == A0J || this == A0S) {
            i = 1;
        } else {
            i = 0;
            if (this == A0H) {
                i = 6;
            }
        }
        A0o2.append(i);
        A0o2.append(", fileType=");
        A0o2.append(this.A02);
        return AnonymousClass000.A0d(A0o2);
    }
}
