package X;

import android.os.Bundle;
import com.whatsapp.conversation.conversationrow.MessageSelectionViewModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.5gy  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C110745gy implements C16050sO {
    public final /* synthetic */ MessageSelectionViewModel A00;

    public final Bundle Bkk() {
        AnonymousClass5QO r0 = (AnonymousClass5QO) this.A00.A00.A07();
        Bundle A08 = AnonymousClass002.A08();
        if (r0 != null) {
            Collection A002 = r0.A00();
            C162457s7.A0D(A002);
            ArrayList A0c = C73783g4.A0c(A002);
            Iterator it = A002.iterator();
            while (it.hasNext()) {
                A0c.add(C86614Ku.A0h(it));
            }
            C107395bF.A09(A08, A0c);
        }
        return A08;
    }

    public /* synthetic */ C110745gy(MessageSelectionViewModel messageSelectionViewModel) {
        this.A00 = messageSelectionViewModel;
    }
}
