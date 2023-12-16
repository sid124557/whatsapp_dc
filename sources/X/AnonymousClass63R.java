package X;

import com.whatsapp.R;

/* renamed from: X.63R  reason: invalid class name */
public final class AnonymousClass63R extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ C89654ea $activity;
    public final /* synthetic */ AnonymousClass4GQ $threadOpener;
    public final /* synthetic */ AnonymousClass581 $tosType;
    public final /* synthetic */ C105325Um this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass63R(C89654ea r2, AnonymousClass581 r3, C105325Um r4, AnonymousClass4GQ r5) {
        super(1);
        this.this$0 = r4;
        this.$activity = r2;
        this.$threadOpener = r5;
        this.$tosType = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        boolean A1Z = AnonymousClass001.A1Z(obj);
        C105325Um r3 = this.this$0;
        C89654ea r2 = this.$activity;
        if (A1Z) {
            r3.A06(r2, this.$tosType, this.$threadOpener);
        } else {
            r2.Bot(R.string.f11nameremoved);
        }
        return C59022wD.A00;
    }
}
