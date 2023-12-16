package X;

import com.whatsapp.stickers.StickerView;

/* renamed from: X.5pT  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C115935pT implements C183108pV {
    public final /* synthetic */ AnonymousClass33C A00;
    public final /* synthetic */ C106145Xu A01;
    public final /* synthetic */ AnonymousClass1nE A02;
    public final /* synthetic */ boolean A03;

    public final void Bcc(boolean z) {
        StickerView stickerView;
        C106145Xu r4 = this.A01;
        AnonymousClass33C r3 = this.A00;
        AnonymousClass1nE r2 = this.A02;
        boolean z2 = this.A03;
        if (!z) {
            r3.A0Z = true;
            r4.A04(r2, z2);
            r4.A00();
            return;
        }
        if (r4.A02 || AnonymousClass320.A00) {
            stickerView = r4.A0F;
            stickerView.A00 = C106145Xu.A0Q;
            stickerView.A07();
        } else {
            stickerView = r4.A0F;
            if (stickerView.A03) {
                stickerView.A07();
            }
            stickerView.A00 = C106145Xu.A0P;
        }
        stickerView.setOnClickListener(r4.A03);
    }

    public /* synthetic */ C115935pT(AnonymousClass33C r1, C106145Xu r2, AnonymousClass1nE r3, boolean z) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
        this.A03 = z;
    }
}
