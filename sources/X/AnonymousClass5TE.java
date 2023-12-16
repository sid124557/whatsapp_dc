package X;

import android.app.Activity;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.5TE  reason: invalid class name */
public final class AnonymousClass5TE {
    public boolean A00;
    public final C69263Wi A01;
    public final AnonymousClass30P A02;
    public final C614430u A03;
    public final AnonymousClass5I9 A04;
    public final C84224Bn A05;
    public final AnonymousClass2Z5 A06;
    public final C183538qC A07;

    public final void A00(Activity activity) {
        C117105rO.A00(this.A01, activity, 35);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WaffleClientAndBloksAcFlowLoggerImpl/cancelUserFlowWithPoint: marker=");
        C86634Kw.A1T(A0o, 891960492);
        C18260x0.A0q(", point=", "SEE_AC_LOAD_ERROR", A0o);
    }

    public final void A01(C009707r r20, AnonymousClass64K r21, AnonymousClass5H1 r22, String str, String str2, String str3, String str4, List list) {
        Object obj;
        String str5;
        String str6;
        AnonymousClass5H1 r14 = r22;
        if (r22 == null) {
            r14 = new AnonymousClass5H1();
        }
        String str7 = str2;
        C162457s7.A0J(str7, 1);
        r14.A00.put("flow", str7);
        C1238069v r13 = new C1238069v(r21, 0, this);
        AnonymousClass356.A03("WfalLauncherProxy/launch Start Launching");
        AnonymousClass30P r6 = this.A02;
        C50912iy r5 = AnonymousClass2BX.A00;
        C60272yH A012 = r6.A01(r5);
        if (A012 != null) {
            obj = A012.A04.A00;
            C626936e.A06(obj);
        } else {
            obj = null;
        }
        boolean z = false;
        boolean A1W = AnonymousClass000.A1W(obj);
        C614430u r4 = this.A03;
        Boolean A022 = r4.A02();
        if (A022 != null) {
            z = A022.booleanValue();
        }
        AnonymousClass5I9 r12 = this.A04;
        if (r12.A00) {
            r12.A01.BKg("MARKER_STARTED_BEFORE_PREVIOUS_ENDED", 551491402, 87);
            r12.A00 = false;
        }
        C186568vZ r3 = r12.A01;
        r3.markerStart(551491402);
        r3.markerPoint(551491402, "TRIGGER_OPEN");
        r3.markerAnnotate(551491402, "entrypoint", str7);
        r3.markerAnnotate(551491402, "is_post_consent", A1W);
        r3.markerAnnotate(551491402, "is_paused", z);
        C84224Bn r2 = this.A05;
        String str8 = str3;
        StringBuilder A0g = C18280x3.A0g(str8, 0);
        A0g.append("WaffleClientAndBloksAcFlowLoggerImpl/startUserFlowWithPoint: marker=");
        C86634Kw.A1T(A0g, 891960492);
        C18260x0.A0q(", point=", "TAP_AC_ENTRY_POINT", A0g);
        int hashCode = str7.hashCode();
        if (hashCode == 554361336) {
            if (str7.equals("wa_settings")) {
                str5 = "AC_ENTRY_FLOW";
            }
            str5 = "UNSUPPORTED_FLOW";
        } else if (hashCode != 949197458) {
            if (hashCode == 975802643 && str7.equals("wa_crosspost_status_privacy_settings")) {
                str5 = "STATUS_PRIVACY_SETTINGS_FLOW";
            }
            str5 = "UNSUPPORTED_FLOW";
        } else {
            if (str7.equals("wa_crosspost_existing_status")) {
                str5 = "CAL_FLOW";
            }
            str5 = "UNSUPPORTED_FLOW";
        }
        r2.Ax0("flow_type", str5);
        r2.Ax0("ui_entrypoint", str8);
        if (str7 == "wa_crosspost_status_privacy_settings") {
            if (r4.A01().A00) {
                str6 = "on";
            } else {
                str6 = "off";
            }
            r2.Ax0("init_autoshare_state", str6);
        }
        this.A00 = false;
        this.A01.A0T(new C117105rO(this, 36), 400);
        r3.markerPoint(551491402, "FETCH_ASYNC_ACTION");
        String str9 = str;
        C162457s7.A0J(str9, 2);
        C009707r r122 = r20;
        String str10 = str4;
        List list2 = list;
        if ("com.bloks.www.fxcal.playground.whatsapp_link".equals(str9) || !(r6.A01(r5) == null || r4.A02() == Boolean.TRUE)) {
            this.A06.A00(new C114125mX(r122, r13, r14, this, str9, str10, list2));
        } else {
            A02(r122, r13, r14, str9, str10, list2);
        }
    }

    public final void A02(C009707r r22, AnonymousClass64K r23, AnonymousClass5H1 r24, String str, String str2, List list) {
        AnonymousClass5K4 r2 = (AnonymousClass5K4) this.A07.get();
        C009707r r9 = r22;
        boolean A0D = C107405bG.A0D(r9);
        StringBuilder A0A = C18330xA.A0A("{\"server_params\":{");
        Map map = r24.A00;
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
        C111455i7 r1 = new C111455i7(r9, r23, this);
        String str3 = str;
        C04890Rb.A01(str3, "App id cannot be null");
        C47382dA r8 = new C47382dA(r9, r9.getSupportFragmentManager(), r2.A00, r2.A04, r2.A05, str2, (Map) null, A0D);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AnonymousClass5HC r0 = (AnonymousClass5HC) it.next();
                r8.A00.put(r0.A00, r0.A01);
            }
        }
        r2.A03.A00(r9, r2.A01, r8);
        r2.A02.A03((AnonymousClass39C) null, new C116695qi(r9, r1, r2, r8), (Boolean) null, str3, A0X, (String) null);
    }

    public AnonymousClass5TE(C69263Wi r1, AnonymousClass30P r2, C614430u r3, AnonymousClass5I9 r4, C84224Bn r5, AnonymousClass2Z5 r6, C183538qC r7) {
        C18260x0.A0c(r1, r3, r7, r2);
        C18260x0.A0U(r5, r4);
        this.A01 = r1;
        this.A03 = r3;
        this.A07 = r7;
        this.A02 = r2;
        this.A06 = r6;
        this.A05 = r5;
        this.A04 = r4;
    }
}
