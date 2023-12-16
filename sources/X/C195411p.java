package X;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* renamed from: X.11p  reason: invalid class name and case insensitive filesystem */
public final class C195411p extends AnonymousClass0R6 {
    public final List A00 = AnonymousClass001.A0s();

    public /* bridge */ /* synthetic */ void BNf(C05570Ua r5, int i) {
        C162457s7.A0J(r5, 0);
        C30461mU r3 = ((AnonymousClass1NM) this.A00.get(i)).A01;
        View view = r5.A0H;
        C162457s7.A0K(view, "null cannot be cast to non-null type com.whatsapp.chatinfo.ChatInfoUpcomingEventView");
        AnonymousClass1NN r2 = (AnonymousClass1NN) view;
        r2.setEventName(r3.A04);
        r2.setEventDate(r3.A00);
        r2.setEventLocation(r3);
        r2.setAbbreviatedDate(r3.A00);
        r2.setEventType(AnonymousClass20Q.UPCOMING);
        r2.setOnClickListener(r3);
        r2.setResponseStatus(r3);
    }

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        C162457s7.A0J(viewGroup, 0);
        return new AnonymousClass12D(new AnonymousClass1NJ(C18290x4.A0F(viewGroup)));
    }

    public int A0G() {
        return this.A00.size();
    }
}
