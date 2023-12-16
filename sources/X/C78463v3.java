package X;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: X.3v3  reason: invalid class name and case insensitive filesystem */
public final class C78463v3 extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ AnonymousClass2RE this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78463v3(AnonymousClass2RE r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        LinkedHashMap A0r = C18320x8.A0r();
        Iterator it = this.this$0.A01.iterator();
        while (it.hasNext()) {
            AnonymousClass3Z6 r0 = (AnonymousClass3Z6) it.next();
            AnonymousClass0x2.A1I(r0.second, A0r, AnonymousClass3Z6.A00(r0));
        }
        return A0r;
    }
}
