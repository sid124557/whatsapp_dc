package X;

/* renamed from: X.7kW  reason: invalid class name and case insensitive filesystem */
public final class C158767kW {
    public final AnonymousClass313 A00;
    public final AnonymousClass1VX A01;
    public final AnonymousClass4FV A02;
    public final AnonymousClass30N A03;

    public final void A02(C95814uZ r9, Integer num) {
        C162457s7.A0J(r9, 0);
        A01(r9, (C51982kh) null, (C51982kh) null, (AnonymousClass3Z2) null, (AnonymousClass3Z2) null, num, 2);
    }

    public final void A03(C95814uZ r11, Integer num) {
        A00(r11, (C51982kh) null, (C51982kh) null, (C51982kh) null, (AnonymousClass3Z2) null, (AnonymousClass3Z2) null, (AnonymousClass3Z2) null, num, 2);
    }

    public final void A00(C95814uZ r7, C51982kh r8, C51982kh r9, C51982kh r10, AnonymousClass3Z2 r11, AnonymousClass3Z2 r12, AnonymousClass3Z2 r13, Integer num, int i) {
        AnonymousClass1VX r3 = this.A01;
        if (r3.A0X(5580)) {
            C134186ia r2 = new C134186ia();
            r2.A08 = Integer.valueOf(i);
            r2.A0G = AnonymousClass0x9.A0n((long) this.A00.A01(r7.getRawString()), 1);
            r2.A0J = this.A03.A04(r7.getRawString());
            r2.A00 = Boolean.valueOf(C627336j.A0K(r7));
            if (i == 1) {
                if (r11 != null) {
                    r2.A0C = AnonymousClass0x9.A0m(r11.expiration);
                    int i2 = r11.disappearingMessagesInitiator;
                    int i3 = 1;
                    if (i2 != 0) {
                        if (i2 != 1) {
                            i3 = 3;
                            if (i2 != 2) {
                                i3 = 4;
                            }
                        } else {
                            i3 = 2;
                        }
                    }
                    r2.A01 = Integer.valueOf(i3);
                    r2.A0D = Long.valueOf(r11.ephemeralSettingTimestamp);
                }
                if (r12 != null) {
                    r2.A0H = AnonymousClass0x9.A0m(r12.expiration);
                    int i4 = r12.disappearingMessagesInitiator;
                    int i5 = 1;
                    if (i4 != 0) {
                        if (i4 != 1) {
                            i5 = 3;
                            if (i4 != 2) {
                                i5 = 4;
                            }
                        } else {
                            i5 = 2;
                        }
                    }
                    r2.A09 = Integer.valueOf(i5);
                    r2.A0I = Long.valueOf(r12.ephemeralSettingTimestamp);
                }
                if (r13 != null) {
                    r2.A0E = AnonymousClass0x9.A0m(r13.expiration);
                    int i6 = r13.disappearingMessagesInitiator;
                    int i7 = 1;
                    if (i6 != 0) {
                        if (i6 != 1) {
                            i7 = 3;
                            if (i6 != 2) {
                                i7 = 4;
                            }
                        } else {
                            i7 = 2;
                        }
                    }
                    r2.A04 = Integer.valueOf(i7);
                    r2.A0F = Long.valueOf(r13.ephemeralSettingTimestamp);
                }
                if (r3.A0X(5309)) {
                    if (r8 != null) {
                        r2.A03 = Integer.valueOf(AnonymousClass36M.A02(r8.A00));
                        Boolean bool = r8.A01;
                        if (bool != null) {
                            r2.A02 = Integer.valueOf(C18280x3.A01(bool.booleanValue() ? 1 : 0));
                        }
                    }
                    if (r9 != null) {
                        r2.A0B = Integer.valueOf(AnonymousClass36M.A02(r9.A00));
                        Boolean bool2 = r9.A01;
                        if (bool2 != null) {
                            r2.A0A = Integer.valueOf(C18280x3.A01(bool2.booleanValue() ? 1 : 0));
                        }
                    }
                    if (r10 != null) {
                        r2.A06 = Integer.valueOf(AnonymousClass36M.A02(r10.A00));
                        Boolean bool3 = r10.A01;
                        if (bool3 != null) {
                            r2.A05 = Integer.valueOf(C18280x3.A01(bool3.booleanValue() ? 1 : 0));
                        }
                    }
                }
            } else if (num != null) {
                r2.A07 = num;
            }
            this.A02.BhD(r2);
        }
    }

    public final void A01(C95814uZ r6, C51982kh r7, C51982kh r8, AnonymousClass3Z2 r9, AnonymousClass3Z2 r10, Integer num, int i) {
        AnonymousClass1VX r4 = this.A01;
        if (r4.A0X(5580)) {
            C134126iU r1 = new C134126iU();
            r1.A08 = Integer.valueOf(i);
            r1.A0D = this.A03.A04(r6.getRawString());
            r1.A00 = Boolean.valueOf(C627336j.A0K(r6));
            if (i == 1) {
                if (r9 != null) {
                    r1.A09 = AnonymousClass0x9.A0m(r9.expiration);
                    int i2 = r9.disappearingMessagesInitiator;
                    int i3 = 1;
                    if (i2 != 0) {
                        if (i2 != 1) {
                            i3 = 3;
                            if (i2 != 2) {
                                i3 = 4;
                            }
                        } else {
                            i3 = 2;
                        }
                    }
                    r1.A01 = Integer.valueOf(i3);
                    r1.A0A = Long.valueOf(r9.ephemeralSettingTimestamp);
                }
                if (r10 != null) {
                    r1.A0B = AnonymousClass0x9.A0m(r10.expiration);
                    int i4 = r10.disappearingMessagesInitiator;
                    int i5 = 1;
                    if (i4 != 0) {
                        if (i4 != 1) {
                            i5 = 3;
                            if (i4 != 2) {
                                i5 = 4;
                            }
                        } else {
                            i5 = 2;
                        }
                    }
                    r1.A04 = Integer.valueOf(i5);
                    r1.A0C = Long.valueOf(r10.ephemeralSettingTimestamp);
                }
                if (r4.A0X(5309)) {
                    if (r7 != null) {
                        r1.A03 = Integer.valueOf(AnonymousClass36M.A02(r7.A00));
                        Boolean bool = r7.A01;
                        if (bool != null) {
                            r1.A02 = Integer.valueOf(C18280x3.A01(bool.booleanValue() ? 1 : 0));
                        }
                    }
                    if (r8 != null) {
                        r1.A06 = Integer.valueOf(AnonymousClass36M.A02(r8.A00));
                        Boolean bool2 = r8.A01;
                        if (bool2 != null) {
                            r1.A05 = Integer.valueOf(C18280x3.A01(bool2.booleanValue() ? 1 : 0));
                        }
                    }
                }
            } else if (num != null) {
                r1.A07 = num;
            }
            this.A02.BhD(r1);
        }
    }

    public C158767kW(AnonymousClass313 r1, AnonymousClass1VX r2, AnonymousClass4FV r3, AnonymousClass30N r4) {
        C18260x0.A0c(r2, r3, r4, r1);
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
        this.A00 = r1;
    }
}
