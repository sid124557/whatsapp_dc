package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1ZO  reason: invalid class name */
public final class AnonymousClass1ZO extends AnonymousClass3ZG {
    public Boolean A00;
    public Integer A01;
    public Long A02;
    public String A03;
    public String A04;

    public AnonymousClass1ZO() {
        super(3850, AnonymousClass0x9.A0U(1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(2, this.A03);
        r3.Blb(1, this.A01);
        r3.Blb(3, this.A02);
        r3.Blb(6, this.A04);
        r3.Blb(5, this.A00);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0F(C18270x1.A0D(C18280x3.A0S(), this.A03, A0r), this.A01, A0r), this.A02);
        AnonymousClass3ZG.A0I(A0r, 7);
        A0r.put(C18270x1.A0H(C18290x4.A0d(), this.A04, A0r), this.A00);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamBugReportSession {");
        C57292tP.A00(A0o, "bugReportErrorMessage", this.A03);
        C57292tP.A00(A0o, "bugReportFlowAction", C18270x1.A0T(this.A01));
        C57292tP.A00(A0o, "bugReportMediaCount", this.A02);
        C57292tP.A00(A0o, "submitBugCategory", this.A04);
        return AnonymousClass3ZG.A0G(this.A00, "submitBugContainsTitle", A0o);
    }
}
