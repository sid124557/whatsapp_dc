package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1a2  reason: invalid class name and case insensitive filesystem */
public final class C25141a2 extends AnonymousClass3ZG {
    public Long A00;
    public Long A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public String A06;

    public C25141a2() {
        super(4714, AnonymousClass0x9.A0U(1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A00);
        r3.Blb(2, this.A01);
        r3.Blb(3, this.A02);
        r3.Blb(4, this.A03);
        r3.Blb(5, this.A04);
        r3.Blb(6, this.A05);
        r3.Blb(7, this.A06);
    }

    public static void A00(C53902nr r4, Iterator it) {
        AnonymousClass4FV r3 = ((C147087Ct) it.next()).A00;
        C25141a2 r2 = new C25141a2();
        r2.A06 = r4.A07;
        r2.A03 = Long.valueOf(r4.A02);
        r2.A01 = Long.valueOf((long) r4.A00);
        r2.A02 = Long.valueOf(r4.A01);
        r2.A00 = Long.valueOf((long) r4.A05.A01.errorCode);
        r2.A04 = Long.valueOf(r4.A03);
        r2.A05 = Long.valueOf(r4.A04);
        r3.BhD(r2);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0J(C18270x1.A0I(C18270x1.A0H(C18270x1.A0G(C18270x1.A0F(C18270x1.A0E(AnonymousClass001.A0f(), this.A00, A0r), this.A01, A0r), this.A02, A0r), this.A03, A0r), this.A04, A0r), this.A05, A0r), this.A06);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamBotVideoPlayback {");
        C57292tP.A00(A0o, "playbackErrorCode", this.A00);
        C57292tP.A00(A0o, "playbackStallCount", this.A01);
        C57292tP.A00(A0o, "playbackStallTime", this.A02);
        C57292tP.A00(A0o, "playbackStartLatency", this.A03);
        C57292tP.A00(A0o, "playbackTime", this.A04);
        C57292tP.A00(A0o, "videoDuration", this.A05);
        return AnonymousClass3ZG.A0G(this.A06, "videoId", A0o);
    }
}
