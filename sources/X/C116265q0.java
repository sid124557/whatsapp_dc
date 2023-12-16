package X;

import androidx.fragment.app.DialogFragment;
import com.whatsapp.conversationslist.ConversationsFragment;
import java.util.Set;

/* renamed from: X.5q0  reason: invalid class name and case insensitive filesystem */
public class C116265q0 implements AnonymousClass66M {
    public final /* synthetic */ C08270df A00;
    public final /* synthetic */ C110365g7 A01;

    public C116265q0(C08270df r1, C110365g7 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void Azp() {
        C08270df r4 = this.A00;
        ConversationsFragment conversationsFragment = this.A01.A0N;
        conversationsFragment.A2u.BkL(new C993855n((DialogFragment) new ConversationsFragment.BulkDeleteConversationDialogFragment(), r4, conversationsFragment.A1z, (Set) conversationsFragment.A33, true), AnonymousClass4L0.A0U());
    }

    public void BEo(boolean z) {
        C08270df r4 = this.A00;
        ConversationsFragment conversationsFragment = this.A01.A0N;
        conversationsFragment.A2u.BkL(new C993855n((DialogFragment) new ConversationsFragment.BulkDeleteConversationDialogFragment(), r4, conversationsFragment.A1z, (Set) conversationsFragment.A33, z), AnonymousClass4L0.A0U());
    }
}
