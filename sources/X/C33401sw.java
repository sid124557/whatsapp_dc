package X;

import com.whatsapp.jid.GroupJid;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.1sw  reason: invalid class name and case insensitive filesystem */
public class C33401sw extends AnonymousClass5ZM {
    public final C56322rn A00;
    public final GroupJid A01;
    public final WeakReference A02;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        Log.d("FetchJoinableCallLogByGroupJidTask/doInBackground ");
        return this.A00.A03(this.A01);
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        C53312mt r2 = (C53312mt) obj;
        AnonymousClass49R r0 = (AnonymousClass49R) this.A02.get();
        if (r0 != null) {
            r0.BUv(r2);
        }
    }

    public C33401sw(AnonymousClass49R r2, C56322rn r3, GroupJid groupJid) {
        this.A00 = r3;
        this.A02 = AnonymousClass0x9.A14(r2);
        this.A01 = groupJid;
    }
}
