package X;

import java.io.File;

/* renamed from: X.2d5  reason: invalid class name and case insensitive filesystem */
public final class C47332d5 {
    public final C64393Dh A00;
    public final C69263Wi A01;
    public final C56492s4 A02;
    public final C56612sH A03;
    public final C61072zf A04;
    public final C29431io A05;
    public final AnonymousClass1VX A06;
    public final C55002pd A07;
    public final C29011i8 A08;
    public final AnonymousClass4FS A09;

    public final void A00(C624134x r14, File file, String str) {
        C56612sH r4 = this.A03;
        AnonymousClass1VX r6 = this.A06;
        C28251fy r2 = new C28251fy(this.A02, r4, this.A04, r6, this.A07, C633138t.A0I, this.A08, file, str, "image/jpeg");
        r2.AwR(new AnonymousClass4IX(r14, 2, this));
        StringBuilder A0o = AnonymousClass001.A0o();
        C18260x0.A0m(C624134x.A08(r14, "BotPluginDownloadManager/starting download for ", A0o), A0o);
        this.A09.BkM(r2);
    }

    public C47332d5(C64393Dh r2, C69263Wi r3, C56492s4 r4, C56612sH r5, C61072zf r6, C29431io r7, AnonymousClass1VX r8, C55002pd r9, C29011i8 r10, AnonymousClass4FS r11) {
        C18260x0.A0f(r5, r8, r3, r11, r2);
        C18260x0.A0W(r4, r6, r10);
        C162457s7.A0J(r7, 9);
        this.A03 = r5;
        this.A06 = r8;
        this.A01 = r3;
        this.A09 = r11;
        this.A00 = r2;
        this.A02 = r4;
        this.A04 = r6;
        this.A08 = r10;
        this.A05 = r7;
        this.A07 = r9;
    }
}
