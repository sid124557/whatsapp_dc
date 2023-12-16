package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.6iD  reason: invalid class name and case insensitive filesystem */
public final class C133956iD extends AnonymousClass3ZG {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public String A04;

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A04);
        r3.Blb(3, this.A00);
        r3.Blb(4, this.A01);
        r3.Blb(5, this.A02);
        r3.Blb(6, this.A03);
    }

    public C133956iD() {
        super(4870, AnonymousClass3ZG.A04(), 2, 113760892);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(AnonymousClass001.A0f(), this.A04);
        AnonymousClass3ZG.A0I(A0r, 2);
        A0r.put(C18270x1.A0I(C18270x1.A0H(C18270x1.A0G(C18290x4.A0a(), this.A00, A0r), this.A01, A0r), this.A02, A0r), this.A03);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamMetaVerifiedInteraction {");
        C57292tP.A00(A0o, "businessOwnerJid", this.A04);
        C57292tP.A00(A0o, "metaVerifiedInteractionAction", C18270x1.A0T(this.A00));
        C57292tP.A00(A0o, "metaVerifiedInteractionAssetType", C18270x1.A0T(this.A01));
        C57292tP.A00(A0o, "metaVerifiedInteractionReferral", C18270x1.A0T(this.A02));
        return AnonymousClass3ZG.A0G(C18270x1.A0T(this.A03), "metaVerifiedInteractionSurface", A0o);
    }
}
