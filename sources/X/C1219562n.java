package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.62n  reason: invalid class name and case insensitive filesystem */
public final class C1219562n extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ List $localBusinesses;
    public final /* synthetic */ AnonymousClass5ZL this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1219562n(AnonymousClass5ZL r2, List list) {
        super(1);
        this.$localBusinesses = list;
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass5T8 r5 = (AnonymousClass5T8) obj;
        C162457s7.A0J(r5, 0);
        List list = this.$localBusinesses;
        boolean z = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (AnonymousClass5ZL.A00((C156137g5) it.next(), r5.A04)) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        return C18320x8.A0V(z);
    }
}
