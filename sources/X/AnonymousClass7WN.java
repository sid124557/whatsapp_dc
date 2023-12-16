package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.7WN  reason: invalid class name */
public class AnonymousClass7WN {
    public SharedPreferences A00;
    public final C56612sH A01;
    public final C60152y5 A02;

    public C161307pP A00() {
        C161307pP A002;
        C56612sH r2 = this.A01;
        long A0H = r2.A0H();
        long j = A0H - (A0H % 86400000);
        SharedPreferences sharedPreferences = this.A00;
        if (sharedPreferences == null) {
            sharedPreferences = this.A02.A03("payment_daily_usage_preferences");
            this.A00 = sharedPreferences;
        }
        String A0Z = C18280x3.A0Z(sharedPreferences, Long.toString(j));
        if (TextUtils.isEmpty(A0Z) || (A002 = C161307pP.A00(A0Z)) == null) {
            return new C161307pP(j, r2.A0H());
        }
        return A002;
    }

    public void A01(C161307pP r6) {
        long A0H = this.A01.A0H();
        String l = Long.toString(A0H - (A0H % 86400000));
        try {
            JSONObject put = AnonymousClass0x9.A1G().put("start_ts", r6.A0H).put("log_start_date", r6.A0G).put("total_one_time_mandate_cnt", r6.A02).put("total_transaction_sent_cnt", r6.A05).put("total_recurring_mandate_cnt", r6.A03).put("total_transaction_received_cnt", r6.A04).put("transaction_sent_with_sticker_cnt", r6.A0B).put("transaction_sent_with_background_cnt", r6.A0A).put("transaction_received_with_sticker_cnt", r6.A08).put("transaction_received_with_background_cnt", r6.A07).put("transaction_sent_with_background_and_sticker_cnt", r6.A09).put("transaction_received_with_background_and_sticker_cnt", r6.A06).put("invites_sent_to_user_cnt", r6.A01);
            Set set = r6.A0D;
            JSONArray A1F = AnonymousClass0x9.A1F();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                AnonymousClass0x7.A1L(it, A1F);
            }
            JSONObject put2 = put.put("invited_user_cnt", A1F);
            Set set2 = r6.A0F;
            JSONArray A1F2 = AnonymousClass0x9.A1F();
            Iterator it2 = set2.iterator();
            while (it2.hasNext()) {
                AnonymousClass0x7.A1L(it2, A1F2);
            }
            JSONObject put3 = put2.put("invited_user_registered_cnt", A1F2).put("invites_received_to_user_cnt", r6.A00);
            Set set3 = r6.A0E;
            JSONArray A1F3 = AnonymousClass0x9.A1F();
            Iterator it3 = set3.iterator();
            while (it3.hasNext()) {
                AnonymousClass0x7.A1L(it3, A1F3);
            }
            String obj = put3.put("inviter_user_cnt", A1F3).put("biz_qr_code_received", r6.A0C).toString();
            SharedPreferences sharedPreferences = this.A00;
            if (sharedPreferences == null) {
                sharedPreferences = this.A02.A03("payment_daily_usage_preferences");
                this.A00 = sharedPreferences;
            }
            C18270x1.A0j(sharedPreferences.edit(), l, obj);
        } catch (JSONException e) {
            e.getMessage();
        }
    }

    public AnonymousClass7WN(C56612sH r1, C60152y5 r2) {
        this.A01 = r1;
        this.A02 = r2;
    }
}
