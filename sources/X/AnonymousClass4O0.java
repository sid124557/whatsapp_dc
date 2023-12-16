package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.whatsapp.chatinfo.view.custom.BusinessChatInfoLayout;
import com.whatsapp.chatinfo.view.custom.ChatInfoLayoutV2;
import com.whatsapp.chatinfo.view.custom.NewsletterInfoLayout;

/* renamed from: X.4O0  reason: invalid class name */
public abstract class AnonymousClass4O0 extends ViewGroup implements AnonymousClass4GJ {
    public C116855qy A00;

    public void A01() {
        C91494k9 r1 = (C91494k9) this;
        if (r1 instanceof NewsletterInfoLayout) {
            NewsletterInfoLayout newsletterInfoLayout = (NewsletterInfoLayout) r1;
            if (!newsletterInfoLayout.A00) {
                newsletterInfoLayout.A00 = true;
                A00(newsletterInfoLayout, (C111685iW) newsletterInfoLayout.generatedComponent());
            }
        } else if (r1 instanceof BusinessChatInfoLayout) {
            BusinessChatInfoLayout businessChatInfoLayout = (BusinessChatInfoLayout) r1;
            if (!businessChatInfoLayout.A00) {
                businessChatInfoLayout.A00 = true;
                A00(businessChatInfoLayout, (C111685iW) businessChatInfoLayout.generatedComponent());
            }
        } else if (!r1.A00) {
            r1.A00 = true;
            A00((ChatInfoLayoutV2) r1, (C111685iW) r1.generatedComponent());
        }
    }

    public static void A00(ChatInfoLayoutV2 chatInfoLayoutV2, Object obj) {
        C64333Db r1 = ((C88864av) obj).A0K;
        chatInfoLayoutV2.A02 = (C97154xi) r1.A00.AB3.get();
        chatInfoLayoutV2.A0U = (AnonymousClass1VX) r1.A07.get();
        chatInfoLayoutV2.A0T = (AnonymousClass5Y0) r1.A8o.get();
        chatInfoLayoutV2.A0R = (AnonymousClass5ZU) r1.AaA.get();
        chatInfoLayoutV2.A0S = (C620733j) r1.AbU.get();
        chatInfoLayoutV2.A0N = (AnonymousClass64J) r1.AEN.get();
        chatInfoLayoutV2.A06 = (AnonymousClass5UX) r1.A6K.get();
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A00;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public AnonymousClass4O0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01();
    }
}
