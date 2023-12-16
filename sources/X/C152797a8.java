package X;

import android.content.Context;
import android.media.MediaFormat;
import java.util.List;
import java.util.Map;

/* renamed from: X.7a8  reason: invalid class name and case insensitive filesystem */
public class C152797a8 {
    public AnonymousClass724 A00;
    public Map A01 = AnonymousClass001.A0t();
    public Map A02 = AnonymousClass001.A0t();
    public boolean A03;
    public final int A04;
    public final long A05;
    public final long A06;
    public final Context A07;
    public final MediaFormat A08;
    public final C157067hf A09;
    public final C151307Uf A0A;
    public final C180608lL A0B;
    public final C158667kM A0C;
    public final C1445371y A0D;
    public final C160727oD A0E;
    public final C150307Qc A0F;
    public final AnonymousClass7QR A0G;
    public final C183838qk A0H;
    public final C186348v9 A0I;
    public final List A0J = AnonymousClass001.A0s();

    public synchronized void A00() {
        AnonymousClass7VY r5 = new AnonymousClass7VY();
        Map map = this.A01;
        new AnonymousClass7B1(new C188878zd(r5, (C186228ux) map.get(0), 0)).A00.A00();
        Map map2 = this.A02;
        new AnonymousClass7B1(new C188878zd(r5, (C1683685d) map2.get(0), 1)).A00.A00();
        map2.clear();
        map.clear();
    }

    public synchronized void A01() {
        AnonymousClass7VY r6 = new AnonymousClass7VY();
        Map map = this.A02;
        C1683685d r2 = (C1683685d) map.get(0);
        if (r2 != null && r2.A0H) {
            this.A0C.A0R = true;
            new AnonymousClass7B2(new C188878zd(r6, r2, 2)).A00.A00();
        }
        Map map2 = this.A01;
        AnonymousClass7RG.A00(new C188878zd(r6, (C186228ux) map2.get(0), 4));
        map.clear();
        map2.clear();
        Throwable th = r6.A01;
        if (th != null) {
            throw th;
        }
    }

    public void A02(long j) {
        Map map = this.A01;
        Integer A0Z = C18290x4.A0Z();
        if (map.get(A0Z) != null) {
            ((C186228ux) map.get(A0Z)).BjW(j);
            ((C186228ux) map.get(A0Z)).B1y(j);
        }
    }

    public C152797a8(Context context, MediaFormat mediaFormat, C157067hf r5, C151307Uf r6, C180608lL r7, C158667kM r8, C1445371y r9, C160727oD r10, C150307Qc r11, AnonymousClass7QR r12, C183838qk r13, C186348v9 r14, int i, long j, long j2) {
        this.A0D = r9;
        this.A0F = r11;
        this.A0G = r12;
        this.A0C = r8;
        this.A0B = r7;
        this.A07 = context;
        this.A04 = i;
        this.A08 = mediaFormat;
        this.A0I = r14;
        this.A0E = r10;
        this.A09 = r5;
        this.A0H = r13;
        this.A06 = j;
        this.A05 = j2;
        this.A0A = r6;
    }
}
