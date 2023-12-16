package X;

import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.4Vs  reason: invalid class name */
public final class AnonymousClass4Vs extends AnonymousClass0QO {
    public final List A00;
    public final List A01;

    public int A00() {
        return this.A00.size();
    }

    public int A01() {
        return this.A01.size();
    }

    public boolean A03(int i, int i2) {
        int i3;
        int i4;
        AnonymousClass2z0 r3;
        AnonymousClass2z0 r0;
        Integer num;
        Integer num2;
        C42602Ou r02;
        AnonymousClass5C8 r1 = (AnonymousClass5C8) this.A01.get(i);
        AnonymousClass5C8 r2 = (AnonymousClass5C8) this.A00.get(i2);
        if ((r1 instanceof AnonymousClass536) && (r2 instanceof AnonymousClass536)) {
            AnonymousClass536 r12 = (AnonymousClass536) r1;
            AnonymousClass536 r22 = (AnonymousClass536) r2;
            if (r12.A02 != r22.A02) {
                return false;
            }
            AnonymousClass1RL r8 = r12.A03;
            AnonymousClass1RL r7 = r22.A03;
            if (!C162457s7.A0P(r8.A0I(), r7.A0I()) || r8.A0C != r7.A0C || r8.A03 != r7.A03 || !C162457s7.A0P(r8.A0H, r7.A0H) || r8.A04 != r7.A04 || r8.A0K != r7.A0K || r8.A0B != r7.A0B) {
                return false;
            }
            C624134x r6 = r12.A04;
            C42602Ou r5 = null;
            if (r6 != null) {
                r3 = r6.A1J;
            } else {
                r3 = null;
            }
            C624134x r4 = r22.A04;
            if (r4 != null) {
                r0 = r4.A1J;
            } else {
                r0 = null;
            }
            if (!C162457s7.A0P(r3, r0)) {
                return false;
            }
            if (r6 != null) {
                num = Integer.valueOf(r6.A1I);
            } else {
                num = null;
            }
            if (r4 != null) {
                num2 = Integer.valueOf(r4.A1I);
            } else {
                num2 = null;
            }
            if (!C162457s7.A0P(num, num2)) {
                return false;
            }
            if (r6 != null) {
                r02 = r6.A11();
            } else {
                r02 = null;
            }
            if (r4 != null) {
                r5 = r4.A11();
            }
            if (!C162457s7.A0P(r02, r5)) {
                return false;
            }
            AnonymousClass3ZH r82 = r12.A00;
            AnonymousClass3ZH r72 = r22.A00;
            if (r82.A0C == r72.A0C && C162457s7.A0P(r82.A0J(), r72.A0J()) && r12.A01 == r22.A01 && C162457s7.A0P(r12.A05, r22.A05) && r12.A06 == r22.A06) {
                return true;
            }
            return false;
        } else if ((r1 instanceof C986552s) && (r2 instanceof C986552s)) {
            return C106615Zr.A00.A01((C986552s) r1, (C986552s) r2);
        } else {
            if ((r1 instanceof C985952l) && (r2 instanceof C985952l)) {
                i3 = ((C985952l) r1).A00;
                i4 = ((C985952l) r2).A00;
            } else if ((r1 instanceof AnonymousClass530) && (r2 instanceof AnonymousClass530)) {
                i3 = ((AnonymousClass530) r1).A00;
                i4 = ((AnonymousClass530) r2).A00;
            } else if ((r1 instanceof AnonymousClass538) && (r2 instanceof AnonymousClass538)) {
                return true;
            } else {
                if ((r1 instanceof AnonymousClass531) && (r2 instanceof AnonymousClass531)) {
                    return C106615Zr.A00(((AnonymousClass531) r1).A00, ((AnonymousClass531) r2).A00);
                }
                if ((r1 instanceof C986952w) && (r2 instanceof C986952w)) {
                    i3 = ((C986952w) r1).A00;
                    i4 = ((C986952w) r2).A00;
                } else if ((r1 instanceof AnonymousClass532) && (r2 instanceof AnonymousClass532)) {
                    i3 = ((AnonymousClass532) r1).A00;
                    i4 = ((AnonymousClass532) r2).A00;
                } else if ((r1 instanceof AnonymousClass535) && (r2 instanceof AnonymousClass535)) {
                    AnonymousClass535 r13 = (AnonymousClass535) r1;
                    AnonymousClass535 r23 = (AnonymousClass535) r2;
                    if (r13.A01 != r23.A01 || r13.A00.size() != r23.A00.size()) {
                        return false;
                    }
                    i3 = r13.A02;
                    i4 = r23.A02;
                } else if ((r1 instanceof C987052x) && (r2 instanceof C987052x)) {
                    return C162457s7.A0P(((C987052x) r1).A00, ((C987052x) r2).A00);
                } else {
                    if ((r1 instanceof C986752u) && (r2 instanceof C986752u)) {
                        return true;
                    }
                    if (!(r1 instanceof C986152o) || !(r2 instanceof C986152o)) {
                        if (r1 instanceof AnonymousClass53C) {
                            return r2 instanceof AnonymousClass53C;
                        }
                        if (r1 instanceof AnonymousClass53E) {
                            return r2 instanceof AnonymousClass53E;
                        }
                        if (r1 instanceof AnonymousClass53D) {
                            return r2 instanceof AnonymousClass53D;
                        }
                        if (r1 instanceof AnonymousClass53A) {
                            return r2 instanceof AnonymousClass53A;
                        }
                        if (r1 instanceof AnonymousClass53B) {
                            return r2 instanceof AnonymousClass53B;
                        }
                        if (r1 instanceof AnonymousClass539) {
                            return r2 instanceof AnonymousClass539;
                        }
                        if ((r1 instanceof C987152y) && (r2 instanceof C987152y)) {
                            i3 = ((C987152y) r1).A00;
                            i4 = ((C987152y) r2).A00;
                        } else if ((r1 instanceof AnonymousClass52k) && (r2 instanceof AnonymousClass52k)) {
                            i3 = ((AnonymousClass52k) r1).A00;
                            i4 = ((AnonymousClass52k) r2).A00;
                        } else if (!(r1 instanceof AnonymousClass533) || !(r2 instanceof AnonymousClass533)) {
                            return false;
                        } else {
                            i3 = ((AnonymousClass533) r1).A00;
                            i4 = ((AnonymousClass533) r2).A00;
                        }
                    } else if (((C987252z) r1).A00 == ((C987252z) r2).A00) {
                        return true;
                    } else {
                        return false;
                    }
                }
            }
            if (i3 == i4) {
                return true;
            }
            return false;
        }
    }

    public boolean A04(int i, int i2) {
        UserJid userJid;
        AnonymousClass5C8 r1 = (AnonymousClass5C8) this.A01.get(i);
        AnonymousClass5C8 r2 = (AnonymousClass5C8) this.A00.get(i2);
        if (r1 instanceof AnonymousClass530) {
            return r2 instanceof AnonymousClass530;
        }
        if (r1 instanceof AnonymousClass538) {
            return r2 instanceof AnonymousClass538;
        }
        if (r1 instanceof AnonymousClass531) {
            return r2 instanceof AnonymousClass531;
        }
        if (r1 instanceof C986552s) {
            if (!(r2 instanceof C986552s)) {
                return false;
            }
            C986552s r12 = (C986552s) r1;
            C986552s r22 = (C986552s) r2;
            C18260x0.A0O(r12, r22);
            C623534r A002 = r12.A00();
            UserJid userJid2 = null;
            if (A002 != null) {
                userJid = A002.A0A;
            } else {
                userJid = null;
            }
            C623534r A003 = r22.A00();
            if (A003 != null) {
                userJid2 = A003.A0A;
            }
            return C162457s7.A0P(userJid, userJid2);
        } else if (r1 instanceof C986252p) {
            return r2 instanceof C986252p;
        } else {
            if (r1 instanceof AnonymousClass536) {
                if (!(r2 instanceof AnonymousClass536) || !C162457s7.A0P(((AnonymousClass536) r1).A03.A05(), ((AnonymousClass536) r2).A03.A05())) {
                    return false;
                }
                return true;
            } else if (r1 instanceof C986952w) {
                return r2 instanceof C986952w;
            } else {
                if (r1 instanceof AnonymousClass532) {
                    return r2 instanceof AnonymousClass532;
                }
                if (r1 instanceof C985952l) {
                    return r2 instanceof C985952l;
                }
                if (r1 instanceof C987052x) {
                    return r2 instanceof C987052x;
                }
                if (r1 instanceof AnonymousClass535) {
                    return r2 instanceof AnonymousClass535;
                }
                if (r1 instanceof C986752u) {
                    return r2 instanceof C986752u;
                }
                if (r1 instanceof C986052m) {
                    return r2 instanceof C986052m;
                }
                if (r1 instanceof C986152o) {
                    return r2 instanceof C986152o;
                }
                if (r1 instanceof AnonymousClass53F) {
                    return r2 instanceof AnonymousClass53F;
                }
                if (r1 instanceof AnonymousClass534) {
                    return r2 instanceof AnonymousClass534;
                }
                if (r1 instanceof AnonymousClass537) {
                    return r2 instanceof AnonymousClass537;
                }
                if (r1 instanceof AnonymousClass52n) {
                    return r2 instanceof AnonymousClass52n;
                }
                if (r1 instanceof C987252z) {
                    if (!(r2 instanceof C987252z) || ((C987252z) r1).A00 != ((C987252z) r2).A00) {
                        return false;
                    }
                    return true;
                } else if (r1 instanceof AnonymousClass53C) {
                    return r2 instanceof AnonymousClass53C;
                } else {
                    if (r1 instanceof AnonymousClass53E) {
                        return r2 instanceof AnonymousClass53E;
                    }
                    if (r1 instanceof AnonymousClass53D) {
                        return r2 instanceof AnonymousClass53D;
                    }
                    if (r1 instanceof AnonymousClass53A) {
                        return r2 instanceof AnonymousClass53A;
                    }
                    if (r1 instanceof AnonymousClass53B) {
                        return r2 instanceof AnonymousClass53B;
                    }
                    if (r1 instanceof AnonymousClass539) {
                        return r2 instanceof AnonymousClass539;
                    }
                    if (r1 instanceof C987152y) {
                        return r2 instanceof C987152y;
                    }
                    if (r1 instanceof AnonymousClass52k) {
                        return r2 instanceof AnonymousClass52k;
                    }
                    if (r1 instanceof AnonymousClass533) {
                        return r2 instanceof AnonymousClass533;
                    }
                    throw C73153f1.A00();
                }
            }
        }
    }

    public AnonymousClass4Vs(List list, List list2) {
        this.A01 = list;
        this.A00 = list2;
    }
}
