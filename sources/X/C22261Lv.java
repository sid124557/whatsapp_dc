package X;

import java.util.Map;

/* renamed from: X.1Lv  reason: invalid class name and case insensitive filesystem */
public class C22261Lv extends AnonymousClass3CG {
    public final AnonymousClass4E0 A00;

    public C22261Lv(AnonymousClass4E0 r4) {
        super("wa.action.GalaxyInit", "bk.action.wa.extension.GetChatJid", "bk.action.wa.extension.GetMsgKeyId");
        this.A00 = r4;
    }

    public /* bridge */ /* synthetic */ Object B2m(C157967jD r6, C146787Bp r7, C151147Tp r8) {
        C131266dJ r82 = (C131266dJ) r8;
        String str = r7.A00;
        char c = 65535;
        switch (str.hashCode()) {
            case 763389172:
                if (str.equals("wa.action.GalaxyInit")) {
                    c = 0;
                    break;
                }
                break;
            case 1263410359:
                if (str.equals("bk.action.wa.extension.GetChatJid")) {
                    return this.A00.B5N(AnonymousClass8DJ.A01(r82));
                }
                break;
            case 2066585071:
                if (str.equals("bk.action.wa.extension.GetMsgKeyId")) {
                    return this.A00.B9r(AnonymousClass8DJ.A01(r82));
                }
                break;
        }
        if (c == 0) {
            this.A00.BlQ(AnonymousClass8DJ.A01(r82), new AnonymousClass2ZN(r82, r6, this), (Map) r6.A00.get(0));
        }
        return null;
    }
}
