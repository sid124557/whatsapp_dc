package X;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.3Nc  reason: invalid class name and case insensitive filesystem */
public class C66873Nc implements AnonymousClass4AG, AnonymousClass4AJ, C85364Fy {
    public void AyD(C55032pg r7, C624134x r8) {
        if (r8 instanceof C30841nI) {
            C130546c9 A0G = AnonymousClass1A7.DEFAULT_INSTANCE.A0G();
            for (AnonymousClass33J A01 : Collections.unmodifiableSet(((C30841nI) r8).A00)) {
                AnonymousClass1AH A012 = A01.A01();
                AnonymousClass1A7 r2 = (AnonymousClass1A7) C18320x8.A0C(A0G);
                A012.getClass();
                C188248ya r1 = r2.keyIds_;
                if (!((AnonymousClass8T6) r1).A00) {
                    r1 = C130786cX.A07(r1);
                    r2.keyIds_ = r1;
                }
                r1.add(A012);
            }
            C209419x r22 = (C209419x) AnonymousClass1EM.DEFAULT_INSTANCE.A0G();
            r22.A09(AnonymousClass23O.APP_STATE_SYNC_KEY_REQUEST);
            AnonymousClass1EM A0W = C18310x6.A0W(r22);
            AnonymousClass1A7 r0 = (AnonymousClass1A7) A0G.A06();
            r0.getClass();
            A0W.appStateSyncKeyRequest_ = r0;
            A0W.bitField0_ |= 64;
            r7.A00.A0E((AnonymousClass1EM) r22.A06());
            return;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        throw AnonymousClass001.A0c(AnonymousClass000.A0R(C18310x6.A0c(r8, "Message type is not supported ", A0o), A0o));
    }

    public C624134x BgW(C55962rC r7) {
        if (C385428c.A00(r7) != AnonymousClass23O.APP_STATE_SYNC_KEY_REQUEST) {
            return null;
        }
        C30841nI r5 = new C30841nI(r7.A0D, r7.A05);
        AnonymousClass1A7 r0 = C55962rC.A00(r7).appStateSyncKeyRequest_;
        if (r0 == null) {
            r0 = AnonymousClass1A7.DEFAULT_INSTANCE;
        }
        HashSet A0K = AnonymousClass002.A0K();
        for (AnonymousClass1AH r2 : r0.keyIds_) {
            if ((r2.bitField0_ & 1) != 0) {
                A0K.add(new AnonymousClass33J(r2.keyId_.A07()));
            } else {
                C18260x0.A1Q(AnonymousClass001.A0o(), "FMessageAppStateSyncKeyRequest message missing fields for keyId: ", r2);
            }
        }
        Set set = r5.A00;
        set.clear();
        set.addAll(A0K);
        return r5;
    }
}
