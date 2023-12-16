package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;

/* renamed from: X.1vy  reason: invalid class name and case insensitive filesystem */
public final class C34881vy extends C41022Iq {
    public final UserJid A00;
    public final UserJid A01;
    public final UserJid A02;
    public final UserJid A03;
    public final C34791vp A04;
    public final C34921w2 A05;

    public C34881vy(AnonymousClass36K r23) {
        Object obj;
        AnonymousClass36K r4 = r23;
        AnonymousClass36K.A0N(r4, "group");
        Class<String> cls = String.class;
        C626836d.A06(r4, cls, 10L, 50L, (Object) null, new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_ID}, false);
        Class<UserJid> cls2 = UserJid.class;
        Long A0R = AnonymousClass0x2.A0R();
        Long A0S = AnonymousClass0x2.A0S();
        AnonymousClass36K r11 = r4;
        this.A00 = (UserJid) C626836d.A05(r11, cls2, A0R, A0S, (Object) null, new String[]{"creator"}, false);
        this.A01 = (UserJid) C626836d.A05(r11, cls2, A0R, A0S, (Object) null, new String[]{"creator_pn"}, false);
        Class<Long> cls3 = Long.class;
        Long A0T = AnonymousClass0x2.A0T();
        AnonymousClass36K r15 = r4;
        Long l = A0S;
        C626836d.A06(r15, cls3, A0T, l, (Object) null, new String[]{"creation"}, false);
        Long A0U = AnonymousClass0x2.A0U();
        C626836d.A05(r4, cls, A0U, 20L, (Object) null, new String[]{"p_v_id"}, false);
        C626836d.A05(r4, cls, A0U, 20L, (Object) null, new String[]{"a_v_id"}, false);
        C626836d.A05(r15, cls3, A0T, l, (Object) null, new String[]{"s_t"}, false);
        this.A02 = (UserJid) C626836d.A05(r11, cls2, A0R, A0S, (Object) null, new String[]{"s_o"}, false);
        this.A03 = (UserJid) C626836d.A05(r11, cls2, A0R, A0S, (Object) null, new String[]{"s_o_pn"}, false);
        C626836d.A05(r4, cls, A0U, 20L, (Object) null, new String[]{"open_thread_id"}, false);
        try {
            obj = C626836d.A04(r4, C86304Jp.A00(40), new String[0]);
        } catch (AnonymousClass24Y unused) {
            obj = null;
        }
        this.A05 = (C34921w2) obj;
        this.A04 = (C34791vp) C626836d.A07(r4, "NamedSubject|UnnamedSubjectFallback", AnonymousClass0x2.A0i(new AnonymousClass4B7[]{C86304Jp.A00(41), C86304Jp.A00(42)}), new String[0]);
        this.A00 = r4;
    }
}
