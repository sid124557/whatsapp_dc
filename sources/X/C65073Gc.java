package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.Map;

/* renamed from: X.3Gc  reason: invalid class name and case insensitive filesystem */
public class C65073Gc implements AnonymousClass4FW {
    public final C183538qC A00;

    public /* synthetic */ void BRi(C624134x r1) {
    }

    public /* synthetic */ void BVB(C95814uZ r1) {
    }

    public void BWS(C624134x r8, int i) {
        if (i != 29) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("ScheduleCallMessageObserver/onMessageAdded messageType: ");
            C18260x0.A1G(A0o, r8.A1I);
            if (r8 instanceof AnonymousClass1nW) {
                AnonymousClass30F r3 = (AnonymousClass30F) this.A00.get();
                Log.d("scheduled-call/onScheduledCallMessageAdded");
                r3.A0B.execute(new C70143a1(r3, 28, r8));
            } else if (r8 instanceof C30971nX) {
                C30971nX r82 = (C30971nX) r8;
                int i2 = r82.A00;
                String str = r82.A02;
                C95814uZ r32 = r82.A1J.A00;
                C95814uZ A0n = r82.A0n();
                if (TextUtils.isEmpty(str) || r32 == null || A0n == null) {
                    Log.w("ScheduleCallMessageObserver/onMessageAdded FMessageScheduledCallEdit has empty parentMessageId or chatJid or senderJid");
                } else if (i2 == 1) {
                    AnonymousClass30F r2 = (AnonymousClass30F) this.A00.get();
                    Log.d("scheduled-call/onScheduledCallCancelMessageAdded");
                    r2.A0B.execute(new C71603cN(r2, r32, A0n, str, 25));
                }
            }
        }
    }

    public /* synthetic */ void BWW(C624134x r1) {
    }

    public /* synthetic */ void BWY(C624134x r1) {
    }

    public /* synthetic */ void BWf(C95814uZ r1) {
    }

    public /* synthetic */ void BWj(Collection collection) {
    }

    public /* synthetic */ void BX3(C95804uY r1) {
    }

    public /* synthetic */ void BX4(C624134x r1) {
    }

    public /* synthetic */ void BX6(C95804uY r1) {
    }

    public C65073Gc(C183538qC r1) {
        this.A00 = r1;
    }

    public /* synthetic */ void BXI() {
    }

    public /* synthetic */ void BNb(C624134x r1, int i) {
    }

    public /* synthetic */ void BWU(C624134x r1, int i) {
    }

    public /* synthetic */ void BWX(C624134x r1, C624134x r2) {
    }

    public /* synthetic */ void BWe(Collection collection, int i) {
        C381525x.A00(this, collection, i);
    }

    public /* synthetic */ void BWg(Collection collection, Map map) {
    }

    public /* synthetic */ void BWh(C95814uZ r1, Collection collection, boolean z) {
    }

    public /* synthetic */ void BWi(C95814uZ r1, Collection collection, boolean z) {
    }

    public /* synthetic */ void BX5(C95804uY r1, boolean z) {
    }

    public /* synthetic */ void BY8(C624134x r1, C624134x r2) {
    }

    public /* synthetic */ void BY9(C624134x r1, C624134x r2) {
    }
}
