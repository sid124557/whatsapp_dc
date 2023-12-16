package X;

import org.json.JSONObject;

/* renamed from: X.9Ui  reason: invalid class name and case insensitive filesystem */
public class C194749Ui {
    public final int A00;
    public final boolean A01;

    public C194749Ui(String str, Long l) {
        int intValue;
        if (l == null) {
            intValue = -1;
        } else {
            intValue = l.intValue();
        }
        this.A00 = intValue;
        this.A01 = C1899693i.A0y(str);
    }

    public C194749Ui(String str) {
        JSONObject A1H = AnonymousClass0x9.A1H(str);
        this.A00 = A1H.getInt("max_from_sender");
        this.A01 = A1H.getBoolean("usync_pay_eligible_offers_includes_current_offer_id");
    }
}
