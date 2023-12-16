package X;

import android.content.Context;
import com.whatsapp.conversation.conversationrow.InteractiveMessageButton;

/* renamed from: X.5kh  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C112985kh implements C182248o6 {
    public final /* synthetic */ InteractiveMessageButton A00;
    public final /* synthetic */ C624134x A01;
    public final /* synthetic */ AnonymousClass39W A02;
    public final /* synthetic */ boolean A03;

    public final void BNy(int i) {
        InteractiveMessageButton interactiveMessageButton = this.A00;
        boolean z = this.A03;
        AnonymousClass39W r0 = this.A02;
        C624134x r4 = this.A01;
        if (!z) {
            int size = r0.A03.A03.size();
            AnonymousClass5PN r1 = interactiveMessageButton.A03;
            Context context = interactiveMessageButton.getContext();
            if (size > 1) {
                r1.A01(context, r4, i);
            } else {
                r1.A00(context, r4);
            }
        }
    }

    public /* synthetic */ C112985kh(InteractiveMessageButton interactiveMessageButton, C624134x r2, AnonymousClass39W r3, boolean z) {
        this.A00 = interactiveMessageButton;
        this.A03 = z;
        this.A02 = r3;
        this.A01 = r2;
    }
}
