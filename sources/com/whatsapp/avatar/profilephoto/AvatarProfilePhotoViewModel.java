package com.whatsapp.avatar.profilephoto;

import X.AnonymousClass08M;
import X.AnonymousClass0Y8;
import X.AnonymousClass0x9;
import X.AnonymousClass30R;
import X.AnonymousClass4FS;
import X.AnonymousClass4UC;
import X.AnonymousClass5MI;
import X.AnonymousClass5Z8;
import X.AnonymousClass637;
import X.AnonymousClass6AT;
import X.C05550Ty;
import X.C06270Wx;
import X.C101645Fo;
import X.C1219362l;
import X.C132066ed;
import X.C132076ee;
import X.C132096eg;
import X.C141506vg;
import X.C18260x0;
import X.C18330xA;
import X.C29351ig;
import X.C30121lt;
import X.C30191m3;
import X.C47072cf;
import X.C49652gs;
import X.C49662gt;
import X.C55782qu;
import X.C55862r2;
import X.C56972sr;
import X.C69263Wi;
import X.C71673cU;
import X.C72023d3;
import X.C86654Ky;
import com.whatsapp.R;
import java.util.List;
import java.util.NoSuchElementException;

public final class AvatarProfilePhotoViewModel extends C05550Ty {
    public final AnonymousClass08M A00;
    public final AnonymousClass6AT A01;
    public final C69263Wi A02;
    public final C56972sr A03;
    public final AnonymousClass5MI A04;
    public final C101645Fo A05;
    public final C49652gs A06;
    public final C47072cf A07;
    public final C29351ig A08;
    public final C55862r2 A09;
    public final C55782qu A0A;
    public final C30191m3 A0B;
    public final AnonymousClass4UC A0C = AnonymousClass0x9.A0b();
    public final AnonymousClass4FS A0D;
    public final List A0E;

    public final void A0D() {
        C132076ee[] r4 = new C132076ee[5];
        r4[0] = new C132076ee(Integer.valueOf(AnonymousClass0Y8.A04(this.A04.A00.A00.getApplicationContext(), R.color.f5nameremoved)), true);
        r4[1] = new C132076ee((Integer) null, false);
        r4[2] = new C132076ee((Integer) null, false);
        r4[3] = new C132076ee((Integer) null, false);
        List A19 = AnonymousClass0x9.A19(new C132076ee((Integer) null, false), r4, 4);
        List<C132096eg> list = this.A0E;
        for (C132096eg r42 : list) {
            if (r42.A03) {
                this.A00.A0H(new AnonymousClass5Z8(r42, (C132066ed) null, A19, list, false, true, false));
                return;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public AvatarProfilePhotoViewModel(C69263Wi r9, C56972sr r10, AnonymousClass5MI r11, C101645Fo r12, C49652gs r13, C47072cf r14, C29351ig r15, C55862r2 r16, C55782qu r17, C30191m3 r18, AnonymousClass4FS r19) {
        C30191m3 r1 = r18;
        AnonymousClass4FS r0 = r19;
        C55862r2 r3 = r16;
        C18260x0.A0f(r9, r10, r0, r3, r1);
        C55782qu r2 = r17;
        C18260x0.A0W(r13, r2, r15);
        this.A02 = r9;
        this.A03 = r10;
        this.A0D = r0;
        this.A09 = r3;
        this.A0B = r1;
        this.A06 = r13;
        this.A0A = r2;
        this.A08 = r15;
        this.A05 = r12;
        this.A04 = r11;
        this.A07 = r14;
        C72023d3 r32 = C72023d3.A00;
        this.A00 = C18330xA.A01(new AnonymousClass5Z8((C132096eg) null, (C132066ed) null, r32, r32, false, false, false));
        C132096eg[] r33 = new C132096eg[7];
        r33[0] = r11.A00(R.color.f5nameremoved, R.color.f5nameremoved, R.string.f11nameremoved, true);
        r33[1] = r11.A00(R.color.f5nameremoved, R.color.f5nameremoved, R.string.f11nameremoved, false);
        r33[2] = r11.A00(R.color.f5nameremoved, R.color.f5nameremoved, R.string.f11nameremoved, false);
        r33[3] = r11.A00(R.color.f5nameremoved, R.color.f5nameremoved, R.string.f11nameremoved, false);
        r33[4] = r11.A00(R.color.f5nameremoved, R.color.f5nameremoved, R.string.f11nameremoved, false);
        r33[5] = r11.A00(R.color.f5nameremoved, R.color.f5nameremoved, R.string.f11nameremoved, false);
        this.A0E = AnonymousClass0x9.A19(r11.A00(R.color.f5nameremoved, R.color.f5nameremoved, R.string.f11nameremoved, false), r33, 6);
        AnonymousClass6AT r02 = new AnonymousClass6AT(this, 0);
        this.A01 = r02;
        r15.A06(r02);
        A0D();
        if (r13.A01()) {
            A0E(0, "profile_photo_tool", false);
        } else {
            this.A0C.A0H(C141506vg.AVATAR_EDITOR);
        }
    }

    public void A0C() {
        this.A08.A07(this.A01);
        ((AnonymousClass30R) ((C49662gt) this.A07.A05.get()).A02.A00.getValue()).A05(false);
    }

    public final void A0E(int i, String str, boolean z) {
        C55782qu r1 = this.A0A;
        int A002 = r1.A00();
        r1.A01(A002, "fetch_poses");
        r1.A05(C30121lt.A00, str, A002);
        C47072cf r2 = this.A07;
        r2.A04.BkP(new C71673cU((Object) r2, (Object) new AnonymousClass637(this, i, A002), (Object) new C1219362l(this, A002), A002, 4, z));
    }

    public final void A0F(boolean z) {
        Object r2;
        C06270Wx r1 = this.A00;
        AnonymousClass5Z8 A0R = C86654Ky.A0R(r1);
        List list = A0R.A03;
        List list2 = A0R.A02;
        C132096eg r3 = A0R.A00;
        C132066ed r4 = A0R.A01;
        boolean z2 = A0R.A05;
        if (z) {
            r1.A0G(new AnonymousClass5Z8(r3, r4, list, list2, false, z2, A0R.A04));
            r1 = this.A0C;
            r2 = C141506vg.CLOSE_SCREEN;
        } else {
            r2 = new AnonymousClass5Z8(r3, r4, list, list2, false, z2, true);
        }
        r1.A0G(r2);
    }
}
