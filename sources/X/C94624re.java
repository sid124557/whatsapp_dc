package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.4re  reason: invalid class name and case insensitive filesystem */
public final class C94624re extends AnonymousClass3ZG {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Integer A04;

    public C94624re() {
        super(3160, AnonymousClass0x9.A0U(1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A00);
        r3.Blb(2, this.A01);
        r3.Blb(3, this.A04);
        r3.Blb(4, this.A02);
        r3.Blb(5, this.A03);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0H(C18270x1.A0G(C18270x1.A0F(C18270x1.A0E(AnonymousClass001.A0f(), this.A00, A0r), this.A01, A0r), this.A04, A0r), this.A02, A0r), this.A03);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamAndroidContactListStartNewChat {");
        C57292tP.A00(A0o, "androidContactListStartNewChatFrequentlyContacted", this.A00);
        C57292tP.A00(A0o, "androidContactListStartNewChatSearch", this.A01);
        C57292tP.A00(A0o, "androidContactListStartNewChatType", C18270x1.A0T(this.A04));
        C57292tP.A00(A0o, "isRecentlyAcceptedInvite", this.A02);
        return AnonymousClass3ZG.A0G(this.A03, "isSuggestedContact", A0o);
    }
}
