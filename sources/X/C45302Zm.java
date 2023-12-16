package X;

import com.whatsapp.jid.UserJid;
import java.util.Map;

/* renamed from: X.2Zm  reason: invalid class name and case insensitive filesystem */
public final class C45302Zm {
    public final C43632Sw A00;
    public final AnonymousClass2RL A01;
    public final C61132zl A02;

    public final void A00(AnonymousClass4FU r13, C53212mj r14, int i) {
        String str;
        AnonymousClass1ZJ.A00(new AnonymousClass1ZJ(), this.A02, r14, 3, i);
        AnonymousClass2RL r2 = this.A01;
        C64773Ex r0 = r2.A02;
        UserJid userJid = r14.A02;
        AnonymousClass3ZH A07 = r0.A07(userJid);
        if (A07 != null) {
            C55502qS r02 = A07.A0E;
            if (r02 == null || (str = r02.A08) == null) {
                str = "";
            }
            String str2 = r14.A04;
            C51052jC r5 = new C51052jC(str2);
            AnonymousClass3Z6[] r6 = new AnonymousClass3Z6[4];
            AnonymousClass3Z6.A09("survey_session_id", str2, r6, 0);
            r6[1] = AnonymousClass3Z6.A02("business_jid", userJid.user);
            AnonymousClass3Z6.A06("business_survey_session_id", r14.A03, r6);
            AnonymousClass3Z6.A07("business_name", str, r6);
            Map A0F = C73813g7.A0F(r6);
            C161447pg A002 = r2.A01.A00(r5);
            r2.A00 = A002;
            AnonymousClass3Z6[] r1 = new AnonymousClass3Z6[1];
            AnonymousClass3Z6.A09("action", (Object) null, r1, 0);
            A002.A07(new AnonymousClass3SL(r2, r14, i), new AnonymousClass3SM(r13, r2, r14, i), new C52622lm("biz_survey", (String) null, C73813g7.A0G(r1)), "biz_survey", (String) null, A0F);
        }
        C43632Sw r22 = this.A00;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("SurveyNotificationComposer/cancelNotification sessionId=");
        C18260x0.A1J(A0o, r14.A04);
        r22.A04.A06(61, (String) null, "");
    }

    public C45302Zm(C43632Sw r1, AnonymousClass2RL r2, C61132zl r3) {
        C18260x0.A0R(r3, r1);
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }
}
