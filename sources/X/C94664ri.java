package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.4ri  reason: invalid class name and case insensitive filesystem */
public final class C94664ri extends AnonymousClass3ZG {
    public Boolean A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Long A04;

    public C94664ri() {
        super(4212, AnonymousClass0x9.A0U(1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(3, this.A01);
        r3.Blb(4, this.A04);
        r3.Blb(5, this.A02);
        r3.Blb(1, this.A03);
        r3.Blb(2, this.A00);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0E(C18270x1.A0D(C18270x1.A0H(C18270x1.A0G(C18290x4.A0a(), this.A01, A0r), this.A04, A0r), this.A02, A0r), this.A03, A0r), this.A00);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamChatLockAction {");
        C57292tP.A00(A0o, "actionEntryPoint", C18270x1.A0T(this.A01));
        C57292tP.A00(A0o, "actionFolderChatsCount", this.A04);
        C57292tP.A00(A0o, "authType", C18270x1.A0T(this.A02));
        C57292tP.A00(A0o, "chatLockActionType", C18270x1.A0T(this.A03));
        return AnonymousClass3ZG.A0G(this.A00, "chatLockIsGroup", A0o);
    }
}
