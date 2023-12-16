package X;

import java.util.List;
import java.util.UUID;

/* renamed from: X.9jv  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C201349jv implements Runnable {
    public final /* synthetic */ C201689kZ A00;
    public final /* synthetic */ AnonymousClass9ZR A01;
    public final /* synthetic */ List A02;
    public final /* synthetic */ UUID A03;
    public final /* synthetic */ boolean A04;

    public final void run() {
        AnonymousClass9ZR r5 = this.A01;
        List list = this.A02;
        boolean z = this.A04;
        UUID uuid = this.A03;
        if (0 < list.size()) {
            list.get(0);
            throw AnonymousClass001.A0g("onError");
        } else if (z) {
            r5.A0T.A02(uuid);
            r5.B1n((AnonymousClass9SG) null);
        }
    }

    public /* synthetic */ C201349jv(C201689kZ r1, AnonymousClass9ZR r2, List list, UUID uuid, boolean z) {
        this.A01 = r2;
        this.A02 = list;
        this.A00 = r1;
        this.A04 = z;
        this.A03 = uuid;
    }
}
