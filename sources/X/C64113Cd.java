package X;

import com.whatsapp.WaTextView;
import com.whatsapp.conversation.conversationrow.messagerating.MessageRatingFragment;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.3Cd  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C64113Cd implements C181638n5 {
    public final /* synthetic */ WaTextView A00;
    public final /* synthetic */ MessageRatingFragment A01;
    public final /* synthetic */ WDSButton A02;

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        if (r6 <= 0) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void BZN(int r6, boolean r7) {
        /*
            r5 = this;
            com.whatsapp.conversation.conversationrow.messagerating.MessageRatingFragment r0 = r5.A01
            com.whatsapp.wds.components.button.WDSButton r1 = r5.A02
            com.whatsapp.WaTextView r4 = r5.A00
            r3 = 1
            r2 = 0
            if (r7 != 0) goto L_0x0014
            com.whatsapp.conversation.conversationrow.messagerating.MessageRatingViewModel r0 = r0.A02
            X.08M r0 = r0.A01
            java.lang.Object r0 = r0.A07()
            if (r0 != 0) goto L_0x0017
        L_0x0014:
            r0 = 1
            if (r6 > 0) goto L_0x0018
        L_0x0017:
            r0 = 0
        L_0x0018:
            r1.setEnabled(r0)
            if (r6 <= 0) goto L_0x002c
            int[] r1 = com.whatsapp.conversation.conversationrow.messagerating.MessageRatingFragment.A05
            int r0 = r1.length
            if (r6 > r0) goto L_0x002c
            int r6 = r6 - r3
            r0 = r1[r6]
            r4.setText(r0)
            r4.setVisibility(r2)
            return
        L_0x002c:
            r0 = 4
            r4.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64113Cd.BZN(int, boolean):void");
    }

    public /* synthetic */ C64113Cd(WaTextView waTextView, MessageRatingFragment messageRatingFragment, WDSButton wDSButton) {
        this.A01 = messageRatingFragment;
        this.A02 = wDSButton;
        this.A00 = waTextView;
    }
}
