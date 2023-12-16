package X;

import com.whatsapp.contact.picker.CompoundContactsLoader$loadContacts$2$1$1;

/* renamed from: X.43g  reason: invalid class name and case insensitive filesystem */
public final class C823543g extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ C73853gB $dispatcher;
    public final /* synthetic */ C27991fJ $groupJid;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C823543g(C27991fJ r2, C73853gB r3) {
        super(1);
        this.$groupJid = r2;
        this.$dispatcher = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C84434Ci r5 = (C84434Ci) obj;
        C162457s7.A0J(r5, 0);
        return new C831846l(new CompoundContactsLoader$loadContacts$2$1$1(r5, this.$groupJid, (C84814Du) null, this.$dispatcher));
    }
}
