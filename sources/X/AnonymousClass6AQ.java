package X;

import com.whatsapp.conversation.selection.SingleSelectedMessageActivity;
import com.whatsapp.reactions.ReactionsTrayViewModel;
import com.whatsapp.textstatus.AddTextStatusActivity;

/* renamed from: X.6AQ  reason: invalid class name */
public class AnonymousClass6AQ implements C182438oP {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass6AQ(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public final void BRp(C106655Zv r5) {
        if (this.A02 != 0) {
            ((AnonymousClass5S9) this.A00).A01(C86654Ky.A1a(r5));
            ((AddTextStatusActivity) this.A01).A0I.BRo(r5.A00);
            return;
        }
        AnonymousClass5S9 r3 = (AnonymousClass5S9) this.A01;
        boolean A1a = C86654Ky.A1a(r5);
        ReactionsTrayViewModel reactionsTrayViewModel = ((SingleSelectedMessageActivity) this.A00).A0C;
        if (reactionsTrayViewModel == null) {
            throw C18270x1.A0S("reactionsTrayViewModel");
        }
        reactionsTrayViewModel.A0G(C107345b9.A06(r5.A00));
        r3.A01(A1a);
    }
}
