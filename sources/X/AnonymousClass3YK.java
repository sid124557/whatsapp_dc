package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3YK  reason: invalid class name */
public final class AnonymousClass3YK implements C84314Bw {
    public final AnonymousClass2YM A00;
    public final C61132zl A01;
    public final AnonymousClass1kA A02;

    public static final void A00(C61132zl r4, AnonymousClass1kA r5, UserJid userJid, String str) {
        C162457s7.A0J(str, 0);
        List A022 = r5.A02();
        ArrayList A0s = AnonymousClass001.A0s();
        for (Object next : A022) {
            C18280x3.A17(((C53212mj) next).A02, userJid, next, A0s);
        }
        if (C73723fy.A04(A0s) != null) {
            r4.A03(str);
        }
    }

    public boolean AxE(AnonymousClass2PJ r16, C833648c r17, C833748d r18) {
        C833648c r7 = r17;
        if (!(r7 instanceof AnonymousClass3Y6)) {
            Log.e("SurveyEligibilityFilter/apply qpUserFilterContext is not correct type");
            this.A01.A03("SurveyQpFilter/apply qpUserFilterContext is not correct type");
        } else {
            C61132zl r6 = this.A01;
            AnonymousClass1kA r5 = this.A02;
            AnonymousClass3Y6 r72 = (AnonymousClass3Y6) r7;
            UserJid userJid = r72.A01;
            A00(r6, r5, userJid, "SurveyQpFilter/apply enter");
            List A022 = r5.A02();
            ArrayList A0s = AnonymousClass001.A0s();
            for (Object next : A022) {
                C53212mj r3 = (C53212mj) next;
                if (C162457s7.A0P(r3.A02, userJid)) {
                    AnonymousClass2YM r0 = this.A00;
                    if (System.currentTimeMillis() <= r3.A00 + TimeUnit.DAYS.toMillis((long) r0.A01.A00("survey_expiry_days", 30))) {
                        A0s.add(next);
                    }
                }
            }
            C53212mj r2 = (C53212mj) C73723fy.A04(A0s);
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("SurveyQpFilter/apply exit surveyInfoStore.allObjects.size=");
            A00(r6, r5, userJid, AnonymousClass000.A0h(A0o, r5.A02().size()));
            r72.A00 = r2;
            if (r2 != null) {
                return true;
            }
        }
        return false;
    }

    public AnonymousClass3YK(AnonymousClass2YM r1, C61132zl r2, AnonymousClass1kA r3) {
        C18260x0.A0V(r3, r1, r2);
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }
}
