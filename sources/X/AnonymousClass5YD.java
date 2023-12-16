package X;

import java.util.Collection;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: X.5YD  reason: invalid class name */
public final class AnonymousClass5YD {
    public long A00;
    public long A01;
    public final C56982ss A02;
    public final AnonymousClass4FV A03;
    public final AnonymousClass5UP A04;
    public final C54182oJ A05;

    public AnonymousClass5YD(C56982ss r2, AnonymousClass4FV r3, AnonymousClass5UP r4, C54182oJ r5) {
        C18260x0.A0a(r3, r4, r2, 2);
        this.A05 = r5;
        this.A03 = r3;
        this.A04 = r4;
        this.A02 = r2;
    }

    public final void A08(C95804uY r11, AnonymousClass59F r12, AnonymousClass59F r13, String str) {
        C162457s7.A0J(r11, 0);
        C18260x0.A0Q(r12, r13);
        StringBuilder A0v = C18290x4.A0v(r11);
        A0v.append(" mute clicked, entryPoint: ");
        A0v.append(r12);
        A01(AnonymousClass000.A0P(r13, ", surface: ", A0v));
        A0C(r11, r12, r13, A03(r12, (String) null, str, false), 3, -1);
    }

    public final void A09(C95804uY r11, AnonymousClass59F r12, AnonymousClass59F r13, String str) {
        C162457s7.A0J(r11, 0);
        C18260x0.A0Q(r12, r13);
        StringBuilder A0v = C18290x4.A0v(r11);
        A0v.append(" Unmute clicked, entryPoint: ");
        A0v.append(r12);
        A01(AnonymousClass000.A0P(r13, ", surface: ", A0v));
        A0C(r11, r12, r13, A03(r12, (String) null, str, false), 4, -1);
    }

    public final void A0A(C95804uY r9, AnonymousClass59F r10, AnonymousClass59F r11, String str, String str2, int i) {
        C162457s7.A0J(r9, 0);
        C18270x1.A10(r10, 1, r11);
        StringBuilder A0v = C18290x4.A0v(r9);
        A0v.append(" followed, entryPoint: ");
        A0v.append(r10);
        A01(AnonymousClass000.A0P(r11, ", surface: ", A0v));
        A0C(r9, r10, r11, A03(r10, str, str2, true), 1, i);
    }

    public final void A0B(C95804uY r11, AnonymousClass59F r12, AnonymousClass59F r13, String str, String str2, int i) {
        C18270x1.A14(r11, r12);
        StringBuilder A0v = C18290x4.A0v(r11);
        A0v.append(" Unfollowed, entryPoint: ");
        A0v.append(r12);
        A01(AnonymousClass000.A0P(r13, ", surface: ", A0v));
        A0C(r11, r12, r13, A03(r12, str, str2, false), 2, i);
    }

    public static Long A00(AnonymousClass5YD r4) {
        long j = r4.A01;
        r4.A01 = 1 + j;
        return Long.valueOf(j);
    }

    public final long A02() {
        long j = this.A00;
        if (j != 0) {
            return j;
        }
        long A052 = C158997kv.A00.A05();
        this.A00 = A052;
        return A052;
    }

    public final JSONObject A03(AnonymousClass59F r6, String str, String str2, boolean z) {
        Boolean bool;
        AnonymousClass1RL r1;
        if (z) {
            Collection A0E = this.A02.A0E();
            bool = null;
            if (A0E != null) {
                boolean z2 = false;
                if (!A0E.isEmpty()) {
                    Iterator it = A0E.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        AnonymousClass31A r12 = (AnonymousClass31A) it.next();
                        if ((r12 instanceof AnonymousClass1RL) && (r1 = (AnonymousClass1RL) r12) != null && AnonymousClass000.A1Y(r1.A07, C372821q.SUBSCRIBED)) {
                            z2 = true;
                            break;
                        }
                    }
                }
                bool = Boolean.valueOf(z2);
            }
        } else {
            bool = Boolean.TRUE;
        }
        JSONObject A1G = AnonymousClass0x9.A1G();
        A1G.put("has_followed_channels", bool);
        if (r6 == AnonymousClass59F.NEWSLETTER_DIRECTORY) {
            A1G.put("pill_type", str);
        } else if (r6 == AnonymousClass59F.NEWSLETTER_FORWARDED_MESSAGE || r6 == AnonymousClass59F.NEWSLETTER_CHAT_LINK) {
            A1G.put("thread_type", str2);
            return A1G;
        }
        return A1G;
    }

    public final void A05(int i, boolean z) {
        if (this.A04.A00()) {
            C24781Ys r2 = new C24781Ys();
            r2.A01 = Integer.valueOf(i);
            r2.A00 = Integer.valueOf(C18280x3.A01(z ? 1 : 0));
            r2.A03 = Long.valueOf(A02());
            r2.A02 = A00(this);
            this.A03.BhD(r2);
        }
    }

    public final void A06(C95804uY r4, int i, int i2, boolean z) {
        if (this.A04.A01()) {
            C94974sO r2 = new C94974sO();
            r2.A06 = Long.valueOf(A02());
            r2.A01 = Integer.valueOf(i);
            r2.A08 = r4.user;
            r2.A07 = AnonymousClass0x9.A0m(i2);
            r2.A00 = Boolean.valueOf(z);
            r2.A05 = A00(this);
            this.A03.BhD(r2);
        }
    }

    public final void A0C(C95804uY r5, AnonymousClass59F r6, AnonymousClass59F r7, JSONObject jSONObject, int i, int i2) {
        AnonymousClass4sI r2 = new AnonymousClass4sI();
        r2.A00 = Integer.valueOf(i);
        r2.A01 = Integer.valueOf(C154387d5.A00(r6));
        int i3 = 2;
        if (r6 == AnonymousClass59F.EXTERNAL_DEEPLINK) {
            i3 = 1;
        }
        r2.A02 = Integer.valueOf(i3);
        r2.A03 = C154387d5.A01(r6);
        r2.A07 = r5.user;
        int ordinal = r7.ordinal();
        int i4 = 1;
        if (ordinal != 3) {
            if (ordinal == 13) {
                i4 = 6;
            } else if (ordinal == 4) {
                i4 = 3;
            } else if (ordinal == 8) {
                i4 = 4;
            } else if (ordinal == 2) {
                i4 = 5;
            } else if (ordinal == 1) {
                i4 = 2;
            }
        }
        r2.A04 = Integer.valueOf(i4);
        if (r6 == AnonymousClass59F.NEWSLETTER_DIRECTORY || r6 == AnonymousClass59F.NEWSLETTER_DIRECTORY_SEARCH) {
            r2.A05 = Long.valueOf(A02());
            if (r6 == r7) {
                r2.A06 = AnonymousClass0x9.A0m(i2);
            }
        }
        r2.A08 = jSONObject.toString();
        this.A03.BhD(r2);
    }

    public final void A0D(C624134x r4, Integer num, int i, int i2) {
        C94774rt r2 = new C94774rt();
        r2.A01 = num;
        r2.A00 = Integer.valueOf(i);
        r2.A02 = Integer.valueOf(i2);
        C53042mS A0z = r4.A0z();
        if (A0z != null) {
            r2.A03 = A0z.A01.user;
            r2.A04 = String.valueOf(A0z.A00);
        }
        this.A03.BhD(r2);
    }

    public final void A0E(Integer num, Integer num2, String str, int i) {
        AnonymousClass5UP r1 = this.A04;
        if (r1.A01()) {
            if (!r1.A01()) {
                Integer[] numArr = new Integer[2];
                AnonymousClass000.A1L(numArr, 12);
                AnonymousClass000.A1M(numArr, 13);
                if (C73703fw.A00(Integer.valueOf(i), numArr) >= 0) {
                    return;
                }
            }
            C94974sO r2 = new C94974sO();
            r2.A06 = Long.valueOf(A02());
            r2.A01 = Integer.valueOf(i);
            r2.A04 = num;
            r2.A09 = str;
            r2.A03 = num2;
            r2.A05 = A00(this);
            this.A03.BhD(r2);
            if (i == 2) {
                this.A00 = 0;
                this.A01 = 0;
            }
        }
    }

    public final void A0F(boolean z) {
        if (this.A04.A00()) {
            this.A01 = 0;
            C24781Ys r2 = new C24781Ys();
            r2.A03 = Long.valueOf(A02());
            int i = 5;
            if (z) {
                i = 1;
            }
            r2.A01 = Integer.valueOf(i);
            r2.A02 = A00(this);
            this.A03.BhD(r2);
        }
    }

    public static final void A01(String str) {
        C18260x0.A0q("NewsletterLogging: ", str, AnonymousClass001.A0o());
    }

    public final void A04(int i) {
        A01(AnonymousClass000.A0Y("Directory clicked, source: ", AnonymousClass001.A0o(), i));
        if (this.A04.A01()) {
            C94974sO r2 = new C94974sO();
            r2.A06 = Long.valueOf(A02());
            r2.A01 = AnonymousClass001.A0f();
            r2.A02 = Integer.valueOf(i);
            r2.A05 = A00(this);
            this.A03.BhD(r2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0030, code lost:
        if (r3 != 12) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A07(X.C95804uY r6, X.AnonymousClass59F r7, int r8, int r9) {
        /*
            r5 = this;
            java.lang.StringBuilder r1 = X.C18290x4.A0v(r6)
            java.lang.String r0 = " share link clicked, source: "
            java.lang.String r0 = X.AnonymousClass000.A0P(r7, r0, r1)
            A01(r0)
            X.1Yt r4 = new X.1Yt
            r4.<init>()
            if (r6 == 0) goto L_0x004a
            java.lang.String r0 = r6.user
        L_0x0016:
            r4.A03 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r4.A00 = r0
            r0 = -1
            if (r7 != 0) goto L_0x0045
            r3 = -1
        L_0x0022:
            r2 = 0
            if (r3 == r0) goto L_0x0032
            r1 = 1
            r0 = 2
            if (r3 == r0) goto L_0x0040
            r1 = 2
            r0 = 1
            if (r3 == r0) goto L_0x0040
            r1 = 3
            r0 = 12
            if (r3 == r0) goto L_0x0040
        L_0x0032:
            r4.A01 = r2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            r4.A02 = r0
            X.4FV r0 = r5.A03
            r0.BhD(r4)
            return
        L_0x0040:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            goto L_0x0032
        L_0x0045:
            int r3 = r7.ordinal()
            goto L_0x0022
        L_0x004a:
            r0 = 0
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5YD.A07(X.4uY, X.59F, int, int):void");
    }
}
