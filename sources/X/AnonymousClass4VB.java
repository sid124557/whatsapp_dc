package X;

import android.graphics.Bitmap;
import com.whatsapp.jid.UserJid;

/* renamed from: X.4VB  reason: invalid class name */
public class AnonymousClass4VB extends C05550Ty {
    public final int A00;
    public final AnonymousClass08J A01;
    public final AnonymousClass08J A02;
    public final AnonymousClass08J A03;
    public final AnonymousClass08M A04;
    public final AnonymousClass08M A05;
    public final AnonymousClass08M A06;
    public final AnonymousClass08M A07;
    public final AnonymousClass08M A08;
    public final C56972sr A09;
    public final C64773Ex A0A;
    public final C613330g A0B;
    public final C43152Qz A0C;
    public final C54292oU A0D;
    public final AnonymousClass1VX A0E;
    public final AnonymousClass4FS A0F;
    public final boolean A0G;
    public final boolean A0H;

    public final void A0D() {
        UserJid userJid;
        int i;
        C624134x A1H = C86664Kz.A1H(this.A07);
        if (A1H == null) {
            userJid = null;
        } else if (A1H.A1J.A02) {
            userJid = C56972sr.A04(this.A09);
        } else {
            userJid = A1H.A0o();
        }
        Number A0i = C86654Ky.A0i(this.A03);
        if (A1H == null || userJid == null || A0i == null || A0i.intValue() != 2) {
            AnonymousClass5YS.A00(this.A01, (Object) null);
            return;
        }
        if (this.A0E.A0X(3799)) {
            i = 96;
        } else {
            i = this.A00;
        }
        AnonymousClass3ZH A082 = this.A0A.A08(userJid);
        if (A082 != null) {
            Bitmap bitmap = (Bitmap) this.A0B.A03.A02.A01().A06(A082.A0M(0.0f, i));
            if (bitmap != null) {
                AnonymousClass5YS.A00(this.A01, new C148937Kh(bitmap, userJid, (String) null));
                return;
            }
        }
        this.A0F.BkM(new C71733ca((Object) userJid, (Object) this, i, 33));
    }

    public final void A0E() {
        Object A0o;
        String str;
        C624134x A1H = C86664Kz.A1H(this.A07);
        C148937Kh r5 = (C148937Kh) this.A01.A07();
        Number A0i = C86654Ky.A0i(this.A03);
        Number A0i2 = C86654Ky.A0i(this.A08);
        String str2 = (String) this.A06.A07();
        Bitmap bitmap = null;
        if (A1H == null || A0i == null || A0i2 == null || str2 == null) {
            AnonymousClass5YS.A00(this.A02, (Object) null);
            return;
        }
        if (A1H.A1J.A02) {
            A0o = C56972sr.A04(this.A09);
        } else {
            A0o = A1H.A0o();
        }
        if (r5 == null || !AnonymousClass75J.A00(A0o, r5.A01)) {
            str = null;
        } else {
            bitmap = r5.A00;
            str = r5.A02;
        }
        this.A02.A0H(new C149837Oc(bitmap, A1H.A0o(), str, str2, A0i2.intValue(), A0i.intValue()));
    }

    public final void A0F() {
        AnonymousClass08J r1;
        int i;
        int intValue;
        int i2 = 0;
        boolean A1W = AnonymousClass000.A1W(this.A04.A07());
        C624134x A1H = C86664Kz.A1H(this.A07);
        Number A0i = C86654Ky.A0i(this.A05);
        if (A1H == null || A0i == null) {
            r1 = this.A03;
            i = null;
        } else {
            if (!this.A0H || (A1H.A1J.A02 && !this.A0G)) {
                r1 = this.A03;
            } else if (!A1W || !((intValue = A0i.intValue()) == 1 || intValue == -1)) {
                r1 = this.A03;
                i = 1;
            } else {
                r1 = this.A03;
                i2 = 2;
            }
            i = Integer.valueOf(i2);
        }
        AnonymousClass5YS.A00(r1, i);
    }

    public AnonymousClass4VB(C56972sr r10, C64773Ex r11, C613330g r12, C43152Qz r13, C54292oU r14, AnonymousClass1VX r15, AnonymousClass4FS r16, int i, boolean z, boolean z2) {
        AnonymousClass08M A012 = AnonymousClass08M.A01();
        this.A04 = A012;
        AnonymousClass08M A013 = AnonymousClass08M.A01();
        this.A05 = A013;
        AnonymousClass08M A014 = AnonymousClass08M.A01();
        this.A08 = A014;
        AnonymousClass08M A015 = AnonymousClass08M.A01();
        this.A06 = A015;
        AnonymousClass08M A016 = AnonymousClass08M.A01();
        this.A07 = A016;
        AnonymousClass08J A0E2 = AnonymousClass4L0.A0E();
        this.A03 = A0E2;
        AnonymousClass08J A0E3 = AnonymousClass4L0.A0E();
        this.A01 = A0E3;
        AnonymousClass08J A0E4 = AnonymousClass4L0.A0E();
        this.A02 = A0E4;
        this.A0D = r14;
        this.A0E = r15;
        this.A09 = r10;
        this.A0F = r16;
        this.A0A = r11;
        this.A0C = r13;
        this.A0B = r12;
        this.A0H = z;
        this.A0G = z2;
        this.A00 = i;
        C86604Kt.A1O(A012, A0E2, this, 200);
        C86604Kt.A1O(A016, A0E2, this, 201);
        C86604Kt.A1O(A013, A0E2, this, 202);
        C86604Kt.A1O(A016, A0E3, this, 203);
        C86604Kt.A1O(A0E2, A0E3, this, 204);
        C86604Kt.A1O(A015, A0E3, this, 205);
        C86604Kt.A1O(A0E3, A0E4, this, 206);
        C86604Kt.A1O(A0E2, A0E4, this, 207);
        C86604Kt.A1O(A014, A0E4, this, 207);
        C86604Kt.A1O(A015, A0E4, this, 208);
    }
}
