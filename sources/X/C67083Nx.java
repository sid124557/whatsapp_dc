package X;

/* renamed from: X.3Nx  reason: invalid class name and case insensitive filesystem */
public class C67083Nx implements AnonymousClass4AG, AnonymousClass4AJ, C85364Fy {
    public final C106685Zz A00;

    public void AyD(C55032pg r3, C624134x r4) {
        if (!(r4 instanceof C31931p6)) {
            StringBuilder A0o = AnonymousClass001.A0o();
            C624134x.A0T(r4, "FMessageViewOnceTextProtobuf not support message:", A0o);
            throw C18310x6.A0d(A0o);
        }
    }

    public C624134x BgW(C55962rC r6) {
        AnonymousClass1EU r1 = r6.A0B;
        if ((r1.bitField0_ & 32) == 0) {
            return null;
        }
        AnonymousClass1EC r2 = r1.extendedTextMessage_;
        AnonymousClass1EC r4 = r2;
        if (r2 == null) {
            r2 = AnonymousClass1EC.DEFAULT_INSTANCE;
        }
        if ((r2.bitField0_ & 8388608) == 0 || !r2.viewOnce_) {
            return null;
        }
        if (r4 == null) {
            r4 = AnonymousClass1EC.DEFAULT_INSTANCE;
        }
        C626936e.A06(r4);
        C31931p6 r12 = new C31931p6(r6.A0D, r6.A05);
        AnonymousClass3OJ.A00(this.A00, r4, r12);
        r12.A03 = r6.A0G;
        return r12;
    }

    public C67083Nx(C106685Zz r1) {
        this.A00 = r1;
    }
}
