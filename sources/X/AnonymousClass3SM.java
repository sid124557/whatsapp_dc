package X;

import com.whatsapp.jid.UserJid;
import java.util.Map;

/* renamed from: X.3SM  reason: invalid class name */
public final class AnonymousClass3SM implements AnonymousClass4DQ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass4FU A01;
    public final /* synthetic */ AnonymousClass2RL A02;
    public final /* synthetic */ C53212mj A03;

    public AnonymousClass3SM(AnonymousClass4FU r1, AnonymousClass2RL r2, C53212mj r3, int i) {
        this.A02 = r2;
        this.A03 = r3;
        this.A00 = i;
        this.A01 = r1;
    }

    public void BdH(Map map) {
        if (map == null) {
            this.A02.A04.A02(this.A03, this.A00);
            return;
        }
        Object obj = map.get("completed");
        if ((obj instanceof Boolean) && AnonymousClass001.A1Z(obj)) {
            AnonymousClass1ZJ.A00(new AnonymousClass1ZJ(), this.A02.A04, this.A03, 8, this.A00);
        }
        Object obj2 = map.get("shouldReport");
        if ((obj2 instanceof Boolean) && AnonymousClass001.A1Z(obj2)) {
            AnonymousClass1VX r4 = this.A02.A03;
            UserJid userJid = this.A03.A02;
            AnonymousClass5XI r0 = new AnonymousClass5XI(r4, userJid, "chat", false);
            r0.A05 = false;
            r0.A08 = false;
            r0.A07 = false;
            r0.A01 = userJid;
            this.A01.Boo(r0.A00());
        }
    }

    public void BSv(C60752z6 r3, Map map) {
        C18260x0.A1P(AnonymousClass001.A0o(), "PhoenixSurveyFlowManager onFailure=", map);
    }
}
