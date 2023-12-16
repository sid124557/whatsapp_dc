package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.util.Log;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.99D  reason: invalid class name */
public final class AnonymousClass99D extends C133676hl {
    public static final Parcelable.Creator CREATOR = new C204589pb(13);
    public int A00 = 1;
    public C166557yt A01;
    public C166557yt A02;
    public String A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x004b, code lost:
        if (r1 == false) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x005d, code lost:
        if (r1 != false) goto L_0x005f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(X.C617332a r6, X.AnonymousClass36K r7, int r8) {
        /*
            r5 = this;
            java.lang.String r0 = "user"
            r4 = 0
            java.lang.String r0 = r7.A0r(r0, r4)
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass32Y.A08(r0)
            r5.A05 = r0
            X.3QD r2 = X.AnonymousClass3QD.A00()
            java.lang.String r0 = "vpa"
            java.lang.String r1 = r7.A0r(r0, r4)
            java.lang.String r0 = "upiHandle"
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            X.7yt r0 = X.C1899693i.A0F(r2, r3, r1, r0)
            r5.A02 = r0
            java.lang.String r0 = "vpa-id"
            java.lang.String r0 = r7.A0r(r0, r4)
            r5.A03 = r0
            X.3QD r2 = X.AnonymousClass3QD.A00()
            java.lang.String r0 = "user-name"
            java.lang.String r1 = r7.A0r(r0, r4)
            java.lang.String r0 = "accountHolderName"
            X.7yt r0 = X.C1899693i.A0F(r2, r3, r1, r0)
            r5.A01 = r0
            java.lang.String r0 = "nodal"
            java.lang.String r0 = r7.A0r(r0, r4)
            r3 = 1
            java.lang.String r2 = "1"
            if (r0 == 0) goto L_0x004d
            boolean r1 = r0.equals(r2)
            r0 = 1
            if (r1 != 0) goto L_0x004e
        L_0x004d:
            r0 = 0
        L_0x004e:
            r5.A04 = r0
            java.lang.String r0 = "nodal-allowed"
            java.lang.String r0 = r7.A0r(r0, r4)
            if (r0 == 0) goto L_0x005f
            boolean r1 = r0.equals(r2)
            r0 = 0
            if (r1 == 0) goto L_0x0060
        L_0x005f:
            r0 = 1
        L_0x0060:
            r5.A05 = r0
            java.lang.String r0 = "notif-allowed"
            java.lang.String r0 = r7.A0r(r0, r4)
            if (r0 == 0) goto L_0x0071
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0071
            r3 = 0
        L_0x0071:
            r5.A06 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass99D.A04(X.32a, X.36K, int):void");
    }

    public void A05(String str) {
        Class<String> cls = String.class;
        super.A05(str);
        if (str != null) {
            try {
                JSONObject A1H = AnonymousClass0x9.A1H(str);
                int optInt = A1H.optInt("v", 1);
                this.A00 = optInt;
                if (optInt == 1) {
                    this.A02 = C1899693i.A0F(AnonymousClass3QD.A00(), cls, A1H.optString("vpaHandle", (String) null), "upiHandle");
                    this.A03 = A1H.optString("vpaId", (String) null);
                    this.A01 = C1899693i.A0F(AnonymousClass3QD.A00(), cls, A1H.optString("legalName", (String) null), "accountHolderName");
                }
            } catch (JSONException e) {
                Log.w("PAY: IndiaUpiContactData fromDBString threw: ", e);
            }
        }
    }

    public void A06(List list, int i) {
        throw AnonymousClass002.A0G("IndiaUpiContactData toNetwork not supported");
    }

    public String A09() {
        Object obj;
        C166557yt r0 = this.A02;
        if (r0 == null) {
            obj = null;
        } else {
            obj = r0.A00;
        }
        return (String) obj;
    }

    public AnonymousClass99D(Parcel parcel) {
        super(parcel);
        this.A02 = (C166557yt) C18280x3.A0C(parcel, C166557yt.class);
        this.A03 = parcel.readString();
    }

    public String A03() {
        JSONObject A1G;
        try {
            String A032 = super.A03();
            if (A032 != null) {
                A1G = AnonymousClass0x9.A1H(A032);
            } else {
                A1G = AnonymousClass0x9.A1G();
            }
            A1G.put("v", this.A00);
            if (!C161527pr.A02(this.A02)) {
                C1899693i.A0r(this.A02, "vpaHandle", A1G);
            }
            String str = this.A03;
            if (str != null) {
                A1G.put("vpaId", str);
            }
            if (!C161527pr.A02(this.A01)) {
                C1899693i.A0r(this.A01, "legalName", A1G);
            }
            return A1G.toString();
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiContactData toDBString threw: ", e);
            return null;
        }
    }

    public void A0B(String str) {
        this.A02 = C1899593h.A0B(str);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("[ ver: ");
        A0o.append(this.A00);
        A0o.append(" jid: ");
        A0o.append(this.A05);
        A0o.append(" vpaHandle: ");
        A0o.append(this.A02);
        A0o.append(" nodal: ");
        A0o.append(this.A04);
        A0o.append(" nodalAllowed: ");
        A0o.append(this.A05);
        A0o.append(" notifAllowed: ");
        A0o.append(this.A06);
        return AnonymousClass000.A0X(" ]", A0o);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.A02, i);
        parcel.writeString(this.A03);
    }

    public int A07() {
        return 1;
    }

    public boolean A0D() {
        return false;
    }

    public void A0A(int i) {
    }

    public void A0C(boolean z) {
    }

    public AnonymousClass99D() {
    }
}
