package X;

import android.util.Pair;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: X.325  reason: invalid class name */
public final class AnonymousClass325 {
    public static final AnonymousClass8OQ A00;
    public static final AnonymousClass8OQ A01;

    static {
        C160667o6 r1 = new C160667o6();
        r1.put("deleteChat", Arrays.asList(new String[]{"pin_v1", "mute", "clearChat", "deleteChat", "archive", "star", "markChatAsRead", "deleteMessageForMe"}));
        r1.put("clearChat", Arrays.asList(new String[]{"clearChat", "deleteChat", "star", "deleteMessageForMe"}));
        r1.put("archive", Collections.singletonList("pin_v1"));
        r1.put("deleteMessageForMe", Collections.singletonList("star"));
        A00 = r1.build();
        C160667o6 r12 = new C160667o6();
        r12.put("archive", Collections.singletonList("setting_unarchiveChats"));
        A01 = r12.build();
    }

    public static Pair A00(AnonymousClass33W r2) {
        C95814uZ chatJid;
        AnonymousClass2z0 r0;
        if (r2 instanceof C85294Fr) {
            C85294Fr r22 = (C85294Fr) r2;
            chatJid = r22.getChatJid();
            r0 = r22.B9a();
        } else if (r2 instanceof C837649r) {
            chatJid = ((C837649r) r2).getChatJid();
            r0 = null;
        } else {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("SyncdCrossIndexDependencyUtil/getValues: ");
            A0o.append(r2.A09());
            throw AnonymousClass000.A0F(" mutation needs to implement either MessageKeyProvider or ChatJidProvider", A0o);
        }
        return AnonymousClass0x9.A0C(chatJid, r0);
    }
}
