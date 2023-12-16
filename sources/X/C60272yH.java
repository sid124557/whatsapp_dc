package X;

import org.json.JSONObject;

/* renamed from: X.2yH  reason: invalid class name and case insensitive filesystem */
public class C60272yH {
    public final long A00;
    public final C50912iy A01;
    public final C166557yt A02;
    public final C166557yt A03;
    public final C166557yt A04;
    public final C166557yt A05;
    public final C166557yt A06;
    public final Long A07;
    public final String A08;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60272yH) {
                C60272yH r6 = (C60272yH) obj;
                if (!AnonymousClass75J.A00(C18330xA.A08(this.A04), C18330xA.A08(r6.A04)) || !AnonymousClass75J.A00(C18330xA.A08(this.A05), C18330xA.A08(r6.A05)) || !AnonymousClass75J.A00(C18330xA.A08(this.A02), C18330xA.A08(r6.A02)) || !AnonymousClass75J.A00(Long.valueOf(this.A00), Long.valueOf(r6.A00)) || !AnonymousClass75J.A00(this.A07, r6.A07) || !AnonymousClass75J.A00(this.A01, r6.A01) || !AnonymousClass75J.A00(this.A03, r6.A03) || !AnonymousClass75J.A00(this.A06, r6.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static void A00(C60272yH r10, AnonymousClass4EJ r11, Object obj, JSONObject jSONObject) {
        long longValue = ((Number) obj).longValue();
        Object obj2 = r10.A05.A00;
        C626936e.A06(obj2);
        String A012 = AnonymousClass31V.A01(jSONObject);
        long j = r10.A00;
        Long l = r10.A07;
        String str = r10.A08;
        r11.Bd3(new C60272yH(r10.A01, l, (String) obj2, A012, str, longValue, j));
    }

    public int hashCode() {
        Object[] objArr = new Object[8];
        objArr[0] = C18330xA.A08(this.A04);
        objArr[1] = C18330xA.A08(this.A05);
        objArr[2] = this.A02;
        AnonymousClass0x2.A1V(objArr, this.A00);
        objArr[4] = this.A07;
        objArr[5] = this.A01;
        objArr[6] = this.A03;
        return C18310x6.A08(this.A06, objArr, 7);
    }

    public C60272yH(C633738z r6, C633738z r7, C50912iy r8, Long l, String str, String str2, String str3, long j, long j2) {
        Class<Long> cls = Long.class;
        this.A04 = new C166557yt(AnonymousClass3QD.A00(), cls, Long.valueOf(j), "WaFbid");
        this.A05 = new C166557yt(AnonymousClass3QD.A00(), String.class, str, "WaFbPassword");
        this.A02 = new C166557yt(AnonymousClass3QD.A00(), cls, str2, "WaFbAccessToken");
        this.A00 = j2;
        this.A07 = l;
        this.A01 = r8;
        this.A08 = str3;
        C166557yt r3 = null;
        if (r6 != null) {
            this.A03 = new C166557yt(AnonymousClass3QD.A00(), C633738z.class, r6, "WaFbCurrentUserSessionCookie");
        } else {
            this.A03 = null;
        }
        this.A06 = r7 != null ? new C166557yt(AnonymousClass3QD.A00(), C633738z.class, r7, "WaFbCurrentUserSessionCookie") : r3;
    }

    public C60272yH(C50912iy r6, Long l, String str, String str2, String str3, long j, long j2) {
        Class<Long> cls = Long.class;
        this.A04 = new C166557yt(AnonymousClass3QD.A00(), cls, Long.valueOf(j), "WaFbid");
        this.A05 = new C166557yt(AnonymousClass3QD.A00(), String.class, str, "WaFbPassword");
        this.A02 = new C166557yt(AnonymousClass3QD.A00(), cls, str2, "WaFbAccessToken");
        this.A00 = j2;
        this.A07 = l;
        this.A01 = r6;
        this.A08 = str3;
        this.A03 = null;
        this.A06 = null;
    }
}
