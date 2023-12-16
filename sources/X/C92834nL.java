package X;

import android.content.Context;
import com.whatsapp.R;
import com.whatsapp.conversation.conversationrow.InteractiveMessageButton;
import com.whatsapp.conversation.conversationrow.InteractiveMessageView;

/* renamed from: X.4nL  reason: invalid class name and case insensitive filesystem */
public class C92834nL extends C93194o7 {
    public final C08270df A00;
    public final InteractiveMessageButton A01 = ((InteractiveMessageButton) C06560Yg.A02(this, R.id.button));
    public final InteractiveMessageView A02;

    public C92834nL(Context context, C08270df r6, AnonymousClass677 r7, C30991nZ r8) {
        super(context, r7, r8);
        this.A00 = r6;
        InteractiveMessageView interactiveMessageView = (InteractiveMessageView) C06560Yg.A02(this, R.id.interactive_view);
        this.A02 = interactiveMessageView;
        interactiveMessageView.setLayoutView(r8.A1J.A02 ^ true ? 1 : 0);
        interactiveMessageView.A02(this.A2T, (AnonymousClass5R6) null);
        C624134x r3 = this.A0S;
        this.A02.A03(this, r3);
        this.A01.A00(this.A00, this, this.A0m, r3);
    }

    public void A1H() {
        super.A1H();
        C624134x r3 = this.A0S;
        this.A02.A03(this, r3);
        this.A01.A00(this.A00, this, this.A0m, r3);
    }

    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        throw AnonymousClass001.A0g("onWindowVisibilityChanged");
    }

    public int getCenteredLayoutId() {
        return R.layout.f8nameremoved;
    }

    public int getIncomingLayoutId() {
        return R.layout.f8nameremoved;
    }

    public int getOutgoingLayoutId() {
        return R.layout.f8nameremoved;
    }
}
