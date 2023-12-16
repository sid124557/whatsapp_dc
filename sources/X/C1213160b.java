package X;

import com.whatsapp.chatlock.search.ChatLockContactSearchManager$setSearchSource$2$1;
import java.util.concurrent.CancellationException;

/* renamed from: X.60b  reason: invalid class name and case insensitive filesystem */
public final class C1213160b extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ AnonymousClass5KU this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1213160b(AnonymousClass5KU r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str = (String) obj;
        C85474Gj r0 = this.this$0.A01;
        if (r0 != null) {
            r0.AyX((CancellationException) null);
        }
        AnonymousClass0x9.A1I(this.this$0.A02);
        C105095To r02 = this.this$0.A04;
        C162457s7.A0H(str);
        if (C162457s7.A0P(r02.A00(str), C91634kb.A00)) {
            AnonymousClass5KU r3 = this.this$0;
            r3.A01 = C616131n.A02((C85494Gl) null, new ChatLockContactSearchManager$setSearchSource$2$1(r3, str, (C84814Du) null), r3.A06, (AnonymousClass20D) null, 3);
        }
        return C59022wD.A00;
    }
}
