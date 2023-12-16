package X;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import java.util.AbstractCollection;

/* renamed from: X.39V  reason: invalid class name */
public final class AnonymousClass39V implements Parcelable {
    public static final Parcelable.Creator CREATOR = new AnonymousClass38M();
    public final byte A00;
    public final Jid A01;
    public final String A02;
    public final String A03;

    public static void A09(String str, String str2, Object[] objArr) {
        objArr[1] = new AnonymousClass39V(str, str2);
        objArr[2] = new AnonymousClass39V(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get");
    }

    public static void A0A(String str, String str2, Object[] objArr) {
        objArr[1] = new AnonymousClass39V(str, str2);
        objArr[2] = new AnonymousClass39V(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set");
    }

    public static AnonymousClass39V[] A0H(String str, int i) {
        AnonymousClass39V[] r2 = new AnonymousClass39V[4];
        r2[i] = new AnonymousClass39V(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str);
        return r2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !AnonymousClass001.A1a(obj, AnonymousClass39V.class)) {
                return false;
            }
            AnonymousClass39V r4 = (AnonymousClass39V) obj;
            if (!C162457s7.A0P(this.A02, r4.A02) || !C162457s7.A0P(this.A03, r4.A03)) {
                return false;
            }
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeParcelable(this.A01, i);
        parcel.writeByte(this.A00);
    }

    public static void A01(Jid jid, String str, AbstractCollection abstractCollection) {
        abstractCollection.add(new AnonymousClass39V(jid, str));
    }

    public static void A02(Jid jid, String str, Object[] objArr, int i) {
        objArr[i] = new AnonymousClass39V(jid, str);
    }

    public static void A03(String str, String str2, AbstractCollection abstractCollection) {
        abstractCollection.add(new AnonymousClass39V(str, str2));
    }

    public static void A04(String str, String str2, Object[] objArr) {
        objArr[0] = new AnonymousClass39V(str, str2);
    }

    public static void A05(String str, String str2, Object[] objArr) {
        objArr[1] = new AnonymousClass39V(str, str2);
    }

    public static void A06(String str, String str2, Object[] objArr) {
        objArr[2] = new AnonymousClass39V(str, str2);
    }

    public static void A07(String str, String str2, Object[] objArr) {
        objArr[3] = new AnonymousClass39V(str, str2);
    }

    public static void A08(String str, String str2, Object[] objArr) {
        objArr[4] = new AnonymousClass39V(str, str2);
    }

    public static void A0B(String str, String str2, Object[] objArr, int i) {
        objArr[i] = new AnonymousClass39V(str, str2);
    }

    public static void A0C(String str, String str2, Object[] objArr, int i, int i2) {
        objArr[i] = new AnonymousClass39V(str, str2);
        objArr[i2] = new AnonymousClass39V(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get");
    }

    public static void A0D(String str, String str2, Object[] objArr, int i, int i2) {
        objArr[i] = new AnonymousClass39V(str, str2);
        objArr[i2] = new AnonymousClass39V(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set");
    }

    public static boolean A0F(String str, String str2, Object[] objArr) {
        objArr[0] = new AnonymousClass39V(str, str2);
        return false;
    }

    public static boolean A0G(String str, String str2, Object[] objArr) {
        objArr[1] = new AnonymousClass39V(str, str2);
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x7.A08(this.A03, (this.A02.hashCode() + 31) * 31);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AnonymousClass39V(String str, String str2) {
        this((Jid) null, str, str2, (byte) 0);
        C18260x0.A0Q(str, str2);
    }

    public static AnonymousClass39V A00() {
        return new AnonymousClass39V((Jid) C135206kI.A00, "to");
    }

    public static void A0E(Object[] objArr, int i) {
        objArr[i] = new AnonymousClass39V((Jid) C135206kI.A00, "to");
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("KeyValue{key='");
        A0o.append(this.A02);
        A0o.append("', value='");
        A0o.append(this.A03);
        A0o.append("', type='");
        A0o.append(this.A00);
        return AnonymousClass000.A0X("'}", A0o);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AnonymousClass39V(Jid jid, String str) {
        this(jid, str, jid.getRawString(), (byte) 1);
        C18270x1.A10(str, 1, jid);
    }

    public AnonymousClass39V(String str, int i) {
        this(str, String.valueOf(i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0019, code lost:
        if ((r4 instanceof X.AnonymousClass1fW) != false) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass39V(com.whatsapp.jid.Jid r4, java.lang.String r5, java.lang.String r6, byte r7) {
        /*
            r3 = this;
            X.C18260x0.A0Q(r5, r6)
            r3.<init>()
            r3.A02 = r5
            r3.A03 = r6
            r3.A01 = r4
            r3.A00 = r7
            if (r4 == 0) goto L_0x0031
            boolean r0 = r4.isProtocolCompliant()
            if (r0 != 0) goto L_0x001b
            boolean r0 = r4 instanceof X.AnonymousClass1fW
            r2 = 0
            if (r0 == 0) goto L_0x001c
        L_0x001b:
            r2 = 1
        L_0x001c:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Jid: "
            r1.append(r0)
            X.C18280x3.A0u(r4, r1)
            java.lang.String r0 = " is not protocol compliant"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            X.C626936e.A0E(r2, r0)
        L_0x0031:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass39V.<init>(com.whatsapp.jid.Jid, java.lang.String, java.lang.String, byte):void");
    }

    public AnonymousClass39V(String str, long j) {
        this(str, String.valueOf(j));
    }
}
