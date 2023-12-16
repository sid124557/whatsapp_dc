package X;

import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.whatsapp.jid.UserJid;

/* renamed from: X.3Ve  reason: invalid class name and case insensitive filesystem */
public final class C68963Ve implements AnonymousClass4GF {
    public final C183538qC A00;
    public final C183538qC A01;

    public void BhW(C624134x r4, C378824k r5) {
        C162457s7.A0J(r4, 0);
        Class<C68963Ve> cls = C68963Ve.class;
        if (AnonymousClass000.A1U(r4.A0A & ZipDecompressor.UNZIP_BUFFER_SIZE, ZipDecompressor.UNZIP_BUFFER_SIZE)) {
            ((C55282q6) this.A01.get()).A02((C64773Ex) this.A00.get(), r4);
        } else {
            AnonymousClass2z0 r1 = r4.A1J;
            if (!(r1.A00 instanceof UserJid)) {
                return;
            }
            if ((r1.A02 || r4.A1W) && r4.A1I != 7 && r4.A0D != 6) {
                ((C55282q6) this.A01.get()).A04(r4);
            } else {
                return;
            }
        }
        if (r5 != null) {
            throw C18260x0.A02(cls);
        }
    }

    public C68963Ve(C183538qC r1, C183538qC r2) {
        C18260x0.A0Q(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
