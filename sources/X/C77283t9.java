package X;

import com.whatsapp.chatinfo.EventsActivity;

/* renamed from: X.3t9  reason: invalid class name and case insensitive filesystem */
public final class C77283t9 extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ EventsActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C77283t9(EventsActivity eventsActivity) {
        super(0);
        this.this$0 = eventsActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        EventsActivity eventsActivity = this.this$0;
        C39522Ch r3 = eventsActivity.A01;
        if (r3 != null) {
            Object value = eventsActivity.A05.getValue();
            C162457s7.A0J(value, 1);
            return new AnonymousClass0XL((C17190ui) new AnonymousClass4J4(value, 0, r3), (C15940sD) eventsActivity).A01(AnonymousClass10c.class);
        }
        throw C18270x1.A0S("eventsViewModelFactory");
    }
}
