package X;

import com.whatsapp.stickers.avatars.AvatarStickerOnDemandInstaller$installAvatarStickerSync$1;
import java.io.File;

/* renamed from: X.2hK  reason: invalid class name and case insensitive filesystem */
public final class C49932hK {
    public final C59762xR A00;
    public final C55862r2 A01;
    public final C53062mU A02;
    public final C54512oq A03;
    public final C73853gB A04;

    public final AnonymousClass39M A00(AnonymousClass39M r4) {
        C162457s7.A0J(r4, 0);
        return (AnonymousClass39M) C380725l.A00(this.A04, new AvatarStickerOnDemandInstaller$installAvatarStickerSync$1(r4, this, (C84814Du) null));
    }

    public final void A01(AnonymousClass39M r5) {
        String str = r5.A05;
        if (str != null) {
            C53062mU r3 = this.A02;
            File A002 = r3.A00(new C51042jB(str));
            if (C162457s7.A0P(A002.getAbsolutePath(), r5.A09) && A002.exists()) {
                File A0B = AnonymousClass002.A0B(r5.A09);
                String str2 = r5.A0D;
                if (str2 != null) {
                    File A022 = r3.A01.A02(str2);
                    r3.A00.A0b(A0B, A022);
                    AnonymousClass39M.A01(r5, A022);
                }
                this.A03.A03(C18290x4.A12(r5));
            }
        }
    }

    public C49932hK(C59762xR r2, C55862r2 r3, C53062mU r4, C54512oq r5, C73853gB r6) {
        C18260x0.A0Q(r3, r5);
        C162457s7.A0J(r4, 4);
        this.A01 = r3;
        this.A03 = r5;
        this.A00 = r2;
        this.A02 = r4;
        this.A04 = r6;
    }
}
