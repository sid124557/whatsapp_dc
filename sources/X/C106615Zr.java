package X;

import com.whatsapp.jid.UserJid;
import java.util.Set;

/* renamed from: X.5Zr  reason: invalid class name and case insensitive filesystem */
public final class C106615Zr {
    public static final C106615Zr A00 = new C106615Zr();

    public static final boolean A00(C104715Sb r5, C104715Sb r6) {
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        Boolean bool4 = null;
        if (r5 != null) {
            bool = Boolean.valueOf(r5.A01);
            bool2 = Boolean.valueOf(r5.A03);
        } else {
            bool = null;
            bool2 = null;
        }
        if (r6 != null) {
            bool3 = Boolean.valueOf(r6.A01);
            bool4 = Boolean.valueOf(r6.A03);
        } else {
            bool3 = null;
        }
        if (!C162457s7.A0P(bool, bool3) || !C162457s7.A0P(bool2, bool4)) {
            return false;
        }
        return true;
    }

    public final boolean A01(C986552s r18, C986552s r19) {
        AnonymousClass3ZH r10;
        AnonymousClass3ZH r9;
        UserJid userJid;
        UserJid userJid2;
        Integer num;
        Integer num2;
        Integer num3;
        CharSequence charSequence;
        CharSequence charSequence2;
        C986352q r4;
        Boolean bool;
        C986452r r42;
        C986552s r43 = r19;
        C986552s r6 = r18;
        boolean A1Y = AnonymousClass0x2.A1Y(r6, r43);
        C623534r A002 = r6.A00();
        C623534r A003 = r43.A00();
        boolean z = r6 instanceof C986352q;
        if (z) {
            r10 = ((C986352q) r6).A00;
        } else {
            r10 = ((C986452r) r6).A00;
        }
        boolean z2 = r43 instanceof C986352q;
        if (z2) {
            r9 = ((C986352q) r43).A00;
        } else {
            r9 = ((C986452r) r43).A00;
        }
        Integer num4 = null;
        if (A002 != null) {
            userJid = A002.A0A;
        } else {
            userJid = null;
        }
        if (A003 != null) {
            userJid2 = A003.A0A;
        } else {
            userJid2 = null;
        }
        if (C162457s7.A0P(userJid, userJid2)) {
            if (A002 != null) {
                num = Integer.valueOf(A002.A03());
            } else {
                num = null;
            }
            if (A003 != null) {
                num2 = Integer.valueOf(A003.A03());
            } else {
                num2 = null;
            }
            if (C162457s7.A0P(num, num2)) {
                if (A002 != null) {
                    num3 = Integer.valueOf(A002.A02());
                } else {
                    num3 = null;
                }
                if (A003 != null) {
                    num4 = Integer.valueOf(A003.A02());
                }
                if (C162457s7.A0P(num3, num4)) {
                    if (z) {
                        charSequence = ((C986352q) r6).A03;
                    } else {
                        charSequence = ((C986452r) r6).A03;
                    }
                    if (z2) {
                        charSequence2 = ((C986352q) r43).A03;
                    } else {
                        charSequence2 = ((C986452r) r43).A03;
                    }
                    if (C162457s7.A0P(charSequence, charSequence2) && r10.A05 == r9.A05 && r10.A0C == r9.A0C && C162457s7.A0P(r10.A0J(), r9.A0J())) {
                        Boolean bool2 = null;
                        if (z) {
                            C986352q r62 = (C986352q) r6;
                            if (r62 != null) {
                                C103685Ny r3 = r62.A02;
                                C103675Nx r1 = r3.A02;
                                if (z2 && (r4 = (C986352q) r43) != null) {
                                    C103685Ny r0 = r4.A02;
                                    C103675Nx r2 = r0.A02;
                                    if (A00(r3.A01, r0.A01)) {
                                        long size = (long) r1.A01.size();
                                        long size2 = (long) r1.A02.size();
                                        long size3 = (long) r1.A00.size();
                                        Set set = r1.A03;
                                        long size4 = (long) set.size();
                                        long size5 = (long) r2.A01.size();
                                        long size6 = (long) r2.A02.size();
                                        long size7 = (long) r2.A00.size();
                                        long size8 = (long) set.size();
                                        if (size == size5 && size2 == size6 && size3 == size7 && size4 == size8) {
                                            return true;
                                        }
                                        return false;
                                    }
                                }
                            }
                        } else if (!z2) {
                            if (!(r6 instanceof C986452r)) {
                                if (!(r43 instanceof C986452r)) {
                                    return A1Y;
                                }
                                bool = null;
                            } else {
                                C986452r r63 = (C986452r) r6;
                                if (r63 != null) {
                                    bool = Boolean.valueOf(r63.A05);
                                }
                                bool = null;
                            }
                            if ((r43 instanceof C986452r) && (r42 = (C986452r) r43) != null) {
                                bool2 = Boolean.valueOf(r42.A05);
                            }
                            return C162457s7.A0P(bool, bool2);
                        }
                    }
                }
            }
        }
        return false;
    }
}
