package X;

/* renamed from: X.3Nd  reason: invalid class name and case insensitive filesystem */
public class C66883Nd implements AnonymousClass4AG, AnonymousClass4AJ, C85364Fy {
    public void AyD(C55032pg r4, C624134x r5) {
        C18270x1.A16(r5, "Unexpected message type ", AnonymousClass001.A0o(), r5 instanceof C30851nJ);
        C209419x r2 = (C209419x) AnonymousClass1EM.DEFAULT_INSTANCE.A0G();
        r2.A09(AnonymousClass23O.APP_STATE_SYNC_KEY_SHARE);
        AnonymousClass1A8 r0 = ((C30851nJ) r5).A00;
        AnonymousClass1EM A0W = C18310x6.A0W(r2);
        r0.getClass();
        A0W.appStateSyncKeyShare_ = r0;
        A0W.bitField0_ |= 32;
        r4.A00.A0E((AnonymousClass1EM) r2.A06());
    }

    public C624134x BgW(C55962rC r5) {
        if (C385428c.A00(r5) != AnonymousClass23O.APP_STATE_SYNC_KEY_SHARE) {
            return null;
        }
        C30851nJ r1 = new C30851nJ(r5.A0D, r5.A05);
        AnonymousClass1A8 r0 = C55962rC.A00(r5).appStateSyncKeyShare_;
        if (r0 == null) {
            r0 = AnonymousClass1A8.DEFAULT_INSTANCE;
        }
        r1.A00 = r0;
        return r1;
    }
}
