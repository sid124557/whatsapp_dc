package X;

import com.whatsapp.util.Log;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.7lA  reason: invalid class name and case insensitive filesystem */
public final class C159127lA {
    public int A00;
    public C151217Tw A01;
    public C184528ry A02;
    public C368820c A03;
    public C160717oC A04;
    public C48722fM A05;
    public AnonymousClass7SR A06;
    public C152677Zw A07;
    public String A08;
    public String A09;
    public List A0A;
    public Map A0B;
    public Map A0C;
    public boolean A0D;
    public boolean A0E;
    public final AnonymousClass4CD A0F;
    public final C29171iO A0G;
    public final C39912Du A0H;
    public final AnonymousClass2VP A0I;
    public final AnonymousClass2E3 A0J;
    public final C69263Wi A0K;
    public final AnonymousClass282 A0L;
    public final AnonymousClass1j2 A0M;
    public final AnonymousClass7EK A0N;
    public final C150567Rh A0O;
    public final C150577Ri A0P;
    public final C40622Hc A0Q;
    public final C184548s0 A0R;
    public final C48182eU A0S;
    public final C54522or A0T;
    public final C60482yd A0U;
    public final C183538qC A0V;
    public final Runnable A0W;
    public final String A0X;
    public final String A0Y;
    public final String A0Z;
    public final String A0a;
    public final String A0b;
    public final String A0c;

    public AnonymousClass48Q A00(String str) {
        C55212pz r1;
        C162457s7.A0J(str, 0);
        C45422Zz B95 = this.A0R.B95(str);
        if (B95 != null) {
            r1 = B95.A00();
        } else {
            r1 = null;
        }
        if (r1 instanceof AnonymousClass48Q) {
            return (AnonymousClass48Q) r1;
        }
        return null;
    }

    public final void A07(C60752z6 r15, String str, Map map, short s) {
        String str2;
        Object A0c2;
        C152677Zw r1 = this.A07;
        if (r1 != null) {
            r1.A01 = false;
        }
        if (this.A0E) {
            return;
        }
        if (A0A()) {
            A08((C60752z6) null, (Map) null);
            return;
        }
        AnonymousClass1j2 r0 = this.A0M;
        r0.A03.A07(this.A00, s);
        C60752z6 r9 = r15;
        String str3 = str;
        Map map2 = map;
        if (str == null) {
            C151217Tw r4 = this.A01;
            if (r4 == null) {
                throw C18270x1.A0S("flowManager");
            }
            Stack stack = r4.A04;
            String str4 = (String) ((Deque) C162457s7.A03(stack)).pollFirst();
            if (str4 != null) {
                r4.A00.A00(str4, map2, false);
            } else if (stack.size() > 1) {
                stack.pop();
                String str5 = (String) r4.A03.pop();
                C150567Rh r42 = r4.A00;
                C162457s7.A0H(str5);
                C162457s7.A0J(str5, 0);
                C159127lA r12 = r42.A00;
                r12.A0Q.A00.pop();
                C160717oC r7 = r12.A04;
                if (r7 == null) {
                    throw C18270x1.A0S("backNavManager");
                }
                String A0j = AnonymousClass001.A0j(AnonymousClass000.A0l(str5), ':');
                C152387Yr r2 = r7.A04;
                List A0K2 = C73723fy.A0K(AnonymousClass002.A0J(r2.A02), AnonymousClass002.A0J(r2.A01));
                ArrayList A0s = AnonymousClass001.A0s();
                ArrayList A0s2 = AnonymousClass001.A0s();
                Iterator it = A0K2.iterator();
                while (true) {
                    str2 = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (!C175738Zn.A0Y(((AnonymousClass7YO) next).A01, A0j, false)) {
                        A0s.add(next);
                    } else {
                        A0s2.add(next);
                    }
                }
                if (A0s.isEmpty()) {
                    A0c2 = null;
                } else {
                    A0c2 = C18300x5.A0c(A0s);
                }
                AnonymousClass7YO r02 = (AnonymousClass7YO) A0c2;
                if (r02 != null) {
                    str2 = r02.A01;
                }
                r7.A00(str2);
                Object pollFirst = ((Deque) C162457s7.A03(stack)).pollFirst();
                C626936e.A06(pollFirst);
                String str6 = (String) pollFirst;
                C162457s7.A0H(str6);
                r42.A00(str6, map2, true);
            } else {
                A08(r15, map2);
            }
        } else {
            A06(r9, str3, map2, (Map) null, false);
        }
    }

    public final void A01() {
        AnonymousClass1j2 r3 = this.A0M;
        r3.A03(this.A00, "session_id", this.A0c);
        String str = this.A09;
        if (str != null) {
            r3.A03(this.A00, "product_session_id", str);
        }
    }

    public final void A02(C184528ry r19, String str, Map map, Map map2, boolean z) {
        boolean z2;
        Map map3;
        C55212pz r0;
        Boolean bool;
        this.A0G.A06(this.A0F);
        this.A02 = r19;
        String str2 = this.A0b;
        if (str2 != null) {
            this.A07 = this.A0S.A00(str2);
        }
        Map map4 = map;
        Map A0D2 = C73813g7.A0D(map4);
        this.A0B = A0D2;
        this.A09 = AnonymousClass0x2.A0c("product_qpl_session_id", A0D2);
        Object obj = map4.get("is_modal_on_screen");
        if (!(obj instanceof Boolean) || (bool = (Boolean) obj) == null) {
            z2 = false;
        } else {
            z2 = bool.booleanValue();
        }
        AnonymousClass2E3 r02 = this.A0J;
        String str3 = this.A0a;
        AnonymousClass7EK r6 = this.A0N;
        C64333Db r1 = r02.A00.A01;
        C152387Yr r7 = new C152387Yr();
        C160717oC r4 = new C160717oC((AnonymousClass282) r1.AQc.get(), r6, r7, (C60482yd) r1.AZ5.get(), str3, z2);
        this.A04 = r4;
        C54522or r2 = r4.A05;
        r2.A00(new AnonymousClass90X(r4, 2), C197989eC.class, r4);
        r2.A00(new AnonymousClass90X(r4, 3), C172078Jn.class, r4);
        r2.A00(new AnonymousClass90X(r4, 4), C69313Wn.class, r4);
        C39912Du r03 = this.A0H;
        String str4 = this.A0Z;
        C151217Tw r62 = new C151217Tw(this.A0O, (C60482yd) r03.A00.A01.AZ5.get(), str4, str3);
        this.A01 = r62;
        r62.A04.add(AnonymousClass0x9.A18());
        r62.A03.add(r62.A02);
        r62.A01.A00(new AnonymousClass90X(r62, 0), C172098Jp.class, r62);
        this.A05 = this.A0I.A00(str3);
        C152677Zw r63 = this.A07;
        if (r63 != null && !r63.A08.isEmpty()) {
            for (AnonymousClass7ZL r9 : r63.A08) {
                Map map5 = r63.A05.A07;
                String str5 = r9.A01;
                if (map5.get(str5) instanceof C137066ni) {
                    Object obj2 = map5.get(str5);
                    C162457s7.A0K(obj2, "null cannot be cast to non-null type com.whatsapp.payments.phoenix.flowconfigurationservice.state.FcsResourceState");
                    C137066ni r72 = (C137066ni) obj2;
                    C45422Zz B95 = this.A0R.B95(r72.A04);
                    if (B95 != null) {
                        r0 = B95.A00();
                    } else {
                        r0 = null;
                    }
                    if ((r0 instanceof AnonymousClass1jJ) && r9.A00 == C996857p.COMPLETE) {
                        C160717oC r04 = this.A04;
                        if (r04 == null) {
                            throw C18270x1.A0S("backNavManager");
                        }
                        String A002 = r72.A00();
                        C162457s7.A0J(A002, 0);
                        C152387Yr r22 = r04.A04;
                        Stack stack = r22.A01;
                        if (stack.size() == 0) {
                            stack.add(new AnonymousClass7YO(A002, false));
                        }
                        r22.A02.add(new AnonymousClass7YO(A002, false));
                        C160717oC r05 = this.A04;
                        if (r05 == null) {
                            throw C18270x1.A0S("backNavManager");
                        }
                        Map map6 = r9.A02;
                        C152387Yr r06 = r05.A04;
                        AnonymousClass7YP r23 = new AnonymousClass7YP(r72, map6);
                        r06.A00.put(r23.A00.A00(), r23);
                    }
                }
            }
        }
        String str6 = this.A0c;
        Object obj3 = map4.get(C373721z.REFERRAL.key);
        JSONObject A1G = AnonymousClass0x9.A1G();
        A1G.put("config", str4);
        A1G.put("isStartingState", true);
        A1G.put("sessionId", str6);
        A1G.put("referral", obj3);
        if (A0A()) {
            A08((C60752z6) null, (Map) null);
            return;
        }
        C152677Zw r07 = this.A07;
        boolean z3 = z;
        if (r07 != null) {
            r07.A01 = z3;
        }
        C54522or r24 = this.A0T;
        r24.A01(new C69323Wo());
        String str7 = str;
        if (z) {
            map3 = map2;
        } else {
            map3 = map4;
        }
        A06((C60752z6) null, str7, map3, (Map) null, false);
        r24.A00(new AnonymousClass90X(this, 1), C69293Wl.class, this);
    }

    /* JADX WARNING: type inference failed for: r24v2, types: [java.util.Map] */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b0, code lost:
        if (r10.A04.A01.size() == 0) goto L_0x00b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c7, code lost:
        if (r1.size() == 1) goto L_0x00b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00cd, code lost:
        r14 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00e4, code lost:
        if (r1 != false) goto L_0x00e6;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0235  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x025a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(X.C368820c r30, X.C55212pz r31, X.AnonymousClass211 r32, X.C137066ni r33, X.C60752z6 r34, java.lang.String r35, java.util.Map r36) {
        /*
            r29 = this;
            r9 = r31
            java.lang.String r7 = r9.A02()
            java.lang.String r2 = "resource_id"
            r6 = r29
            X.1j2 r1 = r6.A0M
            int r0 = r6.A00
            r1.A03(r0, r2, r7)
            r6.A01()
            r8 = r36
            if (r36 == 0) goto L_0x007d
            X.21y r0 = X.C373621y.ERROR
            java.lang.String r0 = r0.key
            java.lang.Object r3 = r8.get(r0)
        L_0x0020:
            java.util.List r2 = r6.A0A
            r1 = r8
            if (r36 != 0) goto L_0x0029
            java.util.Map r1 = X.C73813g7.A0A()
        L_0x0029:
            r28 = r33
            r0 = r28
            java.util.Map r0 = r0.A07
            java.util.Map r1 = X.C160977ol.A03(r1, r0)
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Any?>"
            X.C162457s7.A0K(r1, r0)
            java.util.Map r5 = X.AnonymousClass360.A02(r1)
            if (r3 == 0) goto L_0x0045
            X.21y r0 = X.C373621y.ERROR
            java.lang.String r0 = r0.key
            r5.put(r0, r3)
        L_0x0045:
            if (r2 == 0) goto L_0x004c
            java.lang.String r0 = "entry_screens"
            r5.put(r0, r2)
        L_0x004c:
            boolean r0 = r9 instanceof X.AnonymousClass4G8
            r13 = 1
            r12 = 0
            if (r0 == 0) goto L_0x005a
            r6.A0D = r13
            java.lang.String r0 = r28.A00()
            r6.A08 = r0
        L_0x005a:
            java.lang.String r0 = "context"
            java.lang.Object r4 = r5.get(r0)
            boolean r0 = r4 instanceof java.lang.String
            if (r0 == 0) goto L_0x007b
            java.lang.String r4 = (java.lang.String) r4
        L_0x0066:
            boolean r0 = r9 instanceof X.AnonymousClass1jJ
            java.lang.String r15 = "initialStateMachineInput"
            java.lang.String r17 = "backNavManager"
            r16 = r32
            if (r0 == 0) goto L_0x0115
            X.7Tw r1 = r6.A01
            if (r1 != 0) goto L_0x007f
            java.lang.String r0 = "flowManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x007b:
            r4 = 0
            goto L_0x0066
        L_0x007d:
            r3 = 0
            goto L_0x0020
        L_0x007f:
            java.util.Stack r1 = r1.A03
            java.lang.Object r2 = X.C162457s7.A03(r1)
            java.lang.String r2 = (java.lang.String) r2
            java.util.Map r11 = r6.A0B
            if (r11 != 0) goto L_0x0090
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r15)
            throw r0
        L_0x0090:
            X.7oC r10 = r6.A04
            if (r10 != 0) goto L_0x0099
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r17)
            throw r0
        L_0x0099:
            r1 = r16
            X.C162457s7.A0J(r1, r12)
            int r3 = r16.ordinal()
            r14 = 1
            if (r3 == r13) goto L_0x00bb
            r1 = 2
            if (r3 == r1) goto L_0x00bb
            X.7Yr r1 = r10.A04
            java.util.Stack r1 = r1.A01
            int r1 = r1.size()
            if (r1 != 0) goto L_0x00cd
        L_0x00b2:
            X.7oC r3 = r6.A04
            if (r3 != 0) goto L_0x00cf
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r17)
            throw r0
        L_0x00bb:
            boolean r3 = r10.A01
            X.7Yr r1 = r10.A04
            if (r3 == 0) goto L_0x00ca
            java.util.Stack r1 = r1.A02
        L_0x00c3:
            int r1 = r1.size()
            if (r1 != r13) goto L_0x00cd
            goto L_0x00b2
        L_0x00ca:
            java.util.Stack r1 = r1.A01
            goto L_0x00c3
        L_0x00cd:
            r14 = 0
            goto L_0x00b2
        L_0x00cf:
            boolean r1 = r3.A01
            if (r1 != 0) goto L_0x00e6
            X.7Yr r3 = r3.A04
            java.util.Stack r1 = r3.A01
            int r1 = r1.size()
            if (r1 == 0) goto L_0x00e6
            X.7YO r1 = r3.A00()
            boolean r1 = r1.A00
            r3 = 1
            if (r1 == 0) goto L_0x00e7
        L_0x00e6:
            r3 = 0
        L_0x00e7:
            X.7Zw r10 = r6.A07
            X.C162457s7.A0J(r2, r12)
            if (r14 == 0) goto L_0x0109
            java.lang.String r14 = "overwrite_first_screen_presentation"
            java.lang.Object r1 = r11.get(r14)
            boolean r1 = r1 instanceof java.util.Map
            if (r1 == 0) goto L_0x0109
            java.lang.Object r14 = r11.get(r14)
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>"
            X.C162457s7.A0K(r14, r1)
        L_0x0101:
            java.util.Map r14 = (java.util.Map) r14
        L_0x0103:
            X.7O0 r11 = new X.7O0
            r11.<init>(r10, r2, r14, r3)
            goto L_0x0116
        L_0x0109:
            java.lang.String r1 = "presentation"
            java.lang.Object r14 = r5.get(r1)
            boolean r1 = r14 instanceof java.util.Map
            if (r1 != 0) goto L_0x0101
            r14 = 0
            goto L_0x0103
        L_0x0115:
            r11 = 0
        L_0x0116:
            java.lang.String r22 = r28.A00()
            int r14 = r6.A00
            java.lang.String r10 = r6.A0Y
            X.7oC r1 = r6.A04
            if (r1 != 0) goto L_0x0127
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r17)
            throw r0
        L_0x0127:
            boolean r3 = r1.A01
            java.util.Map r2 = r6.A0B
            if (r2 != 0) goto L_0x0132
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r15)
            throw r0
        L_0x0132:
            X.7Zw r1 = r6.A07
            X.2nw r15 = new X.2nw
            r19 = r30
            r24 = r35
            r25 = r2
            r26 = r14
            r27 = r3
            r18 = r15
            r20 = r11
            r21 = r1
            r23 = r10
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27)
            X.8Iv r10 = new X.8Iv
            r18 = r10
            r19 = r6
            r20 = r9
            r21 = r28
            r22 = r7
            r23 = r4
            r24 = r8
            r18.<init>(r19, r20, r21, r22, r23, r24)
            int r2 = r16.ordinal()
            java.lang.String r16 = "fcsLoadingEventManager"
            r25 = r34
            if (r2 == r12) goto L_0x0182
            r1 = 2
            if (r2 == r1) goto L_0x0174
            X.2fM r1 = r6.A05
            if (r1 != 0) goto L_0x020c
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r16)
            throw r0
        L_0x0174:
            r20 = 0
            X.2fM r0 = r6.A05
            if (r0 != 0) goto L_0x017f
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r16)
            throw r0
        L_0x017f:
            X.21K r19 = X.AnonymousClass21K.ON_RESTORE
            goto L_0x01f9
        L_0x0182:
            r20 = 0
            if (r0 == 0) goto L_0x01e0
            X.7oC r14 = r6.A04
            if (r14 != 0) goto L_0x018f
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r17)
            throw r0
        L_0x018f:
            X.C626936e.A06(r11)
            X.C162457s7.A0D(r11)
            java.lang.String r3 = r28.A00()
            org.json.JSONObject r2 = X.AnonymousClass0x9.A1G()
            java.lang.String r1 = "isModalOnScreen"
            boolean r0 = r14.A01
            org.json.JSONObject r1 = r2.put(r1, r0)
            X.6vo r2 = r11.A02
            java.lang.String r0 = "presentationType"
            org.json.JSONObject r1 = r1.put(r0, r2)
            java.lang.String r0 = "backstack_input"
            org.json.JSONObject r0 = r1.put(r0, r8)
            X.C162457s7.A0D(r0)
            X.6wB r0 = r11.A03
            r14.A00 = r0
            X.6vo r0 = X.C141586vo.MODAL
            if (r2 != r0) goto L_0x01e9
            X.7Yr r2 = r14.A04
            java.util.Stack r1 = r2.A02
            int r0 = r1.size()
            if (r0 != 0) goto L_0x01e9
            X.C162457s7.A0J(r3, r12)
            X.7YO r0 = new X.7YO
            r0.<init>(r3, r13)
            r1.add(r0)
        L_0x01d3:
            X.C162457s7.A0J(r3, r12)
            java.util.Stack r1 = r2.A01
        L_0x01d8:
            X.7YO r0 = new X.7YO
            r0.<init>(r3, r13)
            r1.add(r0)
        L_0x01e0:
            X.2fM r0 = r6.A05
            if (r0 != 0) goto L_0x01f7
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r16)
            throw r0
        L_0x01e9:
            X.7Yr r2 = r14.A04
            java.util.Stack r1 = r2.A02
            int r0 = r1.size()
            if (r0 == 0) goto L_0x01d3
            X.C162457s7.A0J(r3, r12)
            goto L_0x01d8
        L_0x01f7:
            X.21K r19 = X.AnonymousClass21K.ON_START
        L_0x01f9:
            java.lang.String r22 = r28.A00()
            r21 = r7
            r24 = r20
            r18 = r0
            r18.A00(r19, r20, r21, r22, r23, r24)
            r0 = r25
            r9.A06(r15, r10, r0, r5)
            goto L_0x0231
        L_0x020c:
            X.21K r19 = X.AnonymousClass21K.ON_RESUME
            java.lang.String r22 = r28.A00()
            r3 = 0
            r20 = r3
            r21 = r7
            r24 = r3
            r18 = r1
            r18.A00(r19, r20, r21, r22, r23, r24)
            if (r0 == 0) goto L_0x023a
            X.1jJ r9 = (X.AnonymousClass1jJ) r9
            if (r9 == 0) goto L_0x023a
            java.lang.String r0 = r6.A0a
            r11 = r9
            r12 = r15
            r13 = r10
            r14 = r25
            r15 = r0
            r16 = r5
            r11.A08(r12, r13, r14, r15, r16)
        L_0x0231:
            X.7oC r0 = r6.A04
            if (r0 != 0) goto L_0x025a
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r17)
            throw r0
        L_0x023a:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Failed to resume "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = ". Resume is only supported for UI resource states."
            java.lang.String r2 = X.AnonymousClass000.A0X(r0, r1)
            com.whatsapp.util.Log.e((java.lang.String) r2)
            java.lang.String r1 = "FailToResume"
            X.2z6 r0 = new X.2z6
            r0.<init>(r3, r1, r2)
            r6.A08(r0, r3)
            goto L_0x0231
        L_0x025a:
            X.7Yr r1 = r0.A04
            X.7YP r2 = new X.7YP
            r0 = r28
            r2.<init>(r0, r8)
            java.util.Map r1 = r1.A00
            X.6ni r0 = r2.A00
            java.lang.String r0 = r0.A00()
            r1.put(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C159127lA.A03(X.20c, X.2pz, X.211, X.6ni, X.2z6, java.lang.String, java.util.Map):void");
    }

    public final void A04(AnonymousClass211 r23, C137066ni r24, C60752z6 r25, String str, Map map) {
        C55212pz A002;
        C184548s0 r0 = this.A0R;
        C137066ni r9 = r24;
        String str2 = r9.A04;
        C45422Zz B95 = r0.B95(str2);
        if (B95 == null || (A002 = B95.A00()) == null) {
            String A0V2 = AnonymousClass000.A0V("Resource not found: ", str2, AnonymousClass001.A0o());
            Log.e(A0V2);
            A08(new C60752z6((Integer) null, "ResourceNotFound", A0V2), (Map) null);
            return;
        }
        if (!A002.A00) {
            if (A002 instanceof AnonymousClass4GA) {
                ((AnonymousClass4GA) A002).AxJ(this.A0a);
            }
            A002.A03();
        }
        AnonymousClass211 r8 = r23;
        C60752z6 r10 = r25;
        Map map2 = map;
        if (r8.ordinal() != 0) {
            A05(r9, map2);
            A03(this.A03, A002, r8, r9, r10, str, map2);
        } else {
            if (A002 instanceof AnonymousClass1jJ) {
                C160717oC r6 = this.A04;
                if (r6 == null) {
                    throw C18270x1.A0S("backNavManager");
                }
                C368820c r3 = this.A03;
                String A003 = r9.A00();
                C152387Yr r02 = r6.A04;
                boolean A012 = r02.A01(A003);
                boolean A022 = r02.A02(A003);
                if (A012 || A022) {
                    if (r3 == null) {
                        r3 = C368820c.FORWARD_LOOPBACK;
                    }
                    r6.A04(r3, r10, A003, (String) null, map2);
                    AnonymousClass1j2 r03 = this.A0M;
                    r03.A03.A07(this.A00, 4);
                    return;
                }
            }
            if (A002 instanceof AnonymousClass4G8) {
                C160717oC r04 = this.A04;
                if (r04 == null) {
                    throw C18270x1.A0S("backNavManager");
                } else if (r04.A04.A01.size() != 0 && this.A0D) {
                    String str3 = this.A08;
                    C626936e.A06(str3);
                    C48722fM r1 = this.A05;
                    if (r1 == null) {
                        throw C18270x1.A0S("fcsLoadingEventManager");
                    }
                    C162457s7.A0H(str3);
                    r1.A01((C60752z6) null, "onStartLoading", str3, (Map) null);
                    Map A032 = C160977ol.A03(map2, r9.A07);
                    C162457s7.A0K(A032, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Any?>");
                    Map A023 = AnonymousClass360.A02(A032);
                    int i = this.A00;
                    ((AnonymousClass4G8) A002).BhG(new C46772cB(this, A002, r9, r10, str3, map2), this.A0Y, A023, i);
                }
            }
            A05(r9, map2);
            A03((C368820c) null, A002, AnonymousClass211.EXECUTE, r9, r10, (String) null, map2);
        }
        if (A002 instanceof AnonymousClass1jJ) {
            this.A03 = null;
        }
    }

    public final void A05(AnonymousClass7SR r8, Map map) {
        C55212pz A002;
        Stack stack;
        this.A06 = r8;
        int hashCode = r8.hashCode();
        this.A00 = hashCode;
        AnonymousClass1j2 r3 = this.A0M;
        C151217Tw r0 = this.A01;
        if (r0 == null) {
            throw C18270x1.A0S("flowManager");
        }
        r3.A01(hashCode, (String) C162457s7.A03(r0.A03));
        String str = r8.A01;
        r3.A03(this.A00, "state_name", str);
        A01();
        C151217Tw r02 = this.A01;
        if (r02 == null) {
            throw C18270x1.A0S("flowManager");
        }
        r3.A03(this.A00, "config_name", (String) C162457s7.A03(r02.A03));
        A01();
        C162457s7.A0D(AnonymousClass0x9.A1G().put("input", map));
        C152677Zw r32 = this.A07;
        if (r32 != null) {
            C151217Tw r03 = this.A01;
            if (r03 == null) {
                throw C18270x1.A0S("flowManager");
            }
            String str2 = (String) C162457s7.A03(r03.A03);
            C162457s7.A0J(str2, 0);
            C152687Zx r6 = r32.A05;
            if (str2.equals(r6.A01)) {
                AnonymousClass7SR r1 = (AnonymousClass7SR) r6.A07.get(str);
                if (r1 != null) {
                    HashMap A0t = AnonymousClass001.A0t();
                    if (r1 instanceof C137066ni) {
                        C184548s0 r04 = r32.A03;
                        String str3 = ((C137066ni) r1).A04;
                        C45422Zz B95 = r04.B95(str3);
                        if (B95 == null || (A002 = B95.A00()) == null) {
                            throw AnonymousClass0x2.A0V(" is not in the resource registry", AnonymousClass000.A0l(str3));
                        } else if (A002 instanceof AnonymousClass1jJ) {
                            Set set = r32.A07;
                            if (set.contains(str)) {
                                while (true) {
                                    stack = r32.A08;
                                    if (C162457s7.A0P(str, ((AnonymousClass7ZL) stack.peek()).A01)) {
                                        break;
                                    }
                                    String str4 = ((AnonymousClass7ZL) stack.pop()).A01;
                                    if (set.contains(str4)) {
                                        set.remove(str4);
                                        r6.A08.pop();
                                    }
                                }
                                set.remove(str);
                                r6.A08.pop();
                                Object pop = stack.pop();
                                C162457s7.A0D(pop);
                                A0t.putAll(((AnonymousClass7ZL) pop).A03);
                            }
                            set.add(str);
                            r6.A08.push(str);
                        }
                    }
                    r32.A08.push(new AnonymousClass7ZL(C996857p.INCOMPLETE, str, map, A0t));
                    r32.A00 = System.currentTimeMillis();
                    return;
                }
                throw AnonymousClass0x2.A0V(" is not part of the state registry", AnonymousClass000.A0l(str));
            }
        }
    }

    public final void A06(C60752z6 r16, String str, Map map, Map map2, boolean z) {
        AnonymousClass4GS r4;
        Map map3;
        LinkedHashMap linkedHashMap;
        AnonymousClass211 r7;
        Object obj;
        String str2;
        JSONObject jSONObject;
        Map map4 = map;
        C40622Hc r0 = this.A0Q;
        String str3 = str;
        C162457s7.A0J(str3, 0);
        AnonymousClass7SR r10 = (AnonymousClass7SR) ((Map) C162457s7.A03(r0.A00)).get(str3);
        if (r10 != null) {
            this.A0K.A0R(this.A0W);
            if (r10 instanceof C137026ne) {
                A05(r10, map4);
                r4 = new AnonymousClass8ZW(this);
            } else {
                String str4 = null;
                C60752z6 r42 = r16;
                if (r10 instanceof C137066ni) {
                    Map map5 = map2;
                    if (!(map == null || map2 == null)) {
                        str4 = ((C137066ni) r10).A03;
                    }
                    C137066ni r102 = (C137066ni) r10;
                    Map A002 = C60372yS.A00.A00(r102.A01, r102.A03, map4, map5);
                    if (z) {
                        r7 = AnonymousClass211.RESUME;
                    } else {
                        r7 = AnonymousClass211.EXECUTE;
                    }
                    A04(r7, r102, r42, str4, A002);
                    return;
                } else if ((r10 instanceof C137046ng) || (r10 instanceof C137016nd) || (r10 instanceof C137036nf)) {
                    A05(r10, map4);
                    r4 = new AnonymousClass8ZX(this);
                } else if (r10 instanceof C137056nh) {
                    A05(r10, map4);
                    C137056nh r103 = (C137056nh) r10;
                    if (z) {
                        C150577Ri r3 = this.A0P;
                        C162457s7.A0J(r3, 2);
                        C626936e.A0B(C162457s7.A0P(r103.A05, "embedded"));
                        r103.A00(r3, r42, r103.A00, map4);
                        r103.A00 = null;
                        return;
                    }
                    C151217Tw r02 = this.A01;
                    if (r02 == null) {
                        throw C18270x1.A0S("flowManager");
                    }
                    String str5 = (String) C162457s7.A03(r02.A03);
                    C150577Ri r9 = this.A0P;
                    C18270x1.A10(str5, 0, r9);
                    if (map == null) {
                        map3 = C73813g7.A0A();
                    } else {
                        map3 = map4;
                    }
                    Map A032 = C160977ol.A03(map3, r103.A09);
                    String A0c2 = AnonymousClass0x2.A0c("state", A032);
                    String A0c3 = AnonymousClass0x2.A0c("error_map_type", A032);
                    Map A0l = AnonymousClass6C8.A0l("server_parameters", A032);
                    String str6 = r103.A07;
                    if (A0l != null) {
                        linkedHashMap = new LinkedHashMap(A0l);
                    } else {
                        linkedHashMap = null;
                    }
                    C52622lm r2 = new C52622lm(str6, A0c2, linkedHashMap);
                    Map A0l2 = AnonymousClass6C8.A0l("state_machine_parameters", A032);
                    if (C162457s7.A0P(r103.A05, "embedded")) {
                        r103.A00 = map4;
                        C161447pg A003 = r103.A03.A00(r103.A04);
                        C626936e.A06(A003);
                        A003.A06(new C171908Iw(r9, r103, A003, A0c3, A0l2, map4), AnonymousClass20N.GET, r2, str5);
                        return;
                    }
                    r103.A01.A00((C51052jC) null).A07((AnonymousClass4B3) null, new AnonymousClass8JB(r9, r103, map4), r2, "", A0c3, A0l2);
                    return;
                } else {
                    throw AnonymousClass001.A0c("Unsupported Type");
                }
            }
            if (r10 instanceof C137046ng) {
                C137046ng r104 = (C137046ng) r10;
                Object obj2 = r104.A02;
                Map A012 = AnonymousClass31O.A01(r104.A01);
                Object obj3 = A012.get("exists");
                C162457s7.A0K(obj3, "null cannot be cast to non-null type kotlin.String");
                String str7 = (String) obj3;
                C40642He r03 = r104.A00;
                C162457s7.A0J(str7, 0);
                InputStream open = r03.A00.A00.getAssets().open("versioning/phoenix-features.json");
                C162457s7.A0D(open);
                try {
                    C159957ml.A01(new String(AnonymousClass2A7.A00(open), AnonymousClass79X.A05)).A01(str7, new C181468mo[0]);
                    obj2 = A012.get("next");
                    C162457s7.A0K(obj2, "null cannot be cast to non-null type kotlin.String");
                } catch (C173678Re unused) {
                }
                r4.BGj(obj2, map4, (Object) null);
            } else if (r10 instanceof C137016nd) {
                String str8 = r10.A00;
                if (map == null) {
                    map4 = C73813g7.A0A();
                }
                r4.BGj(str8, map4, (Object) null);
            } else if (r10 instanceof C137056nh) {
                throw C18320x8.A0m();
            } else if (r10 instanceof C137066ni) {
                throw C18320x8.A0m();
            } else if (r10 instanceof C137036nf) {
                C137036nf r105 = (C137036nf) r10;
                if (map == null) {
                    map4 = C73813g7.A0A();
                }
                r4.BGj(r105.A00, C160977ol.A01(r105.A00, C160977ol.A02(map4, r105.A01), C160977ol.A03(map4, r105.A02)), (Object) null);
            } else {
                C137026ne r106 = (C137026ne) r10;
                Object obj4 = null;
                if (map != null) {
                    try {
                        jSONObject = new JSONObject(map4);
                    } catch (Exception e) {
                        Log.e("FcsStateMachine", e);
                        if (e instanceof UnsupportedOperationException) {
                            str2 = "unsupportedComparisonTypes";
                        } else if (e instanceof ClassCastException) {
                            str2 = "comparingValuesWithDifferentTypes";
                        } else {
                            str2 = "genericChoiceStateError";
                        }
                        Object r1 = new C60752z6((Integer) null, str2, e.getMessage());
                        C157187ht r04 = r106.A00;
                        if (r04 != null) {
                            obj4 = r04.A00(str2);
                        }
                        obj = obj4;
                        obj4 = r1;
                    }
                } else {
                    jSONObject = AnonymousClass0x9.A1G();
                }
                List list = r106.A02;
                String str9 = r106.A01;
                try {
                    ArrayList A0s = AnonymousClass001.A0s();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        JSONObject A1H = AnonymousClass0x9.A1H(AnonymousClass001.A0m(it));
                        if (A1H.has("next")) {
                            String string = A1H.getString("next");
                            C186988wG A004 = C1452574u.A00(A1H);
                            if (A004 != null) {
                                C162457s7.A0H(string);
                                A0s.add(new AnonymousClass7I4(A004, string));
                            }
                        }
                    }
                    C626936e.A0D(AnonymousClass000.A1T(A0s.isEmpty() ? 1 : 0), "expected at least 1 choice");
                    AnonymousClass7I5 r6 = new AnonymousClass7I5(str9, A0s);
                    C150587Rj r5 = new C150587Rj(C18290x4.A0o(jSONObject));
                    Iterator it2 = r6.A01.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = r6.A00;
                            break;
                        }
                        AnonymousClass7I4 r12 = (AnonymousClass7I4) it2.next();
                        if (r12.A00.B2j(r5)) {
                            obj = r12.A01;
                            break;
                        }
                    }
                } catch (JSONException unused2) {
                    obj = null;
                }
                r4.BGj(obj, map4, obj4);
            }
        } else {
            throw AnonymousClass0x9.A0i(AnonymousClass000.A0V("state not found for name: ", str3, AnonymousClass001.A0o()));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009b, code lost:
        if ((r8.A05.A07.get(((X.AnonymousClass7ZL) r7.peek()).A01) instanceof X.C137016nd) == false) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b5, code lost:
        if (r1.containsKey(X.C373621y.ERROR.key) != false) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b7, code lost:
        r3.A01(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ff, code lost:
        if (r0 != null) goto L_0x00f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x010d, code lost:
        if (r0 != null) goto L_0x010f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A08(X.C60752z6 r10, java.util.Map r11) {
        /*
            r9 = this;
            boolean r0 = r9.A0E
            if (r0 != 0) goto L_0x0118
            r0 = 1
            r9.A0E = r0
            X.3Wi r1 = r9.A0K
            java.lang.Runnable r0 = r9.A0W
            r1.A0R(r0)
            X.8s0 r0 = r9.A0R
            r0.BcL()
            X.7Tw r1 = r9.A01
            r4 = 0
            if (r1 != 0) goto L_0x001f
            java.lang.String r0 = "flowManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x001f:
            X.2or r0 = r1.A01
            r0.A03(r1)
            X.7oC r3 = r9.A04
            if (r3 != 0) goto L_0x002f
            java.lang.String r0 = "backNavManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x002f:
            X.7Yr r1 = r3.A04
            java.util.Stack r0 = r1.A01
            r0.clear()
            java.util.Stack r0 = r1.A02
            r0.clear()
            X.2or r2 = r3.A05
            X.3d3 r1 = X.C72023d3.A00
            X.9e5 r0 = new X.9e5
            r0.<init>(r1)
            r2.A01(r0)
            r2.A03(r3)
            X.1iO r1 = r9.A0G
            X.4CD r0 = r9.A0F
            r1.A07(r0)
            X.2yd r2 = r9.A0U
            java.lang.String r1 = r9.A0a
            monitor-enter(r2)
            java.util.Map r0 = X.C60482yd.A03     // Catch:{ all -> 0x0115 }
            r0.remove(r1)     // Catch:{ all -> 0x0115 }
            monitor-exit(r2)
            r9.A06 = r4
            if (r10 != 0) goto L_0x00c7
            X.8ry r5 = r9.A02
            if (r5 == 0) goto L_0x0112
            X.92c r5 = (X.C1896492c) r5
            int r0 = r5.A02
            if (r0 == 0) goto L_0x0102
            java.lang.Object r6 = r5.A01
            X.7pg r6 = (X.C161447pg) r6
            X.2jC r0 = r6.A0I
            if (r0 == 0) goto L_0x00bf
            X.2eU r3 = r6.A0G
            java.lang.String r2 = r0.A00
            monitor-enter(r3)
            java.util.Map r0 = r3.A00     // Catch:{ all -> 0x00bb }
            java.lang.Object r8 = r0.get(r2)     // Catch:{ all -> 0x00bb }
            X.7Zw r8 = (X.C152677Zw) r8     // Catch:{ all -> 0x00bb }
            if (r8 == 0) goto L_0x00be
            java.util.Stack r7 = r8.A08     // Catch:{ all -> 0x00bb }
            boolean r0 = r7.isEmpty()     // Catch:{ all -> 0x00bb }
            if (r0 != 0) goto L_0x009d
            java.lang.Object r0 = r7.peek()     // Catch:{ all -> 0x00bb }
            X.7ZL r0 = (X.AnonymousClass7ZL) r0     // Catch:{ all -> 0x00bb }
            java.lang.String r1 = r0.A01     // Catch:{ all -> 0x00bb }
            X.7Zx r0 = r8.A05     // Catch:{ all -> 0x00bb }
            java.util.Map r0 = r0.A07     // Catch:{ all -> 0x00bb }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x00bb }
            boolean r0 = r0 instanceof X.C137016nd     // Catch:{ all -> 0x00bb }
            if (r0 != 0) goto L_0x00b7
        L_0x009d:
            boolean r0 = r7.isEmpty()     // Catch:{ all -> 0x00bb }
            if (r0 != 0) goto L_0x00be
            java.lang.Object r0 = r7.peek()     // Catch:{ all -> 0x00bb }
            X.7ZL r0 = (X.AnonymousClass7ZL) r0     // Catch:{ all -> 0x00bb }
            java.util.Map r1 = r0.A02     // Catch:{ all -> 0x00bb }
            if (r1 == 0) goto L_0x00be
            X.21y r0 = X.C373621y.ERROR     // Catch:{ all -> 0x00bb }
            java.lang.String r0 = r0.key     // Catch:{ all -> 0x00bb }
            boolean r0 = r1.containsKey(r0)     // Catch:{ all -> 0x00bb }
            if (r0 == 0) goto L_0x00be
        L_0x00b7:
            r3.A01(r2)     // Catch:{ all -> 0x00bb }
            goto L_0x00be
        L_0x00bb:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x00be:
            monitor-exit(r3)
        L_0x00bf:
            X.C161447pg.A00(r6)
            java.lang.Object r0 = r5.A00
            X.4DQ r0 = (X.AnonymousClass4DQ) r0
            goto L_0x010f
        L_0x00c7:
            X.8ry r3 = r9.A02
            if (r3 == 0) goto L_0x0112
            X.92c r3 = (X.C1896492c) r3
            int r2 = r3.A02
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "FDSManage/FcsStateMachine Terminated with error: "
            X.C18260x0.A1Q(r1, r0, r10)
            if (r2 == 0) goto L_0x00f4
            java.lang.Object r2 = r3.A01
            X.7pg r2 = (X.C161447pg) r2
            X.2jC r0 = r2.A0I
            if (r0 == 0) goto L_0x00e9
            X.2eU r1 = r2.A0G
            java.lang.String r0 = r0.A00
            r1.A01(r0)
        L_0x00e9:
            X.C161447pg.A00(r2)
            java.lang.Object r0 = r3.A00
            X.4DQ r0 = (X.AnonymousClass4DQ) r0
        L_0x00f0:
            r0.BSv(r10, r11)
            goto L_0x0112
        L_0x00f4:
            java.lang.Object r0 = r3.A01
            X.7pg r0 = (X.C161447pg) r0
            X.C161447pg.A00(r0)
            java.lang.Object r0 = r3.A00
            X.4DQ r0 = (X.AnonymousClass4DQ) r0
            if (r0 == 0) goto L_0x0112
            goto L_0x00f0
        L_0x0102:
            java.lang.Object r0 = r5.A01
            X.7pg r0 = (X.C161447pg) r0
            X.C161447pg.A00(r0)
            java.lang.Object r0 = r5.A00
            X.4DQ r0 = (X.AnonymousClass4DQ) r0
            if (r0 == 0) goto L_0x0112
        L_0x010f:
            r0.BdH(r11)
        L_0x0112:
            r9.A02 = r4
            return
        L_0x0115:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0118:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C159127lA.A08(X.2z6, java.util.Map):void");
    }

    public final void A09(String str) {
        this.A0T.A01(new C197989eC(str, false, (String) null));
    }

    public final boolean A0A() {
        Boolean bool;
        String str = this.A0X;
        if (str != null) {
            synchronized (this.A0U) {
                bool = (Boolean) C60482yd.A02.get(str);
            }
            if (!AnonymousClass0x9.A1Q(bool)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public C159127lA(C29171iO r4, C39912Du r5, AnonymousClass2VP r6, AnonymousClass2E3 r7, C69263Wi r8, AnonymousClass282 r9, AnonymousClass1j2 r10, C40622Hc r11, C184548s0 r12, C48182eU r13, C60482yd r14, C183538qC r15, String str, String str2, String str3, String str4, String str5) {
        String str6 = str5;
        C18260x0.A0f(r8, r9, r14, r13, r5);
        C18260x0.A0g(r12, r7, r4, r10, r15);
        C162457s7.A0J(r6, 11);
        String str7 = str3;
        C162457s7.A0J(str7, 14);
        this.A0K = r8;
        this.A0L = r9;
        this.A0U = r14;
        this.A0S = r13;
        this.A0H = r5;
        this.A0R = r12;
        this.A0J = r7;
        this.A0G = r4;
        this.A0M = r10;
        this.A0V = r15;
        this.A0I = r6;
        this.A0Z = str;
        this.A0c = str2;
        this.A0Y = str7;
        this.A0b = str4;
        this.A0X = str6;
        this.A0Q = r11;
        str6 = str5 == null ? C86604Kt.A0k() : str6;
        this.A0a = str6;
        this.A0T = r14.A02(str6);
        this.A0W = new C71263bp((Object) this, 13);
        this.A0F = new C170628Dx(this);
        this.A0N = new AnonymousClass7EK(this);
        this.A0O = new C150567Rh(this);
        this.A0P = new C150577Ri(this);
    }
}
