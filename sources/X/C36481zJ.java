package X;

import com.whatsapp.jid.UserJid;
import java.util.Set;

/* renamed from: X.1zJ  reason: invalid class name and case insensitive filesystem */
public abstract class C36481zJ extends C30681mq {
    public final C56982ss A00;
    public final C61092zh A01;
    public final C31891p1 A02;
    public final C56832sd A03;

    public static int A09(C36481zJ r0, C27991fJ r1, C31581oW r2, Set set) {
        r2.A01 = r0.A01.A02(r1);
        Set set2 = r2.A03;
        set2.clear();
        set2.addAll(set);
        int size = set.size();
        if (size < 0) {
            return 0;
        }
        return size;
    }

    public static void A0A(AnonymousClass1ES r1, C624134x r2) {
        r2.A1J(UserJid.Companion.A0E(r1.participant_));
    }

    public C36481zJ(C55682qk r1, C56982ss r2, C61092zh r3, C31891p1 r4, C56832sd r5) {
        super(r1);
        this.A02 = r4;
        this.A00 = r2;
        this.A01 = r3;
        this.A03 = r5;
    }
}
