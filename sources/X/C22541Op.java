package X;

import com.whatsapp.util.Log;

/* renamed from: X.1Op  reason: invalid class name and case insensitive filesystem */
public class C22541Op extends C56822sc {
    public final C66663Mh A00;
    public final C50082hb A01;
    public final AnonymousClass33E A02;
    public final C64663Ek A03;
    public final C56612sH A04;
    public final C56982ss A05;

    public final void A0D(AnonymousClass1ST r9) {
        C56982ss r0 = this.A05;
        C95814uZ r3 = r9.A01;
        if (r0.A0A(r3, false) != null) {
            Log.i("delete-chat-handler/deleteChat deleteMessagesForRange");
            C50082hb r6 = this.A01;
            boolean z = r9.A02;
            AnonymousClass35N r4 = r9.A00;
            int A002 = AnonymousClass35N.A00(r6.A01.A04(r3, true), r4);
            if (A002 == 2 || A002 == 1) {
                r6.A00.A0L(r3, z, false);
                C48962fl A003 = r6.A02.A00();
                if (!A003.A02) {
                    AnonymousClass4FC r1 = A003.A00;
                    if (r1 != null && !r1.isFinishing()) {
                        if (r3 == null || r3.equals(r1.getChatJid())) {
                            r1.BEg();
                        }
                    }
                } else if (r3 == null || r3.equals(A003.A00().getChatJid())) {
                    A003.A00().BEg();
                }
            } else {
                r6.A01(r4, r3, z, true);
            }
        }
    }

    public C22541Op(C66663Mh r1, C50082hb r2, AnonymousClass33E r3, C64663Ek r4, C56612sH r5, C56982ss r6, C623934v r7) {
        super(r7);
        this.A04 = r5;
        this.A05 = r6;
        this.A00 = r1;
        this.A02 = r3;
        this.A03 = r4;
        this.A01 = r2;
    }
}
