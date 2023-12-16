package X;

import com.whatsapp.util.Log;

/* renamed from: X.2ci  reason: invalid class name and case insensitive filesystem */
public class C47102ci {
    public final C56972sr A00;
    public final C64773Ex A01;
    public final C53592nL A02;
    public final C64223Cq A03;
    public final C56882si A04;
    public final C56612sH A05;
    public final AnonymousClass1VX A06;
    public final AnonymousClass4FS A07;

    public void A00() {
        if (this.A00.A0Y()) {
            Log.d("ContactDiscoverySyncHelper/syncOutContact/skipping sync as companions do not have out contacts");
            return;
        }
        int A0O = this.A06.A0O(C58422vE.A02, 1144);
        if (A0O != -1 && this.A05.A0H() - AnonymousClass0x2.A0A(this.A04.A02(), "last_out_contact_sync_time") > ((long) A0O) * 60000) {
            this.A07.BkN(new C69973Zj(this, 27), "ContactDiscoverySyncHelper/syncOutContact");
        }
    }

    public C47102ci(C56972sr r1, C64773Ex r2, C53592nL r3, C64223Cq r4, C56882si r5, C56612sH r6, AnonymousClass1VX r7, AnonymousClass4FS r8) {
        this.A05 = r6;
        this.A06 = r7;
        this.A00 = r1;
        this.A07 = r8;
        this.A01 = r2;
        this.A03 = r4;
        this.A04 = r5;
        this.A02 = r3;
    }
}
