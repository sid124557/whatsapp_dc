package X;

import com.whatsapp.stickers.StarOrRemoveFromRecentsStickerDialogFragment;
import java.util.Set;

/* renamed from: X.4IK  reason: invalid class name */
public class AnonymousClass4IK implements AnonymousClass4BM {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass4IK(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public final void BQg(String str) {
        switch (this.A02) {
            case 2:
                ((C56822sc) this.A00).A07((AnonymousClass33W) this.A01);
                return;
            case 3:
                ((C56822sc) this.A00).A06((AnonymousClass33W) this.A01);
                return;
            case 4:
                ((StarOrRemoveFromRecentsStickerDialogFragment) this.A00).A00.A0O((Set) this.A01);
                return;
            default:
                C65193Go r1 = (C65193Go) this.A00;
                AnonymousClass330 r0 = ((AnonymousClass1nE) this.A01).A04;
                if (r0 == null || !r0.A08) {
                    C65203Gp r2 = r1.A0B;
                    if (r2.A0c.A00("removeRecentSticker") != null && r2.A0Q()) {
                        C55392qH r22 = r2.A0N;
                        StringBuilder A0o = AnonymousClass001.A0o();
                        A0o.append("[\"removeRecentSticker\",\"");
                        A0o.append(str);
                        r22.A03(AnonymousClass000.A0X("\"]", A0o));
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
