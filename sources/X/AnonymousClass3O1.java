package X;

import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.3O1  reason: invalid class name */
public class AnonymousClass3O1 implements AnonymousClass4AG, AnonymousClass4AJ, C85364Fy {
    public final C56972sr A00;
    public final C59542x5 A01;

    public void AyD(C55032pg r12, C624134x r13) {
        if (r13 instanceof C30391mN) {
            C30391mN r132 = (C30391mN) r13;
            C27991fJ r8 = r132.A02;
            String str = r132.A06;
            boolean z = r132.A07;
            long j = r132.A01;
            String str2 = r132.A05;
            String str3 = r132.A04;
            AnonymousClass1A4 r5 = r12.A00;
            C21821Dh r0 = ((AnonymousClass1EU) r5.A00).groupInviteMessage_;
            if (r0 == null) {
                r0 = C21821Dh.DEFAULT_INSTANCE;
            }
            C130546c9 A0H = r0.A0H();
            if (r8 != null) {
                if (str != null) {
                    C21821Dh r3 = (C21821Dh) C18320x8.A0C(A0H);
                    r3.bitField0_ |= 2;
                    r3.inviteCode_ = str;
                } else {
                    Log.e("FMessageGroupInvite/buildE2eMessage missing invite hash");
                }
                if (!r12.A02() || !z) {
                    C21821Dh r32 = (C21821Dh) C18320x8.A0C(A0H);
                    r32.bitField0_ |= 4;
                    r32.inviteExpiration_ = j;
                } else {
                    C21821Dh r33 = (C21821Dh) C18320x8.A0C(A0H);
                    r33.bitField0_ |= 4;
                    r33.inviteExpiration_ = 0;
                }
                if (str2 != null) {
                    C21821Dh r1 = (C21821Dh) C18320x8.A0C(A0H);
                    r1.bitField0_ |= 8;
                    r1.groupName_ = str2;
                }
                String A0g = C18300x5.A0g(A0H, r8);
                C21821Dh r14 = (C21821Dh) A0H.A00;
                A0g.getClass();
                r14.bitField0_ |= 1;
                r14.groupJid_ = A0g;
                if (!TextUtils.isEmpty(str3)) {
                    C21821Dh r15 = (C21821Dh) C18320x8.A0C(A0H);
                    str3.getClass();
                    r15.bitField0_ |= 32;
                    r15.caption_ = str3;
                }
                C614630w A0y = r132.A0y();
                if (!(A0y == null || A0y.A09() == null)) {
                    C172548Lq A09 = C18270x1.A09(A0H, A0y.A09());
                    C21821Dh r16 = (C21821Dh) A0H.A00;
                    r16.bitField0_ |= 16;
                    r16.jpegThumbnail_ = A09;
                }
                AnonymousClass3Z2 r2 = r12.A01;
                byte[] bArr = r12.A09;
                if (C59542x5.A01(r2, r132, bArr)) {
                    AnonymousClass1EF A002 = C55032pg.A00(this.A01, r12, r2, r132, bArr);
                    C21821Dh r17 = (C21821Dh) C18320x8.A0C(A0H);
                    A002.getClass();
                    r17.contextInfo_ = A002;
                    r17.bitField0_ |= 64;
                }
                AnonymousClass1EU A0T = C18290x4.A0T(r5);
                C21821Dh r02 = (C21821Dh) A0H.A06();
                r02.getClass();
                A0T.groupInviteMessage_ = r02;
                A0T.bitField0_ |= 4194304;
                return;
            }
            Log.w("FMessageGroupInvite/buildE2eMessage failed to build e2e message");
            return;
        }
        throw AnonymousClass001.A0c("FMessageGroupInviteProtobuf/not supported message");
    }

    public C624134x BgW(C55962rC r6) {
        UserJid A03;
        AnonymousClass22V r1;
        AnonymousClass1EU r4 = r6.A0B;
        if ((r4.bitField0_ & 4194304) == 0) {
            return null;
        }
        C30391mN r3 = new C30391mN(r6.A0D, r6.A05);
        C21821Dh r2 = r4.groupInviteMessage_;
        if (r2 == null) {
            r2 = C21821Dh.DEFAULT_INSTANCE;
        }
        C56972sr r42 = this.A00;
        AnonymousClass2z0 r12 = r3.A1J;
        if (r12.A02) {
            A03 = C56972sr.A04(r42);
        } else {
            A03 = AnonymousClass32Y.A03(r12.A00);
        }
        r3.A03 = A03;
        r3.A02 = AnonymousClass34R.A04(r2.groupJid_);
        r3.A05 = r2.groupName_;
        r3.A01 = r2.inviteExpiration_;
        r3.A06 = r2.inviteCode_;
        r3.A04 = r2.caption_;
        int i = r2.groupType_;
        if (i == 0 || i != 1) {
            r1 = AnonymousClass22V.DEFAULT;
        } else {
            r1 = AnonymousClass22V.PARENT;
        }
        r3.A00 = AnonymousClass000.A1Y(r1, AnonymousClass22V.PARENT) ? 1 : 0;
        byte[] A07 = r2.jpegThumbnail_.A07();
        if (A07.length > 0) {
            r3.A1D(1);
            r3.A0y().A04(A07, r6.A0O);
        }
        return r3;
    }

    public AnonymousClass3O1(C56972sr r1, C59542x5 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
