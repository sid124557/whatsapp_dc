package X;

import android.util.Base64;

/* renamed from: X.1SP  reason: invalid class name */
public class AnonymousClass1SP extends AnonymousClass33W {
    public int A00;
    public final C47192cr A01;
    public final boolean A02;

    public AnonymousClass1SP(C47192cr r11, AnonymousClass33J r12, String str, int i, long j, boolean z, boolean z2) {
        super(C60642yt.A03, r12, str, "regular_low", 7, j, z2);
        this.A02 = z;
        this.A00 = i;
        this.A01 = r11;
    }

    public AnonymousClass18L A06() {
        C130546c9 A0G = C21941Dt.DEFAULT_INSTANCE.A0G();
        C47192cr r3 = this.A01;
        String str = r3.A08;
        if (str != null) {
            C21941Dt r1 = (C21941Dt) C18320x8.A0C(A0G);
            r1.bitField0_ |= 1;
            r1.url_ = str;
        }
        String str2 = r3.A04;
        if (str2 != null) {
            C172548Lq A08 = C18270x1.A08(A0G, str2);
            C21941Dt r12 = (C21941Dt) A0G.A00;
            r12.bitField0_ |= 2;
            r12.fileEncSha256_ = A08;
        }
        String str3 = r3.A05;
        if (str3 != null) {
            C172548Lq A09 = C18270x1.A09(A0G, Base64.decode(str3, 1));
            C21941Dt r13 = (C21941Dt) A0G.A00;
            r13.bitField0_ |= 4;
            r13.mediaKey_ = A09;
        }
        String str4 = r3.A06;
        if (str4 != null) {
            C21941Dt r14 = (C21941Dt) C18320x8.A0C(A0G);
            r14.bitField0_ |= 8;
            r14.mimetype_ = str4;
        }
        int i = r3.A00;
        C21941Dt r15 = (C21941Dt) C18320x8.A0C(A0G);
        r15.bitField0_ |= 16;
        r15.height_ = i;
        int i2 = r3.A01;
        C21941Dt r16 = (C21941Dt) C18320x8.A0C(A0G);
        r16.bitField0_ |= 32;
        r16.width_ = i2;
        String str5 = r3.A03;
        if (str5 != null) {
            C21941Dt r17 = (C21941Dt) C18320x8.A0C(A0G);
            r17.bitField0_ |= 64;
            r17.directPath_ = str5;
        }
        long j = r3.A02;
        C21941Dt r18 = (C21941Dt) C18320x8.A0C(A0G);
        r18.bitField0_ |= 128;
        r18.fileLength_ = j;
        boolean z = this.A02;
        C21941Dt r19 = (C21941Dt) C18320x8.A0C(A0G);
        r19.bitField0_ |= 256;
        r19.isFavorite_ = z;
        int i3 = this.A00;
        if (i3 >= 0) {
            C21941Dt r110 = (C21941Dt) C18320x8.A0C(A0G);
            r110.bitField0_ |= 512;
            r110.deviceIdHint_ = i3;
        }
        AnonymousClass18L A06 = super.A06();
        AnonymousClass1EO A002 = AnonymousClass33W.A00(A06);
        C21941Dt r0 = (C21941Dt) A0G.A06();
        r0.getClass();
        A002.stickerAction_ = r0;
        A002.bitField0_ |= 134217728;
        return A06;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("FavoriteStickerMutation{isFavorite=");
        A0o.append(this.A02);
        A0o.append(", setterId=");
        A0o.append(this.A00);
        A0o.append(", metadata=");
        return AnonymousClass000.A0Q(this.A01, A0o);
    }
}
