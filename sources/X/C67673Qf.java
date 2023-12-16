package X;

import android.os.Message;
import com.whatsapp.jid.Jid;
import com.whatsapp.messaging.offline.DelayedStanzasFetcher$StanzaFetcher;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3Qf  reason: invalid class name and case insensitive filesystem */
public final class C67673Qf implements AnonymousClass4DA {
    public final AnonymousClass2NU A00;
    public final AnonymousClass1VX A01;
    public final AnonymousClass3CL A02;

    public boolean BFA(Message message, int i) {
        Object obj;
        boolean z;
        C34821vs r1;
        C162457s7.A0J(message, 1);
        if (i != 257) {
            return false;
        }
        Object obj2 = message.obj;
        C162457s7.A0K(obj2, "null cannot be cast to non-null type com.whatsapp.protocol.ProtocolTreeNode");
        AnonymousClass36K r4 = (AnonymousClass36K) obj2;
        AnonymousClass36K.A0N(r4, "ib");
        C626836d.A0F(r4, C135206kI.class, C135206kI.A00, AnonymousClass0x9.A1b());
        try {
            obj = C626836d.A04(r4, C86304Jp.A00(73), new String[]{"thread_metadata"});
        } catch (AnonymousClass24Y unused) {
            obj = null;
        }
        C138956rH r3 = (C138956rH) obj;
        List<C138956rH> A0B = C626836d.A0B(r4, C86304Jp.A00(74), new String[]{"thread_metadata", "item"}, 0, 50);
        C626836d.A0C(r4, new String[]{"thread_metadata"}, 75).get(0);
        if (!(r3 == null || (r1 = (C34821vs) r3.A00) == null)) {
            AnonymousClass66R r8 = this.A02.A00;
            ((DelayedStanzasFetcher$StanzaFetcher) r8.getValue()).A01.set(AnonymousClass001.A1W((C18320x8.A03((Number) r1.A00) > 0 ? 1 : (C18320x8.A03((Number) r1.A00) == 0 ? 0 : -1))));
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("DelayedStanzasManager/onDelayedNotifications pullNeeded=");
            C18260x0.A1V(A0o, ((DelayedStanzasFetcher$StanzaFetcher) r8.getValue()).A01.get());
        }
        if (!this.A01.A0Y(C58422vE.A01, 3702) || !C18310x6.A1X(A0B)) {
            return true;
        }
        AnonymousClass2NU r7 = this.A00;
        if (A0B.isEmpty()) {
            return true;
        }
        HashMap A0t = AnonymousClass001.A0t();
        for (C138956rH r12 : A0B) {
            Jid jid = (Jid) r12.A00;
            C162457s7.A0K(jid, "null cannot be cast to non-null type com.whatsapp.jid.ChatJid");
            C95814uZ r5 = (C95814uZ) jid;
            C95814uZ BLb = r7.A02.BLb(r5);
            if (BLb != null) {
                r5 = BLb;
            }
            AnonymousClass0x2.A1J(r5, A0t, C18310x6.A0B(r12.A01) * 1000);
        }
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append(AnonymousClass0x7.A0A("PresortingChatsManager/onThreadMetadataItems: ", A0o2, A0t));
        C18260x0.A1L(A0o2, " conversations");
        AnonymousClass314 r13 = r7.A00;
        Log.d("ConversationsManager/setThreadMetadata");
        AnonymousClass3ZV r6 = r13.A01;
        synchronized (r6) {
            if (!r6.A00) {
                r6.A00 = true;
                ArrayList A0s = AnonymousClass001.A0s();
                ArrayList arrayList = r6.A01;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C51482jt r11 = (C51482jt) it.next();
                    C95814uZ r10 = r11.A01;
                    Long l = (Long) A0t.get(r10);
                    if (l != null) {
                        long longValue = l.longValue();
                        long j = r11.A00;
                        if (longValue > j) {
                            r11 = new C51482jt(r10, longValue);
                        } else if (r10 != r10) {
                            r11 = new C51482jt(r10, j);
                        }
                    }
                    A0s.add(r11);
                }
                Collections.sort(A0s, r6.A02);
                HashMap hashMap = r6.A03;
                hashMap.clear();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    C51482jt r0 = (C51482jt) it2.next();
                    AnonymousClass0x2.A1J(r0.A01, hashMap, r0.A00);
                }
                if (!arrayList.equals(A0s)) {
                    Log.i("SortedConversationsList/updateFromThreadMetadata setting timestamps from metadata");
                    arrayList.clear();
                    arrayList.addAll(A0s);
                    z = true;
                }
            }
            z = false;
        }
        if (!z) {
            return true;
        }
        r7.A01.A08();
        return true;
    }

    public C67673Qf(AnonymousClass2NU r1, AnonymousClass1VX r2, AnonymousClass3CL r3) {
        C18260x0.A0V(r2, r3, r1);
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }

    public int[] B81() {
        int[] A0E = C18330xA.A0E();
        A0E[0] = 257;
        return A0E;
    }
}
