package X;

import com.whatsapp.conversation.conversationrow.message.MessageDetailsActivity;
import com.whatsapp.jid.UserJid;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.5sW  reason: invalid class name and case insensitive filesystem */
public class C117805sW implements Comparator {
    public final C117865sc A00;
    public final Map A01;
    public final /* synthetic */ MessageDetailsActivity A02;

    public C117805sW(MessageDetailsActivity messageDetailsActivity) {
        this.A02 = messageDetailsActivity;
        this.A00 = new C117865sc(messageDetailsActivity.A0E, messageDetailsActivity.A00);
        this.A01 = new HashMap(messageDetailsActivity.A0b.size());
    }

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C104545Rj r8 = (C104545Rj) obj;
        C104545Rj r9 = (C104545Rj) obj2;
        int A002 = r8.A00();
        int A003 = r9.A00();
        if (A002 != A003) {
            C995557a A022 = r8.A02();
            C995557a r1 = C995557a.KEEP_IN_CHAT;
            if (r1 == A022) {
                return -1;
            }
            if (r1 == r9.A02() || AnonymousClass358.A00(A002, A003) < 0) {
                return 1;
            }
            return -1;
        }
        UserJid userJid = r8.A01;
        if (userJid != null) {
            UserJid userJid2 = r9.A01;
            if (userJid2 == null) {
                return -1;
            }
            Map map = this.A01;
            AnonymousClass3ZH r3 = (AnonymousClass3ZH) map.get(userJid);
            if (r3 == null) {
                r3 = this.A02.A0C.A0A(userJid);
                map.put(userJid, r3);
            }
            AnonymousClass3ZH r2 = (AnonymousClass3ZH) map.get(userJid2);
            if (r2 == null) {
                r2 = this.A02.A0C.A0A(userJid2);
                map.put(userJid2, r2);
            }
            boolean z = !AnonymousClass3ZH.A0E(r3);
            if (z == (!AnonymousClass3ZH.A0E(r2))) {
                return this.A00.compare(r3, r2);
            }
            if (z) {
                return -1;
            }
            return 1;
        } else if (r9.A01 == null) {
            return 0;
        } else {
            return 1;
        }
    }
}
