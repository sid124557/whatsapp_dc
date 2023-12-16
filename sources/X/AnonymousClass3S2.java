package X;

import org.json.JSONObject;

/* renamed from: X.3S2  reason: invalid class name */
public final class AnonymousClass3S2 implements AnonymousClass4DO {
    public /* bridge */ /* synthetic */ Object B3Z(String str) {
        C162457s7.A0J(str, 0);
        return AnonymousClass27W.A00(AnonymousClass0x9.A1H(str));
    }

    public /* bridge */ /* synthetic */ String Bqn(Object obj) {
        C53212mj r5 = (C53212mj) obj;
        JSONObject A0l = AnonymousClass0x2.A0l(r5);
        A0l.put("session_id", r5.A04);
        A0l.put("business_jid", r5.A02.getRawString());
        A0l.put("business_session_id", r5.A03);
        A0l.put("survey_start_timestamp", r5.A00);
        return C18280x3.A0c(r5.A01.A00(), "conversion_info", A0l);
    }
}
