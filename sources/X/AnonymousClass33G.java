package X;

import android.content.Context;
import android.text.TextUtils;
import com.whatsapp.jid.DeviceJid;

/* renamed from: X.33G  reason: invalid class name */
public class AnonymousClass33G {
    public long A00;
    public long A01;
    public String A02;
    public String A03;
    public final int A04;
    public final long A05;
    public final C59732xO A06;
    public final DeviceJid A07;
    public final AnonymousClass23P A08;
    public final String A09;
    public final boolean A0A;

    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        AnonymousClass33G r7 = (AnonymousClass33G) obj;
        return this.A07.equals(r7.A07) && this.A08.equals(r7.A08) && C107575bX.A0G(this.A09, r7.A09) && this.A05 == r7.A05 && this.A04 == r7.A04 && this.A0A == r7.A0A && TextUtils.equals(this.A02, r7.A02);
    }

    public int hashCode() {
        Object[] objArr = new Object[7];
        objArr[0] = this.A07;
        objArr[1] = this.A08;
        objArr[2] = this.A09;
        AnonymousClass0x2.A1V(objArr, this.A05);
        C18280x3.A1P(objArr, this.A04);
        objArr[5] = Boolean.valueOf(this.A0A);
        return C18310x6.A08(this.A02, objArr, 6);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004e, code lost:
        return X.AnonymousClass002.A0F(r4, r5.A09, new java.lang.Object[1], 0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        return r4.getString(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A00(android.content.Context r4, X.AnonymousClass33G r5) {
        /*
            X.23P r0 = r5.A08
            int r1 = r0.ordinal()
            r3 = 0
            r0 = 1
            switch(r1) {
                case 1: goto L_0x0043;
                case 2: goto L_0x003f;
                case 3: goto L_0x0037;
                case 4: goto L_0x0033;
                case 5: goto L_0x003b;
                case 6: goto L_0x002f;
                case 7: goto L_0x000b;
                case 8: goto L_0x000b;
                case 9: goto L_0x002b;
                case 10: goto L_0x0027;
                case 11: goto L_0x0023;
                case 12: goto L_0x001f;
                case 13: goto L_0x001b;
                case 14: goto L_0x000b;
                case 15: goto L_0x000b;
                case 16: goto L_0x002b;
                case 17: goto L_0x002b;
                case 18: goto L_0x000b;
                case 19: goto L_0x000b;
                case 20: goto L_0x000b;
                case 21: goto L_0x000b;
                case 22: goto L_0x0017;
                default: goto L_0x000b;
            }
        L_0x000b:
            java.lang.String r0 = r5.A09
            if (r0 != 0) goto L_0x0016
            r0 = 2131890457(0x7f121119, float:1.9415606E38)
        L_0x0012:
            java.lang.String r0 = r4.getString(r0)
        L_0x0016:
            return r0
        L_0x0017:
            r0 = 2131890456(0x7f121118, float:1.9415604E38)
            goto L_0x0012
        L_0x001b:
            r0 = 2131890454(0x7f121116, float:1.94156E38)
            goto L_0x0012
        L_0x001f:
            r0 = 2131890447(0x7f12110f, float:1.9415586E38)
            goto L_0x0012
        L_0x0023:
            r0 = 2131890445(0x7f12110d, float:1.9415582E38)
            goto L_0x0012
        L_0x0027:
            r0 = 2131890452(0x7f121114, float:1.9415596E38)
            goto L_0x0012
        L_0x002b:
            r2 = 2131890446(0x7f12110e, float:1.9415584E38)
            goto L_0x0046
        L_0x002f:
            r2 = 2131890449(0x7f121111, float:1.941559E38)
            goto L_0x0046
        L_0x0033:
            r2 = 2131890453(0x7f121115, float:1.9415598E38)
            goto L_0x0046
        L_0x0037:
            r2 = 2131890451(0x7f121113, float:1.9415594E38)
            goto L_0x0046
        L_0x003b:
            r2 = 2131890455(0x7f121117, float:1.9415602E38)
            goto L_0x0046
        L_0x003f:
            r2 = 2131890450(0x7f121112, float:1.9415592E38)
            goto L_0x0046
        L_0x0043:
            r2 = 2131890448(0x7f121110, float:1.9415588E38)
        L_0x0046:
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r0 = r5.A09
            java.lang.String r0 = X.AnonymousClass002.A0F(r4, r0, r1, r3, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass33G.A00(android.content.Context, X.33G):java.lang.String");
    }

    public static String A01(Context context, AnonymousClass33G r4, AnonymousClass1VX r5) {
        String str = r4.A02;
        if (TextUtils.isEmpty(str) || !r5.A0Y(C58422vE.A02, 4757)) {
            return A00(context, r4);
        }
        return str;
    }

    public boolean A02() {
        return AnonymousClass001.A1W((this.A01 > 0 ? 1 : (this.A01 == 0 ? 0 : -1)));
    }

    public AnonymousClass33G(C59732xO r2, DeviceJid deviceJid, AnonymousClass23P r4, String str, String str2, String str3, int i, long j, long j2, long j3, boolean z) {
        C626936e.A06(deviceJid);
        this.A07 = deviceJid;
        this.A08 = r4;
        this.A09 = C159707mK.A00(str) ? null : str;
        this.A00 = j;
        this.A05 = j2;
        this.A01 = j3;
        this.A04 = i;
        this.A0A = z;
        this.A03 = str2;
        this.A02 = str3;
        this.A06 = r2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Device jid: ");
        A0o.append(this.A07);
        A0o.append(", Platform type: ");
        A0o.append(this.A08);
        A0o.append(", Device OS: ");
        A0o.append(this.A09);
        A0o.append(", Last active: ");
        A0o.append(this.A00);
        A0o.append(", Login time: ");
        A0o.append(this.A05);
        A0o.append(", Logout time: ");
        A0o.append(this.A01);
        A0o.append(", ADV Key Index: ");
        A0o.append(this.A04);
        A0o.append(", full sync required: ");
        A0o.append(this.A0A);
        A0o.append(", Place Name: ");
        A0o.append(this.A03);
        A0o.append(", History sync config info: ");
        A0o.append(this.A06);
        A0o.append(", Nickname: ");
        return AnonymousClass000.A0X(this.A02, A0o);
    }
}
