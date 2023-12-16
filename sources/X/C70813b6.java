package X;

import com.whatsapp.stickers.stickerpack.StickerPackDownloader;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.3b6  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C70813b6 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C47572dT A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ AnonymousClass4GQ A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    public final void run() {
        C47572dT r7 = this.A01;
        String str = this.A02;
        boolean z = this.A04;
        AnonymousClass4GQ r5 = this.A03;
        boolean z2 = this.A05;
        int i = this.A00;
        boolean z3 = this.A06;
        C55782qu r8 = r7.A08;
        int A002 = r8.A00();
        r8.A01(A002, "start_download");
        r8.A05(C30121lt.A00, str, A002);
        String str2 = "";
        C50612iT A012 = AnonymousClass32Z.A01((AnonymousClass39M) null, "meta-avatar", "Avatars", "Meta", "", str2, "", "", C72023d3.A00);
        if (z) {
            StickerPackDownloader stickerPackDownloader = r7.A0C;
            String str3 = A012.A0G;
            C162457s7.A0D(str3);
            stickerPackDownloader.A03(str3);
        }
        AtomicBoolean atomicBoolean = r7.A0G;
        if (atomicBoolean.get()) {
            atomicBoolean.set(false);
            r8.A02(C372621o.CANCEL, A002);
            r5.invoke(Boolean.FALSE);
            return;
        }
        r7.A00.set(A012.A0G);
        r7.A01.A0S(new C70803b5(r7, A012, r5, A002, i, z2, z3));
    }

    public /* synthetic */ C70813b6(C47572dT r1, String str, AnonymousClass4GQ r3, int i, boolean z, boolean z2, boolean z3) {
        this.A01 = r1;
        this.A02 = str;
        this.A04 = z;
        this.A03 = r3;
        this.A05 = z2;
        this.A00 = i;
        this.A06 = z3;
    }
}
