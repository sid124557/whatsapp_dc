package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import com.whatsapp.wabloks.ui.WaBloksActivity;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9eO  reason: invalid class name and case insensitive filesystem */
public class C198109eO implements C183408pz {
    public final C183538qC A00;
    public final C183538qC A01;
    public final C183538qC A02;
    public final C183538qC A03;
    public final List A04;

    public final void A00(Context context, Intent intent) {
        if (((C1227565p) this.A01.get()).BJ8()) {
            ((C111095hX) this.A00.get()).A0D(C111095hX.A02(context), intent, 475);
            return;
        }
        this.A02.get();
        C626936e.A06(C111095hX.A03(context, C003203q.class));
    }

    public boolean BF1(Context context, Uri uri) {
        String str;
        Intent intent;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        if (context == null) {
            return false;
        }
        List list = this.A04;
        if (list.isEmpty()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            C204919q8 r1 = (C204919q8) ((C202869mi) list.get(i));
            if (r1.A01 != 0) {
                AnonymousClass9PS r3 = (AnonymousClass9PS) r1.A00;
                String A0Q = ((C56952sp) r3.A01.get()).A0Q(210);
                if (!TextUtils.isEmpty(A0Q)) {
                    C193149Ni r12 = new C193149Ni();
                    r3.A02.get();
                    if (AnonymousClass9UB.A00(r12, uri.toString(), A0Q) && (jSONObject2 = r12.A00) != null) {
                        try {
                            JSONObject A1G = AnonymousClass0x9.A1G();
                            intent = WaBloksActivity.A0X(context, "com.bloks.www.minishops.whatsapp.pdp", AnonymousClass0x9.A0y(A1G, "params", C18300x5.A0z(jSONObject2, "server_params", A1G)));
                        } catch (JSONException e) {
                            e = e;
                            str = "ShopsLinks.handleShopsPdpLink: Failed to assemble JSON";
                        }
                    }
                } else {
                    continue;
                }
            } else {
                AnonymousClass9PS r8 = (AnonymousClass9PS) r1.A00;
                C193149Ni r7 = new C193149Ni();
                String obj = uri.toString();
                C183538qC r32 = r8.A01;
                String A0Q2 = ((C56952sp) r32.get()).A0Q(265);
                if (((C56952sp) r32.get()).A0X(267) && !TextUtils.isEmpty(A0Q2)) {
                    r8.A02.get();
                    if (AnonymousClass9UB.A00(r7, obj, A0Q2) && (jSONObject = r7.A00) != null) {
                        try {
                            JSONObject A1G2 = AnonymousClass0x9.A1G();
                            intent = WaBloksActivity.A0X(context, "com.bloks.www.minishops.storefront.wa", AnonymousClass0x9.A0y(A1G2, "params", C18300x5.A0z(jSONObject, "server_params", A1G2)));
                        } catch (JSONException e2) {
                            e = e2;
                            str = "ShopsLinks.handleStoreFrontLink: Failed to assemble JSON";
                            Log.e(str, e);
                        }
                    }
                }
            }
            if (intent != null) {
                ((C60482yd) this.A03.get()).A01(context).A00(new C197879e1(intent, this, AnonymousClass0x9.A14(context)), C172088Jo.class, this);
                A00(context, intent);
                return true;
            }
        }
        return false;
    }

    public C198109eO(C183538qC r2, C183538qC r3, C183538qC r4, C183538qC r5, C183538qC r6) {
        this.A02 = r2;
        this.A00 = r4;
        this.A01 = r5;
        this.A03 = r6;
        this.A04 = ((AnonymousClass9PS) r3.get()).A03;
    }
}
