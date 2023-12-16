package X;

import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: X.1mU  reason: invalid class name and case insensitive filesystem */
public final class C30461mU extends C624134x implements AnonymousClass4B9, AnonymousClass4BB {
    public long A00;
    public C52422lS A01;
    public String A02;
    public String A03;
    public String A04;
    public Map A05;
    public boolean A06;

    public C30461mU(C30461mU r9, AnonymousClass2z0 r10, long j) {
        super(r9, r10, j, true);
        this.A04 = r9.A04;
        this.A00 = r9.A00;
        this.A02 = r9.A02;
        this.A01 = r9.A01;
        this.A03 = r9.A03;
        this.A06 = r9.A06;
    }

    public final void A1w(C56972sr r4, C30601mi r5) {
        Object A0o;
        C162457s7.A0J(r5, 0);
        if (!AnonymousClass000.A1U(this.A08 & 32, 32)) {
            C624134x.A0K(this, 32);
        }
        if (r5.A1J.A02) {
            A0o = C56972sr.A04(r4);
        } else {
            A0o = r5.A0o();
        }
        synchronized (this.A1K) {
            Map map = this.A05;
            if (map == null) {
                map = C18320x8.A0r();
                this.A05 = map;
            }
            if (A0o == null) {
                Log.w("Event Response senderUserJid is null; Not adding to event message");
            } else {
                map.put(A0o, r5);
            }
        }
    }

    public /* bridge */ /* synthetic */ C624134x Az3(AnonymousClass2z0 r4) {
        C162457s7.A0J(r4, 0);
        return new C30461mU(this, r4, this.A0K);
    }

    public List BDE() {
        AnonymousClass36K[] r3 = new AnonymousClass36K[1];
        AnonymousClass39V[] r2 = new AnonymousClass39V[1];
        AnonymousClass36K.A0U("meta", r2, r3, AnonymousClass39V.A0F("event_type", "creation", r2) ? 1 : 0);
        return AnonymousClass8UF.A0p(r3);
    }

    public final List A1v() {
        List list;
        Collection values;
        synchronized (this.A1K) {
            Map map = this.A05;
            if (map == null || (values = map.values()) == null) {
                list = null;
            } else {
                list = C73723fy.A0F(values);
            }
        }
        return list;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C30461mU(AnonymousClass2z0 r2, String str, long j, long j2) {
        super(r2, (byte) 92, j);
        C162457s7.A0J(str, 3);
        this.A04 = str;
        this.A00 = j2;
    }
}
