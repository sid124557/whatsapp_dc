package com.whatsapp.payments.care.csat;

import X.AnonymousClass08A;
import X.AnonymousClass0x9;
import X.AnonymousClass39C;
import X.AnonymousClass90L;
import X.AnonymousClass91P;
import X.AnonymousClass9HQ;
import X.C04290Nq;
import X.C08270df;
import X.C08310eF;
import X.C102075Hj;
import X.C107405bG;
import X.C162457s7;
import X.C18270x1;
import X.C18290x4;
import X.C18300x5;
import X.C56972sr;
import X.C86604Kt;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.wabloks.ui.bottomsheet.BkBottomSheetContainerFragment;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

public final class CsatSurveyBloksActivity extends AnonymousClass9HQ {
    public C102075Hj A00;

    public static /* synthetic */ void A0C(C08310eF r2, CsatSurveyBloksActivity csatSurveyBloksActivity) {
        AnonymousClass08A r1;
        if ((r2 instanceof BkBottomSheetContainerFragment) && (r1 = r2.A0L) != null) {
            r1.A00(new CsatSurveyBloksActivity$closeActivityWhenBottomSheetCloses$1$1(r2, csatSurveyBloksActivity));
        }
    }

    public C08310eF A75(Intent intent) {
        return new C08310eF();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C86604Kt.A1L(this, R.id.wabloks_screen);
        C08270df supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.A0d.add(new AnonymousClass90L(this, 0));
        C102075Hj r4 = this.A00;
        if (r4 != null) {
            String stringExtra = getIntent().getStringExtra("survey_id");
            if (stringExtra != null) {
                String stringExtra2 = getIntent().getStringExtra("entry_point");
                String stringExtra3 = getIntent().getStringExtra("session_id");
                C04290Nq r10 = (C04290Nq) r4.A01.get();
                WeakReference A14 = AnonymousClass0x9.A14(this);
                boolean A0D = C107405bG.A0D(this);
                PhoneUserJid A04 = C56972sr.A04(r4.A00);
                C162457s7.A0H(A04);
                String rawString = A04.getRawString();
                JSONObject A1G = AnonymousClass0x9.A1G();
                A1G.put("survey_id", stringExtra);
                if (!(stringExtra2 == null || stringExtra2.length() == 0)) {
                    A1G.put("entry_point", stringExtra2);
                }
                if (!(stringExtra3 == null || stringExtra3.length() == 0)) {
                    A1G.put("session_id", stringExtra3);
                }
                r10.A00(new AnonymousClass91P(0), (AnonymousClass39C) null, "com.bloks.www.novi.care.start_survey_action", rawString, C18290x4.A0o(AnonymousClass0x9.A1G().put("params", AnonymousClass0x9.A1G().put("server_params", A1G))), A14, A0D);
                return;
            }
            throw C18300x5.A0X();
        }
        throw C18270x1.A0S("csatSurveyLauncherProxy");
    }
}
