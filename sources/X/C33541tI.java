package X;

import com.whatsapp.jid.UserJid;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.ref.WeakReference;

/* renamed from: X.1tI  reason: invalid class name and case insensitive filesystem */
public final class C33541tI extends AnonymousClass5ZM {
    public final AnonymousClass1VX A00;
    public final C61132zl A01;
    public final AnonymousClass1kA A02;
    public final UserJid A03;
    public final C45682aP A04;
    public final WeakReference A05;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        C53212mj r1;
        try {
            UserJid userJid = this.A03;
            AnonymousClass3Y6 r6 = new AnonymousClass3Y6(userJid);
            C833748d A002 = this.A04.A00.A00(r6, "whatsapp_biz_integrity_survey_notification_load", 11389);
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("SurveyConversationBanner/GetQuickPromotionsTask/doInBackground chooseBestPromotion qp.isNotNull=");
            boolean z = true;
            A0o.append(AnonymousClass000.A1W(A002));
            A0o.append(" filterContext.surveyInfo.isNotNull=");
            if (r6.A00 == null) {
                z = false;
            }
            AnonymousClass25X.A00(this.A00, this.A01, this.A02, userJid, C18300x5.A0m(A0o, z));
            if (A002 != null) {
                if (r6.A00 == null) {
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    A0o2.append("SurveyConversationBanner/canShow surveyInfo is null when qp=");
                    C18260x0.A1K(A0o2, ((AnonymousClass3YL) A002).A0F);
                }
                r1 = r6.A00;
            } else {
                r1 = null;
            }
            return new C51492ju(r1, A002);
        } catch (Exception e) {
            C61132zl r3 = this.A01;
            StringBuilder A0o3 = AnonymousClass001.A0o();
            A0o3.append("SurveyConversationBanner/GetQuickPromotionsTask/doInBackground exception=");
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            e.printStackTrace(printWriter);
            printWriter.flush();
            r3.A03(AnonymousClass000.A0X(C18290x4.A0o(stringWriter), A0o3));
            return new C51492ju((C53212mj) null, (C833748d) null);
        }
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        C833748d r3;
        C53212mj r1;
        AnonymousClass1PN r6;
        C51492ju r8 = (C51492ju) obj;
        if (r8 != null && (r3 = r8.A00) != null && (r1 = r8.A01) != null && (r6 = (AnonymousClass1PN) this.A05.get()) != null) {
            r6.A02 = r3;
            r6.A01 = r1;
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("SurveyConversationBanner/updateQuickPromotionsResult qp.IsNull=");
            A0o.append(AnonymousClass000.A1X(r3));
            String A0b = AnonymousClass000.A0b(" surveyInfo.isNull=", A0o, false);
            AnonymousClass25X.A00(r6.A05, r6.A07, r6.A08, r6.A09, A0b);
            if (r6.A02 == null || r6.A01 == null) {
                r6.A05(true);
            } else {
                r6.A03();
            }
        }
    }

    public C33541tI(AnonymousClass1VX r1, C61132zl r2, AnonymousClass1kA r3, UserJid userJid, C45682aP r5, WeakReference weakReference) {
        this.A03 = userJid;
        this.A04 = r5;
        this.A05 = weakReference;
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }
}
