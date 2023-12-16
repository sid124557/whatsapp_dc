package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.38x  reason: invalid class name and case insensitive filesystem */
public final class C633538x implements Parcelable {
    public static final Parcelable.Creator CREATOR = new AnonymousClass38L();
    public final C633438w A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final List A0A;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C633538x) {
                C633538x r5 = (C633538x) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A05, r5.A05) || !C162457s7.A0P(this.A03, r5.A03) || !C162457s7.A0P(this.A06, r5.A06) || !C162457s7.A0P(this.A07, r5.A07) || !C162457s7.A0P(this.A09, r5.A09) || !C162457s7.A0P(this.A08, r5.A08) || !C162457s7.A0P(this.A04, r5.A04) || !C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A0A, r5.A0A)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A05);
        parcel.writeString(this.A03);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        parcel.writeString(this.A09);
        parcel.writeString(this.A08);
        parcel.writeString(this.A04);
        C633438w r1 = this.A00;
        if (r1 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            r1.writeToParcel(parcel, i);
        }
        Iterator A0w = AnonymousClass0x7.A0w(parcel, this.A0A);
        while (A0w.hasNext()) {
            ((C633438w) A0w.next()).writeToParcel(parcel, i);
        }
    }

    public int hashCode() {
        int A072 = AnonymousClass0x2.A07(this.A08, AnonymousClass0x2.A07(this.A09, AnonymousClass0x2.A07(this.A07, AnonymousClass0x2.A07(this.A06, AnonymousClass0x2.A07(this.A03, AnonymousClass0x2.A07(this.A05, AnonymousClass0x2.A07(this.A02, C18310x6.A09(this.A01))))))));
        return AnonymousClass002.A02(this.A0A, (AnonymousClass0x2.A07(this.A04, A072) + AnonymousClass000.A07(this.A00)) * 31);
    }

    public C633538x(C633438w r2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list) {
        C18260x0.A0f(str, str2, str3, str4, str5);
        C18260x0.A0W(str6, str7, str8);
        C162457s7.A0J(str9, 9);
        this.A01 = str;
        this.A02 = str2;
        this.A05 = str3;
        this.A03 = str4;
        this.A06 = str5;
        this.A07 = str6;
        this.A09 = str7;
        this.A08 = str8;
        this.A04 = str9;
        this.A00 = r2;
        this.A0A = list;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("AvatarGetStickersEntity(id=");
        A0o.append(this.A01);
        A0o.append(", revisionId=");
        A0o.append(this.A02);
        A0o.append(", stickerPackId=");
        A0o.append(this.A05);
        A0o.append(", stickerPackDescription=");
        A0o.append(this.A03);
        A0o.append(", stickerPackName=");
        A0o.append(this.A06);
        A0o.append(", stickerPackPublisher=");
        A0o.append(this.A07);
        A0o.append(", stickerPackTrayIconTemplateId=");
        A0o.append(this.A09);
        A0o.append(", stickerPackRecentsEmptyIconTemplateId=");
        A0o.append(this.A08);
        A0o.append(", stickerPackFavoritesEmptyIconTemplateId=");
        A0o.append(this.A04);
        A0o.append(", avatarStickerPackDynamicIcon=");
        A0o.append(this.A00);
        A0o.append(", stickers=");
        return C18260x0.A04(this.A0A, A0o);
    }
}
