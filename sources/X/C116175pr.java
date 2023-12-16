package X;

import android.os.Handler;
import com.whatsapp.textstatuscomposer.voice.VoiceRecordingView;
import java.io.File;

/* renamed from: X.5pr  reason: invalid class name and case insensitive filesystem */
public final class C116175pr implements C179748je {
    public C116155pp A00;
    public C150487Qx A01;
    public AnonymousClass5ZQ A02;
    public Runnable A03 = new C117095rN(this, 4);
    public final Handler A04 = AnonymousClass000.A0A();
    public final C06270Wx A05;
    public final AnonymousClass08M A06;
    public final AnonymousClass08M A07;
    public final AnonymousClass08M A08;
    public final C15930sC A09;
    public final C15930sC A0A;
    public final C55682qk A0B;
    public final C69263Wi A0C;
    public final C54292oU A0D;
    public final AnonymousClass1VX A0E;
    public final C113995mK A0F;
    public final AnonymousClass75E A0G;
    public final C183198pe A0H;
    public final C104995Td A0I;
    public final C183538qC A0J;
    public final File A0K;

    public final void A00() {
        AnonymousClass5ZQ r0 = this.A02;
        if (r0 != null) {
            r0.A04();
        }
        AnonymousClass5ZQ r02 = this.A02;
        if (r02 != null) {
            this.A07.A0H(Integer.valueOf(r02.A02()));
        }
        AnonymousClass5ZQ r03 = this.A02;
        if (r03 != null) {
            r03.A02();
            Number A0i = C86654Ky.A0i(this.A07);
            if (A0i != null) {
                this.A0H.setSeekbarContentDescription((long) A0i.intValue());
            }
        }
        this.A08.A0H(new AnonymousClass52c(this));
        this.A0I.A00();
    }

    public final void A01() {
        AnonymousClass5ZQ r0 = this.A02;
        if (r0 != null) {
            r0.A09();
        }
        AnonymousClass5ZQ r02 = this.A02;
        if (r02 != null) {
            r02.A06();
        }
        this.A02 = null;
        this.A08.A0H(new C985852b(this));
        C06270Wx.A03(this.A07, 0);
        this.A0I.A00();
    }

    public final void A02(int i, boolean z) {
        Number A0i;
        Number A0i2 = C86654Ky.A0i(this.A06);
        if (A0i2 != null) {
            int intValue = A0i2.intValue();
            int A012 = C1222663s.A01((((float) i) / 1000.0f) * ((float) intValue));
            int i2 = (intValue - 50) - 1;
            if (A012 > i2) {
                A012 = i2;
            }
            if (A012 < 0) {
                A012 = 0;
            }
            AnonymousClass08M r0 = this.A07;
            C06270Wx.A03(r0, A012);
            if (z && (A0i = C86654Ky.A0i(r0)) != null) {
                this.A0H.setSeekbarContentDescription((long) A0i.intValue());
            }
        }
    }

    public C116175pr(C55682qk r8, C69263Wi r9, C54292oU r10, AnonymousClass1VX r11, C113995mK r12, AnonymousClass75E r13, C183198pe r14, C104995Td r15, C183538qC r16, File file) {
        C18260x0.A0V(r10, r11, r9);
        C162457s7.A0J(r8, 4);
        C183538qC r0 = r16;
        C18260x0.A0W(r15, r12, r0);
        this.A0D = r10;
        this.A0E = r11;
        this.A0C = r9;
        this.A0B = r8;
        this.A0G = r13;
        this.A0I = r15;
        this.A0F = r12;
        this.A0J = r0;
        this.A0H = r14;
        File file2 = file;
        this.A0K = file2;
        AnonymousClass08M A012 = C18330xA.A01(C18290x4.A0Z());
        this.A07 = A012;
        AnonymousClass08M A013 = C18330xA.A01(Integer.valueOf((int) C107655bf.A0G(file2)));
        this.A06 = A013;
        AnonymousClass08M A014 = C18330xA.A01(new C985852b(this));
        this.A08 = A014;
        AnonymousClass6C6 A002 = AnonymousClass6C6.A00(this, 354);
        this.A09 = A002;
        C06270Wx A015 = C154467dD.A01(A012, A013, new C161537ps(1), false);
        this.A05 = A015;
        AnonymousClass6C6 A003 = AnonymousClass6C6.A00(this, 355);
        this.A0A = A003;
        ((VoiceRecordingView) r14).A0D = this;
        A014.A0E(A002);
        A015.A0E(A003);
    }
}
