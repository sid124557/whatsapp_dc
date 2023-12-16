package X;

import android.util.Pair;
import com.whatsapp.R;
import com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity;
import java.io.File;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1td  reason: invalid class name and case insensitive filesystem */
public class C33751td extends AnonymousClass5ZM {
    public final C56352rq A00;
    public final AnonymousClass48W A01;
    public final C56932sn A02;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        Boolean bool;
        Pair[] pairArr = (Pair[]) objArr;
        C626936e.A06(pairArr);
        boolean z = false;
        C626936e.A0B(AnonymousClass000.A1U(pairArr.length, 1));
        AnonymousClass39M r5 = (AnonymousClass39M) pairArr[0].first;
        C626936e.A06(r5);
        C626936e.A06(r5.A0F);
        C626936e.A06(r5.A0D);
        Object obj = pairArr[0].second;
        A0F(obj);
        C56352rq r6 = this.A00;
        File A022 = r6.A02(r5.A0D);
        if ((r5.A09 == null || r5.A01 == 1) && !A022.exists()) {
            File A023 = r6.A02(r5.A0D);
            C626936e.A06(A023);
            if (this.A02.A04(r5, A023) == null) {
                bool = Boolean.FALSE;
                return AnonymousClass0x9.A0C(bool, obj);
            }
        } else {
            z = true;
        }
        this.A02.A0G(Collections.singleton(r5), z);
        bool = Boolean.TRUE;
        return AnonymousClass0x9.A0C(bool, obj);
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Pair pair = (Pair) obj;
        boolean A1Z = AnonymousClass001.A1Z(pair.first);
        Number number = (Number) pair.second;
        AnonymousClass48W r4 = this.A01;
        if (r4 != null && number != null) {
            int intValue = number.intValue();
            StickerStorePackPreviewActivity stickerStorePackPreviewActivity = (StickerStorePackPreviewActivity) r4;
            if (A1Z) {
                stickerStorePackPreviewActivity.A0Q.A0M(intValue, false);
                List A002 = AnonymousClass121.A00(stickerStorePackPreviewActivity.A0Q);
                if (intValue >= 0 && intValue < A002.size()) {
                    ((C53082mW) A002.get(intValue)).A02 = true;
                    return;
                }
                return;
            }
            stickerStorePackPreviewActivity.A05.A0H(R.string.f11nameremoved, 1);
            stickerStorePackPreviewActivity.A0Q.A0M(intValue, false);
        }
    }

    public /* bridge */ /* synthetic */ void A0E(Object[] objArr) {
        Integer num = ((Integer[]) objArr)[0];
        AnonymousClass48W r1 = this.A01;
        if (r1 != null && num != null) {
            int intValue = num.intValue();
            StickerStorePackPreviewActivity stickerStorePackPreviewActivity = (StickerStorePackPreviewActivity) r1;
            stickerStorePackPreviewActivity.A0Q.A0K();
            stickerStorePackPreviewActivity.A0Q.A0M(intValue, true);
        }
    }

    public C33751td(C56352rq r1, AnonymousClass48W r2, C56932sn r3) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }
}
