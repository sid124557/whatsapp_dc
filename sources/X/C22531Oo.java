package X;

import com.whatsapp.util.Log;

/* renamed from: X.1Oo  reason: invalid class name and case insensitive filesystem */
public class C22531Oo extends C56822sc {
    public final C66663Mh A00;
    public final C50082hb A01;
    public final AnonymousClass33E A02;
    public final C64663Ek A03;
    public final C56612sH A04;
    public final C56982ss A05;

    public final void A0D(AnonymousClass1SU r9) {
        C56982ss r0 = this.A05;
        C95814uZ r5 = r9.A01;
        if (C56982ss.A00(r0, r5) != null) {
            Log.i("clear-chat-handler/clearChat deleteMessagesForRange");
            C50082hb r7 = this.A01;
            boolean z = r9.A02;
            boolean z2 = r9.A03;
            AnonymousClass35N r3 = r9.A00;
            int A002 = AnonymousClass35N.A00(r7.A01.A04(r5, true), r3);
            if (A002 == 2 || A002 == 1) {
                Log.i("DeleteMessagesForRange/clearChat use default service");
                if (z2) {
                    r7.A05.A03(r5, (Long) null);
                }
                C66543Lv r1 = r7.A04;
                r1.A0T(r5, true);
                r1.A0Q(r5, (Long) null, true, z);
                return;
            }
            Log.i("DeleteMessagesForRange/clearChat use deleteMessages");
            r7.A01(r3, r5, z, z2);
        }
    }

    public C22531Oo(C66663Mh r1, C50082hb r2, AnonymousClass33E r3, C64663Ek r4, C56612sH r5, C56982ss r6, C623934v r7) {
        super(r7);
        this.A04 = r5;
        this.A00 = r1;
        this.A05 = r6;
        this.A02 = r3;
        this.A03 = r4;
        this.A01 = r2;
    }
}
