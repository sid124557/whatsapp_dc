package X;

import android.view.View;
import com.whatsapp.conversationslist.ConversationsFragment;

/* renamed from: X.5k0  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C112605k0 implements C1225064q {
    public final /* synthetic */ C89644eZ A00;
    public final /* synthetic */ ConversationsFragment A01;

    public final void BaI(AnonymousClass5S5 r7) {
        ConversationsFragment conversationsFragment = this.A01;
        C89644eZ r4 = this.A00;
        AnonymousClass58T r1 = r7.A02;
        if (r1 == AnonymousClass58T.SUCCESS) {
            AnonymousClass4PD r3 = conversationsFragment.A1O;
            r3.setOnClickListener((View.OnClickListener) null);
            ((AnonymousClass5UK) conversationsFragment.A30.get()).A01(0, 1);
            r3.A01(new C118125t2(r4, r3, conversationsFragment));
        } else if (r1 == AnonymousClass58T.ERROR_AUTH_NOT_SETUP) {
            C86624Kv.A0O(conversationsFragment).A05((AnonymousClass5AS) null).Aya();
            C106995aW A0O = C86624Kv.A0O(conversationsFragment);
            C162457s7.A0J(r4, 0);
            A0O.A0B(r4, r7, (AnonymousClass662) null, (C95814uZ) null);
        }
    }

    public /* synthetic */ C112605k0(C89644eZ r1, ConversationsFragment conversationsFragment) {
        this.A01 = conversationsFragment;
        this.A00 = r1;
    }
}
