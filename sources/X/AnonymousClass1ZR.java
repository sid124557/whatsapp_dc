package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1ZR  reason: invalid class name */
public final class AnonymousClass1ZR extends AnonymousClass3ZG {
    public Long A00;
    public Long A01;
    public Long A02;
    public Long A03;
    public Long A04;

    public AnonymousClass1ZR() {
        super(3496, AnonymousClass0x9.A0U(1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(4, this.A00);
        r3.Blb(1, this.A01);
        r3.Blb(2, this.A02);
        r3.Blb(3, this.A03);
        r3.Blb(5, this.A04);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0H(C18270x1.A0F(C18270x1.A0E(C18270x1.A0D(C18290x4.A0b(), this.A00, A0r), this.A01, A0r), this.A02, A0r), this.A03, A0r), this.A04);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamCommunityTabAction {");
        C57292tP.A00(A0o, "communityNoActionTabViews", this.A00);
        C57292tP.A00(A0o, "communityTabGroupNavigations", this.A01);
        C57292tP.A00(A0o, "communityTabToHomeViews", this.A02);
        C57292tP.A00(A0o, "communityTabViews", this.A03);
        return AnonymousClass3ZG.A0G(this.A04, "communityTabViewsViaContextMenu", A0o);
    }
}
