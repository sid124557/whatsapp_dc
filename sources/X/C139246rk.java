package X;

import java.util.List;
import org.wawebrtc.MediaCodecVideoEncoder;

/* renamed from: X.6rk  reason: invalid class name and case insensitive filesystem */
public final class C139246rk extends C41022Iq implements C183418q0 {
    public final C34781vo A00;
    public final C34781vo A01;
    public final C34781vo A02;
    public final C34781vo A03;
    public final C34781vo A04;
    public final C34781vo A05;
    public final C34781vo A06;
    public final C34781vo A07;
    public final C34781vo A08;
    public final C34781vo A09;
    public final C34781vo A0A;
    public final C34781vo A0B;
    public final C34781vo A0C;
    public final C138626qj A0D;
    public final C138626qj A0E;
    public final C138666qn A0F;
    public final C138666qn A0G;
    public final C138666qn A0H;
    public final C138666qn A0I;
    public final C138666qn A0J;
    public final C34881vy A0K;
    public final List A0L;

    public void Aw2(C149057Kt r8) {
        List list = r8.A01;
        AnonymousClass36J r5 = AnonymousClass36J.A00;
        AnonymousClass36K r4 = this.A00;
        C162457s7.A0D(r4);
        C149067Ku r3 = r8.A00;
        list.add(r5.A0A(r4, new AnonymousClass746(r3, 10), new AnonymousClass746(r3, 11), 3));
    }

    public C139246rk(AnonymousClass36K r10) {
        Object obj;
        AnonymousClass36K r2 = r10;
        AnonymousClass36K.A0N(r10, "group");
        C626836d.A05(r2, String.class, AnonymousClass0x2.A0R(), AnonymousClass0x2.A0S(), "false", new String[]{"ack"}, false);
        this.A0K = (C34881vy) C626836d.A02(r10, new C86304Jp(43), 0);
        try {
            obj = C626836d.A04(r10, C1896292a.A00(161), new String[0]);
        } catch (AnonymousClass24Y unused) {
            obj = null;
        }
        this.A0F = (C138666qn) obj;
        this.A0D = (C138626qj) C86614Ku.A0r(r10, new String[]{"description"}, 164);
        this.A08 = (C34781vo) C86614Ku.A0r(r10, new String[]{"locked"}, 165);
        this.A02 = (C34781vo) C86614Ku.A0r(r10, new String[]{"announcement"}, 166);
        this.A0J = (C138666qn) C86614Ku.A0r(r10, new String[]{"parent"}, 167);
        this.A09 = (C34781vo) C86614Ku.A0r(r10, new String[]{"no_frequently_forwarded"}, 168);
        this.A0B = (C34781vo) C86614Ku.A0r(r10, new String[]{"support"}, 169);
        this.A0E = (C138626qj) C86614Ku.A0r(r10, new String[]{"ephemeral"}, 171);
        this.A0C = (C34781vo) C86614Ku.A0r(r10, new String[]{"suspended"}, 172);
        this.A0G = (C138666qn) C86614Ku.A0r(r10, new String[]{"growth_locked"}, 170);
        this.A04 = (C34781vo) C86614Ku.A0r(r10, new String[]{"default_sub_group"}, 173);
        this.A0A = (C34781vo) C86614Ku.A0r(r10, new String[]{"shadow"}, 174);
        this.A0I = (C138666qn) C86614Ku.A0r(r10, new String[]{"membership_approval_mode"}, 175);
        this.A07 = (C34781vo) C86614Ku.A0r(r10, new String[]{"incognito"}, MediaCodecVideoEncoder.MIN_ENCODER_WIDTH);
        this.A00 = (C34781vo) C86614Ku.A0r(r10, new String[]{"allow_admin_reports"}, 177);
        this.A01 = (C34781vo) C86614Ku.A0r(r10, new String[]{"allow_non_admin_sub_group_creation"}, 178);
        this.A05 = (C34781vo) C86614Ku.A0r(r10, new String[]{"general_chat"}, 179);
        this.A03 = (C34781vo) C86614Ku.A0r(r10, new String[]{"auto_add_disabled"}, 180);
        this.A06 = (C34781vo) C86614Ku.A0r(r10, new String[]{"group_history"}, 160);
        this.A0H = (C138666qn) C86614Ku.A0r(r10, new String[]{"linked_parent"}, 162);
        this.A0L = C626836d.A0B(r2, C1896292a.A00(163), new String[]{"participant"}, 0, 19999);
        this.A00 = r10;
    }
}
