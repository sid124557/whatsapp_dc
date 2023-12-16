package X;

import com.whatsapp.R;
import com.whatsapp.avatar.profilephoto.AvatarProfilePhotoViewModel;
import com.whatsapp.productinfra.avatar.ui.stickers.upsell.AvatarStickerUpsellView;
import com.whatsapp.productinfra.avatar.ui.stickers.upsell.AvatarStickerUpsellViewController;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.6AT  reason: invalid class name */
public class AnonymousClass6AT implements C85174Ff {
    public Object A00;
    public final int A01;

    public AnonymousClass6AT(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BMZ(String str) {
        boolean z;
        if (this.A01 == 0) {
            AvatarProfilePhotoViewModel avatarProfilePhotoViewModel = (AvatarProfilePhotoViewModel) this.A00;
            AnonymousClass5Z8 r0 = (AnonymousClass5Z8) avatarProfilePhotoViewModel.A00.A07();
            int i = 0;
            if (r0 != null) {
                Iterator it = r0.A03.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    }
                    C132086ef r1 = (C132086ef) it.next();
                    if (r1 instanceof C132076ee) {
                        z = ((C132076ee) r1).A01;
                    } else {
                        z = ((C132066ed) r1).A03;
                    }
                    if (z) {
                        break;
                    }
                    i++;
                }
            }
            avatarProfilePhotoViewModel.A0D();
            avatarProfilePhotoViewModel.A0E(i, "avatar_art_update", true);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r2 = (X.C94264qq) r3.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void BN6(java.lang.String r4) {
        /*
            r3 = this;
            int r0 = r3.A01
            int r0 = 1 - r0
            if (r0 != 0) goto L_0x001e
            java.lang.Object r2 = r3.A00
            X.4qq r2 = (X.C94264qq) r2
            X.5Qz r1 = r2.A0A
            if (r1 == 0) goto L_0x001e
            r0 = 1
            r2.A05 = r0
            r0 = 8
            r1.A01(r0)
            int r1 = r2.A00
            r0 = 3
            if (r1 != r0) goto L_0x001e
            r2.A0H(r0)
        L_0x001e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6AT.BN6(java.lang.String):void");
    }

    public void BN7() {
        switch (this.A01) {
            case 0:
                AvatarProfilePhotoViewModel avatarProfilePhotoViewModel = (AvatarProfilePhotoViewModel) this.A00;
                if (!avatarProfilePhotoViewModel.A06.A01()) {
                    avatarProfilePhotoViewModel.A0C.A0H(C141506vg.CLOSE_SCREEN);
                    return;
                }
                return;
            case 1:
                C94264qq r3 = (C94264qq) this.A00;
                if (r3.A05) {
                    C88694ab.A00(r3.A05, R.string.f11nameremoved, 0).A05();
                    r3.A05 = false;
                    return;
                }
                return;
            default:
                return;
        }
    }

    public /* synthetic */ void BN9(String str, Map map) {
    }

    public void BNA(boolean z, boolean z2) {
        boolean z3;
        switch (this.A01) {
            case 0:
                AvatarProfilePhotoViewModel avatarProfilePhotoViewModel = (AvatarProfilePhotoViewModel) this.A00;
                AnonymousClass08M r4 = avatarProfilePhotoViewModel.A00;
                AnonymousClass5Z8 A0R = C86654Ky.A0R(r4);
                int i = 0;
                boolean z4 = A0R.A06;
                AnonymousClass5Z8 r6 = new AnonymousClass5Z8(A0R.A00, A0R.A01, A0R.A03, A0R.A02, z4, true, A0R.A04);
                Iterator it = r6.A03.iterator();
                while (true) {
                    if (it.hasNext()) {
                        C132086ef r1 = (C132086ef) it.next();
                        if (r1 instanceof C132076ee) {
                            z3 = ((C132076ee) r1).A01;
                        } else {
                            z3 = ((C132066ed) r1).A03;
                        }
                        if (!z3) {
                            i++;
                        }
                    } else {
                        i = -1;
                    }
                }
                r4.A0G(r6);
                avatarProfilePhotoViewModel.A0E(i, "avatar_update", true);
                return;
            case 1:
                C94264qq r2 = (C94264qq) this.A00;
                C104445Qz r12 = r2.A0A;
                if (r12 != null) {
                    r12.A01(0);
                    if (z) {
                        r2.A0H(3);
                        return;
                    }
                    return;
                }
                return;
            default:
                AvatarStickerUpsellViewController A002 = ((AvatarStickerUpsellView) this.A00).getViewController();
                C18270x1.A0l(C18270x1.A04(A002.A03.A01), "pref_has_dismissed_sticker_upsell", true);
                A002.A01.setVisibility(8);
                return;
        }
    }

    public /* synthetic */ void BN8(String str) {
    }
}
