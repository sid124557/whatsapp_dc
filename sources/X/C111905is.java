package X;

import android.graphics.Bitmap;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.5is  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C111905is implements C181778nJ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ C89654ea A03;
    public final /* synthetic */ AnonymousClass5XF A04;
    public final /* synthetic */ C109015dw A05;
    public final /* synthetic */ C152967aS A06;
    public final /* synthetic */ C95814uZ A07;
    public final /* synthetic */ UserJid A08;
    public final /* synthetic */ List A09;

    public final void BVc(Bitmap bitmap, AnonymousClass8EI r18, boolean z) {
        AnonymousClass5XF r5 = this.A04;
        int i = this.A00;
        List list = this.A09;
        C89654ea r3 = this.A03;
        int i2 = this.A01;
        C95814uZ r8 = this.A07;
        C109015dw r6 = this.A05;
        UserJid userJid = this.A08;
        long j = this.A02;
        C152967aS r7 = this.A06;
        AnonymousClass3XA r4 = new AnonymousClass3XA();
        r4.A04(new C116485qM(r3, r4, r5, r6, r7, r8, userJid, list, i, i2, j, z), r5.A02.A08);
        r5.A0B.BkM(new C172708Mj(r5, r4, bitmap, 33));
    }

    public /* synthetic */ C111905is(C89654ea r1, AnonymousClass5XF r2, C109015dw r3, C152967aS r4, C95814uZ r5, UserJid userJid, List list, int i, int i2, long j) {
        this.A04 = r2;
        this.A00 = i;
        this.A09 = list;
        this.A03 = r1;
        this.A01 = i2;
        this.A07 = r5;
        this.A05 = r3;
        this.A08 = userJid;
        this.A02 = j;
        this.A06 = r4;
    }
}
