package X;

import android.text.TextUtils;
import android.view.View;
import com.whatsapp.conversation.conversationrow.InteractiveMessageView;

/* renamed from: X.39m  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C635039m implements View.OnClickListener {
    public final /* synthetic */ C103955Pb A00;
    public final /* synthetic */ C624134x A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ boolean A04;

    public final void onClick(View view) {
        InteractiveMessageView interactiveMessageView;
        C103955Pb r4 = this.A00;
        String str = this.A02;
        boolean z = this.A04;
        String str2 = this.A03;
        C624134x r3 = this.A01;
        if (!TextUtils.isEmpty(str) || z) {
            interactiveMessageView = r4.A00;
            interactiveMessageView.A0G.A01(str);
        } else {
            C58932w3 r5 = new C58932w3("", str2, "", 2, 0);
            interactiveMessageView = r4.A00;
            interactiveMessageView.A08.A03(interactiveMessageView.getContext(), r3, r5);
        }
        C71333bw.A00(interactiveMessageView.A0H, r4, r3, 31);
    }

    public /* synthetic */ C635039m(C103955Pb r1, C624134x r2, String str, String str2, boolean z) {
        this.A00 = r1;
        this.A02 = str;
        this.A04 = z;
        this.A03 = str2;
        this.A01 = r2;
    }
}
