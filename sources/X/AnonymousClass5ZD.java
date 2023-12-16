package X;

import com.whatsapp.R;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.5ZD  reason: invalid class name */
public final class AnonymousClass5ZD {
    public final C56972sr A00;
    public final C40142Er A01;
    public final C56612sH A02;
    public final C183538qC A03;
    public final C183538qC A04;
    public final AtomicBoolean A05 = C18280x3.A0l();
    public final AtomicLong A06 = new AtomicLong(0);
    public final AnonymousClass4C1 A07;
    public final AnonymousClass4C1 A08;
    public final AnonymousClass4C1 A09;

    public final void A04(String str, WeakReference weakReference) {
        String str2;
        String str3 = str;
        C162457s7.A0J(str3, 1);
        AtomicBoolean atomicBoolean = this.A05;
        if (atomicBoolean.get() || this.A02.A0H() - this.A06.get() <= 500) {
            str2 = "Avatar Editor is already launching.";
        } else {
            WeakReference weakReference2 = weakReference;
            C89654ea A002 = A00(weakReference2);
            if (A002 == null) {
                str2 = "Unable to obtain Activity reference.";
            } else {
                atomicBoolean.set(true);
                C55862r2 r15 = (C55862r2) this.A08.get();
                C43222Rg r3 = (C43222Rg) this.A09.get();
                C49652gs r7 = (C49652gs) this.A07.get();
                A002.BpA(0, R.string.f11nameremoved);
                C55782qu r4 = (C55782qu) this.A04.get();
                int A003 = r4.A00();
                r4.A01(A003, "launch_editor");
                r4.A05(C30121lt.A00, str3, A003);
                AnonymousClass7EP r8 = new AnonymousClass7EP();
                String str4 = r15.A02;
                if (str4 == null) {
                    str4 = C18280x3.A0Y();
                    r15.A02 = str4;
                }
                C162457s7.A0H(str4);
                C162457s7.A0J(str4, 1);
                Map map = r8.A00;
                map.put("logging_session_id", str4);
                map.put("logging_surface", "wa_settings");
                map.put("logging_mechanism", "wa_settings_item");
                StringBuilder A0A = C18330xA.A0A("{\"server_params\":{");
                Iterator A0q = AnonymousClass000.A0q(map);
                int i = 0;
                while (A0q.hasNext()) {
                    Map.Entry A0w = AnonymousClass001.A0w(A0q);
                    String A0q2 = C18310x6.A0q(A0w);
                    String A12 = AnonymousClass0x9.A12(A0w);
                    A0A.append("\"");
                    A0A.append(A0q2);
                    AnonymousClass001.A1K("\":\"", A12, "\"", A0A);
                    if (i < map.size() - 1) {
                        A0A.append(",");
                    }
                    i++;
                }
                String A0X = AnonymousClass000.A0X("}}", A0A);
                C162457s7.A0D(A0X);
                r4.A01(A003, "editor_params_ready");
                boolean A012 = r7.A01();
                r15.A05((Integer) null, (String) null, 1, A012);
                if (((C54612p0) r3.A04.get()).A00() == null) {
                    r4.A01(A003, "create_user");
                    r4.A00 = Integer.valueOf(A003);
                    r3.A01.BkP(new C70133a0(r3, 14, new C115225oK(this, r15, r4, A0X, weakReference2, A003, A012)));
                    return;
                }
                A03(r15, r4, A0X, weakReference2, A003, A012);
                return;
            }
        }
        Log.e(str2);
    }

    public static final Exception A01(AnonymousClass0JP r1) {
        if (r1.equals(AnonymousClass0F7.A00)) {
            return AnonymousClass001.A0e("Activity no longer active");
        }
        if (r1 instanceof AnonymousClass0F5) {
            return ((AnonymousClass0F5) r1).A00.A02;
        }
        if (r1.equals(AnonymousClass0F8.A00)) {
            return null;
        }
        if (r1 instanceof AnonymousClass0F6) {
            return ((AnonymousClass0F6) r1).A00;
        }
        throw C73153f1.A00();
    }

    public final void A03(C55862r2 r18, C55782qu r19, String str, WeakReference weakReference, int i, boolean z) {
        WeakReference weakReference2 = weakReference;
        C89654ea A002 = A00(weakReference2);
        if (A002 == null) {
            Log.e("Unable to obtain Activity reference.");
            this.A05.set(false);
            return;
        }
        WeakReference A14 = AnonymousClass0x9.A14(A002);
        boolean A0D = C107405bG.A0D(A002);
        PhoneUserJid A042 = C56972sr.A04(this.A00);
        C162457s7.A0H(A042);
        String rawString = A042.getRawString();
        ((C04290Nq) this.A03.get()).A00(new C116685qh(this, r18, r19, weakReference2, i, z), C1458977s.A00, "com.bloks.www.avatar.editor.cds.launcher.async", rawString, str, A14, A0D);
    }

    public AnonymousClass5ZD(C56972sr r4, C40142Er r5, C56612sH r6, C183538qC r7, C183538qC r8, AnonymousClass4C1 r9, AnonymousClass4C1 r10, AnonymousClass4C1 r11) {
        C18260x0.A0f(r6, r4, r5, r9, r7);
        C18260x0.A0W(r10, r8, r11);
        this.A02 = r6;
        this.A00 = r4;
        this.A01 = r5;
        this.A08 = r9;
        this.A03 = r7;
        this.A09 = r10;
        this.A04 = r8;
        this.A07 = r11;
    }

    public static final C89654ea A00(WeakReference weakReference) {
        C89654ea A0F = C18320x8.A0F(weakReference);
        if (A0F != null) {
            C89654ea r3 = null;
            if (!A0F.isDestroyed()) {
                r3 = A0F;
            }
            if (!A0F.isFinishing()) {
                return r3;
            }
        }
        return null;
    }

    public final void A02(C89654ea r4, AnonymousClass0JP r5) {
        if (A01(r5) instanceof IOException) {
            Log.e("AvatarEditorLauncher/unable to launch editor, network/io exception identified", A01(r5));
            r4.Box(new Object[0], 0, R.string.f11nameremoved);
        } else {
            r4.Bot(R.string.f11nameremoved);
        }
        Log.e("AvatarEditorLauncher/unable to load avatar", A01(r5));
    }
}
