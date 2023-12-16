package X;

import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import org.json.JSONObject;

/* renamed from: X.2pe  reason: invalid class name and case insensitive filesystem */
public class C55012pe {
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final UserJid A04;
    public final String A05;
    public final String A06;
    public final boolean A07;
    public final boolean A08;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C55012pe r7 = (C55012pe) obj;
            if (!(this.A04.getRawString().equals(r7.A04.getRawString()) && TextUtils.equals(this.A06, r7.A06) && TextUtils.equals(this.A05, r7.A05) && this.A01 == r7.A01 && this.A03 == r7.A03 && this.A00 == r7.A00 && this.A07 == r7.A07 && this.A02 == r7.A02 && this.A08 == r7.A08)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[9];
        objArr[0] = this.A04;
        objArr[1] = this.A06;
        objArr[2] = this.A05;
        AnonymousClass0x2.A1V(objArr, this.A01);
        C18280x3.A1P(objArr, this.A00);
        objArr[5] = Boolean.valueOf(this.A07);
        objArr[6] = Long.valueOf(this.A03);
        objArr[7] = Long.valueOf(this.A02);
        return C18310x6.A08(Boolean.valueOf(this.A08), objArr, 8);
    }

    public C55012pe(AnonymousClass2TW r3) {
        this.A04 = r3.A06;
        this.A06 = r3.A08;
        this.A05 = r3.A07;
        this.A01 = r3.A04;
        this.A03 = r3.A05;
        this.A07 = r3.A02;
        this.A00 = r3.A00;
        this.A02 = r3.A01;
        this.A08 = r3.A03;
    }

    public String A00() {
        JSONObject A1G = AnonymousClass0x9.A1G();
        A1G.put("uj", this.A04.getRawString());
        A1G.put("s", this.A06);
        String str = this.A05;
        if (!TextUtils.isEmpty(str)) {
            A1G.put("a", str);
        }
        A1G.put("ct", this.A01);
        A1G.put("lit", this.A03);
        A1G.put("hcslm", this.A07);
        int i = this.A00;
        if (i != -1) {
            A1G.put("brc", i);
        }
        long j = this.A02;
        if (j != -1) {
            A1G.put("fmts", j);
        }
        A1G.put("wdtb", this.A08);
        return A1G.toString();
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("EntryPointConversionData{userJid=");
        A0o.append(this.A04);
        A0o.append(", source='");
        char A012 = C18300x5.A01(this.A06, A0o);
        A0o.append(", app='");
        A0o.append(this.A05);
        A0o.append(A012);
        A0o.append(", creationTimeMillis=");
        A0o.append(this.A01);
        A0o.append(", bizCount=");
        A0o.append(this.A00);
        A0o.append(", hasUserSentLastMessage=");
        A0o.append(this.A07);
        A0o.append(", lastInteractionTimeMillis=");
        A0o.append(this.A03);
        A0o.append(", firstMessageTsSeconds=");
        A0o.append(this.A02);
        A0o.append(", wasDeliveredToBiz=");
        A0o.append(this.A08);
        return AnonymousClass000.A0d(A0o);
    }
}
