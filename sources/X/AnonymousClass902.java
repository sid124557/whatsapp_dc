package X;

import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.home.ui.HomePlaceholderActivity;

/* renamed from: X.902  reason: invalid class name */
public class AnonymousClass902 extends AnonymousClass5UN {
    public Object A00;
    public final int A01;

    public AnonymousClass902(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void A00() {
        if (this.A01 != 0) {
            super.A00();
        } else {
            ConversationsFragment.A03((ConversationsFragment) this.A00, (String) null);
        }
    }

    public void A01(int i, boolean z) {
        if (1 - this.A01 != 0) {
            super.A01(i, z);
            return;
        }
        HomePlaceholderActivity.HomePlaceholderView homePlaceholderView = (HomePlaceholderActivity.HomePlaceholderView) this.A00;
        homePlaceholderView.A04(i, z);
        homePlaceholderView.A00 = i;
    }

    public void A02(int i, boolean z) {
        if (1 - this.A01 != 0) {
            super.A02(i, z);
            return;
        }
        HomePlaceholderActivity.HomePlaceholderView homePlaceholderView = (HomePlaceholderActivity.HomePlaceholderView) this.A00;
        if (homePlaceholderView.A00 == i) {
            homePlaceholderView.A05(z);
        }
    }

    public void A03(String str) {
        if (this.A01 != 0) {
            super.A03(str);
        } else {
            ConversationsFragment.A03((ConversationsFragment) this.A00, str);
        }
    }
}
