package X;

import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import java.io.PrintWriter;
import java.io.StringWriter;

/* renamed from: X.1PN  reason: invalid class name */
public final class AnonymousClass1PN extends C117035rH {
    public View A00;
    public C53212mj A01;
    public C833748d A02;
    public final ViewGroup A03;
    public final AnonymousClass67A A04;
    public final AnonymousClass1VX A05;
    public final C45302Zm A06;
    public final C61132zl A07;
    public final AnonymousClass1kA A08;
    public final UserJid A09;
    public final AnonymousClass4FS A0A;
    public final C45682aP A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1PN(ViewGroup viewGroup, AnonymousClass67A r4, AnonymousClass1VX r5, C45302Zm r6, C61132zl r7, AnonymousClass1kA r8, UserJid userJid, AnonymousClass4FS r10, C45682aP r11) {
        super(r4, 60);
        C18260x0.A0b(r4, viewGroup, r11, 2);
        C18260x0.A0g(r6, r10, r7, r5, r8);
        this.A09 = userJid;
        this.A04 = r4;
        this.A03 = viewGroup;
        this.A0B = r11;
        this.A06 = r6;
        this.A0A = r10;
        this.A07 = r7;
        this.A05 = r5;
        this.A08 = r8;
    }

    public void A02() {
        C53212mj r3;
        try {
            if (this.A00 == null) {
                this.A00 = this.A04.getActivity().getLayoutInflater().inflate(R.layout.f8nameremoved, this.A03).findViewById(R.id.survey_conversation_banner);
            }
            if (this.A02 != null) {
                ViewGroup viewGroup = this.A03;
                View A0M = C18290x4.A0M(viewGroup, R.id.survey_conversation_banner_start_button);
                C53212mj r2 = this.A01;
                if (r2 != null) {
                    A0M.setOnClickListener(new C109475eg(this, 3, r2));
                }
                C18290x4.A0M(viewGroup, R.id.survey_conversation_banner_dismiss_button).setOnClickListener(new C109345eT(this, 8));
            }
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("SurveyConversationBanner/show qp.IsNull=");
            boolean z = true;
            int i = 0;
            A0o.append(AnonymousClass000.A1X(this.A02));
            A0o.append(" surveyInfo.isNull=");
            if (this.A01 != null) {
                z = false;
            }
            String A0m = C18300x5.A0m(A0o, z);
            C61132zl r6 = this.A07;
            AnonymousClass1kA r1 = this.A08;
            UserJid userJid = this.A09;
            AnonymousClass1VX r5 = this.A05;
            AnonymousClass25X.A00(r5, r6, r1, userJid, A0m);
            if (this.A02 == null || (r3 = this.A01) == null) {
                View view = this.A00;
                if (view != null) {
                    view.setVisibility(8);
                    return;
                }
                return;
            }
            AnonymousClass1ZJ.A00(new AnonymousClass1ZJ(), r6, r3, 2, 3);
            C833748d r32 = this.A02;
            if (r32 != null) {
                this.A0B.A00(C373021s.IMPRESSION, r32, 11389);
            }
            View view2 = this.A00;
            if (view2 != null) {
                if (!r5.A0Y(C58422vE.A02, 4470)) {
                    i = 8;
                }
                view2.setVisibility(i);
            }
        } catch (Exception e) {
            C61132zl r33 = this.A07;
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("SurveyConversationBanner/show exception=");
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            e.printStackTrace(printWriter);
            printWriter.flush();
            r33.A03(AnonymousClass000.A0X(C18290x4.A0o(stringWriter), A0o2));
        }
    }

    public void A04(C1225964z r2, boolean z) {
        C18270x1.A0p(this.A00);
    }

    public boolean A06() {
        C61132zl r3 = this.A07;
        r3.A03("SurveyConversationBanner/canShow without jidFilter");
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("SurveyConversationBanner/canShow qp.IsNull=");
        A0o.append(AnonymousClass000.A1X(this.A02));
        A0o.append(" surveyInfo.isNull=");
        String A0m = C18300x5.A0m(A0o, AnonymousClass000.A1X(this.A01));
        AnonymousClass1kA r4 = this.A08;
        UserJid userJid = this.A09;
        AnonymousClass1VX r2 = this.A05;
        AnonymousClass25X.A00(r2, r3, r4, userJid, A0m);
        if (this.A02 != null && this.A01 != null) {
            return true;
        }
        C18270x1.A0w(new C33541tI(r2, r3, r4, userJid, this.A0B, AnonymousClass0x9.A14(this)), this.A0A);
        return false;
    }

    public View A01() {
        return this.A00;
    }
}
