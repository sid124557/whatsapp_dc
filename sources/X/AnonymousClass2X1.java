package X;

import com.whatsapp.stickers.WebpUtils;
import java.io.File;

/* renamed from: X.2X1  reason: invalid class name */
public final class AnonymousClass2X1 {
    public final AnonymousClass2MH A00;

    public AnonymousClass2X1(AnonymousClass2MH r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    public final File A00(AnonymousClass39M r23, File file, boolean z) {
        C84654De r5;
        AnonymousClass2MH r2 = this.A00;
        AnonymousClass39M r0 = r23;
        File file2 = file;
        if (r0.A0J) {
            C64333Db r52 = r2.A01.A00.A01;
            C56612sH A2p = C64333Db.A2p(r52);
            AnonymousClass1VX A4B = C64333Db.A4B(r52);
            C56492s4 A07 = C64333Db.A07(r52);
            r52.AUd.get();
            C55002pd Anb = r52.Anb();
            C69263Wi A04 = C64333Db.A04(r52);
            C55732qp r18 = (C55732qp) r52.AX0.get();
            WebpUtils webpUtils = (WebpUtils) r52.AbM.get();
            C29011i8 r16 = (C29011i8) r52.AU2.get();
            r5 = new AnonymousClass1g2(C64333Db.A01(r52), (C64393Dh) r52.AS1.get(), A04, (C56352rq) r52.ATd.get(), A07, A2p, (C61072zf) r52.AXI.get(), A4B, Anb, (C620133d) r52.AJf.get(), r16, r0, r18, webpUtils, file2, z);
        } else {
            C64333Db r53 = r2.A00.A00.A01;
            C56612sH A2p2 = C64333Db.A2p(r53);
            AnonymousClass1VX A4B2 = C64333Db.A4B(r53);
            C56492s4 A072 = C64333Db.A07(r53);
            r53.AUd.get();
            r5 = new C28221fu(C64333Db.A04(r53), (C56352rq) r53.ATd.get(), A072, A2p2, (C61072zf) r53.AXI.get(), A4B2, r53.Anb(), (C620133d) r53.AJf.get(), (C29011i8) r53.AU2.get(), r0, file2);
        }
        if (AnonymousClass000.A1T(r5.B2B().A01)) {
            return r5.B6y();
        }
        return null;
    }
}
