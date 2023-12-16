package X;

import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9TT  reason: invalid class name */
public class AnonymousClass9TT {
    public final C56612sH A00;
    public final C620933l A01;
    public final ConcurrentHashMap A02 = new ConcurrentHashMap();

    public void A00() {
        Iterator A0u = AnonymousClass001.A0u(this.A02);
        while (A0u.hasNext()) {
            if (((C194869Uu) AnonymousClass0x2.A0W(A0u)).A04 + TimeUnit.DAYS.toSeconds((long) 14) < TimeUnit.MILLISECONDS.toSeconds(this.A00.A0H())) {
                A0u.remove();
            }
        }
        A02();
    }

    public void A01() {
        C620933l r7 = this.A01;
        String A0Z = C18280x3.A0Z(r7.A03(), "payment_incentive_offer_details");
        if (!TextUtils.isEmpty(A0Z)) {
            try {
                JSONObject A1H = AnonymousClass0x9.A1H(A0Z);
                ConcurrentHashMap concurrentHashMap = this.A02;
                concurrentHashMap.clear();
                Iterator<String> keys = A1H.keys();
                while (keys.hasNext()) {
                    String A0m = AnonymousClass001.A0m(keys);
                    long A04 = C615531h.A04(A0m, 0);
                    if (A04 > 0) {
                        concurrentHashMap.put(Long.valueOf(A04), new C194869Uu(A1H.getString(A0m)));
                    }
                }
            } catch (JSONException unused) {
                Log.e("PAY: PaymentIncentiveOfferMap/loadFromSharedPref failed to load the current offer details");
                this.A02.clear();
                C18270x1.A0j(C620933l.A00(r7), "payment_incentive_offer_details", (String) null);
            }
        }
    }

    public AnonymousClass9TT(C56612sH r2, C620933l r3) {
        this.A00 = r2;
        this.A01 = r3;
    }

    public final void A02() {
        try {
            JSONObject A1G = AnonymousClass0x9.A1G();
            Iterator A0u = AnonymousClass001.A0u(this.A02);
            while (A0u.hasNext()) {
                Map.Entry A0w = AnonymousClass001.A0w(A0u);
                String l = Long.toString(C18310x6.A0B(A0w.getKey()));
                C194869Uu r2 = (C194869Uu) A0w.getValue();
                JSONObject A1G2 = AnonymousClass0x9.A1G();
                C59942xk r8 = r2.A08;
                JSONObject A1G3 = AnonymousClass0x9.A1G();
                A1G3.put("update_count", r8.A00);
                A1G3.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r8.A01);
                C18300x5.A1L(A1G3, PublicKeyCredentialControllerUtility.JSON_KEY_ID, A1G2);
                A1G2.put("state", r2.A03);
                A1G2.put("title", r2.A0F);
                A1G2.put("end_ts", r2.A04);
                A1G2.put("locale", r2.A0D);
                A1G2.put("start_ts", r2.A06);
                A1G2.put("terms_url", r2.A0E);
                A1G2.put("description", r2.A0B);
                A1G2.put("redeem_limit", r2.A05);
                A1G2.put("fine_print_url", r2.A0C);
                A1G2.put("interactive_sync_done", r2.A02);
                A1G2.put("kill_switch_info_viewed", r2.A00);
                A1G2.put("sender_maxed_info_viewed", r2.A01);
                A1G2.put("offer_amount", r2.A07.A01().toString());
                C194679Ub r0 = r2.A09;
                A1G2.put("payment", AnonymousClass0x9.A0y(r0.A00.A01().toString(), "min_amount", AnonymousClass0x9.A1G()));
                C194749Ui r3 = r2.A0A;
                JSONObject A1G4 = AnonymousClass0x9.A1G();
                A1G4.put("max_from_sender", r3.A00);
                A1G4.put("usync_pay_eligible_offers_includes_current_offer_id", r3.A01);
                A1G2.put("receiver", A1G4.toString());
                C18300x5.A1L(A1G2, l, A1G);
            }
            C620933l r02 = this.A01;
            C18270x1.A0j(C620933l.A00(r02), "payment_incentive_offer_details", A1G.toString());
        } catch (JSONException unused) {
            this.A02.clear();
            C18270x1.A0j(C620933l.A00(this.A01), "payment_incentive_offer_details", (String) null);
        }
    }

    public void A03(C194869Uu r12, long j) {
        A01();
        ConcurrentHashMap concurrentHashMap = this.A02;
        concurrentHashMap.put(Long.valueOf(j), r12);
        for (int size = concurrentHashMap.size() - 2; size > 0; size--) {
            Iterator A0u = AnonymousClass001.A0u(concurrentHashMap);
            long j2 = 0;
            long j3 = Long.MAX_VALUE;
            while (A0u.hasNext()) {
                Map.Entry A0w = AnonymousClass001.A0w(A0u);
                if (C18310x6.A0B(A0w.getKey()) != j && ((C194869Uu) A0w.getValue()).A04 < j3) {
                    j2 = C18310x6.A0B(A0w.getKey());
                    j3 = ((C194869Uu) A0w.getValue()).A04;
                }
            }
            concurrentHashMap.remove(Long.valueOf(j2));
        }
        A02();
    }
}
