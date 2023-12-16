package X;

import com.whatsapp.reporttoadmin.xmpp.RtaXmppClient;

/* renamed from: X.43h  reason: invalid class name and case insensitive filesystem */
public final class C823643h extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ AnonymousClass483 $assistedFactory;
    public final /* synthetic */ C27991fJ $groupJid;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C823643h(AnonymousClass483 r2, C27991fJ r3) {
        super(1);
        this.$assistedFactory = r2;
        this.$groupJid = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass483 r1 = this.$assistedFactory;
        C27991fJ r4 = this.$groupJid;
        AnonymousClass3F9 r12 = (AnonymousClass3F9) r1;
        RtaXmppClient AD6 = r12.A00.A01.AD6();
        C118075sx r13 = r12.A00;
        return new AnonymousClass113((AnonymousClass2CP) r13.A01.A0o.get(), (AnonymousClass33T) r13.A03.Aaf.get(), r4, AD6);
    }
}
