package X;

import com.whatsapp.stickers.StickerView;

/* renamed from: X.9dt  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C197799dt implements C183108pV {
    public final /* synthetic */ C196409an A00;
    public final /* synthetic */ AnonymousClass39M A01;
    public final /* synthetic */ Integer A02;

    public final void Bcc(boolean z) {
        C196409an r3 = this.A00;
        AnonymousClass39M r5 = this.A01;
        Integer num = this.A02;
        if (z) {
            C203969ob.A00(r3.A04, r3, 9);
            r3.A0B.setVisibility(8);
            r3.A06.setVisibility(8);
            r3.A0D = r5;
            r3.A0F = num;
            r3.A0E.setContentDescription(AnonymousClass320.A00(r3.A0H, r5));
            StickerView stickerView = r3.A0E;
            stickerView.A03 = true;
            stickerView.A07();
            return;
        }
        r3.A07.setVisibility(8);
        r3.A0B.setVisibility(0);
        r3.A06.setVisibility(0);
    }

    public /* synthetic */ C197799dt(C196409an r1, AnonymousClass39M r2, Integer num) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = num;
    }
}
