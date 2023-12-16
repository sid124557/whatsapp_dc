package X;

import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;

/* renamed from: X.1SW  reason: invalid class name */
public class AnonymousClass1SW extends AnonymousClass33W implements C837649r, C837749s, C837849t {
    public final AnonymousClass35N A00;
    public final C95814uZ A01;
    public final boolean A02;

    public AnonymousClass1SW(AnonymousClass35N r10, C95814uZ r11, long j, boolean z) {
        this((AnonymousClass33J) null, r10, r11, (String) null, j, z, true);
    }

    public AnonymousClass18L A06() {
        C130546c9 A0G = C21261Bd.DEFAULT_INSTANCE.A0G();
        boolean z = this.A02;
        C21261Bd r1 = (C21261Bd) C18320x8.A0C(A0G);
        r1.bitField0_ |= 1;
        r1.archived_ = z;
        AnonymousClass1CO A04 = this.A00.A04();
        C21261Bd r12 = (C21261Bd) C18320x8.A0C(A0G);
        A04.getClass();
        r12.messageRange_ = A04;
        r12.bitField0_ |= 2;
        AnonymousClass18L A06 = super.A06();
        AnonymousClass1EO A002 = AnonymousClass33W.A00(A06);
        C21261Bd r0 = (C21261Bd) A0G.A06();
        r0.getClass();
        A002.archiveChatAction_ = r0;
        A002.bitField0_ |= ZipDecompressor.UNZIP_BUFFER_SIZE;
        return A06;
    }

    public boolean BJD() {
        return !this.A02;
    }

    public AnonymousClass35N B9b() {
        return this.A00;
    }

    public C95814uZ getChatJid() {
        return this.A01;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass33W.A02(this, "ArchiveChatMutation{rowId=", A0o);
        A0o.append(", chatJid=");
        A0o.append(this.A01);
        A0o.append(", isArchived=");
        A0o.append(this.A02);
        A0o.append(", messageRange=");
        C18310x6.A1J(this.A00, A0o);
        AnonymousClass33W.A05(this, A0o, this.A04);
        return A0o.toString();
    }

    public AnonymousClass1SW(AnonymousClass33J r11, AnonymousClass35N r12, C95814uZ r13, String str, long j, boolean z, boolean z2) {
        super(C60642yt.A03, r11, str, "regular_low", 3, j, z2);
        this.A01 = r13;
        this.A02 = z;
        this.A00 = r12;
    }
}
