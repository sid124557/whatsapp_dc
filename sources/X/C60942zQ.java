package X;

import org.json.JSONObject;

/* renamed from: X.2zQ  reason: invalid class name and case insensitive filesystem */
public abstract class C60942zQ {
    public final C56612sH A00;
    public final C50672ia A01;
    public final C183538qC A02;
    public final C183538qC A03;
    public final C183538qC A04;
    public final C183538qC A05;

    public final void A02(C84964Ek r11, AnonymousClass1Uz r12, Object obj, int i) {
        C162457s7.A0J(r12, 0);
        C84964Ek r5 = r11;
        C43342Rt r4 = new C43342Rt(r5, this, r12, obj, i);
        AnonymousClass30P A0M = C18320x8.A0M(this.A02);
        C50912iy r3 = AnonymousClass2BX.A00;
        C60272yH A012 = A0M.A01(r3);
        if (A012 == null) {
            r11.BSC(AnonymousClass001.A0e("user does not exist"), (Integer) null);
            return;
        }
        C626936e.A06(A012);
        ((C59532x4) this.A03.get()).A01(r3, new C66633Me(A012, r11, r4));
    }

    public static final /* synthetic */ void A00(C60272yH r6, C54662p5 r7, AnonymousClass36K r8, C84964Ek r9, C46882cM r10, C60942zQ r11, int i) {
        Exception exc;
        C70363aN r5 = new C70363aN(r7, r10, r6, 37);
        boolean z = true;
        if (i != 190) {
            if (i != 405) {
                if (i == 408 || i == 429 || i == 500) {
                    C60192y9 r1 = (C60192y9) r11.A04.get();
                    Long A012 = r7.A01();
                    if (A012 != null) {
                        r1.A00.Bkn(r5, "WaffleIQErrorHelper/retry", A012.longValue());
                        return;
                    }
                } else if (!(i == 503 || i == 400)) {
                    if (i != 401) {
                        if (i == 480) {
                            ((C60192y9) r11.A04.get()).A01(r7, new AnonymousClass28A(r5, 3, r9), new Exception(AnonymousClass000.A0Y("code=", AnonymousClass001.A0o(), 480)));
                            return;
                        } else if (i != 481) {
                            switch (i) {
                                case 483:
                                    ((C48782fT) ((C60192y9) r11.A04.get()).A04.get()).A00();
                                    break;
                                case 484:
                                    C183538qC r4 = r11.A05;
                                    ((AnonymousClass2F4) r4.get()).A00.A02.A05(Boolean.TRUE);
                                    if (r8 != null) {
                                        try {
                                            boolean A1U = AnonymousClass000.A1U(r8.A0b("ndc", 0), 1);
                                            if (r8.A0b("npr", 0) != 1) {
                                                z = false;
                                            }
                                            if (!A1U && !z) {
                                                C18320x8.A0M(((AnonymousClass2F4) r4.get()).A00.A05).A05(new C85934Ie(r5, 0, r9), AnonymousClass2BX.A00, (C54662p5) null, new AnonymousClass2MV(1, r6));
                                                return;
                                            }
                                        } catch (AnonymousClass24Y e) {
                                            r9.BSC(e, Integer.valueOf(i));
                                            return;
                                        }
                                    }
                                    break;
                                case 485:
                                    ((C60192y9) r11.A04.get()).A00(new C86324Jr(r5, 1, r9), new Exception(AnonymousClass000.A0Y("code=", AnonymousClass001.A0o(), 485)));
                                    return;
                                default:
                                    exc = AnonymousClass001.A0e(AnonymousClass000.A0Y("unsupported error: ", AnonymousClass001.A0o(), i));
                                    C626936e.A0A(exc);
                                    break;
                            }
                        } else {
                            r11.A04.get();
                            if (r7.A04()) {
                                r5.run();
                                return;
                            }
                        }
                    }
                }
            }
            exc = new Exception(AnonymousClass000.A0Y("code=", AnonymousClass001.A0o(), i));
            r9.BSC(exc, Integer.valueOf(i));
        }
        if (r7.A04()) {
            AnonymousClass30P A0M = C18320x8.A0M(r11.A02);
            AnonymousClass3MO r42 = new AnonymousClass3MO(r7, r9, r10, i);
            r11.A05.get();
            A0M.A03(r6, r42, new C54662p5(1, C625635p.A0L));
            return;
        }
        exc = new Exception(AnonymousClass000.A0Y("code=", AnonymousClass001.A0o(), i));
        r9.BSC(exc, Integer.valueOf(i));
    }

    public JSONObject A01(C60272yH r4, Object obj, JSONObject jSONObject) {
        if (this instanceof C34711vb) {
            C162457s7.A0J(obj, 2);
            JSONObject put = jSONObject.put("encrypted_payload", obj);
            C162457s7.A0D(put);
            return put;
        } else if (this instanceof C34701va) {
            AnonymousClass0PJ r5 = (AnonymousClass0PJ) obj;
            C162457s7.A0J(r5, 2);
            jSONObject.put("bloks_versioning_id", "6c404196454966428d798beeeffa89a9ea5cf915e4ff8a7448ab0b8135b0a3f9");
            jSONObject.put("app_id", r5.A00);
            jSONObject.put("params", r5.A01);
            jSONObject.put("user_agent", ((C34701va) this).A01.A00());
            return jSONObject;
        } else {
            AnonymousClass2PC r52 = (AnonymousClass2PC) obj;
            C162457s7.A0J(r52, 2);
            jSONObject.put("target_account_type", r52.A01);
            jSONObject.put("target_account_id", r52.A00);
            jSONObject.put("entry_point", r52.A02);
            return jSONObject;
        }
    }

    public C60942zQ(C56612sH r1, C50672ia r2, C183538qC r3, C183538qC r4, C183538qC r5, C183538qC r6) {
        this.A00 = r1;
        this.A01 = r2;
        this.A04 = r3;
        this.A02 = r4;
        this.A03 = r5;
        this.A05 = r6;
    }
}
