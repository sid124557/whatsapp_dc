package X;

/* renamed from: X.6qv  reason: invalid class name and case insensitive filesystem */
public class C138746qv extends C41022Iq {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;

    public C138746qv(AnonymousClass36K r19, int i) {
        AnonymousClass36K r4 = r19;
        switch (i) {
            case 0:
                AnonymousClass36K.A0N(r4, "fds");
                this.A00 = C1896292a.A0K(r4, 69);
                this.A04 = C86614Ku.A0r(r4, new String[]{"states"}, 70);
                this.A01 = C86614Ku.A0r(r4, new String[]{"next_screens"}, 71);
                this.A03 = C86614Ku.A0r(r4, new String[]{"screen_data"}, 72);
                this.A02 = C86614Ku.A0r(r4, new String[]{"persist_data"}, 73);
                break;
            case 1:
                AnonymousClass36K.A0N(r4, "add_request");
                Class<Long> cls = Long.class;
                Long A0T = AnonymousClass0x2.A0T();
                Long A0S = AnonymousClass0x2.A0S();
                this.A02 = C626836d.A06(r4, cls, A0T, A0S, (Object) null, new String[]{"expiration"}, false);
                AnonymousClass36K r11 = r4;
                this.A03 = C626836d.A06(r11, C27991fJ.class, AnonymousClass0x2.A0R(), A0S, (Object) null, new String[]{"group_jid"}, false);
                this.A04 = C626836d.A06(r4, cls, A0T, 1024L, (Object) null, new String[]{"priority_idx"}, false);
                this.A01 = C1896292a.A0L(r4, 142, 0);
                this.A00 = C1896292a.A0L(r4, 143, 0);
                break;
            default:
                this.A03 = C86614Ku.A0r(r4, new String[]{"variant_info", "properties"}, 388);
                this.A04 = C86614Ku.A0r(r4, new String[]{"variant_info", "types"}, 389);
                this.A01 = C86614Ku.A0r(r4, new String[]{"variant_info", "listing_details"}, 390);
                this.A00 = C86614Ku.A0r(r4, new String[]{"variant_info", "availability"}, 391);
                this.A00 = r4;
                this.A02 = C18290x4.A0k(C1896292a.A0N(r4, new String[]{"variant_info"}, 392));
                return;
        }
        this.A00 = r4;
    }
}
