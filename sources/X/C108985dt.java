package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5dt  reason: invalid class name and case insensitive filesystem */
public final class C108985dt implements Parcelable {
    public static final Parcelable.Creator CREATOR = new AnonymousClass91V(92);
    public final int A00;
    public final C633038s A01;
    public final C166057y4 A02;
    public final C108705dQ A03;
    public final C166137yC A04;
    public final C165997xy A05;
    public final C166077y6 A06;
    public final C108805da A07;
    public final UserJid A08;
    public final Integer A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final String A0M;
    public final List A0N;
    public final List A0O;
    public final List A0P;
    public final List A0Q;
    public final List A0R;
    public final List A0S;
    public final List A0T;
    public final List A0U;
    public final boolean A0V;
    public final boolean A0W;
    public final boolean A0X;
    public final boolean A0Y;
    public final boolean A0Z;
    public final boolean A0a;
    public final boolean A0b;
    public final boolean A0c;
    public final boolean A0d;

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        C162457s7.A0J(parcel, 0);
        parcel.writeParcelable(this.A08, i);
        parcel.writeString(this.A0L);
        parcel.writeTypedList(this.A0O);
        parcel.writeStringList(this.A0U);
        parcel.writeString(this.A0H);
        parcel.writeString(this.A0G);
        parcel.writeParcelable(this.A07, i);
        parcel.writeParcelable(this.A03, i);
        parcel.writeByte(this.A0Y ? (byte) 1 : 0);
        parcel.writeString(this.A0M);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A0J);
        parcel.writeString(this.A0E);
        parcel.writeByte(this.A0W ? (byte) 1 : 0);
        parcel.writeByte(this.A0X ? (byte) 1 : 0);
        parcel.writeByte(this.A0c ? (byte) 1 : 0);
        parcel.writeParcelable(this.A05, i);
        parcel.writeParcelable(this.A02, i);
        parcel.writeByte(this.A0Z ? (byte) 1 : 0);
        parcel.writeParcelable(this.A04, i);
        parcel.writeTypedList(this.A0T);
        parcel.writeString(this.A0F);
        parcel.writeString(this.A0I);
        parcel.writeByte(this.A0V ? (byte) 1 : 0);
        parcel.writeTypedList(this.A0R);
        parcel.writeStringList(this.A0Q);
        parcel.writeByte(this.A0b ? (byte) 1 : 0);
        parcel.writeParcelable(this.A06, i);
        parcel.writeString(this.A0B);
        parcel.writeTypedList(this.A0N);
        Integer num = this.A09;
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = -1;
        }
        parcel.writeInt(i2);
        parcel.writeByte(this.A0a ? (byte) 1 : 0);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A0K);
        parcel.writeString(C57032sx.A00(this.A0P));
        parcel.writeString(C57042sy.A00(this.A0S));
        parcel.writeString(this.A0C);
        parcel.writeString(this.A0A);
        parcel.writeParcelable(this.A01, i);
        parcel.writeByte(this.A0d ? (byte) 1 : 0);
    }

    public final boolean A00() {
        Iterator it = this.A0U.iterator();
        while (it.hasNext()) {
            String A0m = AnonymousClass001.A0m(it);
            if (A0m != null && A0m.length() != 0) {
                return false;
            }
        }
        String str = this.A0G;
        if (str != null && str.length() != 0) {
            return false;
        }
        String str2 = this.A0H;
        if ((str2 == null || str2.length() == 0) && this.A07.equals(C108805da.A04) && this.A03 == null) {
            return true;
        }
        return false;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C108985dt)) {
            return false;
        }
        C108985dt r7 = (C108985dt) obj;
        if (!C162457s7.A0P(this.A08, r7.A08)) {
            return false;
        }
        String str = this.A0L;
        String str2 = "";
        String str3 = str2;
        if (str == null) {
            str = str2;
        }
        String str4 = r7.A0L;
        if (str4 == null) {
            str4 = str2;
        }
        if (!C162457s7.A0P(str, str4) || !C162457s7.A0P(this.A0O, r7.A0O) || !C162457s7.A0P(this.A0U, r7.A0U)) {
            return false;
        }
        String str5 = this.A0H;
        if (str5 == null) {
            str5 = str2;
        }
        String str6 = r7.A0H;
        if (str6 == null) {
            str6 = str2;
        }
        if (!C162457s7.A0P(str5, str6)) {
            return false;
        }
        String str7 = this.A0G;
        if (str7 == null) {
            str7 = str2;
        }
        String str8 = r7.A0G;
        if (str8 == null) {
            str8 = str2;
        }
        if (!C162457s7.A0P(str7, str8) || !C162457s7.A0P(this.A07, r7.A07) || !C162457s7.A0P(this.A03, r7.A03) || this.A0Y != r7.A0Y) {
            return false;
        }
        String str9 = this.A0D;
        if (str9 == null) {
            str9 = str2;
        }
        String str10 = r7.A0D;
        if (str10 == null) {
            str10 = str2;
        }
        if (!C162457s7.A0P(str9, str10)) {
            return false;
        }
        String str11 = this.A0J;
        if (str11 == null) {
            str11 = str2;
        }
        String str12 = r7.A0J;
        if (str12 == null) {
            str12 = str2;
        }
        if (!C162457s7.A0P(str11, str12) || this.A0W != r7.A0W) {
            return false;
        }
        String str13 = this.A0M;
        if (str13 == null) {
            str13 = str2;
        }
        String str14 = r7.A0M;
        if (str14 == null) {
            str14 = str2;
        }
        if (!C162457s7.A0P(str13, str14)) {
            return false;
        }
        String str15 = this.A0E;
        if (str15 == null) {
            str15 = str2;
        }
        String str16 = r7.A0E;
        if (str16 == null) {
            str16 = str2;
        }
        if (!C162457s7.A0P(str15, str16) || this.A0X != r7.A0X || this.A0c != r7.A0c || !C162457s7.A0P(this.A05, r7.A05) || !C162457s7.A0P(this.A02, r7.A02) || this.A0Z != r7.A0Z || !C162457s7.A0P(this.A04, r7.A04) || !C162457s7.A0P(this.A0T, r7.A0T)) {
            return false;
        }
        String str17 = this.A0F;
        if (str17 == null) {
            str17 = str2;
        }
        String str18 = r7.A0F;
        if (str18 == null) {
            str18 = str2;
        }
        if (!C162457s7.A0P(str17, str18)) {
            return false;
        }
        String str19 = this.A0I;
        if (str19 == null) {
            str19 = str2;
        }
        String str20 = r7.A0I;
        if (str20 != null) {
            str2 = str20;
        }
        if (!C162457s7.A0P(str19, str2) || this.A0V != r7.A0V || !C162457s7.A0P(this.A0R, r7.A0R)) {
            return false;
        }
        List list = this.A0Q;
        List list2 = r7.A0Q;
        if (list != null) {
            if (list2 == null) {
                return false;
            }
            ArrayList A0J2 = AnonymousClass002.A0J(list);
            ArrayList A0J3 = AnonymousClass002.A0J(list2);
            List asList = Arrays.asList(new String[]{str3, null});
            C162457s7.A0D(asList);
            A0J2.removeAll(asList);
            List asList2 = Arrays.asList(new String[]{str3, null});
            C162457s7.A0D(asList2);
            A0J3.removeAll(asList2);
            if (!A0J2.equals(A0J3)) {
                return false;
            }
        } else if (list2 != null) {
            return false;
        }
        if (this.A0b != r7.A0b || !C162457s7.A0P(this.A06, r7.A06) || !C162457s7.A0P(this.A0B, r7.A0B) || !C162457s7.A0P(this.A0N, r7.A0N) || !C162457s7.A0P(this.A09, r7.A09) || this.A0a != r7.A0a || this.A00 != r7.A00 || !C162457s7.A0P(this.A0K, r7.A0K) || !C162457s7.A0P(this.A0C, r7.A0C) || !C162457s7.A0P(this.A0P, r7.A0P) || !C162457s7.A0P(this.A0S, r7.A0S) || !C162457s7.A0P(this.A0A, r7.A0A) || !C162457s7.A0P(this.A01, r7.A01) || this.A0d != r7.A0d) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int A082 = AnonymousClass000.A08(this.A0O, ((((C18280x3.A04(this.A08) * 31) + C86624Kv.A04(this.A0L)) * 31) + C86624Kv.A04(this.A0M)) * 31);
        List list = this.A0T;
        List list2 = this.A0R;
        int A072 = AnonymousClass0x2.A07(this.A0B, (((((AnonymousClass000.A08(list2, (((((AnonymousClass000.A08(list, (((((((((((((((((((((((((((((AnonymousClass000.A08(this.A0U, A082) + C86624Kv.A04(this.A0H)) * 31) + C86624Kv.A04(this.A0G)) * 31) + C18280x3.A04(this.A07)) * 31) + C18280x3.A04(this.A03)) * 31) + (this.A0Y ? 1 : 0)) * 31) + C86624Kv.A04(this.A0D)) * 31) + C86624Kv.A04(this.A0J)) * 31) + C86624Kv.A04(this.A0E)) * 31) + (this.A0W ? 1 : 0)) * 31) + (this.A0X ? 1 : 0)) * 31) + (this.A0c ? 1 : 0)) * 31) + C18280x3.A04(this.A05)) * 31) + C18280x3.A04(this.A02)) * 31) + (this.A0Z ? 1 : 0)) * 31) + C18280x3.A04(this.A04)) * 31) + C86624Kv.A04(this.A0F)) * 31) + C86624Kv.A04(this.A0I)) * 31) + (this.A0V ? 1 : 0)) * 31) + C18280x3.A04(this.A0Q)) * 31) + (this.A0b ? 1 : 0)) * 31) + C18280x3.A04(this.A06)) * 31);
        int A083 = (((AnonymousClass000.A08(this.A0S, AnonymousClass000.A08(this.A0P, (((((((AnonymousClass000.A08(this.A0N, A072) + C18280x3.A04(this.A09)) * 31) + (this.A0a ? 1 : 0)) * 31) + this.A00) * 31) + C86624Kv.A04(this.A0K)) * 31)) + C86624Kv.A04(this.A0C)) * 31) + C86624Kv.A04(this.A0A)) * 31;
        C633038s r0 = this.A01;
        if (r0 != null) {
            i = r0.hashCode();
        }
        return ((A083 + i) * 31) + (this.A0d ? 1 : 0);
    }

    public C108985dt(Parcel parcel) {
        List<T> unmodifiableList;
        this.A08 = (UserJid) C18280x3.A0C(parcel, UserJid.class);
        this.A0L = parcel.readString();
        this.A0O = C86654Ky.A0r(parcel.createTypedArrayList(C166447yh.CREATOR));
        this.A0U = C86654Ky.A0r(parcel.createStringArrayList());
        this.A0H = parcel.readString();
        this.A0G = parcel.readString();
        C108805da r0 = (C108805da) C18280x3.A0C(parcel, C108805da.class);
        this.A07 = r0 == null ? C108805da.A04 : r0;
        this.A03 = (C108705dQ) C18280x3.A0C(parcel, C108705dQ.class);
        boolean z = true;
        this.A0Y = AnonymousClass000.A1S(parcel.readByte());
        this.A0M = parcel.readString();
        this.A0D = parcel.readString();
        this.A0J = parcel.readString();
        this.A0E = parcel.readString();
        this.A0W = AnonymousClass000.A1S(parcel.readByte());
        this.A0X = AnonymousClass000.A1S(parcel.readByte());
        this.A0c = AnonymousClass000.A1S(parcel.readByte());
        this.A05 = (C165997xy) C18280x3.A0C(parcel, C165997xy.class);
        this.A02 = (C166057y4) C18280x3.A0C(parcel, C166057y4.class);
        this.A0Z = AnonymousClass000.A1S(parcel.readByte());
        this.A04 = (C166137yC) C18280x3.A0C(parcel, C166137yC.class);
        this.A0T = C86654Ky.A0r(parcel.createTypedArrayList(C108765dW.CREATOR));
        this.A0F = parcel.readString();
        this.A0I = parcel.readString();
        this.A0V = AnonymousClass000.A1S(parcel.readByte());
        this.A0R = C86654Ky.A0r(parcel.createTypedArrayList(C165947xt.CREATOR));
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        Integer num = null;
        if (createStringArrayList == null) {
            unmodifiableList = null;
        } else {
            unmodifiableList = Collections.unmodifiableList(createStringArrayList);
        }
        this.A0Q = unmodifiableList;
        this.A0b = AnonymousClass000.A1S(parcel.readByte());
        this.A06 = (C166077y6) C18280x3.A0C(parcel, C166077y6.class);
        String readString = parcel.readString();
        this.A0B = readString == null ? "UNBLOCKED" : readString;
        this.A0N = C86654Ky.A0r(parcel.createTypedArrayList(C108835dd.CREATOR));
        int readInt = parcel.readInt();
        if (readInt != -1) {
            num = Integer.valueOf(readInt);
            if (num == null) {
                num = null;
            } else if (readInt < 0 || readInt > 100) {
                num = C18290x4.A0Z();
            }
        }
        this.A09 = num;
        this.A0a = AnonymousClass000.A1S(parcel.readByte());
        this.A00 = parcel.readInt();
        this.A0K = parcel.readString();
        this.A0P = C57032sx.A01(parcel.readString());
        this.A0S = C57042sy.A01(parcel.readString());
        this.A0C = parcel.readString();
        this.A0A = parcel.readString();
        this.A01 = (C633038s) C18280x3.A0C(parcel, C633038s.class);
        this.A0d = parcel.readByte() == 0 ? false : z;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("BusinessProfile{jid='");
        A0o.append(this.A08);
        A0o.append("', tag='");
        A0o.append(this.A0L);
        A0o.append("', websites=");
        A0o.append(this.A0U);
        A0o.append(", email='");
        A0o.append(this.A0H);
        A0o.append("', description='");
        A0o.append(this.A0G);
        A0o.append("', address='");
        A0o.append(this.A07);
        A0o.append("', vertical='");
        A0o.append(this.A0M);
        A0o.append("', categories='");
        A0o.append(this.A0O);
        A0o.append("', hours='");
        A0o.append(this.A03);
        A0o.append("', has_catalog='");
        A0o.append(this.A0Y);
        A0o.append("', commerceExperience='");
        A0o.append(this.A0D);
        A0o.append("', shopUrl='");
        A0o.append(this.A0J);
        A0o.append("', commerceManagerUrl='");
        A0o.append(this.A0E);
        A0o.append("', cart_enabled='");
        A0o.append(this.A0W);
        A0o.append("', directConnectionEnabled='");
        A0o.append(this.A0X);
        A0o.append("', shopBanned='");
        A0o.append(this.A0c);
        A0o.append("', isGalaxyBusiness='");
        A0o.append(this.A0Z);
        A0o.append(", coverPhoto='");
        C166137yC r2 = this.A04;
        String str = "null";
        if (r2 != null) {
            str = r2.toString();
        }
        A0o.append(str);
        A0o.append("', serviceAreas='");
        A0o.append(this.A0T);
        A0o.append("', customUrl='");
        A0o.append(this.A0F);
        A0o.append("', memberSince='");
        A0o.append(this.A0I);
        A0o.append("', capiCallingEnabled='");
        A0o.append(this.A0V);
        A0o.append("', directConnectionEnabledFeatures='");
        A0o.append(this.A0R);
        A0o.append("', directConnectionAllowedCountryCodes=");
        A0o.append(this.A0Q);
        A0o.append("', isResponsive='");
        A0o.append(this.A0b);
        A0o.append("', priceTier='");
        A0o.append(this.A06);
        A0o.append("', businessBlockedStatus='");
        A0o.append(this.A0B);
        A0o.append("', businessServiceOfferings=");
        A0o.append(this.A0N);
        A0o.append(", surveySamplingRate='");
        A0o.append(this.A09);
        A0o.append("', isOfferingsEligible='");
        A0o.append(this.A0a);
        A0o.append(", automatedType='");
        A0o.append(this.A00);
        A0o.append(", botDescription='");
        A0o.append(this.A0A);
        A0o.append(", subDescription='");
        A0o.append(this.A0K);
        A0o.append(", commandsDescription='");
        A0o.append(this.A0C);
        A0o.append(", commands='");
        A0o.append(this.A0P);
        A0o.append(", prompts='");
        A0o.append(this.A0S);
        A0o.append(", businessAccountSettings='");
        A0o.append(this.A01);
        A0o.append(", supportWelcomeRequestMessage='");
        A0o.append(this.A0d);
        return AnonymousClass000.A0X("'}", A0o);
    }

    public C108985dt(C633038s r2, C166057y4 r3, C108705dQ r4, C166137yC r5, C165997xy r6, C166077y6 r7, C108805da r8, UserJid userJid, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        List unmodifiableList;
        this.A08 = userJid;
        this.A0L = str;
        this.A0O = C86654Ky.A0r(list);
        this.A0U = C86654Ky.A0r(list2);
        this.A0H = str2;
        this.A0G = str3;
        this.A07 = r8;
        this.A03 = r4;
        this.A0Y = z;
        this.A0D = str4;
        this.A0J = str5;
        this.A0E = str6;
        this.A0W = z2;
        this.A0M = str7;
        this.A0X = z3;
        this.A0c = z4;
        this.A05 = r6;
        this.A02 = r3;
        this.A0Z = z5;
        this.A04 = r5;
        this.A0T = C86654Ky.A0r(list3);
        this.A0F = str8;
        this.A0I = str9;
        this.A0V = z6;
        this.A0R = C86654Ky.A0r(list4);
        if (list5 == null) {
            unmodifiableList = null;
        } else {
            unmodifiableList = Collections.unmodifiableList(list5);
        }
        this.A0Q = unmodifiableList;
        this.A0b = z7;
        this.A06 = r7;
        this.A0B = str10;
        this.A0N = list6;
        this.A09 = num;
        this.A0a = z8;
        this.A00 = i;
        this.A0A = str11;
        this.A0K = str12;
        this.A0C = str13;
        this.A0P = list7;
        this.A0S = list8;
        this.A01 = r2;
        this.A0d = z9;
    }
}
