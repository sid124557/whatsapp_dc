package X;

import android.content.Intent;
import com.whatsapp.conversationslist.ConversationsFragment;

/* renamed from: X.5t2  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C118125t2 implements AnonymousClass4GP {
    public final /* synthetic */ C003203q A00;
    public final /* synthetic */ AnonymousClass4PD A01;
    public final /* synthetic */ ConversationsFragment A02;

    public final Object invoke() {
        ConversationsFragment conversationsFragment = this.A02;
        C003203q r0 = this.A00;
        AnonymousClass4PD r3 = this.A01;
        Intent A07 = C18320x8.A07();
        A07.setClassName(r0.getPackageName(), "com.whatsapp.conversationslist.LockedConversationsActivity");
        conversationsFragment.startActivityForResult(A07, 13);
        conversationsFragment.A38 = true;
        C18290x4.A1G(r3, conversationsFragment, 27);
        return C59022wD.A00;
    }

    public /* synthetic */ C118125t2(C003203q r1, AnonymousClass4PD r2, ConversationsFragment conversationsFragment) {
        this.A02 = conversationsFragment;
        this.A00 = r1;
        this.A01 = r2;
    }
}
