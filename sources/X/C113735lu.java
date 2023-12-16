package X;

import java.util.Iterator;

/* renamed from: X.5lu  reason: invalid class name and case insensitive filesystem */
public final class C113735lu implements AnonymousClass664 {
    public final C106995aW A00;
    public final C104115Ps A01;
    public final AnonymousClass5UK A02;
    public final C56982ss A03;

    public String BDW() {
        return "ChatLockDailyCron";
    }

    public void BQV() {
        if (this.A00.A0J) {
            if (((long) this.A03.A03.size()) <= 0) {
                AnonymousClass66R r5 = this.A01.A02;
                if (C18310x6.A0F(r5).getLong("folder_open_count", 0) <= 0 && C18310x6.A0F(r5).getLong("new_add_chat_count", 0) <= 0 && C18310x6.A0F(r5).getLong("new_remove_chat_count", 0) <= 0) {
                    return;
                }
            }
            AnonymousClass5UK r8 = this.A02;
            AnonymousClass4s4 r7 = new AnonymousClass4s4();
            r7.A02 = C86644Kx.A0f(r8.A01.A03);
            C104115Ps r2 = r8.A00;
            AnonymousClass66R r3 = r2.A02;
            r7.A03 = Long.valueOf(AnonymousClass0x2.A0B(C18310x6.A0F(r3), "folder_open_count"));
            r7.A04 = Long.valueOf(AnonymousClass0x2.A0B(C18310x6.A0F(r3), "new_add_chat_count"));
            r7.A05 = Long.valueOf(AnonymousClass0x2.A0B(C18310x6.A0F(r3), "new_remove_chat_count"));
            AnonymousClass33p r22 = r2.A00;
            r7.A00 = Boolean.valueOf(C18280x3.A1W(AnonymousClass0x2.A0F(r22), "lock_folder_hidden"));
            r7.A01 = Boolean.valueOf(C18280x3.A1W(AnonymousClass0x2.A0F(r22), "does_user_have_passcode"));
            r8.A03.BhD(r7);
            Iterator it = AnonymousClass8UF.A0o("folder_chats_count", "folder_open_count", "new_add_chat_count", "new_remove_chat_count").iterator();
            while (it.hasNext()) {
                C18270x1.A0n(C18310x6.A0F(r3), AnonymousClass001.A0m(it));
            }
        }
    }

    public C113735lu(C106995aW r1, C104115Ps r2, AnonymousClass5UK r3, C56982ss r4) {
        C18260x0.A0c(r4, r3, r1, r2);
        this.A03 = r4;
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }
}
