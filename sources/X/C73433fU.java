package X;

import java.util.TimerTask;

/* renamed from: X.3fU  reason: invalid class name and case insensitive filesystem */
public class C73433fU extends TimerTask {
    public C59332wk A00;

    public void run() {
        int i;
        C59332wk r3 = this.A00;
        if (r3 instanceof AnonymousClass1FD) {
            AnonymousClass1FD r32 = (AnonymousClass1FD) r3;
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("groupmgr/group_request/timeout/type:");
            C18260x0.A1G(A0o, r32.A00);
            r32.A00 = true;
            r32.A02.A0C(r32.A01, false);
            return;
        }
        AnonymousClass1FE r33 = (AnonymousClass1FE) r3;
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("groupmgr/group_request/timeout/type:");
        int i2 = r33.A00;
        C18260x0.A1G(A0o2, i2);
        r33.A00 = true;
        if (i2 != 30) {
            if (i2 == 91) {
                i = 1005;
            } else if (i2 != 92) {
                switch (i2) {
                    case 15:
                        i = 1002;
                        break;
                    case 16:
                        i = 1001;
                        break;
                    case 17:
                        i = 1007;
                        break;
                }
            } else {
                i = 1006;
            }
            C18290x4.A1C(C66493Lq.A1H, r33.A03, i);
        } else {
            i = 1003;
            C18290x4.A1C(C66493Lq.A1H, r33.A03, i);
        }
        r33.A01.A0C(r33.A03, false);
        r33.A00((Integer) null);
    }

    public C73433fU(C59332wk r1) {
        this.A00 = r1;
    }
}
