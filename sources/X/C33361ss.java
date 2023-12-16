package X;

import com.whatsapp.R;
import com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1ss  reason: invalid class name and case insensitive filesystem */
public final class C33361ss extends AnonymousClass5ZM {
    public final C56932sn A00;
    public final AnonymousClass2IE A01;

    public C33361ss(C56932sn r2, AnonymousClass2IE r3) {
        C162457s7.A0J(r2, 2);
        this.A01 = r3;
        this.A00 = r2;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        C50612iT[] r7 = (C50612iT[]) objArr;
        C162457s7.A0J(r7, 0);
        C626936e.A06(r7);
        C626936e.A0B(AnonymousClass001.A1T(r7.length));
        C50612iT r5 = r7[0];
        List list = r5.A05;
        C162457s7.A0D(list);
        ArrayList A0c = C73783g4.A0c(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass39M A0b = AnonymousClass0x7.A0b(it);
            A0c.add(new C53082mW(A0b, this.A00.A0H(A0b)));
        }
        return new C52012kk(r5, A0c);
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        C52012kk r14 = (C52012kk) obj;
        C162457s7.A0J(r14, 0);
        StickerStorePackPreviewActivity stickerStorePackPreviewActivity = this.A01.A00;
        stickerStorePackPreviewActivity.A0d = false;
        if (stickerStorePackPreviewActivity.A0Q == null) {
            AnonymousClass1VX r4 = stickerStorePackPreviewActivity.A0D;
            C54722pB A02 = stickerStorePackPreviewActivity.A0M.A02();
            AnonymousClass33O r6 = stickerStorePackPreviewActivity.A0J;
            int dimensionPixelSize = stickerStorePackPreviewActivity.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
            int dimensionPixelSize2 = stickerStorePackPreviewActivity.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
            boolean z = stickerStorePackPreviewActivity.A0c;
            AnonymousClass121 r3 = new AnonymousClass121(r4, stickerStorePackPreviewActivity.A0I, r6, stickerStorePackPreviewActivity.A0N, A02, dimensionPixelSize, dimensionPixelSize2, true, z);
            stickerStorePackPreviewActivity.A0Q = r3;
            r3.A05 = stickerStorePackPreviewActivity.A0i;
            stickerStorePackPreviewActivity.A0B.setAdapter(r3);
        }
        AnonymousClass121 r1 = stickerStorePackPreviewActivity.A0Q;
        r1.A04 = r14.A00;
        r1.A06 = r14.A01;
        r1.A05();
        stickerStorePackPreviewActivity.A74();
    }
}
