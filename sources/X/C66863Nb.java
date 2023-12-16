package X;

import java.util.Collections;
import java.util.Set;

/* renamed from: X.3Nb  reason: invalid class name and case insensitive filesystem */
public class C66863Nb implements AnonymousClass4AG, AnonymousClass4AJ, C85364Fy {
    public void AyD(C55032pg r6, C624134x r7) {
        if (r7 instanceof C30861nK) {
            C30861nK r72 = (C30861nK) r7;
            C130546c9 A0G = AnonymousClass1B9.DEFAULT_INSTANCE.A0G();
            Set set = r72.A01;
            AnonymousClass1B9 r2 = (AnonymousClass1B9) C18320x8.A0C(A0G);
            C188248ya r1 = r2.collectionNames_;
            if (!((AnonymousClass8T6) r1).A00) {
                r1 = C130786cX.A07(r1);
                r2.collectionNames_ = r1;
            }
            C170208Ch.A05(set, r1);
            long j = r72.A00;
            AnonymousClass1B9 r12 = (AnonymousClass1B9) C18320x8.A0C(A0G);
            r12.bitField0_ |= 1;
            r12.timestamp_ = j;
            C209419x r22 = (C209419x) AnonymousClass1EM.DEFAULT_INSTANCE.A0G();
            r22.A09(AnonymousClass23O.APP_STATE_FATAL_EXCEPTION_NOTIFICATION);
            AnonymousClass1EM A0W = C18310x6.A0W(r22);
            AnonymousClass1B9 r0 = (AnonymousClass1B9) A0G.A06();
            r0.getClass();
            A0W.appStateFatalExceptionNotification_ = r0;
            A0W.bitField0_ |= 256;
            r6.A00.A0E((AnonymousClass1EM) r22.A06());
            return;
        }
        throw AnonymousClass001.A0c("FMessageReactionSerializer/not supported message");
    }

    public C624134x BgW(C55962rC r9) {
        if (C385428c.A00(r9) != AnonymousClass23O.APP_STATE_FATAL_EXCEPTION_NOTIFICATION) {
            return null;
        }
        AnonymousClass1B9 r1 = C55962rC.A00(r9).appStateFatalExceptionNotification_;
        if (r1 == null) {
            r1 = AnonymousClass1B9.DEFAULT_INSTANCE;
        }
        return new C30861nK(r9.A0D, Collections.unmodifiableSet(AnonymousClass0x9.A15(r1.collectionNames_)), r9.A05, r1.timestamp_);
    }
}
