package X;

import java.util.HashSet;
import java.util.Set;

/* renamed from: X.2bS  reason: invalid class name and case insensitive filesystem */
public class C46332bS {
    public Set A00;
    public final AnonymousClass33p A01;
    public final C28891hw A02;
    public final C56322rn A03;
    public final C72173dI A04;

    public final void A00() {
        HashSet A0K;
        synchronized (this) {
            if (this.A00 == null) {
                long j = AnonymousClass0x2.A0F(this.A01).getLong("first_unseen_joinable_call", 0);
                if (j > 0) {
                    A0K = AnonymousClass0x9.A15(this.A03.A05());
                } else {
                    A0K = AnonymousClass002.A0K();
                }
                this.A00 = A0K;
                StringBuilder A0o = AnonymousClass001.A0o();
                C18260x0.A19("UnseenJoinableCallsBadge/init count:", A0o, A0K);
                C18260x0.A12(" timestamp:", A0o, j);
            }
        }
    }

    public C46332bS(AnonymousClass33p r2, C28891hw r3, C56322rn r4, AnonymousClass4FS r5) {
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = r3;
        this.A04 = C72173dI.A00(r5);
    }
}
