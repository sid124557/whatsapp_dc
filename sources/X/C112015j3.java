package X;

import com.whatsapp.biz.cart.view.fragment.CartFragment;
import com.whatsapp.jid.UserJid;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.5j3  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C112015j3 implements C181868nT {
    public final /* synthetic */ C181718nD A00;
    public final /* synthetic */ C90314h4 A01;
    public final /* synthetic */ CartFragment A02;

    public final void BZF(long j) {
        List A0h;
        C90314h4 r3 = this.A01;
        C181718nD r2 = this.A00;
        CartFragment cartFragment = this.A02;
        String str = ((C132146em) r2.B76(r3.A01())).A00.A02.A0F;
        AnonymousClass4V6 r5 = cartFragment.A0W;
        long j2 = j;
        if (j == 0) {
            AnonymousClass5PC r4 = r5.A0J;
            UserJid userJid = r5.A0R;
            C105145Tt r52 = r4.A0H;
            AnonymousClass5P6 r1 = new AnonymousClass5P6();
            r1.A0A = r52.A02;
            AtomicInteger atomicInteger = r52.A0C;
            AnonymousClass5P6.A05(r1, r52, atomicInteger.get());
            AtomicInteger atomicInteger2 = r52.A0D;
            r1.A09 = AnonymousClass0x9.A0m(atomicInteger2.getAndIncrement());
            AnonymousClass5P6.A02(r1, 30);
            AnonymousClass5P6.A03(r1, 54);
            r1.A06(r4.A00(str));
            r1.A0G = str;
            r1.A00 = userJid;
            r52.A03(r1);
            AnonymousClass08M r0 = r4.A01;
            if (r0 != null && (A0h = C86644Kx.A0h(r0)) != null && A0h.size() == 1 && str.equals(((C152217Ya) C18290x4.A0k(A0h)).A02.A0F)) {
                AnonymousClass5P6 r12 = new AnonymousClass5P6();
                r12.A0A = r52.A02;
                AnonymousClass5P6.A05(r12, r52, atomicInteger.get());
                r12.A09 = AnonymousClass0x9.A0m(atomicInteger2.getAndIncrement());
                AnonymousClass5P6.A02(r12, 31);
                AnonymousClass5P6.A03(r12, 55);
                r12.A06(r4.A00(str));
                r12.A00 = userJid;
                r52.A03(r12);
            }
            C117715sN.A00(r4.A0M, r4, userJid, str, 10);
        } else {
            AnonymousClass5PC r7 = r5.A0J;
            UserJid userJid2 = r5.A0R;
            C105145Tt r22 = r7.A0H;
            AnonymousClass5P6 A002 = AnonymousClass5P6.A00(r22);
            AnonymousClass5P6.A04(A002, r22);
            AnonymousClass5P6.A02(A002, 29);
            AnonymousClass5P6.A03(A002, 53);
            A002.A06(r7.A00(str));
            A002.A0G = str;
            A002.A00 = userJid2;
            A002.A08 = Long.valueOf(j);
            r22.A03(A002);
            r7.A0M.BkM(new C70463aX(r7, userJid2, str, 0, j2));
        }
        int i = 0;
        if (j == 0) {
            i = 4;
        }
        r3.A0A.setVisibility(i);
    }

    public /* synthetic */ C112015j3(C181718nD r1, C90314h4 r2, CartFragment cartFragment) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = cartFragment;
    }
}
