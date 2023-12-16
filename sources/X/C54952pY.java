package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: X.2pY  reason: invalid class name and case insensitive filesystem */
public abstract class C54952pY {
    public final AnonymousClass08M A00 = AnonymousClass08M.A01();
    public final AnonymousClass0N6 A01;
    public final C66523Lt A02;
    public final C66423Lj A03;
    public final C50602iS A04;
    public final AnonymousClass4FS A05;
    public final C183538qC A06;

    public void A00() {
        if (this instanceof C32361qH) {
            C32361qH r1 = (C32361qH) this;
            Log.i("PrepareDirectTransferMsgStoreHelper/createAndRunPrepareMessageStoreTask");
            C32331qE r2 = new C32331qE(r1);
            r1.A00 = r2;
            r1.A05.BkL(r2, new Object[0]);
        } else if (this instanceof C32371qI) {
            C32371qI r0 = (C32371qI) this;
            r0.A05.BkL(new C32341qF(r0), new Object[0]);
        } else {
            C32381qJ r5 = (C32381qJ) this;
            if (r5.A00) {
                C70043Zq r22 = new C70043Zq(r5, 12);
                C70043Zq r12 = new C70043Zq(r5, 13);
                C48502f0 r7 = r5.A09;
                C70333aK r4 = new C70333aK(r7, r12, r22, 47);
                File A0J = AnonymousClass0x7.A0N(r5.A01).A0J();
                ArrayList A0s = AnonymousClass001.A0s();
                for (Object singletonList : C06550Ye.A0A(AnonymousClass22O.A01())) {
                    A0s.addAll(C06550Ye.A09(A0J, Collections.singletonList(singletonList)));
                }
                int A002 = r7.A00(r4, A0s);
                C18260x0.A0w("restore>VerifyMessageStoreHelper/preparemsgstore/backup-keys-count ", AnonymousClass001.A0o(), A002);
                if (A002 != 0) {
                    Log.d("restore>VerifyMessageStoreHelper/preparemsgstore/have-keys/continue");
                    r5.A04.sendEmptyMessageDelayed(1, 32000);
                    return;
                }
            }
            Log.d("restore>VerifyMessageStoreHelper/preparemsgstore/no-keys-to-request/continue");
            r5.A05.BkL(new C32351qG(r5, r5.A0F, r5.A00, r5.A0E), new Object[0]);
        }
    }

    public C54952pY(AnonymousClass0N6 r2, C66523Lt r3, C66423Lj r4, C50602iS r5, AnonymousClass4FS r6, C183538qC r7) {
        this.A05 = r6;
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
        this.A06 = r7;
        this.A04 = r5;
    }
}
