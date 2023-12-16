package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.biz.catalog.view.CatalogMediaCard;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.5pu  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C116205pu implements C183218pg {
    public final /* synthetic */ C109015dw A00;
    public final /* synthetic */ C111975iz A01;
    public final /* synthetic */ UserJid A02;
    public final /* synthetic */ boolean A03;

    public final void BPD(View view, C149947On r18) {
        C111975iz r3 = this.A01;
        C109015dw r2 = this.A00;
        UserJid userJid = this.A02;
        boolean z = this.A03;
        if (view.getTag(R.id.loaded_image_url) != null) {
            C105405Uu r1 = r3.A0D;
            String str = r2.A0F;
            if (r1.A08((UserJid) null, str) == null) {
                r3.A07.A0H(R.string.f11nameremoved, 0);
                Log.w("CatalogMediaCard/MediaThumbnailOnClick/product no longer exists");
                return;
            }
            CatalogMediaCard catalogMediaCard = r3.A0F;
            C179058iX r0 = catalogMediaCard.A04;
            if (r0 != null) {
                ((C170738Ei) r0).A00.A04(7);
            }
            int thumbnailPixelSize = catalogMediaCard.A09.getThumbnailPixelSize();
            boolean A0a = r3.A08.A0a(userJid);
            String A002 = r3.A09.A00(r3.A00);
            if ("UNBLOCKED".equals(A002)) {
                Context context = r3.A04;
                int i = 5;
                if (r3.A01 == null) {
                    i = 4;
                }
                Integer valueOf = Integer.valueOf(thumbnailPixelSize);
                AnonymousClass5ZY.A03(context, r3.A0B, r3.A0H, userJid, valueOf, valueOf, str, i, A0a, A0a, z);
                return;
            }
            r3.A0H.A02(r3.A04, A002);
        }
    }

    public /* synthetic */ C116205pu(C109015dw r1, C111975iz r2, UserJid userJid, boolean z) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = userJid;
        this.A03 = z;
    }
}
