package X;

import android.content.Context;
import com.whatsapp.R;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2sS  reason: invalid class name and case insensitive filesystem */
public final class C56722sS {
    public final C56972sr A00;
    public final C52802m4 A01;
    public final C44672Xa A02;
    public final C54862pP A03;
    public final C55382qG A04;
    public final C54292oU A05;
    public final C620733j A06;
    public final C46412ba A07;
    public final AnonymousClass1VX A08;
    public final C53322mu A09;
    public final C183538qC A0A;

    public UserJid A00(List list) {
        Object obj;
        C95814uZ r3 = null;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C155477ey.A00(((AnonymousClass3ZM) obj).A00)) {
                    break;
                }
            }
            AnonymousClass3ZM r1 = (AnonymousClass3ZM) obj;
            if (r1 != null) {
                r3 = r1.A00;
            }
        }
        return (UserJid) r3;
    }

    public String A01(UserJid userJid) {
        C162457s7.A0J(userJid, 0);
        C54002o1 A002 = ((C48902ff) this.A0A.get()).A00(userJid);
        if (A002 != null) {
            return A002.A07;
        }
        Context context = this.A05.A00;
        C162457s7.A0D(context);
        return C18290x4.A0l(context, R.string.f11nameremoved);
    }

    public boolean A03(Jid jid, byte b) {
        C162457s7.A0J(jid, 0);
        if (b != 88 || !C155477ey.A00(C106405Yw.A03(jid))) {
            return false;
        }
        return true;
    }

    public boolean A05(C624134x r7) {
        byte[] bArr;
        AnonymousClass1VX r2 = this.A08;
        C58422vE r1 = C58422vE.A02;
        if (r2.A0Y(r1, 4274)) {
            if (r2.A0Y(r1, 4165)) {
                C624134x A0w = r7.A0w();
                if (C624134x.A0b(r7) && A0w != null) {
                    return A0w.A1J.A02;
                }
            } else if (r7 instanceof C30351mJ) {
                C30351mJ r72 = (C30351mJ) r7;
                if (C624134x.A0b(r72) && (bArr = r72.A02) != null) {
                    try {
                        AnonymousClass1D1 r3 = ((AnonymousClass1B1) C130786cX.A05(AnonymousClass1B1.DEFAULT_INSTANCE, bArr)).botInfo_;
                        if (r3 == null) {
                            r3 = AnonymousClass1D1.DEFAULT_INSTANCE;
                        }
                        if ((r3.bitField0_ & 8) == 0 || !this.A00.A0a(C627336j.A02(Jid.Companion.A03(r3.targetSenderJid_)))) {
                            return false;
                        }
                        return true;
                    } catch (AnonymousClass6u5 e) {
                        Log.e("BonsaiUtilImpl/isBotResponseRequesterRevokeEnabled/", e);
                    }
                }
            }
        }
        return false;
    }

    public boolean A06(C624134x r3) {
        C53532nF A0r;
        C162457s7.A0J(r3, 0);
        if (!(r3 instanceof C30481mW) || !C57322tS.A00(r3) || r3.A0r() == null || r3.A0q() == null || (A0r = r3.A0r()) == null || A0r.A00 == null) {
            return false;
        }
        return true;
    }

    public final boolean A02(C95814uZ r4) {
        C620833k A002;
        C129526aS A042;
        if (!(r4 instanceof C28011fL) || (A002 = this.A07.A00((C28011fL) r4)) == null || (A042 = A002.A04()) == null || A042.isEmpty()) {
            return false;
        }
        Iterator it = A042.iterator();
        while (it.hasNext()) {
            if (C155477ey.A00(C18320x8.A0G(it).A03)) {
                return true;
            }
        }
        return false;
    }

    public boolean A07(C624134x r5) {
        C95814uZ r3 = r5.A1J.A00;
        if ((r3 instanceof UserJid) && (this.A08.A0Y(C58422vE.A02, 3142) || C155477ey.A00(r3))) {
            return true;
        }
        if ((r5.A0n() instanceof UserJid) && C155477ey.A00(r5.A0o())) {
            return true;
        }
        if (A00(r5.A18) == null || r5.A06 != 0) {
            return false;
        }
        return true;
    }

    public C56722sS(C56972sr r2, C52802m4 r3, C44672Xa r4, C54862pP r5, C55382qG r6, C54292oU r7, C620733j r8, C46412ba r9, AnonymousClass1VX r10, C53322mu r11, C183538qC r12) {
        C18260x0.A0f(r7, r10, r3, r2, r8);
        C18260x0.A0g(r5, r4, r11, r6, r12);
        C162457s7.A0J(r9, 11);
        this.A05 = r7;
        this.A08 = r10;
        this.A01 = r3;
        this.A00 = r2;
        this.A06 = r8;
        this.A03 = r5;
        this.A02 = r4;
        this.A09 = r11;
        this.A04 = r6;
        this.A0A = r12;
        this.A07 = r9;
    }

    public boolean A04(C624134x r3) {
        if (C155477ey.A00(C624134x.A07(r3).A00) || ((!r3.A1k() && A00(r3.A18) == null) || r3.A06 != 0)) {
            return false;
        }
        return true;
    }
}
