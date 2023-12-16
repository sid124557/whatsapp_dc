package X;

import org.json.JSONObject;

/* renamed from: X.3EM  reason: invalid class name */
public final class AnonymousClass3EM implements AnonymousClass4E1 {
    public static final AnonymousClass3EM A00 = new AnonymousClass3EM();

    public /* bridge */ /* synthetic */ Object B3a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("mode");
        String optString2 = jSONObject.optString("background");
        String optString3 = jSONObject.optString("primary_text");
        String optString4 = jSONObject.optString("secondary_text");
        Integer A002 = C154447dB.A00(optString2);
        if (A002 == null) {
            return null;
        }
        int intValue = A002.intValue();
        Integer A003 = C154447dB.A00(optString3);
        if (A003 == null) {
            return null;
        }
        return new C52812m5(C154447dB.A00(optString4), optString, intValue, A003.intValue());
    }

    public /* bridge */ /* synthetic */ Object B3b(Object obj) {
        C35031wD r7 = (C35031wD) obj;
        C162457s7.A0J(r7, 0);
        String str = r7.A01;
        String str2 = r7.A00;
        String str3 = r7.A02;
        String str4 = r7.A03;
        Integer A002 = C154447dB.A00(str2);
        if (A002 == null) {
            return null;
        }
        int intValue = A002.intValue();
        Integer A003 = C154447dB.A00(str3);
        if (A003 == null) {
            return null;
        }
        return new C52812m5(C154447dB.A00(str4), str, intValue, A003.intValue());
    }

    public /* bridge */ /* synthetic */ JSONObject Bqt(Object obj) {
        String str;
        C52812m5 r4 = (C52812m5) obj;
        JSONObject A0l = AnonymousClass0x2.A0l(r4);
        A0l.put("mode", r4.A03);
        A0l.put("background", C154447dB.A01(Integer.valueOf(r4.A00)));
        A0l.put("primary_text", C154447dB.A01(Integer.valueOf(r4.A01)));
        Integer num = r4.A02;
        if (num != null) {
            str = C154447dB.A01(num);
        } else {
            str = null;
        }
        A0l.put("secondary_text", str);
        return A0l;
    }
}
