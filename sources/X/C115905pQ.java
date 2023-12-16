package X;

import com.whatsapp.status.playback.widget.VoiceStatusContentView;
import java.util.List;

/* renamed from: X.5pQ  reason: invalid class name and case insensitive filesystem */
public class C115905pQ implements C179688jY {
    public boolean A00 = false;
    public final C06270Wx A01;
    public final C06270Wx A02;
    public final AnonymousClass08M A03;
    public final AnonymousClass08M A04;
    public final AnonymousClass08M A05;
    public final AnonymousClass08M A06;
    public final C15930sC A07;
    public final C183088pT A08;
    public final List A09 = AnonymousClass001.A0s();

    public C115905pQ(C30721mu r9, C183088pT r10) {
        List list = null;
        AnonymousClass08M A012 = C18330xA.A01((Object) null);
        this.A05 = A012;
        AnonymousClass08M A013 = C18330xA.A01((Object) null);
        this.A03 = A013;
        AnonymousClass08M A014 = C18330xA.A01((Object) null);
        this.A04 = A014;
        C06270Wx A002 = C154467dD.A00(A012, A013, A014, new AnonymousClass5YM(this, 0));
        this.A01 = A002;
        AnonymousClass08M A015 = C18330xA.A01(-4);
        this.A06 = A015;
        C06270Wx A003 = C154467dD.A00(A002, A015, A013, new AnonymousClass5YM(this, 1));
        this.A02 = A003;
        C1897492m A0G = AnonymousClass4L0.A0G(this, 351);
        this.A07 = A0G;
        this.A08 = r10;
        ((VoiceStatusContentView) r10).A07 = this;
        A003.A0E(A0G);
        if (r9.A1s(32768)) {
            C60072xx r0 = r9.A00;
            A012.A0H(r0 != null ? r0.A00() : list);
        }
    }
}
