package X;

import java.util.HashSet;
import java.util.List;

/* renamed from: X.1u8  reason: invalid class name and case insensitive filesystem */
public class C34041u8 extends AnonymousClass5ZM {
    public C85094Ex A00;
    public final C56932sn A01;

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        C85094Ex r0 = this.A00;
        if (r0 != null) {
            r0.BXa();
        }
        this.A00 = null;
    }

    /* renamed from: A0G */
    public Void A08(Void... voidArr) {
        AnonymousClass4MC r5 = this.A02;
        if (!r5.isCancelled()) {
            C56932sn r4 = this.A01;
            List A07 = r4.A07();
            if (!r5.isCancelled()) {
                List<C50612iT> A06 = r4.A06();
                if (!r5.isCancelled()) {
                    A0F(new C73293fG(A07, A06));
                    if (!r5.isCancelled()) {
                        List<C50612iT> A09 = r4.A09(new AnonymousClass2IB(this));
                        HashSet A0K = AnonymousClass002.A0K();
                        for (C50612iT r0 : A09) {
                            A0K.add(r0.A0G);
                        }
                        for (C50612iT r3 : A06) {
                            String str = r3.A0G;
                            if (!A0K.contains(str)) {
                                C18260x0.A0r("LoadStickerPickerPacksAsyncTask/doInBackground failed to load pack ", str, AnonymousClass001.A0o());
                                A0F(r3);
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public C34041u8(C56932sn r1) {
        this.A01 = r1;
    }

    public void A0E(Object... objArr) {
        C85094Ex r2;
        if (!C18320x8.A1T(this) && (r2 = this.A00) != null) {
            C73293fG r1 = objArr[0];
            if (r1 instanceof C73293fG) {
                r2.BXZ(r1);
            } else if (r1 instanceof C50612iT) {
                r2.BXY((C50612iT) r1);
            } else if (r1 instanceof String) {
                r2.BXb((String) r1);
            }
        }
    }

    public C34041u8(C56932sn r1, C85094Ex r2) {
        this.A01 = r1;
        this.A00 = r2;
    }
}
