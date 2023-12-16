package X;

import java.util.List;

/* renamed from: X.0ku  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C12060ku implements Runnable {
    public final /* synthetic */ AnonymousClass0UM A00;
    public final /* synthetic */ List A01;

    public final void run() {
        List<C15360rD> list = this.A01;
        AnonymousClass0UM r4 = this.A00;
        for (C15360rD r2 : list) {
            Object obj = r4.A00;
            C09060fa r22 = (C09060fa) r2;
            r22.A01 = obj;
            r22.A01(r22.A00, obj);
        }
    }

    public /* synthetic */ C12060ku(AnonymousClass0UM r1, List list) {
        this.A01 = list;
        this.A00 = r1;
    }
}
