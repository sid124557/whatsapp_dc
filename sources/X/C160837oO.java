package X;

import java.util.List;

/* renamed from: X.7oO  reason: invalid class name and case insensitive filesystem */
public final class C160837oO {
    public int A00;
    public int A01 = 0;
    public int A02;
    public final C153797c2 A03;

    public static C153797c2 A03(C160837oO r1) {
        r1.A0A(0);
        return r1.A03;
    }

    public static C153797c2 A04(C160837oO r1) {
        r1.A0A(2);
        return r1.A03;
    }

    public static final void A05(int i) {
        if ((i & 3) != 0) {
            throw AnonymousClass6u5.A02("Failed to parse the message.");
        }
    }

    public static final void A06(int i) {
        if ((i & 7) != 0) {
            throw AnonymousClass6u5.A02("Failed to parse the message.");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001b, code lost:
        if (r2 != 0) goto L_0x0009;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A07() {
        /*
            r3 = this;
            int r2 = r3.A01
            if (r2 == 0) goto L_0x0013
            r3.A02 = r2
            r0 = 0
            r3.A01 = r0
        L_0x0009:
            int r1 = r3.A00
            int r0 = r2 >>> 3
            if (r2 != r1) goto L_0x0012
        L_0x000f:
            r0 = 2147483647(0x7fffffff, float:NaN)
        L_0x0012:
            return r0
        L_0x0013:
            X.7c2 r0 = r3.A03
            int r2 = r0.A09()
            r3.A02 = r2
            if (r2 == 0) goto L_0x000f
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C160837oO.A07():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0098, code lost:
        return java.lang.Long.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00b0, code lost:
        return java.lang.Integer.valueOf(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A08(X.C161277pL r3, X.C142676xa r4, java.lang.Class r5) {
        /*
            r2 = this;
            int[] r0 = X.AnonymousClass77C.A00
            int r0 = X.AnonymousClass6CA.A04(r4, r0)
            switch(r0) {
                case 1: goto L_0x00c9;
                case 2: goto L_0x00c0;
                case 3: goto L_0x00b1;
                case 4: goto L_0x00a4;
                case 5: goto L_0x0099;
                case 6: goto L_0x008a;
                case 7: goto L_0x007b;
                case 8: goto L_0x0072;
                case 9: goto L_0x0069;
                case 10: goto L_0x0054;
                case 11: goto L_0x0049;
                case 12: goto L_0x003e;
                case 13: goto L_0x0035;
                case 14: goto L_0x002c;
                case 15: goto L_0x0023;
                case 16: goto L_0x0019;
                case 17: goto L_0x0010;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.String r0 = "unsupported field type."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        L_0x0010:
            X.7c2 r0 = A03(r2)
            long r0 = r0.A0G()
            goto L_0x0094
        L_0x0019:
            X.7c2 r0 = A03(r2)
            int r0 = r0.A0A()
            goto L_0x00ac
        L_0x0023:
            X.7c2 r0 = A04(r2)
            java.lang.String r1 = r0.A0J()
            return r1
        L_0x002c:
            X.7c2 r0 = A03(r2)
            long r0 = r0.A0F()
            goto L_0x0094
        L_0x0035:
            X.7c2 r0 = A03(r2)
            int r0 = r0.A08()
            goto L_0x00ac
        L_0x003e:
            r0 = 1
            r2.A0A(r0)
            X.7c2 r0 = r2.A03
            long r0 = r0.A0E()
            goto L_0x0094
        L_0x0049:
            r0 = 5
            r2.A0A(r0)
            X.7c2 r0 = r2.A03
            int r0 = r0.A07()
            goto L_0x00ac
        L_0x0054:
            r0 = 2
            r2.A0A(r0)
            X.7iD r0 = X.C157387iD.A02
            X.8vA r0 = r0.A00(r5)
            java.lang.Object r1 = r0.BLT()
            r2.A0C(r3, r0, r1)
            r0.BKT(r1)
            return r1
        L_0x0069:
            X.7c2 r0 = A03(r2)
            long r0 = r0.A0D()
            goto L_0x0094
        L_0x0072:
            X.7c2 r0 = A03(r2)
            int r0 = r0.A06()
            goto L_0x00ac
        L_0x007b:
            r0 = 5
            r2.A0A(r0)
            X.7c2 r0 = r2.A03
            float r0 = r0.A02()
            java.lang.Float r1 = java.lang.Float.valueOf(r0)
            return r1
        L_0x008a:
            r0 = 1
            r2.A0A(r0)
            X.7c2 r0 = r2.A03
            long r0 = r0.A0C()
        L_0x0094:
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            return r1
        L_0x0099:
            r0 = 5
            r2.A0A(r0)
            X.7c2 r0 = r2.A03
            int r0 = r0.A05()
            goto L_0x00ac
        L_0x00a4:
            X.7c2 r0 = A03(r2)
            int r0 = r0.A04()
        L_0x00ac:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            return r1
        L_0x00b1:
            r0 = 1
            r2.A0A(r0)
            X.7c2 r0 = r2.A03
            double r0 = r0.A01()
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            return r1
        L_0x00c0:
            X.7c2 r0 = A04(r2)
            X.8Lq r1 = r0.A0H()
            return r1
        L_0x00c9:
            X.7c2 r0 = A03(r2)
            boolean r0 = r0.A0N()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C160837oO.A08(X.7pL, X.6xa, java.lang.Class):java.lang.Object");
    }

    public final void A09(int i) {
        if (this.A03.A03() != i) {
            throw AnonymousClass6u5.A00();
        }
    }

    public final void A0A(int i) {
        if ((this.A02 & 7) != i) {
            throw new C130796cY();
        }
    }

    public final void A0B(C161277pL r4, C186358vA r5, Object obj) {
        int i = this.A00;
        this.A00 = ((this.A02 >>> 3) << 3) | 4;
        try {
            r5.BLA(this, r4, obj);
            if (this.A02 != this.A00) {
                throw AnonymousClass6u5.A02("Failed to parse the message.");
            }
        } finally {
            this.A00 = i;
        }
    }

    public final void A0C(C161277pL r5, C186358vA r6, Object obj) {
        C153797c2 r3 = this.A03;
        int A0A = r3.A0A();
        int i = r3.A00;
        if (i < 100) {
            int A0B = r3.A0B(A0A);
            r3.A00 = i + 1;
            r6.BLA(this, r5, obj);
            r3.A0K(0);
            r3.A00--;
            r3.A0L(A0B);
            return;
        }
        throw AnonymousClass6u5.A02("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    public void A0D(List list) {
        int i;
        int A022;
        if (list instanceof C130186bY) {
            C130186bY r4 = (C130186bY) list;
            int i2 = this.A02 & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    C153797c2 r1 = this.A03;
                    A022 = A02(r1);
                    do {
                        r4.A02(r1.A0N());
                    } while (r1.A03() < A022);
                }
                throw new C130796cY();
            }
            do {
                C153797c2 r12 = this.A03;
                r4.A02(r12.A0N());
                if (!r12.A0M()) {
                    i = r12.A09();
                } else {
                    return;
                }
            } while (i == this.A02);
            this.A01 = i;
            return;
        }
        int i3 = this.A02 & 7;
        if (i3 != 0) {
            if (i3 == 2) {
                C153797c2 r13 = this.A03;
                A022 = A02(r13);
                do {
                    list.add(Boolean.valueOf(r13.A0N()));
                } while (r13.A03() < A022);
            }
            throw new C130796cY();
        }
        do {
            C153797c2 r14 = this.A03;
            list.add(Boolean.valueOf(r14.A0N()));
            if (!r14.A0M()) {
                i = r14.A09();
            } else {
                return;
            }
        } while (i == this.A02);
        this.A01 = i;
        return;
        A09(A022);
    }

    public void A0E(List list) {
        int i;
        if (list instanceof C130196bZ) {
            C130196bZ r5 = (C130196bZ) list;
            int i2 = this.A02 & 7;
            if (i2 != 1) {
                if (i2 == 2) {
                    C153797c2 r3 = this.A03;
                    int A012 = A01(r3);
                    do {
                        r5.A01(r3.A01());
                    } while (r3.A03() < A012);
                    return;
                }
                throw new C130796cY();
            }
            do {
                C153797c2 r2 = this.A03;
                r5.A01(r2.A01());
                if (!r2.A0M()) {
                    i = r2.A09();
                } else {
                    return;
                }
            } while (i == this.A02);
        } else {
            int i3 = this.A02 & 7;
            if (i3 != 1) {
                if (i3 == 2) {
                    C153797c2 r32 = this.A03;
                    int A013 = A01(r32);
                    do {
                        list.add(Double.valueOf(r32.A01()));
                    } while (r32.A03() < A013);
                    return;
                }
                throw new C130796cY();
            }
            do {
                C153797c2 r22 = this.A03;
                list.add(Double.valueOf(r22.A01()));
                if (!r22.A0M()) {
                    i = r22.A09();
                } else {
                    return;
                }
            } while (i == this.A02);
        }
        this.A01 = i;
    }

    public void A0F(List list) {
        int i;
        int A022;
        if (list instanceof C130176bX) {
            C130176bX r4 = (C130176bX) list;
            int i2 = this.A02 & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    C153797c2 r1 = this.A03;
                    A022 = A02(r1);
                    do {
                        r4.AwT(r1.A04());
                    } while (r1.A03() < A022);
                }
                throw new C130796cY();
            }
            do {
                C153797c2 r12 = this.A03;
                r4.AwT(r12.A04());
                if (!r12.A0M()) {
                    i = r12.A09();
                } else {
                    return;
                }
            } while (i == this.A02);
            this.A01 = i;
            return;
        }
        int i3 = this.A02 & 7;
        if (i3 != 0) {
            if (i3 == 2) {
                C153797c2 r13 = this.A03;
                A022 = A02(r13);
                do {
                    C86634Kw.A1V(list, r13.A04());
                } while (r13.A03() < A022);
            }
            throw new C130796cY();
        }
        do {
            C153797c2 r14 = this.A03;
            C86634Kw.A1V(list, r14.A04());
            if (!r14.A0M()) {
                i = r14.A09();
            } else {
                return;
            }
        } while (i == this.A02);
        this.A01 = i;
        return;
        A09(A022);
    }

    public void A0G(List list) {
        int A09;
        if (list instanceof C130176bX) {
            C130176bX r4 = (C130176bX) list;
            int i = this.A02 & 7;
            if (i != 2) {
                if (i == 5) {
                    do {
                        C153797c2 r1 = this.A03;
                        r4.AwT(r1.A05());
                        if (!r1.A0M()) {
                            A09 = r1.A09();
                        } else {
                            return;
                        }
                    } while (A09 == this.A02);
                }
                throw new C130796cY();
            }
            C153797c2 r2 = this.A03;
            int A002 = A00(r2);
            do {
                r4.AwT(r2.A05());
            } while (r2.A03() < A002);
            return;
        }
        int i2 = this.A02 & 7;
        if (i2 != 2) {
            if (i2 == 5) {
                do {
                    C153797c2 r12 = this.A03;
                    C86634Kw.A1V(list, r12.A05());
                    if (!r12.A0M()) {
                        A09 = r12.A09();
                    } else {
                        return;
                    }
                } while (A09 == this.A02);
            }
            throw new C130796cY();
        }
        C153797c2 r22 = this.A03;
        int A003 = A00(r22);
        do {
            C86634Kw.A1V(list, r22.A05());
        } while (r22.A03() < A003);
        return;
        this.A01 = A09;
    }

    public void A0H(List list) {
        int i;
        if (list instanceof C130216bb) {
            C130216bb r5 = (C130216bb) list;
            int i2 = this.A02 & 7;
            if (i2 != 1) {
                if (i2 == 2) {
                    C153797c2 r3 = this.A03;
                    int A012 = A01(r3);
                    do {
                        r5.A02(r3.A0C());
                    } while (r3.A03() < A012);
                    return;
                }
                throw new C130796cY();
            }
            do {
                C153797c2 r2 = this.A03;
                r5.A02(r2.A0C());
                if (!r2.A0M()) {
                    i = r2.A09();
                } else {
                    return;
                }
            } while (i == this.A02);
        } else {
            int i3 = this.A02 & 7;
            if (i3 != 1) {
                if (i3 == 2) {
                    C153797c2 r32 = this.A03;
                    int A013 = A01(r32);
                    do {
                        AnonymousClass6C8.A1G(list, r32.A0C());
                    } while (r32.A03() < A013);
                    return;
                }
                throw new C130796cY();
            }
            do {
                C153797c2 r22 = this.A03;
                AnonymousClass6C8.A1G(list, r22.A0C());
                if (!r22.A0M()) {
                    i = r22.A09();
                } else {
                    return;
                }
            } while (i == this.A02);
        }
        this.A01 = i;
    }

    public void A0I(List list) {
        int A09;
        if (list instanceof C130206ba) {
            C130206ba r4 = (C130206ba) list;
            int i = this.A02 & 7;
            if (i != 2) {
                if (i == 5) {
                    do {
                        C153797c2 r1 = this.A03;
                        r4.A01(r1.A02());
                        if (!r1.A0M()) {
                            A09 = r1.A09();
                        } else {
                            return;
                        }
                    } while (A09 == this.A02);
                }
                throw new C130796cY();
            }
            C153797c2 r2 = this.A03;
            int A002 = A00(r2);
            do {
                r4.A01(r2.A02());
            } while (r2.A03() < A002);
            return;
        }
        int i2 = this.A02 & 7;
        if (i2 != 2) {
            if (i2 == 5) {
                do {
                    C153797c2 r12 = this.A03;
                    list.add(Float.valueOf(r12.A02()));
                    if (!r12.A0M()) {
                        A09 = r12.A09();
                    } else {
                        return;
                    }
                } while (A09 == this.A02);
            }
            throw new C130796cY();
        }
        C153797c2 r22 = this.A03;
        int A003 = A00(r22);
        do {
            list.add(Float.valueOf(r22.A02()));
        } while (r22.A03() < A003);
        return;
        this.A01 = A09;
    }

    public void A0J(List list) {
        int i;
        int A022;
        if (list instanceof C130176bX) {
            C130176bX r4 = (C130176bX) list;
            int i2 = this.A02 & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    C153797c2 r1 = this.A03;
                    A022 = A02(r1);
                    do {
                        r4.AwT(r1.A06());
                    } while (r1.A03() < A022);
                }
                throw new C130796cY();
            }
            do {
                C153797c2 r12 = this.A03;
                r4.AwT(r12.A06());
                if (!r12.A0M()) {
                    i = r12.A09();
                } else {
                    return;
                }
            } while (i == this.A02);
            this.A01 = i;
            return;
        }
        int i3 = this.A02 & 7;
        if (i3 != 0) {
            if (i3 == 2) {
                C153797c2 r13 = this.A03;
                A022 = A02(r13);
                do {
                    C86634Kw.A1V(list, r13.A06());
                } while (r13.A03() < A022);
            }
            throw new C130796cY();
        }
        do {
            C153797c2 r14 = this.A03;
            C86634Kw.A1V(list, r14.A06());
            if (!r14.A0M()) {
                i = r14.A09();
            } else {
                return;
            }
        } while (i == this.A02);
        this.A01 = i;
        return;
        A09(A022);
    }

    public void A0K(List list) {
        int i;
        int A022;
        if (list instanceof C130216bb) {
            C130216bb r5 = (C130216bb) list;
            int i2 = this.A02 & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    C153797c2 r2 = this.A03;
                    A022 = A02(r2);
                    do {
                        r5.A02(r2.A0D());
                    } while (r2.A03() < A022);
                }
                throw new C130796cY();
            }
            do {
                C153797c2 r22 = this.A03;
                r5.A02(r22.A0D());
                if (!r22.A0M()) {
                    i = r22.A09();
                } else {
                    return;
                }
            } while (i == this.A02);
            this.A01 = i;
            return;
        }
        int i3 = this.A02 & 7;
        if (i3 != 0) {
            if (i3 == 2) {
                C153797c2 r23 = this.A03;
                A022 = A02(r23);
                do {
                    AnonymousClass6C8.A1G(list, r23.A0D());
                } while (r23.A03() < A022);
            }
            throw new C130796cY();
        }
        do {
            C153797c2 r24 = this.A03;
            AnonymousClass6C8.A1G(list, r24.A0D());
            if (!r24.A0M()) {
                i = r24.A09();
            } else {
                return;
            }
        } while (i == this.A02);
        this.A01 = i;
        return;
        A09(A022);
    }

    public void A0L(List list) {
        int A09;
        if (list instanceof C130176bX) {
            C130176bX r4 = (C130176bX) list;
            int i = this.A02 & 7;
            if (i != 2) {
                if (i == 5) {
                    do {
                        C153797c2 r1 = this.A03;
                        r4.AwT(r1.A07());
                        if (!r1.A0M()) {
                            A09 = r1.A09();
                        } else {
                            return;
                        }
                    } while (A09 == this.A02);
                }
                throw new C130796cY();
            }
            C153797c2 r2 = this.A03;
            int A002 = A00(r2);
            do {
                r4.AwT(r2.A07());
            } while (r2.A03() < A002);
            return;
        }
        int i2 = this.A02 & 7;
        if (i2 != 2) {
            if (i2 == 5) {
                do {
                    C153797c2 r12 = this.A03;
                    C86634Kw.A1V(list, r12.A07());
                    if (!r12.A0M()) {
                        A09 = r12.A09();
                    } else {
                        return;
                    }
                } while (A09 == this.A02);
            }
            throw new C130796cY();
        }
        C153797c2 r22 = this.A03;
        int A003 = A00(r22);
        do {
            C86634Kw.A1V(list, r22.A07());
        } while (r22.A03() < A003);
        return;
        this.A01 = A09;
    }

    public void A0M(List list) {
        int i;
        if (list instanceof C130216bb) {
            C130216bb r5 = (C130216bb) list;
            int i2 = this.A02 & 7;
            if (i2 != 1) {
                if (i2 == 2) {
                    C153797c2 r3 = this.A03;
                    int A012 = A01(r3);
                    do {
                        r5.A02(r3.A0E());
                    } while (r3.A03() < A012);
                    return;
                }
                throw new C130796cY();
            }
            do {
                C153797c2 r2 = this.A03;
                r5.A02(r2.A0E());
                if (!r2.A0M()) {
                    i = r2.A09();
                } else {
                    return;
                }
            } while (i == this.A02);
        } else {
            int i3 = this.A02 & 7;
            if (i3 != 1) {
                if (i3 == 2) {
                    C153797c2 r32 = this.A03;
                    int A013 = A01(r32);
                    do {
                        AnonymousClass6C8.A1G(list, r32.A0E());
                    } while (r32.A03() < A013);
                    return;
                }
                throw new C130796cY();
            }
            do {
                C153797c2 r22 = this.A03;
                AnonymousClass6C8.A1G(list, r22.A0E());
                if (!r22.A0M()) {
                    i = r22.A09();
                } else {
                    return;
                }
            } while (i == this.A02);
        }
        this.A01 = i;
    }

    public void A0N(List list) {
        int i;
        int A022;
        if (list instanceof C130176bX) {
            C130176bX r4 = (C130176bX) list;
            int i2 = this.A02 & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    C153797c2 r1 = this.A03;
                    A022 = A02(r1);
                    do {
                        r4.AwT(r1.A08());
                    } while (r1.A03() < A022);
                }
                throw new C130796cY();
            }
            do {
                C153797c2 r12 = this.A03;
                r4.AwT(r12.A08());
                if (!r12.A0M()) {
                    i = r12.A09();
                } else {
                    return;
                }
            } while (i == this.A02);
            this.A01 = i;
            return;
        }
        int i3 = this.A02 & 7;
        if (i3 != 0) {
            if (i3 == 2) {
                C153797c2 r13 = this.A03;
                A022 = A02(r13);
                do {
                    C86634Kw.A1V(list, r13.A08());
                } while (r13.A03() < A022);
            }
            throw new C130796cY();
        }
        do {
            C153797c2 r14 = this.A03;
            C86634Kw.A1V(list, r14.A08());
            if (!r14.A0M()) {
                i = r14.A09();
            } else {
                return;
            }
        } while (i == this.A02);
        this.A01 = i;
        return;
        A09(A022);
    }

    public void A0O(List list) {
        int i;
        int A022;
        if (list instanceof C130216bb) {
            C130216bb r5 = (C130216bb) list;
            int i2 = this.A02 & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    C153797c2 r2 = this.A03;
                    A022 = A02(r2);
                    do {
                        r5.A02(r2.A0F());
                    } while (r2.A03() < A022);
                }
                throw new C130796cY();
            }
            do {
                C153797c2 r22 = this.A03;
                r5.A02(r22.A0F());
                if (!r22.A0M()) {
                    i = r22.A09();
                } else {
                    return;
                }
            } while (i == this.A02);
            this.A01 = i;
            return;
        }
        int i3 = this.A02 & 7;
        if (i3 != 0) {
            if (i3 == 2) {
                C153797c2 r23 = this.A03;
                A022 = A02(r23);
                do {
                    AnonymousClass6C8.A1G(list, r23.A0F());
                } while (r23.A03() < A022);
            }
            throw new C130796cY();
        }
        do {
            C153797c2 r24 = this.A03;
            AnonymousClass6C8.A1G(list, r24.A0F());
            if (!r24.A0M()) {
                i = r24.A09();
            } else {
                return;
            }
        } while (i == this.A02);
        this.A01 = i;
        return;
        A09(A022);
    }

    public void A0P(List list) {
        int i;
        int A022;
        if (list instanceof C130176bX) {
            C130176bX r4 = (C130176bX) list;
            int i2 = this.A02 & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    C153797c2 r1 = this.A03;
                    A022 = A02(r1);
                    do {
                        r4.AwT(r1.A0A());
                    } while (r1.A03() < A022);
                }
                throw new C130796cY();
            }
            do {
                C153797c2 r12 = this.A03;
                r4.AwT(r12.A0A());
                if (!r12.A0M()) {
                    i = r12.A09();
                } else {
                    return;
                }
            } while (i == this.A02);
            this.A01 = i;
            return;
        }
        int i3 = this.A02 & 7;
        if (i3 != 0) {
            if (i3 == 2) {
                C153797c2 r13 = this.A03;
                A022 = A02(r13);
                do {
                    C86634Kw.A1V(list, r13.A0A());
                } while (r13.A03() < A022);
            }
            throw new C130796cY();
        }
        do {
            C153797c2 r14 = this.A03;
            C86634Kw.A1V(list, r14.A0A());
            if (!r14.A0M()) {
                i = r14.A09();
            } else {
                return;
            }
        } while (i == this.A02);
        this.A01 = i;
        return;
        A09(A022);
    }

    public void A0Q(List list) {
        int i;
        int A022;
        if (list instanceof C130216bb) {
            C130216bb r5 = (C130216bb) list;
            int i2 = this.A02 & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    C153797c2 r2 = this.A03;
                    A022 = A02(r2);
                    do {
                        r5.A02(r2.A0G());
                    } while (r2.A03() < A022);
                }
                throw new C130796cY();
            }
            do {
                C153797c2 r22 = this.A03;
                r5.A02(r22.A0G());
                if (!r22.A0M()) {
                    i = r22.A09();
                } else {
                    return;
                }
            } while (i == this.A02);
            this.A01 = i;
            return;
        }
        int i3 = this.A02 & 7;
        if (i3 != 0) {
            if (i3 == 2) {
                C153797c2 r23 = this.A03;
                A022 = A02(r23);
                do {
                    AnonymousClass6C8.A1G(list, r23.A0G());
                } while (r23.A03() < A022);
            }
            throw new C130796cY();
        }
        do {
            C153797c2 r24 = this.A03;
            AnonymousClass6C8.A1G(list, r24.A0G());
            if (!r24.A0M()) {
                i = r24.A09();
            } else {
                return;
            }
        } while (i == this.A02);
        this.A01 = i;
        return;
        A09(A022);
    }

    public C160837oO(C153797c2 r2) {
        this.A03 = r2;
        r2.A01 = this;
    }

    public static int A00(C153797c2 r2) {
        int A0A = r2.A0A();
        A05(A0A);
        return r2.A03() + A0A;
    }

    public static int A01(C153797c2 r2) {
        int A0A = r2.A0A();
        A06(A0A);
        return r2.A03() + A0A;
    }

    public static int A02(C153797c2 r2) {
        return r2.A03() + r2.A0A();
    }
}
