package X;

import android.content.Intent;
import android.view.View;
import com.whatsapp.conversationslist.ConversationsFragment;

/* renamed from: X.540  reason: invalid class name */
public class AnonymousClass540 extends C109665ez {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C94234qR A01;
    public final /* synthetic */ AnonymousClass3ZH A02;

    public AnonymousClass540(C94234qR r1, AnonymousClass3ZH r2, long j) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = j;
    }

    public void A07(View view) {
        C94234qR r3 = this.A01;
        ConversationsFragment conversationsFragment = r3.A06;
        AnonymousClass3ZH r2 = this.A02;
        conversationsFragment.A1c((Intent) null, r2);
        r3.A07.BhD(r3.A03(r2, Long.valueOf(this.A00), 4));
    }
}
