package X;

import com.whatsapp.stickers.stickerpack.StickerPackDownloader;
import com.whatsapp.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.2dT  reason: invalid class name and case insensitive filesystem */
public final class C47572dT {
    public AtomicReference A00 = new AtomicReference((Object) null);
    public final C69263Wi A01;
    public final AnonymousClass2VX A02;
    public final C43062Qp A03;
    public final AnonymousClass33p A04;
    public final C51932kc A05;
    public final AnonymousClass32Z A06;
    public final C49662gt A07;
    public final C55782qu A08;
    public final C27841el A09;
    public final AnonymousClass4BO A0A = new C68753Uj();
    public final C56932sn A0B;
    public final StickerPackDownloader A0C;
    public final C54962pZ A0D;
    public final C54502op A0E;
    public final AnonymousClass4FS A0F;
    public final AtomicBoolean A0G = C18280x3.A0l();

    public final void A00(String str, AnonymousClass4GQ r11, int i, boolean z, boolean z2, boolean z3) {
        StringBuilder A0g = C18280x3.A0g(str, 1);
        A0g.append("downloadAvatarStickerPack(isCreation=");
        A0g.append(z);
        A0g.append(", origin=");
        A0g.append(str);
        A0g.append(", originType=");
        A0g.append(i);
        A0g.append(", startWorkerOnFailure=");
        A0g.append(z2);
        A0g.append(", cancelExistingDownload=");
        boolean z4 = z3;
        Log.d(C18260x0.A0A(A0g, z3));
        this.A0G.set(false);
        AnonymousClass4GQ r4 = r11;
        this.A0F.BkM(new C70813b6(this, str, r4, i, z4, z2, z));
    }

    public C47572dT(C69263Wi r3, AnonymousClass2VX r4, C43062Qp r5, AnonymousClass33p r6, C51932kc r7, AnonymousClass32Z r8, C49662gt r9, C55782qu r10, C27841el r11, C56932sn r12, StickerPackDownloader stickerPackDownloader, C54962pZ r14, C54502op r15, AnonymousClass4FS r16) {
        AnonymousClass4FS r1 = r16;
        C18260x0.A0f(r3, r1, r14, r15, r12);
        C18260x0.A0g(r8, r6, stickerPackDownloader, r7, r10);
        C162457s7.A0J(r11, 11);
        C162457s7.A0J(r9, 13);
        this.A01 = r3;
        this.A0F = r1;
        this.A0D = r14;
        this.A0E = r15;
        this.A0B = r12;
        this.A06 = r8;
        this.A04 = r6;
        this.A0C = stickerPackDownloader;
        this.A05 = r7;
        this.A08 = r10;
        this.A09 = r11;
        this.A03 = r5;
        this.A07 = r9;
        this.A02 = r4;
    }
}
