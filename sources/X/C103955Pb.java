package X;

import android.content.Context;
import android.text.TextUtils;
import com.whatsapp.WaTextView;
import com.whatsapp.conversation.conversationrow.InteractiveMessageView;

/* renamed from: X.5Pb  reason: invalid class name and case insensitive filesystem */
public class C103955Pb {
    public final /* synthetic */ InteractiveMessageView A00;
    public final /* synthetic */ C624134x A01;

    public C103955Pb(InteractiveMessageView interactiveMessageView, C624134x r2) {
        this.A00 = interactiveMessageView;
        this.A01 = r2;
    }

    public void A00(String str, int i, boolean z, boolean z2) {
        InteractiveMessageView interactiveMessageView = this.A00;
        interactiveMessageView.A05.setVisibility(AnonymousClass001.A08(z ? 1 : 0));
        if (TextUtils.isEmpty(str)) {
            interactiveMessageView.A05.setText(i);
        } else {
            WaTextView waTextView = interactiveMessageView.A05;
            Context context = interactiveMessageView.getContext();
            Object[] A0L = AnonymousClass002.A0L();
            A0L[0] = str;
            AnonymousClass001.A0y(context, waTextView, A0L, i);
        }
        interactiveMessageView.A05.setSingleLine(z2);
    }
}
