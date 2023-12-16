package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.4sF  reason: invalid class name and case insensitive filesystem */
public final class C94894sF extends AnonymousClass3ZG {
    public Long A00;
    public Long A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public String A06;
    public String A07;

    public C94894sF() {
        super(3910, AnonymousClass0x9.A0U(1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A00);
        r3.Blb(2, this.A01);
        r3.Blb(3, this.A02);
        r3.Blb(4, this.A03);
        r3.Blb(9, this.A06);
        r3.Blb(5, this.A07);
        r3.Blb(6, this.A04);
        r3.Blb(7, this.A05);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0J(C18270x1.A0I(C18270x1.A0H(C18270x1.A0L(C18270x1.A0G(C18270x1.A0F(C18270x1.A0E(AnonymousClass001.A0f(), this.A00, A0r), this.A01, A0r), this.A02, A0r), this.A03, A0r), this.A06, A0r), this.A07, A0r), this.A04, A0r), this.A05);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamDragAndDropEvent {");
        C57292tP.A00(A0o, "dragDropTime", this.A00);
        C57292tP.A00(A0o, "dragEndedTime", this.A01);
        C57292tP.A00(A0o, "dragEnteredTime", this.A02);
        C57292tP.A00(A0o, "dragExitedTime", this.A03);
        C57292tP.A00(A0o, "dragMediaTypes", this.A06);
        C57292tP.A00(A0o, "dragSessionId", this.A07);
        C57292tP.A00(A0o, "dragStartTime", this.A04);
        return AnonymousClass3ZG.A0G(this.A05, "mediaCount", A0o);
    }
}
