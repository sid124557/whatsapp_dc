package X;

import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.7pP  reason: invalid class name and case insensitive filesystem */
public class C161307pP {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public String A0C;
    public Set A0D;
    public Set A0E;
    public Set A0F;
    public final long A0G;
    public final long A0H;

    public C161307pP(long j, long j2) {
        this.A0G = j;
        this.A0H = j2;
        this.A0D = AnonymousClass002.A0K();
        this.A0F = AnonymousClass002.A0K();
        this.A0E = AnonymousClass002.A0K();
    }

    public static C161307pP A00(String str) {
        try {
            JSONObject A1H = AnonymousClass0x9.A1H(str);
            long optLong = A1H.optLong("start_ts");
            long optLong2 = A1H.optLong("log_start_date");
            long optLong3 = A1H.optLong("total_one_time_mandate_cnt");
            long optLong4 = A1H.optLong("total_transaction_sent_cnt");
            long optLong5 = A1H.optLong("total_recurring_mandate_cnt");
            long optLong6 = A1H.optLong("total_transaction_received_cnt");
            long optLong7 = A1H.optLong("transaction_sent_with_sticker_cnt");
            long optLong8 = A1H.optLong("transaction_sent_with_background_cnt");
            long optLong9 = A1H.optLong("transaction_received_with_sticker_cnt");
            long optLong10 = A1H.optLong("transaction_received_with_background_cnt");
            long optLong11 = A1H.optLong("transaction_sent_with_background_and_sticker_cnt");
            long optLong12 = A1H.optLong("transaction_received_with_background_and_sticker_cnt");
            long optLong13 = A1H.optLong("invites_sent_to_user_cnt");
            Set A012 = A01(A1H.optJSONArray("invited_user_cnt"));
            Set A013 = A01(A1H.optJSONArray("invited_user_registered_cnt"));
            long optLong14 = A1H.optLong("invites_received_to_user_cnt");
            return new C161307pP(A1H.optString("biz_qr_code_received"), A012, A013, A01(A1H.optJSONArray("inviter_user_cnt")), optLong, optLong2, optLong3, optLong4, optLong5, optLong6, optLong7, optLong8, optLong9, optLong10, optLong11, optLong12, optLong13, optLong14);
        } catch (JSONException e) {
            e.getMessage();
            return null;
        }
    }

    public static Set A01(JSONArray jSONArray) {
        HashSet A0K = AnonymousClass002.A0K();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    A0K.add(jSONArray.getString(i));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
        return A0K;
    }

    public C161307pP(String str, Set set, Set set2, Set set3, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14) {
        this.A0H = j;
        this.A0G = j2;
        this.A02 = j3;
        this.A05 = j4;
        this.A03 = j5;
        this.A04 = j6;
        this.A0B = j7;
        this.A0A = j8;
        this.A08 = j9;
        this.A07 = j10;
        this.A09 = j11;
        this.A06 = j12;
        this.A01 = j13;
        this.A0D = set;
        this.A0F = set2;
        this.A00 = j14;
        this.A0E = set3;
        this.A0C = str;
    }
}
