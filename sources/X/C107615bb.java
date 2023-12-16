package X;

import com.whatsapp.R;
import com.whatsapp.conversationslist.ConversationsFragment;

/* renamed from: X.5bb  reason: invalid class name and case insensitive filesystem */
public class C107615bb implements C182318oD {
    public Object A00;
    public final int A01;

    public C107615bb(ConversationsFragment conversationsFragment, int i) {
        this.A01 = i;
        this.A00 = conversationsFragment;
    }

    public final void BqW(boolean z) {
        ConversationsFragment conversationsFragment = (ConversationsFragment) this.A00;
        if (AnonymousClass5N3.A00(conversationsFragment)) {
            AnonymousClass5PO r5 = conversationsFragment.A1Z;
            long j = conversationsFragment.A1N().A00;
            C94924sJ r2 = new C94924sJ();
            r2.A00 = 45;
            Integer A0Z = C18290x4.A0Z();
            r2.A03 = A0Z;
            r2.A04 = Long.valueOf(j);
            r2.A01 = A0Z;
            r5.A00.BhD(r2);
            C107295b4.A00(conversationsFragment.A0R(), conversationsFragment.A1g, C08310eF.A09(conversationsFragment).getString(R.string.f11nameremoved));
        }
    }
}
