package X;

import com.whatsapp.util.Log;

/* renamed from: X.2vx  reason: invalid class name and case insensitive filesystem */
public class C58872vx {
    public final C66663Mh A00;
    public final C56492s4 A01;
    public final C56612sH A02;
    public final C61072zf A03;
    public final AnonymousClass1VX A04;
    public final C48092eK A05;
    public final C55002pd A06;
    public final C29011i8 A07;

    public C58872vx(C66663Mh r1, C56492s4 r2, C56612sH r3, C61072zf r4, AnonymousClass1VX r5, C48092eK r6, C55002pd r7, C29011i8 r8) {
        this.A02 = r3;
        this.A04 = r5;
        this.A01 = r2;
        this.A00 = r1;
        this.A03 = r4;
        this.A07 = r8;
        this.A06 = r7;
        this.A05 = r6;
    }

    public static final void A00(AnonymousClass1ft r4, String str, boolean z) {
        int i = r4.A02().A00.A01;
        if (!AnonymousClass000.A1T(i)) {
            Log.d("external-mutations-downloader: Download result is not success");
            if (r4.A01.delete()) {
                r4.A00.delete();
            }
            boolean z2 = true;
            if (C625435m.A02(i)) {
                if (i != 16) {
                    z2 = false;
                }
                throw new C23331Se(z2, AnonymousClass000.A0Y("Transient error during downloading external mutations, status: ", AnonymousClass001.A0o(), i));
            } else if (i != 5) {
                throw new C23331Se(true, AnonymousClass000.A0Y("Failed to download external mutation with status: ", AnonymousClass001.A0o(), i));
            } else if (z) {
                throw C23341Sf.A00(str, 58);
            } else {
                throw C23341Sf.A00(str, 4);
            }
        }
    }
}
