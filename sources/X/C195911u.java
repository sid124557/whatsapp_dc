package X;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* renamed from: X.11u  reason: invalid class name and case insensitive filesystem */
public final class C195911u extends AnonymousClass0R6 {
    public final List A00 = AnonymousClass001.A0s();

    public void BNf(C05570Ua r6, int i) {
        C162457s7.A0J(r6, 0);
        if (r6 instanceof AnonymousClass12L) {
            List list = this.A00;
            Object obj = list.get(i);
            C162457s7.A0K(obj, "null cannot be cast to non-null type com.whatsapp.chatinfo.ChatInfoEventUtils.Item.EventItem");
            C30461mU r4 = ((AnonymousClass1NM) obj).A01;
            Object obj2 = list.get(i);
            C162457s7.A0K(obj2, "null cannot be cast to non-null type com.whatsapp.chatinfo.ChatInfoEventUtils.Item.EventItem");
            AnonymousClass20Q r3 = ((AnonymousClass1NM) obj2).A00;
            View view = r6.A0H;
            C162457s7.A0K(view, "null cannot be cast to non-null type com.whatsapp.chatinfo.EventView");
            AnonymousClass1NN r2 = (AnonymousClass1NN) view;
            r2.setEventName(r4.A04);
            r2.setEventDate(r4.A00);
            r2.setEventLocation(r4);
            r2.setAbbreviatedDate(r4.A00);
            r2.setEventType(r3);
            r2.setOnClickListener(r4);
            r2.setResponseStatus(r4);
        } else if (r6 instanceof AnonymousClass12N) {
            Object obj3 = this.A00.get(i);
            C162457s7.A0K(obj3, "null cannot be cast to non-null type com.whatsapp.chatinfo.ChatInfoEventUtils.Item.HeaderItem");
            String str = ((AnonymousClass1NL) obj3).A00;
            View view2 = r6.A0H;
            C162457s7.A0K(view2, "null cannot be cast to non-null type com.whatsapp.events.EventResponseHeaderView");
            ((C19220z0) view2).A00.setText(str);
        }
    }

    public C05570Ua BQR(ViewGroup viewGroup, int i) {
        C162457s7.A0J(viewGroup, 0);
        if (i == 1) {
            return new AnonymousClass12L(C18290x4.A0F(viewGroup));
        }
        if (i == 2) {
            return new AnonymousClass12N(C18290x4.A0F(viewGroup));
        }
        return new AnonymousClass12E(viewGroup);
    }

    public int A0G() {
        return this.A00.size();
    }

    public int getItemViewType(int i) {
        C370120p r0;
        AnonymousClass2FD r02 = (AnonymousClass2FD) C73723fy.A06(this.A00, i);
        if (r02 != null) {
            r0 = r02.A00;
        } else {
            r0 = C370120p.NONE;
        }
        return r0.ordinal();
    }
}
