package X;

import android.content.Context;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.Pair;
import com.whatsapp.R;

/* renamed from: X.5mL  reason: invalid class name and case insensitive filesystem */
public class C114005mL implements AnonymousClass485 {
    public final C625735q A00;
    public final AnonymousClass64J A01;
    public final AnonymousClass5XF A02;
    public final AnonymousClass5UX A03;
    public final C64773Ex A04;
    public final AnonymousClass2K7 A05;
    public final AnonymousClass5ZU A06;
    public final C620633i A07;
    public final C54292oU A08;
    public final C620733j A09;
    public final C56892sj A0A;
    public final AnonymousClass5Y0 A0B;
    public final AnonymousClass1VX A0C;
    public final C106195Xz A0D;
    public final C194589Tn A0E;
    public final C195219Wq A0F;
    public final C60152y5 A0G;
    public final C50222hp A0H;
    public final C55732qp A0I;
    public final C56072rN A0J;
    public final C33141sV A0K;
    public final C183538qC A0L;

    public CharSequence A01(Context context, Paint paint, C624134x r11) {
        String A0F2;
        C30471mV r1 = (C30471mV) r11;
        boolean A1U = AnonymousClass000.A1U(r1.A09, 1);
        int i = r1.A0B;
        C54292oU r0 = this.A08;
        if (i == 0) {
            Context context2 = r0.A00;
            int i2 = R.string.f11nameremoved;
            if (A1U) {
                i2 = R.string.f11nameremoved;
            }
            A0F2 = context2.getString(i2);
        } else {
            Context context3 = r0.A00;
            int i3 = R.string.f11nameremoved;
            if (A1U) {
                i3 = R.string.f11nameremoved;
            }
            A0F2 = AnonymousClass002.A0F(context3, C107565bW.A0A(this.A09, (long) i), new Object[1], 0, i3);
        }
        int i4 = r11.A09;
        int i5 = R.drawable.msg_status_audio;
        if (i4 == 1) {
            i5 = R.drawable.msg_status_mic;
        }
        return C87044Mw.A00(context, paint, A0F2, i5);
    }

    public CharSequence A04(Context context, Paint paint, C624134x r10) {
        String str;
        int i;
        AnonymousClass1nF r2 = (AnonymousClass1nF) r10;
        String str2 = r2.A01;
        if (r2.A09 == 7) {
            C620733j r6 = this.A09;
            if (!AnonymousClass31H.A02(r2)) {
                str = null;
            } else {
                int A002 = C615731j.A00(r2);
                if (A002 == 1) {
                    str = r2.A1x();
                    if (str == null) {
                        str = context.getString(R.string.f11nameremoved);
                    }
                } else {
                    Object[] objArr = new Object[1];
                    C18270x1.A1Q(objArr, A002);
                    str = r6.A0L(objArr, R.plurals.f9nameremoved, (long) A002);
                }
            }
            i = R.drawable.msg_status_contact;
        } else {
            if (TextUtils.isEmpty(str2)) {
                str2 = AnonymousClass353.A00(r10);
                if (TextUtils.isEmpty(str2)) {
                    if (TextUtils.isEmpty(r2.A1x())) {
                        str2 = this.A08.A00.getString(R.string.f11nameremoved);
                    } else {
                        str2 = r2.A1x();
                    }
                }
                if (r2.A00 != 0) {
                    StringBuilder A0v = C18290x4.A0v(str2);
                    A0v.append(" (");
                    A0v.append(C107105ah.A01(this.A09, r2));
                    str2 = AnonymousClass000.A0e(A0v);
                }
            }
            i = R.drawable.msg_status_doc;
        }
        return A0F(context, paint, r10, C87044Mw.A00(context, paint, str, i));
    }

    public CharSequence A07(Context context, Paint paint, C624134x r6) {
        C30471mV r2 = (C30471mV) r6;
        String A002 = AnonymousClass353.A00(r6);
        if (TextUtils.isEmpty(A002)) {
            if (C86614Ku.A1Z(r2) || AnonymousClass353.A04(r6)) {
                A002 = this.A08.A00.getString(R.string.f11nameremoved);
            } else {
                A002 = r2.A1w();
            }
        }
        return A0F(context, paint, r2, C87044Mw.A00(context, paint, A002, R.drawable.msg_status_image));
    }

    public CharSequence A08(Context context, Paint paint, C624134x r6) {
        AnonymousClass315 A012 = this.A0H.A01((AnonymousClass4DV) r6);
        if (A012 == null) {
            return this.A08.A00.getString(R.string.f11nameremoved);
        }
        return A0F(context, paint, r6, C107635bd.A07(this.A07, this.A0G, A012.A05(context, paint)));
    }

    public CharSequence A09(Context context, Paint paint, C624134x r8) {
        String str;
        AnonymousClass39N r4 = ((C31901p2) r8).A00;
        if (r4 == null || AnonymousClass22W.EXTENSIONS_1 != r4.A00) {
            return A0F(context, paint, r8, r8.A13());
        }
        String str2 = r4.A02;
        if (str2 == null || str2.length() == 0) {
            str = r4.A04;
            C162457s7.A0H(str);
            C162457s7.A0H(str);
        } else {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("\n     ");
            AnonymousClass001.A1K(r4.A04, "\n     ", str2, A0o);
            str = C830345w.A08(AnonymousClass000.A0X("\n     ", A0o));
        }
        return C92564mt.A00(context, paint, str, C102805Ki.A00(this.A09));
    }

    public CharSequence A0A(Context context, Paint paint, C624134x r5) {
        String str = ((C30801n8) r5).A03;
        if (TextUtils.isEmpty(str)) {
            return C87044Mw.A00(context, paint, this.A08.A00.getString(R.string.f11nameremoved), R.drawable.ic_quoted_live_location);
        }
        return A0F(context, paint, r5, C87044Mw.A00(context, paint, str, R.drawable.ic_quoted_live_location));
    }

    public CharSequence A0E(Context context, Paint paint, C624134x r6) {
        C30471mV r2 = (C30471mV) r6;
        String A002 = AnonymousClass353.A00(r6);
        if (TextUtils.isEmpty(A002)) {
            if (C86614Ku.A1Z(r2) || AnonymousClass353.A04(r6)) {
                A002 = this.A08.A00.getString(R.string.f11nameremoved);
            } else {
                A002 = r2.A1w();
            }
        }
        if (r2.A0B != 0) {
            StringBuilder A0v = C18290x4.A0v(A002);
            A0v.append(" (");
            A0v.append(C107565bW.A0G(this.A09, r2));
            A002 = AnonymousClass000.A0e(A0v);
        }
        return A0F(context, paint, r2, C87044Mw.A00(context, paint, A002, R.drawable.msg_status_video));
    }

    public final CharSequence A0F(Context context, Paint paint, C624134x r13, CharSequence charSequence) {
        Paint paint2 = paint;
        if (!this.A0C.A0Y(C58422vE.A01, 4093) || !(paint instanceof TextPaint)) {
            return this.A0D.A02(context, r13, C107635bd.A07(this.A07, this.A0G, charSequence));
        }
        int A042 = AnonymousClass0Y8.A04(context, R.color.f5nameremoved);
        int A043 = AnonymousClass0Y8.A04(context, R.color.f5nameremoved);
        CharSequence A022 = this.A0D.A02(context, r13, charSequence);
        Pair A044 = C107635bd.A04((TextPaint) paint2, this.A07, this.A0G, A022, A042, A043, false);
        if (A044 != null) {
            return (CharSequence) A044.first;
        }
        return A022;
    }

    public CharSequence A02(Context context, Paint paint, C624134x r9) {
        String str;
        C620733j r5 = this.A09;
        int size = ((C30411mP) r9).A1v().size();
        if (size > 0) {
            Object[] A0L2 = AnonymousClass002.A0L();
            C18270x1.A1Q(A0L2, size);
            str = r5.A0L(A0L2, R.plurals.f9nameremoved, (long) size);
        } else {
            str = "";
        }
        return C87044Mw.A00(context, paint, str, R.drawable.msg_status_contact);
    }

    public CharSequence A03(Context context, Paint paint, C624134x r6) {
        String string = this.A08.A00.getString(R.string.f11nameremoved);
        C30421mQ r62 = (C30421mQ) r6;
        if (!TextUtils.isEmpty(r62.A00)) {
            StringBuilder A0v = C18290x4.A0v(string);
            A0v.append(": ");
            string = AnonymousClass000.A0X(C107575bX.A0C(r62.A00, 128), A0v);
        }
        return C87044Mw.A00(context, paint, string, R.drawable.msg_status_contact);
    }

    public CharSequence A05(Context context, Paint paint, C624134x r6) {
        C30471mV r62 = (C30471mV) r6;
        String A1w = r62.A1w();
        if (!TextUtils.isEmpty(A1w)) {
            return A0F(context, paint, r62, C87044Mw.A00(context, paint, A1w, R.drawable.msg_status_gif));
        }
        return C87044Mw.A00(context, paint, C107635bd.A07(this.A07, this.A0G, this.A08.A00.getString(R.string.f11nameremoved)), R.drawable.msg_status_gif);
    }

    public CharSequence A06(Context context, Paint paint, C624134x r6) {
        String str;
        C30391mN r62 = (C30391mN) r6;
        if (TextUtils.isEmpty(r62.A04)) {
            Context context2 = this.A08.A00;
            boolean A032 = this.A0J.A03(r62.A00);
            int i = R.string.f11nameremoved;
            if (A032) {
                i = R.string.f11nameremoved;
            }
            str = context2.getString(i);
        } else {
            str = r62.A04;
        }
        return C87044Mw.A00(context, paint, str, R.drawable.msg_status_invite);
    }

    public CharSequence A0B(Context context, Paint paint, C624134x r8) {
        String A0e;
        C30471mV r82 = (C30471mV) r8;
        Context context2 = this.A08.A00;
        Object[] A0L2 = AnonymousClass002.A0L();
        if (r82.A0B <= 0) {
            A0e = "";
        } else {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append(" (");
            A0o.append(C107565bW.A0G(this.A09, r82));
            A0e = AnonymousClass000.A0e(A0o);
        }
        return C87044Mw.A00(context, paint, C86614Ku.A0s(context2, A0e, A0L2, R.string.f11nameremoved), R.drawable.msg_status_video);
    }

    public CharSequence A0G(Context context, C624134x r5) {
        C195219Wq r2 = this.A0F;
        AnonymousClass2z0 r0 = r5.A1J;
        boolean z = r0.A02;
        C95814uZ r02 = r0.A00;
        C626936e.A06(r02);
        return r2.A0I(context, r02, z).A00;
    }

    public C114005mL(C625735q r2, AnonymousClass64J r3, AnonymousClass5XF r4, AnonymousClass5UX r5, C64773Ex r6, AnonymousClass2K7 r7, AnonymousClass5ZU r8, C620633i r9, C54292oU r10, C620733j r11, C56892sj r12, AnonymousClass5Y0 r13, AnonymousClass1VX r14, C106195Xz r15, C194589Tn r16, C195219Wq r17, C60152y5 r18, C50222hp r19, C55732qp r20, C56072rN r21, C33141sV r22, C183538qC r23) {
        this.A08 = r10;
        this.A0C = r14;
        this.A0D = r15;
        this.A0B = r13;
        this.A02 = r4;
        this.A0F = r17;
        this.A03 = r5;
        this.A04 = r6;
        this.A0I = r20;
        this.A07 = r9;
        this.A06 = r8;
        this.A09 = r11;
        this.A0J = r21;
        this.A0K = r22;
        this.A05 = r7;
        this.A0A = r12;
        this.A0G = r18;
        this.A00 = r2;
        this.A0E = r16;
        this.A0H = r19;
        this.A01 = r3;
        this.A0L = r23;
    }

    public static final CharSequence A00(Context context, Paint paint, int i) {
        return C87044Mw.A01(paint, C107335b8.A04(context, R.drawable.ic_viewonce, R.color.f5nameremoved), context.getString(i));
    }

    public CharSequence A0C(Context context, Paint paint, C624134x r5) {
        String A002 = AnonymousClass353.A00(r5);
        if (TextUtils.isEmpty(A002)) {
            AnonymousClass1n9 r1 = (AnonymousClass1n9) r5;
            if (TextUtils.isEmpty(r1.A01)) {
                A002 = this.A08.A00.getString(R.string.f11nameremoved);
            } else {
                A002 = r1.A01;
            }
        }
        return A0F(context, paint, r5, C87044Mw.A00(context, paint, A002, R.drawable.msg_status_location));
    }

    public CharSequence A0D(Context context, Paint paint, C624134x r9) {
        CharSequence A0F2;
        Context context2;
        int i;
        String A13 = r9.A13();
        if (r9.A0P != null || "UNSET".equals(r9.A15)) {
            if (TextUtils.isEmpty(A13)) {
                C624034w r0 = r9.A0P;
                if (r0 == null || !r0.A0L()) {
                    context2 = this.A08.A00;
                    i = R.string.f11nameremoved;
                } else {
                    context2 = this.A08.A00;
                    i = R.string.f11nameremoved;
                }
                A0F2 = context2.getString(i);
            } else {
                A0F2 = A0F(context, paint, r9, r9.A13());
            }
            C624034w r2 = r9.A0P;
            if (r2 == null || r2.A03() == AnonymousClass1S3.A06) {
                return A0F2;
            }
            CharSequence A052 = C195219Wq.A05(context, r2);
            SpannableStringBuilder A002 = C18330xA.A00(A052);
            A002.setSpan(new ForegroundColorSpan(context.getResources().getColor(R.color.f5nameremoved)), 0, A052.length(), 0);
            A002.append(" ");
            A002.append(A0F2);
            return A002;
        } else if (!AnonymousClass353.A04(r9)) {
            return A0F(context, paint, r9, A13);
        } else {
            String A003 = AnonymousClass353.A00(r9);
            if (!TextUtils.isEmpty(A13)) {
                StringBuilder A0o = AnonymousClass001.A0o();
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append("*");
                A0o2.append(A13);
                C18270x1.A1C("*", A0o2, A0o);
                A003 = AnonymousClass000.A0V("\n", A003, A0o);
            }
            return A0F(context, paint, r9, A003);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0128, code lost:
        if (r13.equals(r6.A08.A00.getString(com.whatsapp.R.string.f11nameremoved)) != false) goto L_0x012a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0080, code lost:
        r10 = r7.A0P;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x064b  */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x0744  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:316:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01ea  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0238  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x024e  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0256  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x025c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0H(android.view.View r35, X.C105365Uq r36, X.C95814uZ r37, X.C624134x r38, X.AnonymousClass33O r39, boolean r40, boolean r41) {
        /*
            r34 = this;
            r5 = r35
            r7 = r38
            r33 = r37
            android.content.Context r9 = r5.getContext()
            r6 = r34
            X.64J r1 = r6.A01
            r0 = 2131432827(0x7f0b157b, float:1.8487422E38)
            X.5YB r23 = X.AnonymousClass5YB.A00(r5, r1, r0)
            r0 = 2131432825(0x7f0b1579, float:1.8487418E38)
            android.widget.TextView r4 = X.AnonymousClass002.A09(r5, r0)
            r0 = 2131432823(0x7f0b1577, float:1.8487414E38)
            android.widget.TextView r8 = X.AnonymousClass002.A09(r5, r0)
            r0 = 2131432826(0x7f0b157a, float:1.848742E38)
            android.view.View r16 = r5.findViewById(r0)
            r0 = 2131432814(0x7f0b156e, float:1.8487396E38)
            android.view.View r17 = r5.findViewById(r0)
            r0 = 2131432819(0x7f0b1573, float:1.8487406E38)
            android.view.View r22 = r5.findViewById(r0)
            r0 = 2131432821(0x7f0b1575, float:1.848741E38)
            android.widget.TextView r13 = X.C18300x5.A0G(r5, r0)
            r0 = 2131432820(0x7f0b1574, float:1.8487408E38)
            android.widget.ImageView r12 = X.AnonymousClass0x9.A0E(r5, r0)
            r0 = 2131432822(0x7f0b1576, float:1.8487412E38)
            android.view.View r15 = r5.findViewById(r0)
            com.whatsapp.stickers.StickerView r15 = (com.whatsapp.stickers.StickerView) r15
            r0 = 2131432813(0x7f0b156d, float:1.8487394E38)
            android.widget.TextView r18 = X.AnonymousClass002.A09(r5, r0)
            r0 = 2131432824(0x7f0b1578, float:1.8487416E38)
            com.whatsapp.TextEmojiLabel r3 = X.C86644Kx.A0M(r5, r0)
            r0 = 2131428994(0x7f0b0682, float:1.8479648E38)
            android.widget.ImageView r19 = X.AnonymousClass0x9.A0F(r5, r0)
            r0 = 2131102351(0x7f060a8f, float:1.7817137E38)
            if (r40 == 0) goto L_0x006c
            r0 = 2131102356(0x7f060a94, float:1.7817148E38)
        L_0x006c:
            int r0 = X.AnonymousClass0Y8.A04(r9, r0)
            r4.setTextColor(r0)
            r8.setTextColor(r0)
            X.34w r0 = r7.A0P
            if (r0 == 0) goto L_0x078f
            boolean r0 = X.AnonymousClass36S.A06(r0)
            if (r0 != 0) goto L_0x078f
            X.34w r10 = r7.A0P
            int r1 = r10.A03
            r0 = 5
            if (r1 == r0) goto L_0x078f
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r1 == r0) goto L_0x078f
            int r1 = r10.A01
            r0 = 4
            if (r1 == r0) goto L_0x078f
            X.33j r2 = r6.A09
            X.39Q r1 = r10.A08
            X.4Fi r0 = r10.A03()
            android.text.SpannableStringBuilder r0 = X.AnonymousClass9UO.A00(r9, r2, r0, r1)
            r13.setText(r0)
            r2 = 0
            r1 = r16
            r0 = r22
            X.C86624Kv.A13(r0, r1)
            r0 = r23
            com.whatsapp.TextEmojiLabel r11 = r0.A02
            r11.setVisibility(r2)
            X.1VX r1 = r6.A0C
            r0 = 605(0x25d, float:8.48E-43)
            boolean r0 = r1.A0X(r0)
            if (r0 != 0) goto L_0x00c0
            r0 = 629(0x275, float:8.81E-43)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x00d0
        L_0x00c0:
            X.34w r0 = r7.A0P
            X.39R r1 = r0.A05()
            if (r1 == 0) goto L_0x0776
            r12.setVisibility(r2)
            X.9Tn r0 = r6.A0E
            r0.A01(r12, r13, r1)
        L_0x00d0:
            r1 = 8
        L_0x00d2:
            boolean r0 = r7 instanceof X.C30941nT
            if (r0 == 0) goto L_0x0744
            X.58e r10 = X.C997858e.CROSS_GROUP_BLANK
        L_0x00d8:
            X.58e r0 = X.C997858e.FROM_ME
            if (r10 == r0) goto L_0x064b
            X.58e r0 = X.C997858e.SAME_GROUP
            if (r10 == r0) goto L_0x064b
            X.58e r0 = X.C997858e.INDIVIDUAL
            if (r10 == r0) goto L_0x064b
            X.2z0 r0 = r7.A1J
            r20 = r0
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x05e9
            r2 = 2130970369(0x7f040701, float:1.7549446E38)
            r0 = 2131102218(0x7f060a0a, float:1.7816868E38)
            int r2 = X.C18300x5.A03(r9, r2, r0)
            r23.A05()
        L_0x00f9:
            r12 = 0
            r0 = r18
            r0.setVisibility(r12)
            r3.setVisibility(r12)
            X.3Ex r12 = r6.A04
            r0 = r20
            X.4uZ r0 = r0.A00
            X.3ZH r12 = X.C64773Ex.A00(r12, r0)
            X.5ZU r0 = r6.A06
            java.lang.String r13 = r0.A0H(r12)
            boolean r0 = android.text.TextUtils.isEmpty(r13)
            if (r0 != 0) goto L_0x012a
            X.2oU r0 = r6.A08
            android.content.Context r12 = r0.A00
            r0 = 2131890037(0x7f120f75, float:1.9414754E38)
            java.lang.String r0 = r12.getString(r0)
            boolean r0 = r13.equals(r0)
            r14 = 1
            if (r0 == 0) goto L_0x012b
        L_0x012a:
            r14 = 0
        L_0x012b:
            int r12 = r10.ordinal()
            r0 = 5
            if (r12 == r0) goto L_0x05c7
            r0 = 3
            if (r12 == r0) goto L_0x05bc
            r0 = 4
            if (r12 != r0) goto L_0x0671
            X.2oU r0 = r6.A08
            android.content.Context r1 = r0.A00
            r0 = 2131893958(0x7f121ec6, float:1.9422707E38)
        L_0x013f:
            java.lang.String r1 = r1.getString(r0)
            r0 = 0
            r3.A0K(r0, r1)
        L_0x0147:
            r1 = r2
            r13 = 8
        L_0x014a:
            r0 = 2131102275(0x7f060a43, float:1.7816983E38)
            int r0 = X.AnonymousClass0Y8.A04(r9, r0)
            int r22 = X.AnonymousClass0YI.A05(r0, r2)
            int r21 = X.AnonymousClass0YI.A05(r0, r1)
            X.58e r0 = X.C997858e.CROSS_GROUP_BLANK
            if (r10 != r0) goto L_0x025c
            r0 = 2131099866(0x7f0600da, float:1.7812097E38)
            int r1 = X.AnonymousClass0Y8.A04(r9, r0)
            r4.setVisibility(r13)
        L_0x0167:
            r0 = r17
            r0.setBackgroundColor(r1)
            r0 = r22
            r11.setTextColor(r0)
            r1 = r18
            r1.setTextColor(r0)
            r0 = r21
            r3.setTextColor(r0)
            byte r1 = r7.A1I
            r0 = 20
            if (r1 != r0) goto L_0x0256
            r0 = 0
            r15.setVisibility(r0)
            X.2qp r2 = r6.A0I
            r0 = r7
            X.1nE r0 = (X.AnonymousClass1nE) r0
            X.39M r8 = r2.A00(r0)
            java.lang.String r1 = r8.A09
            if (r1 == 0) goto L_0x01a6
            X.20i r0 = r8.A04()
            X.330 r0 = r2.A01(r0, r1)
            if (r0 == 0) goto L_0x01a6
            X.5Zv[] r0 = r0.A0B
            if (r0 == 0) goto L_0x01a6
            java.lang.String r0 = X.C387228w.A00(r0)
            r8.A07 = r0
        L_0x01a6:
            android.content.Context r0 = r15.getContext()
            java.lang.String r0 = X.AnonymousClass320.A00(r0, r8)
            r15.setContentDescription(r0)
            r12 = r39
            if (r39 == 0) goto L_0x01e1
            android.content.res.Resources r1 = X.C18290x4.A0G(r15)
            r0 = 2131168372(0x7f070c74, float:1.7951044E38)
            int r14 = r1.getDimensionPixelSize(r0)
            r0 = 2131233689(0x7f080b99, float:1.8083523E38)
            r15.setImageResource(r0)
            X.1sV r3 = r6.A0K
            X.5q6 r2 = new X.5q6
            r9 = r2
            r10 = r6
            r11 = r8
            r13 = r15
            r9.<init>(r10, r11, r12, r13, r14)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "quoted-"
            X.C624134x.A0S(r7, r0, r1)
            java.lang.String r0 = r1.toString()
            r3.A0B(r15, r7, r2, r0)
        L_0x01e1:
            r0 = 8
            r4.setVisibility(r0)
        L_0x01e6:
            boolean r0 = r7 instanceof X.C30421mQ
            if (r0 == 0) goto L_0x024e
            r1 = 0
            r0 = r19
            r0.setVisibility(r1)
            X.5UX r2 = r6.A03
            r1 = 2131231006(0x7f08011e, float:1.807808E38)
            r2.A06(r0, r1)
            X.2oU r4 = r6.A08
            X.3Ex r3 = r6.A04
            X.33i r2 = r6.A07
            X.33j r1 = r6.A09
            X.5Y4 r0 = new X.5Y4
            r0.<init>(r3, r2, r4, r1)
            X.1mQ r7 = (X.C30421mQ) r7
            X.2Mn r0 = r0.A03(r7)
            if (r0 == 0) goto L_0x0234
            r7 = r36
            if (r36 == 0) goto L_0x0234
            X.5a1 r6 = r0.A01
            android.content.res.Resources r1 = r19.getResources()
            r0 = 2131168237(0x7f070bed, float:1.795077E38)
            int r12 = r1.getDimensionPixelSize(r0)
            r11 = 0
            X.5mM r0 = r7.A06
            X.5UX r4 = r0.A02
            X.2rN r3 = r0.A0C
            X.2xc r2 = r0.A0B
            r1 = 0
            X.5kH r0 = new X.5kH
            r0.<init>(r4, r1, r2, r3)
            r8 = r19
            r9 = r0
            r10 = r6
            r7.A07(r8, r9, r10, r11, r12)
        L_0x0234:
            boolean r0 = r5 instanceof X.C97594yo
            if (r0 == 0) goto L_0x024d
            if (r16 == 0) goto L_0x0859
            int r0 = r16.getVisibility()
            if (r0 != 0) goto L_0x0859
            r0 = 2131428516(0x7f0b04a4, float:1.8478679E38)
            android.view.View r1 = X.C06560Yg.A02(r5, r0)
            r0 = 2131233598(0x7f080b3e, float:1.8083338E38)
            r1.setBackgroundResource(r0)
        L_0x024d:
            return
        L_0x024e:
            r1 = 8
            r0 = r19
            r0.setVisibility(r1)
            goto L_0x0234
        L_0x0256:
            r0 = 8
            r15.setVisibility(r0)
            goto L_0x01e6
        L_0x025c:
            android.content.Context r10 = X.C86634Kw.A0B(r4, r5)
            android.text.TextPaint r2 = r4.getPaint()
            boolean r0 = r7 instanceof X.AnonymousClass1n3
            if (r0 == 0) goto L_0x036e
            r0 = 2131895099(0x7f12233b, float:1.9425021E38)
            java.lang.CharSequence r12 = A00(r10, r2, r0)
        L_0x026f:
            boolean r0 = r7 instanceof X.C30771mz
            r10 = 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x02b9
            X.5XF r1 = r6.A02
            r0 = r7
            X.1mz r0 = (X.C30771mz) r0
            android.text.SpannableString r13 = r1.A00(r0)
            r0 = 1
            r4.setMaxLines(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r13)
            if (r1 != 0) goto L_0x029e
            android.content.Context r9 = X.C86634Kw.A0B(r8, r5)
            android.text.TextPaint r2 = r8.getPaint()
            X.8GU r1 = new X.8GU
            r1.<init>(r0, r10)
            X.5Y0 r0 = r6.A0B
            java.lang.CharSequence r0 = X.C107345b9.A02(r9, r2, r1, r0, r13)
            r8.setText(r0)
        L_0x029e:
            r0 = 1
        L_0x029f:
            android.content.Context r8 = r5.getContext()
            android.text.TextPaint r2 = r4.getPaint()
            X.8GU r1 = new X.8GU
            r1.<init>(r0, r10)
            X.5Y0 r0 = r6.A0B
            java.lang.CharSequence r0 = X.C107345b9.A02(r8, r2, r1, r0, r12)
            r4.setText(r0)
            r1 = r22
            goto L_0x0167
        L_0x02b9:
            boolean r0 = r7 instanceof X.C30821nD
            if (r0 == 0) goto L_0x0302
            r0 = r7
            X.1nD r0 = (X.C30821nD) r0
            java.lang.String r13 = r0.A06
            boolean r0 = android.text.TextUtils.isEmpty(r13)
            if (r0 != 0) goto L_0x029e
            android.content.Context r9 = X.C86634Kw.A0B(r8, r5)
            android.text.TextPaint r2 = r8.getPaint()
            r0 = 1
            X.8GU r1 = new X.8GU
            r1.<init>(r0, r10)
            X.5Y0 r0 = r6.A0B
            java.lang.CharSequence r0 = X.C107345b9.A02(r9, r2, r1, r0, r13)
            r8.setText(r0)
            android.view.ViewGroup$LayoutParams r1 = r16.getLayoutParams()
            android.content.res.Resources r2 = r16.getResources()
            r0 = 2131167699(0x7f0709d3, float:1.7949679E38)
            int r0 = r2.getDimensionPixelSize(r0)
            r1.width = r0
            android.view.ViewGroup$LayoutParams r1 = r16.getLayoutParams()
            android.content.res.Resources r2 = r16.getResources()
            r0 = 2131167698(0x7f0709d2, float:1.7949677E38)
            int r0 = r2.getDimensionPixelSize(r0)
            r1.height = r0
            goto L_0x029e
        L_0x0302:
            byte r1 = r7.A1I
            r0 = 54
            if (r1 != r0) goto L_0x0364
            boolean r0 = r7 instanceof X.C30791n7
            if (r0 == 0) goto L_0x0364
            r0 = r7
            X.1n7 r0 = (X.C30791n7) r0
            X.39W r0 = r0.A00
            if (r0 == 0) goto L_0x0362
            X.39S r13 = r0.A01
            if (r13 == 0) goto L_0x0362
            byte[] r0 = r13.A0M
            if (r0 == 0) goto L_0x033d
            android.view.ViewGroup$LayoutParams r2 = r16.getLayoutParams()
            android.content.res.Resources r1 = r16.getResources()
            r0 = 2131165728(0x7f070220, float:1.7945681E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r2.width = r0
            android.view.ViewGroup$LayoutParams r2 = r16.getLayoutParams()
            android.content.res.Resources r1 = r16.getResources()
            r0 = 2131165727(0x7f07021f, float:1.794568E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r2.height = r0
        L_0x033d:
            r14 = 0
            r8.setVisibility(r14)
            r2 = 2131892030(0x7f12173e, float:1.9418797E38)
            java.lang.Object[] r1 = X.AnonymousClass002.A0M()
            X.39H r0 = r13.A07
            int r0 = r0.A00()
            X.AnonymousClass000.A1P(r1, r0, r14)
            X.9Wq r0 = r6.A0F
            java.lang.String r13 = r0.A0b(r13)
            r0 = 1
            r1[r0] = r13
            X.AnonymousClass001.A0y(r9, r8, r1, r2)
        L_0x035d:
            r4.setMaxLines(r0)
            goto L_0x029f
        L_0x0362:
            r0 = 1
            goto L_0x035d
        L_0x0364:
            r0 = 1
            r1 = 3
            r4.setMaxLines(r1)
            r8.setVisibility(r13)
            goto L_0x029f
        L_0x036e:
            boolean r0 = r7 instanceof X.C31991pD
            if (r0 == 0) goto L_0x037b
            r0 = 2131895118(0x7f12234e, float:1.942506E38)
            java.lang.CharSequence r12 = A00(r10, r2, r0)
            goto L_0x026f
        L_0x037b:
            boolean r0 = r7 instanceof X.C30711mt
            if (r0 == 0) goto L_0x0388
            r0 = 2131895076(0x7f122324, float:1.9424975E38)
            java.lang.CharSequence r12 = A00(r10, r2, r0)
            goto L_0x026f
        L_0x0388:
            boolean r0 = r7 instanceof X.C31931p6
            if (r0 == 0) goto L_0x0395
            r0 = 2131895109(0x7f122345, float:1.9425042E38)
            java.lang.CharSequence r12 = A00(r10, r2, r0)
            goto L_0x026f
        L_0x0395:
            boolean r0 = r7 instanceof X.AnonymousClass4FG
            if (r0 == 0) goto L_0x03b4
            r1 = r7
            X.4FG r1 = (X.AnonymousClass4FG) r1
            int r0 = X.AnonymousClass25Z.A00(r1)
            java.lang.String r1 = r1.BBp()
            if (r0 == 0) goto L_0x03ae
            android.graphics.drawable.Drawable r0 = X.AnonymousClass0RP.A00(r10, r0)
            java.lang.CharSequence r1 = X.C87044Mw.A01(r2, r0, r1)
        L_0x03ae:
            java.lang.CharSequence r12 = r6.A0F(r10, r2, r7, r1)
            goto L_0x026f
        L_0x03b4:
            boolean r0 = r7 instanceof X.C31901p2
            if (r0 == 0) goto L_0x03be
            java.lang.CharSequence r12 = r6.A09(r10, r2, r7)
            goto L_0x026f
        L_0x03be:
            boolean r0 = r7 instanceof X.C30481mW
            if (r0 == 0) goto L_0x03c8
            java.lang.CharSequence r12 = r6.A0D(r10, r2, r7)
            goto L_0x026f
        L_0x03c8:
            boolean r0 = r7 instanceof X.C30341mI
            r1 = 0
            if (r0 == 0) goto L_0x03de
            X.5Xz r12 = r6.A0D
            X.35q r2 = r6.A00
            r0 = r7
            X.1mI r0 = (X.C30341mI) r0
            java.lang.String r0 = r2.A0O(r0, r1)
            java.lang.CharSequence r12 = r12.A02(r10, r7, r0)
            goto L_0x026f
        L_0x03de:
            boolean r0 = r7 instanceof X.C30771mz
            if (r0 == 0) goto L_0x03f0
            r0 = r7
            X.1mz r0 = (X.C30771mz) r0
            java.lang.String r1 = r0.A09
            r0 = 2131233202(0x7f0809b2, float:1.8082535E38)
            java.lang.CharSequence r12 = X.C87044Mw.A00(r10, r2, r1, r0)
            goto L_0x026f
        L_0x03f0:
            boolean r0 = r7 instanceof X.AnonymousClass4DV
            if (r0 == 0) goto L_0x03fa
            java.lang.CharSequence r12 = r6.A08(r10, r2, r7)
            goto L_0x026f
        L_0x03fa:
            boolean r0 = r7 instanceof X.C30391mN
            if (r0 == 0) goto L_0x0404
            java.lang.CharSequence r12 = r6.A06(r10, r2, r7)
            goto L_0x026f
        L_0x0404:
            boolean r0 = r7 instanceof X.C30821nD
            if (r0 == 0) goto L_0x041a
            r1 = r7
            X.1nD r1 = (X.C30821nD) r1
            X.33j r0 = r6.A09
            java.lang.String r1 = X.C107315b6.A03(r0, r1)
            r0 = 2131233195(0x7f0809ab, float:1.808252E38)
            java.lang.CharSequence r12 = X.C87044Mw.A00(r10, r2, r1, r0)
            goto L_0x026f
        L_0x041a:
            boolean r0 = r7 instanceof X.AnonymousClass1n2
            if (r0 == 0) goto L_0x0424
            java.lang.CharSequence r12 = r6.A07(r10, r2, r7)
            goto L_0x026f
        L_0x0424:
            boolean r0 = r7 instanceof X.C30721mu
            if (r0 == 0) goto L_0x042e
            java.lang.CharSequence r12 = r6.A01(r10, r2, r7)
            goto L_0x026f
        L_0x042e:
            boolean r0 = r7 instanceof X.C31961pA
            if (r0 == 0) goto L_0x0438
            java.lang.CharSequence r12 = r6.A05(r10, r2, r7)
            goto L_0x026f
        L_0x0438:
            boolean r0 = r7 instanceof X.C31971pB
            if (r0 == 0) goto L_0x0442
            java.lang.CharSequence r12 = r6.A0E(r10, r2, r7)
            goto L_0x026f
        L_0x0442:
            boolean r0 = r7 instanceof X.AnonymousClass1nF
            if (r0 == 0) goto L_0x044c
            java.lang.CharSequence r12 = r6.A04(r10, r2, r7)
            goto L_0x026f
        L_0x044c:
            boolean r0 = r7 instanceof X.C30421mQ
            if (r0 == 0) goto L_0x0456
            java.lang.CharSequence r12 = r6.A03(r10, r2, r7)
            goto L_0x026f
        L_0x0456:
            boolean r0 = r7 instanceof X.C30411mP
            if (r0 == 0) goto L_0x0460
            java.lang.CharSequence r12 = r6.A02(r10, r2, r7)
            goto L_0x026f
        L_0x0460:
            boolean r0 = r7 instanceof X.AnonymousClass1n9
            if (r0 == 0) goto L_0x046a
            java.lang.CharSequence r12 = r6.A0C(r10, r2, r7)
            goto L_0x026f
        L_0x046a:
            boolean r0 = r7 instanceof X.C30801n8
            if (r0 == 0) goto L_0x0474
            java.lang.CharSequence r12 = r6.A0A(r10, r2, r7)
            goto L_0x026f
        L_0x0474:
            boolean r0 = r7 instanceof X.C30691mr
            if (r0 == 0) goto L_0x0485
            X.2oU r0 = r6.A08
            android.content.Context r1 = r0.A00
            r0 = 2131888318(0x7f1208be, float:1.9411268E38)
            java.lang.String r12 = r1.getString(r0)
            goto L_0x026f
        L_0x0485:
            boolean r0 = X.C626635z.A09(r7)
            if (r0 == 0) goto L_0x0498
            X.2oU r0 = r6.A08
            android.content.Context r1 = r0.A00
            r0 = 2131888299(0x7f1208ab, float:1.941123E38)
            java.lang.String r12 = r1.getString(r0)
            goto L_0x026f
        L_0x0498:
            boolean r0 = r7 instanceof X.C30441mS
            if (r0 == 0) goto L_0x04c1
            X.2z0 r0 = r7.A1J
            X.4uZ r1 = r0.A00
            boolean r2 = r1 instanceof X.C95804uY
            X.2oU r1 = r6.A08
            android.content.Context r1 = r1.A00
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x04b8
            r0 = 2131893220(0x7f121be4, float:1.942121E38)
            if (r2 == 0) goto L_0x04b2
            r0 = 2131893221(0x7f121be5, float:1.9421212E38)
        L_0x04b2:
            java.lang.String r12 = r1.getString(r0)
            goto L_0x026f
        L_0x04b8:
            r0 = 2131893218(0x7f121be2, float:1.9421206E38)
            if (r2 == 0) goto L_0x04b2
            r0 = 2131893219(0x7f121be3, float:1.9421208E38)
            goto L_0x04b2
        L_0x04c1:
            boolean r0 = r7 instanceof X.AnonymousClass1nE
            if (r0 == 0) goto L_0x04d2
            X.2oU r0 = r6.A08
            android.content.Context r1 = r0.A00
            r0 = 2131888312(0x7f1208b8, float:1.9411256E38)
            java.lang.String r12 = r1.getString(r0)
            goto L_0x026f
        L_0x04d2:
            boolean r0 = r7 instanceof X.C30431mR
            if (r0 == 0) goto L_0x04dc
            java.lang.CharSequence r12 = r6.A0G(r10, r7)
            goto L_0x026f
        L_0x04dc:
            boolean r0 = r7 instanceof X.C30451mT
            if (r0 == 0) goto L_0x04f9
            r12 = r7
            X.1mT r12 = (X.C30451mT) r12
            X.1VX r0 = r6.A0C
            boolean r0 = X.C86614Ku.A1Y(r0)
            r1 = 2131233198(0x7f0809ae, float:1.8082527E38)
            if (r0 == 0) goto L_0x04f1
            r1 = 2131233199(0x7f0809af, float:1.8082529E38)
        L_0x04f1:
            java.lang.String r0 = r12.A03
            java.lang.CharSequence r12 = X.C87044Mw.A00(r10, r2, r0, r1)
            goto L_0x026f
        L_0x04f9:
            boolean r0 = r7 instanceof X.C31951p9
            if (r0 == 0) goto L_0x0503
            java.lang.CharSequence r12 = r6.A0B(r10, r2, r7)
            goto L_0x026f
        L_0x0503:
            boolean r0 = r7 instanceof X.C30371mL
            if (r0 == 0) goto L_0x0556
            X.3Ex r12 = r6.A04
            X.2z0 r14 = r7.A1J
            X.4uZ r0 = r14.A00
            X.3ZH r12 = r12.A07(r0)
            if (r12 == 0) goto L_0x0554
            X.5ZU r0 = r6.A06
            java.lang.String r12 = X.AnonymousClass5ZU.A03(r0, r12)
        L_0x0519:
            boolean r0 = r14.A02
            r20 = r0
            r14 = 1
            X.2oU r0 = r6.A08
            r23 = r0
            if (r20 == 0) goto L_0x0540
            java.lang.Object[] r14 = new java.lang.Object[r14]
            r14[r1] = r12
            r1 = 2131892658(0x7f1219b2, float:1.942007E38)
            android.content.res.Resources r0 = X.C54292oU.A00(r23)
            java.lang.String r0 = r0.getString(r1, r14)
        L_0x0533:
            android.text.Spanned r1 = X.AnonymousClass0x9.A0B(r0)
            r0 = 2131232532(0x7f080714, float:1.8081176E38)
            java.lang.CharSequence r12 = X.C87044Mw.A00(r10, r2, r1, r0)
            goto L_0x026f
        L_0x0540:
            java.lang.Object[] r12 = X.C18310x6.A1b(r12, r1)
            java.lang.String r0 = ""
            r12[r14] = r0
            r1 = 2131892657(0x7f1219b1, float:1.9420068E38)
            android.content.res.Resources r0 = X.C54292oU.A00(r23)
            java.lang.String r0 = r0.getString(r1, r12)
            goto L_0x0533
        L_0x0554:
            r12 = 0
            goto L_0x0519
        L_0x0556:
            boolean r0 = r7 instanceof X.C30401mO
            if (r0 == 0) goto L_0x0577
            r14 = r7
            X.1mO r14 = (X.C30401mO) r14
            X.8qC r0 = r6.A0L
            java.lang.Object r12 = r0.get()
            X.34o r12 = (X.C623234o) r12
            int r0 = r12.A02(r14)
            java.lang.String r0 = r10.getString(r0)
            android.graphics.drawable.Drawable r1 = r12.A03(r10, r14, r1)
            java.lang.CharSequence r12 = X.C87044Mw.A01(r2, r1, r0)
            goto L_0x026f
        L_0x0577:
            boolean r0 = r7 instanceof X.C30461mU
            if (r0 == 0) goto L_0x0589
            r0 = r7
            X.1mU r0 = (X.C30461mU) r0
            java.lang.String r1 = r0.A04
            r0 = 2131233922(0x7f080c82, float:1.8083995E38)
            java.lang.CharSequence r12 = X.C87044Mw.A00(r10, r2, r1, r0)
            goto L_0x026f
        L_0x0589:
            boolean r0 = r7 instanceof X.C30381mM
            if (r0 == 0) goto L_0x05af
            r1 = r7
            X.1mM r1 = (X.C30381mM) r1
            java.lang.String r0 = r1.A02
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x05ac
            X.2oU r0 = r6.A08
            android.content.Context r1 = r0.A00
            r0 = 2131890982(0x7f121326, float:1.9416671E38)
            java.lang.String r1 = r1.getString(r0)
        L_0x05a3:
            r0 = 2131234094(0x7f080d2e, float:1.8084344E38)
            java.lang.CharSequence r12 = X.C87044Mw.A00(r10, r2, r1, r0)
            goto L_0x026f
        L_0x05ac:
            java.lang.String r1 = r1.A02
            goto L_0x05a3
        L_0x05af:
            X.2oU r0 = r6.A08
            android.content.Context r1 = r0.A00
            r0 = 2131888314(0x7f1208ba, float:1.941126E38)
            java.lang.String r12 = r1.getString(r0)
            goto L_0x026f
        L_0x05bc:
            if (r14 != 0) goto L_0x05e3
            X.2oU r0 = r6.A08
            android.content.Context r1 = r0.A00
            r0 = 2131889754(0x7f120e5a, float:1.941418E38)
            goto L_0x013f
        L_0x05c7:
            if (r14 != 0) goto L_0x05e3
            r0 = r7
            X.1nT r0 = (X.C30941nT) r0
            java.lang.String r0 = r0.A00
            boolean r12 = android.text.TextUtils.isEmpty(r0)
            if (r12 != 0) goto L_0x05de
            r1 = 0
            r3.A0K(r1, r0)
            r0 = 0
            r5.setVisibility(r0)
            goto L_0x0147
        L_0x05de:
            r5.setVisibility(r1)
            goto L_0x0147
        L_0x05e3:
            r0 = 0
            r3.A0K(r0, r13)
            goto L_0x0147
        L_0x05e9:
            int r12 = r10.ordinal()
            r2 = 2131099867(0x7f0600db, float:1.78121E38)
            r0 = 5
            if (r12 == r0) goto L_0x05f9
            r0 = 3
            if (r12 == r0) goto L_0x0616
            r2 = 2131102274(0x7f060a42, float:1.7816981E38)
        L_0x05f9:
            int r2 = X.AnonymousClass0Y8.A04(r9, r2)
            r0 = 5
            if (r12 != r0) goto L_0x0636
            r11.A0E()
            X.2oU r0 = r6.A08
            android.content.Context r12 = r0.A00
            r0 = 2131889754(0x7f120e5a, float:1.941418E38)
            java.lang.String r13 = r12.getString(r0)
            r12 = 0
            r0 = r23
            r0.A0B(r12, r13)
            goto L_0x00f9
        L_0x0616:
            X.2sj r0 = r6.A0A
            r14 = r0
            r0 = r20
            X.4uZ r13 = r0.A00
            X.1fL r13 = (X.C28011fL) r13
            X.4uZ r2 = r7.A0n()
            X.C626936e.A06(r2)
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            X.2zG r0 = X.C86624Kv.A0J(r14, r13, r2)
            if (r0 == 0) goto L_0x0647
            android.content.res.Resources r2 = r5.getResources()
            int r2 = X.C86624Kv.A00(r2, r0)
        L_0x0636:
            X.3Ex r12 = r6.A04
            X.4uZ r0 = r7.A0n()
            X.3ZH r12 = X.C64773Ex.A00(r12, r0)
            r0 = r23
            r0.A08(r12)
            goto L_0x00f9
        L_0x0647:
            r2 = 2131102079(0x7f06097f, float:1.7816586E38)
            goto L_0x05f9
        L_0x064b:
            int r2 = r10.ordinal()
            r12 = 0
            if (r2 == r12) goto L_0x072a
            r0 = 2
            if (r2 == r0) goto L_0x067b
            com.whatsapp.jid.UserJid r0 = r7.A0o()
            X.3Ex r2 = r6.A04
            if (r0 == 0) goto L_0x065f
            r33 = r0
        L_0x065f:
            r0 = r33
            X.3ZH r12 = r2.A0A(r0)
            r0 = 2131102274(0x7f060a42, float:1.7816981E38)
            int r2 = X.AnonymousClass0Y8.A04(r9, r0)
            r0 = r23
            r0.A08(r12)
        L_0x0671:
            r0 = r18
            r0.setVisibility(r1)
            r3.setVisibility(r1)
            goto L_0x0147
        L_0x067b:
            X.4uZ r13 = r7.A0n()
            X.C626936e.A06(r13)
            com.whatsapp.jid.UserJid r13 = (com.whatsapp.jid.UserJid) r13
            X.3Ex r0 = r6.A04
            X.3ZH r0 = r0.A0A(r13)
            X.2sj r2 = r6.A0A
            X.2z0 r1 = r7.A1J
            X.4uZ r1 = r1.A00
            X.1fL r1 = (X.C28011fL) r1
            X.2zG r2 = X.C86624Kv.A0J(r2, r1, r13)
            if (r2 == 0) goto L_0x0721
            android.content.res.Resources r1 = r5.getResources()
            int r2 = X.C86624Kv.A00(r1, r2)
        L_0x06a0:
            if (r41 == 0) goto L_0x071f
            X.5ZU r13 = r6.A06
            r1 = r33
            int r1 = r13.A06(r0, r1)
        L_0x06aa:
            X.5ZU r13 = r6.A06
            r29 = r13
            X.7HU r22 = r13.A0B(r0, r1)
            r21 = 0
            boolean r28 = r0.A0W()
            r13 = 8
            r25 = r0
            r26 = r21
            r27 = r1
            r24 = r22
            r23.A07(r24, r25, r26, r27, r28)
            r14 = 7
            if (r14 != r1) goto L_0x071a
            X.58i r20 = X.C998258i.PUSH_NAME
            r1 = r22
            X.58i r14 = r1.A00
            r1 = r20
            if (r1 != r14) goto L_0x071a
            r14 = 1
            r1 = r29
            X.7HU r0 = r1.A0F(r0, r14)
            java.lang.String r1 = r0.A01
            boolean r14 = android.text.TextUtils.isEmpty(r1)
            r0 = 8
            if (r14 != 0) goto L_0x06e9
            r0 = r21
            r3.A0K(r0, r1)
            r0 = 0
        L_0x06e9:
            r3.setVisibility(r0)
            r0 = 2131432828(0x7f0b157c, float:1.8487424E38)
            android.view.View r1 = X.C06560Yg.A02(r5, r0)
            X.6Fh r1 = (X.C125096Fh) r1
            r0 = 1
            r1.A00 = r0
            r0 = 2132083129(0x7f1501b9, float:1.9806392E38)
            X.AnonymousClass0Y9.A06(r3, r0)
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131166007(0x7f070337, float:1.7946247E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r3.setPadding(r0, r12, r12, r12)
            r0 = 2131101210(0x7f06061a, float:1.7814823E38)
            int r1 = X.AnonymousClass0Y8.A04(r9, r0)
        L_0x0713:
            r0 = r18
            r0.setVisibility(r13)
            goto L_0x014a
        L_0x071a:
            r3.setVisibility(r13)
            r1 = r2
            goto L_0x0713
        L_0x071f:
            r1 = 1
            goto L_0x06aa
        L_0x0721:
            r1 = 2131102079(0x7f06097f, float:1.7816586E38)
            int r2 = X.AnonymousClass0Y8.A04(r9, r1)
            goto L_0x06a0
        L_0x072a:
            r13 = 8
            r2 = 2130970369(0x7f040701, float:1.7549446E38)
            r0 = 2131102218(0x7f060a0a, float:1.7816868E38)
            int r2 = X.C18300x5.A03(r9, r2, r0)
            r23.A05()
            r0 = r18
            r0.setVisibility(r1)
            r3.setVisibility(r1)
            r1 = r2
            goto L_0x014a
        L_0x0744:
            X.2z0 r10 = r7.A1J
            X.4uZ r2 = r10.A00
            boolean r0 = r2 instanceof X.C135166kE
            if (r0 == 0) goto L_0x0750
            X.58e r10 = X.C997858e.STATUS
            goto L_0x00d8
        L_0x0750:
            boolean r0 = X.C627336j.A0K(r2)
            if (r0 == 0) goto L_0x076a
            r0 = r33
            boolean r0 = X.C162457s7.A0P(r2, r0)
            if (r0 == 0) goto L_0x0766
            boolean r0 = r10.A02
            if (r0 != 0) goto L_0x0772
            X.58e r10 = X.C997858e.SAME_GROUP
            goto L_0x00d8
        L_0x0766:
            X.58e r10 = X.C997858e.CROSS_GROUP
            goto L_0x00d8
        L_0x076a:
            boolean r0 = r10.A02
            if (r0 != 0) goto L_0x0772
            X.58e r10 = X.C997858e.INDIVIDUAL
            goto L_0x00d8
        L_0x0772:
            X.58e r10 = X.C997858e.FROM_ME
            goto L_0x00d8
        L_0x0776:
            r0 = 8
            r12.setVisibility(r0)
            r0 = 0
            r12.setImageDrawable(r0)
            r1 = 2130970280(0x7f0406a8, float:1.7549266E38)
            r0 = 2131102109(0x7f06099d, float:1.7816647E38)
            X.AnonymousClass5Yj.A0B(r9, r13, r1, r0)
            r0 = 1101004800(0x41a00000, float:20.0)
            r13.setTextSize(r0)
            goto L_0x00d0
        L_0x078f:
            boolean r0 = r7 instanceof X.C30431mR
            if (r0 == 0) goto L_0x07dd
            X.9Wq r1 = r6.A0F
            r0 = r7
            X.1mR r0 = (X.C30431mR) r0
            int r0 = r0.A00
            java.lang.CharSequence r2 = r1.A0J(r9, r0)
            r1 = 8
            r0 = r23
            com.whatsapp.TextEmojiLabel r11 = r0.A02
            r11.setVisibility(r1)
            if (r2 == 0) goto L_0x07d6
            android.text.SpannableStringBuilder r21 = X.C18330xA.A00(r2)
            r1 = 2130970369(0x7f040701, float:1.7549446E38)
            r0 = 2131102218(0x7f060a0a, float:1.7816868E38)
            int r1 = X.C18300x5.A03(r9, r1, r0)
            android.text.style.ForegroundColorSpan r20 = new android.text.style.ForegroundColorSpan
            r0 = r20
            r0.<init>(r1)
            int r1 = r2.length()
            r0 = 0
            r14 = r1
            r10 = r0
            r1 = r21
            r0 = r20
            r1.setSpan(r0, r10, r14, r10)
            r13.setText(r1)
            r0 = r22
            X.C86624Kv.A13(r0, r12)
            goto L_0x00d0
        L_0x07d6:
            r0 = r22
            r0.setVisibility(r1)
            goto L_0x00d0
        L_0x07dd:
            r2 = 0
            X.5BL r10 = new X.5BL
            r0 = r16
            r10.<init>(r7, r0, r6, r2)
            boolean r0 = r7 instanceof X.AnonymousClass1n2
            java.lang.String r11 = "quoted-"
            if (r0 == 0) goto L_0x07ef
            boolean r0 = r7 instanceof X.C30771mz
            if (r0 == 0) goto L_0x0836
        L_0x07ef:
            boolean r0 = r7 instanceof X.C31981pC
            if (r0 != 0) goto L_0x0836
            r1 = 8
            X.1sV r12 = r6.A0K
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()
            X.C624134x.A0S(r7, r11, r0)
            java.lang.String r11 = r0.toString()
            r0 = r16
            r12.A0B(r0, r7, r10, r11)
        L_0x0807:
            boolean r0 = r7 instanceof X.C31951p9
            if (r0 == 0) goto L_0x0828
            android.view.ViewGroup$LayoutParams r0 = r16.getLayoutParams()
            boolean r0 = r0 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x0825
            r0 = 1082130432(0x40800000, float:4.0)
            int r10 = X.AnonymousClass5YI.A04(r9, r0)
            android.view.ViewGroup$MarginLayoutParams r0 = X.AnonymousClass001.A0T(r16)
            r0.setMargins(r10, r10, r10, r10)
            r10 = r16
            r10.setLayoutParams(r0)
        L_0x0825:
            X.C107235av.A01(r16)
        L_0x0828:
            r0 = r22
            r0.setVisibility(r1)
            r0 = r23
            com.whatsapp.TextEmojiLabel r11 = r0.A02
            r11.setVisibility(r2)
            goto L_0x00d2
        L_0x0836:
            X.1sV r0 = r6.A0K
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            X.C624134x.A0S(r7, r11, r1)
            java.lang.String r28 = r1.toString()
            r1 = 8
            r31 = 1
            r29 = 100
            r25 = r16
            r26 = r7
            r27 = r10
            r30 = r2
            r32 = r31
            r24 = r0
            r24.A0C(r25, r26, r27, r28, r29, r30, r31, r32)
            goto L_0x0807
        L_0x0859:
            r0 = 2131428516(0x7f0b04a4, float:1.8478679E38)
            android.view.View r1 = X.C06560Yg.A02(r5, r0)
            r0 = 0
            r1.setBackgroundColor(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C114005mL.A0H(android.view.View, X.5Uq, X.4uZ, X.34x, X.33O, boolean, boolean):void");
    }
}
