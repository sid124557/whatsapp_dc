package X;

import java.util.List;
import java.util.UUID;

/* renamed from: X.9jf  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C201189jf implements Runnable {
    public final /* synthetic */ C201689kZ A00;
    public final /* synthetic */ AnonymousClass9ZS A01;
    public final /* synthetic */ List A02;
    public final /* synthetic */ UUID A03;

    public final void run() {
        AnonymousClass9ZS r4 = this.A01;
        List list = this.A02;
        UUID uuid = this.A03;
        if (0 < list.size()) {
            list.get(0);
            throw AnonymousClass001.A0g("onError");
        }
        r4.A0e.A02(uuid);
        r4.B1n((AnonymousClass9SG) null);
    }

    public /* synthetic */ C201189jf(C201689kZ r1, AnonymousClass9ZS r2, List list, UUID uuid) {
        this.A01 = r2;
        this.A02 = list;
        this.A00 = r1;
        this.A03 = uuid;
    }
}
