package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.5t5  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C118155t5 implements AnonymousClass4GQ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ AnonymousClass5Y9 A02;
    public final /* synthetic */ UserJid A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;

    public final Object invoke(Object obj) {
        AnonymousClass5Y9 r0 = this.A02;
        String str = this.A04;
        UserJid userJid = this.A03;
        int i = this.A00;
        int i2 = this.A01;
        String str2 = this.A05;
        AnonymousClass5TG r4 = new AnonymousClass5TG((C52332lJ) obj, userJid, str, r0.A0D.A02, str2, i, i2, i2, this.A06, false);
        C112025j4 r6 = new C112025j4(new AnonymousClass7MW(r0, userJid, str2, str), r0);
        AnonymousClass5UJ r3 = r0.A0F;
        if (r3.A00.A0a(r4.A04) || !r0.A0K.A0X(1327)) {
            C105255Ue r10 = r0.A0N;
            AnonymousClass31C r9 = r0.A0M;
            C29441ip r7 = r0.A0J;
            new C90174gq(r0.A0A, r4, new C59082wK(new C106665Zw(0)), r6, r7, r0.A0L, r9, r10, r0.A0O).A02();
        } else {
            r3.A02(r4, r6);
        }
        return C59022wD.A00;
    }

    public /* synthetic */ C118155t5(AnonymousClass5Y9 r1, UserJid userJid, String str, String str2, int i, int i2, boolean z) {
        this.A02 = r1;
        this.A04 = str;
        this.A03 = userJid;
        this.A00 = i;
        this.A01 = i2;
        this.A05 = str2;
        this.A06 = z;
    }
}
