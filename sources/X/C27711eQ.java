package X;

import android.util.Base64;
import java.io.File;

/* renamed from: X.1eQ  reason: invalid class name and case insensitive filesystem */
public class C27711eQ extends AnonymousClass3PA {
    public final C55682qk A00;
    public final AnonymousClass310 A01;

    public C624134x A01(C50972j4 r4, AnonymousClass1ES r5, C624134x r6) {
        C30471mV r0;
        if (!(r6 instanceof C30471mV) || (r0 = (C30471mV) r6) == null) {
            StringBuilder A0o = AnonymousClass001.A0o();
            C624134x.A0T(r6, "Unexpected message type: ", A0o);
            throw AnonymousClass24W.A01(0, A0o.toString());
        }
        AnonymousClass33C r2 = r0.A01;
        if (!(r2 == null || (r5.bitField0_ & 67108864) == 0)) {
            C21191Aw r02 = r5.mediaData_;
            C21191Aw r1 = r02;
            if (r02 == null) {
                r02 = C21191Aw.DEFAULT_INSTANCE;
            }
            if ((r02.bitField0_ & 1) != 0) {
                if (r1 == null) {
                    r1 = C21191Aw.DEFAULT_INSTANCE;
                }
                r2.A0F = AnonymousClass002.A0B(r1.localPath_);
            }
        }
        return r6;
    }

    public void AyB(C52952mJ r5, AnonymousClass1A3 r6, C624134x r7) {
        AnonymousClass33C r0;
        File file;
        C162457s7.A0J(r7, 0);
        C18260x0.A0Q(r6, r5);
        if (r7 instanceof C30471mV) {
            String A17 = r7.A17();
            if (A17 != null) {
                try {
                    Base64.decode(A17, 0);
                } catch (IllegalArgumentException unused) {
                    this.A00.A0A("webquery/invalid hash", false, (String) null);
                    r7.A1d((String) null);
                }
            }
            super.AyB(r5, r6, r7);
            C30471mV r72 = (C30471mV) r7;
            if (r72 != null && (r0 = r72.A01) != null && (file = r0.A0F) != null) {
                String A08 = this.A01.A08(file);
                C162457s7.A0D(A08);
                AnonymousClass197 r3 = (AnonymousClass197) C21191Aw.DEFAULT_INSTANCE.A0G();
                C21191Aw r1 = (C21191Aw) C18320x8.A0C(r3);
                r1.bitField0_ |= 1;
                r1.localPath_ = A08;
                AnonymousClass1ES A0X = C18310x6.A0X(r6);
                C21191Aw r02 = (C21191Aw) r3.A06();
                r02.getClass();
                A0X.mediaData_ = r02;
                A0X.bitField0_ |= 67108864;
                return;
            }
            return;
        }
        throw AnonymousClass24A.A00(0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27711eQ(C55682qk r1, AnonymousClass310 r2, C66383Le r3) {
        super(r3);
        C18260x0.A0V(r1, r2, r3);
        this.A00 = r1;
        this.A01 = r2;
    }
}
